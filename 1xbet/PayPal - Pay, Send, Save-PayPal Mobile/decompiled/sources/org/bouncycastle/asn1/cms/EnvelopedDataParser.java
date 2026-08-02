package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class EnvelopedDataParser {
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1SequenceParser getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1SetParser getUnprotectedAttrs() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (aSN1Encodable == null) {
            return null;
        }
        this.Camera2StreamConfigurationMap = null;
        return (org.bouncycastle.asn1.ASN1SetParser) org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal((org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable, 1, false, 17);
    }

    public org.bouncycastle.asn1.ASN1SetParser getRecipientInfos() throws java.io.IOException {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            getOriginatorInfo();
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        org.bouncycastle.asn1.ASN1SetParser aSN1SetParser = (org.bouncycastle.asn1.ASN1SetParser) this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = null;
        return aSN1SetParser;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = (org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser = (org.bouncycastle.asn1.ASN1SequenceParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
                this.Camera2StreamConfigurationMap = null;
                return org.bouncycastle.asn1.cms.OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
            }
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.EncryptedContentInfoParser getEncryptedContentInfo() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (aSN1Encodable == null) {
            return null;
        }
        this.Camera2StreamConfigurationMap = null;
        return new org.bouncycastle.asn1.cms.EncryptedContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) aSN1Encodable);
    }

    public EnvelopedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = aSN1SequenceParser;
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }
}
