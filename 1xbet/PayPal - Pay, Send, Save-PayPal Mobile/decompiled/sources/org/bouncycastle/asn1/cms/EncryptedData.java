package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class EncryptedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.EncryptedContentInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.BERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Set getUnprotectedAttrs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.EncryptedContentInfo getEncryptedContentInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cms.EncryptedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.EncryptedData) {
            return (org.bouncycastle.asn1.cms.EncryptedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.EncryptedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedData(org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(aSN1Set == null ? 0L : 2L);
        this.getHighSpeedVideoFpsRangesFor = encryptedContentInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Set;
    }

    public EncryptedData(org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo) {
        this(encryptedContentInfo, null);
    }

    private EncryptedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(2), false);
        }
    }
}
