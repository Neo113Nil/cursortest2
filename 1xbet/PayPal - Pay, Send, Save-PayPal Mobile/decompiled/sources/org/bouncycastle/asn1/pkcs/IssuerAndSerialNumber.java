package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class IssuerAndSerialNumber extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x500.X500Name getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getCertificateSerialNumber() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber) {
            return (org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.X509Name x509Name, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x509.X509Name x509Name, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    private IssuerAndSerialNumber(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1);
    }
}
