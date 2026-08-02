package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSCompressedDataGenerator {
    public static final java.lang.String ZLIB = "1.2.840.113549.1.9.16.3.8";

    public org.bouncycastle.cms.CMSCompressedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, org.bouncycastle.operator.OutputCompressor outputCompressor) throws org.bouncycastle.cms.CMSException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.OutputStream outputStream = outputCompressor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            return new org.bouncycastle.cms.CMSCompressedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.compressedData, new org.bouncycastle.asn1.cms.CompressedData(outputCompressor.getAlgorithmIdentifier(), new org.bouncycastle.asn1.cms.ContentInfo(cMSTypedData.getContentType(), new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream.toByteArray())))));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("exception encoding data.", e);
        }
    }
}
