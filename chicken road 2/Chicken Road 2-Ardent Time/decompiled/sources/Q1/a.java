package Q1;

/* loaded from: classes.dex */
public final class a extends Q1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1613d;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f1614c;

    static {
        f1613d = m0.j.k() && android.os.Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        java.util.ArrayList I2 = i1.AbstractC0191j.I((!m0.j.k() || android.os.Build.VERSION.SDK_INT < 29) ? null : new R1.a(), new R1.m(R1.f.f1693f), new R1.m(R1.k.f1703a), new R1.m(R1.h.f1699a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = I2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((R1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f1614c = arrayList;
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
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        java.util.Iterator it = this.f1614c.iterator();
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
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Object obj;
        java.util.Iterator it = this.f1614c.iterator();
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
    public final boolean h(java.lang.String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
