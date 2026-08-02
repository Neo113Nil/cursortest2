package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEnvelopedData implements org.bouncycastle.util.Encodable {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    org.bouncycastle.cms.RecipientInformationStore getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.cms.OriginatorInformation getHighSpeedVideoSizes;

    public byte[] getEncryptionAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.Camera2StreamConfigurationMap.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnprotectedAttributes() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRanges;
        if (aSN1Set == null) {
            return null;
        }
        return new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
    }

    public org.bouncycastle.cms.RecipientInformationStore getRecipientInfos() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.cms.OriginatorInformation getOriginatorInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getEncryptionAlgOID() {
        return this.Camera2StreamConfigurationMap.getAlgorithm().getId();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public CMSEnvelopedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSEnvelopedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo;
        try {
            org.bouncycastle.asn1.cms.EnvelopedData envelopedData = org.bouncycastle.asn1.cms.EnvelopedData.getInstance(contentInfo.getContent());
            if (envelopedData.getOriginatorInfo() != null) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.cms.OriginatorInformation(envelopedData.getOriginatorInfo());
            }
            org.bouncycastle.asn1.ASN1Set recipientInfos = envelopedData.getRecipientInfos();
            org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo = envelopedData.getEncryptedContentInfo();
            this.Camera2StreamConfigurationMap = encryptedContentInfo.getContentEncryptionAlgorithm();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSEnvelopedHelper.getHighResolutionOutputSizeshNQ4ISI(recipientInfos, this.Camera2StreamConfigurationMap, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSEnvelopedSecureReadable(this.Camera2StreamConfigurationMap, encryptedContentInfo.getContentType(), new org.bouncycastle.cms.CMSProcessableByteArray(encryptedContentInfo.getEncryptedContent().getOctets())));
            this.getHighSpeedVideoFpsRanges = envelopedData.getUnprotectedAttrs();
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e2);
        }
    }

    public CMSEnvelopedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
