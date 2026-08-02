package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {125, 129, 143}, m = "drainQueueAndSerialize", n = {"buffer", "flush", "closeSent", "buffer", "flush", "it", "closeSent", "flush", "closeSent"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class WebSocketWriter$drainQueueAndSerialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ io.ktor.websocket.WebSocketWriter getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$drainQueueAndSerialize$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = webSocketWriter;
    }
}
