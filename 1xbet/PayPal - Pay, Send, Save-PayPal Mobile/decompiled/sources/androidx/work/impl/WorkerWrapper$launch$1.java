package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WorkerWrapper$launch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ androidx.work.impl.WorkerWrapper getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        final androidx.work.impl.WorkerWrapper.Resolution.Failed failed;
        androidx.work.impl.WorkDatabase workDatabase;
        kotlinx.coroutines.CompletableJob completableJob;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                completableJob = this.getHighSpeedVideoFpsRanges.getOutputSizes;
                this.getHighSpeedVideoSizes = 1;
                obj = kotlinx.coroutines.BuildersKt.withContext(completableJob, new androidx.work.impl.WorkerWrapper$launch$1$resolution$1(this.getHighSpeedVideoFpsRanges, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            failed = (androidx.work.impl.WorkerWrapper.Resolution) obj;
        } catch (androidx.work.impl.WorkerStoppedException e) {
            failed = new androidx.work.impl.WorkerWrapper.Resolution.ResetWorkerStatus(e.getReason());
        } catch (java.util.concurrent.CancellationException unused) {
            failed = new androidx.work.impl.WorkerWrapper.Resolution.Failed(null, 1, null);
        } catch (java.lang.Throwable th) {
            str = androidx.work.impl.WorkerWrapperKt.getHighSpeedVideoSizes;
            androidx.work.Logger.get().error(str, "Unexpected error in WorkerWrapper", th);
            failed = new androidx.work.impl.WorkerWrapper.Resolution.Failed(null, 1, null);
        }
        workDatabase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
        final androidx.work.impl.WorkerWrapper workerWrapper = this.getHighSpeedVideoFpsRanges;
        java.lang.Object runInTransaction = workDatabase.runInTransaction((java.util.concurrent.Callable<java.lang.Object>) new java.util.concurrent.Callable() { // from class: androidx.work.impl.WorkerWrapper$launch$1$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.work.impl.WorkerWrapper$launch$1.getHighSpeedVideoFpsRanges(androidx.work.impl.WorkerWrapper.Resolution.this, workerWrapper);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(runInTransaction, "");
        return runInTransaction;
    }

    public static /* synthetic */ java.lang.Boolean getHighSpeedVideoFpsRanges(androidx.work.impl.WorkerWrapper.Resolution resolution, androidx.work.impl.WorkerWrapper workerWrapper) {
        boolean access$resetWorkerStatus;
        if (resolution instanceof androidx.work.impl.WorkerWrapper.Resolution.Finished) {
            access$resetWorkerStatus = androidx.work.impl.WorkerWrapper.access$onWorkFinished(workerWrapper, ((androidx.work.impl.WorkerWrapper.Resolution.Finished) resolution).getResult());
        } else if (resolution instanceof androidx.work.impl.WorkerWrapper.Resolution.Failed) {
            access$resetWorkerStatus = androidx.work.impl.WorkerWrapper.access$onWorkFailed(workerWrapper, ((androidx.work.impl.WorkerWrapper.Resolution.Failed) resolution).getResult());
        } else {
            if (!(resolution instanceof androidx.work.impl.WorkerWrapper.Resolution.ResetWorkerStatus)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            access$resetWorkerStatus = androidx.work.impl.WorkerWrapper.access$resetWorkerStatus(workerWrapper, ((androidx.work.impl.WorkerWrapper.Resolution.ResetWorkerStatus) resolution).getReason());
        }
        return java.lang.Boolean.valueOf(access$resetWorkerStatus);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.work.impl.WorkerWrapper$launch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.WorkerWrapper$launch$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$launch$1(androidx.work.impl.WorkerWrapper workerWrapper, kotlin.coroutines.Continuation<? super androidx.work.impl.WorkerWrapper$launch$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = workerWrapper;
    }
}
