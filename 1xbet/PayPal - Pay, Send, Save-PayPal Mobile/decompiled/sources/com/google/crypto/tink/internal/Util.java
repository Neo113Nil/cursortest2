package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class Util {
    public static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");

    public static int randKeyId() {
        int i = 0;
        while (i == 0) {
            byte[] randBytes = com.google.crypto.tink.internal.Random.randBytes(4);
            i = (randBytes[3] & 255) | ((randBytes[0] & 255) << 24) | ((randBytes[1] & 255) << 16) | ((randBytes[2] & 255) << 8);
        }
        return i;
    }

    private static final byte toByteFromPrintableAscii(char c) {
        if (c < '!' || c > '~') {
            throw new com.google.crypto.tink.internal.TinkBugException("Not a printable ASCII character: ".concat(java.lang.String.valueOf(c)));
        }
        return (byte) c;
    }

    private static final byte checkedToByteFromPrintableAscii(char c) throws java.security.GeneralSecurityException {
        if (c < '!' || c > '~') {
            throw new java.security.GeneralSecurityException("Not a printable ASCII character: ".concat(java.lang.String.valueOf(c)));
        }
        return (byte) c;
    }

    public static final com.google.crypto.tink.util.Bytes toBytesFromPrintableAscii(java.lang.String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = toByteFromPrintableAscii(str.charAt(i));
        }
        return com.google.crypto.tink.util.Bytes.copyFrom(bArr);
    }

    public static final com.google.crypto.tink.util.Bytes checkedToBytesFromPrintableAscii(java.lang.String str) throws java.security.GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = checkedToByteFromPrintableAscii(str.charAt(i));
        }
        return com.google.crypto.tink.util.Bytes.copyFrom(bArr);
    }

    public static boolean isAndroid() {
        return java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project");
    }

    @javax.annotation.Nullable
    public static java.lang.Integer getAndroidApiLevel() {
        if (isAndroid()) {
            return com.google.crypto.tink.internal.BuildDispatchedCode.getApiLevel();
        }
        return null;
    }

    public static boolean isPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static com.google.crypto.tink.util.SecretBytes readIntoSecretBytes(java.io.InputStream inputStream, int i, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new java.security.GeneralSecurityException("Not enough pseudorandomness provided");
                }
                i2 += read;
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Reading pseudorandomness failed");
            }
        }
        return com.google.crypto.tink.util.SecretBytes.copyFrom(bArr, secretKeyAccess);
    }

    private Util() {
    }
}
