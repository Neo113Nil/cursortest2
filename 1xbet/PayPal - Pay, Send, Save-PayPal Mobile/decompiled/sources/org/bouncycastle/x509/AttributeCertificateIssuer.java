package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class AttributeCertificateIssuer implements java.security.cert.CertSelector, org.bouncycastle.util.Selector {
    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // java.security.cert.CertSelector
    public boolean match(java.security.cert.Certificate certificate) {
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            return false;
        }
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.x509.V2Form) {
            org.bouncycastle.asn1.x509.V2Form v2Form = (org.bouncycastle.asn1.x509.V2Form) aSN1Encodable;
            if (v2Form.getBaseCertificateID() != null) {
                return v2Form.getBaseCertificateID().getSerial().hasValue(x509Certificate.getSerialNumber()) && getHighSpeedVideoFpsRanges(x509Certificate.getIssuerX500Principal(), v2Form.getBaseCertificateID().getIssuer());
            }
            if (getHighSpeedVideoFpsRanges(x509Certificate.getSubjectX500Principal(), v2Form.getIssuerName())) {
                return true;
            }
        } else {
            if (getHighSpeedVideoFpsRanges(x509Certificate.getSubjectX500Principal(), (org.bouncycastle.asn1.x509.GeneralNames) aSN1Encodable)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (obj instanceof java.security.cert.X509Certificate) {
            return match((java.security.cert.Certificate) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public java.security.Principal[] getPrincipals() {
        java.lang.Object[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != Camera2StreamConfigurationMap.length; i++) {
            java.lang.Object obj = Camera2StreamConfigurationMap[i];
            if (obj instanceof java.security.Principal) {
                arrayList.add(obj);
            }
        }
        return (java.security.Principal[]) arrayList.toArray(new java.security.Principal[arrayList.size()]);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.x509.AttributeCertificateIssuer) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.x509.AttributeCertificateIssuer) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.x509.AttributeCertificateIssuer(org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(this.getHighSpeedVideoFpsRangesFor));
    }

    private static boolean getHighSpeedVideoFpsRanges(javax.security.auth.x500.X500Principal x500Principal, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        for (int i = 0; i != names.length; i++) {
            org.bouncycastle.asn1.x509.GeneralName generalName = names[i];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new javax.security.auth.x500.X500Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (java.io.IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    private java.lang.Object[] Camera2StreamConfigurationMap() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.x509.GeneralName[] names = (aSN1Encodable instanceof org.bouncycastle.asn1.x509.V2Form ? ((org.bouncycastle.asn1.x509.V2Form) aSN1Encodable).getIssuerName() : (org.bouncycastle.asn1.x509.GeneralNames) aSN1Encodable).getNames();
        java.util.ArrayList arrayList = new java.util.ArrayList(names.length);
        for (int i = 0; i != names.length; i++) {
            if (names[i].getTagNo() == 4) {
                try {
                    arrayList.add(new javax.security.auth.x500.X500Principal(names[i].getName().toASN1Primitive().getEncoded()));
                } catch (java.io.IOException unused) {
                    throw new java.lang.RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new java.lang.Object[arrayList.size()]);
    }

    public AttributeCertificateIssuer(org.bouncycastle.jce.X509Principal x509Principal) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.V2Form(org.bouncycastle.asn1.x509.GeneralNames.getInstance(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.x509.GeneralName(x509Principal))));
    }

    public AttributeCertificateIssuer(org.bouncycastle.asn1.x509.AttCertIssuer attCertIssuer) {
        this.getHighSpeedVideoFpsRangesFor = attCertIssuer.getIssuer();
    }

    public AttributeCertificateIssuer(javax.security.auth.x500.X500Principal x500Principal) throws java.io.IOException {
        this(new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded()));
    }
}
