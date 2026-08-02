package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
public class CMSTimeStampedDataParser extends org.bouncycastle.cms.CMSContentInfoParser {
    private org.bouncycastle.asn1.cms.TimeStampedDataParser getHighSpeedVideoFpsRanges;
    private org.bouncycastle.tsp.cms.TimeStampDataUtil getHighSpeedVideoSizes;

    public CMSTimeStampedDataParser(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        super(inputStream);
        org.bouncycastle.asn1.cms.ContentInfoParser contentInfoParser = this._contentInfo;
        try {
            if (org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData.equals((org.bouncycastle.asn1.ASN1Primitive) contentInfoParser.getContentType())) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.TimeStampedDataParser.getInstance(contentInfoParser.getContent(16));
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed content - type must be ");
                sb.append(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData.getId());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("parsing exception: ");
            sb2.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e);
        }
    }

    public java.lang.String getFileName() {
        org.bouncycastle.asn1.cms.MetaData metaData = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        if (metaData != null) {
            return org.bouncycastle.tsp.cms.MetaDataUtil.getHighSpeedVideoFpsRangesFor(metaData.getFileNameUTF8());
        }
        return null;
    }

    public java.lang.String getMediaType() {
        org.bouncycastle.asn1.cms.MetaData metaData = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        if (metaData != null) {
            return org.bouncycastle.tsp.cms.MetaDataUtil.getHighSpeedVideoFpsRangesFor(metaData.getMediaType());
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getOtherMetaData() {
        org.bouncycastle.asn1.cms.MetaData metaData = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        return new org.bouncycastle.asn1.cms.AttributeTable(metaData != null ? metaData.getOtherMetaData() : null);
    }

    public void initialiseMessageImprintDigestCalculator(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(digestCalculator);
    }

    public void validate(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, org.bouncycastle.tsp.TimeStampToken timeStampToken) throws org.bouncycastle.tsp.cms.ImprintDigestInvalidException, org.bouncycastle.cms.CMSException {
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(digestCalculatorProvider, bArr, timeStampToken);
    }

    public void validate(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws org.bouncycastle.tsp.cms.ImprintDigestInvalidException, org.bouncycastle.cms.CMSException {
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(digestCalculatorProvider, bArr);
    }

    public org.bouncycastle.tsp.TimeStampToken[] getTimeStampTokens() throws org.bouncycastle.cms.CMSException {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
    }

    public org.bouncycastle.operator.DigestCalculator getMessageImprintDigestCalculator(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            getHighResolutionOutputSizeshNQ4ISI();
            return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(digestCalculatorProvider);
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to extract algorithm ID: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    public java.net.URI getDataUri() throws java.net.URISyntaxException {
        org.bouncycastle.asn1.DERIA5String dataUri = this.getHighSpeedVideoFpsRanges.getDataUri();
        if (dataUri != null) {
            return new java.net.URI(dataUri.getString());
        }
        return null;
    }

    public java.io.InputStream getContent() {
        if (this.getHighSpeedVideoFpsRanges.getContent() != null) {
            return this.getHighSpeedVideoFpsRanges.getContent().getOctetStream();
        }
        return null;
    }

    public byte[] calculateNextHash(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(digestCalculator);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() throws org.bouncycastle.cms.CMSException {
        try {
            if (this.getHighSpeedVideoSizes == null) {
                java.io.InputStream content = getContent();
                if (content != null) {
                    org.bouncycastle.util.io.Streams.drain(content);
                }
                this.getHighSpeedVideoSizes = new org.bouncycastle.tsp.cms.TimeStampDataUtil(this.getHighSpeedVideoFpsRanges);
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse evidence block: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public CMSTimeStampedDataParser(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(new java.io.ByteArrayInputStream(bArr));
    }
}
