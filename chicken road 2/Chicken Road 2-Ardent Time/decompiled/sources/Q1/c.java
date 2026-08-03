package Q1;

/* loaded from: classes.dex */
public final class c extends Q1.n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1617e;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f1618c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.i f1619d;

    static {
        boolean z2 = false;
        if (m0.j.k() && android.os.Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f1617e = z2;
    }

    public c() {
        R1.o oVar;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3 = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            java.lang.Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            java.lang.Class.forName(kotlin.jvm.internal.i.h(".SSLParametersImpl", "com.android.org.conscrypt"));
            oVar = new R1.o(cls);
        } catch (java.lang.Exception e2) {
            Q1.n.f1644a.getClass();
            Q1.n.i("unable to load android socket classes", 5, e2);
            oVar = null;
        }
        java.util.ArrayList I2 = i1.AbstractC0191j.I(oVar, new R1.m(R1.f.f1693f), new R1.m(R1.k.f1703a), new R1.m(R1.h.f1699a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = I2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((R1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f1618c = arrayList;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("dalvik.system.CloseGuard");
            java.lang.reflect.Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", java.lang.String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (java.lang.Exception unused) {
            method = null;
            method2 = null;
        }
        this.f1619d = new R1.i(method3, method2, method);
    }

    @Override // Q1.n
    public final Q1.l b(javax.net.ssl.X509TrustManager x509TrustManager) {
        android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
        } catch (java.lang.IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        R1.b bVar = x509TrustManagerExtensions != null ? new R1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? new U1.a(c(x509TrustManager)) : bVar;
    }

    @Override // Q1.n
    public final U1.d c(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            java.lang.reflect.Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new Q1.b(x509TrustManager, declaredMethod);
        } catch (java.lang.NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // Q1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        java.util.Iterator it = this.f1618c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((R1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        R1.n nVar = (R1.n) obj;
        if (nVar == null) {
            return;
        }
        nVar.d(sSLSocket, str, protocols);
    }

    @Override // Q1.n
    public final void e(java.net.Socket socket, java.net.InetSocketAddress address, int i2) {
        kotlin.jvm.internal.i.e(address, "address");
        try {
            socket.connect(address, i2);
        } catch (java.lang.ClassCastException e2) {
            if (android.os.Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new java.io.IOException("Exception in connect", e2);
        }
    }

    @Override // Q1.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Object obj;
        java.util.Iterator it = this.f1618c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((R1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        R1.n nVar = (R1.n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // Q1.n
    public final java.lang.Object g() {
        R1.i iVar = this.f1619d;
        iVar.getClass();
        java.lang.reflect.Method method = iVar.f1700a;
        if (method == null) {
            return null;
        }
        try {
            java.lang.Object invoke = method.invoke(null, null);
            java.lang.reflect.Method method2 = iVar.f1701b;
            kotlin.jvm.internal.i.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // Q1.n
    public final boolean h(java.lang.String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // Q1.n
    public final void j(java.lang.Object obj, java.lang.String message) {
        kotlin.jvm.internal.i.e(message, "message");
        R1.i iVar = this.f1619d;
        iVar.getClass();
        if (obj != null) {
            try {
                java.lang.reflect.Method method = iVar.f1702c;
                kotlin.jvm.internal.i.b(method);
                method.invoke(obj, null);
                return;
            } catch (java.lang.Exception unused) {
            }
        }
        Q1.n.i(message, 5, null);
    }
}
