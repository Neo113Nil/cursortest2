package org.apache.commons.imaging.formats.xpm;

/* loaded from: classes17.dex */
public class XpmImageParser extends org.apache.commons.imaging.ImageParser {
    private static java.util.Map<java.lang.String, java.lang.Integer> colorNames;
    private static final java.lang.String DEFAULT_EXTENSION = ".xpm";
    private static final java.lang.String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final char[] WRITE_PALETTE = {' ', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 'X', 'o', 'O', '+', '@', '#', kotlin.text.Typography.dollar, '%', kotlin.text.Typography.amp, '*', '=', '-', ';', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, kotlin.text.Typography.greater, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, kotlin.text.Typography.less, '1', '2', '3', '4', '5', '6', '7', '8', '9', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 'q', 'w', 'e', 'r', 't', 'y', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'i', 'p', 'a', io.ktor.util.date.GMTDateParser.SECONDS, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'f', 'g', io.ktor.util.date.GMTDateParser.HOURS, 'j', 'k', 'l', io.ktor.util.date.GMTDateParser.ZONE, 'x', 'c', 'v', 'b', 'n', io.ktor.util.date.GMTDateParser.MINUTES, io.ktor.util.date.GMTDateParser.MONTH, 'N', 'B', 'V', 'C', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO, 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 'P', 'I', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, io.ktor.util.date.GMTDateParser.YEAR, 'T', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'E', 'W', 'Q', '!', '~', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString, kotlinx.io.files.FileSystemKt.UnixPathSeparator, '(', ')', '_', '`', '\'', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '|'};

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    private static void loadColorNames() throws org.apache.commons.imaging.ImageReadException {
        synchronized (org.apache.commons.imaging.formats.xpm.XpmImageParser.class) {
            if (colorNames != null) {
                return;
            }
            try {
                java.io.InputStream resourceAsStream = org.apache.commons.imaging.formats.xpm.XpmImageParser.class.getResourceAsStream("rgb.txt");
                if (resourceAsStream == null) {
                    throw new org.apache.commons.imaging.ImageReadException("Couldn't find rgb.txt in our resources");
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(resourceAsStream, java.nio.charset.StandardCharsets.US_ASCII);
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                if (readLine.charAt(0) != '!') {
                                    try {
                                        int parseInt = java.lang.Integer.parseInt(readLine.substring(0, 3).trim());
                                        int parseInt2 = java.lang.Integer.parseInt(readLine.substring(4, 7).trim());
                                        hashMap.put(readLine.substring(11).trim().toLowerCase(java.util.Locale.ENGLISH), java.lang.Integer.valueOf((parseInt << 16) | (-16777216) | (parseInt2 << 8) | java.lang.Integer.parseInt(readLine.substring(8, 11).trim())));
                                    } catch (java.lang.NumberFormatException e) {
                                        throw new org.apache.commons.imaging.ImageReadException("Couldn't parse color in rgb.txt", e);
                                    }
                                }
                            } else {
                                bufferedReader.close();
                                inputStreamReader.close();
                                colorNames = hashMap;
                                return;
                            }
                        } finally {
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            inputStreamReader.close();
                        } catch (java.lang.Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (java.io.IOException e2) {
                throw new org.apache.commons.imaging.ImageReadException("Could not parse rgb.txt", e2);
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "X PixMap";
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
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.XPM};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader readXpmHeader = readXpmHeader(byteSource);
        org.apache.commons.imaging.ImageInfo.ColorType colorType = org.apache.commons.imaging.ImageInfo.ColorType.BW;
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry>> it = readXpmHeader.palette.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry value = it.next().getValue();
            if ((value.getBestARGB() & (-16777216)) != -16777216) {
                z = true;
            }
            if (value.haveColor) {
                colorType = org.apache.commons.imaging.ImageInfo.ColorType.RGB;
            } else if (colorType != org.apache.commons.imaging.ImageInfo.ColorType.RGB && (value.haveGray || value.haveGray4Level)) {
                colorType = org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE;
            }
        }
        return new org.apache.commons.imaging.ImageInfo("XPM version 3", readXpmHeader.numCharsPerPixel * 8, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.XPM, "X PixMap", readXpmHeader.height, "image/x-xpixmap", 1, 0, 0.0f, 0, 0.0f, readXpmHeader.width, false, z, true, colorType, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader readXpmHeader = readXpmHeader(byteSource);
        return new java.awt.Dimension(readXpmHeader.width, readXpmHeader.height);
    }

    static class XpmHeader {
        int height;
        int numCharsPerPixel;
        int numColors;
        java.util.Map<java.lang.Object, org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry> palette = new java.util.HashMap();
        int width;
        int xHotSpot;
        boolean xpmExt;
        int yHotSpot;

        XpmHeader(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this.xHotSpot = -1;
            this.yHotSpot = -1;
            this.width = i;
            this.height = i2;
            this.numColors = i3;
            this.numCharsPerPixel = i4;
            this.xHotSpot = i5;
            this.yHotSpot = i6;
            this.xpmExt = z;
        }

        public void dump(java.io.PrintWriter printWriter) {
            printWriter.println("XpmHeader");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Width: ");
            sb.append(this.width);
            printWriter.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Height: ");
            sb2.append(this.height);
            printWriter.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("NumColors: ");
            sb3.append(this.numColors);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("NumCharsPerPixel: ");
            sb4.append(this.numCharsPerPixel);
            printWriter.println(sb4.toString());
            if (this.xHotSpot != -1 && this.yHotSpot != -1) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("X hotspot: ");
                sb5.append(this.xHotSpot);
                printWriter.println(sb5.toString());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Y hotspot: ");
                sb6.append(this.yHotSpot);
                printWriter.println(sb6.toString());
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("XpmExt: ");
            sb7.append(this.xpmExt);
            printWriter.println(sb7.toString());
        }
    }

    static class PaletteEntry {
        int colorArgb;
        int gray4LevelArgb;
        int grayArgb;
        boolean haveColor;
        boolean haveGray;
        boolean haveGray4Level;
        boolean haveMono;
        int index;
        int monoArgb;

        private PaletteEntry() {
            this.haveColor = false;
            this.haveGray = false;
            this.haveGray4Level = false;
            this.haveMono = false;
        }

        int getBestARGB() {
            if (this.haveColor) {
                return this.colorArgb;
            }
            if (this.haveGray) {
                return this.grayArgb;
            }
            if (this.haveGray4Level) {
                return this.gray4LevelArgb;
            }
            if (this.haveMono) {
                return this.monoArgb;
            }
            return 0;
        }
    }

    static class XpmParseResult {
        org.apache.commons.imaging.common.BasicCParser cParser;
        org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader xpmHeader;

        private XpmParseResult() {
        }
    }

    private org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader readXpmHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return parseXpmHeader(byteSource).xpmHeader;
    }

    private org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmParseResult parseXpmHeader(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.io.ByteArrayOutputStream preprocess = org.apache.commons.imaging.common.BasicCParser.preprocess(inputStream, sb, null);
            if (!"XPM".equals(sb.toString().trim())) {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, signature isn't '/* XPM */'");
            }
            org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmParseResult xpmParseResult = new org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmParseResult();
            xpmParseResult.cParser = new org.apache.commons.imaging.common.BasicCParser(new java.io.ByteArrayInputStream(preprocess.toByteArray()));
            xpmParseResult.xpmHeader = parseXpmHeader(xpmParseResult.cParser);
            if (inputStream != null) {
                inputStream.close();
            }
            return xpmParseResult;
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

    private boolean parseNextString(org.apache.commons.imaging.common.BasicCParser basicCParser, java.lang.StringBuilder sb) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        java.lang.String nextToken;
        sb.setLength(0);
        java.lang.String nextToken2 = basicCParser.nextToken();
        if (nextToken2.charAt(0) != '\"') {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no string found where expected");
        }
        org.apache.commons.imaging.common.BasicCParser.unescapeString(sb, nextToken2);
        while (true) {
            nextToken = basicCParser.nextToken();
            if (nextToken.charAt(0) != '\"') {
                break;
            }
            org.apache.commons.imaging.common.BasicCParser.unescapeString(sb, nextToken);
        }
        if (",".equals(nextToken)) {
            return true;
        }
        if ("}".equals(nextToken)) {
            return false;
        }
        throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no ',' or '}' found where expected");
    }

    private org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader parseXpmValuesSection(java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        int i;
        int i2;
        boolean z;
        java.lang.String[] strArr = org.apache.commons.imaging.common.BasicCParser.tokenizeRow(str);
        if (strArr.length < 4 || strArr.length > 7) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, <Values> section has incorrect tokens");
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[0]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[1]);
            int parseInt3 = java.lang.Integer.parseInt(strArr[2]);
            int parseInt4 = java.lang.Integer.parseInt(strArr[3]);
            if (strArr.length >= 6) {
                i2 = java.lang.Integer.parseInt(strArr[4]);
                i = java.lang.Integer.parseInt(strArr[5]);
            } else {
                i = -1;
                i2 = -1;
            }
            if (strArr.length != 5 && strArr.length != 7) {
                z = false;
                return new org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader(parseInt, parseInt2, parseInt3, parseInt4, i2, i, z);
            }
            if (!"XPMEXT".equals(strArr[strArr.length - 1])) {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, can't parse <Values> section XPMEXT");
            }
            z = true;
            return new org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader(parseInt, parseInt2, parseInt3, parseInt4, i2, i, z);
        } catch (java.lang.NumberFormatException e) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, error parsing <Values> section", e);
        }
    }

    private int parseColor(java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        if (str.charAt(0) == '#') {
            java.lang.String substring = str.substring(1);
            if (substring.length() == 3) {
                return (java.lang.Integer.parseInt(substring.substring(2, 3), 16) << 4) | (java.lang.Integer.parseInt(substring.substring(0, 1), 16) << 20) | (-16777216) | (java.lang.Integer.parseInt(substring.substring(1, 2), 16) << 12);
            }
            if (substring.length() == 6) {
                return java.lang.Integer.parseInt(substring, 16) | (-16777216);
            }
            if (substring.length() == 9) {
                return java.lang.Integer.parseInt(substring.substring(6, 7), 16) | (java.lang.Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (java.lang.Integer.parseInt(substring.substring(3, 4), 16) << 8);
            }
            if (substring.length() == 12) {
                return java.lang.Integer.parseInt(substring.substring(8, 9), 16) | (java.lang.Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (java.lang.Integer.parseInt(substring.substring(4, 5), 16) << 8);
            }
            if (substring.length() != 24) {
                return 0;
            }
            return java.lang.Integer.parseInt(substring.substring(16, 17), 16) | (java.lang.Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (java.lang.Integer.parseInt(substring.substring(8, 9), 16) << 8);
        }
        if (str.charAt(0) == '%') {
            throw new org.apache.commons.imaging.ImageReadException("HSV colors are not implemented even in the XPM specification!");
        }
        if (com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE.equals(str)) {
            return 0;
        }
        loadColorNames();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
        if (colorNames.containsKey(lowerCase)) {
            return colorNames.get(lowerCase).intValue();
        }
        return 0;
    }

    private void populatePaletteEntry(org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry paletteEntry, java.lang.String str, java.lang.String str2) throws org.apache.commons.imaging.ImageReadException {
        if ("m".equals(str)) {
            paletteEntry.monoArgb = parseColor(str2);
            paletteEntry.haveMono = true;
            return;
        }
        if ("g4".equals(str)) {
            paletteEntry.gray4LevelArgb = parseColor(str2);
            paletteEntry.haveGray4Level = true;
            return;
        }
        if ("g".equals(str)) {
            paletteEntry.grayArgb = parseColor(str2);
            paletteEntry.haveGray = true;
        } else if (lib.android.paypal.com.magnessdk.g.n2.equals(str)) {
            paletteEntry.colorArgb = parseColor(str2);
            paletteEntry.haveColor = true;
        } else if ("c".equals(str)) {
            paletteEntry.colorArgb = parseColor(str2);
            paletteEntry.haveColor = true;
        }
    }

    private void parsePaletteEntries(org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader xpmHeader, org.apache.commons.imaging.common.BasicCParser basicCParser) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < xpmHeader.numColors; i++) {
            sb.setLength(0);
            if (!parseNextString(basicCParser, sb)) {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, file ended while reading palette");
            }
            java.lang.String substring = sb.substring(0, xpmHeader.numCharsPerPixel);
            java.lang.String[] strArr = org.apache.commons.imaging.common.BasicCParser.tokenizeRow(sb.substring(xpmHeader.numCharsPerPixel));
            org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry paletteEntry = new org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry();
            paletteEntry.index = i;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                java.lang.String str = strArr[i3];
                if ((i2 < i3 - 1 && "m".equals(str)) || "g4".equals(str) || "g".equals(str) || "c".equals(str) || lib.android.paypal.com.magnessdk.g.n2.equals(str)) {
                    if (i2 >= 0) {
                        java.lang.String str2 = strArr[i2];
                        java.lang.String obj = sb2.toString();
                        sb2.setLength(0);
                        populatePaletteEntry(paletteEntry, str2, obj);
                    }
                    i2 = i3;
                } else {
                    if (i2 < 0) {
                        break;
                    }
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(str);
                }
            }
            if (i2 >= 0 && sb2.length() > 0) {
                java.lang.String str3 = strArr[i2];
                java.lang.String obj2 = sb2.toString();
                sb2.setLength(0);
                populatePaletteEntry(paletteEntry, str3, obj2);
            }
            xpmHeader.palette.put(substring, paletteEntry);
        }
    }

    private org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader parseXpmHeader(org.apache.commons.imaging.common.BasicCParser basicCParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (!"static".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no 'static' token");
        }
        if (!"char".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no 'char' token");
        }
        if (!"*".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no '*' token");
        }
        java.lang.String nextToken = basicCParser.nextToken();
        if (nextToken == null) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no variable name");
        }
        if (nextToken.charAt(0) != '_' && !java.lang.Character.isLetter(nextToken.charAt(0))) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, variable name doesn't start with letter or underscore");
        }
        for (int i = 0; i < nextToken.length(); i++) {
            char charAt = nextToken.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '_') {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, variable name contains non-letter non-digit non-underscore");
            }
        }
        if (!"[".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no '[' token");
        }
        if (!"]".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no ']' token");
        }
        if (!"=".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no '=' token");
        }
        if (!"{".equals(basicCParser.nextToken())) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, no '{' token");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!parseNextString(basicCParser, sb)) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, file too short");
        }
        org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader parseXpmValuesSection = parseXpmValuesSection(sb.toString());
        parsePaletteEntries(parseXpmValuesSection, basicCParser);
        return parseXpmValuesSection;
    }

    private java.awt.image.BufferedImage readXpmImage(org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmHeader xpmHeader, org.apache.commons.imaging.common.BasicCParser basicCParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.awt.image.IndexColorModel directColorModel;
        java.awt.image.WritableRaster createPackedRaster;
        char c;
        int i = 1;
        if (xpmHeader.palette.size() <= 256) {
            int[] iArr = new int[xpmHeader.palette.size()];
            java.util.Iterator<java.util.Map.Entry<java.lang.Object, org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry>> it = xpmHeader.palette.entrySet().iterator();
            while (it.hasNext()) {
                org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry value = it.next().getValue();
                iArr[value.index] = value.getBestARGB();
            }
            directColorModel = new java.awt.image.IndexColorModel(8, xpmHeader.palette.size(), iArr, 0, true, -1, 0);
            createPackedRaster = java.awt.image.Raster.createInterleavedRaster(0, xpmHeader.width, xpmHeader.height, 1, (java.awt.Point) null);
            c = '\b';
        } else if (xpmHeader.palette.size() <= 65536) {
            int[] iArr2 = new int[xpmHeader.palette.size()];
            java.util.Iterator<java.util.Map.Entry<java.lang.Object, org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry>> it2 = xpmHeader.palette.entrySet().iterator();
            while (it2.hasNext()) {
                org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry value2 = it2.next().getValue();
                iArr2[value2.index] = value2.getBestARGB();
            }
            directColorModel = new java.awt.image.IndexColorModel(16, xpmHeader.palette.size(), iArr2, 0, true, -1, 1);
            createPackedRaster = java.awt.image.Raster.createInterleavedRaster(1, xpmHeader.width, xpmHeader.height, 1, (java.awt.Point) null);
            c = 16;
        } else {
            directColorModel = new java.awt.image.DirectColorModel(32, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, -16777216);
            createPackedRaster = java.awt.image.Raster.createPackedRaster(3, xpmHeader.width, xpmHeader.height, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, -16777216}, (java.awt.Point) null);
            c = ' ';
        }
        java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(directColorModel, createPackedRaster, directColorModel.isAlphaPremultiplied(), new java.util.Properties());
        java.awt.image.DataBuffer dataBuffer = createPackedRaster.getDataBuffer();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 0;
        boolean z = true;
        while (i2 < xpmHeader.height) {
            sb.setLength(0);
            z = parseNextString(basicCParser, sb);
            if (i2 < xpmHeader.height - i && !z) {
                throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, insufficient image rows in file");
            }
            int i3 = xpmHeader.width * i2;
            int i4 = 0;
            while (i4 < xpmHeader.width) {
                int i5 = i4 + 1;
                java.lang.String substring = sb.substring(xpmHeader.numCharsPerPixel * i4, xpmHeader.numCharsPerPixel * i5);
                org.apache.commons.imaging.formats.xpm.XpmImageParser.PaletteEntry paletteEntry = xpmHeader.palette.get(substring);
                if (paletteEntry == null) {
                    throw new org.apache.commons.imaging.ImageReadException("No palette entry was defined for ".concat(java.lang.String.valueOf(substring)));
                }
                if (c <= 16) {
                    dataBuffer.setElem(i4 + i3, paletteEntry.index);
                } else {
                    dataBuffer.setElem(i4 + i3, paletteEntry.getBestARGB());
                }
                i4 = i5;
            }
            i2++;
            i = 1;
        }
        while (z) {
            sb.setLength(0);
            z = parseNextString(basicCParser, sb);
        }
        if (";".equals(basicCParser.nextToken())) {
            return bufferedImage;
        }
        throw new org.apache.commons.imaging.ImageReadException("Last token wasn't ';'");
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        readXpmHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.xpm.XpmImageParser.XpmParseResult parseXpmHeader = parseXpmHeader(byteSource);
        return readXpmImage(parseXpmHeader.xpmHeader, parseXpmHeader.cParser);
    }

    private java.lang.String randomName() {
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

    private java.lang.String pixelsForIndex(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 *= WRITE_PALETTE.length;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i / i3;
            i -= i6 * i3;
            char[] cArr = WRITE_PALETTE;
            i3 /= cArr.length;
            sb.append(cArr[i6]);
        }
        return sb.toString();
    }

    private java.lang.String toColor(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        if (hexString.length() < 6) {
            char[] cArr = new char[6 - hexString.length()];
            java.util.Arrays.fill(cArr, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("#");
            sb.append(new java.lang.String(cArr));
            sb.append(hexString);
            return sb.toString();
        }
        return "#".concat(java.lang.String.valueOf(hexString));
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.lang.String pixelsForIndex;
        java.lang.String str;
        java.util.HashMap hashMap = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (hashMap.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("Unknown parameter: ".concat(java.lang.String.valueOf(hashMap.keySet().iterator().next())));
        }
        org.apache.commons.imaging.palette.PaletteFactory paletteFactory = new org.apache.commons.imaging.palette.PaletteFactory();
        int i = 1;
        boolean hasTransparency = paletteFactory.hasTransparency(bufferedImage, 1);
        int length = WRITE_PALETTE.length;
        org.apache.commons.imaging.palette.SimplePalette simplePalette = null;
        while (simplePalette == null) {
            simplePalette = paletteFactory.makeExactRgbPaletteSimple(bufferedImage, hasTransparency ? length - 1 : length);
            char[] cArr = WRITE_PALETTE;
            int i2 = i + 1;
            long j = i2;
            if (cArr.length * length > androidx.collection.SieveCacheKt.NodeLinkMask) {
                throw new org.apache.commons.imaging.ImageWriteException("Xpm: Can't write images with more than Integer.MAX_VALUE colors.");
            }
            if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
                throw new org.apache.commons.imaging.ImageWriteException("Xpm: Can't write images with more than Integer.MAX_VALUE chars per pixel.");
            }
            if (simplePalette == null) {
                length *= cArr.length;
                i = i2;
            }
        }
        int length2 = simplePalette.length();
        if (hasTransparency) {
            length2++;
        }
        outputStream.write("/* XPM */\n".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("static char *");
        sb.append(randomName());
        sb.append("[] = {\n");
        outputStream.write(sb.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\"");
        sb2.append(bufferedImage.getWidth());
        sb2.append(" ");
        sb2.append(bufferedImage.getHeight());
        sb2.append(" ");
        sb2.append(length2);
        sb2.append(" ");
        sb2.append(i);
        sb2.append("\",\n");
        outputStream.write(sb2.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        for (int i3 = 0; i3 < length2; i3++) {
            if (i3 < simplePalette.length()) {
                str = toColor(simplePalette.getEntry(i3));
            } else {
                str = com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\"");
            sb3.append(pixelsForIndex(i3, i));
            sb3.append(" c ");
            sb3.append(str);
            sb3.append("\",\n");
            outputStream.write(sb3.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        }
        java.lang.String str2 = "";
        int i4 = 0;
        while (i4 < bufferedImage.getHeight()) {
            outputStream.write(str2.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
            outputStream.write("\"".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
            for (int i5 = 0; i5 < bufferedImage.getWidth(); i5++) {
                int rgb = bufferedImage.getRGB(i5, i4);
                if (((-16777216) & rgb) == 0) {
                    pixelsForIndex = pixelsForIndex(simplePalette.length(), i);
                } else {
                    pixelsForIndex = pixelsForIndex(simplePalette.getPaletteIndex(rgb & 16777215), i);
                }
                outputStream.write(pixelsForIndex.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
            }
            outputStream.write("\"".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
            i4++;
            str2 = ",\n";
        }
        outputStream.write("\n};\n".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
    }
}
