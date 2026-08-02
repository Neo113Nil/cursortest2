package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Android10SocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.Android10SocketAdapter.Companion INSTANCE = new okhttp3.internal.platform.android.Android10SocketAdapter.Companion(null);

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* bridge */ boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* bridge */ javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        return android.net.ssl.SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return INSTANCE.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        try {
            java.lang.String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        try {
            android.net.ssl.SSLSockets.setUseSessionTickets(sslSocket, true);
            javax.net.ssl.SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((java.lang.String[]) okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new java.lang.String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.IOException("Android internal error", e);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/android/SocketAdapter;", "buildIfSupported", "()Lokhttp3/internal/platform/android/SocketAdapter;", "", "isSupported", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported() {
            if (isSupported()) {
                return new okhttp3.internal.platform.android.Android10SocketAdapter();
            }
            return null;
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.Platform.INSTANCE.isAndroid() && android.os.Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
