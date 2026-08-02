package androidx.loader.content;

/* loaded from: classes7.dex */
abstract class ModernAsyncTask<Result> {
    private static android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    private volatile androidx.loader.content.ModernAsyncTask.Status getHighSpeedVideoFpsRanges = androidx.loader.content.ModernAsyncTask.Status.PENDING;
    final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.FutureTask<Result> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.FutureTask<Result>(new java.util.concurrent.Callable<Result>() { // from class: androidx.loader.content.ModernAsyncTask.1
        @Override // java.util.concurrent.Callable
        public Result call() {
            androidx.loader.content.ModernAsyncTask.this.getHighSpeedVideoSizes.set(true);
            Result result = null;
            try {
                android.os.Process.setThreadPriority(10);
                result = (Result) androidx.loader.content.ModernAsyncTask.this.Camera2StreamConfigurationMap();
                android.os.Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                Result result = get();
                androidx.loader.content.ModernAsyncTask modernAsyncTask = androidx.loader.content.ModernAsyncTask.this;
                if (modernAsyncTask.getHighSpeedVideoSizes.get()) {
                    return;
                }
                androidx.loader.content.ModernAsyncTask.getHighSpeedVideoFpsRangesFor().post(new androidx.loader.content.ModernAsyncTask.AnonymousClass3(result));
            } catch (java.lang.InterruptedException unused) {
            } catch (java.util.concurrent.CancellationException unused2) {
                androidx.loader.content.ModernAsyncTask modernAsyncTask2 = androidx.loader.content.ModernAsyncTask.this;
                if (modernAsyncTask2.getHighSpeedVideoSizes.get()) {
                    return;
                }
                androidx.loader.content.ModernAsyncTask.getHighSpeedVideoFpsRangesFor().post(new androidx.loader.content.ModernAsyncTask.AnonymousClass3(null));
            } catch (java.util.concurrent.ExecutionException e) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e.getCause());
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

    protected abstract Result Camera2StreamConfigurationMap();

    protected void getHighResolutionOutputSizeshNQ4ISI(Result result) {
    }

    protected void getHighSpeedVideoSizes(Result result) {
    }

    static android.os.Handler getHighSpeedVideoFpsRangesFor() {
        android.os.Handler handler;
        synchronized (androidx.loader.content.ModernAsyncTask.class) {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler = getHighResolutionOutputSizeshNQ4ISI;
        }
        return handler;
    }

    ModernAsyncTask() {
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        AnonymousClass3(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            androidx.loader.content.ModernAsyncTask.this.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public final boolean getHighSpeedVideoSizes(boolean z) {
        this.Camera2StreamConfigurationMap.set(true);
        return this.getHighSpeedVideoFpsRangesFor.cancel(false);
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.loader.content.ModernAsyncTask.Status.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.loader.content.ModernAsyncTask.Status.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.loader.content.ModernAsyncTask.Status.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final void Camera2StreamConfigurationMap(java.util.concurrent.Executor executor) {
        if (this.getHighSpeedVideoFpsRanges != androidx.loader.content.ModernAsyncTask.Status.PENDING) {
            int i = androidx.loader.content.ModernAsyncTask.AnonymousClass4.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRanges.ordinal()];
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
        this.getHighSpeedVideoFpsRanges = androidx.loader.content.ModernAsyncTask.Status.RUNNING;
        executor.execute(this.getHighSpeedVideoFpsRangesFor);
    }

    final void getHighSpeedVideoFpsRangesFor(Result result) {
        if (this.Camera2StreamConfigurationMap.get()) {
            getHighSpeedVideoSizes((androidx.loader.content.ModernAsyncTask<Result>) result);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(result);
        }
        this.getHighSpeedVideoFpsRanges = androidx.loader.content.ModernAsyncTask.Status.FINISHED;
    }
}
