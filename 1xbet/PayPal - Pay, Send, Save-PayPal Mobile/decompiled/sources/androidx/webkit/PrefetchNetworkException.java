package androidx.webkit;

/* loaded from: classes7.dex */
public class PrefetchNetworkException extends androidx.webkit.PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(java.lang.String str) {
        this(str, 0);
    }

    public PrefetchNetworkException(java.lang.String str, int i) {
        super(str);
        this.httpResponseStatusCode = i;
    }

    public PrefetchNetworkException(int i) {
        this.httpResponseStatusCode = i;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
