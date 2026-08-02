package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class IssuerIdentifier extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int extension = 2;
    public static final int self = 1;
    public static final int sha256AndDigest = 0;
    public static final int sha384AndDigest = 3;
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

    public static class Builder {
        public int choice;
        public org.bouncycastle.asn1.ASN1Encodable value;

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder sha384AndDigest(org.bouncycastle.oer.its.HashedId hashedId) {
            this.choice = 3;
            this.value = hashedId;
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder sha256AndDigest(org.bouncycastle.oer.its.HashedId hashedId) {
            this.choice = 0;
            this.value = hashedId;
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder setValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.value = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder setChoice(int i) {
            this.choice = i;
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder self(org.bouncycastle.oer.its.HashAlgorithm hashAlgorithm) {
            this.choice = 1;
            this.value = hashAlgorithm;
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier.Builder extension(byte[] bArr) {
            this.choice = 2;
            this.value = new org.bouncycastle.asn1.DEROctetString(bArr);
            return this;
        }

        public org.bouncycastle.oer.its.IssuerIdentifier createIssuerIdentifier() {
            return new org.bouncycastle.oer.its.IssuerIdentifier(this.choice, this.value);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public boolean isSelf() {
        return this.Camera2StreamConfigurationMap == 1;
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getChoice() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.IssuerIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.IssuerIdentifier) {
            return (org.bouncycastle.oer.its.IssuerIdentifier) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.IssuerIdentifier(0, org.bouncycastle.oer.its.HashedId.HashedId8.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.IssuerIdentifier(1, org.bouncycastle.oer.its.HashAlgorithm.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 2) {
            return new org.bouncycastle.oer.its.IssuerIdentifier(2, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 3) {
            return new org.bouncycastle.oer.its.IssuerIdentifier(3, org.bouncycastle.oer.its.HashedId.HashedId8.getInstance(aSN1TaggedObject.getObject()));
        }
        throw new java.lang.IllegalArgumentException("unable to decode into known choice".concat(java.lang.String.valueOf(tagNo)));
    }

    public static org.bouncycastle.oer.its.IssuerIdentifier.Builder builder() {
        return new org.bouncycastle.oer.its.IssuerIdentifier.Builder();
    }

    public IssuerIdentifier(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
