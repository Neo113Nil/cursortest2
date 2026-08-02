package y4;

import i4.InterfaceC2015a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import x0.J;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final D f21356a;

    /* renamed from: b, reason: collision with root package name */
    public final h f21357b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21358c;

    /* renamed from: d, reason: collision with root package name */
    public final W3.m f21359d;

    public l(D d5, h hVar, List list, InterfaceC2015a interfaceC2015a) {
        this.f21356a = d5;
        this.f21357b = hVar;
        this.f21358c = list;
        this.f21359d = G4.d.E(new J(interfaceC2015a));
    }

    public final List a() {
        return (List) this.f21359d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f21356a == this.f21356a && kotlin.jvm.internal.l.a(lVar.f21357b, this.f21357b) && kotlin.jvm.internal.l.a(lVar.a(), a()) && kotlin.jvm.internal.l.a(lVar.f21358c, this.f21358c);
    }

    public final int hashCode() {
        return this.f21358c.hashCode() + ((a().hashCode() + ((this.f21357b.hashCode() + ((this.f21356a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a5 = a();
        ArrayList arrayList = new ArrayList(X3.o.S(a5, 10));
        for (Certificate certificate : a5) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.l.e("type", type2);
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f21356a);
        sb.append(" cipherSuite=");
        sb.append(this.f21357b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f21358c;
        ArrayList arrayList2 = new ArrayList(X3.o.S(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.l.e("type", type);
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
