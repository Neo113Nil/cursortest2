package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SigPolicyQualifierInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getSigQualifier() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getSigPolicyQualifierId() {
        return new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighResolutionOutputSizeshNQ4ISI.getId());
    }

    public static org.bouncycastle.asn1.esf.SigPolicyQualifierInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SigPolicyQualifierInfo) {
            return (org.bouncycastle.asn1.esf.SigPolicyQualifierInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.SigPolicyQualifierInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SigPolicyQualifierInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = aSN1Sequence.getObjectAt(1);
    }

    public SigPolicyQualifierInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
