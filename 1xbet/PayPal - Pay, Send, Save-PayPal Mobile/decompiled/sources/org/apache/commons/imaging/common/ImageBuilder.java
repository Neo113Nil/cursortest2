package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class ImageBuilder {
    private final int[] data;
    private final boolean hasAlpha;
    private final int height;
    private final int width;

    public ImageBuilder(int i, int i2, boolean z) {
        if (i <= 0) {
            throw new java.awt.image.RasterFormatException("zero or negative width value");
        }
        if (i2 <= 0) {
            throw new java.awt.image.RasterFormatException("zero or negative height value");
        }
        this.data = new int[i * i2];
        this.width = i;
        this.height = i2;
        this.hasAlpha = z;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRGB(int i, int i2) {
        return this.data[(i2 * this.width) + i];
    }

    public void setRGB(int i, int i2, int i3) {
        this.data[(i2 * this.width) + i] = i3;
    }

    public java.awt.image.BufferedImage getBufferedImage() {
        return makeBufferedImage(this.data, this.width, this.height, this.hasAlpha);
    }

    public java.awt.image.BufferedImage getSubimage(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 <= 0) {
            throw new java.awt.image.RasterFormatException("negative or zero subimage width");
        }
        if (i4 <= 0) {
            throw new java.awt.image.RasterFormatException("negative or zero subimage height");
        }
        if (i < 0 || i >= (i5 = this.width)) {
            throw new java.awt.image.RasterFormatException("subimage x is outside raster");
        }
        if (i + i3 > i5) {
            throw new java.awt.image.RasterFormatException("subimage (x+width) is outside raster");
        }
        if (i2 < 0 || i2 >= (i6 = this.height)) {
            throw new java.awt.image.RasterFormatException("subimage y is outside raster");
        }
        if (i2 + i4 > i6) {
            throw new java.awt.image.RasterFormatException("subimage (y+height) is outside raster");
        }
        int[] iArr = new int[i3 * i4];
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            java.lang.System.arraycopy(this.data, ((i8 + i2) * this.width) + i, iArr, i7, i3);
            i7 += i3;
        }
        return makeBufferedImage(iArr, i3, i4, this.hasAlpha);
    }

    private java.awt.image.BufferedImage makeBufferedImage(int[] iArr, int i, int i2, boolean z) {
        java.awt.image.DirectColorModel directColorModel;
        java.awt.image.WritableRaster createPackedRaster;
        java.awt.image.DataBufferInt dataBufferInt = new java.awt.image.DataBufferInt(iArr, i * i2);
        if (z) {
            directColorModel = new java.awt.image.DirectColorModel(32, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, -16777216);
            createPackedRaster = java.awt.image.Raster.createPackedRaster(dataBufferInt, i, i2, i, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, -16777216}, (java.awt.Point) null);
        } else {
            directColorModel = new java.awt.image.DirectColorModel(24, 16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255);
            createPackedRaster = java.awt.image.Raster.createPackedRaster(dataBufferInt, i, i2, i, new int[]{16711680, androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255}, (java.awt.Point) null);
        }
        return new java.awt.image.BufferedImage(directColorModel, createPackedRaster, directColorModel.isAlphaPremultiplied(), new java.util.Properties());
    }
}
