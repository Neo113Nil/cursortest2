package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pi extends com.facetec.sdk.pg {
    private final com.facetec.sdk.pm e;

    public pi(com.facetec.sdk.pm pmVar) {
        this.e = pmVar;
    }

    @Override // com.facetec.sdk.pg
    public final java.util.List<java.security.cert.Certificate> e(java.util.List<java.security.cert.Certificate> list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) arrayList.get(arrayList.size() - 1);
            java.security.cert.X509Certificate e = this.e.e(x509Certificate);
            if (e != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(e)) {
                    arrayList.add(e);
                }
                if (a(e, e)) {
                    return arrayList;
                }
                z = true;
            } else {
                java.util.Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) it.next();
                    if (a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(java.lang.String.valueOf(x509Certificate)));
                }
                return arrayList;
            }
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException("Certificate chain too long: ".concat(java.lang.String.valueOf(arrayList)));
    }

    private static boolean a(java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof com.facetec.sdk.pi) && ((com.facetec.sdk.pi) obj).e.equals(this.e);
    }
}
