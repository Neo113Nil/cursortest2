package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class BasePublicEncryptionKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int eciesBrainpoolP256r1 = 1;
    public static final int eciesNistP256 = 0;
    public static final int extension = 2;
    private final int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    public static class Builder {
        private int Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder setValue(org.bouncycastle.oer.its.EccCurvePoint eccCurvePoint) {
            this.getHighSpeedVideoSizes = eccCurvePoint;
            return this;
        }

        public org.bouncycastle.oer.its.BasePublicEncryptionKey.Builder setChoice(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public org.bouncycastle.oer.its.BasePublicEncryptionKey createBasePublicEncryptionKey() {
            return new org.bouncycastle.oer.its.BasePublicEncryptionKey(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public int getChoice() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.BasePublicEncryptionKey getInstance(java.lang.Object obj) {
        org.bouncycastle.asn1.ASN1Encodable eccP256CurvePoint;
        if (obj instanceof org.bouncycastle.oer.its.BasePublicEncryptionKey) {
            return (org.bouncycastle.oer.its.BasePublicEncryptionKey) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1) {
            eccP256CurvePoint = org.bouncycastle.oer.its.EccP256CurvePoint.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            eccP256CurvePoint = org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject());
        }
        return new org.bouncycastle.oer.its.BasePublicEncryptionKey(aSN1TaggedObject.getTagNo(), eccP256CurvePoint);
    }

    public BasePublicEncryptionKey(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
