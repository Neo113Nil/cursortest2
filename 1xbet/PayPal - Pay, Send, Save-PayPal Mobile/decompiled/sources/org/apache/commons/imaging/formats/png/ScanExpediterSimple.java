package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
class ScanExpediterSimple extends org.apache.commons.imaging.formats.png.ScanExpediter {
    ScanExpediterSimple(int i, int i2, java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.png.PngColorType pngColorType, int i3, int i4, org.apache.commons.imaging.formats.png.chunks.PngChunkPlte pngChunkPlte, org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection, org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter) {
        super(i, i2, inputStream, bufferedImage, pngColorType, i3, i4, pngChunkPlte, gammaCorrection, transparencyFilter);
    }

    @Override // org.apache.commons.imaging.formats.png.ScanExpediter
    public void drive() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int bitsToBytesRoundingUp = getBitsToBytesRoundingUp(this.bitsPerPixel * this.width);
        byte[] bArr = null;
        for (int i = 0; i < this.height; i++) {
            bArr = getNextScanline(this.is, bitsToBytesRoundingUp, bArr, this.bytesPerPixel);
            org.apache.commons.imaging.formats.png.BitParser bitParser = new org.apache.commons.imaging.formats.png.BitParser(bArr, this.bitsPerPixel, this.bitDepth);
            for (int i2 = 0; i2 < this.width; i2++) {
                this.bi.setRGB(i2, i, getRGB(bitParser, i2));
            }
        }
    }
}
