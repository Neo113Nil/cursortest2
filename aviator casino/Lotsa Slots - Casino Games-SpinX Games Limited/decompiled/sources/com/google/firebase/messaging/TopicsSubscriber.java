package com.google.firebase.messaging;

/* loaded from: classes3.dex */
class TopicsSubscriber {
    static final java.lang.String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final java.lang.String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final long RPC_TIMEOUT_SEC = 30;
    private final android.content.Context context;
    private final com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
    private final com.google.firebase.messaging.Metadata metadata;
    private final com.google.firebase.messaging.GmsRpc rpc;
    private final com.google.firebase.messaging.TopicsStore store;
    private final java.util.concurrent.ScheduledExecutorService syncExecutor;
    private final java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> pendingOperations = new androidx.collection.ArrayMap();
    private boolean syncScheduledOrRunning = false;

    static com.google.android.gms.tasks.Task<com.google.firebase.messaging.TopicsSubscriber> createInstance(final com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, final com.google.firebase.messaging.Metadata metadata, final com.google.firebase.messaging.GmsRpc gmsRpc, final android.content.Context context, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return com.google.android.gms.tasks.Tasks.call(scheduledExecutorService, new java.util.concurrent.Callable() { // from class: com.google.firebase.messaging.TopicsSubscriber$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.messaging.TopicsSubscriber.lambda$createInstance$0(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
            }
        });
    }

    static /* synthetic */ com.google.firebase.messaging.TopicsSubscriber lambda$createInstance$0(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, com.google.firebase.messaging.Metadata metadata, com.google.firebase.messaging.GmsRpc gmsRpc) throws java.lang.Exception {
        return new com.google.firebase.messaging.TopicsSubscriber(firebaseMessaging, metadata, com.google.firebase.messaging.TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private TopicsSubscriber(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, com.google.firebase.messaging.Metadata metadata, com.google.firebase.messaging.TopicsStore topicsStore, com.google.firebase.messaging.GmsRpc gmsRpc, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.gms.tasks.Task<java.lang.Void> subscribeToTopic(java.lang.String str) {
        com.google.android.gms.tasks.Task<java.lang.Void> scheduleTopicOperation = scheduleTopicOperation(com.google.firebase.messaging.TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribeFromTopic(java.lang.String str) {
        com.google.android.gms.tasks.Task<java.lang.Void> scheduleTopicOperation = scheduleTopicOperation(com.google.firebase.messaging.TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return scheduleTopicOperation;
    }

    com.google.android.gms.tasks.Task<java.lang.Void> scheduleTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource<>();
        addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    private void addToPendingOperations(com.google.firebase.messaging.TopicOperation topicOperation, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque;
        synchronized (this.pendingOperations) {
            java.lang.String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                arrayDeque = this.pendingOperations.get(serialize);
            } else {
                java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque2 = new java.util.ArrayDeque<>();
                this.pendingOperations.put(serialize, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new com.google.firebase.messaging.TopicsSyncTask(this, this.context, this.metadata, java.lang.Math.min(java.lang.Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }

    void scheduleSyncTaskWithDelaySeconds(java.lang.Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (isDebugLogEnabled() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean syncTopics() throws java.io.IOException {
        while (true) {
            synchronized (this) {
                com.google.firebase.messaging.TopicOperation nextTopicOperation = this.store.getNextTopicOperation();
                if (nextTopicOperation == null) {
                    break;
                }
                if (!performTopicOperation(nextTopicOperation)) {
                    return false;
                }
                this.store.removeTopicOperation(nextTopicOperation);
                markCompletePendingOperation(nextTopicOperation);
            }
        }
    }

    private void markCompletePendingOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            java.lang.String serialize = topicOperation.serialize();
            if (this.pendingOperations.containsKey(serialize)) {
                java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque = this.pendingOperations.get(serialize);
                com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.pendingOperations.remove(serialize);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: IOException -> 0x0099, TryCatch #0 {IOException -> 0x0099, blocks: (B:3:0x0009, B:12:0x0036, B:14:0x003c, B:17:0x0051, B:19:0x005e, B:20:0x0075, B:22:0x0082, B:23:0x001b, B:26:0x0025), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean performTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) throws java.io.IOException {
        char c;
        try {
            java.lang.String operation = topicOperation.getOperation();
            int hashCode = operation.hashCode();
            if (hashCode == 83) {
                if (operation.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH)) {
                    c = 0;
                    if (c != 0) {
                    }
                    return true;
                }
                c = 65535;
                if (c != 0) {
                }
                return true;
            }
            if (hashCode == 85 && operation.equals("U")) {
                c = 1;
                if (c != 0) {
                    blockingSubscribeToTopic(topicOperation.getTopic());
                    if (isDebugLogEnabled()) {
                        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.");
                    }
                } else if (c == 1) {
                    blockingUnsubscribeFromTopic(topicOperation.getTopic());
                    if (isDebugLogEnabled()) {
                        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.");
                    }
                } else if (isDebugLogEnabled()) {
                    android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Unknown topic operation" + topicOperation + ".");
                }
                return true;
            }
            c = 65535;
            if (c != 0) {
            }
            return true;
        } catch (java.io.IOException e) {
            if (!ERROR_SERVICE_NOT_AVAILABLE.equals(e.getMessage()) && !ERROR_INTERNAL_SERVER_ERROR.equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    private void blockingSubscribeToTopic(java.lang.String str) throws java.io.IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    private void blockingUnsubscribeFromTopic(java.lang.String str) throws java.io.IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    private static <T> void awaitTask(com.google.android.gms.tasks.Task<T> task) throws java.io.IOException {
        try {
            com.google.android.gms.tasks.Tasks.await(task, 30L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            e = e;
            throw new java.io.IOException(ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.io.IOException) {
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e2);
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            throw new java.io.IOException(ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    synchronized boolean isSyncScheduledOrRunning() {
        return this.syncScheduledOrRunning;
    }

    synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    static boolean isDebugLogEnabled() {
        return android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3) || (android.os.Build.VERSION.SDK_INT == 23 && android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3));
    }

    com.google.firebase.messaging.TopicsStore getStore() {
        return this.store;
    }
}
