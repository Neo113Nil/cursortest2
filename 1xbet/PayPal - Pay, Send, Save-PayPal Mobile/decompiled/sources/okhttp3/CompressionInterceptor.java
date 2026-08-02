package okhttp3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokhttp3/CompressionInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "algorithms", "<init>", "([Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "response", "decompress$okhttp", "(Lokhttp3/Response;)Lokhttp3/Response;", "", "encoding", "lookupDecompressor$okhttp", "(Ljava/lang/String;)Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "", "[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "getAlgorithms", "()[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "acceptEncoding", "Ljava/lang/String;", "getAcceptEncoding$okhttp", "()Ljava/lang/String;", "DecompressionAlgorithm"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public class CompressionInterceptor implements okhttp3.Interceptor {
    private final java.lang.String acceptEncoding;
    private final okhttp3.CompressionInterceptor.DecompressionAlgorithm[] algorithms;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "", "Lokio/BufferedSource;", "compressedSource", "Lokio/Source;", "decompress", "(Lokio/BufferedSource;)Lokio/Source;", "", "getEncoding", "()Ljava/lang/String;", "encoding"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DecompressionAlgorithm {
        okio.Source decompress(okio.BufferedSource compressedSource);

        java.lang.String getEncoding();
    }

    public CompressionInterceptor(okhttp3.CompressionInterceptor.DecompressionAlgorithm... decompressionAlgorithmArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decompressionAlgorithmArr, "");
        this.algorithms = decompressionAlgorithmArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(decompressionAlgorithmArr.length);
        for (okhttp3.CompressionInterceptor.DecompressionAlgorithm decompressionAlgorithm : decompressionAlgorithmArr) {
            arrayList.add(decompressionAlgorithm.getEncoding());
        }
        this.acceptEncoding = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final okhttp3.CompressionInterceptor.DecompressionAlgorithm[] getAlgorithms() {
        return this.algorithms;
    }

    /* renamed from: getAcceptEncoding$okhttp, reason: from getter */
    public final java.lang.String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        if (this.algorithms.length != 0 && chain.request().header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING) == null) {
            return decompress$okhttp(chain.proceed(chain.request().newBuilder().header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, this.acceptEncoding).build()));
        }
        return chain.proceed(chain.request());
    }

    public final okhttp3.Response decompress$okhttp(okhttp3.Response response) {
        okhttp3.CompressionInterceptor.DecompressionAlgorithm lookupDecompressor$okhttp;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (!okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return response;
        }
        okhttp3.ResponseBody body = response.body();
        java.lang.String header$default = okhttp3.Response.header$default(response, "Content-Encoding", null, 2, null);
        return (header$default == null || (lookupDecompressor$okhttp = lookupDecompressor$okhttp(header$default)) == null) ? response : response.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(okhttp3.ResponseBody.INSTANCE.create(okio.Okio.buffer(lookupDecompressor$okhttp.decompress(body.getGetHighResolutionOutputSizeshNQ4ISI())), body.getGetHighSpeedVideoFpsRangesFor(), -1L)).build();
    }

    public final okhttp3.CompressionInterceptor.DecompressionAlgorithm lookupDecompressor$okhttp(java.lang.String encoding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "");
        for (okhttp3.CompressionInterceptor.DecompressionAlgorithm decompressionAlgorithm : this.algorithms) {
            if (kotlin.text.StringsKt.equals(decompressionAlgorithm.getEncoding(), encoding, true)) {
                return decompressionAlgorithm;
            }
        }
        return null;
    }
}
