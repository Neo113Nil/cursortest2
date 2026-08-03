package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigCacheClient {
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    private com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> cachedContainerTask = null;
    private final java.util.concurrent.Executor executor;
    private final com.google.firebase.remoteconfig.internal.ConfigStorageClient storageClient;
    private static final java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigCacheClient> clientInstances = new java.util.HashMap();
    private static final java.util.concurrent.Executor DIRECT_EXECUTOR = new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0();

    private ConfigCacheClient(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    public com.google.firebase.remoteconfig.internal.ConfigContainer getBlocking() {
        return getBlocking(5L);
    }

    com.google.firebase.remoteconfig.internal.ConfigContainer getBlocking(long j) {
        synchronized (this) {
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task = this.cachedContainerTask;
            if (task != null && task.isSuccessful()) {
                return this.cachedContainerTask.getResult();
            }
            try {
                return (com.google.firebase.remoteconfig.internal.ConfigContainer) await(get(), j, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> put(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    /* renamed from: lambda$put$0$com-google-firebase-remoteconfig-internal-ConfigCacheClient, reason: not valid java name */
    /* synthetic */ java.lang.Void m5581xddaae01c(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) throws java.lang.Exception {
        return this.storageClient.write(configContainer);
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> put(final com.google.firebase.remoteconfig.internal.ConfigContainer configContainer, final boolean z) {
        return com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.remoteconfig.internal.ConfigCacheClient.this.m5581xddaae01c(configContainer);
            }
        }).onSuccessTask(this.executor, new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.firebase.remoteconfig.internal.ConfigCacheClient.this.m5582x9820809d(z, configContainer, (java.lang.Void) obj);
            }
        });
    }

    /* renamed from: lambda$put$1$com-google-firebase-remoteconfig-internal-ConfigCacheClient, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5582x9820809d(boolean z, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer, java.lang.Void r3) throws java.lang.Exception {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return com.google.android.gms.tasks.Tasks.forResult(configContainer);
    }

    public synchronized com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> get() {
        com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task = this.cachedContainerTask;
        if (task == null || (task.isComplete() && !this.cachedContainerTask.isSuccessful())) {
            java.util.concurrent.Executor executor = this.executor;
            final com.google.firebase.remoteconfig.internal.ConfigStorageClient configStorageClient = this.storageClient;
            java.util.Objects.requireNonNull(configStorageClient);
            this.cachedContainerTask = com.google.android.gms.tasks.Tasks.call(executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.google.firebase.remoteconfig.internal.ConfigStorageClient.this.read();
                }
            });
        }
        return this.cachedContainerTask;
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = com.google.android.gms.tasks.Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    private synchronized void updateInMemoryConfigContainer(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        this.cachedContainerTask = com.google.android.gms.tasks.Tasks.forResult(configContainer);
    }

    synchronized com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public static synchronized com.google.firebase.remoteconfig.internal.ConfigCacheClient getInstance(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.ConfigStorageClient configStorageClient) {
        com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient;
        synchronized (com.google.firebase.remoteconfig.internal.ConfigCacheClient.class) {
            java.lang.String fileName = configStorageClient.getFileName();
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigCacheClient> map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new com.google.firebase.remoteconfig.internal.ConfigCacheClient(executor, configStorageClient));
            }
            configCacheClient = map.get(fileName);
        }
        return configCacheClient;
    }

    public static synchronized void clearInstancesForTest() {
        synchronized (com.google.firebase.remoteconfig.internal.ConfigCacheClient.class) {
            clientInstances.clear();
        }
    }

    private static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> task, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.firebase.remoteconfig.internal.ConfigCacheClient.AwaitListener awaitListener = new com.google.firebase.remoteconfig.internal.ConfigCacheClient.AwaitListener();
        java.util.concurrent.Executor executor = DIRECT_EXECUTOR;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new java.util.concurrent.TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new java.util.concurrent.ExecutionException(task.getException());
    }

    private static class AwaitListener<TResult> implements com.google.android.gms.tasks.OnSuccessListener<TResult>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener {
        private final java.util.concurrent.CountDownLatch latch;

        private AwaitListener() {
            this.latch = new java.util.concurrent.CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(java.lang.Exception exc) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.latch.countDown();
        }

        public void await() throws java.lang.InterruptedException {
            this.latch.await();
        }

        public boolean await(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return this.latch.await(j, timeUnit);
        }
    }
}
