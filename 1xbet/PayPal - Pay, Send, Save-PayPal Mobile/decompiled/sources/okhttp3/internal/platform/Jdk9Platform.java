package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public class Jdk9Platform extends okhttp3.internal.platform.Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Jdk9Platform.Companion INSTANCE = new okhttp3.internal.platform.Jdk9Platform.Companion(0 == true ? 1 : 0);
    private static final boolean isAvailable;
    private static final java.lang.Integer majorVersion;

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        javax.net.ssl.SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((java.lang.String[]) okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new java.lang.String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
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

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        throw new java.lang.UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 8 (>= 252) or JDK 9+");
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext newSSLContext() {
        javax.net.ssl.SSLContext sSLContext;
        java.lang.Integer num = majorVersion;
        if (num != null && num.intValue() >= 9) {
            javax.net.ssl.SSLContext sSLContext2 = javax.net.ssl.SSLContext.getInstance("TLS");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext2, "");
            return sSLContext2;
        }
        try {
            sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.3");
        } catch (java.security.NoSuchAlgorithmException unused) {
            sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(sSLContext);
        return sSLContext;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Jdk9Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Jdk9Platform;", "", "isAvailable", "Z", "()Z", "", "majorVersion", "Ljava/lang/Integer;", "getMajorVersion", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isAvailable() {
            return okhttp3.internal.platform.Jdk9Platform.isAvailable;
        }

        public final java.lang.Integer getMajorVersion() {
            return okhttp3.internal.platform.Jdk9Platform.majorVersion;
        }

        public final okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new okhttp3.internal.platform.Jdk9Platform();
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1.intValue() < 9) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        java.lang.Integer intOrNull = property != null ? kotlin.text.StringsKt.toIntOrNull(property) : null;
        majorVersion = intOrNull;
        boolean z = false;
        if (intOrNull == null) {
            try {
                javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        z = true;
        isAvailable = z;
    }
}
