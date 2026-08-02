package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class AuthEnvelopedDataParser {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1SequenceParser getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1SetParser getUnauthAttrs() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable == null) {
            return null;
        }
        this.getHighSpeedVideoSizes = null;
        return (org.bouncycastle.asn1.ASN1SetParser) org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal((org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable, 2, false, 17);
    }

    public org.bouncycastle.asn1.ASN1SetParser getRecipientInfos() throws java.io.IOException {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            getOriginatorInfo();
        }
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1SetParser aSN1SetParser = (org.bouncycastle.asn1.ASN1SetParser) this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = null;
        return aSN1SetParser;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = true;
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = (org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser = (org.bouncycastle.asn1.ASN1SequenceParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
                this.getHighSpeedVideoSizes = null;
                return org.bouncycastle.asn1.cms.OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
            }
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1OctetString getMac() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = null;
        return org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public org.bouncycastle.asn1.cms.EncryptedContentInfoParser getAuthEncryptedContentInfo() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable == null) {
            return null;
        }
        this.getHighSpeedVideoSizes = null;
        org.bouncycastle.asn1.cms.EncryptedContentInfoParser encryptedContentInfoParser = new org.bouncycastle.asn1.cms.EncryptedContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) aSN1Encodable);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data.equals((org.bouncycastle.asn1.ASN1Primitive) encryptedContentInfoParser.getContentType());
        return encryptedContentInfoParser;
    }

    public org.bouncycastle.asn1.ASN1SetParser getAuthAttrs() throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            this.getHighSpeedVideoSizes = null;
            return (org.bouncycastle.asn1.ASN1SetParser) org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal((org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable, 1, false, 17);
        }
        if (this.Camera2StreamConfigurationMap) {
            return null;
        }
        throw new org.bouncycastle.asn1.ASN1ParsingException("authAttrs must be present with non-data content");
    }

    public AuthEnvelopedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = aSN1SequenceParser;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        if (!aSN1Integer.hasValue(0)) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("AuthEnvelopedData version number must be 0");
        }
    }
}
