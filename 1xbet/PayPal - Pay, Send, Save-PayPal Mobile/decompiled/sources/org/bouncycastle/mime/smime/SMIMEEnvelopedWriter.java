package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public class SMIMEEnvelopedWriter extends org.bouncycastle.mime.MimeWriter {
    private final java.io.OutputStream Camera2StreamConfigurationMap;
    private final org.bouncycastle.operator.OutputEncryptor getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private final org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator Camera2StreamConfigurationMap = new org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator();
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        java.lang.String getHighSpeedVideoSizes = "base64";
        private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"Content-Type", "Content-Disposition", "Content-Transfer-Encoding", "Content-Description"};
        private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"application/pkcs7-mime; name=\"smime.p7m\"; smime-type=enveloped-data", "attachment; filename=\"smime.p7m\"", "base64", "S/MIME Encrypted Message"};

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder withHeader(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges.put(str, str2);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder setUnprotectedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
            this.Camera2StreamConfigurationMap.setUnprotectedAttributeGenerator(cMSAttributeTableGenerator);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder setOriginatorInfo(org.bouncycastle.cms.OriginatorInformation originatorInformation) {
            this.Camera2StreamConfigurationMap.setOriginatorInfo(originatorInformation);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder setBufferSize(int i) {
            this.Camera2StreamConfigurationMap.setBufferSize(i);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter build(java.io.OutputStream outputStream, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
            return new org.bouncycastle.mime.smime.SMIMEEnvelopedWriter(this, outputEncryptor, org.bouncycastle.mime.smime.SMimeUtils.getHighResolutionOutputSizeshNQ4ISI(outputStream), (byte) 0);
        }

        public org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder addRecipientInfoGenerator(org.bouncycastle.cms.RecipientInfoGenerator recipientInfoGenerator) {
            this.Camera2StreamConfigurationMap.addRecipientInfoGenerator(recipientInfoGenerator);
            return this;
        }

        public Builder() {
            int i = 0;
            while (true) {
                java.lang.String[] strArr = getHighSpeedVideoFpsRangesFor;
                if (i == strArr.length) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges.put(strArr[i], getHighResolutionOutputSizeshNQ4ISI[i]);
                i++;
            }
        }
    }

    class ContentOutputStream extends java.io.OutputStream {
        private final java.io.OutputStream getHighSpeedVideoFpsRanges;
        private final java.io.OutputStream getHighSpeedVideoSizes;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.getHighSpeedVideoSizes.close();
            java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRanges;
            if (outputStream != null) {
                outputStream.close();
            }
        }

        ContentOutputStream(java.io.OutputStream outputStream, java.io.OutputStream outputStream2) {
            this.getHighSpeedVideoSizes = outputStream;
            this.getHighSpeedVideoFpsRanges = outputStream2;
        }
    }

    @Override // org.bouncycastle.mime.MimeWriter
    public java.io.OutputStream getContentStream() throws java.io.IOException {
        this.headers.dumpHeaders(this.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap.write(org.bouncycastle.util.Strings.toByteArray(io.ktor.sse.ServerSentEventKt.END_OF_LINE));
        try {
            java.io.OutputStream outputStream = this.Camera2StreamConfigurationMap;
            if ("base64".equals(this.getHighSpeedVideoFpsRangesFor)) {
                outputStream = new org.bouncycastle.mime.encoding.Base64OutputStream(outputStream);
            }
            return new org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.ContentOutputStream(this.getHighSpeedVideoFpsRanges.open(org.bouncycastle.mime.smime.SMimeUtils.getHighSpeedVideoFpsRanges(outputStream), this.getHighResolutionOutputSizeshNQ4ISI), outputStream);
        } catch (org.bouncycastle.cms.CMSException e) {
            throw new org.bouncycastle.mime.MimeIOException(e.getMessage(), e);
        }
    }

    /* synthetic */ SMIMEEnvelopedWriter(org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder builder, org.bouncycastle.operator.OutputEncryptor outputEncryptor, java.io.OutputStream outputStream, byte b) {
        this(builder, outputEncryptor, outputStream);
    }

    private SMIMEEnvelopedWriter(org.bouncycastle.mime.smime.SMIMEEnvelopedWriter.Builder builder, org.bouncycastle.operator.OutputEncryptor outputEncryptor, java.io.OutputStream outputStream) {
        super(new org.bouncycastle.mime.Headers(mapToLines(builder.getHighSpeedVideoFpsRanges), builder.getHighSpeedVideoSizes));
        this.getHighSpeedVideoFpsRanges = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = outputEncryptor;
        this.Camera2StreamConfigurationMap = outputStream;
    }
}
