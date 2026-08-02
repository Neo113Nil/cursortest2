package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEncryptedData {
    private org.bouncycastle.asn1.cms.EncryptedData getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.cms.CMSTypedStream getContentStream(org.bouncycastle.operator.InputDecryptorProvider inputDecryptorProvider) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.asn1.cms.EncryptedContentInfo encryptedContentInfo = this.getHighResolutionOutputSizeshNQ4ISI.getEncryptedContentInfo();
            return new org.bouncycastle.cms.CMSTypedStream(encryptedContentInfo.getContentType(), inputDecryptorProvider.get(encryptedContentInfo.getContentEncryptionAlgorithm()).getInputStream(new java.io.ByteArrayInputStream(encryptedContentInfo.getEncryptedContent().getOctets())));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create stream: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public byte[] getContent(org.bouncycastle.operator.InputDecryptorProvider inputDecryptorProvider) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(getContentStream(inputDecryptorProvider).getContentStream());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse internal stream: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public CMSEncryptedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoFpsRanges = contentInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.EncryptedData.getInstance(contentInfo.getContent());
    }
}
