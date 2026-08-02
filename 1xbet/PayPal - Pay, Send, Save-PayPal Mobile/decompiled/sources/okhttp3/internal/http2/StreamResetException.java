package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "<init>", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lokhttp3/internal/http2/ErrorCode;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamResetException extends java.io.IOException {
    public final okhttp3.internal.http2.ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(okhttp3.internal.http2.ErrorCode errorCode) {
        super("stream was reset: ".concat(java.lang.String.valueOf(errorCode)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        this.errorCode = errorCode;
    }
}
