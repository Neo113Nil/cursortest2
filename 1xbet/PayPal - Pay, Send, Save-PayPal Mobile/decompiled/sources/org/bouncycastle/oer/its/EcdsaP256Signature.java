package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EcdsaP256Signature extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.EccP256CurvePoint getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    public static class Builder {
        private org.bouncycastle.oer.its.EccP256CurvePoint getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.EcdsaP256Signature.Builder setsSig(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.getHighSpeedVideoFpsRanges = aSN1OctetString;
            return this;
        }

        public org.bouncycastle.oer.its.EcdsaP256Signature.Builder setrSig(org.bouncycastle.oer.its.EccP256CurvePoint eccP256CurvePoint) {
            this.getHighResolutionOutputSizeshNQ4ISI = eccP256CurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.EcdsaP256Signature createEcdsaP256Signature() {
            return new org.bouncycastle.oer.its.EcdsaP256Signature(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        }
    }

    public org.bouncycastle.asn1.ASN1OctetString getsSig() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.EccP256CurvePoint getrSig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.EcdsaP256Signature getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.EcdsaP256Signature.Builder().setrSig(org.bouncycastle.oer.its.EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0))).setsSig(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1))).createEcdsaP256Signature();
    }

    public static org.bouncycastle.oer.its.EcdsaP256Signature.Builder builder() {
        return new org.bouncycastle.oer.its.EcdsaP256Signature.Builder();
    }

    public EcdsaP256Signature(org.bouncycastle.oer.its.EccP256CurvePoint eccP256CurvePoint, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRanges = eccP256CurvePoint;
        this.getHighSpeedVideoSizes = aSN1OctetString;
    }
}
