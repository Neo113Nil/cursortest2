package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PbmWriter implements org.apache.commons.imaging.formats.pnm.PnmWriter {
    private final boolean rawbits;

    PbmWriter(boolean z) {
        this.rawbits = z;
    }

    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        outputStream.write(80);
        outputStream.write(this.rawbits ? 52 : 49);
        outputStream.write(32);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        outputStream.write(java.lang.Integer.toString(width).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(32);
        outputStream.write(java.lang.Integer.toString(height).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                int rgb = bufferedImage.getRGB(i4, i3);
                int i5 = ((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127 ? 0 : 1;
                if (this.rawbits) {
                    i2 = (i2 << 1) | i5;
                    i++;
                    if (i >= 8) {
                        outputStream.write((byte) i2);
                        i = 0;
                        i2 = 0;
                    }
                } else {
                    outputStream.write(java.lang.Integer.toString(i5).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                    outputStream.write(32);
                }
            }
            if (this.rawbits && i > 0) {
                outputStream.write((byte) (i2 << (8 - i)));
                i = 0;
                i2 = 0;
            }
        }
    }
}
