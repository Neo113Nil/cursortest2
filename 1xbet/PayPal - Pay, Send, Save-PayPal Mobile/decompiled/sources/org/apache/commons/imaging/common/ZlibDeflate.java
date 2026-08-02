package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class ZlibDeflate {
    public static byte[] decompress(byte[] bArr, int i) throws org.apache.commons.imaging.ImageReadException {
        try {
            java.util.zip.Inflater inflater = new java.util.zip.Inflater();
            inflater.setInput(bArr);
            byte[] bArr2 = new byte[i];
            inflater.inflate(bArr2);
            return bArr2;
        } catch (java.util.zip.DataFormatException e) {
            throw new org.apache.commons.imaging.ImageReadException("Unable to decompress image", e);
        }
    }

    public static byte[] compress(byte[] bArr) throws org.apache.commons.imaging.ImageWriteException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length / 2);
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.io.IOException e) {
            throw new org.apache.commons.imaging.ImageWriteException("Unable to compress image", (java.lang.Throwable) e);
        }
    }
}
