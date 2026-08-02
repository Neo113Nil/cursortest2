package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class BmpImageContents {
    final org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bhi;
    final byte[] colorTable;
    final byte[] imageData;
    final org.apache.commons.imaging.formats.bmp.PixelParser pixelParser;

    BmpImageContents(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2, org.apache.commons.imaging.formats.bmp.PixelParser pixelParser) {
        this.bhi = bmpHeaderInfo;
        this.colorTable = bArr;
        this.imageData = bArr2;
        this.pixelParser = pixelParser;
    }
}
