package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class TimeStampedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cms.MetaData Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1IA5String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cms.Evidence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1IA5String != null) {
            aSN1EncodableVector.add(aSN1IA5String);
        }
        org.bouncycastle.asn1.cms.MetaData metaData = this.Camera2StreamConfigurationMap;
        if (metaData != null) {
            aSN1EncodableVector.add(metaData);
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRanges;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.Evidence getTemporalEvidence() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cms.MetaData getMetaData() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1IA5String getDataUriIA5() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.DERIA5String getDataUri() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighResolutionOutputSizeshNQ4ISI;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighResolutionOutputSizeshNQ4ISI.getString(), false);
    }

    public org.bouncycastle.asn1.ASN1OctetString getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cms.TimeStampedData getInstance(java.lang.Object obj) {
        return (obj == null || (obj instanceof org.bouncycastle.asn1.cms.TimeStampedData)) ? (org.bouncycastle.asn1.cms.TimeStampedData) obj : new org.bouncycastle.asn1.cms.TimeStampedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
    }

    private TimeStampedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        int i = 1;
        if (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1IA5String) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1Sequence.getObjectAt(1));
            i = 2;
        }
        if ((aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.cms.MetaData) || (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.MetaData.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1OctetString) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.Evidence.getInstance(aSN1Sequence.getObjectAt(i));
    }

    public TimeStampedData(org.bouncycastle.asn1.ASN1IA5String aSN1IA5String, org.bouncycastle.asn1.cms.MetaData metaData, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.cms.Evidence evidence) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1IA5String;
        this.Camera2StreamConfigurationMap = metaData;
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
        this.getHighSpeedVideoFpsRangesFor = evidence;
    }
}
