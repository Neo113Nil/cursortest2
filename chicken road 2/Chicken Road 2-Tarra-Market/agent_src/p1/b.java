package p1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements r1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f6424a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f6425b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f6425b = method;
        this.f6424a = x509TrustManager;
    }

    @Override // r1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f6425b.invoke(this.f6424a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw j1.d.a("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6424a.equals(bVar.f6424a) && this.f6425b.equals(bVar.f6425b);
    }

    public final int hashCode() {
        return (this.f6425b.hashCode() * 31) + this.f6424a.hashCode();
    }
}
