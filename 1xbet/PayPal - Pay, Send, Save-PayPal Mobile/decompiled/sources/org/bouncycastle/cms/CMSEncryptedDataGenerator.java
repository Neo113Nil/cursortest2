package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEncryptedDataGenerator extends org.bouncycastle.cms.CMSEncryptedGenerator {
    public org.bouncycastle.cms.CMSEncryptedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        return getHighSpeedVideoFpsRangesFor(cMSTypedData, outputEncryptor);
    }

    private org.bouncycastle.cms.CMSEncryptedData getHighSpeedVideoFpsRangesFor(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            return new org.bouncycastle.cms.CMSEncryptedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.encryptedData, new org.bouncycastle.asn1.cms.EncryptedData(new org.bouncycastle.asn1.cms.EncryptedContentInfo(cMSTypedData.getContentType(), outputEncryptor.getAlgorithmIdentifier(), new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream.toByteArray())), this.unprotectedAttributeGenerator != null ? new org.bouncycastle.asn1.BERSet(this.unprotectedAttributeGenerator.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector()) : null)));
        } catch (java.io.IOException unused) {
            throw new org.bouncycastle.cms.CMSException("");
        }
    }
}
