package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthEnvelopedDataGenerator extends org.bouncycastle.cms.CMSAuthEnvelopedGenerator {
    public org.bouncycastle.cms.CMSAuthEnvelopedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputAEADEncryptor outputAEADEncryptor) throws org.bouncycastle.cms.CMSException {
        return getHighSpeedVideoSizes(cMSTypedData, outputAEADEncryptor);
    }

    private org.bouncycastle.cms.CMSAuthEnvelopedData getHighSpeedVideoSizes(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputAEADEncryptor outputAEADEncryptor) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.DERSet dERSet;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.OutputStream outputStream = outputAEADEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            if (this.authAttrsGenerator != null) {
                dERSet = new org.bouncycastle.asn1.DERSet(this.authAttrsGenerator.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector());
                outputAEADEncryptor.getAADStream().write(dERSet.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            } else {
                dERSet = null;
            }
            outputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] mac = outputAEADEncryptor.getMAC();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = outputAEADEncryptor.getAlgorithmIdentifier();
            org.bouncycastle.asn1.BEROctetString bEROctetString = new org.bouncycastle.asn1.BEROctetString(byteArray);
            org.bouncycastle.operator.GenericKey key = outputAEADEncryptor.getKey();
            java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((org.bouncycastle.cms.RecipientInfoGenerator) it.next()).generate(key));
            }
            return new org.bouncycastle.cms.CMSAuthEnvelopedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.authEnvelopedData, new org.bouncycastle.asn1.cms.AuthEnvelopedData(this.originatorInfo, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector), new org.bouncycastle.asn1.cms.EncryptedContentInfo(cMSTypedData.getContentType(), algorithmIdentifier, bEROctetString), dERSet, new org.bouncycastle.asn1.DEROctetString(mac), this.unauthAttrsGenerator != null ? new org.bouncycastle.asn1.DLSet(this.unauthAttrsGenerator.getAttributes(java.util.Collections.EMPTY_MAP).toASN1EncodableVector()) : null)));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process authenticated content: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }
}
