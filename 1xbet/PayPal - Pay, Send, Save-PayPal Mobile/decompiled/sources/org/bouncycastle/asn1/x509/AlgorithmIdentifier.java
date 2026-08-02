package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AlgorithmIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.AlgorithmIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.AlgorithmIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AlgorithmIdentifier) {
            return (org.bouncycastle.asn1.x509.AlgorithmIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private AlgorithmIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence.size() == 2 ? aSN1Sequence.getObjectAt(1) : null;
    }

    public AlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }

    public AlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
    }
}
