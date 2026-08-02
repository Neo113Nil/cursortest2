package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PamWriter implements org.apache.commons.imaging.formats.pnm.PnmWriter {
    PamWriter() {
    }

    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(java.awt.image.BufferedImage bufferedImage, java.io.OutputStream outputStream, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageWriteException, java.io.IOException {
        outputStream.write(80);
        outputStream.write(55);
        outputStream.write(10);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        outputStream.write("WIDTH ".concat(java.lang.String.valueOf(width)).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        outputStream.write("HEIGHT ".concat(java.lang.String.valueOf(height)).getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        outputStream.write("DEPTH 4".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        outputStream.write("MAXVAL 255".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        outputStream.write("TUPLTYPE RGB_ALPHA".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        outputStream.write("ENDHDR".getBytes(java.nio.charset.StandardCharsets.US_ASCII));
        outputStream.write(10);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                outputStream.write((byte) ((rgb >> 16) & 255));
                outputStream.write((byte) ((rgb >> 8) & 255));
                outputStream.write((byte) (rgb & 255));
                outputStream.write((byte) ((rgb >> 24) & 255));
            }
        }
    }
}
