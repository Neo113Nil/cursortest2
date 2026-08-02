package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EcdsaP384Signature extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.EccP384CurvePoint getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.EccP384CurvePoint getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.EcdsaP384Signature.Builder setsSig(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.getHighSpeedVideoFpsRanges = aSN1OctetString;
            return this;
        }

        public org.bouncycastle.oer.its.EcdsaP384Signature.Builder setrSig(org.bouncycastle.oer.its.EccP384CurvePoint eccP384CurvePoint) {
            this.getHighSpeedVideoFpsRangesFor = eccP384CurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.EcdsaP384Signature createEcdsaP384Signature() {
            return new org.bouncycastle.oer.its.EcdsaP384Signature(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.ASN1OctetString getsSig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.EccP384CurvePoint getrSig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.EcdsaP384Signature getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.EcdsaP384Signature.Builder().setrSig(org.bouncycastle.oer.its.EccP384CurvePoint.getInstance(aSN1Sequence.getObjectAt(0))).setsSig(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1))).createEcdsaP384Signature();
    }

    public EcdsaP384Signature(org.bouncycastle.oer.its.EccP384CurvePoint eccP384CurvePoint, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighResolutionOutputSizeshNQ4ISI = eccP384CurvePoint;
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
    }
}
