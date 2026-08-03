package Q1;

/* loaded from: classes.dex */
public final class h extends Q1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1623d;

    /* renamed from: c, reason: collision with root package name */
    public final java.security.Provider f1624c;

    static {
        boolean z2 = false;
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt$Version", false, Q1.f.class.getClassLoader());
            if (org.conscrypt.Conscrypt.isAvailable()) {
                if (Q1.f.a()) {
                    z2 = true;
                }
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        f1623d = z2;
    }

    public h() {
        java.security.Provider newProvider = org.conscrypt.Conscrypt.newProvider();
        kotlin.jvm.internal.i.d(newProvider, "newProvider()");
        this.f1624c = newProvider;
    }

    @Override // Q1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (!org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, protocols);
            return;
        }
        org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
        java.lang.Object[] array = m0.j.c(protocols).toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) array);
    }

    @Override // Q1.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // Q1.n
    public final javax.net.ssl.SSLContext k() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.f1624c);
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Q1.n
    public final javax.net.ssl.SSLSocketFactory l(javax.net.ssl.X509TrustManager x509TrustManager) {
        javax.net.ssl.SSLContext k2 = k();
        k2.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
        javax.net.ssl.SSLSocketFactory socketFactory = k2.getSocketFactory();
        kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Q1.n
    public final javax.net.ssl.X509TrustManager m() {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                if (trustManager == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                org.conscrypt.Conscrypt.setHostnameVerifier(x509TrustManager, Q1.g.f1622a);
                return x509TrustManager;
            }
        }
        java.lang.String arrays = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
