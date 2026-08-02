package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorker$runWorker$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.impl.constraints.WorkConstraintsTracker getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.work.ListenableWorker getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00f4: INVOKE (r7 I:kotlinx.coroutines.Job), (r5 I:java.util.concurrent.CancellationException), (r6 I:int), (r5 I:java.lang.Object) STATIC call: kotlinx.coroutines.Job.DefaultImpls.cancel$default(kotlinx.coroutines.Job, java.util.concurrent.CancellationException, int, java.lang.Object):void A[MD:(kotlinx.coroutines.Job, java.util.concurrent.CancellationException, int, java.lang.Object):void (m)] (LINE:149), block:B:46:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job cancel$default;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork;
        kotlinx.coroutines.Job launch$default;
        java.lang.Object await;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        kotlinx.coroutines.Job job;
        com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> listenableFuture;
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                atomicInteger = new java.util.concurrent.atomic.AtomicInteger(-256);
                startWork = this.getHighSpeedVideoSizes.startWork();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(startWork, "");
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, atomicInteger, startWork, null), 3, null);
                try {
                    this.getInputSizeshNQ4ISI = atomicInteger;
                    this.getHighResolutionOutputSizeshNQ4ISI = startWork;
                    this.Camera2StreamConfigurationMap = launch$default;
                    this.getHighSpeedVideoSizesFor = 1;
                    await = androidx.concurrent.futures.ListenableFutureKt.await(startWork, this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    atomicInteger2 = atomicInteger;
                    job = launch$default;
                    listenableFuture = startWork;
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    str2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.work.ListenableWorker listenableWorker = this.getHighSpeedVideoSizes;
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Delegated worker ");
                    sb.append(listenableWorker.getClass());
                    sb.append(" was cancelled");
                    logger.debug(str2, sb.toString(), e);
                    if (atomicInteger.get() != -256) {
                    }
                    if (!startWork.isCancelled()) {
                    }
                    throw e;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.work.ListenableWorker listenableWorker2 = this.getHighSpeedVideoSizes;
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Delegated worker ");
                    sb2.append(listenableWorker2.getClass());
                    sb2.append(" threw exception in startWork.");
                    logger2.debug(str, sb2.toString(), th);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (kotlinx.coroutines.Job) this.Camera2StreamConfigurationMap;
                listenableFuture = (com.google.common.util.concurrent.ListenableFuture) this.getHighResolutionOutputSizeshNQ4ISI;
                atomicInteger3 = (java.util.concurrent.atomic.AtomicInteger) this.getInputSizeshNQ4ISI;
                try {
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        atomicInteger2 = atomicInteger3;
                        await = obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.work.ListenableWorker listenableWorker22 = this.getHighSpeedVideoSizes;
                        androidx.work.Logger logger22 = androidx.work.Logger.get();
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Delegated worker ");
                        sb22.append(listenableWorker22.getClass());
                        sb22.append(" threw exception in startWork.");
                        logger22.debug(str, sb22.toString(), th);
                        throw th;
                    }
                } catch (java.util.concurrent.CancellationException e2) {
                    e = e2;
                    startWork = listenableFuture;
                    atomicInteger = atomicInteger3;
                    str2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.work.ListenableWorker listenableWorker3 = this.getHighSpeedVideoSizes;
                    androidx.work.Logger logger3 = androidx.work.Logger.get();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Delegated worker ");
                    sb3.append(listenableWorker3.getClass());
                    sb3.append(" was cancelled");
                    logger3.debug(str2, sb3.toString(), e);
                    if (atomicInteger.get() != -256) {
                    }
                    if (!startWork.isCancelled()) {
                    }
                    throw e;
                }
            }
            try {
                androidx.work.ListenableWorker.Result result = (androidx.work.ListenableWorker.Result) await;
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return result;
            } catch (java.util.concurrent.CancellationException e3) {
                e = e3;
                atomicInteger3 = atomicInteger2;
                startWork = listenableFuture;
                atomicInteger = atomicInteger3;
                str2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
                androidx.work.ListenableWorker listenableWorker32 = this.getHighSpeedVideoSizes;
                androidx.work.Logger logger32 = androidx.work.Logger.get();
                java.lang.StringBuilder sb32 = new java.lang.StringBuilder("Delegated worker ");
                sb32.append(listenableWorker32.getClass());
                sb32.append(" was cancelled");
                logger32.debug(str2, sb32.toString(), e);
                boolean z = atomicInteger.get() != -256;
                if (!startWork.isCancelled() && z) {
                    throw new androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                }
                throw e;
            }
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(cancel$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        constraintTrackingWorker$runWorker$2.getInputSizeshNQ4ISI = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2(androidx.work.ListenableWorker listenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = listenableWorker;
        this.getHighSpeedVideoFpsRanges = workConstraintsTracker;
        this.getHighSpeedVideoFpsRangesFor = workSpec;
    }
}
