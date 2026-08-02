package okio;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokio/Source;", "Lokio/GzipSource;", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "(Lokio/Source;)Lokio/GzipSource;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* loaded from: classes17.dex */
public final class GzipSourceExtensions {
    public static final okio.GzipSource gzip(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new okio.GzipSource(source);
    }
}
