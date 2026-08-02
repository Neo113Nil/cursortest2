package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class VerificationKeyIndicator extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int extension = 2;
    public static final int reconstructionValue = 1;
    public static final int verificationKey = 0;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.VerificationKeyIndicator.Builder setObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighSpeedVideoFpsRanges = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.VerificationKeyIndicator.Builder setChoice(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public org.bouncycastle.oer.its.VerificationKeyIndicator.Builder reconstructionValue(org.bouncycastle.oer.its.EccP256CurvePoint eccP256CurvePoint) {
            this.getHighSpeedVideoFpsRanges = eccP256CurvePoint;
            this.getHighSpeedVideoFpsRangesFor = 1;
            return this;
        }

        public org.bouncycastle.oer.its.VerificationKeyIndicator.Builder publicVerificationKey(org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey) {
            this.getHighSpeedVideoFpsRanges = publicVerificationKey;
            this.getHighSpeedVideoFpsRangesFor = 0;
            return this;
        }

        public org.bouncycastle.oer.its.VerificationKeyIndicator.Builder extension(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
            this.getHighSpeedVideoFpsRangesFor = 2;
            return this;
        }

        public org.bouncycastle.oer.its.VerificationKeyIndicator createVerificationKeyIndicator() {
            return new org.bouncycastle.oer.its.VerificationKeyIndicator(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.ASN1Encodable getObject() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getChoice() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.VerificationKeyIndicator getInstance(java.lang.Object obj) {
        org.bouncycastle.oer.its.VerificationKeyIndicator.Builder choice;
        org.bouncycastle.asn1.ASN1Encodable publicVerificationKey;
        if (obj instanceof org.bouncycastle.oer.its.VerificationKeyIndicator) {
            return (org.bouncycastle.oer.its.VerificationKeyIndicator) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            choice = new org.bouncycastle.oer.its.VerificationKeyIndicator.Builder().setChoice(0);
            publicVerificationKey = org.bouncycastle.oer.its.PublicVerificationKey.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 1) {
                if (tagNo == 2) {
                    return new org.bouncycastle.oer.its.VerificationKeyIndicator(2, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getLoadedObject()));
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unhandled tag ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            choice = new org.bouncycastle.oer.its.VerificationKeyIndicator.Builder().setChoice(1);
            publicVerificationKey = org.bouncycastle.oer.its.EccP256CurvePoint.getInstance(aSN1TaggedObject.getObject());
        }
        return choice.setObject(publicVerificationKey).createVerificationKeyIndicator();
    }

    public static org.bouncycastle.oer.its.VerificationKeyIndicator.Builder builder() {
        return new org.bouncycastle.oer.its.VerificationKeyIndicator.Builder();
    }

    public VerificationKeyIndicator(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
