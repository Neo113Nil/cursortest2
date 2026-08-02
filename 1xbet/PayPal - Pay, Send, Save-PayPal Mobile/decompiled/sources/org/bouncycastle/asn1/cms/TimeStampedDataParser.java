package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class TimeStampedDataParser {
    private org.bouncycastle.asn1.ASN1OctetStringParser Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.MetaData getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.Evidence getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1SequenceParser getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1IA5String getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;

    public int getVersion() {
        return this.getInputFormats.getValue().intValue();
    }

    public org.bouncycastle.asn1.cms.Evidence getTemporalEvidence() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.Evidence.getInstance(this.getHighSpeedVideoFpsRangesFor.readObject().toASN1Primitive());
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cms.MetaData getMetaData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1IA5String getDataUriIA5() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.DERIA5String getDataUri() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoSizes;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoSizes.getString(), false);
    }

    public org.bouncycastle.asn1.ASN1OctetStringParser getContent() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.TimeStampedDataParser getInstance(java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cms.TimeStampedDataParser(((org.bouncycastle.asn1.ASN1Sequence) obj).parser());
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1SequenceParser) {
            return new org.bouncycastle.asn1.cms.TimeStampedDataParser((org.bouncycastle.asn1.ASN1SequenceParser) obj);
        }
        return null;
    }

    private TimeStampedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = aSN1SequenceParser;
        this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        org.bouncycastle.asn1.ASN1Encodable readObject = aSN1SequenceParser.readObject();
        if (readObject instanceof org.bouncycastle.asn1.ASN1IA5String) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1IA5String.getInstance(readObject);
            readObject = aSN1SequenceParser.readObject();
        }
        if ((readObject instanceof org.bouncycastle.asn1.cms.MetaData) || (readObject instanceof org.bouncycastle.asn1.ASN1SequenceParser)) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.MetaData.getInstance(readObject.toASN1Primitive());
            readObject = aSN1SequenceParser.readObject();
        }
        if (readObject instanceof org.bouncycastle.asn1.ASN1OctetStringParser) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1OctetStringParser) readObject;
        }
    }
}
