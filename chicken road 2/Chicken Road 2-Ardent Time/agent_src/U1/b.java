package U1;

/* loaded from: classes.dex */
public final class b implements U1.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f1741a;

    public b(java.security.cert.X509Certificate... caCerts) {
        kotlin.jvm.internal.i.e(caCerts, "caCerts");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int length = caCerts.length;
        int i2 = 0;
        while (i2 < length) {
            java.security.cert.X509Certificate x509Certificate = caCerts[i2];
            i2++;
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            kotlin.jvm.internal.i.d(subjectX500Principal, "caCert.subjectX500Principal");
            java.lang.Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new java.util.LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((java.util.Set) obj).add(x509Certificate);
        }
        this.f1741a = linkedHashMap;
    }

    @Override // U1.d
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate cert) {
        kotlin.jvm.internal.i.e(cert, "cert");
        java.util.Set set = (java.util.Set) this.f1741a.get(cert.getIssuerX500Principal());
        java.lang.Object obj = null;
        if (set == null) {
            return null;
        }
        java.util.Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            try {
                cert.verify(((java.security.cert.X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        return (java.security.cert.X509Certificate) obj;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof U1.b) && kotlin.jvm.internal.i.a(((U1.b) obj).f1741a, this.f1741a));
    }

    public final int hashCode() {
        return this.f1741a.hashCode();
    }
}
