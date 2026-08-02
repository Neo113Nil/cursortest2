package org.jose4j.lang;

/* loaded from: classes18.dex */
public class ByteUtil {
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static int getInt(byte b) {
        return b >= 0 ? b : 256 - (~(b - 1));
    }

    public static byte[] convertUnsignedToSignedTwosComp(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = getByte(iArr[i]);
        }
        return bArr;
    }

    public static int[] convertSignedTwosCompToUnsigned(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = getInt(bArr[i]);
        }
        return iArr;
    }

    public static byte getByte(int i) {
        byte[] bytes = getBytes(i);
        if (bytes[0] != 0 || bytes[1] != 0 || bytes[2] != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Integer value (");
            sb.append(i);
            sb.append(") too large to stuff into one byte.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return bytes[3];
    }

    public static byte[] getBytes(int i) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt(i);
        return allocate.array();
    }

    public static byte[] getBytes(long j) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.putLong(j);
        return allocate.array();
    }

    public static boolean secureEquals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = EMPTY_BYTES;
        }
        if (bArr2 == null) {
            bArr2 = EMPTY_BYTES;
        }
        int min = java.lang.Math.min(bArr.length, bArr2.length);
        int max = java.lang.Math.max(bArr.length, bArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0 && min == max;
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("IOEx from ByteArrayOutputStream?!", e);
        }
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] leftHalf(byte[] bArr) {
        return subArray(bArr, 0, bArr.length / 2);
    }

    public static byte[] rightHalf(byte[] bArr) {
        int length = bArr.length / 2;
        return subArray(bArr, length, length);
    }

    public static int bitLength(byte[] bArr) {
        return bitLength(bArr.length);
    }

    public static int bitLength(int i) {
        if (i <= 268435455 && i >= 0) {
            return i * 8;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte length (");
        sb.append(i);
        sb.append(") for converting to bit length");
        throw new org.jose4j.lang.UncheckedJoseException(sb.toString());
    }

    public static byte[] reverse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[(length - 1) - i] = bArr[i];
        }
        return bArr2;
    }

    public static int byteLength(int i) {
        return i / 8;
    }

    public static byte[] randomBytes(int i, java.security.SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = new java.security.SecureRandom();
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] randomBytes(int i) {
        return randomBytes(i, null);
    }

    public static java.lang.String toDebugString(byte[] bArr) {
        java.lang.String base64UrlEncode = new org.jose4j.base64url.Base64Url().base64UrlEncode(bArr);
        int[] convertSignedTwosCompToUnsigned = convertSignedTwosCompToUnsigned(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.util.Arrays.toString(convertSignedTwosCompToUnsigned));
        sb.append("(");
        sb.append(convertSignedTwosCompToUnsigned.length);
        sb.append("bytes/");
        sb.append(bitLength(convertSignedTwosCompToUnsigned.length));
        sb.append("bits) | base64url encoded: ");
        sb.append(base64UrlEncode);
        return sb.toString();
    }
}
