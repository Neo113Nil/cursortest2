package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class AuthEnvelopedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cms.OriginatorInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cms.EncryptedContentInfo getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo = this.Camera2StreamConfigurationMap;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) originatorInfo));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getInputSizeshNQ4ISI;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.ASN1Set getUnauthAttrs() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Set getRecipientInfos() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1OctetString getMac() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cms.EncryptedContentInfo getAuthEncryptedContentInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Set getAuthAttrs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cms.AuthEnvelopedData getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.AuthEnvelopedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.AuthEnvelopedData) {
            return (org.bouncycastle.asn1.cms.AuthEnvelopedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.AuthEnvelopedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AuthEnvelopedData(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1Set aSN1Set3) {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.Camera2StreamConfigurationMap = originatorInfo;
        this.getHighSpeedVideoFpsRanges = aSN1Set;
        if (aSN1Set.size() == 0) {
            throw new java.lang.IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
        }
        this.getHighSpeedVideoSizes = encryptedContentInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Set2;
        if (!encryptedContentInfo.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data) && (aSN1Set2 == null || aSN1Set2.size() == 0)) {
            throw new java.lang.IllegalArgumentException("authAttrs must be present with non-data content");
        }
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
        this.getInputSizeshNQ4ISI = aSN1Set3;
    }

    private AuthEnvelopedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Set aSN1Set;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0).toASN1Primitive());
        this.getHighSpeedVideoSizesFor = aSN1Integer;
        if (!aSN1Integer.hasValue(0)) {
            throw new java.lang.IllegalArgumentException("AuthEnvelopedData version number must be 0");
        }
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = aSN1Sequence.getObjectAt(1).toASN1Primitive();
        int i = 2;
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.OriginatorInfo.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive, false);
            aSN1Primitive = aSN1Sequence.getObjectAt(2).toASN1Primitive();
            i = 3;
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Primitive);
        this.getHighSpeedVideoFpsRanges = aSN1Set2;
        if (aSN1Set2.size() == 0) {
            throw new java.lang.IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i).toASN1Primitive());
        int i2 = i + 2;
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(i + 1).toASN1Primitive();
        if (aSN1Primitive2 instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive2, false);
            aSN1Primitive2 = aSN1Sequence.getObjectAt(i2).toASN1Primitive();
            i2 = i + 3;
        } else if (!this.getHighSpeedVideoSizes.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data) && ((aSN1Set = this.getHighResolutionOutputSizeshNQ4ISI) == null || aSN1Set.size() == 0)) {
            throw new java.lang.IllegalArgumentException("authAttrs must be present with non-data content");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Primitive2);
        if (aSN1Sequence.size() > i2) {
            this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i2).toASN1Primitive(), false);
        }
    }
}
