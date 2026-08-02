package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
class BmpWriterRgb implements org.apache.commons.imaging.formats.bmp.BmpWriter {
    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public int getBitsPerPixel() {
        return 24;
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public int getPaletteSize() {
        return 0;
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public void writePalette(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException {
    }

    BmpWriterRgb() {
    }

    @Override // org.apache.commons.imaging.formats.bmp.BmpWriter
    public byte[] getImageData(java.awt.image.BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        for (int i2 = height - 1; i2 >= 0; i2--) {
            for (int i3 = 0; i3 < width; i3++) {
                int rgb = bufferedImage.getRGB(i3, i2);
                int i4 = 16777215 & rgb;
                byteArrayOutputStream.write(rgb & 255);
                byteArrayOutputStream.write((i4 >> 8) & 255);
                byteArrayOutputStream.write((i4 >> 16) & 255);
                i += 3;
            }
            while (i % 4 != 0) {
                byteArrayOutputStream.write(0);
                i++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
