package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$copied$1", f = "Logging.kt", i = {2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 179}, m = "invokeSuspend", n = {"copied"}, s = {"J$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$detectIfBinary$copied$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {
    long Camera2StreamConfigurationMap;
    final /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(r7.getHighSpeedVideoFpsRanges, r7.getHighResolutionOutputSizeshNQ4ISI, 0, r7.getHighSpeedVideoSizes, r7) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                long longValue = ((java.lang.Number) obj).longValue();
                this.Camera2StreamConfigurationMap = longValue;
                this.getHighSpeedVideoSizesFor = 3;
                if (this.getHighSpeedVideoFpsRanges.flushAndClose(this) != coroutine_suspended) {
                    j = longValue;
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
                }
                return coroutine_suspended;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizesFor = 2;
        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return ((io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$copied$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$copied$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$detectIfBinary$copied$1(io.ktor.utils.io.ByteChannel byteChannel, byte[] bArr, int i, io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$copied$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = byteChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel;
    }
}
