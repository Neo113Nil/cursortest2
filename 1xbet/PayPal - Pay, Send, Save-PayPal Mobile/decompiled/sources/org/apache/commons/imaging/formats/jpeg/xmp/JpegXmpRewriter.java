package org.apache.commons.imaging.formats.jpeg.xmp;

/* loaded from: classes17.dex */
public class JpegXmpRewriter extends org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter {
    public void removeXmpXml(java.io.File file, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        removeXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream);
    }

    public void removeXmpXml(byte[] bArr, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        removeXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream);
    }

    public void removeXmpXml(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        removeXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream);
    }

    public void removeXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        writeSegments(outputStream, removeXmpSegments(analyzeJFIF(byteSource).pieces));
    }

    public void updateXmpXml(byte[] bArr, java.io.OutputStream outputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceArray(bArr), outputStream, str);
    }

    public void updateXmpXml(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream(inputStream, null), outputStream, str);
    }

    public void updateXmpXml(java.io.File file, java.io.OutputStream outputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        updateXmpXml(new org.apache.commons.imaging.common.bytesource.ByteSourceFile(file), outputStream, str);
    }

    public void updateXmpXml(org.apache.commons.imaging.common.bytesource.ByteSource byteSource, java.io.OutputStream outputStream, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        java.util.List removeXmpSegments = removeXmpSegments(analyzeJFIF(byteSource).pieces);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int i = 0;
        while (i < bytes.length) {
            int min = java.lang.Math.min(bytes.length, 65535);
            arrayList.add(new org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter.JFIFPieceSegment(org.apache.commons.imaging.formats.jpeg.JpegConstants.JPEG_APP1_MARKER, writeXmpSegment(bytes, i, min)));
            i += min;
        }
        writeSegments(outputStream, insertAfterLastAppSegments(removeXmpSegments, arrayList));
    }

    private byte[] writeXmpSegment(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        org.apache.commons.imaging.formats.jpeg.JpegConstants.XMP_IDENTIFIER.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.write(bArr, i, i2);
        return byteArrayOutputStream.toByteArray();
    }
}
