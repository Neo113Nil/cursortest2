package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ServiceSpecificPermissions extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int bitmapSsp = 2;
    public static final int extension = 1;
    public static final int opaque = 0;
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder setObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder setChoice(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder opaque() {
            return setChoice(0);
        }

        public org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder extension(byte[] bArr) {
            return setChoice(2).setObject(new org.bouncycastle.asn1.DEROctetString(bArr));
        }

        public org.bouncycastle.oer.its.ServiceSpecificPermissions createServiceSpecificPermissions() {
            return new org.bouncycastle.oer.its.ServiceSpecificPermissions(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }

        public org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder bitmapSsp(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
            return setChoice(2).setObject(aSN1OctetString);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.ASN1Encodable getObject() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getChoice() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.ServiceSpecificPermissions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.ServiceSpecificPermissions) {
            return (org.bouncycastle.oer.its.ServiceSpecificPermissions) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0 || tagNo == 1) {
            return new org.bouncycastle.oer.its.ServiceSpecificPermissions(aSN1TaggedObject.getTagNo(), org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 2) {
            return new org.bouncycastle.oer.its.ServiceSpecificPermissions(aSN1TaggedObject.getTagNo(), org.bouncycastle.oer.its.BitmapSsp.getInstance(aSN1TaggedObject.getObject()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown choice ");
        sb.append(aSN1TaggedObject.getTagNo());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder builder() {
        return new org.bouncycastle.oer.its.ServiceSpecificPermissions.Builder();
    }

    public ServiceSpecificPermissions(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
