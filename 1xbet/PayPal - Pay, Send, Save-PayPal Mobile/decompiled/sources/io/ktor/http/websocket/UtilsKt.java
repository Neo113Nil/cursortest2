package io.ktor.http.websocket;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "nonce", "websocketServerAccept", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtilsKt {
    public static final java.lang.String websocketServerAccept(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.trim(str).toString());
        sb.append(okhttp3.internal.ws.WebSocketProtocol.ACCEPT_MAGIC);
        return io.ktor.util.Base64Kt.encodeBase64(io.ktor.util.CryptoKt.sha1(io.ktor.utils.io.core.StringsKt.toByteArray(sb.toString(), kotlin.text.Charsets.ISO_8859_1)));
    }
}
