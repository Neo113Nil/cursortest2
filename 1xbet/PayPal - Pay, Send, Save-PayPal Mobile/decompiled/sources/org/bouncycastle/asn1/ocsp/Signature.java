package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class Signature extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.DERBitString getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.DERBitString getSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Sequence getCerts() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.ocsp.Signature getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.Signature getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.Signature) {
            return (org.bouncycastle.asn1.ocsp.Signature) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.Signature(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Signature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = dERBitString;
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }

    public Signature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = dERBitString;
    }

    private Signature(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(1);
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
        }
    }
}
