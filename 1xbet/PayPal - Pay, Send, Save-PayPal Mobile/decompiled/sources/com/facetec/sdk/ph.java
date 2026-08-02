package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ph implements com.facetec.sdk.pm {
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> c = new java.util.LinkedHashMap();

    public ph(java.security.cert.X509Certificate... x509CertificateArr) {
        for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            java.util.Set<java.security.cert.X509Certificate> set = this.c.get(subjectX500Principal);
            if (set == null) {
                set = new java.util.LinkedHashSet<>(1);
                this.c.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // com.facetec.sdk.pm
    public final java.security.cert.X509Certificate e(java.security.cert.X509Certificate x509Certificate) {
        java.util.Set<java.security.cert.X509Certificate> set = this.c.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (java.security.cert.X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof com.facetec.sdk.ph) && ((com.facetec.sdk.ph) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
