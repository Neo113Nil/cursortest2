package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class SubjectPublicKeyInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Primitive parsePublicKey() throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(this.getHighSpeedVideoSizes.getOctets());
    }

    public org.bouncycastle.asn1.ASN1BitString getPublicKeyData() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Primitive getPublicKey() throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(this.getHighSpeedVideoSizes.getOctets());
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) {
            return (org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SubjectPublicKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERBitString(bArr);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERBitString(aSN1Encodable);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance(objects.nextElement());
    }
}
