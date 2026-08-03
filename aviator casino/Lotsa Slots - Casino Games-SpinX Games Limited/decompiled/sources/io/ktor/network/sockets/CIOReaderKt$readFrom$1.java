package io.ktor.network.sockets;

/* compiled from: CIOReader.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "readFrom", n = {com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CIOReaderKt$readFrom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    CIOReaderKt$readFrom$1(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOReaderKt$readFrom$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object readFrom;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readFrom = io.ktor.network.sockets.CIOReaderKt.readFrom(null, null, this);
        return readFrom;
    }
}
