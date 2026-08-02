package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class OriginatorPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.DERBitString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.DERBitString getPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.OriginatorPublicKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.OriginatorPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.OriginatorPublicKey) {
            return (org.bouncycastle.asn1.cms.OriginatorPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.OriginatorPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OriginatorPublicKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERBitString(bArr);
    }

    private OriginatorPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(1);
    }
}
