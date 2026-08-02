package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", i = {0}, l = {207, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MultipartKt$parseMultipart$1$preambleData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.io.bytestring.ByteString getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.utils.io.CountedByteReadChannel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r1.getChannel().flushAndClose(r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r11 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.WriterScope writerScope;
        java.lang.Object readUntil;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            writerScope = (io.ktor.utils.io.WriterScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.io.bytestring.ByteString byteString = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = writerScope;
            this.Camera2StreamConfigurationMap = 1;
            readUntil = io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(this.getHighSpeedVideoFpsRangesFor, byteString, writerScope.getChannel(), 8193L, true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            writerScope = (io.ktor.utils.io.WriterScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        multipartKt$parseMultipart$1$preambleData$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1$preambleData$1(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = byteString;
        this.getHighSpeedVideoFpsRangesFor = countedByteReadChannel;
    }
}
