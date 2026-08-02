package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public class SMimeMultipartContext implements org.bouncycastle.mime.MimeMultipartContext {
    private final org.bouncycastle.mime.smime.SMimeParserContext Camera2StreamConfigurationMap;
    org.bouncycastle.operator.DigestCalculator[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.mime.MimeContext
    public java.io.InputStream applyContext(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public org.bouncycastle.mime.MimeContext createContext(final int i) throws java.io.IOException {
        return new org.bouncycastle.mime.MimeContext() { // from class: org.bouncycastle.mime.smime.SMimeMultipartContext.1
            @Override // org.bouncycastle.mime.MimeContext
            public java.io.InputStream applyContext(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
                java.io.OutputStream outputStream;
                if (i != 0) {
                    return inputStream;
                }
                org.bouncycastle.mime.smime.SMimeMultipartContext sMimeMultipartContext = org.bouncycastle.mime.smime.SMimeMultipartContext.this;
                org.bouncycastle.operator.DigestCalculator[] digestCalculatorArr = sMimeMultipartContext.getHighSpeedVideoSizes;
                int i2 = 1;
                if (digestCalculatorArr.length == 1) {
                    outputStream = digestCalculatorArr[0].getOutputStream();
                } else {
                    java.io.OutputStream outputStream2 = digestCalculatorArr[0].getOutputStream();
                    while (i2 < sMimeMultipartContext.getHighSpeedVideoSizes.length) {
                        org.bouncycastle.util.io.TeeOutputStream teeOutputStream = new org.bouncycastle.util.io.TeeOutputStream(sMimeMultipartContext.getHighSpeedVideoSizes[i2].getOutputStream(), outputStream2);
                        i2++;
                        outputStream2 = teeOutputStream;
                    }
                    outputStream = outputStream2;
                }
                headers.dumpHeaders(outputStream);
                outputStream.write(13);
                outputStream.write(10);
                return new org.bouncycastle.util.io.TeeInputStream(inputStream, new org.bouncycastle.mime.CanonicalOutputStream(org.bouncycastle.mime.smime.SMimeMultipartContext.this.Camera2StreamConfigurationMap, headers, outputStream));
            }
        };
    }

    private org.bouncycastle.operator.DigestCalculator[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.mime.Headers headers) {
        try {
            java.lang.String str = headers.getContentTypeAttributes().get("micalg");
            if (str == null) {
                throw new java.lang.IllegalStateException("No micalg field on content-type header");
            }
            java.lang.String[] split = str.substring(str.indexOf(61) + 1).split(",");
            org.bouncycastle.operator.DigestCalculator[] digestCalculatorArr = new org.bouncycastle.operator.DigestCalculator[split.length];
            for (int i = 0; i < split.length; i++) {
                digestCalculatorArr[i] = this.Camera2StreamConfigurationMap.getDigestCalculatorProvider().get(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.mime.smime.SMimeUtils.getHighSpeedVideoFpsRanges(org.bouncycastle.mime.smime.SMimeUtils.getHighResolutionOutputSizeshNQ4ISI(split[i]).trim())));
            }
            return digestCalculatorArr;
        } catch (org.bouncycastle.operator.OperatorCreationException unused) {
            return null;
        }
    }

    public SMimeMultipartContext(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.mime.smime.SMimeParserContext) mimeParserContext;
        this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(headers);
    }
}
