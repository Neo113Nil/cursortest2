package io.ktor.websocket.serialization;

/* compiled from: WebsocketChannelSerialization.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {108, 117}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", "charset", "typeInfo", "frame"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    WebsocketChannelSerializationKt$receiveDeserializedBase$2(kotlin.coroutines.Continuation<? super io.ktor.websocket.serialization.WebsocketChannelSerializationKt$receiveDeserializedBase$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.websocket.serialization.WebsocketChannelSerializationKt.receiveDeserializedBase(null, null, null, null, this);
    }
}
