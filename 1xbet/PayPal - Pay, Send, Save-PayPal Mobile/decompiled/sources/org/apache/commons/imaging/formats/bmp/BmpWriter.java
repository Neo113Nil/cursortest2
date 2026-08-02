package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes17.dex */
interface BmpWriter {
    int getBitsPerPixel();

    byte[] getImageData(java.awt.image.BufferedImage bufferedImage);

    int getPaletteSize();

    void writePalette(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException;
}
