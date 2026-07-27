package e5;

import a.AbstractC0169a;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0169a {

    /* renamed from: g, reason: collision with root package name */
    public final X509TrustManager f5528g;

    /* renamed from: h, reason: collision with root package name */
    public final X509TrustManagerExtensions f5529h;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.i.e(trustManager, "trustManager");
        this.f5528g = trustManager;
        this.f5529h = x509TrustManagerExtensions;
    }

    @Override // a.AbstractC0169a
    public final List c(String hostname, List chain) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f5529h.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.i.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f5528g == this.f5528g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5528g);
    }
}
