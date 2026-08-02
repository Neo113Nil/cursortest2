package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EncryptedDataEncryptionKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int eciesBrainpoolP256r1 = 1;
    public static final int eciesNistP256 = 0;
    public static final int extension = 2;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.EncryptedDataEncryptionKey.Builder setValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighSpeedVideoSizes = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.EncryptedDataEncryptionKey.Builder setChoice(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public org.bouncycastle.oer.its.EncryptedDataEncryptionKey createEncryptedDataEncryptionKey() {
            return new org.bouncycastle.oer.its.EncryptedDataEncryptionKey(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getChoice() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.EncryptedDataEncryptionKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.EncryptedDataEncryptionKey) {
            return (org.bouncycastle.oer.its.EncryptedDataEncryptionKey) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1) {
            return new org.bouncycastle.oer.its.EncryptedDataEncryptionKey.Builder().setChoice(aSN1TaggedObject.getTagNo()).setValue(aSN1TaggedObject.getObject()).createEncryptedDataEncryptionKey();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice ");
        sb.append(aSN1TaggedObject.getTagNo());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public EncryptedDataEncryptionKey(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
