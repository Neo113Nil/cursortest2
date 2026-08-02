package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Signature extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int ecdsaBrainpoolP256r1Signature = 1;
    public static final int ecdsaBrainpoolP384r1Signature = 3;
    public static final int ecdsaNistP256Signature = 0;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private int getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.Signature.Builder ecdsaNistP256Signature(org.bouncycastle.oer.its.EcdsaP256Signature ecdsaP256Signature) {
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = ecdsaP256Signature;
            return this;
        }

        public org.bouncycastle.oer.its.Signature.Builder ecdsaBrainpoolP384r1Signature(org.bouncycastle.oer.its.EcdsaP384Signature ecdsaP384Signature) {
            this.getHighSpeedVideoFpsRanges = 3;
            this.getHighSpeedVideoSizes = ecdsaP384Signature;
            return this;
        }

        public org.bouncycastle.oer.its.Signature.Builder ecdsaBrainpoolP256r1Signature(org.bouncycastle.oer.its.EcdsaP256Signature ecdsaP256Signature) {
            this.getHighSpeedVideoFpsRanges = 1;
            this.getHighSpeedVideoSizes = ecdsaP256Signature;
            return this;
        }

        public org.bouncycastle.oer.its.Signature createSignature() {
            return new org.bouncycastle.oer.its.Signature(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getChoice() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.Signature getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Encodable ecdsaP256Signature;
        if (obj instanceof org.bouncycastle.oer.its.Signature) {
            return (org.bouncycastle.oer.its.Signature) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1) {
            ecdsaP256Signature = org.bouncycastle.oer.its.EcdsaP256Signature.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 2) {
            ecdsaP256Signature = org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            ecdsaP256Signature = org.bouncycastle.oer.its.EcdsaP384Signature.getInstance(aSN1TaggedObject.getObject());
        }
        return new org.bouncycastle.oer.its.Signature(aSN1TaggedObject.getTagNo(), ecdsaP256Signature);
    }

    public static org.bouncycastle.oer.its.Signature.Builder builder() {
        return new org.bouncycastle.oer.its.Signature.Builder();
    }

    public Signature(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
