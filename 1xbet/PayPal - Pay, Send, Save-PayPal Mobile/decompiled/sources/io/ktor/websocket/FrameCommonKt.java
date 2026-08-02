package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "", "readText", "(Lio/ktor/websocket/Frame$Text;)Ljava/lang/String;", "Lio/ktor/websocket/Frame;", "", "readBytes", "(Lio/ktor/websocket/Frame;)[B", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/CloseReason;", "readReason", "(Lio/ktor/websocket/Frame$Close;)Lio/ktor/websocket/CloseReason;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FrameCommonKt {
    public static final java.lang.String readText(io.ktor.websocket.Frame.Text text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        if (!text.getFin()) {
            throw new java.lang.IllegalArgumentException("Text could be only extracted from non-fragmented frame".toString());
        }
        java.nio.charset.CharsetDecoder newDecoder = kotlin.text.Charsets.UTF_8.newDecoder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newDecoder, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(buffer, text.getData(), 0, 0, 6, null);
        return io.ktor.utils.io.charsets.EncodingKt.decode$default(newDecoder, buffer, 0, 2, null);
    }

    public static final byte[] readBytes(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        byte[] data = frame.getData();
        byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public static final io.ktor.websocket.CloseReason readReason(io.ktor.websocket.Frame.Close close) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(close, "");
        if (close.getData().length < 2) {
            return null;
        }
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(buffer, close.getData(), 0, 0, 6, null);
        kotlinx.io.Buffer buffer2 = buffer;
        return new io.ktor.websocket.CloseReason(buffer2.readShort(), io.ktor.utils.io.core.StringsKt.readText$default(buffer2, null, 0, 3, null));
    }
}
