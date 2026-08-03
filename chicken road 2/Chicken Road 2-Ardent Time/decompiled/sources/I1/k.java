package I1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final I1.B f746a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.g f747b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f748c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.C0175g f749d;

    public k(I1.B b2, I1.g gVar, java.util.List list, s1.InterfaceC0991a interfaceC0991a) {
        this.f746a = b2;
        this.f747b = gVar;
        this.f748c = list;
        this.f749d = Q1.l.q(new F.U(interfaceC0991a));
    }

    public final java.util.List a() {
        return (java.util.List) this.f749d.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.k) {
            I1.k kVar = (I1.k) obj;
            if (kVar.f746a == this.f746a && kotlin.jvm.internal.i.a(kVar.f747b, this.f747b) && kotlin.jvm.internal.i.a(kVar.a(), a()) && kotlin.jvm.internal.i.a(kVar.f748c, this.f748c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f748c.hashCode() + ((a().hashCode() + ((this.f747b.hashCode() + ((this.f746a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String type;
        java.lang.String type2;
        java.util.List<java.security.cert.Certificate> a2 = a();
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(a2));
        for (java.security.cert.Certificate certificate : a2) {
            if (certificate instanceof java.security.cert.X509Certificate) {
                type2 = ((java.security.cert.X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "type");
            }
            arrayList.add(type2);
        }
        java.lang.String obj = arrayList.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f746a);
        sb.append(" cipherSuite=");
        sb.append(this.f747b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        java.util.List<java.security.cert.Certificate> list = this.f748c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(list));
        for (java.security.cert.Certificate certificate2 : list) {
            if (certificate2 instanceof java.security.cert.X509Certificate) {
                type = ((java.security.cert.X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
