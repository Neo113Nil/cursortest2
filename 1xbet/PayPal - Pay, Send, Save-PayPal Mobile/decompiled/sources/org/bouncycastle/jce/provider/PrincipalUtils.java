package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class PrincipalUtils {
    static org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap(java.security.cert.TrustAnchor trustAnchor) {
        if (trustAnchor == null) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(trustAnchor.getCA()));
        if (x500Name != null) {
            return x500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal == null) {
            throw new java.lang.IllegalStateException();
        }
        byte[] encoded = x500Principal.getEncoded();
        if (encoded != null) {
            return encoded;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizes(java.lang.Object obj) {
        if (!(obj instanceof java.security.cert.X509Certificate)) {
            org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI((javax.security.auth.x500.X500Principal) ((org.bouncycastle.x509.X509AttributeCertificate) obj).getIssuer().getPrincipals()[0]));
            if (x500Name != null) {
                return x500Name;
            }
            throw new java.lang.IllegalStateException();
        }
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
        if (x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate) {
            org.bouncycastle.asn1.x500.X500Name issuerX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getIssuerX500Name();
            if (issuerX500Name != null) {
                return issuerX500Name;
            }
            throw new java.lang.IllegalStateException();
        }
        if (x509Certificate == 0) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name2 = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(x509Certificate.getIssuerX500Principal()));
        if (x500Name2 != null) {
            return x500Name2;
        }
        throw new java.lang.IllegalStateException();
    }

    static org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509CRL x509crl) {
        if (x509crl == null) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(x509crl.getIssuerX500Principal()));
        if (x500Name != null) {
            return x500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) {
        if (x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate) {
            org.bouncycastle.asn1.x500.X500Name issuerX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getIssuerX500Name();
            if (issuerX500Name != null) {
                return issuerX500Name;
            }
            throw new java.lang.IllegalStateException();
        }
        if (x509Certificate == 0) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(x509Certificate.getIssuerX500Principal()));
        if (x500Name != null) {
            return x500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRanges(java.security.cert.X509Certificate x509Certificate) {
        if (x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate) {
            org.bouncycastle.asn1.x500.X500Name subjectX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getSubjectX500Name();
            if (subjectX500Name != null) {
                return subjectX500Name;
            }
            throw new java.lang.IllegalStateException();
        }
        if (x509Certificate == 0) {
            throw new java.lang.IllegalStateException();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(x509Certificate.getSubjectX500Principal()));
        if (x500Name != null) {
            return x500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    static org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizes(javax.security.auth.x500.X500Principal x500Principal) {
        org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(getHighResolutionOutputSizeshNQ4ISI(x500Principal));
        if (x500Name != null) {
            return x500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    PrincipalUtils() {
    }
}
