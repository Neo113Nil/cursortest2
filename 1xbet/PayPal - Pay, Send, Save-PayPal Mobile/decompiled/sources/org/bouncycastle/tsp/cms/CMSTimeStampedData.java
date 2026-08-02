package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
public class CMSTimeStampedData {
    private org.bouncycastle.asn1.cms.TimeStampedData Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.tsp.cms.TimeStampDataUtil getHighSpeedVideoSizes;

    public org.bouncycastle.tsp.cms.CMSTimeStampedData addTimeStamp(org.bouncycastle.tsp.TimeStampToken timeStampToken) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr2 = new org.bouncycastle.asn1.cms.TimeStampAndCRL[timeStampAndCRLArr.length + 1];
        java.lang.System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, timeStampAndCRLArr.length);
        timeStampAndCRLArr2[timeStampAndCRLArr.length] = new org.bouncycastle.asn1.cms.TimeStampAndCRL(timeStampToken.toCMSSignedData().toASN1Structure());
        return new org.bouncycastle.tsp.cms.CMSTimeStampedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData, new org.bouncycastle.asn1.cms.TimeStampedData(this.Camera2StreamConfigurationMap.getDataUri(), this.Camera2StreamConfigurationMap.getMetaData(), this.Camera2StreamConfigurationMap.getContent(), new org.bouncycastle.asn1.cms.Evidence(new org.bouncycastle.asn1.cms.TimeStampTokenEvidence(timeStampAndCRLArr2)))));
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
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(digestCalculatorProvider, bArr, timeStampToken);
    }

    public void validate(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws org.bouncycastle.tsp.cms.ImprintDigestInvalidException, org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(digestCalculatorProvider, bArr);
    }

    public org.bouncycastle.tsp.TimeStampToken[] getTimeStampTokens() throws org.bouncycastle.cms.CMSException {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
    }

    public org.bouncycastle.operator.DigestCalculator getMessageImprintDigestCalculator(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.operator.OperatorCreationException {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(digestCalculatorProvider);
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public java.net.URI getDataUri() throws java.net.URISyntaxException {
        org.bouncycastle.asn1.DERIA5String dataUri = this.Camera2StreamConfigurationMap.getDataUri();
        if (dataUri != null) {
            return new java.net.URI(dataUri.getString());
        }
        return null;
    }

    public byte[] getContent() {
        if (this.Camera2StreamConfigurationMap.getContent() != null) {
            return this.Camera2StreamConfigurationMap.getContent().getOctets();
        }
        return null;
    }

    public byte[] calculateNextHash(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(digestCalculator);
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo;
        if (!org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData.equals((org.bouncycastle.asn1.ASN1Primitive) contentInfo.getContentType())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed content - type must be ");
            sb.append(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData.getId());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.cms.TimeStampedData timeStampedData = org.bouncycastle.asn1.cms.TimeStampedData.getInstance(contentInfo.getContent());
        this.Camera2StreamConfigurationMap = timeStampedData;
        this.getHighSpeedVideoSizes = new org.bouncycastle.tsp.cms.TimeStampDataUtil(timeStampedData);
    }

    public CMSTimeStampedData(byte[] bArr) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public CMSTimeStampedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        Camera2StreamConfigurationMap(contentInfo);
    }

    public CMSTimeStampedData(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.ContentInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
        } catch (java.lang.ClassCastException e) {
            throw new java.io.IOException("Malformed content: ".concat(java.lang.String.valueOf(e)));
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.io.IOException("Malformed content: ".concat(java.lang.String.valueOf(e2)));
        }
    }
}
