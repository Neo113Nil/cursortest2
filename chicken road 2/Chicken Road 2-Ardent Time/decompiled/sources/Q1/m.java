package Q1;

/* loaded from: classes.dex */
public final class m extends Q1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1642d;

    /* renamed from: c, reason: collision with root package name */
    public final java.security.Provider f1643c = new org.openjsse.net.ssl.OpenJSSE();

    static {
        boolean z2 = false;
        try {
            java.lang.Class.forName("org.openjsse.net.ssl.OpenJSSE", false, Q1.l.class.getClassLoader());
            z2 = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        f1642d = z2;
    }

    @Override // Q1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        super.d(sSLSocket, str, protocols);
    }

    @Override // Q1.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    @Override // Q1.n
    public final javax.net.ssl.SSLContext k() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.3", this.f1643c);
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Q1.n
    public final javax.net.ssl.X509TrustManager m() {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm(), this.f1643c);
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                if (trustManager != null) {
                    return (javax.net.ssl.X509TrustManager) trustManager;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        java.lang.String arrays = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
