package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public abstract class SMimeParserListener implements org.bouncycastle.mime.MimeParserListener {
    private org.bouncycastle.mime.smime.SMimeMultipartContext getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.DigestCalculator[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.mime.MimeParserListener
    public org.bouncycastle.mime.MimeContext createContext(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers) {
        if (!headers.isMultipart()) {
            return new org.bouncycastle.mime.ConstantMimeContext();
        }
        org.bouncycastle.mime.smime.SMimeMultipartContext sMimeMultipartContext = new org.bouncycastle.mime.smime.SMimeMultipartContext(mimeParserContext, headers);
        this.getHighResolutionOutputSizeshNQ4ISI = sMimeMultipartContext;
        this.getHighSpeedVideoFpsRangesFor = sMimeMultipartContext.getHighSpeedVideoSizes;
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void signedData(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, org.bouncycastle.util.Store store, org.bouncycastle.util.Store store2, org.bouncycastle.util.Store store3, org.bouncycastle.cms.SignerInformationStore signerInformationStore) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        throw new java.lang.IllegalStateException("signedData handling not implemented");
    }

    @Override // org.bouncycastle.mime.MimeParserListener
    public void object(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
        try {
            if (!headers.getContentType().equals("application/pkcs7-signature") && !headers.getContentType().equals("application/x-pkcs7-signature")) {
                if (!headers.getContentType().equals("application/pkcs7-mime") && !headers.getContentType().equals("application/x-pkcs7-mime")) {
                    content(mimeParserContext, headers, inputStream);
                    return;
                }
                org.bouncycastle.cms.CMSEnvelopedDataParser cMSEnvelopedDataParser = new org.bouncycastle.cms.CMSEnvelopedDataParser(inputStream);
                envelopedData(mimeParserContext, headers, cMSEnvelopedDataParser.getOriginatorInfo(), cMSEnvelopedDataParser.getRecipientInfos());
                cMSEnvelopedDataParser.close();
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int i = 0;
            while (true) {
                org.bouncycastle.operator.DigestCalculator[] digestCalculatorArr = this.getHighSpeedVideoFpsRangesFor;
                if (i == digestCalculatorArr.length) {
                    org.bouncycastle.cms.CMSSignedData cMSSignedData = new org.bouncycastle.cms.CMSSignedData(hashMap, org.bouncycastle.util.io.Streams.readAll(inputStream));
                    signedData(mimeParserContext, headers, cMSSignedData.getCertificates(), cMSSignedData.getCRLs(), cMSSignedData.getAttributeCertificates(), cMSSignedData.getSignerInfos());
                    return;
                } else {
                    digestCalculatorArr[i].getOutputStream().close();
                    hashMap.put(this.getHighSpeedVideoFpsRangesFor[i].getAlgorithmIdentifier().getAlgorithm(), this.getHighSpeedVideoFpsRangesFor[i].getDigest());
                    i++;
                }
            }
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CMS failure: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.mime.MimeIOException(sb.toString(), e);
        }
    }

    public void envelopedData(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, org.bouncycastle.cms.OriginatorInformation originatorInformation, org.bouncycastle.cms.RecipientInformationStore recipientInformationStore) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        throw new java.lang.IllegalStateException("envelopedData handling not implemented");
    }

    public void content(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
        throw new java.lang.IllegalStateException("content handling not implemented");
    }
}
