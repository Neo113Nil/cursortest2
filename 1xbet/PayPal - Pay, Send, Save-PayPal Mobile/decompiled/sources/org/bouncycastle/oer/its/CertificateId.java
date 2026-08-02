package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CertificateId extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int binaryId = 2;
    public static final int extension = 4;
    public static final int linkageData = 0;

    /* renamed from: name, reason: collision with root package name */
    public static final int f7051name = 1;
    public static final int none = 3;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public static class Builder {
        private int Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.CertificateId.Builder setValue(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighSpeedVideoFpsRanges = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId.Builder setChoice(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId.Builder none() {
            this.Camera2StreamConfigurationMap = 1;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.DERNull.INSTANCE;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId.Builder name(org.bouncycastle.oer.its.Hostname hostname) {
            this.Camera2StreamConfigurationMap = 1;
            this.getHighSpeedVideoFpsRanges = hostname;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId.Builder linkageData(org.bouncycastle.oer.its.LinkageData linkageData) {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = linkageData;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId.Builder extension(byte[] bArr) {
            this.Camera2StreamConfigurationMap = 4;
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
            return this;
        }

        public org.bouncycastle.oer.its.CertificateId createCertificateId() {
            return new org.bouncycastle.oer.its.CertificateId(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }

        public org.bouncycastle.oer.its.CertificateId.Builder binaryId(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            this.Camera2StreamConfigurationMap = 1;
            this.getHighSpeedVideoFpsRanges = dEROctetString;
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor).toASN1Primitive();
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getChoice() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.CertificateId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CertificateId) {
            return (org.bouncycastle.oer.its.CertificateId) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.CertificateId(tagNo, org.bouncycastle.oer.its.LinkageData.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.CertificateId(tagNo, org.bouncycastle.oer.its.Hostname.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo != 2) {
            if (tagNo == 3) {
                return new org.bouncycastle.oer.its.CertificateId(tagNo, aSN1TaggedObject.getObject());
            }
            if (tagNo != 4) {
                throw new java.lang.IllegalArgumentException("unknown choice in CertificateId");
            }
        }
        return new org.bouncycastle.oer.its.CertificateId(tagNo, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject()));
    }

    public static org.bouncycastle.oer.its.CertificateId.Builder builder() {
        return new org.bouncycastle.oer.its.CertificateId.Builder();
    }

    public CertificateId(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
