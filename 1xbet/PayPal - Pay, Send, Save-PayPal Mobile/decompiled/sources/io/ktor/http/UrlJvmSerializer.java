package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/http/UrlJvmSerializer;", "Lio/ktor/utils/io/JvmSerializer;", "Lio/ktor/http/Url;", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "jvmSerialize", "(Lio/ktor/http/Url;)[B", "jvmDeserialize", "([B)Lio/ktor/http/Url;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlJvmSerializer implements io.ktor.utils.io.JvmSerializer<io.ktor.http.Url> {
    public static final io.ktor.http.UrlJvmSerializer INSTANCE = new io.ktor.http.UrlJvmSerializer();

    private UrlJvmSerializer() {
    }

    @Override // io.ktor.utils.io.JvmSerializer
    public final byte[] jvmSerialize(io.ktor.http.Url value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return kotlin.text.StringsKt.encodeToByteArray(value.toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.JvmSerializer
    public final io.ktor.http.Url jvmDeserialize(byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return io.ktor.http.URLUtilsKt.Url(kotlin.text.StringsKt.decodeToString(value));
    }
}
