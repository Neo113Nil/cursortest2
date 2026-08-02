package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, com.google.common.base.Ascii.SYN, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -79, -3, -122, 98, 5, com.google.common.base.Ascii.SYN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 73, -72, 0}, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -100, -107, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, com.google.common.base.Ascii.FS, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    private static void monty(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7, long[] jArr8, long[] jArr9) {
        long[] copyOf = java.util.Arrays.copyOf(jArr5, 10);
        long[] jArr10 = new long[19];
        long[] jArr11 = new long[19];
        long[] jArr12 = new long[19];
        long[] jArr13 = new long[19];
        long[] jArr14 = new long[19];
        long[] jArr15 = new long[19];
        long[] jArr16 = new long[19];
        com.google.crypto.tink.internal.Field25519.sum(jArr5, jArr6);
        com.google.crypto.tink.internal.Field25519.sub(jArr6, copyOf);
        long[] copyOf2 = java.util.Arrays.copyOf(jArr7, 10);
        com.google.crypto.tink.internal.Field25519.sum(jArr7, jArr8);
        com.google.crypto.tink.internal.Field25519.sub(jArr8, copyOf2);
        com.google.crypto.tink.internal.Field25519.product(jArr13, jArr7, jArr6);
        com.google.crypto.tink.internal.Field25519.product(jArr14, jArr5, jArr8);
        com.google.crypto.tink.internal.Field25519.reduceSizeByModularReduction(jArr13);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr13);
        com.google.crypto.tink.internal.Field25519.reduceSizeByModularReduction(jArr14);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr14);
        java.lang.System.arraycopy(jArr13, 0, copyOf2, 0, 10);
        com.google.crypto.tink.internal.Field25519.sum(jArr13, jArr14);
        com.google.crypto.tink.internal.Field25519.sub(jArr14, copyOf2);
        com.google.crypto.tink.internal.Field25519.square(jArr16, jArr13);
        com.google.crypto.tink.internal.Field25519.square(jArr15, jArr14);
        com.google.crypto.tink.internal.Field25519.product(jArr14, jArr15, jArr9);
        com.google.crypto.tink.internal.Field25519.reduceSizeByModularReduction(jArr14);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr14);
        java.lang.System.arraycopy(jArr16, 0, jArr3, 0, 10);
        java.lang.System.arraycopy(jArr14, 0, jArr4, 0, 10);
        com.google.crypto.tink.internal.Field25519.square(jArr11, jArr5);
        com.google.crypto.tink.internal.Field25519.square(jArr12, jArr6);
        com.google.crypto.tink.internal.Field25519.product(jArr, jArr11, jArr12);
        com.google.crypto.tink.internal.Field25519.reduceSizeByModularReduction(jArr);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr);
        com.google.crypto.tink.internal.Field25519.sub(jArr12, jArr11);
        java.util.Arrays.fill(jArr10, 10, 18, 0L);
        com.google.crypto.tink.internal.Field25519.scalarProduct(jArr10, jArr12, 121665L);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr10);
        com.google.crypto.tink.internal.Field25519.sum(jArr10, jArr11);
        com.google.crypto.tink.internal.Field25519.product(jArr2, jArr12, jArr10);
        com.google.crypto.tink.internal.Field25519.reduceSizeByModularReduction(jArr2);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr2);
    }

    static void swapConditional(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (((int) jArr2[i3]) ^ ((int) jArr[i3])) & i2;
            jArr[i3] = r1 ^ i4;
            jArr2[i3] = ((int) jArr2[i3]) ^ i4;
        }
    }

    static void copyConditional(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = i4 ^ ((((int) jArr2[i3]) ^ i4) & i2);
        }
    }

    public static void curveMult(long[] jArr, byte[] bArr, byte[] bArr2) throws java.security.InvalidKeyException {
        long[] expand = com.google.crypto.tink.internal.Field25519.expand(validatePubKeyAndClearMsb(bArr2));
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        int i = 0;
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i2 = 10;
        java.lang.System.arraycopy(expand, 0, jArr2, 0, 10);
        int i3 = 0;
        while (i3 < 32) {
            byte b = bArr[31 - i3];
            long[] jArr10 = jArr6;
            long[] jArr11 = jArr8;
            long[] jArr12 = jArr9;
            long[] jArr13 = jArr3;
            long[] jArr14 = jArr7;
            long[] jArr15 = jArr2;
            int i4 = i;
            long[] jArr16 = jArr5;
            long[] jArr17 = jArr4;
            long[] jArr18 = jArr16;
            while (i4 < 8) {
                int i5 = ((b & 255) >> (7 - i4)) & 1;
                swapConditional(jArr17, jArr15, i5);
                swapConditional(jArr18, jArr13, i5);
                long[] jArr19 = jArr14;
                long[] jArr20 = jArr11;
                byte b2 = b;
                long[] jArr21 = jArr10;
                long[] jArr22 = jArr18;
                long[] jArr23 = jArr17;
                long[] jArr24 = jArr13;
                long[] jArr25 = jArr15;
                monty(jArr11, jArr12, jArr10, jArr19, jArr17, jArr18, jArr15, jArr13, expand);
                swapConditional(jArr20, jArr21, i5);
                swapConditional(jArr12, jArr19, i5);
                i4++;
                jArr13 = jArr19;
                jArr18 = jArr12;
                jArr17 = jArr20;
                jArr15 = jArr21;
                b = b2;
                jArr12 = jArr22;
                jArr11 = jArr23;
                jArr14 = jArr24;
                jArr10 = jArr25;
            }
            long[] jArr26 = jArr17;
            long[] jArr27 = jArr13;
            long[] jArr28 = jArr15;
            jArr7 = jArr14;
            i3++;
            jArr9 = jArr12;
            jArr8 = jArr11;
            jArr6 = jArr10;
            jArr5 = jArr18;
            jArr4 = jArr26;
            jArr3 = jArr27;
            jArr2 = jArr28;
            i = 0;
            i2 = 10;
        }
        long[] jArr29 = new long[i2];
        com.google.crypto.tink.internal.Field25519.inverse(jArr29, jArr5);
        com.google.crypto.tink.internal.Field25519.mult(jArr, jArr4, jArr29);
        if (isCollinear(expand, jArr, jArr2, jArr3)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Arithmetic error in curve multiplication with the public key: ");
        sb.append(com.google.crypto.tink.subtle.Hex.encode(bArr2));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] bArr) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        int i = 0;
        while (true) {
            byte[][] bArr2 = BANNED_PUBLIC_KEYS;
            if (i >= bArr2.length) {
                return copyOf;
            }
            if (com.google.crypto.tink.subtle.Bytes.equal(bArr2[i], copyOf)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Banned public key: ");
                sb.append(com.google.crypto.tink.subtle.Hex.encode(bArr2[i]));
                throw new java.security.InvalidKeyException(sb.toString());
            }
            i++;
        }
    }

    private static boolean isCollinear(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[11];
        long[] jArr8 = new long[11];
        long[] jArr9 = new long[11];
        com.google.crypto.tink.internal.Field25519.mult(jArr5, jArr, jArr2);
        com.google.crypto.tink.internal.Field25519.sum(jArr6, jArr, jArr2);
        long[] jArr10 = new long[10];
        jArr10[0] = 486662;
        com.google.crypto.tink.internal.Field25519.sum(jArr8, jArr6, jArr10);
        com.google.crypto.tink.internal.Field25519.mult(jArr8, jArr8, jArr4);
        com.google.crypto.tink.internal.Field25519.sum(jArr8, jArr3);
        com.google.crypto.tink.internal.Field25519.mult(jArr8, jArr8, jArr5);
        com.google.crypto.tink.internal.Field25519.mult(jArr8, jArr8, jArr3);
        com.google.crypto.tink.internal.Field25519.scalarProduct(jArr7, jArr8, 4L);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr7);
        com.google.crypto.tink.internal.Field25519.mult(jArr8, jArr5, jArr4);
        com.google.crypto.tink.internal.Field25519.sub(jArr8, jArr8, jArr4);
        com.google.crypto.tink.internal.Field25519.mult(jArr9, jArr6, jArr3);
        com.google.crypto.tink.internal.Field25519.sum(jArr8, jArr8, jArr9);
        com.google.crypto.tink.internal.Field25519.square(jArr8, jArr8);
        return com.google.crypto.tink.subtle.Bytes.equal(com.google.crypto.tink.internal.Field25519.contract(jArr7), com.google.crypto.tink.internal.Field25519.contract(jArr8));
    }

    private Curve25519() {
    }
}
