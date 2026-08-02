package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PgmWriter implements org.apache.commons.imaging.formats.pnm.PnmWriter {
    private final boolean rawbits;

    PgmWriter(boolean z) {
        this.rawbits = z;
    }

    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        outputStream.write(80);
        outputStream.write(this.rawbits ? 53 : 50);
        outputStream.write(32);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        outputStream.write(java.lang.Integer.toString(width).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(32);
        outputStream.write(java.lang.Integer.toString(height).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(32);
        outputStream.write(java.lang.Integer.toString(255).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = ((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3;
                if (this.rawbits) {
                    outputStream.write((byte) i3);
                } else {
                    outputStream.write(java.lang.Integer.toString(i3).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                    outputStream.write(32);
                }
            }
        }
    }
}
