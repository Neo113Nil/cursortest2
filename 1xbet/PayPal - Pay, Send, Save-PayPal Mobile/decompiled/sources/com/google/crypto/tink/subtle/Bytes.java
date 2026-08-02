package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class Bytes {
    public static final boolean equal(byte[] bArr, byte[] bArr2) {
        return java.security.MessageDigest.isEqual(bArr, bArr2);
    }

    public static byte[] concat(byte[]... bArr) throws java.security.GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                throw new java.security.GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] xor(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static final void xor(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
        }
        return xor(bArr, 0, bArr2, 0, bArr.length);
    }

    public static final byte[] xorEnd(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            throw new java.lang.IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        for (int i = 0; i < bArr2.length; i++) {
            int i2 = (length - length2) + i;
            copyOf[i2] = (byte) (copyOf[i2] ^ bArr2[i]);
        }
        return copyOf;
    }

    public static byte[] intToByteArray(int i, int i2) {
        if (i > 4 || i < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i * 8)))) {
            throw new java.lang.IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (i3 * 8)) & 255);
        }
        return bArr;
    }

    public static int byteArrayToInt(byte[] bArr) {
        return byteArrayToInt(bArr, bArr.length);
    }

    public static int byteArrayToInt(byte[] bArr, int i) {
        return byteArrayToInt(bArr, 0, i);
    }

    public static int byteArrayToInt(byte[] bArr, int i, int i2) {
        if (i2 > 4 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("length must be between 0 and 4");
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new java.lang.IllegalArgumentException("offset and length are out of bounds");
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (bArr[i4 + i] & 255) << (i4 * 8);
        }
        return i3;
    }

    private Bytes() {
    }
}
