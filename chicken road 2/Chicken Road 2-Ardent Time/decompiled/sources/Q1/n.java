package Q1;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Q1.n f1644a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.logging.Logger f1645b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r3) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    static {
        Q1.n kVar;
        Q1.n nVar;
        if (m0.j.k()) {
            for (java.util.Map.Entry entry : R1.c.f1691b.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
                if (R1.c.f1690a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(android.util.Log.isLoggable(str2, 3) ? java.util.logging.Level.FINE : android.util.Log.isLoggable(str2, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING);
                    logger.addHandler(R1.d.f1692a);
                }
            }
            nVar = Q1.a.f1613d ? new Q1.a() : null;
            if (nVar == null) {
                r2 = Q1.c.f1617e ? new Q1.c() : null;
                kotlin.jvm.internal.i.b(r2);
                nVar = r2;
            }
        } else {
            if ("Conscrypt".equals(java.security.Security.getProviders()[0].getName())) {
                kVar = Q1.h.f1623d ? new Q1.h() : null;
            }
            if ("BC".equals(java.security.Security.getProviders()[0].getName())) {
                kVar = Q1.e.f1620d ? new Q1.e() : null;
            }
            if ("OpenJSSE".equals(java.security.Security.getProviders()[0].getName())) {
                kVar = Q1.m.f1642d ? new Q1.m() : null;
            }
            kVar = Q1.k.f1633c ? new Q1.k() : null;
            if (kVar == null) {
                java.lang.String jvmVersion = java.lang.System.getProperty("java.specification.version", io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                try {
                    kotlin.jvm.internal.i.d(jvmVersion, "jvmVersion");
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            nVar = kVar;
        }
        f1644a = nVar;
        f1645b = java.util.logging.Logger.getLogger(I1.s.class.getName());
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            java.lang.Class<?> cls2 = java.lang.Class.forName(kotlin.jvm.internal.i.h("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            java.lang.Class<?> clientProviderClass = java.lang.Class.forName(kotlin.jvm.internal.i.h("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            java.lang.Class<?> serverProviderClass = java.lang.Class.forName(kotlin.jvm.internal.i.h("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            java.lang.reflect.Method putMethod = cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2);
            java.lang.reflect.Method getMethod = cls.getMethod("get", javax.net.ssl.SSLSocket.class);
            java.lang.reflect.Method removeMethod = cls.getMethod("remove", javax.net.ssl.SSLSocket.class);
            kotlin.jvm.internal.i.d(putMethod, "putMethod");
            kotlin.jvm.internal.i.d(getMethod, "getMethod");
            kotlin.jvm.internal.i.d(removeMethod, "removeMethod");
            kotlin.jvm.internal.i.d(clientProviderClass, "clientProviderClass");
            kotlin.jvm.internal.i.d(serverProviderClass, "serverProviderClass");
            r2 = new Q1.j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
        }
        if (r2 == null) {
            nVar = new Q1.n();
            f1644a = nVar;
            f1645b = java.util.logging.Logger.getLogger(I1.s.class.getName());
        }
        nVar = r2;
        f1644a = nVar;
        f1645b = java.util.logging.Logger.getLogger(I1.s.class.getName());
        if (r2 == null) {
        }
        nVar = r2;
        f1644a = nVar;
        f1645b = java.util.logging.Logger.getLogger(I1.s.class.getName());
    }

    public static void i(java.lang.String message, int i2, java.lang.Throwable th) {
        kotlin.jvm.internal.i.e(message, "message");
        f1645b.log(i2 == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, message, th);
    }

    public Q1.l b(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new U1.a(c(x509TrustManager));
    }

    public U1.d c(javax.net.ssl.X509TrustManager x509TrustManager) {
        java.security.cert.X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new U1.b((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
    }

    public void e(java.net.Socket socket, java.net.InetSocketAddress address, int i2) {
        kotlin.jvm.internal.i.e(address, "address");
        socket.connect(address, i2);
    }

    public java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public java.lang.Object g() {
        if (f1645b.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(java.lang.String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return true;
    }

    public void j(java.lang.Object obj, java.lang.String message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (obj == null) {
            message = kotlin.jvm.internal.i.h(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        i(message, 5, (java.lang.Throwable) obj);
    }

    public javax.net.ssl.SSLContext k() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public javax.net.ssl.SSLSocketFactory l(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            javax.net.ssl.SSLContext k2 = k();
            k2.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = k2.getSocketFactory();
            kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e2) {
            throw new java.lang.AssertionError(kotlin.jvm.internal.i.h(e2, "No System TLS: "), e2);
        }
    }

    public javax.net.ssl.X509TrustManager m() {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
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

    public final java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public void a(javax.net.ssl.SSLSocket sSLSocket) {
    }
}
