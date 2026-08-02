package okhttp3.internal.http1;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "", "getHighSpeedVideoFpsRanges", "J", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeadersReader {
    private long getHighSpeedVideoFpsRanges;
    private final okio.BufferedSource source;

    public HeadersReader(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        this.source = bufferedSource;
        this.getHighSpeedVideoFpsRanges = 262144L;
    }

    public final okio.BufferedSource getSource() {
        return this.source;
    }

    public final java.lang.String readLine() {
        java.lang.String readUtf8LineStrict = this.source.readUtf8LineStrict(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    public final okhttp3.Headers readHeaders() {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        while (true) {
            java.lang.String readLine = readLine();
            if (readLine.length() != 0) {
                builder.addLenient$okhttp(readLine);
            } else {
                return builder.build();
            }
        }
    }
}
