package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSocketContent;", "Lio/ktor/client/request/ClientUpgradeContent;", "<init>", "()V", "Lio/ktor/http/Headers;", "headers", "", "verify", "(Lio/ktor/http/Headers;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketContent extends io.ktor.client.request.ClientUpgradeContent {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;
    private final io.ktor.http.Headers headers;

    public WebSocketContent() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(io.ktor.util.Base64Kt.encodeBase64(io.ktor.util.CryptoKt.generateNonce(16)));
        java.lang.String obj = sb.toString();
        this.Camera2StreamConfigurationMap = obj;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getUpgrade(), "websocket");
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getConnection(), com.google.common.net.HttpHeaders.UPGRADE);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketKey(), obj);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketVersion(), "13");
        this.headers = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.request.ClientUpgradeContent
    public final void verify(io.ktor.http.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        java.lang.String str = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketAccept());
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Server should specify header ");
            sb.append(io.ktor.http.HttpHeaders.INSTANCE.getSecWebSocketAccept());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        java.lang.String websocketServerAccept = io.ktor.http.websocket.UtilsKt.websocketServerAccept(this.Camera2StreamConfigurationMap);
        if (kotlin.jvm.internal.Intrinsics.areEqual(websocketServerAccept, str)) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to verify server accept header. Expected: ");
        sb2.append(websocketServerAccept);
        sb2.append(", received: ");
        sb2.append(str);
        throw new java.lang.IllegalStateException(sb2.toString().toString());
    }

    public final java.lang.String toString() {
        return "WebSocketContent";
    }
}
