package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class BasicMimeParser implements org.bouncycastle.mime.MimeParser {
    private org.bouncycastle.mime.Headers Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.mime.MimeParserContext getHighSpeedVideoSizes;
    private final java.io.InputStream getOutputFormats;

    @Override // org.bouncycastle.mime.MimeParser
    public void parse(org.bouncycastle.mime.MimeParserListener mimeParserListener) throws java.io.IOException {
        org.bouncycastle.mime.MimeContext createContext = mimeParserListener.createContext(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        if (!this.getHighSpeedVideoFpsRanges) {
            java.io.InputStream applyContext = createContext.applyContext(this.Camera2StreamConfigurationMap, this.getOutputFormats);
            org.bouncycastle.mime.MimeParserContext mimeParserContext = this.getHighSpeedVideoSizes;
            org.bouncycastle.mime.Headers headers = this.Camera2StreamConfigurationMap;
            mimeParserListener.object(mimeParserContext, headers, getHighResolutionOutputSizeshNQ4ISI(headers, applyContext));
            return;
        }
        org.bouncycastle.mime.MimeMultipartContext mimeMultipartContext = (org.bouncycastle.mime.MimeMultipartContext) createContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.String obj = sb.toString();
        org.bouncycastle.mime.LineReader lineReader = new org.bouncycastle.mime.LineReader(this.getOutputFormats);
        boolean z = false;
        int i = 0;
        while (true) {
            java.lang.String Camera2StreamConfigurationMap = lineReader.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null || "--".equals(Camera2StreamConfigurationMap)) {
                return;
            }
            if (z) {
                org.bouncycastle.mime.BoundaryLimitedInputStream boundaryLimitedInputStream = new org.bouncycastle.mime.BoundaryLimitedInputStream(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
                org.bouncycastle.mime.Headers headers2 = new org.bouncycastle.mime.Headers(boundaryLimitedInputStream, this.getHighSpeedVideoFpsRangesFor);
                java.io.InputStream applyContext2 = mimeMultipartContext.createContext(i).applyContext(headers2, boundaryLimitedInputStream);
                mimeParserListener.object(this.getHighSpeedVideoSizes, headers2, getHighResolutionOutputSizeshNQ4ISI(headers2, applyContext2));
                if (applyContext2.read() >= 0) {
                    throw new java.io.IOException("MIME object not fully processed");
                }
                i++;
            } else if (obj.equals(Camera2StreamConfigurationMap)) {
                org.bouncycastle.mime.BoundaryLimitedInputStream boundaryLimitedInputStream2 = new org.bouncycastle.mime.BoundaryLimitedInputStream(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
                org.bouncycastle.mime.Headers headers3 = new org.bouncycastle.mime.Headers(boundaryLimitedInputStream2, this.getHighSpeedVideoFpsRangesFor);
                java.io.InputStream applyContext3 = mimeMultipartContext.createContext(i).applyContext(headers3, boundaryLimitedInputStream2);
                mimeParserListener.object(this.getHighSpeedVideoSizes, headers3, getHighResolutionOutputSizeshNQ4ISI(headers3, applyContext3));
                if (applyContext3.read() >= 0) {
                    throw new java.io.IOException("MIME object not fully processed");
                }
                i++;
                z = true;
            } else {
                continue;
            }
        }
    }

    public boolean isMultipart() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private static java.io.InputStream getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) {
        return headers.getContentTransferEncoding().equals("base64") ? new org.bouncycastle.mime.encoding.Base64InputStream(inputStream) : headers.getContentTransferEncoding().equals("quoted-printable") ? new org.bouncycastle.mime.encoding.QuotedPrintableInputStream(inputStream) : inputStream;
    }

    public BasicMimeParser(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) {
        java.lang.String str;
        this.getHighSpeedVideoFpsRanges = false;
        if (headers.isMultipart()) {
            this.getHighSpeedVideoFpsRanges = true;
            str = headers.getBoundary();
        } else {
            str = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = headers;
        this.getHighSpeedVideoSizes = mimeParserContext;
        this.getOutputFormats = inputStream;
        this.getHighSpeedVideoFpsRangesFor = mimeParserContext != null ? mimeParserContext.getDefaultContentTransferEncoding() : "7bit";
    }

    public BasicMimeParser(org.bouncycastle.mime.MimeParserContext mimeParserContext, java.io.InputStream inputStream) throws java.io.IOException {
        this(mimeParserContext, new org.bouncycastle.mime.Headers(inputStream, mimeParserContext.getDefaultContentTransferEncoding()), inputStream);
    }

    public BasicMimeParser(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) {
        this(null, headers, inputStream);
    }

    public BasicMimeParser(java.io.InputStream inputStream) throws java.io.IOException {
        this(null, new org.bouncycastle.mime.Headers(inputStream, "7bit"), inputStream);
    }
}
