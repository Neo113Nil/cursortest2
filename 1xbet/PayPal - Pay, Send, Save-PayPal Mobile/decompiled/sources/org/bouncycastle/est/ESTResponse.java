package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTResponse {
    private static final java.lang.Long Camera2StreamConfigurationMap = 0L;
    private java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Long getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.est.HttpUtil.Headers getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private final org.bouncycastle.est.ESTRequest getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private long getInputSizeshNQ4ISI = 0;
    private java.io.InputStream getOutputFormats;
    private final org.bouncycastle.est.Source getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private int getOutputStallDuration;

    public ESTResponse(org.bouncycastle.est.ESTRequest eSTRequest, org.bouncycastle.est.Source source) throws java.io.IOException {
        this.getHighSpeedVideoSizesFor = eSTRequest;
        this.getOutputMinFrameDuration = source;
        if (source instanceof org.bouncycastle.est.LimitedSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.est.LimitedSource) source).getAbsoluteReadLimit();
        }
        java.util.Set<java.lang.String> asKeySet = org.bouncycastle.util.Properties.asKeySet("org.bouncycastle.debug.est");
        this.getOutputFormats = (asKeySet.contains("input") || asKeySet.contains("all")) ? new org.bouncycastle.est.ESTResponse.PrintingInputStream(this, source.getInputStream(), (byte) 0) : source.getInputStream();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.est.HttpUtil.Headers();
        this.getInputFormats = new byte[1024];
        this.getHighSpeedVideoSizes = readStringIncluding(' ');
        this.getOutputStallDuration = java.lang.Integer.parseInt(readStringIncluding(' '));
        this.getOutputMinFrameDurationlomOqCM = readStringIncluding('\n');
        while (true) {
            java.lang.String readStringIncluding = readStringIncluding('\n');
            if (readStringIncluding.length() <= 0) {
                break;
            }
            int indexOf = readStringIncluding.indexOf(58);
            if (indexOf >= 0) {
                java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(readStringIncluding.substring(0, indexOf).trim());
                org.bouncycastle.est.HttpUtil.Headers headers = this.getHighSpeedVideoFpsRangesFor;
                headers.put(lowerCase, org.bouncycastle.est.HttpUtil.Camera2StreamConfigurationMap(headers.get(lowerCase), readStringIncluding.substring(indexOf + 1).trim()));
            }
        }
        java.lang.Long contentLength = getContentLength();
        this.getHighSpeedVideoFpsRanges = contentLength;
        int i = this.getOutputStallDuration;
        if (i == 204 || i == 202) {
            if (contentLength == null) {
                this.getHighSpeedVideoFpsRanges = 0L;
            } else if (i == 204 && contentLength.longValue() > 0) {
                throw new java.io.IOException("Got HTTP status 204 but Content-length > 0.");
            }
        }
        java.lang.Long l = this.getHighSpeedVideoFpsRanges;
        if (l == null) {
            throw new java.io.IOException("No Content-length header.");
        }
        if (l.equals(Camera2StreamConfigurationMap)) {
            this.getOutputFormats = new java.io.InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() throws java.io.IOException {
                    return -1;
                }
            };
        }
        if (this.getHighSpeedVideoFpsRanges.longValue() < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Server returned negative content length: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.io.IOException(sb.toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRanges.longValue() < this.getHighResolutionOutputSizeshNQ4ISI.longValue()) {
            this.getOutputFormats = wrapWithCounter(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
            if ("base64".equalsIgnoreCase(getHeader("content-transfer-encoding"))) {
                this.getOutputFormats = new org.bouncycastle.est.CTEBase64InputStream(this.getOutputFormats, getContentLength());
                return;
            }
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Content length longer than absolute read limit: ");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(" Content-Length: ");
        sb2.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb2.toString());
    }

    public java.lang.Long getContentLength() {
        org.bouncycastle.est.HttpUtil.Headers headers = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String highResolutionOutputSizeshNQ4ISI = headers.getHighResolutionOutputSizeshNQ4ISI("Content-Length");
        java.lang.String[] strArr = highResolutionOutputSizeshNQ4ISI == null ? null : headers.get(highResolutionOutputSizeshNQ4ISI);
        java.lang.String str = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (str == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } catch (java.lang.RuntimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content Length: '");
            sb.append(str);
            sb.append("' invalid. ");
            sb.append(e.getMessage());
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    public java.lang.String getHeader(java.lang.String str) {
        org.bouncycastle.est.HttpUtil.Headers headers = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String highResolutionOutputSizeshNQ4ISI = headers.getHighResolutionOutputSizeshNQ4ISI(str);
        java.lang.String[] strArr = highResolutionOutputSizeshNQ4ISI == null ? null : headers.get(highResolutionOutputSizeshNQ4ISI);
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    protected java.io.InputStream wrapWithCounter(final java.io.InputStream inputStream, final java.lang.Long l) {
        return new java.io.InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream
            public int read() throws java.io.IOException {
                int read = inputStream.read();
                if (read >= 0) {
                    org.bouncycastle.est.ESTResponse.getHighSpeedVideoFpsRangesFor(org.bouncycastle.est.ESTResponse.this);
                    if (l != null && org.bouncycastle.est.ESTResponse.this.getInputSizeshNQ4ISI >= l.longValue()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Absolute Read Limit exceeded: ");
                        sb.append(l);
                        throw new java.io.IOException(sb.toString());
                    }
                }
                return read;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                if (org.bouncycastle.est.ESTResponse.this.getHighSpeedVideoFpsRanges == null || org.bouncycastle.est.ESTResponse.this.getHighSpeedVideoFpsRanges.longValue() - 1 <= org.bouncycastle.est.ESTResponse.this.getInputSizeshNQ4ISI) {
                    if (inputStream.available() > 0) {
                        throw new java.io.IOException("Stream closed with extra content in pipe that exceeds content length.");
                    }
                    inputStream.close();
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Stream closed before limit fully read, Read: ");
                    sb.append(org.bouncycastle.est.ESTResponse.this.getInputSizeshNQ4ISI);
                    sb.append(" ContentLength: ");
                    sb.append(org.bouncycastle.est.ESTResponse.this.getHighSpeedVideoFpsRanges);
                    throw new java.io.IOException(sb.toString());
                }
            }
        };
    }

    protected java.lang.String readStringIncluding(char c) throws java.io.IOException {
        int read;
        byte[] bArr;
        int i;
        int i2 = 0;
        while (true) {
            read = this.getOutputFormats.read();
            bArr = this.getInputFormats;
            i = i2 + 1;
            bArr[i2] = (byte) read;
            if (i >= bArr.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Server sent line > ");
                sb.append(this.getInputFormats.length);
                throw new java.io.IOException(sb.toString());
            }
            if (read == c || read < 0) {
                break;
            }
            i2 = i;
        }
        if (read != -1) {
            return new java.lang.String(bArr, 0, i).trim();
        }
        throw new java.io.EOFException();
    }

    public java.lang.String getStatusMessage() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public int getStatusCode() {
        return this.getOutputStallDuration;
    }

    public org.bouncycastle.est.Source getSource() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.est.ESTRequest getOriginalRequest() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.io.InputStream getInputStream() {
        return this.getOutputFormats;
    }

    public java.lang.String getHttpVersion() {
        return this.getHighSpeedVideoSizes;
    }

    class PrintingInputStream extends java.io.InputStream {
        private final java.io.InputStream Camera2StreamConfigurationMap;

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            return this.Camera2StreamConfigurationMap.read();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.Camera2StreamConfigurationMap.close();
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return this.Camera2StreamConfigurationMap.available();
        }

        /* synthetic */ PrintingInputStream(org.bouncycastle.est.ESTResponse eSTResponse, java.io.InputStream inputStream, byte b) {
            this(inputStream);
        }

        private PrintingInputStream(java.io.InputStream inputStream) {
            this.Camera2StreamConfigurationMap = inputStream;
        }
    }

    public org.bouncycastle.est.HttpUtil.Headers getHeaders() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.getOutputFormats;
        if (inputStream != null) {
            inputStream.close();
        }
        this.getOutputMinFrameDuration.close();
    }

    static /* synthetic */ long getHighSpeedVideoFpsRangesFor(org.bouncycastle.est.ESTResponse eSTResponse) {
        long j = eSTResponse.getInputSizeshNQ4ISI;
        eSTResponse.getInputSizeshNQ4ISI = 1 + j;
        return j;
    }
}
