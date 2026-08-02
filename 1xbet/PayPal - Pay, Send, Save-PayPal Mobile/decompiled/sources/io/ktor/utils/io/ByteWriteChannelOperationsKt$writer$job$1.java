package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {179, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class ByteWriteChannelOperationsKt$writer$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteChannel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r1.join(r8) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r1.join(r8) == r0) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #2 {all -> 0x00d7, blocks: (B:44:0x0052, B:45:0x008f, B:47:0x00a0, B:52:0x006a), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.CompletableJob] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        java.lang.Throwable th2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        try {
            try {
            } catch (java.lang.Throwable th3) {
                try {
                    kotlinx.coroutines.JobKt.cancel(job, "Exception thrown while writing to channel", th3);
                    this.Camera2StreamConfigurationMap.cancel(th3);
                    this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = 4;
                } catch (java.lang.Throwable th4) {
                    this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                    this.getHighSpeedVideoFpsRanges = th4;
                    this.getHighSpeedVideoSizes = 6;
                    if (job.join(this) != coroutine_suspended) {
                        th = th4;
                    }
                }
            }
        } catch (java.lang.Throwable th5) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th5));
        }
        switch (job) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()));
                kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                io.ktor.utils.io.WriterScope writerScope = new io.ktor.utils.io.WriterScope(this.Camera2StreamConfigurationMap, coroutineScope.getCoroutineContext().plus(Job));
                this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                this.getHighSpeedVideoFpsRanges = Job;
                this.getHighSpeedVideoSizes = 1;
                job = Job;
                if (function2.invoke(writerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job.complete();
                if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                    this.Camera2StreamConfigurationMap.cancel(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).getCancellationException());
                }
                this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = 2;
                break;
            case 1:
                kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) this.getHighSpeedVideoFpsRanges;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                job = completableJob;
                job.complete();
                if (kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()).isCancelled()) {
                }
                this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = 2;
                break;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ByteChannel byteChannel = this.Camera2StreamConfigurationMap;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = 3;
                if (byteChannel.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ByteChannel byteChannel2 = this.Camera2StreamConfigurationMap;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = 5;
                if (byteChannel2.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                return kotlin.Unit.INSTANCE;
            case 6:
                th = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ByteChannel byteChannel3 = this.Camera2StreamConfigurationMap;
                try {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    this.getHighSpeedVideoFpsRangesFor = th;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = 7;
                    if (byteChannel3.flushAndClose(this) != coroutine_suspended) {
                        th2 = th;
                        kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                        throw th2;
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    throw th;
                }
            case 7:
                th2 = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                    throw th2;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    th = th2;
                    kotlin.Result.Companion companion52 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    throw th;
                }
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        byteWriteChannelOperationsKt$writer$job$1.getHighSpeedVideoFpsRangesFor = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ByteWriteChannelOperationsKt$writer$job$1(kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.Camera2StreamConfigurationMap = byteChannel;
    }
}
