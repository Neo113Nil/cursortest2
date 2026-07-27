package d5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements h5.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5487a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5488b;

    public b(X509TrustManager trustManager, Method method) {
        i.e(trustManager, "trustManager");
        this.f5487a = trustManager;
        this.f5488b = method;
    }

    @Override // h5.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f5488b.invoke(this.f5487a, x509Certificate);
            i.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return i.a(this.f5487a, bVar.f5487a) && i.a(this.f5488b, bVar.f5488b);
    }

    public final int hashCode() {
        return this.f5488b.hashCode() + (this.f5487a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f5487a + ", findByIssuerAndSignatureMethod=" + this.f5488b + ')';
    }
}
