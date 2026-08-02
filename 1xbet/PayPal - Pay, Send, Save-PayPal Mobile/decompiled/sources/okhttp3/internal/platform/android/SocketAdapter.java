package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019À\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "", "isSupported", "()Z", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "matchesSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SocketAdapter {
    void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols);

    java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket);

    boolean isSupported();

    boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket);

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static javax.net.ssl.X509TrustManager trustManager(okhttp3.internal.platform.android.SocketAdapter socketAdapter, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLSocketFactory, "");
            return okhttp3.internal.platform.android.SocketAdapter.super.trustManager(sSLSocketFactory);
        }

        @java.lang.Deprecated
        public static boolean matchesSocketFactory(okhttp3.internal.platform.android.SocketAdapter socketAdapter, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLSocketFactory, "");
            return okhttp3.internal.platform.android.SocketAdapter.super.matchesSocketFactory(sSLSocketFactory);
        }
    }

    default javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        return null;
    }

    default boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        return false;
    }
}
