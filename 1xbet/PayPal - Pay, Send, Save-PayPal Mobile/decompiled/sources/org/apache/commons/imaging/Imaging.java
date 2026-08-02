package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public final class Imaging {
    private static final int[] MAGIC_NUMBERS_GIF = {71, 73};
    private static final int[] MAGIC_NUMBERS_PNG = {137, 80};
    private static final int[] MAGIC_NUMBERS_JPEG = {255, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE};
    private static final int[] MAGIC_NUMBERS_BMP = {66, 77};
    private static final int[] MAGIC_NUMBERS_TIFF_MOTOROLA = {77, 77};
    private static final int[] MAGIC_NUMBERS_TIFF_INTEL = {73, 73};
    private static final int[] MAGIC_NUMBERS_PAM = {80, 55};
    private static final int[] MAGIC_NUMBERS_PSD = {56, 66};
    private static final int[] MAGIC_NUMBERS_PBM_A = {80, 49};
    private static final int[] MAGIC_NUMBERS_PBM_B = {80, 52};
    private static final int[] MAGIC_NUMBERS_PGM_A = {80, 50};
    private static final int[] MAGIC_NUMBERS_PGM_B = {80, 53};
    private static final int[] MAGIC_NUMBERS_PPM_A = {80, 51};
    private static final int[] MAGIC_NUMBERS_PPM_B = {80, 54};
    private static final int[] MAGIC_NUMBERS_JBIG2_1 = {151, 74};
    private static final int[] MAGIC_NUMBERS_JBIG2_2 = {66, 50};
    private static final int[] MAGIC_NUMBERS_ICNS = {105, 99};
    private static final int[] MAGIC_NUMBERS_DCX = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 104};
    private static final int[] MAGIC_NUMBERS_RGBE = {35, 63};

    private Imaging() {
    }

    public static boolean hasImageFileExtension(java.io.File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        return hasImageFileExtension(file.getName());
    }

    public static boolean hasImageFileExtension(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
        for (org.apache.commons.imaging.ImageParser imageParser : org.apache.commons.imaging.ImageParser.getAllImageParsers()) {
            for (java.lang.String str2 : imageParser.getAcceptedExtensions()) {
                if (lowerCase.endsWith(str2.toLowerCase(java.util.Locale.ENGLISH))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static org.apache.commons.imaging.ImageFormat guessFormat(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return guessFormat(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public static org.apache.commons.imaging.ImageFormat guessFormat(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return guessFormat(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    private static boolean compareBytePair(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        throw new java.lang.RuntimeException("Invalid Byte Pair.");
    }

    public static org.apache.commons.imaging.ImageFormat guessFormat(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (byteSource == null) {
            return org.apache.commons.imaging.ImageFormats.UNKNOWN;
        }
        java.io.InputStream inputStream = byteSource.getInputStream();
        try {
            int read = inputStream.read();
            int read2 = inputStream.read();
            if (read < 0 || read2 < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Couldn't read magic numbers to guess format.");
            }
            int[] iArr = {read & 255, read2 & 255};
            if (compareBytePair(MAGIC_NUMBERS_GIF, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats = org.apache.commons.imaging.ImageFormats.GIF;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats;
            }
            if (compareBytePair(MAGIC_NUMBERS_PNG, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats2 = org.apache.commons.imaging.ImageFormats.PNG;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats2;
            }
            if (compareBytePair(MAGIC_NUMBERS_JPEG, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats3 = org.apache.commons.imaging.ImageFormats.JPEG;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats3;
            }
            if (compareBytePair(MAGIC_NUMBERS_BMP, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats4 = org.apache.commons.imaging.ImageFormats.BMP;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats4;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_MOTOROLA, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats5 = org.apache.commons.imaging.ImageFormats.TIFF;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats5;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_INTEL, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats6 = org.apache.commons.imaging.ImageFormats.TIFF;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats6;
            }
            if (compareBytePair(MAGIC_NUMBERS_PSD, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats7 = org.apache.commons.imaging.ImageFormats.PSD;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats7;
            }
            if (compareBytePair(MAGIC_NUMBERS_PAM, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats8 = org.apache.commons.imaging.ImageFormats.PAM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats8;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_A, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats9 = org.apache.commons.imaging.ImageFormats.PBM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats9;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_B, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats10 = org.apache.commons.imaging.ImageFormats.PBM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats10;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_A, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats11 = org.apache.commons.imaging.ImageFormats.PGM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats11;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_B, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats12 = org.apache.commons.imaging.ImageFormats.PGM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats12;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_A, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats13 = org.apache.commons.imaging.ImageFormats.PPM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats13;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_B, iArr)) {
                org.apache.commons.imaging.ImageFormats imageFormats14 = org.apache.commons.imaging.ImageFormats.PPM;
                if (inputStream != null) {
                    inputStream.close();
                }
                return imageFormats14;
            }
            if (compareBytePair(MAGIC_NUMBERS_JBIG2_1, iArr)) {
                int read3 = inputStream.read();
                int read4 = inputStream.read();
                if (read3 < 0 || read4 < 0) {
                    throw new org.apache.commons.imaging.ImageReadException("Couldn't read magic numbers to guess format.");
                }
                if (compareBytePair(MAGIC_NUMBERS_JBIG2_2, new int[]{read3 & 255, read4 & 255})) {
                    org.apache.commons.imaging.ImageFormats imageFormats15 = org.apache.commons.imaging.ImageFormats.JBIG2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return imageFormats15;
                }
            } else {
                if (compareBytePair(MAGIC_NUMBERS_ICNS, iArr)) {
                    org.apache.commons.imaging.ImageFormats imageFormats16 = org.apache.commons.imaging.ImageFormats.ICNS;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return imageFormats16;
                }
                if (compareBytePair(MAGIC_NUMBERS_DCX, iArr)) {
                    org.apache.commons.imaging.ImageFormats imageFormats17 = org.apache.commons.imaging.ImageFormats.DCX;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return imageFormats17;
                }
                if (compareBytePair(MAGIC_NUMBERS_RGBE, iArr)) {
                    org.apache.commons.imaging.ImageFormats imageFormats18 = org.apache.commons.imaging.ImageFormats.RGBE;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return imageFormats18;
                }
            }
            org.apache.commons.imaging.ImageFormats imageFormats19 = org.apache.commons.imaging.ImageFormats.UNKNOWN;
            if (inputStream != null) {
                inputStream.close();
            }
            return imageFormats19;
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

    public static java.awt.color.ICC_Profile getICCProfile(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.color.ICC_Profile getICCProfile(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static java.awt.color.ICC_Profile getICCProfile(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(inputStream, str, null);
    }

    public static java.awt.color.ICC_Profile getICCProfile(java.io.InputStream inputStream, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), map);
    }

    public static java.awt.color.ICC_Profile getICCProfile(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.color.ICC_Profile getICCProfile(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfile(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    protected static java.awt.color.ICC_Profile getICCProfile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.icc.IccProfileInfo iCCProfileInfo;
        byte[] iCCProfileBytes = getICCProfileBytes(byteSource, map);
        if (iCCProfileBytes == null || (iCCProfileInfo = new org.apache.commons.imaging.icc.IccProfileParser().getICCProfileInfo(iCCProfileBytes)) == null || iCCProfileInfo.issRGB()) {
            return null;
        }
        return java.awt.color.ICC_Profile.getInstance(iCCProfileBytes);
    }

    public static byte[] getICCProfileBytes(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static byte[] getICCProfileBytes(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static byte[] getICCProfileBytes(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static byte[] getICCProfileBytes(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    private static byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getICCProfileBytes(byteSource, map);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.lang.String str, byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(str, bArr), map);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(str, bArr), (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.io.InputStream inputStream, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), map);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    public static org.apache.commons.imaging.ImageInfo getImageInfo(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    private static org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getImageInfo(byteSource, map);
    }

    private static org.apache.commons.imaging.ImageParser getImageParser(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.ImageFormat guessFormat = guessFormat(byteSource);
        if (!guessFormat.equals(org.apache.commons.imaging.ImageFormats.UNKNOWN)) {
            for (org.apache.commons.imaging.ImageParser imageParser : org.apache.commons.imaging.ImageParser.getAllImageParsers()) {
                if (imageParser.canAcceptType(guessFormat)) {
                    return imageParser;
                }
            }
        }
        java.lang.String fileName = byteSource.getFileName();
        if (fileName != null) {
            for (org.apache.commons.imaging.ImageParser imageParser2 : org.apache.commons.imaging.ImageParser.getAllImageParsers()) {
                if (imageParser2.canAcceptExtension(fileName)) {
                    return imageParser2;
                }
            }
        }
        throw new org.apache.commons.imaging.ImageReadException("Can't parse this format.");
    }

    public static java.awt.Dimension getImageSize(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(inputStream, str, null);
    }

    public static java.awt.Dimension getImageSize(java.io.InputStream inputStream, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), map);
    }

    public static java.awt.Dimension getImageSize(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.Dimension getImageSize(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static java.awt.Dimension getImageSize(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.Dimension getImageSize(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    public static java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getImageSize(byteSource, map);
    }

    public static java.lang.String getXmpXml(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(inputStream, str, null);
    }

    public static java.lang.String getXmpXml(java.io.InputStream inputStream, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), map);
    }

    public static java.lang.String getXmpXml(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.lang.String getXmpXml(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static java.lang.String getXmpXml(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.lang.String getXmpXml(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    public static java.lang.String getXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.lang.Object imageParser = getImageParser(byteSource);
        if (imageParser instanceof org.apache.commons.imaging.common.XmpEmbeddable) {
            return ((org.apache.commons.imaging.common.XmpEmbeddable) imageParser).getXmpXml(byteSource, map);
        }
        return null;
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(inputStream, str, null);
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.InputStream inputStream, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str), map);
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    private static org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getMetadata(byteSource, map);
    }

    public static java.lang.String dumpImageFile(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return dumpImageFile(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public static java.lang.String dumpImageFile(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return dumpImageFile(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    private static java.lang.String dumpImageFile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).dumpImageFile(byteSource);
    }

    public static org.apache.commons.imaging.FormatCompliance getFormatCompliance(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getFormatCompliance(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public static org.apache.commons.imaging.FormatCompliance getFormatCompliance(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getFormatCompliance(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    private static org.apache.commons.imaging.FormatCompliance getFormatCompliance(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getFormatCompliance(byteSource);
    }

    public static java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(java.io.InputStream inputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getAllBufferedImages(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, str));
    }

    public static java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getAllBufferedImages(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public static java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getAllBufferedImages(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    private static java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageParser(byteSource).getAllBufferedImages(byteSource);
    }

    public static java.awt.image.BufferedImage getBufferedImage(java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(inputStream, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.image.BufferedImage getBufferedImage(java.io.InputStream inputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, (map == null || !map.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FILENAME)) ? null : (java.lang.String) map.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FILENAME)), map);
    }

    public static java.awt.image.BufferedImage getBufferedImage(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.image.BufferedImage getBufferedImage(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public static java.awt.image.BufferedImage getBufferedImage(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public static java.awt.image.BufferedImage getBufferedImage(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    private static java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.ImageParser imageParser = getImageParser(byteSource);
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        return imageParser.getBufferedImage(byteSource, map);
    }

    public static void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.File file, org.apache.commons.imaging.ImageFormat imageFormat, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
            try {
                writeImage(bufferedImage, bufferedOutputStream, imageFormat, map);
                bufferedOutputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static byte[] writeImageToBytes(java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.ImageFormat imageFormat, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        writeImage(bufferedImage, byteArrayOutputStream, imageFormat, map);
        return byteArrayOutputStream.toByteArray();
    }

    public static void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, org.apache.commons.imaging.ImageFormat imageFormat, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        org.apache.commons.imaging.ImageParser imageParser;
        org.apache.commons.imaging.ImageParser[] allImageParsers = org.apache.commons.imaging.ImageParser.getAllImageParsers();
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.put(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT, imageFormat);
        int length = allImageParsers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                imageParser = null;
                break;
            }
            imageParser = allImageParsers[i];
            if (imageParser.canAcceptType(imageFormat)) {
                break;
            } else {
                i++;
            }
        }
        if (imageParser != null) {
            imageParser.writeImage(bufferedImage, outputStream, map);
            return;
        }
        throw new org.apache.commons.imaging.ImageWriteException("Unknown Format: ".concat(java.lang.String.valueOf(imageFormat)));
    }
}
