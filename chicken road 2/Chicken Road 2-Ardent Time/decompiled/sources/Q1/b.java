package Q1;

/* loaded from: classes.dex */
public final class b implements U1.d {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f1615a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f1616b;

    public b(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
        this.f1615a = x509TrustManager;
        this.f1616b = method;
    }

    @Override // U1.d
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate cert) {
        kotlin.jvm.internal.i.e(cert, "cert");
        try {
            java.lang.Object invoke = this.f1616b.invoke(this.f1615a, cert);
            if (invoke != null) {
                return ((java.security.cert.TrustAnchor) invoke).getTrustedCert();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError("unable to get issues and signature", e2);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1.b)) {
            return false;
        }
        Q1.b bVar = (Q1.b) obj;
        return kotlin.jvm.internal.i.a(this.f1615a, bVar.f1615a) && kotlin.jvm.internal.i.a(this.f1616b, bVar.f1616b);
    }

    public final int hashCode() {
        return this.f1616b.hashCode() + (this.f1615a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1615a + ", findByIssuerAndSignatureMethod=" + this.f1616b + ')';
    }
}
