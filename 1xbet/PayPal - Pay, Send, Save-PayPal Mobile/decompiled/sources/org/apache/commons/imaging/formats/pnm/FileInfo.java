package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
abstract class FileInfo {
    final int height;
    final boolean rawbits;
    final int width;

    abstract int getBitDepth();

    abstract org.apache.commons.imaging.ImageInfo.ColorType getColorType();

    abstract org.apache.commons.imaging.ImageFormat getImageType();

    abstract java.lang.String getImageTypeDescription();

    abstract java.lang.String getMIMEType();

    abstract int getNumComponents();

    abstract int getRGB(java.io.InputStream inputStream) throws java.io.IOException;

    abstract int getRGB(org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader) throws java.io.IOException;

    abstract boolean hasAlpha();

    void newline() {
    }

    FileInfo(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.rawbits = z;
    }

    static int readSample(java.io.InputStream inputStream, int i) throws java.io.IOException {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read = inputStream.read();
            if (read < 0) {
                throw new java.io.IOException("PNM: Unexpected EOF");
            }
            i2 = (i2 << 8) | read;
        }
        return i2;
    }

    static int scaleSample(int i, float f, int i2) throws java.io.IOException {
        if (i < 0) {
            throw new java.io.IOException("Negative pixel values are invalid in PNM files");
        }
        if (i > i2) {
            i = 0;
        }
        return (int) (((i * f) / i2) + 0.5f);
    }

    void readImage(org.apache.commons.imaging.common.ImageBuilder imageBuilder, java.io.InputStream inputStream) throws java.io.IOException {
        if (!this.rawbits) {
            org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader = new org.apache.commons.imaging.formats.pnm.WhiteSpaceReader(inputStream);
            for (int i = 0; i < this.height; i++) {
                for (int i2 = 0; i2 < this.width; i2++) {
                    imageBuilder.setRGB(i2, i, getRGB(whiteSpaceReader));
                }
                newline();
            }
            return;
        }
        for (int i3 = 0; i3 < this.height; i3++) {
            for (int i4 = 0; i4 < this.width; i4++) {
                imageBuilder.setRGB(i4, i3, getRGB(inputStream));
            }
            newline();
        }
    }
}
