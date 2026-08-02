package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class Base32 {
    private static final org.bouncycastle.util.encoders.Encoder Camera2StreamConfigurationMap = new org.bouncycastle.util.encoders.Base32Encoder();

    public static java.lang.String toBase32String(byte[] bArr, int i, int i2) {
        return org.bouncycastle.util.Strings.fromByteArray(encode(bArr, i, i2));
    }

    public static java.lang.String toBase32String(byte[] bArr) {
        return toBase32String(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        org.bouncycastle.util.encoders.Encoder encoder = Camera2StreamConfigurationMap;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(encoder.getEncodedLength(i2));
        try {
            encoder.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding base32 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.EncoderException(sb.toString(), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.encode(bArr, i, i2, outputStream);
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((bArr.length / 8) * 5);
        try {
            Camera2StreamConfigurationMap.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base32 data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((str.length() / 8) * 5);
        try {
            Camera2StreamConfigurationMap.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base32 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) {
        try {
            return Camera2StreamConfigurationMap.decode(bArr, i, i2, outputStream);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode base32 data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.decode(str, outputStream);
    }
}
