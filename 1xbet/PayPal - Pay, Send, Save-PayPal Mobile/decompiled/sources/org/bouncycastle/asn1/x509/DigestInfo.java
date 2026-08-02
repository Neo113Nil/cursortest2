package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class DigestInfo extends org.bouncycastle.asn1.ASN1Object {
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getDigest() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.DigestInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.DigestInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.DigestInfo) {
            return (org.bouncycastle.asn1.x509.DigestInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.DigestInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DigestInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }

    public DigestInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement()).getOctets();
    }
}
