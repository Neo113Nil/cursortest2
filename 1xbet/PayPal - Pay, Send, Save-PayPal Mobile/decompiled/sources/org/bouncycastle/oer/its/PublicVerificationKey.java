package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PublicVerificationKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int ecdsaBrainpoolP256r1 = 1;
    public static final int ecdsaBrainpoolP384r1 = 3;
    public static final int ecdsaNistP256 = 0;
    public static final int extension = 2;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder setCurvePoint(org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint) {
            this.getHighSpeedVideoFpsRanges = eccCurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder setChoice(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder extension(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder ecdsaNistP256(org.bouncycastle.oer.its.EccP256CurvePoint eccP256CurvePoint) {
            this.getHighSpeedVideoFpsRanges = eccP256CurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder ecdsaBrainpoolP384r1(org.bouncycastle.oer.its.EccP384CurvePoint eccP384CurvePoint) {
            this.getHighSpeedVideoFpsRanges = eccP384CurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey.Builder ecdsaBrainpoolP256r1(org.bouncycastle.oer.its.EccP256CurvePoint eccP256CurvePoint) {
            this.getHighSpeedVideoFpsRanges = eccP256CurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.PublicVerificationKey createPublicVerificationKey() {
            return new org.bouncycastle.oer.its.PublicVerificationKey(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.ASN1Encodable getCurvePoint() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getChoice() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.PublicVerificationKey getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Encodable eccP256CurvePoint;
        if (obj instanceof org.bouncycastle.oer.its.PublicVerificationKey) {
            return (org.bouncycastle.oer.its.PublicVerificationKey) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1) {
            eccP256CurvePoint = org.bouncycastle.oer.its.EccP256CurvePoint.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 2) {
            eccP256CurvePoint = org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag value ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            eccP256CurvePoint = org.bouncycastle.oer.its.EccP384CurvePoint.getInstance(aSN1TaggedObject.getObject());
        }
        return new org.bouncycastle.oer.its.PublicVerificationKey(aSN1TaggedObject.getTagNo(), eccP256CurvePoint);
    }

    public static org.bouncycastle.oer.its.PublicVerificationKey.Builder builder() {
        return new org.bouncycastle.oer.its.PublicVerificationKey.Builder();
    }

    public PublicVerificationKey(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
