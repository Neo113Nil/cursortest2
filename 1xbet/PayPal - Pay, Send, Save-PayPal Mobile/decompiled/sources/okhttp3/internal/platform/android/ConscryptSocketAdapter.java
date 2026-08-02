package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConscryptSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion INSTANCE;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory;
    private static final boolean isSupported;

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
        return org.conscrypt.Conscrypt.isConscrypt(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return isSupported;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        if (matchesSocket(sslSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        if (matchesSocket(sslSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sslSocket, true);
            org.conscrypt.Conscrypt.setApplicationProtocols(sslSocket, (java.lang.String[]) okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new java.lang.String[0]));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", "", "<init>", "()V", "", "major", "minor", "patch", "", "atLeastVersion", "(III)Z", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "factory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "isSupported", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getFactory() {
            return okhttp3.internal.platform.android.ConscryptSocketAdapter.factory;
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.android.ConscryptSocketAdapter.isSupported;
        }

        public static /* synthetic */ boolean atLeastVersion$default(okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion companion, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return companion.atLeastVersion(i, i2, i3);
        }

        public final boolean atLeastVersion(int major, int minor, int patch) {
            org.conscrypt.Conscrypt.Version version = org.conscrypt.Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != major ? version.major() > major : version.minor() != minor ? version.minor() > minor : version.patch() >= patch;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion companion = new okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion(null);
        INSTANCE = companion;
        factory = new okhttp3.internal.platform.android.DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public final boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
                return okhttp3.internal.platform.android.ConscryptSocketAdapter.INSTANCE.isSupported() && org.conscrypt.Conscrypt.isConscrypt(sslSocket);
            }

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public final okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket sslSocket) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
                return new okhttp3.internal.platform.android.ConscryptSocketAdapter();
            }
        };
        boolean z = false;
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (org.conscrypt.Conscrypt.isAvailable()) {
                if (companion.atLeastVersion(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        isSupported = z;
    }
}
