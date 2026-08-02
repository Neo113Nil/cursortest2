package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class AttributeCertificateIssuer implements org.bouncycastle.util.Selector {
    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.cert.X509CertificateHolder)) {
            return false;
        }
        org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder = (org.bouncycastle.cert.X509CertificateHolder) obj;
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.x509.V2Form) {
            org.bouncycastle.asn1.x509.V2Form v2Form = (org.bouncycastle.asn1.x509.V2Form) aSN1Encodable;
            if (v2Form.getBaseCertificateID() != null) {
                return v2Form.getBaseCertificateID().getSerial().hasValue(x509CertificateHolder.getSerialNumber()) && getHighResolutionOutputSizeshNQ4ISI(x509CertificateHolder.getIssuer(), v2Form.getBaseCertificateID().getIssuer());
            }
            if (getHighResolutionOutputSizeshNQ4ISI(x509CertificateHolder.getSubject(), v2Form.getIssuerName())) {
                return true;
            }
        } else {
            if (getHighResolutionOutputSizeshNQ4ISI(x509CertificateHolder.getSubject(), (org.bouncycastle.asn1.x509.GeneralNames) aSN1Encodable)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public org.bouncycastle.asn1.x500.X500Name[] getNames() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.x509.GeneralName[] names = (aSN1Encodable instanceof org.bouncycastle.asn1.x509.V2Form ? ((org.bouncycastle.asn1.x509.V2Form) aSN1Encodable).getIssuerName() : (org.bouncycastle.asn1.x509.GeneralNames) aSN1Encodable).getNames();
        java.util.ArrayList arrayList = new java.util.ArrayList(names.length);
        for (int i = 0; i != names.length; i++) {
            if (names[i].getTagNo() == 4) {
                arrayList.add(org.bouncycastle.asn1.x500.X500Name.getInstance(names[i].getName()));
            }
        }
        return (org.bouncycastle.asn1.x500.X500Name[]) arrayList.toArray(new org.bouncycastle.asn1.x500.X500Name[arrayList.size()]);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.AttributeCertificateIssuer) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.cert.AttributeCertificateIssuer) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cert.AttributeCertificateIssuer(org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(this.getHighSpeedVideoFpsRangesFor));
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        for (int i = 0; i != names.length; i++) {
            org.bouncycastle.asn1.x509.GeneralName generalName = names[i];
            if (generalName.getTagNo() == 4 && org.bouncycastle.asn1.x500.X500Name.getInstance(generalName.getName()).equals(x500Name)) {
                return true;
            }
        }
        return false;
    }

    public AttributeCertificateIssuer(org.bouncycastle.asn1.x509.AttCertIssuer attCertIssuer) {
        this.getHighSpeedVideoFpsRangesFor = attCertIssuer.getIssuer();
    }

    public AttributeCertificateIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.V2Form(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x500Name)));
    }
}
