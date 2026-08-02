package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/work/WorkerParameters;", "getHighSpeedVideoFpsRangesFor", "ConstraintUnsatisfiedException"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConstraintTrackingWorker extends androidx.work.CoroutineWorker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.work.WorkerParameters getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$runWorker(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, androidx.work.ListenableWorker listenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, kotlin.coroutines.Continuation continuation) {
        androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 constraintTrackingWorker$runWorker$1;
        int i;
        if (continuation instanceof androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1) {
            constraintTrackingWorker$runWorker$1 = (androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1) continuation;
            if ((constraintTrackingWorker$runWorker$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$runWorker$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = constraintTrackingWorker$runWorker$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorker$runWorker$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2(listenableWorker, workConstraintsTracker, workSpec, null);
                    constraintTrackingWorker$runWorker$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(constraintTrackingWorker$runWorker$2, constraintTrackingWorker$runWorker$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        constraintTrackingWorker$runWorker$1 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1(constraintTrackingWorker, continuation);
        java.lang.Object obj2 = constraintTrackingWorker$runWorker$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorker$runWorker$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        this.getHighSpeedVideoFpsRangesFor = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        java.util.concurrent.Executor backgroundExecutor = getBackgroundExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "");
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.ExecutorsKt.from(backgroundExecutor), new androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        androidx.work.ListenableWorker listenableWorker;
        java.lang.String str5;
        int getHighSpeedVideoSizes;
        if (continuation instanceof androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = (androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) continuation;
            if ((constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$12 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
                java.lang.Object obj = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String string = getInputData().getString(androidx.work.impl.workers.ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
                    java.lang.String str6 = string;
                    if (str6 == null || str6.length() == 0) {
                        str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.work.Logger.get().error(str, "No worker to delegate to.");
                        androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                        return failure;
                    }
                    androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManagerImpl, "");
                    androidx.work.impl.model.WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
                    java.lang.String obj2 = getId().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    androidx.work.impl.model.WorkSpec workSpec = workSpecDao.getWorkSpec(obj2);
                    if (workSpec == null) {
                        androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure2, "");
                        return failure2;
                    }
                    androidx.work.impl.constraints.trackers.Trackers trackers = workManagerImpl.getTrackers();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackers, "");
                    androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTracker(trackers);
                    if (!workConstraintsTracker.areAllConstraintsMet(workSpec)) {
                        str5 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.work.Logger logger = androidx.work.Logger.get();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints not met for delegate ");
                        sb.append(string);
                        sb.append(". Requesting retry.");
                        logger.debug(str5, sb.toString());
                        androidx.work.ListenableWorker.Result retry = androidx.work.ListenableWorker.Result.retry();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retry, "");
                        return retry;
                    }
                    str2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.work.Logger.get().debug(str2, "Constraints met for delegate ".concat(java.lang.String.valueOf(string)));
                    try {
                        androidx.work.WorkerFactory workerFactory = getWorkerFactory();
                        android.content.Context applicationContext = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        androidx.work.ListenableWorker createWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(applicationContext, string, this.getHighSpeedVideoFpsRangesFor);
                        java.util.concurrent.Executor mainThreadExecutor = this.getHighSpeedVideoFpsRangesFor.getTaskExecutor().getMainThreadExecutor();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
                        try {
                            kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(mainThreadExecutor);
                            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$5 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this, createWorkerWithDefaultFallback, workConstraintsTracker, workSpec, null);
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.getHighSpeedVideoFpsRanges = createWorkerWithDefaultFallback;
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.Camera2StreamConfigurationMap = 1;
                            obj = kotlinx.coroutines.BuildersKt.withContext(from, constraintTrackingWorker$setupAndRunConstraintTrackingWork$5, constraintTrackingWorker$setupAndRunConstraintTrackingWork$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            listenableWorker = createWorkerWithDefaultFallback;
                        } catch (java.util.concurrent.CancellationException e) {
                            e = e;
                            listenableWorker = createWorkerWithDefaultFallback;
                            if (!isStopped() || (e instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException)) {
                                if (android.os.Build.VERSION.SDK_INT >= 31) {
                                    getHighSpeedVideoSizes = androidx.work.WorkInfo.STOP_REASON_UNKNOWN;
                                } else if (isStopped()) {
                                    getHighSpeedVideoSizes = getStopReason();
                                } else {
                                    if (!(e instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException)) {
                                        throw new java.lang.IllegalStateException("Unreachable");
                                    }
                                    getHighSpeedVideoSizes = ((androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException) e).getGetHighSpeedVideoSizes();
                                }
                                listenableWorker.stop(getHighSpeedVideoSizes);
                            }
                            if (e instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException) {
                                throw e;
                            }
                            androidx.work.ListenableWorker.Result retry2 = androidx.work.ListenableWorker.Result.retry();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(retry2);
                            return retry2;
                        }
                    } catch (java.lang.Throwable th) {
                        str3 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.work.Logger.get().debug(str3, "No worker to delegate to.");
                        androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> workerInitializationExceptionHandler = workManagerImpl.getConfiguration().getWorkerInitializationExceptionHandler();
                        if (workerInitializationExceptionHandler != null) {
                            androidx.work.WorkerExceptionInfo workerExceptionInfo = new androidx.work.WorkerExceptionInfo(string, this.getHighSpeedVideoFpsRangesFor, th);
                            str4 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, workerExceptionInfo, str4);
                        }
                        androidx.work.ListenableWorker.Result failure3 = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure3, "");
                        return failure3;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    listenableWorker = (androidx.work.ListenableWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.util.concurrent.CancellationException e2) {
                        e = e2;
                        if (!isStopped()) {
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                        }
                        listenableWorker.stop(getHighSpeedVideoSizes);
                        if (e instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException) {
                        }
                    }
                }
                return (androidx.work.ListenableWorker.Result) obj;
            }
        }
        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(this, continuation);
        androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$122 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        java.lang.Object obj3 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return (androidx.work.ListenableWorker.Result) obj3;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "", "p0", "<init>", "(I)V", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ConstraintUnsatisfiedException extends java.util.concurrent.CancellationException {
        private final int getHighSpeedVideoSizes;

        public ConstraintUnsatisfiedException(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
