package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
public class CMSTimeStampedDataGenerator extends org.bouncycastle.tsp.cms.CMSTimeStampedGenerator {
    public org.bouncycastle.tsp.cms.CMSTimeStampedData generate(org.bouncycastle.tsp.TimeStampToken timeStampToken, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        return generate(timeStampToken, new java.io.ByteArrayInputStream(bArr));
    }

    public org.bouncycastle.tsp.cms.CMSTimeStampedData generate(org.bouncycastle.tsp.TimeStampToken timeStampToken, java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (inputStream != null) {
            try {
                org.bouncycastle.util.io.Streams.pipeAll(inputStream, byteArrayOutputStream);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encapsulating content: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        return new org.bouncycastle.tsp.cms.CMSTimeStampedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.timestampedData, new org.bouncycastle.asn1.cms.TimeStampedData(this.dataUri != null ? new org.bouncycastle.asn1.DERIA5String(this.dataUri.toString()) : null, this.metaData, byteArrayOutputStream.size() != 0 ? new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream.toByteArray()) : null, new org.bouncycastle.asn1.cms.Evidence(new org.bouncycastle.asn1.cms.TimeStampTokenEvidence(new org.bouncycastle.asn1.cms.TimeStampAndCRL(timeStampToken.toCMSSignedData().toASN1Structure()))))));
    }

    public org.bouncycastle.tsp.cms.CMSTimeStampedData generate(org.bouncycastle.tsp.TimeStampToken timeStampToken) throws org.bouncycastle.cms.CMSException {
        return generate(timeStampToken, (java.io.InputStream) null);
    }
}
