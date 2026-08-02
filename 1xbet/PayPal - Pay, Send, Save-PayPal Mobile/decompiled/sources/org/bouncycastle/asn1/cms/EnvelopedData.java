package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class EnvelopedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.EncryptedContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cms.OriginatorInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo = this.getHighSpeedVideoFpsRangesFor;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) originatorInfo));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRanges;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Set getUnprotectedAttrs() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Set getRecipientInfos() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cms.EncryptedContentInfo getEncryptedContentInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cms.EnvelopedData getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.EnvelopedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.EnvelopedData) {
            return (org.bouncycastle.asn1.cms.EnvelopedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.EnvelopedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static int calculateVersion(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.ASN1Set aSN1Set2) {
        if (originatorInfo != null || aSN1Set2 != null) {
            return 2;
        }
        java.util.Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            if (!org.bouncycastle.asn1.cms.RecipientInfo.getInstance(objects.nextElement()).getVersion().hasValue(0)) {
                return 2;
            }
        }
        return 0;
    }

    public EnvelopedData(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo, org.bouncycastle.asn1.cms.Attributes attributes) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(calculateVersion(originatorInfo, aSN1Set, org.bouncycastle.asn1.ASN1Set.getInstance(attributes)));
        this.getHighSpeedVideoFpsRangesFor = originatorInfo;
        this.getHighSpeedVideoSizes = aSN1Set;
        this.getHighResolutionOutputSizeshNQ4ISI = encryptedContentInfo;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance(attributes);
    }

    public EnvelopedData(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set2) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(calculateVersion(originatorInfo, aSN1Set, aSN1Set2));
        this.getHighSpeedVideoFpsRangesFor = originatorInfo;
        this.getHighSpeedVideoSizes = aSN1Set;
        this.getHighResolutionOutputSizeshNQ4ISI = encryptedContentInfo;
        this.getHighSpeedVideoFpsRanges = aSN1Set2;
    }

    private EnvelopedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        int i = 2;
        if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.OriginatorInfo.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i = 3;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Set.getInstance(objectAt);
        int i2 = i + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        if (aSN1Sequence.size() > i2) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i2), false);
        }
    }
}
