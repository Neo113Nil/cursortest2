package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class ObjectDigestInfo extends org.bouncycastle.asn1.ASN1Object {
    public static final int otherObjectDigest = 2;
    public static final int publicKey = 0;
    public static final int publicKeyCert = 1;
    org.bouncycastle.asn1.ASN1Enumerated Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getHighSpeedVideoFpsRanges;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherObjectTypeID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1BitString getObjectDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Enumerated getDigestedObjectType() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.ObjectDigestInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.ObjectDigestInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.ObjectDigestInfo) {
            return (org.bouncycastle.asn1.x509.ObjectDigestInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.ObjectDigestInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ObjectDigestInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 4 || aSN1Sequence.size() < 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Enumerated.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 4) {
            i = 1;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(i + 2));
    }

    public ObjectDigestInfo(int i, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Enumerated(i);
        if (i == 2) {
            this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERBitString(bArr);
    }
}
