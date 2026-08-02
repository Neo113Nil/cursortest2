package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {com.visa.cbp.getCertUsage.getODAData, 343, 343, 343}, m = "invokeSuspend", n = {"$this$launch", "nested"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$reader$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteChannel Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r1.join(r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r1.join(r12) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.lang.Throwable th) {
            try {
                kotlinx.coroutines.JobKt.cancel(job, "Exception thrown while reading from channel", th);
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(this.Camera2StreamConfigurationMap, th);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 3;
            } catch (java.lang.Throwable th2) {
                this.getHighResolutionOutputSizeshNQ4ISI = th2;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 4;
                if (job.join(this) != coroutine_suspended) {
                    throw th2;
                }
            }
        }
        if (job == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope2.getCoroutineContext()));
            kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
            io.ktor.utils.io.ReaderScope readerScope = new io.ktor.utils.io.ReaderScope(this.Camera2StreamConfigurationMap, coroutineScope2.getCoroutineContext().plus(Job));
            this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope2;
            this.getHighSpeedVideoFpsRangesFor = Job;
            this.getHighSpeedVideoFpsRanges = 1;
            if (function2.invoke(readerScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            job = Job;
        } else {
            if (job != 1) {
                if (job == 2 || job == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (job != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th3 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th3;
            }
            kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) this.getHighSpeedVideoFpsRangesFor;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            job = completableJob;
        }
        job.complete();
        if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
            this.Camera2StreamConfigurationMap.cancel(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        byteReadChannelOperationsKt$reader$job$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteReadChannelOperationsKt$reader$job$1(kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ReaderScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function2;
        this.Camera2StreamConfigurationMap = byteChannel;
    }
}
