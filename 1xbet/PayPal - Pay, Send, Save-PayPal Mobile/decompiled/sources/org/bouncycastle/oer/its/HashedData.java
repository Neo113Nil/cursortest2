package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class HashedData extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int extension = 1;
    public static final int reserved = 3;
    public static final int sha256HashedData = 0;
    public static final int sha384HashedData = 2;
    private final int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.HashedData.Builder sha384HashedData(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.Camera2StreamConfigurationMap = aSN1OctetString;
            return this;
        }

        public org.bouncycastle.oer.its.HashedData.Builder setSha256HashedData(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.Camera2StreamConfigurationMap = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.HashedData.Builder setChoice(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public org.bouncycastle.oer.its.HashedData.Builder reserved(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.Camera2StreamConfigurationMap = aSN1OctetString;
            return this;
        }

        public org.bouncycastle.oer.its.HashedData.Builder extension(byte[] bArr) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(bArr);
            return this;
        }

        public org.bouncycastle.oer.its.HashedData createHashedData() {
            return new org.bouncycastle.oer.its.HashedData(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
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

    public static org.bouncycastle.oer.its.HashedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.HashedData) {
            return (org.bouncycastle.oer.its.HashedData) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1 || tagNo == 2 || tagNo == 3) {
            return new org.bouncycastle.oer.its.HashedData(aSN1TaggedObject.getTagNo(), org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice value ");
        sb.append(aSN1TaggedObject.getTagNo());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public HashedData(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
