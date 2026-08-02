package androidx.work;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private android.content.Context mAppContext;
    private final java.util.concurrent.atomic.AtomicInteger mStopReason = new java.util.concurrent.atomic.AtomicInteger(-256);
    private boolean mUsed;
    private androidx.work.WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork();

    public ListenableWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final android.content.Context getApplicationContext() {
        return this.mAppContext;
    }

    public final java.util.UUID getId() {
        return this.mWorkerParams.getId();
    }

    public final androidx.work.Data getInputData() {
        return this.mWorkerParams.getInputData();
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.mWorkerParams.getTags();
    }

    public final java.util.List<android.net.Uri> getTriggeredContentUris() {
        return this.mWorkerParams.getTriggeredContentUris();
    }

    public final java.util.List<java.lang.String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.getTriggeredContentAuthorities();
    }

    public final android.net.Network getNetwork() {
        return this.mWorkerParams.getNetwork();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.getRunAttemptCount();
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgressAsync(androidx.work.Data data) {
        return this.mWorkerParams.getProgressUpdater().updateProgress(getApplicationContext(), getId(), data);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(androidx.work.ForegroundInfo foregroundInfo) {
        return this.mWorkerParams.getForegroundUpdater().setForegroundAsync(getApplicationContext(), getId(), foregroundInfo);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.work.ListenableWorker$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.work.ListenableWorker.lambda$getForegroundInfoAsync$0(completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$getForegroundInfoAsync$0(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        completer.setException(new java.lang.IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.mWorkerParams.getBackgroundExecutor();
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.getTaskExecutor();
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.getWorkerFactory();
    }

    public static abstract class Result {
        public abstract androidx.work.Data getOutputData();

        public static androidx.work.ListenableWorker.Result success() {
            return new androidx.work.ListenableWorker.Result.Success();
        }

        public static androidx.work.ListenableWorker.Result success(androidx.work.Data data) {
            return new androidx.work.ListenableWorker.Result.Success(data);
        }

        public static androidx.work.ListenableWorker.Result retry() {
            return new androidx.work.ListenableWorker.Result.Retry();
        }

        public static androidx.work.ListenableWorker.Result failure() {
            return new androidx.work.ListenableWorker.Result.Failure();
        }

        public static androidx.work.ListenableWorker.Result failure(androidx.work.Data data) {
            return new androidx.work.ListenableWorker.Result.Failure(data);
        }

        Result() {
        }

        /* loaded from: classes3.dex */
        public static final class Success extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data Camera2StreamConfigurationMap;

            public Success() {
                this(androidx.work.Data.EMPTY);
            }

            public Success(androidx.work.Data data) {
                this.Camera2StreamConfigurationMap = data;
            }

            @Override // androidx.work.ListenableWorker.Result
            public final androidx.work.Data getOutputData() {
                return this.Camera2StreamConfigurationMap;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.Camera2StreamConfigurationMap.equals(((androidx.work.ListenableWorker.Result.Success) obj).Camera2StreamConfigurationMap);
            }

            public final int hashCode() {
                return ("androidx.work.ListenableWorker$Result$Success".hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success {mOutputData=");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                return sb.toString();
            }
        }

        /* loaded from: classes3.dex */
        public static final class Failure extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data getHighResolutionOutputSizeshNQ4ISI;

            public Failure() {
                this(androidx.work.Data.EMPTY);
            }

            public Failure(androidx.work.Data data) {
                this.getHighResolutionOutputSizeshNQ4ISI = data;
            }

            @Override // androidx.work.ListenableWorker.Result
            public final androidx.work.Data getOutputData() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.getHighResolutionOutputSizeshNQ4ISI.equals(((androidx.work.ListenableWorker.Result.Failure) obj).getHighResolutionOutputSizeshNQ4ISI);
            }

            public final int hashCode() {
                return ("androidx.work.ListenableWorker$Result$Failure".hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure {mOutputData=");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                return sb.toString();
            }
        }

        /* loaded from: classes3.dex */
        public static final class Retry extends androidx.work.ListenableWorker.Result {
            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public final int hashCode() {
                return "androidx.work.ListenableWorker$Result$Retry".hashCode();
            }

            @Override // androidx.work.ListenableWorker.Result
            public final androidx.work.Data getOutputData() {
                return androidx.work.Data.EMPTY;
            }

            public final java.lang.String toString() {
                return "Retry";
            }
        }
    }
}
