package io.ktor.websocket.serialization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {108, 117}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "typeInfo", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.websocket.serialization.WebsocketChannelSerializationKt.receiveDeserializedBase(null, null, null, null, this);
    }

    WebsocketChannelSerializationKt$receiveDeserializedBase$2(kotlin.coroutines.Continuation<? super io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2> continuation) {
        super(continuation);
    }
}
