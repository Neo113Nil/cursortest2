package org.apache.commons.imaging.formats.rgbe;

/* loaded from: classes17.dex */
public class RgbeImageParser extends org.apache.commons.imaging.ImageParser {
    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return null;
    }

    public RgbeImageParser() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getName() {
        return "Radiance HDR";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String getDefaultExtension() {
        return ".hdr";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.lang.String[] getAcceptedExtensions() {
        return new java.lang.String[]{".hdr", ".pic"};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageFormat[] getAcceptedTypes() {
        return new org.apache.commons.imaging.ImageFormat[]{org.apache.commons.imaging.ImageFormats.RGBE};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.common.ImageMetadata getMetadata(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.rgbe.RgbeInfo rgbeInfo = new org.apache.commons.imaging.formats.rgbe.RgbeInfo(byteSource);
        try {
            org.apache.commons.imaging.common.ImageMetadata metadata = rgbeInfo.getMetadata();
            rgbeInfo.close();
            return metadata;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    rgbeInfo.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public org.apache.commons.imaging.ImageInfo getImageInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.rgbe.RgbeInfo rgbeInfo = new org.apache.commons.imaging.formats.rgbe.RgbeInfo(byteSource);
        try {
            org.apache.commons.imaging.ImageInfo imageInfo = new org.apache.commons.imaging.ImageInfo(getName(), 32, new java.util.ArrayList(), org.apache.commons.imaging.ImageFormats.RGBE, getName(), rgbeInfo.getHeight(), "image/vnd.radiance", 1, -1, -1.0f, -1, -1.0f, rgbeInfo.getWidth(), false, false, false, org.apache.commons.imaging.ImageInfo.ColorType.RGB, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm.ADAPTIVE_RLE);
            rgbeInfo.close();
            return imageInfo;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.image.BufferedImage getBufferedImage(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.rgbe.RgbeInfo rgbeInfo = new org.apache.commons.imaging.formats.rgbe.RgbeInfo(byteSource);
        try {
            java.awt.image.DataBufferFloat dataBufferFloat = new java.awt.image.DataBufferFloat(rgbeInfo.getPixelData(), rgbeInfo.getWidth() * rgbeInfo.getHeight());
            java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(new java.awt.image.ComponentColorModel(java.awt.color.ColorSpace.getInstance(1000), false, false, 1, dataBufferFloat.getDataType()), java.awt.image.Raster.createWritableRaster(new java.awt.image.BandedSampleModel(dataBufferFloat.getDataType(), rgbeInfo.getWidth(), rgbeInfo.getHeight(), 3), dataBufferFloat, new java.awt.Point()), false, (java.util.Hashtable) null);
            rgbeInfo.close();
            return bufferedImage;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    rgbeInfo.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public java.awt.Dimension getImageSize(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.rgbe.RgbeInfo rgbeInfo = new org.apache.commons.imaging.formats.rgbe.RgbeInfo(byteSource);
        try {
            java.awt.Dimension dimension = new java.awt.Dimension(rgbeInfo.getWidth(), rgbeInfo.getHeight());
            rgbeInfo.close();
            return dimension;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    rgbeInfo.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
