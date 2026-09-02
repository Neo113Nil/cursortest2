package U1;

/* loaded from: classes.dex */
public final class a extends Q1.l {

    /* renamed from: i, reason: collision with root package name */
    public final U1.d f1740i;

    public a(U1.d trustRootIndex) {
        kotlin.jvm.internal.i.e(trustRootIndex, "trustRootIndex");
        this.f1740i = trustRootIndex;
    }

    @Override // Q1.l
    public final java.util.List e(java.lang.String hostname, java.util.List chain) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(chain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object removeFirst = arrayDeque.removeFirst();
        kotlin.jvm.internal.i.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < 9) {
            i2++;
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) arrayList.get(arrayList.size() - 1);
            java.security.cert.X509Certificate a2 = this.f1740i.a(x509Certificate);
            if (a2 == null) {
                java.util.Iterator it = arrayDeque.iterator();
                kotlin.jvm.internal.i.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) next;
                    if (kotlin.jvm.internal.i.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (java.security.GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new javax.net.ssl.SSLPeerUnverifiedException(kotlin.jvm.internal.i.h(x509Certificate, "Failed to find a trusted cert that signed "));
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                arrayList.add(a2);
            }
            if (kotlin.jvm.internal.i.a(a2.getIssuerDN(), a2.getSubjectDN())) {
                try {
                    a2.verify(a2.getPublicKey());
                    return arrayList;
                } catch (java.security.GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException(kotlin.jvm.internal.i.h(arrayList, "Certificate chain too long: "));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof U1.a) && kotlin.jvm.internal.i.a(((U1.a) obj).f1740i, this.f1740i);
    }

    public final int hashCode() {
        return this.f1740i.hashCode();
    }
}
