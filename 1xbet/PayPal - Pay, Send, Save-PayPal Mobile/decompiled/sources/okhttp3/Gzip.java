package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/Gzip;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "()V", "Lokio/BufferedSource;", "compressedSource", "Lokio/Source;", "decompress", "(Lokio/BufferedSource;)Lokio/Source;", "", "getEncoding", "()Ljava/lang/String;", "encoding"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Gzip implements okhttp3.CompressionInterceptor.DecompressionAlgorithm {
    public static final okhttp3.Gzip INSTANCE = new okhttp3.Gzip();

    private Gzip() {
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final java.lang.String getEncoding() {
        return com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final okio.Source decompress(okio.BufferedSource compressedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compressedSource, "");
        return new okio.GzipSource(compressedSource);
    }
}
