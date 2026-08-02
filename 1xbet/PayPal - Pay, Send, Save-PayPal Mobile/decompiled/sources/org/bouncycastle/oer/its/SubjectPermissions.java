package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SubjectPermissions extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int all = 1;
    public static final int explicit = 0;
    public static final int extension = 3;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        int Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.SubjectPermissions.Builder value(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
            return this;
        }

        public org.bouncycastle.oer.its.SubjectPermissions.Builder extension(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
            this.Camera2StreamConfigurationMap = 3;
            if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString) {
                this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
                return this;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(aSN1Encodable.toASN1Primitive().getEncoded());
                return this;
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e.getMessage(), e);
            }
        }

        public org.bouncycastle.oer.its.SubjectPermissions.Builder explicit(org.bouncycastle.oer.its.SequenceOfPsidSspRange sequenceOfPsidSspRange) {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = sequenceOfPsidSspRange;
            return this;
        }

        public org.bouncycastle.oer.its.SubjectPermissions createSubjectPermissions() {
            return new org.bouncycastle.oer.its.SubjectPermissions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public org.bouncycastle.oer.its.SubjectPermissions.Builder choice(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public org.bouncycastle.oer.its.SubjectPermissions.Builder all() {
            this.Camera2StreamConfigurationMap = 1;
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERNull.INSTANCE;
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.oer.its.SubjectPermissions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SubjectPermissions) {
            return (org.bouncycastle.oer.its.SubjectPermissions) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.SubjectPermissions(0, org.bouncycastle.oer.its.SequenceOfPsidSspRange.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.SubjectPermissions(1, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        if (tagNo != 3) {
            return null;
        }
        try {
            return new org.bouncycastle.oer.its.SubjectPermissions(3, new org.bouncycastle.asn1.DEROctetString(aSN1TaggedObject.getObject().getEncoded()));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static org.bouncycastle.oer.its.SubjectPermissions.Builder builder() {
        return new org.bouncycastle.oer.its.SubjectPermissions.Builder();
    }

    SubjectPermissions(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
