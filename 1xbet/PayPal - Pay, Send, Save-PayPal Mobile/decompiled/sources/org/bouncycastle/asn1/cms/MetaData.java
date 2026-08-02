package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class MetaData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cms.Attributes getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1IA5String getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        if (aSN1UTF8String != null) {
            aSN1EncodableVector.add(aSN1UTF8String);
        }
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoSizes;
        if (aSN1IA5String != null) {
            aSN1EncodableVector.add(aSN1IA5String);
        }
        org.bouncycastle.asn1.cms.Attributes attributes = this.getHighSpeedVideoFpsRangesFor;
        if (attributes != null) {
            aSN1EncodableVector.add(attributes);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isHashProtected() {
        return this.Camera2StreamConfigurationMap.isTrue();
    }

    public org.bouncycastle.asn1.cms.Attributes getOtherMetaData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1IA5String getMediaTypeIA5() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.DERIA5String getMediaType() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoSizes;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoSizes.getString(), false);
    }

    public org.bouncycastle.asn1.ASN1UTF8String getFileNameUTF8() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.DERUTF8String getFileName() {
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        return (aSN1UTF8String == null || (aSN1UTF8String instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) aSN1UTF8String : new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges.getString());
    }

    public static org.bouncycastle.asn1.cms.MetaData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.MetaData) {
            return (org.bouncycastle.asn1.cms.MetaData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.MetaData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private MetaData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(0));
        int i = 1;
        if (1 < aSN1Sequence.size() && (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1UTF8String)) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(1));
            i = 2;
        }
        if (i < aSN1Sequence.size() && (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1IA5String)) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        if (i < aSN1Sequence.size()) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.Attributes.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }

    public MetaData(org.bouncycastle.asn1.ASN1Boolean aSN1Boolean, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String, org.bouncycastle.asn1.ASN1IA5String aSN1IA5String, org.bouncycastle.asn1.cms.Attributes attributes) {
        this.Camera2StreamConfigurationMap = aSN1Boolean;
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
        this.getHighSpeedVideoSizes = aSN1IA5String;
        this.getHighSpeedVideoFpsRangesFor = attributes;
    }
}
