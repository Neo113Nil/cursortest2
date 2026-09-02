package i1;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final B f1361a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1362b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1363c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1364d;

    public k(B b2, f fVar, List list, List list2) {
        this.f1361a = b2;
        this.f1362b = fVar;
        this.f1363c = list;
        this.f1364d = list2;
    }

    public static k a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        f a2 = f.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        B a3 = B.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List k2 = certificateArr != null ? j1.d.k(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new k(a3, a2, k2, localCertificates != null ? j1.d.k(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1361a.equals(kVar.f1361a) && this.f1362b.equals(kVar.f1362b) && this.f1363c.equals(kVar.f1363c) && this.f1364d.equals(kVar.f1364d);
    }

    public final int hashCode() {
        return this.f1364d.hashCode() + ((this.f1363c.hashCode() + ((this.f1362b.hashCode() + ((this.f1361a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
