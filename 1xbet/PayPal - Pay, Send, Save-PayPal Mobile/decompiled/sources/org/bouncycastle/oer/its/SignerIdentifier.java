package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SignerIdentifier extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int certificate = 1;
    public static final int digest = 0;
    public static final int extension = 3;
    public static final int self = 2;
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.SignerIdentifier.Builder setEncodable(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.Camera2StreamConfigurationMap = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier.Builder setChoice(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier.Builder self() {
            this.getHighSpeedVideoFpsRanges = 2;
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.DERNull.INSTANCE;
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier.Builder extension(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = 3;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(bArr);
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier.Builder digest(org.bouncycastle.oer.its.HashedId.HashedId8 hashedId8) {
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = hashedId8;
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier.Builder certificate(org.bouncycastle.oer.its.SequenceOfCertificate sequenceOfCertificate) {
            this.getHighSpeedVideoFpsRanges = 1;
            this.Camera2StreamConfigurationMap = sequenceOfCertificate;
            return this;
        }

        public org.bouncycastle.oer.its.SignerIdentifier build() {
            return new org.bouncycastle.oer.its.SignerIdentifier(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.ASN1Encodable getObject() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getChoice() {
        return this.Camera2StreamConfigurationMap;
    }

    public static final org.bouncycastle.oer.its.SignerIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SignerIdentifier) {
            return (org.bouncycastle.oer.its.SignerIdentifier) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.SignerIdentifier(aSN1TaggedObject.getTagNo(), org.bouncycastle.oer.its.HashedId.HashedId8.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.SignerIdentifier(aSN1TaggedObject.getTagNo(), org.bouncycastle.oer.its.SequenceOfCertificate.getInstance(aSN1TaggedObject.getObject()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice ");
        sb.append(aSN1TaggedObject.getTagNo());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static org.bouncycastle.oer.its.SignerIdentifier.Builder builder() {
        return new org.bouncycastle.oer.its.SignerIdentifier.Builder();
    }

    public SignerIdentifier(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
