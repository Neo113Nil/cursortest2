package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/http/CookieJvmSerializer;", "Lio/ktor/utils/io/JvmSerializer;", "Lio/ktor/http/Cookie;", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "jvmSerialize", "(Lio/ktor/http/Cookie;)[B", "jvmDeserialize", "([B)Lio/ktor/http/Cookie;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CookieJvmSerializer implements io.ktor.utils.io.JvmSerializer<io.ktor.http.Cookie> {
    public static final io.ktor.http.CookieJvmSerializer INSTANCE = new io.ktor.http.CookieJvmSerializer();

    private CookieJvmSerializer() {
    }

    @Override // io.ktor.utils.io.JvmSerializer
    public final byte[] jvmSerialize(io.ktor.http.Cookie value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return kotlin.text.StringsKt.encodeToByteArray(io.ktor.http.CookieKt.renderSetCookieHeader(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.JvmSerializer
    public final io.ktor.http.Cookie jvmDeserialize(byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return io.ktor.http.CookieKt.parseServerSetCookieHeader(kotlin.text.StringsKt.decodeToString(value));
    }
}
