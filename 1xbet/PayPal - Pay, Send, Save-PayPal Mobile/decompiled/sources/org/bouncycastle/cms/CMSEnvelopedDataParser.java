package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEnvelopedDataParser extends org.bouncycastle.cms.CMSContentInfoParser {
    org.bouncycastle.asn1.cms.EnvelopedDataParser Camera2StreamConfigurationMap;
    private org.bouncycastle.cms.OriginatorInformation getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.cms.RecipientInformationStore getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.cms.AttributeTable getInputFormats;

    public byte[] getEncryptionAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.getHighSpeedVideoSizes.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnprotectedAttributes() throws java.io.IOException {
        if (this.getInputFormats == null && this.getHighSpeedVideoFpsRangesFor) {
            org.bouncycastle.asn1.ASN1SetParser unprotectedAttrs = this.Camera2StreamConfigurationMap.getUnprotectedAttrs();
            this.getHighSpeedVideoFpsRangesFor = false;
            if (unprotectedAttrs != null) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                while (true) {
                    org.bouncycastle.asn1.ASN1Encodable readObject = unprotectedAttrs.readObject();
                    if (readObject == null) {
                        break;
                    }
                    aSN1EncodableVector.add(((org.bouncycastle.asn1.ASN1SequenceParser) readObject).toASN1Primitive());
                }
                this.getInputFormats = new org.bouncycastle.asn1.cms.AttributeTable(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector));
            }
        }
        return this.getInputFormats;
    }

    public org.bouncycastle.cms.RecipientInformationStore getRecipientInfos() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.cms.OriginatorInformation getOriginatorInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getEncryptionAlgOID() {
        return this.getHighSpeedVideoSizes.getAlgorithm().toString();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public CMSEnvelopedDataParser(byte[] bArr) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public CMSEnvelopedDataParser(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        super(inputStream);
        this.getHighSpeedVideoFpsRangesFor = true;
        org.bouncycastle.asn1.cms.EnvelopedDataParser envelopedDataParser = new org.bouncycastle.asn1.cms.EnvelopedDataParser((org.bouncycastle.asn1.ASN1SequenceParser) this._contentInfo.getContent(16));
        this.Camera2StreamConfigurationMap = envelopedDataParser;
        org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo = envelopedDataParser.getOriginatorInfo();
        if (originatorInfo != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.OriginatorInformation(originatorInfo);
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(this.Camera2StreamConfigurationMap.getRecipientInfos().toASN1Primitive());
        org.bouncycastle.asn1.cms.EncryptedContentInfoParser encryptedContentInfo = this.Camera2StreamConfigurationMap.getEncryptedContentInfo();
        this.getHighSpeedVideoSizes = encryptedContentInfo.getContentEncryptionAlgorithm();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.cms.CMSEnvelopedHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1Set, this.getHighSpeedVideoSizes, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSEnvelopedSecureReadable(this.getHighSpeedVideoSizes, encryptedContentInfo.getContentType(), new org.bouncycastle.cms.CMSProcessableInputStream(((org.bouncycastle.asn1.ASN1OctetStringParser) encryptedContentInfo.getEncryptedContent(4)).getOctetStream())));
    }
}
