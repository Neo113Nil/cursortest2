package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
class ScanExpediterInterlaced extends org.apache.commons.imaging.formats.png.ScanExpediter {
    private static final int[] STARTING_ROW = {0, 0, 4, 0, 2, 0, 1};
    private static final int[] STARTING_COL = {0, 4, 0, 2, 0, 1, 0};
    private static final int[] ROW_INCREMENT = {8, 8, 8, 4, 4, 2, 2};
    private static final int[] COL_INCREMENT = {8, 8, 4, 4, 2, 2, 1};

    ScanExpediterInterlaced(int i, int i2, java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.png.PngColorType pngColorType, int i3, int i4, org.apache.commons.imaging.formats.png.chunks.PngChunkPlte pngChunkPlte, org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection, org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter transparencyFilter) {
        super(i, i2, inputStream, bufferedImage, pngColorType, i3, i4, pngChunkPlte, gammaCorrection, transparencyFilter);
    }

    private void visit(int i, int i2, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.png.BitParser bitParser, int i3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        bufferedImage.setRGB(i, i2, getRGB(bitParser, i3));
    }

    @Override // org.apache.commons.imaging.formats.png.ScanExpediter
    public void drive() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (int i = 1; i <= 7; i++) {
            int i2 = i - 1;
            byte[] bArr = null;
            for (int i3 = STARTING_ROW[i2]; i3 < this.height; i3 += ROW_INCREMENT[i2]) {
                int[] iArr = STARTING_COL;
                int i4 = iArr[i2];
                if (i4 < this.width) {
                    bArr = getNextScanline(this.is, getBitsToBytesRoundingUp(this.bitsPerPixel * ((((this.width - iArr[i2]) - 1) / COL_INCREMENT[i2]) + 1)), bArr, this.bytesPerPixel);
                    org.apache.commons.imaging.formats.png.BitParser bitParser = new org.apache.commons.imaging.formats.png.BitParser(bArr, this.bitsPerPixel, this.bitDepth);
                    int i5 = 0;
                    int i6 = i4;
                    while (i6 < this.width) {
                        visit(i6, i3, this.bi, bitParser, i5);
                        i6 += COL_INCREMENT[i2];
                        i5++;
                    }
                }
            }
        }
    }
}
