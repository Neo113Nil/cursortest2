package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class Loader implements com.google.android.exoplayer2.upstream.LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction DONT_RETRY;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction DONT_RETRY_FATAL;
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction RETRY = createRetryAction(false, -9223372036854775807L);
    public static final com.google.android.exoplayer2.upstream.Loader.LoadErrorAction RETRY_RESET_ERROR_COUNT = createRetryAction(true, -9223372036854775807L);
    private static final java.lang.String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private com.google.android.exoplayer2.upstream.Loader.LoadTask<? extends com.google.android.exoplayer2.upstream.Loader.Loadable> currentTask;
    private final java.util.concurrent.ExecutorService downloadExecutorService;
    private java.io.IOException fatalError;

    public interface Callback<T extends com.google.android.exoplayer2.upstream.Loader.Loadable> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(T t, long j, long j2, java.io.IOException iOException, int i);
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws java.io.IOException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class UnexpectedLoaderException extends java.io.IOException {
        public UnexpectedLoaderException(java.lang.Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        DONT_RETRY = new com.google.android.exoplayer2.upstream.Loader.LoadErrorAction(2, j);
        DONT_RETRY_FATAL = new com.google.android.exoplayer2.upstream.Loader.LoadErrorAction(3, j);
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int i, long j) {
            this.type = i;
            this.retryDelayMillis = j;
        }

        public boolean isRetry() {
            int i = this.type;
            return i == 0 || i == 1;
        }
    }

    public Loader(java.lang.String str) {
        this.downloadExecutorService = com.google.android.exoplayer2.util.Util.newSingleThreadExecutor(THREAD_NAME_PREFIX + str);
    }

    public static com.google.android.exoplayer2.upstream.Loader.LoadErrorAction createRetryAction(boolean z, long j) {
        return new com.google.android.exoplayer2.upstream.Loader.LoadErrorAction(z ? 1 : 0, j);
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public <T extends com.google.android.exoplayer2.upstream.Loader.Loadable> long startLoading(T t, com.google.android.exoplayer2.upstream.Loader.Callback<T> callback, int i) {
        android.os.Looper looper = (android.os.Looper) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(android.os.Looper.myLooper());
        this.fatalError = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.google.android.exoplayer2.upstream.Loader.LoadTask(looper, t, callback, i, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    public void cancelLoading() {
        ((com.google.android.exoplayer2.upstream.Loader.LoadTask) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.currentTask)).cancel(false);
    }

    public void release() {
        release(null);
    }

    public void release(com.google.android.exoplayer2.upstream.Loader.ReleaseCallback releaseCallback) {
        com.google.android.exoplayer2.upstream.Loader.LoadTask<? extends com.google.android.exoplayer2.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new com.google.android.exoplayer2.upstream.Loader.ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws java.io.IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i) throws java.io.IOException {
        java.io.IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.Loader.LoadTask<? extends com.google.android.exoplayer2.upstream.Loader.Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i == Integer.MIN_VALUE) {
                i = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i);
        }
    }

    private final class LoadTask<T extends com.google.android.exoplayer2.upstream.Loader.Loadable> extends android.os.Handler implements java.lang.Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final java.lang.String TAG = "LoadTask";
        private com.google.android.exoplayer2.upstream.Loader.Callback<T> callback;
        private boolean canceled;
        private java.io.IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private java.lang.Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(android.os.Looper looper, T t, com.google.android.exoplayer2.upstream.Loader.Callback<T> callback, int i, long j) {
            super(looper);
            this.loadable = t;
            this.callback = callback;
            this.defaultMinRetryCount = i;
            this.startTimeMs = j;
        }

        public void maybeThrowError(int i) throws java.io.IOException {
            java.io.IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i) {
                throw iOException;
            }
        }

        public void start(long j) {
            com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.upstream.Loader.this.currentTask == null);
            com.google.android.exoplayer2.upstream.Loader.this.currentTask = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                execute();
            }
        }

        public void cancel(boolean z) {
            this.released = z;
            this.currentError = null;
            if (hasMessages(0)) {
                this.canceled = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.canceled = true;
                    this.loadable.cancelLoad();
                    java.lang.Thread thread = this.executorThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                finish();
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ((com.google.android.exoplayer2.upstream.Loader.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onLoadCanceled(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.canceled;
                    this.executorThread = java.lang.Thread.currentThread();
                }
                if (z) {
                    com.google.android.exoplayer2.util.TraceUtil.beginSection("load:" + this.loadable.getClass().getSimpleName());
                    try {
                        this.loadable.load();
                        com.google.android.exoplayer2.util.TraceUtil.endSection();
                    } catch (java.lang.Throwable th) {
                        com.google.android.exoplayer2.util.TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    java.lang.Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (java.io.IOException e) {
                if (this.released) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (java.lang.OutOfMemoryError e2) {
                if (this.released) {
                    return;
                }
                com.google.android.exoplayer2.util.Log.e(TAG, "OutOfMemory error loading stream", e2);
                obtainMessage(2, new com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException(e2)).sendToTarget();
            } catch (java.lang.Error e3) {
                if (!this.released) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (java.lang.Exception e4) {
                if (this.released) {
                    return;
                }
                com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected exception loading stream", e4);
                obtainMessage(2, new com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            long retryDelayMillis;
            if (this.released) {
                return;
            }
            if (message.what == 0) {
                execute();
                return;
            }
            if (message.what == 3) {
                throw ((java.lang.Error) message.obj);
            }
            finish();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.startTimeMs;
            com.google.android.exoplayer2.upstream.Loader.Callback callback = (com.google.android.exoplayer2.upstream.Loader.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback);
            if (this.canceled) {
                callback.onLoadCanceled(this.loadable, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    callback.onLoadCompleted(this.loadable, elapsedRealtime, j);
                    return;
                } catch (java.lang.RuntimeException e) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected exception handling load completed", e);
                    com.google.android.exoplayer2.upstream.Loader.this.fatalError = new com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            java.io.IOException iOException = (java.io.IOException) message.obj;
            this.currentError = iOException;
            int i2 = this.errorCount + 1;
            this.errorCount = i2;
            com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError = callback.onLoadError(this.loadable, elapsedRealtime, j, iOException, i2);
            if (onLoadError.type != 3) {
                if (onLoadError.type != 2) {
                    if (onLoadError.type == 1) {
                        this.errorCount = 1;
                    }
                    if (onLoadError.retryDelayMillis != -9223372036854775807L) {
                        retryDelayMillis = onLoadError.retryDelayMillis;
                    } else {
                        retryDelayMillis = getRetryDelayMillis();
                    }
                    start(retryDelayMillis);
                    return;
                }
                return;
            }
            com.google.android.exoplayer2.upstream.Loader.this.fatalError = this.currentError;
        }

        private void execute() {
            this.currentError = null;
            com.google.android.exoplayer2.upstream.Loader.this.downloadExecutorService.execute((java.lang.Runnable) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.upstream.Loader.this.currentTask));
        }

        private void finish() {
            com.google.android.exoplayer2.upstream.Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return java.lang.Math.min((this.errorCount - 1) * 1000, 5000);
        }
    }

    private static final class ReleaseTask implements java.lang.Runnable {
        private final com.google.android.exoplayer2.upstream.Loader.ReleaseCallback callback;

        public ReleaseTask(com.google.android.exoplayer2.upstream.Loader.ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }
}
