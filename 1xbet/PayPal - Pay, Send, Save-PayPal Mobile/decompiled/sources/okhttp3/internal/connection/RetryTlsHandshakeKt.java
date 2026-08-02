package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/IOException;", "Lokio/getHighSpeedVideoSizes;", "e", "", "retryTlsHandshake", "(Ljava/io/IOException;)Z"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryTlsHandshakeKt {
    public static final boolean retryTlsHandshake(java.io.IOException iOException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
        if ((iOException instanceof java.net.ProtocolException) || (iOException instanceof java.io.InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof javax.net.ssl.SSLHandshakeException) && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException) || !(iOException instanceof javax.net.ssl.SSLException)) ? false : true;
    }
}
