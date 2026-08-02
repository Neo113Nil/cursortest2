package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class OtherCertID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.x509.IssuerSerial issuerSerial = this.getHighSpeedVideoFpsRangesFor;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getIssuerSerial() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getCertHash() {
        return this.getHighSpeedVideoSizes.toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1OctetString ? ((org.bouncycastle.asn1.ASN1OctetString) this.getHighSpeedVideoSizes.toASN1Primitive()).getOctets() : org.bouncycastle.asn1.x509.DigestInfo.getInstance(this.getHighSpeedVideoSizes).getDigest();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmHash() {
        return this.getHighSpeedVideoSizes.toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1OctetString ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1) : org.bouncycastle.asn1.x509.DigestInfo.getInstance(this.getHighSpeedVideoSizes).getAlgorithmId();
    }

    public static org.bouncycastle.asn1.ess.OtherCertID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.OtherCertID) {
            return (org.bouncycastle.asn1.ess.OtherCertID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.OtherCertID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OtherCertID(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.DigestInfo(algorithmIdentifier, bArr);
        this.getHighSpeedVideoFpsRangesFor = issuerSerial;
    }

    public OtherCertID(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.DigestInfo(algorithmIdentifier, bArr);
    }

    private OtherCertID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        boolean z = aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1OctetString;
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoSizes = z ? org.bouncycastle.asn1.ASN1OctetString.getInstance(objectAt) : org.bouncycastle.asn1.x509.DigestInfo.getInstance(objectAt);
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
