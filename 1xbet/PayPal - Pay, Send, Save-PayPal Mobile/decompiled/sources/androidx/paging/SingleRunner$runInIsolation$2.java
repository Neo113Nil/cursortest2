package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {48, 51, 53, 53}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class SingleRunner$runInIsolation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.SingleRunner getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r10.getHighResolutionOutputSizeshNQ4ISI(r1, r2) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r10.invoke(r9) != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.paging.SingleRunner$Holder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ?? r3;
        androidx.paging.SingleRunner.Holder holder;
        kotlinx.coroutines.Job job;
        ?? r10;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.paging.SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = 4;
        try {
        } catch (java.lang.Throwable th) {
            r3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = th;
            this.getHighResolutionOutputSizeshNQ4ISI = singleRunner$runInIsolation$2;
            if (r3.getHighResolutionOutputSizeshNQ4ISI(r1, this) != coroutine_suspended) {
                throw th;
            }
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.coroutines.CoroutineContext.Element element = ((kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
            if (element != null) {
                kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) element;
                holder = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = job2;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object highResolutionOutputSizeshNQ4ISI = holder.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, job2, this);
                if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                    job = job2;
                    obj = highResolutionOutputSizeshNQ4ISI;
                }
                return coroutine_suspended;
            }
            throw new java.lang.IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
        }
        if (r1 == 1) {
            kotlinx.coroutines.Job job3 = (kotlinx.coroutines.Job) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            job = job3;
        } else {
            if (r1 != 2) {
                if (r1 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (r1 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th2 = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th2;
            }
            kotlinx.coroutines.Job job4 = (kotlinx.coroutines.Job) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = job4;
            r10 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            singleRunner$runInIsolation$2 = this;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = job;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            r1 = job;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.SingleRunner$runInIsolation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new androidx.paging.SingleRunner$runInIsolation$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        singleRunner$runInIsolation$2.Camera2StreamConfigurationMap = obj;
        return singleRunner$runInIsolation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SingleRunner$runInIsolation$2(androidx.paging.SingleRunner singleRunner, int i, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.paging.SingleRunner$runInIsolation$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = singleRunner;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = function1;
    }
}
