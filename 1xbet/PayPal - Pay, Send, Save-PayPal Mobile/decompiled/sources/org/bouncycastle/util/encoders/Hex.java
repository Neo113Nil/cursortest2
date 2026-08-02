package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class Hex {
    private static final org.bouncycastle.util.encoders.HexEncoder getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.util.encoders.HexEncoder();

    public static java.lang.String toHexString(byte[] bArr, int i, int i2) {
        return org.bouncycastle.util.Strings.fromByteArray(encode(bArr, i, i2));
    }

    public static java.lang.String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            getHighResolutionOutputSizeshNQ4ISI.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding Hex string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.EncoderException(sb.toString(), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static int encode(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI.encode(bArr, 0, bArr.length, outputStream);
    }

    public static int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI.encode(bArr, i, i2, outputStream);
    }

    public static byte[] decodeStrict(java.lang.String str, int i, int i2) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(str, i, i2);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decodeStrict(java.lang.String str) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(str, 0, str.length());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            getHighResolutionOutputSizeshNQ4ISI.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding Hex data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static byte[] decode(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            getHighResolutionOutputSizeshNQ4ISI.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.encoders.DecoderException(sb.toString(), e);
        }
    }

    public static int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI.decode(str, outputStream);
    }
}
