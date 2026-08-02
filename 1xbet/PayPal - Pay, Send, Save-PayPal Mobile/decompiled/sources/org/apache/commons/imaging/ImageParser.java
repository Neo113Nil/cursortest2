package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public abstract class ImageParser extends org.apache.commons.imaging.common.BinaryFileParser {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.ImageParser.class.getName());

    public boolean dumpImageFile(java.io.PrintWriter printWriter, org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return false;
    }

    protected abstract java.lang.String[] getAcceptedExtensions();

    protected abstract org.apache.commons.imaging.ImageFormat[] getAcceptedTypes();

    public abstract java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract java.lang.String getDefaultExtension();

    public org.apache.commons.imaging.FormatCompliance getFormatCompliance(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public abstract byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract java.lang.String getName();

    public static org.apache.commons.imaging.ImageParser[] getAllImageParsers() {
        return new org.apache.commons.imaging.ImageParser[]{new org.apache.commons.imaging.formats.bmp.BmpImageParser(), new org.apache.commons.imaging.formats.dcx.DcxImageParser(), new org.apache.commons.imaging.formats.gif.GifImageParser(), new org.apache.commons.imaging.formats.icns.IcnsImageParser(), new org.apache.commons.imaging.formats.ico.IcoImageParser(), new org.apache.commons.imaging.formats.jpeg.JpegImageParser(), new org.apache.commons.imaging.formats.pcx.PcxImageParser(), new org.apache.commons.imaging.formats.png.PngImageParser(), new org.apache.commons.imaging.formats.pnm.PnmImageParser(), new org.apache.commons.imaging.formats.psd.PsdImageParser(), new org.apache.commons.imaging.formats.rgbe.RgbeImageParser(), new org.apache.commons.imaging.formats.tiff.TiffImageParser(), new org.apache.commons.imaging.formats.wbmp.WbmpImageParser(), new org.apache.commons.imaging.formats.xbm.XbmImageParser(), new org.apache.commons.imaging.formats.xpm.XpmImageParser()};
    }

    public final org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(byteSource, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final org.apache.commons.imaging.common.ImageMetadata getMetadata(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final org.apache.commons.imaging.common.ImageMetadata getMetadata(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public final org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getMetadata(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final org.apache.commons.imaging.common.ImageMetadata getMetadata(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(".getMetadata: ");
            sb.append(file.getName());
            logger.finest(sb.toString());
        }
        if (canAcceptExtension(file)) {
            return getMetadata(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
        }
        return null;
    }

    public final org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(byteSource, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final org.apache.commons.imaging.ImageInfo getImageInfo(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public final org.apache.commons.imaging.ImageInfo getImageInfo(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (canAcceptExtension(file)) {
            return getImageInfo(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
        }
        return null;
    }

    public final org.apache.commons.imaging.FormatCompliance getFormatCompliance(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getFormatCompliance(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public final org.apache.commons.imaging.FormatCompliance getFormatCompliance(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (canAcceptExtension(file)) {
            return getFormatCompliance(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
        }
        return null;
    }

    public java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.awt.image.BufferedImage bufferedImage = getBufferedImage(byteSource, (java.util.Map<java.lang.String, java.lang.Object>) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bufferedImage);
        return arrayList;
    }

    public final java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getAllBufferedImages(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public final java.util.List<java.awt.image.BufferedImage> getAllBufferedImages(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (canAcceptExtension(file)) {
            return getAllBufferedImages(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
        }
        return null;
    }

    public final java.awt.image.BufferedImage getBufferedImage(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public final java.awt.image.BufferedImage getBufferedImage(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (canAcceptExtension(file)) {
            return getBufferedImage(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
        }
        return null;
    }

    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        outputStream.close();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This image format (");
        sb.append(getName());
        sb.append(") cannot be written.");
        throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
    }

    public final java.awt.Dimension getImageSize(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final java.awt.Dimension getImageSize(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public final java.awt.Dimension getImageSize(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getImageSize(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final java.awt.Dimension getImageSize(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (canAcceptExtension(file)) {
            return getImageSize(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
        }
        return null;
    }

    public final byte[] getICCProfileBytes(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(bArr, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final byte[] getICCProfileBytes(byte[] bArr, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), map);
    }

    public final byte[] getICCProfileBytes(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getICCProfileBytes(file, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public final byte[] getICCProfileBytes(java.io.File file, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(": ");
            sb.append(file.getName());
            logger.finest(sb.toString());
        }
        return getICCProfileBytes(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), map);
    }

    public final java.lang.String dumpImageFile(byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return dumpImageFile(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr));
    }

    public final java.lang.String dumpImageFile(java.io.File file) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(": ");
            sb.append(file.getName());
            logger.finest(sb.toString());
        }
        return dumpImageFile(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file));
    }

    public final java.lang.String dumpImageFile(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        dumpImageFile(printWriter, byteSource);
        printWriter.flush();
        return stringWriter.toString();
    }

    public boolean canAcceptType(org.apache.commons.imaging.ImageFormat imageFormat) {
        for (org.apache.commons.imaging.ImageFormat imageFormat2 : getAcceptedTypes()) {
            if (imageFormat2.equals(imageFormat)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean canAcceptExtension(java.io.File file) {
        return canAcceptExtension(file.getName());
    }

    protected final boolean canAcceptExtension(java.lang.String str) {
        java.lang.String[] acceptedExtensions = getAcceptedExtensions();
        if (acceptedExtensions == null) {
            return true;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            java.lang.String lowerCase = str.substring(lastIndexOf).toLowerCase(java.util.Locale.ENGLISH);
            for (java.lang.String str2 : acceptedExtensions) {
                if (str2.toLowerCase(java.util.Locale.ENGLISH).equals(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected org.apache.commons.imaging.common.BufferedImageFactory getBufferedImageFactory(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return new org.apache.commons.imaging.common.SimpleBufferedImageFactory();
        }
        org.apache.commons.imaging.common.BufferedImageFactory bufferedImageFactory = (org.apache.commons.imaging.common.BufferedImageFactory) map.get(org.apache.commons.imaging.ImagingConstants.BUFFERED_IMAGE_FACTORY);
        return bufferedImageFactory != null ? bufferedImageFactory : new org.apache.commons.imaging.common.SimpleBufferedImageFactory();
    }

    public static boolean isStrict(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null || !map.containsKey(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT)) {
            return false;
        }
        return ((java.lang.Boolean) map.get(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT)).booleanValue();
    }
}
