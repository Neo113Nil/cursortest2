package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class IssuerAndSerialNumber extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x500.X500Name getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.IssuerAndSerialNumber getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.IssuerAndSerialNumber) {
            return (org.bouncycastle.asn1.cms.IssuerAndSerialNumber) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.X509Name x509Name, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name);
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.X509Name x509Name, java.math.BigInteger bigInteger) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.X509CertificateStructure x509CertificateStructure) {
        this.Camera2StreamConfigurationMap = x509CertificateStructure.getIssuer();
        this.getHighSpeedVideoFpsRanges = x509CertificateStructure.getSerialNumber();
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.Certificate certificate) {
        this.Camera2StreamConfigurationMap = certificate.getIssuer();
        this.getHighSpeedVideoFpsRanges = certificate.getSerialNumber();
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this.Camera2StreamConfigurationMap = x500Name;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1);
    }
}
