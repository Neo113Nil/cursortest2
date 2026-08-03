package androidx.loader.content;

/* loaded from: classes2.dex */
abstract class ModernAsyncTask<Result> {
    private static final java.lang.String LOG_TAG = "AsyncTask";
    private static android.os.Handler sHandler;
    private volatile androidx.loader.content.ModernAsyncTask.Status mStatus = androidx.loader.content.ModernAsyncTask.Status.PENDING;
    final java.util.concurrent.atomic.AtomicBoolean mCancelled = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.FutureTask<Result> mFuture = new java.util.concurrent.FutureTask<Result>(new java.util.concurrent.Callable<Result>() { // from class: androidx.loader.content.ModernAsyncTask.1
        @Override // java.util.concurrent.Callable
        public Result call() {
            androidx.loader.content.ModernAsyncTask.this.mTaskInvoked.set(true);
            Result result = null;
            try {
                android.os.Process.setThreadPriority(10);
                result = (Result) androidx.loader.content.ModernAsyncTask.this.doInBackground();
                android.os.Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                androidx.loader.content.ModernAsyncTask.this.postResultIfNotInvoked(get());
            } catch (java.lang.InterruptedException e) {
                android.util.Log.w(androidx.loader.content.ModernAsyncTask.LOG_TAG, e);
            } catch (java.util.concurrent.CancellationException unused) {
                androidx.loader.content.ModernAsyncTask.this.postResultIfNotInvoked(null);
            } catch (java.util.concurrent.ExecutionException e2) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (java.lang.Throwable th) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result doInBackground();

    protected void onCancelled(Result result) {
    }

    protected void onPostExecute(Result result) {
    }

    private static android.os.Handler getHandler() {
        android.os.Handler handler;
        synchronized (androidx.loader.content.ModernAsyncTask.class) {
            if (sHandler == null) {
                sHandler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler = sHandler;
        }
        return handler;
    }

    ModernAsyncTask() {
    }

    void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    void postResult(final Result result) {
        getHandler().post(new java.lang.Runnable() { // from class: androidx.loader.content.ModernAsyncTask.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                androidx.loader.content.ModernAsyncTask.this.finish(result);
            }
        });
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status;

        static {
            int[] iArr = new int[androidx.loader.content.ModernAsyncTask.Status.values().length];
            $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = iArr;
            try {
                iArr[androidx.loader.content.ModernAsyncTask.Status.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$loader$content$ModernAsyncTask$Status[androidx.loader.content.ModernAsyncTask.Status.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final void executeOnExecutor(java.util.concurrent.Executor executor) {
        if (this.mStatus != androidx.loader.content.ModernAsyncTask.Status.PENDING) {
            int i = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.mStatus.ordinal()];
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
        this.mStatus = androidx.loader.content.ModernAsyncTask.Status.RUNNING;
        executor.execute(this.mFuture);
    }

    void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = androidx.loader.content.ModernAsyncTask.Status.FINISHED;
    }
}
