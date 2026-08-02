package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
abstract class PixelParserSimple extends org.apache.commons.imaging.formats.bmp.PixelParser {
    public abstract int getNextRGB() throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public abstract void newline() throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    PixelParserSimple(org.apache.commons.imaging.formats.bmp.BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParser
    public void processImage(org.apache.commons.imaging.common.ImageBuilder imageBuilder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (int i = this.bhi.height - 1; i >= 0; i--) {
            for (int i2 = 0; i2 < this.bhi.width; i2++) {
                imageBuilder.setRGB(i2, i, getNextRGB());
            }
            newline();
        }
    }
}
