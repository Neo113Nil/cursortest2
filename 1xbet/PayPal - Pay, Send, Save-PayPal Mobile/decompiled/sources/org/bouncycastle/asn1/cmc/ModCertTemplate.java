package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class ModCertTemplate extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.BodyPartList Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.crmf.CertTemplate getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.BodyPartPath getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        if (!z) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.ASN1Boolean.getInstance(z));
        }
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isReplacingFields() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cmc.BodyPartPath getPkiDataReference() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.crmf.CertTemplate getCertTemplate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmc.BodyPartList getCertReferences() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cmc.ModCertTemplate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.ModCertTemplate) {
            return (org.bouncycastle.asn1.cmc.ModCertTemplate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.ModCertTemplate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ModCertTemplate(org.bouncycastle.asn1.cmc.BodyPartPath bodyPartPath, org.bouncycastle.asn1.cmc.BodyPartList bodyPartList, boolean z, org.bouncycastle.asn1.crmf.CertTemplate certTemplate) {
        this.getHighSpeedVideoFpsRanges = bodyPartPath;
        this.Camera2StreamConfigurationMap = bodyPartList;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = certTemplate;
    }

    private ModCertTemplate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmc.BodyPartPath.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.BodyPartList.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 4) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(2)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(3);
        } else {
            this.getHighSpeedVideoFpsRangesFor = true;
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.CertTemplate.getInstance(objectAt);
    }
}
