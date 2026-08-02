package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class Evidence extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.tsp.EvidenceRecord Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cms.TimeStampTokenEvidence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.cms.TimeStampTokenEvidence timeStampTokenEvidence = this.getHighSpeedVideoSizes;
        if (timeStampTokenEvidence != null) {
            return new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) timeStampTokenEvidence);
        }
        org.bouncycastle.asn1.tsp.EvidenceRecord evidenceRecord = this.Camera2StreamConfigurationMap;
        return evidenceRecord != null ? new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) evidenceRecord) : new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.cms.TimeStampTokenEvidence getTstEvidence() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.tsp.EvidenceRecord getErsEvidence() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.Evidence getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.cms.Evidence getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.Evidence)) {
            return (org.bouncycastle.asn1.cms.Evidence) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.cms.Evidence(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj));
        }
        throw new java.lang.IllegalArgumentException("unknown object in getInstance");
    }

    public Evidence(org.bouncycastle.asn1.tsp.EvidenceRecord evidenceRecord) {
        this.Camera2StreamConfigurationMap = evidenceRecord;
    }

    public Evidence(org.bouncycastle.asn1.cms.TimeStampTokenEvidence timeStampTokenEvidence) {
        this.getHighSpeedVideoSizes = timeStampTokenEvidence;
    }

    private Evidence(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.TimeStampTokenEvidence.getInstance(aSN1TaggedObject, false);
        } else if (aSN1TaggedObject.getTagNo() == 1) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.tsp.EvidenceRecord.getInstance(aSN1TaggedObject, false);
        } else {
            if (aSN1TaggedObject.getTagNo() != 2) {
                throw new java.lang.IllegalArgumentException("unknown tag in Evidence");
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false);
        }
    }
}
