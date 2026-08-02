package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CertificatePair extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.Certificate certificate = this.getHighSpeedVideoFpsRangesFor;
        if (certificate != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, certificate));
        }
        org.bouncycastle.asn1.x509.Certificate certificate2 = this.getHighSpeedVideoFpsRanges;
        if (certificate2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(1, certificate2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.Certificate getReverse() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Certificate getForward() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.CertificatePair getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.CertificatePair)) {
            return (org.bouncycastle.asn1.x509.CertificatePair) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.CertificatePair((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public CertificatePair(org.bouncycastle.asn1.x509.Certificate certificate, org.bouncycastle.asn1.x509.Certificate certificate2) {
        this.getHighSpeedVideoFpsRangesFor = certificate;
        this.getHighSpeedVideoFpsRanges = certificate2;
    }

    private CertificatePair(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1TaggedObject, true);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
