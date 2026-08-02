package org.apache.commons.imaging.formats.xbm;

/* loaded from: classes17.dex */
public class XbmImageParser extends org.apache.commons.imaging.ImageParser {
    private static final java.lang.String DEFAULT_EXTENSION = ".xbm";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "X BitMap";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.XBM};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader readXbmHeader = readXbmHeader(byteSource);
        return new org.apache.commons.imaging.ImageInfo("XBM", 1, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.XBM, "X BitMap", readXbmHeader.height, "image/x-xbitmap", 1, 0, 0.0f, 0, 0.0f, readXbmHeader.width, false, false, false, org.apache.commons.imaging.ImageInfo.ColorType.BW, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader readXbmHeader = readXbmHeader(byteSource);
        return new java.awt.Dimension(readXbmHeader.width, readXbmHeader.height);
    }

    static class XbmHeader {
        int height;
        int width;
        int xHot;
        int yHot;

        XbmHeader(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.xHot = i3;
            this.yHot = i4;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("XbmHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Width: ");
            sb.append(this.width);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Height: ");
            sb2.append(this.height);
            printWriter.println(sb2.toString());
            if (this.xHot == -1 || this.yHot == -1) {
                return;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("X hot: ");
            sb3.append(this.xHot);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Y hot: ");
            sb4.append(this.yHot);
            printWriter.println(sb4.toString());
        }
    }

    static class XbmParseResult {
        org.apache.commons.imaging.common.BasicCParser cParser;
        org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader xbmHeader;

        private XbmParseResult() {
        }
    }

    private org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader readXbmHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return parseXbmHeader(byteSource).xbmHeader;
    }

    private org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmParseResult parseXbmHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.io.ByteArrayOutputStream preprocess = org.apache.commons.imaging.common.BasicCParser.preprocess(inputStream, null, hashMap);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str.endsWith("_width")) {
                    i = parseCIntegerLiteral((java.lang.String) entry.getValue());
                } else if (str.endsWith("_height")) {
                    i2 = parseCIntegerLiteral((java.lang.String) entry.getValue());
                } else if (str.endsWith("_x_hot")) {
                    i3 = parseCIntegerLiteral((java.lang.String) entry.getValue());
                } else if (str.endsWith("_y_hot")) {
                    i4 = parseCIntegerLiteral((java.lang.String) entry.getValue());
                }
            }
            if (i == -1) {
                throw new org.apache.commons.imaging.ImageReadException("width not found");
            }
            if (i2 == -1) {
                throw new org.apache.commons.imaging.ImageReadException("height not found");
            }
            org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmParseResult xbmParseResult = new org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmParseResult();
            xbmParseResult.cParser = new org.apache.commons.imaging.common.BasicCParser(new java.io.ByteArrayInputStream(preprocess.toByteArray()));
            xbmParseResult.xbmHeader = new org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader(i, i2, i3, i4);
            if (inputStream != null) {
                inputStream.close();
            }
            return xbmParseResult;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private static int parseCIntegerLiteral(java.lang.String str) {
        if (str.startsWith("0")) {
            if (str.length() < 2) {
                return 0;
            }
            if (str.charAt(1) == 'x' || str.charAt(1) == 'X') {
                return java.lang.Integer.parseInt(str.substring(2), 16);
            }
            return java.lang.Integer.parseInt(str.substring(1), 8);
        }
        return java.lang.Integer.parseInt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.awt.image.BufferedImage readXbmImage(org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmHeader xbmHeader, org.apache.commons.imaging.common.BasicCParser basicCParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i;
        int i2;
        int i3;
        java.lang.String nextToken;
        if (!"static".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no 'static' token");
        }
        java.lang.String nextToken2 = basicCParser.nextToken();
        if (nextToken2 == null) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no 'unsigned' or 'char' or 'short' token");
        }
        if ("unsigned".equals(nextToken2)) {
            nextToken2 = basicCParser.nextToken();
        }
        if ("char".equals(nextToken2)) {
            i = 4;
            i2 = 8;
        } else {
            if (!"short".equals(nextToken2)) {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no 'char' or 'short' token");
            }
            i = 6;
            i2 = 16;
        }
        java.lang.String nextToken3 = basicCParser.nextToken();
        if (nextToken3 == null) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no variable name");
        }
        if (nextToken3.charAt(0) != '_' && !java.lang.Character.isLetter(nextToken3.charAt(0))) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, variable name doesn't start with letter or underscore");
        }
        for (int i4 = 0; i4 < nextToken3.length(); i4++) {
            char charAt = nextToken3.charAt(i4);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '_') {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, variable name contains non-letter non-digit non-underscore");
            }
        }
        if (!"[".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no '[' token");
        }
        if (!"]".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no ']' token");
        }
        if (!"=".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no '=' token");
        }
        if (!"{".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, no '{' token");
        }
        int i5 = ((xbmHeader.width + 7) / 8) * xbmHeader.height;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < xbmHeader.height; i7++) {
            for (int i8 = 0; i8 < xbmHeader.width; i8 += i2) {
                java.lang.String nextToken4 = basicCParser.nextToken();
                if (nextToken4 == null || !nextToken4.startsWith("0x")) {
                    throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, hex value missing");
                }
                if (nextToken4.length() > i) {
                    throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, hex value too long");
                }
                int reverse = java.lang.Integer.reverse(java.lang.Integer.parseInt(nextToken4.substring(2), 16)) >>> (32 - i2);
                if (i2 == 16) {
                    i3 = i6 + 1;
                    bArr[i6] = (byte) (reverse >>> 8);
                    if (i8 + 8 < xbmHeader.width) {
                        i6 += 2;
                        bArr[i3] = (byte) reverse;
                        nextToken = basicCParser.nextToken();
                        if (nextToken != null) {
                            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, premature end of file");
                        }
                        if (!",".equals(nextToken) && (i6 < i5 || !"}".equals(nextToken))) {
                            throw new org.apache.commons.imaging.ImageReadException("Parsing XBM file failed, punctuation error");
                        }
                    }
                } else {
                    i3 = i6 + 1;
                    bArr[i6] = (byte) reverse;
                }
                i6 = i3;
                nextToken = basicCParser.nextToken();
                if (nextToken != null) {
                }
            }
        }
        java.awt.image.IndexColorModel indexColorModel = new java.awt.image.IndexColorModel(1, 2, new int[]{16777215, 0}, 0, false, -1, 0);
        return new java.awt.image.BufferedImage(indexColorModel, java.awt.image.Raster.createPackedRaster(new java.awt.image.DataBufferByte(bArr, i5), xbmHeader.width, xbmHeader.height, 1, (java.awt.Point) null), indexColorModel.isAlphaPremultiplied(), new java.util.Properties());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readXbmHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xbm.XbmImageParser.XbmParseResult parseXbmHeader = parseXbmHeader(byteSource);
        return readXbmImage(parseXbmHeader.xbmHeader, parseXbmHeader.cParser);
    }

    private static java.lang.String randomName() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("a");
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        for (int i = 56; i >= 0; i -= 8) {
            sb.append(java.lang.Integer.toHexString((int) (255 & (mostSignificantBits >> i))));
        }
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        for (int i2 = 56; i2 >= 0; i2 -= 8) {
            sb.append(java.lang.Integer.toHexString((int) ((leastSignificantBits >> i2) & 255)));
        }
        return sb.toString();
    }

    private static java.lang.String toPrettyHex(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i & 255);
        if (hexString.length() == 2) {
            return "0x".concat(java.lang.String.valueOf(hexString));
        }
        return "0x0".concat(java.lang.String.valueOf(hexString));
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        java.lang.String randomName = randomName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("#define ");
        sb.append(randomName);
        sb.append("_width ");
        sb.append(bufferedImage.getWidth());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        outputStream.write(sb.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("#define ");
        sb2.append(randomName);
        sb2.append("_height ");
        sb2.append(bufferedImage.getHeight());
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        outputStream.write(sb2.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("static unsigned char ");
        sb3.append(randomName);
        sb3.append("_bits[] = {");
        outputStream.write(sb3.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String str = "\n  ";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < bufferedImage.getHeight(); i4++) {
            for (int i5 = 0; i5 < bufferedImage.getWidth(); i5++) {
                int rgb = bufferedImage.getRGB(i5, i4);
                i2 |= (((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127 ? 0 : 1) << i3;
                i3++;
                if (i3 == 8) {
                    outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                    if (i == 12) {
                        outputStream.write("\n  ".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                        i = 0;
                    }
                    outputStream.write(toPrettyHex(i2).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                    i++;
                    i2 = 0;
                    i3 = 0;
                    str = ",";
                }
            }
            if (i3 != 0) {
                outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                if (i == 12) {
                    outputStream.write("\n  ".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                    i = 0;
                }
                outputStream.write(toPrettyHex(i2).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                i++;
                i2 = 0;
                i3 = 0;
                str = ",";
            }
        }
        outputStream.write("\n};\n".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
    }
}
