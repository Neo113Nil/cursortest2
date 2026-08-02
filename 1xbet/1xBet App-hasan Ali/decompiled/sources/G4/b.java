package G4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements K4.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1986a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1987b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f1986a = x509TrustManager;
        this.f1987b = method;
    }

    @Override // K4.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f1987b.invoke(this.f1986a, x509Certificate);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.security.cert.TrustAnchor", invoke);
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f1986a, bVar.f1986a) && kotlin.jvm.internal.l.a(this.f1987b, bVar.f1987b);
    }

    public final int hashCode() {
        return this.f1987b.hashCode() + (this.f1986a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1986a + ", findByIssuerAndSignatureMethod=" + this.f1987b + ')';
    }
}
