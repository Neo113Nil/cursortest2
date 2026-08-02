package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SymmetricCiphertext extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int aes128ccm = 0;
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.SymmetricCiphertext.Builder setValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.Camera2StreamConfigurationMap = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.SymmetricCiphertext.Builder setChoice(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public org.bouncycastle.oer.its.SymmetricCiphertext createSymmetricCiphertext() {
            return new org.bouncycastle.oer.its.SymmetricCiphertext(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public int getChoice() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.SymmetricCiphertext getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SymmetricCiphertext) {
            return (org.bouncycastle.oer.its.SymmetricCiphertext) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        return new org.bouncycastle.oer.its.SymmetricCiphertext.Builder().setChoice(aSN1TaggedObject.getTagNo()).setValue(aSN1TaggedObject.getObject()).createSymmetricCiphertext();
    }

    public SymmetricCiphertext(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
