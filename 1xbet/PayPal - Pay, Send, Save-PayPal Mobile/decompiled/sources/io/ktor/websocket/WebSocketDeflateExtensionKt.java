package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketDeflateExtensionKt {
    public static final /* synthetic */ boolean access$isCompressed(io.ktor.websocket.Frame frame) {
        if (frame.getRsv1()) {
            return (frame instanceof io.ktor.websocket.Frame.Text) || (frame instanceof io.ktor.websocket.Frame.Binary);
        }
        return false;
    }
}
