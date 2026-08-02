package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/websocket/CloseReason;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/websocket/CloseReason;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpWebsocketSessionKt {
    private static final io.ktor.websocket.CloseReason getHighResolutionOutputSizeshNQ4ISI = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR, "Client failure");

    public static final /* synthetic */ boolean access$isReserved(io.ktor.websocket.CloseReason closeReason) {
        io.ktor.websocket.CloseReason.Codes byCode = io.ktor.websocket.CloseReason.Codes.INSTANCE.byCode(closeReason.getCode());
        return byCode == null || byCode == io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY;
    }
}
