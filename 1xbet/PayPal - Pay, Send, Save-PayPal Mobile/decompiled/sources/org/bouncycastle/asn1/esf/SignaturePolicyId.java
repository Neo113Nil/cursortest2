package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SignaturePolicyId extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.esf.OtherHashAlgAndValue getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.esf.SigPolicyQualifiers getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.esf.SigPolicyQualifiers sigPolicyQualifiers = this.getHighSpeedVideoFpsRanges;
        if (sigPolicyQualifiers != null) {
            aSN1EncodableVector.add(sigPolicyQualifiers);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.esf.SigPolicyQualifiers getSigPolicyQualifiers() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getSigPolicyId() {
        return new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRangesFor.getId());
    }

    public org.bouncycastle.asn1.esf.OtherHashAlgAndValue getSigPolicyHash() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.SignaturePolicyId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SignaturePolicyId) {
            return (org.bouncycastle.asn1.esf.SignaturePolicyId) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.SignaturePolicyId(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SignaturePolicyId(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.esf.OtherHashAlgAndValue.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.esf.SigPolicyQualifiers.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }

    public SignaturePolicyId(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue, org.bouncycastle.asn1.esf.SigPolicyQualifiers sigPolicyQualifiers) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = otherHashAlgAndValue;
        this.getHighSpeedVideoFpsRanges = sigPolicyQualifiers;
    }

    public SignaturePolicyId(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue) {
        this(aSN1ObjectIdentifier, otherHashAlgAndValue, null);
    }
}
