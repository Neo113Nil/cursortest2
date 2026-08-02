package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
abstract class PixelParser {
    final org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bhi;
    final byte[] colorTable;
    final byte[] imageData;
    final java.io.InputStream is;

    public abstract void processImage(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    PixelParser(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        this.bhi = bmpHeaderInfo;
        this.colorTable = bArr;
        this.imageData = bArr2;
        this.is = new java.io.ByteArrayInputStream(bArr2);
    }

    int getColorTableRGB(int i) {
        int i2 = i * 4;
        byte[] bArr = this.colorTable;
        byte b = bArr[i2];
        return ((bArr[i2 + 2] & 255) << 16) | (-16777216) | ((bArr[i2 + 1] & 255) << 8) | (b & 255);
    }
}
