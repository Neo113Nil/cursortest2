package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
public class SMIMESignedWriter extends org.bouncycastle.mime.MimeWriter {
    public static final java.util.Map RFC3851_MICALGS;
    public static final java.util.Map RFC5751_MICALGS;
    public static final java.util.Map STANDARD_MICALGS;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.cms.CMSSignedDataStreamGenerator getHighSpeedVideoFpsRangesFor;
    private final java.io.OutputStream getHighSpeedVideoSizes;

    public static class Builder {
        java.lang.String getHighSpeedVideoSizes;
        private final org.bouncycastle.cms.CMSSignedDataStreamGenerator getHighSpeedVideoSizesFor;
        private final boolean getInputFormats;
        private final java.util.Map<java.lang.String, java.lang.String> getOutputFormats;
        private final java.util.Map getOutputMinFrameDuration;
        private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"Content-Type"};
        private static final java.lang.String[] Camera2StreamConfigurationMap = {"multipart/signed; protocol=\"application/pkcs7-signature\""};
        private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"Content-Type", "Content-Disposition", "Content-Transfer-Encoding", "Content-Description"};
        private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"application/pkcs7-mime; name=\"smime.p7m\"; smime-type=enveloped-data", "attachment; filename=\"smime.p7m\"", "base64", "S/MIME Signed Message"};

        public org.bouncycastle.mime.smime.SMIMESignedWriter build(java.io.OutputStream outputStream) {
            java.lang.String obj;
            int i;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int i2 = 0;
            if (!this.getInputFormats) {
                java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("==");
                sb.append(new java.math.BigInteger(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, secureRandom).setBit(179).toString(16));
                sb.append("=");
                obj = sb.toString();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(Camera2StreamConfigurationMap[0]);
                java.util.Iterator<org.bouncycastle.asn1.x509.AlgorithmIdentifier> it = this.getHighSpeedVideoSizesFor.getDigestAlgorithms().iterator();
                java.util.TreeSet treeSet = new java.util.TreeSet();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) this.getOutputMinFrameDuration.get(it.next().getAlgorithm());
                    if (str == null) {
                        str = "unknown";
                    }
                    treeSet.add(str);
                }
                java.util.Iterator it2 = treeSet.iterator();
                int i3 = 0;
                while (true) {
                    i = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.String str2 = (java.lang.String) it2.next();
                    if (i3 == 0) {
                        stringBuffer.append(treeSet.size() != 1 ? "; micalg=\"" : "; micalg=");
                    } else {
                        stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    }
                    stringBuffer.append(str2);
                    i3++;
                }
                if (i3 != 0 && treeSet.size() != 1) {
                    stringBuffer.append('\"');
                }
                stringBuffer.append(";\r\n\tboundary=\"");
                stringBuffer.append(obj);
                stringBuffer.append("\"");
                linkedHashMap.put(getHighResolutionOutputSizeshNQ4ISI[0], stringBuffer.toString());
                while (true) {
                    java.lang.String[] strArr = getHighResolutionOutputSizeshNQ4ISI;
                    if (i >= strArr.length) {
                        break;
                    }
                    linkedHashMap.put(strArr[i], Camera2StreamConfigurationMap[i]);
                    i++;
                }
            } else {
                while (true) {
                    java.lang.String[] strArr2 = getHighSpeedVideoFpsRangesFor;
                    if (i2 == strArr2.length) {
                        break;
                    }
                    linkedHashMap.put(strArr2[i2], getHighSpeedVideoFpsRanges[i2]);
                    i2++;
                }
                obj = null;
            }
            java.lang.String str3 = obj;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.getOutputFormats.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return new org.bouncycastle.mime.smime.SMIMESignedWriter(this, linkedHashMap, str3, org.bouncycastle.mime.smime.SMimeUtils.getHighResolutionOutputSizeshNQ4ISI(outputStream), (byte) 0);
        }

        public org.bouncycastle.mime.smime.SMIMESignedWriter.Builder withHeader(java.lang.String str, java.lang.String str2) {
            this.getOutputFormats.put(str, str2);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMESignedWriter.Builder addSignerInfoGenerator(org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator) {
            this.getHighSpeedVideoSizesFor.addSignerInfoGenerator(signerInfoGenerator);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMESignedWriter.Builder addCertificates(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
            this.getHighSpeedVideoSizesFor.addCertificates(store);
            return this;
        }

        public org.bouncycastle.mime.smime.SMIMESignedWriter.Builder addCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cms.CMSException {
            this.getHighSpeedVideoSizesFor.addCertificate(x509CertificateHolder);
            return this;
        }

        public Builder(boolean z) {
            this.getHighSpeedVideoSizesFor = new org.bouncycastle.cms.CMSSignedDataStreamGenerator();
            this.getOutputFormats = new java.util.LinkedHashMap();
            this.getOutputMinFrameDuration = org.bouncycastle.mime.smime.SMIMESignedWriter.STANDARD_MICALGS;
            this.getHighSpeedVideoSizes = "base64";
            this.getInputFormats = z;
        }

        public Builder() {
            this(false);
        }
    }

    class ContentOutputStream extends java.io.OutputStream {
        private final java.io.OutputStream Camera2StreamConfigurationMap;
        private final java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
        private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;
        private final java.io.ByteArrayOutputStream getHighSpeedVideoSizes;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (org.bouncycastle.mime.smime.SMIMESignedWriter.this.Camera2StreamConfigurationMap != null) {
                this.Camera2StreamConfigurationMap.close();
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("\r\n--"));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray(org.bouncycastle.mime.smime.SMIMESignedWriter.this.Camera2StreamConfigurationMap));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray(io.ktor.sse.ServerSentEventKt.END_OF_LINE));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("Content-Type: application/pkcs7-signature; name=\"smime.p7s\"\r\n"));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("Content-Transfer-Encoding: base64\r\n"));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("Content-Disposition: attachment; filename=\"smime.p7s\"\r\n"));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray(io.ktor.sse.ServerSentEventKt.END_OF_LINE));
                java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor;
                if (outputStream != null) {
                    outputStream.close();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.write(this.getHighSpeedVideoSizes.toByteArray());
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("\r\n--"));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray(org.bouncycastle.mime.smime.SMIMESignedWriter.this.Camera2StreamConfigurationMap));
                this.getHighResolutionOutputSizeshNQ4ISI.write(org.bouncycastle.util.Strings.toByteArray("--\r\n"));
            }
            java.io.OutputStream outputStream2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (outputStream2 != null) {
                outputStream2.close();
            }
        }

        ContentOutputStream(java.io.OutputStream outputStream, java.io.OutputStream outputStream2, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.OutputStream outputStream3) {
            this.Camera2StreamConfigurationMap = outputStream;
            this.getHighResolutionOutputSizeshNQ4ISI = outputStream2;
            this.getHighSpeedVideoSizes = byteArrayOutputStream;
            this.getHighSpeedVideoFpsRangesFor = outputStream3;
        }
    }

    @Override // org.bouncycastle.mime.MimeWriter
    public java.io.OutputStream getContentStream() throws java.io.IOException {
        this.headers.dumpHeaders(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes.write(org.bouncycastle.util.Strings.toByteArray(io.ktor.sse.ServerSentEventKt.END_OF_LINE));
        if (this.Camera2StreamConfigurationMap == null) {
            return null;
        }
        this.getHighSpeedVideoSizes.write(org.bouncycastle.util.Strings.toByteArray("This is an S/MIME signed message\r\n"));
        this.getHighSpeedVideoSizes.write(org.bouncycastle.util.Strings.toByteArray("\r\n--"));
        this.getHighSpeedVideoSizes.write(org.bouncycastle.util.Strings.toByteArray(this.Camera2StreamConfigurationMap));
        this.getHighSpeedVideoSizes.write(org.bouncycastle.util.Strings.toByteArray(io.ktor.sse.ServerSentEventKt.END_OF_LINE));
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        org.bouncycastle.mime.encoding.Base64OutputStream base64OutputStream = new org.bouncycastle.mime.encoding.Base64OutputStream(byteArrayOutputStream);
        return new org.bouncycastle.mime.smime.SMIMESignedWriter.ContentOutputStream(this.getHighSpeedVideoFpsRangesFor.open((java.io.OutputStream) base64OutputStream, false, org.bouncycastle.mime.smime.SMimeUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes)), this.getHighSpeedVideoSizes, byteArrayOutputStream, base64OutputStream);
    }

    /* synthetic */ SMIMESignedWriter(org.bouncycastle.mime.smime.SMIMESignedWriter.Builder builder, java.util.Map map, java.lang.String str, java.io.OutputStream outputStream, byte b) {
        this(builder, map, str, outputStream);
    }

    private SMIMESignedWriter(org.bouncycastle.mime.smime.SMIMESignedWriter.Builder builder, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.io.OutputStream outputStream) {
        super(new org.bouncycastle.mime.Headers(mapToLines(map), builder.getHighSpeedVideoSizes));
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = outputStream;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.MD5, "md5");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA1, "sha-1");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA224, "sha-224");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA256, "sha-256");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA384, "sha-384");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA512, "sha-512");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411, "gostr3411-94");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
        RFC5751_MICALGS = unmodifiableMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.MD5, "md5");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA1, "sha1");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA224, "sha224");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA256, "sha256");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA384, "sha384");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA512, "sha512");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411, "gostr3411-94");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
        RFC3851_MICALGS = java.util.Collections.unmodifiableMap(hashMap2);
        STANDARD_MICALGS = unmodifiableMap;
    }
}
