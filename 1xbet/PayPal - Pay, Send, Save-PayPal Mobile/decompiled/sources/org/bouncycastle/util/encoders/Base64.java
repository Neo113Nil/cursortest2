package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class Base64 {
    private static final org.bouncycastle.util.encoders.Encoder getHighSpeedVideoFpsRanges = new org.bouncycastle.util.encoders.Base64Encoder();

    public static java.lang.String toBase64String(byte[] bArr, int i, int i2) {
        return org.bouncycastle.util.Strings.fromByteArray(encode(bArr, i, i2));
    }

    public static java.lang.String toBase64String(byte[] bArr) {
        return toBase64String(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        org.bouncycastle.util.encoders.Encoder encoder = getHighSpeedVideoFpsRanges;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(encoder.getEncodedLength(i2));
        try {
            encoder.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding base64 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.EncoderException(sb.toString(), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges.encode(bArr, i, i2, outputStream);
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            getHighSpeedVideoFpsRanges.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base64 data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            getHighSpeedVideoFpsRanges.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base64 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) {
        try {
            return getHighSpeedVideoFpsRanges.decode(bArr, i, i2, outputStream);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base64 data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges.decode(str, outputStream);
    }
}
