package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX500NameUtil {
    /* JADX WARN: Multi-variable type inference failed */
    public static org.bouncycastle.asn1.x500.X500Name getIssuer(java.security.cert.X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate)) {
            return getX500Name(x509Certificate.getIssuerX500Principal());
        }
        org.bouncycastle.asn1.x500.X500Name issuerX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getIssuerX500Name();
        if (issuerX500Name != null) {
            return issuerX500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.bouncycastle.asn1.x500.X500Name getIssuer(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, java.security.cert.X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate)) {
            return getX500Name(x500NameStyle, x509Certificate.getIssuerX500Principal());
        }
        org.bouncycastle.asn1.x500.X500Name issuerX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getIssuerX500Name();
        if (issuerX500Name != null) {
            return org.bouncycastle.asn1.x500.X500Name.getInstance(x500NameStyle, issuerX500Name);
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.bouncycastle.asn1.x500.X500Name getSubject(java.security.cert.X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate)) {
            return getX500Name(x509Certificate.getSubjectX500Principal());
        }
        org.bouncycastle.asn1.x500.X500Name subjectX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getSubjectX500Name();
        if (subjectX500Name != null) {
            return subjectX500Name;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static org.bouncycastle.asn1.x500.X500Name getSubject(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, java.security.cert.X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof org.bouncycastle.jcajce.interfaces.BCX509Certificate)) {
            return getX500Name(x500NameStyle, x509Certificate.getSubjectX500Principal());
        }
        org.bouncycastle.asn1.x500.X500Name subjectX500Name = ((org.bouncycastle.jcajce.interfaces.BCX509Certificate) x509Certificate).getSubjectX500Name();
        if (subjectX500Name != null) {
            return org.bouncycastle.asn1.x500.X500Name.getInstance(x500NameStyle, subjectX500Name);
        }
        throw new java.lang.IllegalStateException();
    }

    public static org.bouncycastle.asn1.x500.X500Name getX500Name(javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal != null) {
            return org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded());
        }
        throw new java.lang.IllegalStateException();
    }

    public static org.bouncycastle.asn1.x500.X500Name getX500Name(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal != null) {
            return org.bouncycastle.asn1.x500.X500Name.getInstance(x500NameStyle, x500Principal.getEncoded());
        }
        throw new java.lang.IllegalStateException();
    }
}
