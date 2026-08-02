package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Ieee1609Dot2Content extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int encryptedData = 2;
    public static final int extension = 4;
    public static final int signedCertificateRequest = 3;
    public static final int signedData = 1;
    public static final int unsecuredData = 0;
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder unsecuredData(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
            this.getHighSpeedVideoSizes = 0;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder signedData(org.bouncycastle.oer.its.SignedData signedData) {
            this.getHighResolutionOutputSizeshNQ4ISI = signedData;
            this.getHighSpeedVideoSizes = 1;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder signedCertificateRequest(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
            this.getHighSpeedVideoSizes = 3;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder setObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder setChoice(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder extension(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(bArr);
            this.getHighSpeedVideoSizes = 4;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder encryptedData(org.bouncycastle.oer.its.EncryptedData encryptedData) {
            this.getHighResolutionOutputSizeshNQ4ISI = encryptedData;
            this.getHighSpeedVideoSizes = 2;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Content build() {
            return new org.bouncycastle.oer.its.Ieee1609Dot2Content(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.ASN1Encodable getObject() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getChoice() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.Ieee1609Dot2Content getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.Ieee1609Dot2Content) {
            return (org.bouncycastle.oer.its.Ieee1609Dot2Content) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                return new org.bouncycastle.oer.its.Ieee1609Dot2Content(aSN1TaggedObject.getTagNo(), org.bouncycastle.oer.its.SignedData.getInstance(aSN1TaggedObject.getObject()));
            }
            if (tagNo == 2) {
                return new org.bouncycastle.oer.its.Ieee1609Dot2Content(aSN1TaggedObject.getTagNo(), org.bouncycastle.oer.its.EncryptedData.getInstance(aSN1TaggedObject.getObject()));
            }
            if (tagNo != 3 && tagNo != 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag value ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return new org.bouncycastle.oer.its.Ieee1609Dot2Content(aSN1TaggedObject.getTagNo(), org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject.getObject()));
    }

    public static org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder builder() {
        return new org.bouncycastle.oer.its.Ieee1609Dot2Content.Builder();
    }

    public Ieee1609Dot2Content(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
