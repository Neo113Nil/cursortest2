package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SignaturePolicyIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.esf.SignaturePolicyId getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes = true;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes ? org.bouncycastle.asn1.DERNull.INSTANCE : this.getHighSpeedVideoFpsRanges.toASN1Primitive();
    }

    public boolean isSignaturePolicyImplied() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.esf.SignaturePolicyId getSignaturePolicyId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.esf.SignaturePolicyIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SignaturePolicyIdentifier) {
            return (org.bouncycastle.asn1.esf.SignaturePolicyIdentifier) obj;
        }
        if ((obj instanceof org.bouncycastle.asn1.ASN1Null) || hasEncodedTagValue(obj, 5)) {
            return new org.bouncycastle.asn1.esf.SignaturePolicyIdentifier();
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.SignaturePolicyIdentifier(org.bouncycastle.asn1.esf.SignaturePolicyId.getInstance(obj));
        }
        return null;
    }

    public SignaturePolicyIdentifier(org.bouncycastle.asn1.esf.SignaturePolicyId signaturePolicyId) {
        this.getHighSpeedVideoFpsRanges = signaturePolicyId;
    }

    public SignaturePolicyIdentifier() {
    }
}
