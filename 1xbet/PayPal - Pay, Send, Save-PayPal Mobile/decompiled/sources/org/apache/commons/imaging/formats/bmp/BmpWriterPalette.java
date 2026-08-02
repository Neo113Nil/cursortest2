package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class BmpWriterPalette implements org.apache.commons.imaging.formats.bmp.BmpWriter {
    private final int bitsPerSample;
    private final org.apache.commons.imaging.palette.SimplePalette palette;

    BmpWriterPalette(org.apache.commons.imaging.palette.SimplePalette simplePalette) {
        this.palette = simplePalette;
        if (simplePalette.length() <= 2) {
            this.bitsPerSample = 1;
        } else if (simplePalette.length() <= 16) {
            this.bitsPerSample = 4;
        } else {
            this.bitsPerSample = 8;
        }
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public int getPaletteSize() {
        return this.palette.length();
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public int getBitsPerPixel() {
        return this.bitsPerSample;
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public void writePalette(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.palette.length(); i++) {
            int entry = this.palette.getEntry(i);
            binaryOutputStream.write(entry & 255);
            binaryOutputStream.write((entry >> 8) & 255);
            binaryOutputStream.write((entry >> 16) & 255);
            binaryOutputStream.write(0);
        }
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public byte[] getImageData(java.awt.image.BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = height - 1; i4 >= 0; i4--) {
            for (int i5 = 0; i5 < width; i5++) {
                int paletteIndex = this.palette.getPaletteIndex(bufferedImage.getRGB(i5, i4) & 16777215);
                int i6 = this.bitsPerSample;
                if (i6 == 8) {
                    byteArrayOutputStream.write(paletteIndex & 255);
                    i++;
                } else {
                    i3 = (i3 << i6) | paletteIndex;
                    i2 += i6;
                    if (i2 >= 8) {
                        byteArrayOutputStream.write(i3 & 255);
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                }
            }
            if (i2 > 0) {
                byteArrayOutputStream.write((i3 << (8 - i2)) & 255);
                i++;
                i2 = 0;
                i3 = 0;
            }
            while (i % 4 != 0) {
                byteArrayOutputStream.write(0);
                i++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
