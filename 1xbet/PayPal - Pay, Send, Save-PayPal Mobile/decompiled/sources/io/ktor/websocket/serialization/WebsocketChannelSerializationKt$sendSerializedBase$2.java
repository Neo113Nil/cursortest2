package io.ktor.websocket.serialization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0}, l = {57, 62}, m = "sendSerializedBase", n = {"$this$sendSerializedBase"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class WebsocketChannelSerializationKt$sendSerializedBase$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.websocket.serialization.WebsocketChannelSerializationKt.sendSerializedBase(null, null, null, null, null, this);
    }

    WebsocketChannelSerializationKt$sendSerializedBase$2(kotlin.coroutines.Continuation<? super io.ktor.websocket.serialization.WebsocketChannelSerializationKt$sendSerializedBase$2> continuation) {
        super(continuation);
    }
}
