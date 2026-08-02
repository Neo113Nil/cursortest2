package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class UrlBase64 {
    private static final org.bouncycastle.util.encoders.Encoder Camera2StreamConfigurationMap = new org.bouncycastle.util.encoders.UrlBase64Encoder();

    public static byte[] encode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            Camera2StreamConfigurationMap.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding URL safe base64 data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.EncoderException(sb.toString(), e);
        }
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            Camera2StreamConfigurationMap.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding URL safe base64 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            Camera2StreamConfigurationMap.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding URL safe base64 string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.decode(bArr, 0, bArr.length, outputStream);
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap.decode(str, outputStream);
    }
}
