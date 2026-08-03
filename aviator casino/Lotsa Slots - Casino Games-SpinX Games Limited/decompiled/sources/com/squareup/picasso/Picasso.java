package com.squareup.picasso;

/* loaded from: classes5.dex */
public class Picasso {
    static final java.lang.String TAG = "Picasso";
    final com.squareup.picasso.Cache cache;
    private final com.squareup.picasso.Picasso.CleanupThread cleanupThread;
    final android.content.Context context;
    final android.graphics.Bitmap.Config defaultBitmapConfig;
    final com.squareup.picasso.Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final com.squareup.picasso.Picasso.Listener listener;
    volatile boolean loggingEnabled;
    final java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue;
    private final java.util.List<com.squareup.picasso.RequestHandler> requestHandlers;
    private final com.squareup.picasso.Picasso.RequestTransformer requestTransformer;
    boolean shutdown;
    final com.squareup.picasso.Stats stats;
    final java.util.Map<java.lang.Object, com.squareup.picasso.Action> targetToAction;
    final java.util.Map<android.widget.ImageView, com.squareup.picasso.DeferredRequestCreator> targetToDeferredRequestCreator;
    static final android.os.Handler HANDLER = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.squareup.picasso.Picasso.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.Action action = (com.squareup.picasso.Action) message.obj;
                if (action.getPicasso().loggingEnabled) {
                    com.squareup.picasso.Utils.log("Main", "canceled", action.request.logId(), "target got garbage collected");
                }
                action.picasso.cancelExistingRequest(action.getTarget());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                java.util.List list = (java.util.List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    com.squareup.picasso.BitmapHunter bitmapHunter = (com.squareup.picasso.BitmapHunter) list.get(i2);
                    bitmapHunter.picasso.complete(bitmapHunter);
                    i2++;
                }
                return;
            }
            if (i == 13) {
                java.util.List list2 = (java.util.List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    com.squareup.picasso.Action action2 = (com.squareup.picasso.Action) list2.get(i2);
                    action2.picasso.resumeAction(action2);
                    i2++;
                }
                return;
            }
            throw new java.lang.AssertionError("Unknown handler message received: " + message.what);
        }
    };
    static volatile com.squareup.picasso.Picasso singleton = null;

    public interface Listener {
        void onImageLoadFailed(com.squareup.picasso.Picasso picasso, android.net.Uri uri, java.lang.Exception exc);
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public interface RequestTransformer {
        public static final com.squareup.picasso.Picasso.RequestTransformer IDENTITY = new com.squareup.picasso.Picasso.RequestTransformer() { // from class: com.squareup.picasso.Picasso.RequestTransformer.1
            @Override // com.squareup.picasso.Picasso.RequestTransformer
            public com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request request) {
                return request;
            }
        };

        com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request request);
    }

    Picasso(android.content.Context context, com.squareup.picasso.Dispatcher dispatcher, com.squareup.picasso.Cache cache, com.squareup.picasso.Picasso.Listener listener, com.squareup.picasso.Picasso.RequestTransformer requestTransformer, java.util.List<com.squareup.picasso.RequestHandler> list, com.squareup.picasso.Stats stats, android.graphics.Bitmap.Config config, boolean z, boolean z2) {
        this.context = context;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.listener = listener;
        this.requestTransformer = requestTransformer;
        this.defaultBitmapConfig = config;
        java.util.ArrayList arrayList = new java.util.ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new com.squareup.picasso.ResourceRequestHandler(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.ContactsPhotoRequestHandler(context));
        arrayList.add(new com.squareup.picasso.MediaStoreRequestHandler(context));
        arrayList.add(new com.squareup.picasso.ContentStreamRequestHandler(context));
        arrayList.add(new com.squareup.picasso.AssetRequestHandler(context));
        arrayList.add(new com.squareup.picasso.FileRequestHandler(context));
        arrayList.add(new com.squareup.picasso.NetworkRequestHandler(dispatcher.downloader, stats));
        this.requestHandlers = java.util.Collections.unmodifiableList(arrayList);
        this.stats = stats;
        this.targetToAction = new java.util.WeakHashMap();
        this.targetToDeferredRequestCreator = new java.util.WeakHashMap();
        this.indicatorsEnabled = z;
        this.loggingEnabled = z2;
        java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue = new java.lang.ref.ReferenceQueue<>();
        this.referenceQueue = referenceQueue;
        com.squareup.picasso.Picasso.CleanupThread cleanupThread = new com.squareup.picasso.Picasso.CleanupThread(referenceQueue, HANDLER);
        this.cleanupThread = cleanupThread;
        cleanupThread.start();
    }

    public void cancelRequest(android.widget.ImageView imageView) {
        if (imageView == null) {
            throw new java.lang.IllegalArgumentException("view cannot be null.");
        }
        cancelExistingRequest(imageView);
    }

    public void cancelRequest(com.squareup.picasso.Target target) {
        if (target == null) {
            throw new java.lang.IllegalArgumentException("target cannot be null.");
        }
        cancelExistingRequest(target);
    }

    public void cancelRequest(android.widget.RemoteViews remoteViews, int i) {
        if (remoteViews == null) {
            throw new java.lang.IllegalArgumentException("remoteViews cannot be null.");
        }
        cancelExistingRequest(new com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget(remoteViews, i));
    }

    public void cancelTag(java.lang.Object obj) {
        com.squareup.picasso.Utils.checkMain();
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Cannot cancel requests with null tag.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.targetToAction.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.squareup.picasso.Action action = (com.squareup.picasso.Action) arrayList.get(i);
            if (obj.equals(action.getTag())) {
                cancelExistingRequest(action.getTarget());
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.targetToDeferredRequestCreator.values());
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.squareup.picasso.DeferredRequestCreator deferredRequestCreator = (com.squareup.picasso.DeferredRequestCreator) arrayList2.get(i2);
            if (obj.equals(deferredRequestCreator.getTag())) {
                deferredRequestCreator.cancel();
            }
        }
    }

    public void pauseTag(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("tag == null");
        }
        this.dispatcher.dispatchPauseTag(obj);
    }

    public void resumeTag(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("tag == null");
        }
        this.dispatcher.dispatchResumeTag(obj);
    }

    public com.squareup.picasso.RequestCreator load(android.net.Uri uri) {
        return new com.squareup.picasso.RequestCreator(this, uri, 0);
    }

    public com.squareup.picasso.RequestCreator load(java.lang.String str) {
        if (str == null) {
            return new com.squareup.picasso.RequestCreator(this, null, 0);
        }
        if (str.trim().length() == 0) {
            throw new java.lang.IllegalArgumentException("Path must not be empty.");
        }
        return load(android.net.Uri.parse(str));
    }

    public com.squareup.picasso.RequestCreator load(java.io.File file) {
        if (file == null) {
            return new com.squareup.picasso.RequestCreator(this, null, 0);
        }
        return load(android.net.Uri.fromFile(file));
    }

    public com.squareup.picasso.RequestCreator load(int i) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Resource ID must not be zero.");
        }
        return new com.squareup.picasso.RequestCreator(this, null, i);
    }

    public void invalidate(android.net.Uri uri) {
        if (uri != null) {
            this.cache.clearKeyUri(uri.toString());
        }
    }

    public void invalidate(java.lang.String str) {
        if (str != null) {
            invalidate(android.net.Uri.parse(str));
        }
    }

    public void invalidate(java.io.File file) {
        if (file == null) {
            throw new java.lang.IllegalArgumentException("file == null");
        }
        invalidate(android.net.Uri.fromFile(file));
    }

    public void setIndicatorsEnabled(boolean z) {
        this.indicatorsEnabled = z;
    }

    public boolean areIndicatorsEnabled() {
        return this.indicatorsEnabled;
    }

    public void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public com.squareup.picasso.StatsSnapshot getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void shutdown() {
        if (this == singleton) {
            throw new java.lang.UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.shutdown) {
            return;
        }
        this.cache.clear();
        this.cleanupThread.shutdown();
        this.stats.shutdown();
        this.dispatcher.shutdown();
        java.util.Iterator<com.squareup.picasso.DeferredRequestCreator> it = this.targetToDeferredRequestCreator.values().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.targetToDeferredRequestCreator.clear();
        this.shutdown = true;
    }

    java.util.List<com.squareup.picasso.RequestHandler> getRequestHandlers() {
        return this.requestHandlers;
    }

    com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request request) {
        com.squareup.picasso.Request transformRequest = this.requestTransformer.transformRequest(request);
        if (transformRequest != null) {
            return transformRequest;
        }
        throw new java.lang.IllegalStateException("Request transformer " + this.requestTransformer.getClass().getCanonicalName() + " returned null for " + request);
    }

    void defer(android.widget.ImageView imageView, com.squareup.picasso.DeferredRequestCreator deferredRequestCreator) {
        if (this.targetToDeferredRequestCreator.containsKey(imageView)) {
            cancelExistingRequest(imageView);
        }
        this.targetToDeferredRequestCreator.put(imageView, deferredRequestCreator);
    }

    void enqueueAndSubmit(com.squareup.picasso.Action action) {
        java.lang.Object target = action.getTarget();
        if (target != null && this.targetToAction.get(target) != action) {
            cancelExistingRequest(target);
            this.targetToAction.put(target, action);
        }
        submit(action);
    }

    void submit(com.squareup.picasso.Action action) {
        this.dispatcher.dispatchSubmit(action);
    }

    android.graphics.Bitmap quickMemoryCacheCheck(java.lang.String str) {
        android.graphics.Bitmap bitmap = this.cache.get(str);
        if (bitmap != null) {
            this.stats.dispatchCacheHit();
        } else {
            this.stats.dispatchCacheMiss();
        }
        return bitmap;
    }

    void complete(com.squareup.picasso.BitmapHunter bitmapHunter) {
        com.squareup.picasso.Action action = bitmapHunter.getAction();
        java.util.List<com.squareup.picasso.Action> actions = bitmapHunter.getActions();
        boolean z = (actions == null || actions.isEmpty()) ? false : true;
        if (action != null || z) {
            android.net.Uri uri = bitmapHunter.getData().uri;
            java.lang.Exception exception = bitmapHunter.getException();
            android.graphics.Bitmap result = bitmapHunter.getResult();
            com.squareup.picasso.Picasso.LoadedFrom loadedFrom = bitmapHunter.getLoadedFrom();
            if (action != null) {
                deliverAction(result, loadedFrom, action, exception);
            }
            if (z) {
                int size = actions.size();
                for (int i = 0; i < size; i++) {
                    deliverAction(result, loadedFrom, actions.get(i), exception);
                }
            }
            com.squareup.picasso.Picasso.Listener listener = this.listener;
            if (listener == null || exception == null) {
                return;
            }
            listener.onImageLoadFailed(this, uri, exception);
        }
    }

    void resumeAction(com.squareup.picasso.Action action) {
        android.graphics.Bitmap quickMemoryCacheCheck = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(action.memoryPolicy) ? quickMemoryCacheCheck(action.getKey()) : null;
        if (quickMemoryCacheCheck != null) {
            deliverAction(quickMemoryCacheCheck, com.squareup.picasso.Picasso.LoadedFrom.MEMORY, action, null);
            if (this.loggingEnabled) {
                com.squareup.picasso.Utils.log("Main", "completed", action.request.logId(), "from " + com.squareup.picasso.Picasso.LoadedFrom.MEMORY);
                return;
            }
            return;
        }
        enqueueAndSubmit(action);
        if (this.loggingEnabled) {
            com.squareup.picasso.Utils.log("Main", "resumed", action.request.logId());
        }
    }

    private void deliverAction(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom, com.squareup.picasso.Action action, java.lang.Exception exc) {
        if (action.isCancelled()) {
            return;
        }
        if (!action.willReplay()) {
            this.targetToAction.remove(action.getTarget());
        }
        if (bitmap == null) {
            action.error(exc);
            if (this.loggingEnabled) {
                com.squareup.picasso.Utils.log("Main", "errored", action.request.logId(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new java.lang.AssertionError("LoadedFrom cannot be null.");
        }
        action.complete(bitmap, loadedFrom);
        if (this.loggingEnabled) {
            com.squareup.picasso.Utils.log("Main", "completed", action.request.logId(), "from " + loadedFrom);
        }
    }

    void cancelExistingRequest(java.lang.Object obj) {
        com.squareup.picasso.Utils.checkMain();
        com.squareup.picasso.Action remove = this.targetToAction.remove(obj);
        if (remove != null) {
            remove.cancel();
            this.dispatcher.dispatchCancel(remove);
        }
        if (obj instanceof android.widget.ImageView) {
            com.squareup.picasso.DeferredRequestCreator remove2 = this.targetToDeferredRequestCreator.remove((android.widget.ImageView) obj);
            if (remove2 != null) {
                remove2.cancel();
            }
        }
    }

    private static class CleanupThread extends java.lang.Thread {
        private final android.os.Handler handler;
        private final java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue;

        CleanupThread(java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue, android.os.Handler handler) {
            this.referenceQueue = referenceQueue;
            this.handler = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(10);
            while (true) {
                try {
                    com.squareup.picasso.Action.RequestWeakReference requestWeakReference = (com.squareup.picasso.Action.RequestWeakReference) this.referenceQueue.remove(1000L);
                    android.os.Message obtainMessage = this.handler.obtainMessage();
                    if (requestWeakReference != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = requestWeakReference.action;
                        this.handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (java.lang.InterruptedException unused) {
                    return;
                } catch (java.lang.Exception e) {
                    this.handler.post(new java.lang.Runnable() { // from class: com.squareup.picasso.Picasso.CleanupThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new java.lang.RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }

        void shutdown() {
            interrupt();
        }
    }

    public static com.squareup.picasso.Picasso get() {
        if (singleton == null) {
            synchronized (com.squareup.picasso.Picasso.class) {
                if (singleton == null) {
                    if (com.squareup.picasso.PicassoProvider.context == null) {
                        throw new java.lang.IllegalStateException("context == null");
                    }
                    singleton = new com.squareup.picasso.Picasso.Builder(com.squareup.picasso.PicassoProvider.context).build();
                }
            }
        }
        return singleton;
    }

    public static void setSingletonInstance(com.squareup.picasso.Picasso picasso) {
        if (picasso == null) {
            throw new java.lang.IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (com.squareup.picasso.Picasso.class) {
            if (singleton != null) {
                throw new java.lang.IllegalStateException("Singleton instance already exists.");
            }
            singleton = picasso;
        }
    }

    public static class Builder {
        private com.squareup.picasso.Cache cache;
        private final android.content.Context context;
        private android.graphics.Bitmap.Config defaultBitmapConfig;
        private com.squareup.picasso.Downloader downloader;
        private boolean indicatorsEnabled;
        private com.squareup.picasso.Picasso.Listener listener;
        private boolean loggingEnabled;
        private java.util.List<com.squareup.picasso.RequestHandler> requestHandlers;
        private java.util.concurrent.ExecutorService service;
        private com.squareup.picasso.Picasso.RequestTransformer transformer;

        public Builder(android.content.Context context) {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context must not be null.");
            }
            this.context = context.getApplicationContext();
        }

        public com.squareup.picasso.Picasso.Builder defaultBitmapConfig(android.graphics.Bitmap.Config config) {
            if (config == null) {
                throw new java.lang.IllegalArgumentException("Bitmap config must not be null.");
            }
            this.defaultBitmapConfig = config;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder downloader(com.squareup.picasso.Downloader downloader) {
            if (downloader == null) {
                throw new java.lang.IllegalArgumentException("Downloader must not be null.");
            }
            if (this.downloader != null) {
                throw new java.lang.IllegalStateException("Downloader already set.");
            }
            this.downloader = downloader;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder executor(java.util.concurrent.ExecutorService executorService) {
            if (executorService == null) {
                throw new java.lang.IllegalArgumentException("Executor service must not be null.");
            }
            if (this.service != null) {
                throw new java.lang.IllegalStateException("Executor service already set.");
            }
            this.service = executorService;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder memoryCache(com.squareup.picasso.Cache cache) {
            if (cache == null) {
                throw new java.lang.IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.cache != null) {
                throw new java.lang.IllegalStateException("Memory cache already set.");
            }
            this.cache = cache;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder listener(com.squareup.picasso.Picasso.Listener listener) {
            if (listener == null) {
                throw new java.lang.IllegalArgumentException("Listener must not be null.");
            }
            if (this.listener != null) {
                throw new java.lang.IllegalStateException("Listener already set.");
            }
            this.listener = listener;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder requestTransformer(com.squareup.picasso.Picasso.RequestTransformer requestTransformer) {
            if (requestTransformer == null) {
                throw new java.lang.IllegalArgumentException("Transformer must not be null.");
            }
            if (this.transformer != null) {
                throw new java.lang.IllegalStateException("Transformer already set.");
            }
            this.transformer = requestTransformer;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder addRequestHandler(com.squareup.picasso.RequestHandler requestHandler) {
            if (requestHandler == null) {
                throw new java.lang.IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.requestHandlers == null) {
                this.requestHandlers = new java.util.ArrayList();
            }
            if (this.requestHandlers.contains(requestHandler)) {
                throw new java.lang.IllegalStateException("RequestHandler already registered.");
            }
            this.requestHandlers.add(requestHandler);
            return this;
        }

        public com.squareup.picasso.Picasso.Builder indicatorsEnabled(boolean z) {
            this.indicatorsEnabled = z;
            return this;
        }

        public com.squareup.picasso.Picasso.Builder loggingEnabled(boolean z) {
            this.loggingEnabled = z;
            return this;
        }

        public com.squareup.picasso.Picasso build() {
            android.content.Context context = this.context;
            if (this.downloader == null) {
                this.downloader = new com.squareup.picasso.OkHttp3Downloader(context);
            }
            if (this.cache == null) {
                this.cache = new com.squareup.picasso.LruCache(context);
            }
            if (this.service == null) {
                this.service = new com.squareup.picasso.PicassoExecutorService();
            }
            if (this.transformer == null) {
                this.transformer = com.squareup.picasso.Picasso.RequestTransformer.IDENTITY;
            }
            com.squareup.picasso.Stats stats = new com.squareup.picasso.Stats(this.cache);
            return new com.squareup.picasso.Picasso(context, new com.squareup.picasso.Dispatcher(context, this.service, com.squareup.picasso.Picasso.HANDLER, this.downloader, this.cache, stats), this.cache, this.listener, this.transformer, this.requestHandlers, stats, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
        }
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);

        final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }
}
