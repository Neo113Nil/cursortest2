package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEnvelopedDataGenerator extends org.bouncycastle.cms.CMSEnvelopedGenerator {
    public org.bouncycastle.cms.CMSEnvelopedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        return getHighSpeedVideoFpsRangesFor(cMSTypedData, outputEncryptor);
    }

    private org.bouncycastle.cms.CMSEnvelopedData getHighSpeedVideoFpsRangesFor(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            if (outputEncryptor instanceof org.bouncycastle.operator.OutputAEADEncryptor) {
                byte[] mac = ((org.bouncycastle.operator.OutputAEADEncryptor) outputEncryptor).getMAC();
                byteArrayOutputStream.write(mac, 0, mac.length);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = outputEncryptor.getAlgorithmIdentifier();
            org.bouncycastle.asn1.BEROctetString bEROctetString = new org.bouncycastle.asn1.BEROctetString(byteArray);
            org.bouncycastle.operator.GenericKey key = outputEncryptor.getKey();
            java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((org.bouncycastle.cms.RecipientInfoGenerator) it.next()).generate(key));
            }
            return new org.bouncycastle.cms.CMSEnvelopedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.envelopedData, new org.bouncycastle.asn1.cms.EnvelopedData(this.originatorInfo, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector), new org.bouncycastle.asn1.cms.EncryptedContentInfo(cMSTypedData.getContentType(), algorithmIdentifier, bEROctetString), this.unprotectedAttributeGenerator != null ? new org.bouncycastle.asn1.BERSet(this.unprotectedAttributeGenerator.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector()) : null)));
        } catch (java.io.IOException unused) {
            throw new org.bouncycastle.cms.CMSException("");
        }
    }
}
