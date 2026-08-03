package com.squareup.picasso;

/* loaded from: classes5.dex */
class Dispatcher {
    static final int AIRPLANE_MODE_CHANGE = 10;
    private static final int AIRPLANE_MODE_OFF = 0;
    private static final int AIRPLANE_MODE_ON = 1;
    private static final int BATCH_DELAY = 200;
    private static final java.lang.String DISPATCHER_THREAD_NAME = "Dispatcher";
    static final int HUNTER_BATCH_COMPLETE = 8;
    static final int HUNTER_COMPLETE = 4;
    static final int HUNTER_DECODE_FAILED = 6;
    static final int HUNTER_DELAY_NEXT_BATCH = 7;
    static final int HUNTER_RETRY = 5;
    static final int NETWORK_STATE_CHANGE = 9;
    static final int REQUEST_BATCH_RESUME = 13;
    static final int REQUEST_CANCEL = 2;
    static final int REQUEST_GCED = 3;
    static final int REQUEST_SUBMIT = 1;
    private static final int RETRY_DELAY = 500;
    static final int TAG_PAUSE = 11;
    static final int TAG_RESUME = 12;
    boolean airplaneMode;
    final java.util.List<com.squareup.picasso.BitmapHunter> batch;
    final com.squareup.picasso.Cache cache;
    final android.content.Context context;
    final com.squareup.picasso.Dispatcher.DispatcherThread dispatcherThread;
    final com.squareup.picasso.Downloader downloader;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> failedActions;
    final android.os.Handler handler;
    final java.util.Map<java.lang.String, com.squareup.picasso.BitmapHunter> hunterMap;
    final android.os.Handler mainThreadHandler;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> pausedActions;
    final java.util.Set<java.lang.Object> pausedTags;
    final com.squareup.picasso.Dispatcher.NetworkBroadcastReceiver receiver;
    final boolean scansNetworkChanges;
    final java.util.concurrent.ExecutorService service;
    final com.squareup.picasso.Stats stats;

    Dispatcher(android.content.Context context, java.util.concurrent.ExecutorService executorService, android.os.Handler handler, com.squareup.picasso.Downloader downloader, com.squareup.picasso.Cache cache, com.squareup.picasso.Stats stats) {
        com.squareup.picasso.Dispatcher.DispatcherThread dispatcherThread = new com.squareup.picasso.Dispatcher.DispatcherThread();
        this.dispatcherThread = dispatcherThread;
        dispatcherThread.start();
        com.squareup.picasso.Utils.flushStackLocalLeaks(dispatcherThread.getLooper());
        this.context = context;
        this.service = executorService;
        this.hunterMap = new java.util.LinkedHashMap();
        this.failedActions = new java.util.WeakHashMap();
        this.pausedActions = new java.util.WeakHashMap();
        this.pausedTags = new java.util.LinkedHashSet();
        this.handler = new com.squareup.picasso.Dispatcher.DispatcherHandler(dispatcherThread.getLooper(), this);
        this.downloader = downloader;
        this.mainThreadHandler = handler;
        this.cache = cache;
        this.stats = stats;
        this.batch = new java.util.ArrayList(4);
        this.airplaneMode = com.squareup.picasso.Utils.isAirplaneModeOn(context);
        this.scansNetworkChanges = com.squareup.picasso.Utils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE");
        com.squareup.picasso.Dispatcher.NetworkBroadcastReceiver networkBroadcastReceiver = new com.squareup.picasso.Dispatcher.NetworkBroadcastReceiver(this);
        this.receiver = networkBroadcastReceiver;
        networkBroadcastReceiver.register();
    }

    void shutdown() {
        java.util.concurrent.ExecutorService executorService = this.service;
        if (executorService instanceof com.squareup.picasso.PicassoExecutorService) {
            executorService.shutdown();
        }
        this.downloader.shutdown();
        this.dispatcherThread.quit();
        com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.Dispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                com.squareup.picasso.Dispatcher.this.receiver.unregister();
            }
        });
    }

    void dispatchSubmit(com.squareup.picasso.Action action) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    void dispatchCancel(com.squareup.picasso.Action action) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    void dispatchPauseTag(java.lang.Object obj) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    void dispatchResumeTag(java.lang.Object obj) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    void dispatchComplete(com.squareup.picasso.BitmapHunter bitmapHunter) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, bitmapHunter));
    }

    void dispatchRetry(com.squareup.picasso.BitmapHunter bitmapHunter) {
        android.os.Handler handler = this.handler;
        handler.sendMessageDelayed(handler.obtainMessage(5, bitmapHunter), 500L);
    }

    void dispatchFailed(com.squareup.picasso.BitmapHunter bitmapHunter) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(6, bitmapHunter));
    }

    void dispatchNetworkStateChange(android.net.NetworkInfo networkInfo) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void dispatchAirplaneModeChange(boolean z) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    void performSubmit(com.squareup.picasso.Action action) {
        performSubmit(action, true);
    }

    void performSubmit(com.squareup.picasso.Action action, boolean z) {
        if (this.pausedTags.contains(action.getTag())) {
            this.pausedActions.put(action.getTarget(), action);
            if (action.getPicasso().loggingEnabled) {
                com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, com.ironsource.X3.i.e0, action.request.logId(), "because tag '" + action.getTag() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.BitmapHunter bitmapHunter = this.hunterMap.get(action.getKey());
        if (bitmapHunter != null) {
            bitmapHunter.attach(action);
            return;
        }
        if (this.service.isShutdown()) {
            if (action.getPicasso().loggingEnabled) {
                com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "ignored", action.request.logId(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.BitmapHunter forRequest = com.squareup.picasso.BitmapHunter.forRequest(action.getPicasso(), this, this.cache, this.stats, action);
        forRequest.future = this.service.submit(forRequest);
        this.hunterMap.put(action.getKey(), forRequest);
        if (z) {
            this.failedActions.remove(action.getTarget());
        }
        if (action.getPicasso().loggingEnabled) {
            com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "enqueued", action.request.logId());
        }
    }

    void performCancel(com.squareup.picasso.Action action) {
        java.lang.String key = action.getKey();
        com.squareup.picasso.BitmapHunter bitmapHunter = this.hunterMap.get(key);
        if (bitmapHunter != null) {
            bitmapHunter.detach(action);
            if (bitmapHunter.cancel()) {
                this.hunterMap.remove(key);
                if (action.getPicasso().loggingEnabled) {
                    com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "canceled", action.getRequest().logId());
                }
            }
        }
        if (this.pausedTags.contains(action.getTag())) {
            this.pausedActions.remove(action.getTarget());
            if (action.getPicasso().loggingEnabled) {
                com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "canceled", action.getRequest().logId(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.Action remove = this.failedActions.remove(action.getTarget());
        if (remove == null || !remove.getPicasso().loggingEnabled) {
            return;
        }
        com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "canceled", remove.getRequest().logId(), "from replaying");
    }

    void performPauseTag(java.lang.Object obj) {
        if (this.pausedTags.add(obj)) {
            java.util.Iterator<com.squareup.picasso.BitmapHunter> it = this.hunterMap.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.BitmapHunter next = it.next();
                boolean z = next.getPicasso().loggingEnabled;
                com.squareup.picasso.Action action = next.getAction();
                java.util.List<com.squareup.picasso.Action> actions = next.getActions();
                boolean z2 = (actions == null || actions.isEmpty()) ? false : true;
                if (action != null || z2) {
                    if (action != null && action.getTag().equals(obj)) {
                        next.detach(action);
                        this.pausedActions.put(action.getTarget(), action);
                        if (z) {
                            com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, com.ironsource.X3.i.e0, action.request.logId(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = actions.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.Action action2 = actions.get(size);
                            if (action2.getTag().equals(obj)) {
                                next.detach(action2);
                                this.pausedActions.put(action2.getTarget(), action2);
                                if (z) {
                                    com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, com.ironsource.X3.i.e0, action2.request.logId(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.cancel()) {
                        it.remove();
                        if (z) {
                            com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "canceled", com.squareup.picasso.Utils.getLogIdsForHunter(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void performResumeTag(java.lang.Object obj) {
        if (this.pausedTags.remove(obj)) {
            java.util.Iterator<com.squareup.picasso.Action> it = this.pausedActions.values().iterator();
            java.util.ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.Action next = it.next();
                if (next.getTag().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                android.os.Handler handler = this.mainThreadHandler;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void performRetry(com.squareup.picasso.BitmapHunter bitmapHunter) {
        if (bitmapHunter.isCancelled()) {
            return;
        }
        boolean z = false;
        if (this.service.isShutdown()) {
            performError(bitmapHunter, false);
            return;
        }
        if (bitmapHunter.shouldRetry(this.airplaneMode, this.scansNetworkChanges ? ((android.net.ConnectivityManager) com.squareup.picasso.Utils.getService(this.context, "connectivity")).getActiveNetworkInfo() : null)) {
            if (bitmapHunter.getPicasso().loggingEnabled) {
                com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "retrying", com.squareup.picasso.Utils.getLogIdsForHunter(bitmapHunter));
            }
            if (bitmapHunter.getException() instanceof com.squareup.picasso.NetworkRequestHandler.ContentLengthException) {
                bitmapHunter.networkPolicy |= com.squareup.picasso.NetworkPolicy.NO_CACHE.index;
            }
            bitmapHunter.future = this.service.submit(bitmapHunter);
            return;
        }
        if (this.scansNetworkChanges && bitmapHunter.supportsReplay()) {
            z = true;
        }
        performError(bitmapHunter, z);
        if (z) {
            markForReplay(bitmapHunter);
        }
    }

    void performComplete(com.squareup.picasso.BitmapHunter bitmapHunter) {
        if (com.squareup.picasso.MemoryPolicy.shouldWriteToMemoryCache(bitmapHunter.getMemoryPolicy())) {
            this.cache.set(bitmapHunter.getKey(), bitmapHunter.getResult());
        }
        this.hunterMap.remove(bitmapHunter.getKey());
        batch(bitmapHunter);
        if (bitmapHunter.getPicasso().loggingEnabled) {
            com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "batched", com.squareup.picasso.Utils.getLogIdsForHunter(bitmapHunter), "for completion");
        }
    }

    void performBatchComplete() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.batch);
        this.batch.clear();
        android.os.Handler handler = this.mainThreadHandler;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        logBatch(arrayList);
    }

    void performError(com.squareup.picasso.BitmapHunter bitmapHunter, boolean z) {
        if (bitmapHunter.getPicasso().loggingEnabled) {
            com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "batched", com.squareup.picasso.Utils.getLogIdsForHunter(bitmapHunter), "for error".concat(z ? " (will replay)" : ""));
        }
        this.hunterMap.remove(bitmapHunter.getKey());
        batch(bitmapHunter);
    }

    void performAirplaneModeChange(boolean z) {
        this.airplaneMode = z;
    }

    void performNetworkStateChange(android.net.NetworkInfo networkInfo) {
        java.util.concurrent.ExecutorService executorService = this.service;
        if (executorService instanceof com.squareup.picasso.PicassoExecutorService) {
            ((com.squareup.picasso.PicassoExecutorService) executorService).adjustThreadCount(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        flushFailedActions();
    }

    private void flushFailedActions() {
        if (this.failedActions.isEmpty()) {
            return;
        }
        java.util.Iterator<com.squareup.picasso.Action> it = this.failedActions.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.Action next = it.next();
            it.remove();
            if (next.getPicasso().loggingEnabled) {
                com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "replaying", next.getRequest().logId());
            }
            performSubmit(next, false);
        }
    }

    private void markForReplay(com.squareup.picasso.BitmapHunter bitmapHunter) {
        com.squareup.picasso.Action action = bitmapHunter.getAction();
        if (action != null) {
            markForReplay(action);
        }
        java.util.List<com.squareup.picasso.Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                markForReplay(actions.get(i));
            }
        }
    }

    private void markForReplay(com.squareup.picasso.Action action) {
        java.lang.Object target = action.getTarget();
        if (target != null) {
            action.willReplay = true;
            this.failedActions.put(target, action);
        }
    }

    private void batch(com.squareup.picasso.BitmapHunter bitmapHunter) {
        if (bitmapHunter.isCancelled()) {
            return;
        }
        if (bitmapHunter.result != null) {
            bitmapHunter.result.prepareToDraw();
        }
        this.batch.add(bitmapHunter);
        if (this.handler.hasMessages(7)) {
            return;
        }
        this.handler.sendEmptyMessageDelayed(7, 200L);
    }

    private void logBatch(java.util.List<com.squareup.picasso.BitmapHunter> list) {
        if (list == null || list.isEmpty() || !list.get(0).getPicasso().loggingEnabled) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.squareup.picasso.BitmapHunter bitmapHunter : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(com.squareup.picasso.Utils.getLogIdsForHunter(bitmapHunter));
        }
        com.squareup.picasso.Utils.log(DISPATCHER_THREAD_NAME, "delivered", sb.toString());
    }

    private static class DispatcherHandler extends android.os.Handler {
        private final com.squareup.picasso.Dispatcher dispatcher;

        DispatcherHandler(android.os.Looper looper, com.squareup.picasso.Dispatcher dispatcher) {
            super(looper);
            this.dispatcher = dispatcher;
        }

        @Override // android.os.Handler
        public void handleMessage(final android.os.Message message) {
            switch (message.what) {
                case 1:
                    this.dispatcher.performSubmit((com.squareup.picasso.Action) message.obj);
                    break;
                case 2:
                    this.dispatcher.performCancel((com.squareup.picasso.Action) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.Dispatcher.DispatcherHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new java.lang.AssertionError("Unknown handler message received: " + message.what);
                        }
                    });
                    break;
                case 4:
                    this.dispatcher.performComplete((com.squareup.picasso.BitmapHunter) message.obj);
                    break;
                case 5:
                    this.dispatcher.performRetry((com.squareup.picasso.BitmapHunter) message.obj);
                    break;
                case 6:
                    this.dispatcher.performError((com.squareup.picasso.BitmapHunter) message.obj, false);
                    break;
                case 7:
                    this.dispatcher.performBatchComplete();
                    break;
                case 9:
                    this.dispatcher.performNetworkStateChange((android.net.NetworkInfo) message.obj);
                    break;
                case 10:
                    this.dispatcher.performAirplaneModeChange(message.arg1 == 1);
                    break;
                case 11:
                    this.dispatcher.performPauseTag(message.obj);
                    break;
                case 12:
                    this.dispatcher.performResumeTag(message.obj);
                    break;
            }
        }
    }

    static class DispatcherThread extends android.os.HandlerThread {
        DispatcherThread() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class NetworkBroadcastReceiver extends android.content.BroadcastReceiver {
        static final java.lang.String EXTRA_AIRPLANE_STATE = "state";
        private final com.squareup.picasso.Dispatcher dispatcher;

        NetworkBroadcastReceiver(com.squareup.picasso.Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
        }

        void register() {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.dispatcher.scansNetworkChanges) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.dispatcher.context.registerReceiver(this, intentFilter);
        }

        void unregister() {
            this.dispatcher.context.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null) {
                return;
            }
            java.lang.String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.dispatcher.dispatchAirplaneModeChange(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.dispatcher.dispatchNetworkStateChange(((android.net.ConnectivityManager) com.squareup.picasso.Utils.getService(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }
}
