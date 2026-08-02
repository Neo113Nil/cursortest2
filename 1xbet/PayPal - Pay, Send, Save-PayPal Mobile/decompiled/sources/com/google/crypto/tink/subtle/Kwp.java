package com.google.crypto.tink.subtle;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public class Kwp implements com.google.crypto.tink.KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = {-90, 89, 89, -90};
    static final int ROUNDS = 6;
    private final javax.crypto.SecretKey aesKey;

    public Kwp(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length != 16 && bArr.length != 32) {
            throw new java.security.GeneralSecurityException("Unsupported key length");
        }
        this.aesKey = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
    }

    private int wrappingSize(int i) {
        return i + (7 - ((i + 7) % 8)) + 8;
    }

    private byte[] computeW(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr2.length <= 8 || bArr2.length > 2147483631 || bArr.length != 8) {
            throw new java.security.GeneralSecurityException("computeW called with invalid parameters");
        }
        int wrappingSize = wrappingSize(bArr2.length);
        byte[] bArr3 = new byte[wrappingSize];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr3, 8, bArr2.length);
        int i = 1;
        int i2 = (wrappingSize / 8) - 1;
        javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.aesKey);
        byte[] bArr4 = new byte[16];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, 8);
        int i3 = 0;
        while (i3 < 6) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 * 8;
                java.lang.System.arraycopy(bArr3, i6, bArr4, 8, 8);
                engineFactory.doFinal(bArr4, 0, 16, bArr4);
                int i7 = (i3 * i2) + i4 + i;
                for (int i8 = 0; i8 < 4; i8++) {
                    int i9 = 7 - i8;
                    bArr4[i9] = (byte) (((byte) (i7 & 255)) ^ bArr4[i9]);
                    i7 >>>= 8;
                }
                java.lang.System.arraycopy(bArr4, 8, bArr3, i6, 8);
                i4 = i5;
                i = 1;
            }
            i3++;
            i = 1;
        }
        java.lang.System.arraycopy(bArr4, 0, bArr3, 0, 8);
        return bArr3;
    }

    private byte[] invertW(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < 24 || bArr.length % 8 != 0) {
            throw new java.security.GeneralSecurityException("Incorrect data size");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int length = copyOf.length / 8;
        javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.aesKey);
        byte[] bArr2 = new byte[16];
        java.lang.System.arraycopy(copyOf, 0, bArr2, 0, 8);
        for (int i = 5; i >= 0; i--) {
            for (int i2 = length - 2; i2 >= 0; i2--) {
                int i3 = (i2 + 1) * 8;
                java.lang.System.arraycopy(copyOf, i3, bArr2, 8, 8);
                int i4 = ((length - 1) * i) + i2 + 1;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = 7 - i5;
                    bArr2[i6] = (byte) (bArr2[i6] ^ ((byte) (i4 & 255)));
                    i4 >>>= 8;
                }
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                java.lang.System.arraycopy(bArr2, 8, copyOf, i3, 8);
            }
        }
        java.lang.System.arraycopy(bArr2, 0, copyOf, 0, 8);
        return copyOf;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length < 16) {
            throw new java.security.GeneralSecurityException("Key size of key to wrap too small");
        }
        if (bArr.length > 4096) {
            throw new java.security.GeneralSecurityException("Key size of key to wrap too large");
        }
        byte[] bArr2 = new byte[8];
        byte[] bArr3 = PREFIX;
        java.lang.System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        for (int i = 0; i < 4; i++) {
            bArr2[i + 4] = (byte) ((bArr.length >> ((3 - i) * 8)) & 255);
        }
        return computeW(bArr2, bArr);
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] bArr) throws java.security.GeneralSecurityException {
        int i;
        if (bArr.length < wrappingSize(16)) {
            throw new java.security.GeneralSecurityException("Wrapped key size is too small");
        }
        if (bArr.length > wrappingSize(4096)) {
            throw new java.security.GeneralSecurityException("Wrapped key size is too large");
        }
        if (bArr.length % 8 != 0) {
            throw new java.security.GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
        }
        byte[] invertW = invertW(bArr);
        boolean z = true;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (PREFIX[i2] != invertW[i2]) {
                z = false;
            }
            i2++;
        }
        int i3 = 0;
        for (i = 4; i < 8; i++) {
            i3 = (i3 << 8) + (invertW[i] & 255);
        }
        if (wrappingSize(i3) == invertW.length) {
            for (int i4 = i3 + 8; i4 < invertW.length; i4++) {
                if (invertW[i4] != 0) {
                    z = false;
                }
            }
            if (z) {
                return java.util.Arrays.copyOfRange(invertW, 8, i3 + 8);
            }
        }
        throw new javax.crypto.BadPaddingException("Invalid padding");
    }
}
