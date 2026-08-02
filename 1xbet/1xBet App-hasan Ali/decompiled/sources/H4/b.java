package H4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class b extends AbstractC2425d {

    /* renamed from: k, reason: collision with root package name */
    public final X509TrustManager f2365k;

    /* renamed from: l, reason: collision with root package name */
    public final X509TrustManagerExtensions f2366l;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f2365k = x509TrustManager;
        this.f2366l = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2365k == this.f2365k;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2365k);
    }

    @Override // t3.AbstractC2425d
    public final List n(String str, List list) {
        kotlin.jvm.internal.l.f("chain", list);
        kotlin.jvm.internal.l.f("hostname", str);
        try {
            List<X509Certificate> checkServerTrusted = this.f2366l.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            kotlin.jvm.internal.l.e("x509TrustManagerExtensio…ficates, \"RSA\", hostname)", checkServerTrusted);
            return checkServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }
}
