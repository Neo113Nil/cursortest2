package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final com.google.crypto.tink.internal.Ed25519.CachedXYT CACHED_NEUTRAL = new com.google.crypto.tink.internal.Ed25519.CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final com.google.crypto.tink.internal.Ed25519.PartialXYZT NEUTRAL = new com.google.crypto.tink.internal.Ed25519.PartialXYZT(new com.google.crypto.tink.internal.Ed25519.XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, com.google.common.base.Ascii.SUB, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, com.google.common.base.Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    private static int eq(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.x = jArr;
            this.y = jArr2;
            this.z = jArr3;
        }

        XYZ(com.google.crypto.tink.internal.Ed25519.XYZ xyz) {
            this.x = java.util.Arrays.copyOf(xyz.x, 10);
            this.y = java.util.Arrays.copyOf(xyz.y, 10);
            this.z = java.util.Arrays.copyOf(xyz.z, 10);
        }

        XYZ(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        static com.google.crypto.tink.internal.Ed25519.XYZ fromPartialXYZT(com.google.crypto.tink.internal.Ed25519.XYZ xyz, com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT) {
            com.google.crypto.tink.internal.Field25519.mult(xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            com.google.crypto.tink.internal.Field25519.mult(xyz.y, partialXYZT.xyz.y, partialXYZT.xyz.z);
            com.google.crypto.tink.internal.Field25519.mult(xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            return xyz;
        }

        byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            com.google.crypto.tink.internal.Field25519.inverse(jArr, this.z);
            com.google.crypto.tink.internal.Field25519.mult(jArr2, this.x, jArr);
            com.google.crypto.tink.internal.Field25519.mult(jArr3, this.y, jArr);
            byte[] contract = com.google.crypto.tink.internal.Field25519.contract(jArr3);
            contract[31] = (byte) ((com.google.crypto.tink.internal.Ed25519.getLsb(jArr2) << 7) ^ contract[31]);
            return contract;
        }

        boolean isOnCurve() {
            long[] jArr = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr, this.x);
            long[] jArr2 = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr2, this.y);
            long[] jArr3 = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr3, this.z);
            long[] jArr4 = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            com.google.crypto.tink.internal.Field25519.sub(jArr5, jArr2, jArr);
            com.google.crypto.tink.internal.Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            com.google.crypto.tink.internal.Field25519.mult(jArr6, jArr, jArr2);
            com.google.crypto.tink.internal.Field25519.mult(jArr6, jArr6, com.google.crypto.tink.internal.Ed25519Constants.D);
            com.google.crypto.tink.internal.Field25519.sum(jArr6, jArr4);
            com.google.crypto.tink.internal.Field25519.reduce(jArr6, jArr6);
            return com.google.crypto.tink.subtle.Bytes.equal(com.google.crypto.tink.internal.Field25519.contract(jArr5), com.google.crypto.tink.internal.Field25519.contract(jArr6));
        }
    }

    static class XYZT {
        final long[] t;
        final com.google.crypto.tink.internal.Ed25519.XYZ xyz;

        XYZT() {
            this(new com.google.crypto.tink.internal.Ed25519.XYZ(), new long[10]);
        }

        XYZT(com.google.crypto.tink.internal.Ed25519.XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        XYZT(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.crypto.tink.internal.Ed25519.XYZT fromPartialXYZT(com.google.crypto.tink.internal.Ed25519.XYZT xyzt, com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT) {
            com.google.crypto.tink.internal.Field25519.mult(xyzt.xyz.x, partialXYZT.xyz.x, partialXYZT.t);
            com.google.crypto.tink.internal.Field25519.mult(xyzt.xyz.y, partialXYZT.xyz.y, partialXYZT.xyz.z);
            com.google.crypto.tink.internal.Field25519.mult(xyzt.xyz.z, partialXYZT.xyz.z, partialXYZT.t);
            com.google.crypto.tink.internal.Field25519.mult(xyzt.t, partialXYZT.xyz.x, partialXYZT.xyz.y);
            return xyzt;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.crypto.tink.internal.Ed25519.XYZT fromBytesNegateVarTime(byte[] bArr) throws java.security.GeneralSecurityException {
            long[] jArr = new long[10];
            long[] expand = com.google.crypto.tink.internal.Field25519.expand(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr4, expand);
            com.google.crypto.tink.internal.Field25519.mult(jArr5, jArr4, com.google.crypto.tink.internal.Ed25519Constants.D);
            com.google.crypto.tink.internal.Field25519.sub(jArr4, jArr4, jArr2);
            com.google.crypto.tink.internal.Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            com.google.crypto.tink.internal.Field25519.square(jArr8, jArr5);
            com.google.crypto.tink.internal.Field25519.mult(jArr8, jArr8, jArr5);
            com.google.crypto.tink.internal.Field25519.square(jArr, jArr8);
            com.google.crypto.tink.internal.Field25519.mult(jArr, jArr, jArr5);
            com.google.crypto.tink.internal.Field25519.mult(jArr, jArr, jArr4);
            com.google.crypto.tink.internal.Ed25519.pow2252m3(jArr, jArr);
            com.google.crypto.tink.internal.Field25519.mult(jArr, jArr, jArr8);
            com.google.crypto.tink.internal.Field25519.mult(jArr, jArr, jArr4);
            com.google.crypto.tink.internal.Field25519.square(jArr6, jArr);
            com.google.crypto.tink.internal.Field25519.mult(jArr6, jArr6, jArr5);
            com.google.crypto.tink.internal.Field25519.sub(jArr7, jArr6, jArr4);
            if (com.google.crypto.tink.internal.Ed25519.isNonZeroVarTime(jArr7)) {
                com.google.crypto.tink.internal.Field25519.sum(jArr7, jArr6, jArr4);
                if (com.google.crypto.tink.internal.Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                com.google.crypto.tink.internal.Field25519.mult(jArr, jArr, com.google.crypto.tink.internal.Ed25519Constants.SQRTM1);
            }
            if (com.google.crypto.tink.internal.Ed25519.isNonZeroVarTime(jArr) || ((bArr[31] & 255) >> 7) == 0) {
                if (com.google.crypto.tink.internal.Ed25519.getLsb(jArr) == ((bArr[31] & 255) >> 7)) {
                    com.google.crypto.tink.internal.Ed25519.neg(jArr, jArr);
                }
                com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr, expand);
                return new com.google.crypto.tink.internal.Ed25519.XYZT(new com.google.crypto.tink.internal.Ed25519.XYZ(jArr, expand, jArr2), jArr3);
            }
            throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        }
    }

    static class PartialXYZT {
        final long[] t;
        final com.google.crypto.tink.internal.Ed25519.XYZ xyz;

        PartialXYZT() {
            this(new com.google.crypto.tink.internal.Ed25519.XYZ(), new long[10]);
        }

        PartialXYZT(com.google.crypto.tink.internal.Ed25519.XYZ xyz, long[] jArr) {
            this.xyz = xyz;
            this.t = jArr;
        }

        PartialXYZT(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT) {
            this.xyz = new com.google.crypto.tink.internal.Ed25519.XYZ(partialXYZT.xyz);
            this.t = java.util.Arrays.copyOf(partialXYZT.t, 10);
        }
    }

    static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.yPlusX = jArr;
            this.yMinusX = jArr2;
            this.t2d = jArr3;
        }

        CachedXYT(com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT) {
            this.yPlusX = java.util.Arrays.copyOf(cachedXYT.yPlusX, 10);
            this.yMinusX = java.util.Arrays.copyOf(cachedXYT.yMinusX, 10);
            this.t2d = java.util.Arrays.copyOf(cachedXYT.t2d, 10);
        }

        void multByZ(long[] jArr, long[] jArr2) {
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        void copyConditional(com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT, int i) {
            com.google.crypto.tink.internal.Curve25519.copyConditional(this.yPlusX, cachedXYT.yPlusX, i);
            com.google.crypto.tink.internal.Curve25519.copyConditional(this.yMinusX, cachedXYT.yMinusX, i);
            com.google.crypto.tink.internal.Curve25519.copyConditional(this.t2d, cachedXYT.t2d, i);
        }
    }

    static class CachedXYZT extends com.google.crypto.tink.internal.Ed25519.CachedXYT {
        private final long[] z;

        CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        CachedXYZT(com.google.crypto.tink.internal.Ed25519.XYZT xyzt) {
            this();
            com.google.crypto.tink.internal.Field25519.sum(this.yPlusX, xyzt.xyz.y, xyzt.xyz.x);
            com.google.crypto.tink.internal.Field25519.sub(this.yMinusX, xyzt.xyz.y, xyzt.xyz.x);
            java.lang.System.arraycopy(xyzt.xyz.z, 0, this.z, 0, 10);
            com.google.crypto.tink.internal.Field25519.mult(this.t2d, xyzt.t, com.google.crypto.tink.internal.Ed25519Constants.D2);
        }

        CachedXYZT(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.z = jArr3;
        }

        @Override // com.google.crypto.tink.internal.Ed25519.CachedXYT
        public void multByZ(long[] jArr, long[] jArr2) {
            com.google.crypto.tink.internal.Field25519.mult(jArr, jArr2, this.z);
        }
    }

    private static void add(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZT xyzt, com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.x, xyzt.xyz.y, xyzt.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.y, xyzt.xyz.y, xyzt.xyz.x);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.xyz.y, partialXYZT.xyz.y, cachedXYT.yMinusX);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.xyz.z, partialXYZT.xyz.x, cachedXYT.yPlusX);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        com.google.crypto.tink.internal.Field25519.sum(jArr, partialXYZT.xyz.x, partialXYZT.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.x, partialXYZT.xyz.z, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.z, jArr, partialXYZT.t);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.t, jArr, partialXYZT.t);
    }

    private static void sub(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZT xyzt, com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.x, xyzt.xyz.y, xyzt.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.y, xyzt.xyz.y, xyzt.xyz.x);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.xyz.y, partialXYZT.xyz.y, cachedXYT.yPlusX);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.xyz.z, partialXYZT.xyz.x, cachedXYT.yMinusX);
        com.google.crypto.tink.internal.Field25519.mult(partialXYZT.t, xyzt.t, cachedXYT.t2d);
        cachedXYT.multByZ(partialXYZT.xyz.x, xyzt.xyz.z);
        com.google.crypto.tink.internal.Field25519.sum(jArr, partialXYZT.xyz.x, partialXYZT.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.x, partialXYZT.xyz.z, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.z, jArr, partialXYZT.t);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.t, jArr, partialXYZT.t);
    }

    private static void doubleXYZ(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZ xyz) {
        long[] jArr = new long[10];
        com.google.crypto.tink.internal.Field25519.square(partialXYZT.xyz.x, xyz.x);
        com.google.crypto.tink.internal.Field25519.square(partialXYZT.xyz.z, xyz.y);
        com.google.crypto.tink.internal.Field25519.square(partialXYZT.t, xyz.z);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.t, partialXYZT.t, partialXYZT.t);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.y, xyz.x, xyz.y);
        com.google.crypto.tink.internal.Field25519.square(jArr, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.z, partialXYZT.xyz.z, partialXYZT.xyz.x);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.xyz.x, jArr, partialXYZT.xyz.y);
        com.google.crypto.tink.internal.Field25519.sub(partialXYZT.t, partialXYZT.t, partialXYZT.xyz.z);
    }

    private static void doubleXYZT(com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZT xyzt) {
        doubleXYZ(partialXYZT, xyzt.xyz);
    }

    private static void select(com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT, int i, byte b) {
        int i2 = (b & 255) >> 7;
        int i3 = b - (((-i2) & b) << 1);
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][0], eq(i3, 1));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][1], eq(i3, 2));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][2], eq(i3, 3));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][3], eq(i3, 4));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][4], eq(i3, 5));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][5], eq(i3, 6));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][6], eq(i3, 7));
        cachedXYT.copyConditional(com.google.crypto.tink.internal.Ed25519Constants.B_TABLE[i][7], eq(i3, 8));
        long[] copyOf = java.util.Arrays.copyOf(cachedXYT.yMinusX, 10);
        long[] copyOf2 = java.util.Arrays.copyOf(cachedXYT.yPlusX, 10);
        long[] copyOf3 = java.util.Arrays.copyOf(cachedXYT.t2d, 10);
        neg(copyOf3, copyOf3);
        cachedXYT.copyConditional(new com.google.crypto.tink.internal.Ed25519.CachedXYT(copyOf, copyOf2, copyOf3), i2);
    }

    private static com.google.crypto.tink.internal.Ed25519.XYZ scalarMultWithBase(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr2[i3] = (byte) (bArr[i2] & com.google.common.base.Ascii.SI);
            bArr2[i3 + 1] = (byte) (((bArr[i2] & 255) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT = new com.google.crypto.tink.internal.Ed25519.PartialXYZT(NEUTRAL);
        com.google.crypto.tink.internal.Ed25519.XYZT xyzt = new com.google.crypto.tink.internal.Ed25519.XYZT();
        for (i = 1; i < 64; i += 2) {
            com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT = new com.google.crypto.tink.internal.Ed25519.CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i / 2, bArr2[i]);
            add(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        com.google.crypto.tink.internal.Ed25519.XYZ xyz = new com.google.crypto.tink.internal.Ed25519.XYZ();
        doubleXYZ(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i7 = 0; i7 < 64; i7 += 2) {
            com.google.crypto.tink.internal.Ed25519.CachedXYT cachedXYT2 = new com.google.crypto.tink.internal.Ed25519.CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i7 / 2, bArr2[i7]);
            add(partialXYZT, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        com.google.crypto.tink.internal.Ed25519.XYZ xyz2 = new com.google.crypto.tink.internal.Ed25519.XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new java.lang.IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] bArr) {
        return scalarMultWithBase(bArr).toBytes();
    }

    private static byte[] slide(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = i5 + b2;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b2 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static com.google.crypto.tink.internal.Ed25519.XYZ doubleScalarMultVarTime(byte[] bArr, com.google.crypto.tink.internal.Ed25519.XYZT xyzt, byte[] bArr2) {
        com.google.crypto.tink.internal.Ed25519.CachedXYZT[] cachedXYZTArr = new com.google.crypto.tink.internal.Ed25519.CachedXYZT[8];
        cachedXYZTArr[0] = new com.google.crypto.tink.internal.Ed25519.CachedXYZT(xyzt);
        com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT = new com.google.crypto.tink.internal.Ed25519.PartialXYZT();
        doubleXYZT(partialXYZT, xyzt);
        com.google.crypto.tink.internal.Ed25519.XYZT xyzt2 = new com.google.crypto.tink.internal.Ed25519.XYZT(partialXYZT);
        for (int i = 1; i < 8; i++) {
            add(partialXYZT, xyzt2, cachedXYZTArr[i - 1]);
            cachedXYZTArr[i] = new com.google.crypto.tink.internal.Ed25519.CachedXYZT(new com.google.crypto.tink.internal.Ed25519.XYZT(partialXYZT));
        }
        byte[] slide = slide(bArr);
        byte[] slide2 = slide(bArr2);
        com.google.crypto.tink.internal.Ed25519.PartialXYZT partialXYZT2 = new com.google.crypto.tink.internal.Ed25519.PartialXYZT(NEUTRAL);
        com.google.crypto.tink.internal.Ed25519.XYZT xyzt3 = new com.google.crypto.tink.internal.Ed25519.XYZT();
        int i2 = 255;
        while (i2 >= 0 && slide[i2] == 0 && slide2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            doubleXYZ(partialXYZT2, new com.google.crypto.tink.internal.Ed25519.XYZ(partialXYZT2));
            byte b = slide[i2];
            if (b > 0) {
                add(partialXYZT2, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[slide[i2] / 2]);
            } else if (b < 0) {
                sub(partialXYZT2, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt3, partialXYZT2), cachedXYZTArr[(-slide[i2]) / 2]);
            }
            byte b2 = slide2[i2];
            if (b2 > 0) {
                add(partialXYZT2, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt3, partialXYZT2), com.google.crypto.tink.internal.Ed25519Constants.B2[slide2[i2] / 2]);
            } else if (b2 < 0) {
                sub(partialXYZT2, com.google.crypto.tink.internal.Ed25519.XYZT.fromPartialXYZT(xyzt3, partialXYZT2), com.google.crypto.tink.internal.Ed25519Constants.B2[(-slide2[i2]) / 2]);
            }
            i2--;
        }
        return new com.google.crypto.tink.internal.Ed25519.XYZ(partialXYZT2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        com.google.crypto.tink.internal.Field25519.reduceCoefficients(jArr2);
        for (byte b : com.google.crypto.tink.internal.Field25519.contract(jArr2)) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] jArr) {
        return com.google.crypto.tink.internal.Field25519.contract(jArr)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        com.google.crypto.tink.internal.Field25519.square(jArr3, jArr2);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        com.google.crypto.tink.internal.Field25519.mult(jArr4, jArr2, jArr4);
        com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr3, jArr4);
        com.google.crypto.tink.internal.Field25519.square(jArr3, jArr3);
        com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr4, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            com.google.crypto.tink.internal.Field25519.square(jArr5, jArr5);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr4, jArr5, jArr4);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr4, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            com.google.crypto.tink.internal.Field25519.square(jArr5, jArr5);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr4, jArr5, jArr4);
        com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            com.google.crypto.tink.internal.Field25519.square(jArr4, jArr4);
        }
        com.google.crypto.tink.internal.Field25519.mult(jArr3, jArr4, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr3, jArr3);
        com.google.crypto.tink.internal.Field25519.square(jArr3, jArr3);
        com.google.crypto.tink.internal.Field25519.mult(jArr, jArr3, jArr2);
    }

    private static long load3(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long load4(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | load3(bArr, i);
    }

    private static void reduce(byte[] bArr) {
        long load3 = load3(bArr, 0);
        long load4 = load4(bArr, 2);
        long load32 = load3(bArr, 5);
        long load42 = load4(bArr, 7);
        long load43 = load4(bArr, 10);
        long load33 = load3(bArr, 13);
        long load44 = load4(bArr, 15);
        long load34 = load3(bArr, 18);
        long load35 = load3(bArr, 21);
        long load45 = load4(bArr, 23);
        long load36 = load3(bArr, 26);
        long load46 = load4(bArr, 28);
        long load47 = load4(bArr, 31);
        long load37 = load3(bArr, 34);
        long load48 = load4(bArr, 36);
        long load38 = load3(bArr, 39);
        long load39 = load3(bArr, 42);
        long load49 = load4(bArr, 44);
        long load310 = (load3(bArr, 47) >> 2) & 2097151;
        long load410 = (load4(bArr, 49) >> 7) & 2097151;
        long load411 = (load4(bArr, 52) >> 4) & 2097151;
        long load311 = (load3(bArr, 55) >> 1) & 2097151;
        long load412 = (load4(bArr, 57) >> 6) & 2097151;
        long load413 = load4(bArr, 60) >> 3;
        long j = (load39 & 2097151) - (load413 * 683901);
        long j2 = ((((load48 >> 6) & 2097151) - (load413 * 997805)) + (load412 * 136657)) - (load311 * 683901);
        long j3 = ((((((load47 >> 4) & 2097151) + (load413 * 470296)) + (load412 * 654183)) - (load311 * 997805)) + (load411 * 136657)) - (load410 * 683901);
        long j4 = ((load44 >> 6) & 2097151) + (load310 * 666643);
        long j5 = (load35 & 2097151) + (load411 * 666643) + (load410 * 470296) + (load310 * 654183);
        long j6 = ((((((load36 >> 2) & 2097151) + (load412 * 666643)) + (load311 * 470296)) + (load411 * 654183)) - (load410 * 997805)) + (load310 * 136657);
        long j7 = (j4 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j8 = ((load34 >> 3) & 2097151) + (load410 * 666643) + (load310 * 470296) + j7;
        long j9 = (j5 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j10 = ((((((load45 >> 5) & 2097151) + (load311 * 666643)) + (load411 * 470296)) + (load410 * 654183)) - (load310 * 997805)) + j9;
        long j11 = (j6 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j12 = ((((((((load46 >> 7) & 2097151) + (load413 * 666643)) + (load412 * 470296)) + (load311 * 654183)) - (load411 * 997805)) + (load410 * 136657)) - (load310 * 683901)) + j11;
        long j13 = (j3 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j14 = ((((((load37 >> 1) & 2097151) + (load413 * 654183)) - (load412 * 997805)) + (load311 * 136657)) - (load411 * 683901)) + j13;
        long j15 = (j2 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j16 = ((((load38 >> 3) & 2097151) + (load413 * 136657)) - (load412 * 683901)) + j15;
        long j17 = (j + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j18 = ((load49 >> 5) & 2097151) + j17;
        long j19 = (j8 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j20 = (j10 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j21 = (j12 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j22 = (j3 - (j13 << 21)) + j21;
        long j23 = (j14 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j24 = (j2 - (j15 << 21)) + j23;
        long j25 = j14 - (j23 << 21);
        long j26 = (j16 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j27 = (j - (j17 << 21)) + j26;
        long j28 = j16 - (j26 << 21);
        long j29 = ((j6 - (j11 << 21)) + j20) - (j18 * 683901);
        long j30 = ((((j5 - (j9 << 21)) + j19) - (j18 * 997805)) + (j27 * 136657)) - (j28 * 683901);
        long j31 = (((((j4 - (j7 << 21)) + (j18 * 470296)) + (j27 * 654183)) - (j28 * 997805)) + (j24 * 136657)) - (j25 * 683901);
        long j32 = (load3 & 2097151) + (j22 * 666643);
        long j33 = ((load32 >> 2) & 2097151) + (j24 * 666643) + (j25 * 470296) + (j22 * 654183);
        long j34 = ((((((load43 >> 4) & 2097151) + (j27 * 666643)) + (j28 * 470296)) + (j24 * 654183)) - (j25 * 997805)) + (j22 * 136657);
        long j35 = (j32 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j36 = ((load4 >> 5) & 2097151) + (j25 * 666643) + (j22 * 470296) + j35;
        long j37 = (j33 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j38 = ((((((load42 >> 7) & 2097151) + (j28 * 666643)) + (j24 * 470296)) + (j25 * 654183)) - (j22 * 997805)) + j37;
        long j39 = (j34 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j40 = ((((((((load33 >> 1) & 2097151) + (j18 * 666643)) + (j27 * 470296)) + (j28 * 654183)) - (j24 * 997805)) + (j25 * 136657)) - (j22 * 683901)) + j39;
        long j41 = (j31 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j42 = (((((j8 - (j19 << 21)) + (j18 * 654183)) - (j27 * 997805)) + (j28 * 136657)) - (j24 * 683901)) + j41;
        long j43 = (j30 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j44 = (((j10 - (j20 << 21)) + (j18 * 136657)) - (j27 * 683901)) + j43;
        long j45 = (j29 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j46 = (j12 - (j21 << 21)) + j45;
        long j47 = (j36 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j48 = (j38 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j49 = (j40 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j50 = (j42 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j51 = (j44 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j52 = (j46 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j53 = (j32 - (j35 << 21)) + (j52 * 666643);
        long j54 = j53 >> 21;
        long j55 = (j36 - (j47 << 21)) + (j52 * 470296) + j54;
        long j56 = j55 >> 21;
        long j57 = (j33 - (j37 << 21)) + j47 + (j52 * 654183) + j56;
        long j58 = j57 >> 21;
        long j59 = ((j38 - (j48 << 21)) - (j52 * 997805)) + j58;
        long j60 = j59 >> 21;
        long j61 = (j34 - (j39 << 21)) + j48 + (j52 * 136657) + j60;
        long j62 = j61 >> 21;
        long j63 = ((j40 - (j49 << 21)) - (j52 * 683901)) + j62;
        long j64 = j63 >> 21;
        long j65 = (j31 - (j41 << 21)) + j49 + j64;
        long j66 = j65 >> 21;
        long j67 = (j42 - (j50 << 21)) + j66;
        long j68 = j67 >> 21;
        long j69 = (j30 - (j43 << 21)) + j50 + j68;
        long j70 = j69 >> 21;
        long j71 = (j44 - (j51 << 21)) + j70;
        long j72 = j71 >> 21;
        long j73 = (j29 - (j45 << 21)) + j51 + j72;
        long j74 = j73 >> 21;
        long j75 = (j46 - (j52 << 21)) + j74;
        long j76 = j75 >> 21;
        long j77 = (j53 - (j54 << 21)) + (666643 * j76);
        long j78 = j77 >> 21;
        long j79 = (j55 - (j56 << 21)) + (470296 * j76) + j78;
        long j80 = j77 - (j78 << 21);
        long j81 = j79 >> 21;
        long j82 = (j57 - (j58 << 21)) + (654183 * j76) + j81;
        long j83 = j79 - (j81 << 21);
        long j84 = j82 >> 21;
        long j85 = ((j59 - (j60 << 21)) - (997805 * j76)) + j84;
        long j86 = j82 - (j84 << 21);
        long j87 = j85 >> 21;
        long j88 = (j61 - (j62 << 21)) + (136657 * j76) + j87;
        long j89 = j85 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = ((j63 - (j64 << 21)) - (683901 * j76)) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = (j65 - (j66 << 21)) + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = (j67 - (j68 << 21)) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = (j69 - (j70 << 21)) + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = (j71 - (j72 << 21)) + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = (j73 - (j74 << 21)) + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = (j75 - (j76 << 21)) + j108;
        long j110 = j106 - (j108 << 21);
        bArr[0] = (byte) j80;
        bArr[1] = (byte) (j80 >> 8);
        bArr[2] = (byte) ((j80 >> 16) | (j83 << 5));
        bArr[3] = (byte) (j83 >> 3);
        bArr[4] = (byte) (j83 >> 11);
        bArr[5] = (byte) ((j83 >> 19) | (j86 << 2));
        bArr[6] = (byte) (j86 >> 6);
        bArr[7] = (byte) ((j86 >> 14) | (j89 << 7));
        bArr[8] = (byte) (j89 >> 1);
        bArr[9] = (byte) (j89 >> 9);
        bArr[10] = (byte) ((j89 >> 17) | (j92 << 4));
        bArr[11] = (byte) (j92 >> 4);
        bArr[12] = (byte) (j92 >> 12);
        bArr[13] = (byte) ((j92 >> 20) | (j95 << 1));
        bArr[14] = (byte) (j95 >> 7);
        bArr[15] = (byte) ((j95 >> 15) | (j98 << 6));
        bArr[16] = (byte) (j98 >> 2);
        bArr[17] = (byte) (j98 >> 10);
        bArr[18] = (byte) ((j98 >> 18) | (j101 << 3));
        bArr[19] = (byte) (j101 >> 5);
        bArr[20] = (byte) (j101 >> 13);
        bArr[21] = (byte) j104;
        bArr[22] = (byte) (j104 >> 8);
        bArr[23] = (byte) ((j104 >> 16) | (j107 << 5));
        bArr[24] = (byte) (j107 >> 3);
        bArr[25] = (byte) (j107 >> 11);
        bArr[26] = (byte) ((j107 >> 19) | (j110 << 2));
        bArr[27] = (byte) (j110 >> 6);
        bArr[28] = (byte) ((j110 >> 14) | (j109 << 7));
        bArr[29] = (byte) (j109 >> 1);
        bArr[30] = (byte) (j109 >> 9);
        bArr[31] = (byte) (j109 >> 17);
    }

    private static void mulAdd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long load3 = load3(bArr2, 0) & 2097151;
        long load4 = (load4(bArr2, 2) >> 5) & 2097151;
        long load32 = (load3(bArr2, 5) >> 2) & 2097151;
        long load42 = (load4(bArr2, 7) >> 7) & 2097151;
        long load43 = (load4(bArr2, 10) >> 4) & 2097151;
        long load33 = (load3(bArr2, 13) >> 1) & 2097151;
        long load44 = (load4(bArr2, 15) >> 6) & 2097151;
        long load34 = (load3(bArr2, 18) >> 3) & 2097151;
        long load35 = load3(bArr2, 21) & 2097151;
        long load45 = (load4(bArr2, 23) >> 5) & 2097151;
        long load36 = (load3(bArr2, 26) >> 2) & 2097151;
        long load46 = load4(bArr2, 28) >> 7;
        long load37 = load3(bArr3, 0) & 2097151;
        long load47 = (load4(bArr3, 2) >> 5) & 2097151;
        long load38 = (load3(bArr3, 5) >> 2) & 2097151;
        long load48 = (load4(bArr3, 7) >> 7) & 2097151;
        long load49 = (load4(bArr3, 10) >> 4) & 2097151;
        long load39 = (load3(bArr3, 13) >> 1) & 2097151;
        long load410 = (load4(bArr3, 15) >> 6) & 2097151;
        long load310 = (load3(bArr3, 18) >> 3) & 2097151;
        long load311 = load3(bArr3, 21) & 2097151;
        long load411 = (load4(bArr3, 23) >> 5) & 2097151;
        long load312 = (load3(bArr3, 26) >> 2) & 2097151;
        long load412 = load4(bArr3, 28) >> 7;
        long load313 = load3(bArr4, 0);
        long load413 = load4(bArr4, 2);
        long load314 = load3(bArr4, 5);
        long load414 = load4(bArr4, 7);
        long load415 = load4(bArr4, 10);
        long load315 = load3(bArr4, 13);
        long load416 = load4(bArr4, 15);
        long load316 = load3(bArr4, 18);
        long load317 = load3(bArr4, 21);
        long load417 = load4(bArr4, 23);
        long load318 = load3(bArr4, 26);
        long load418 = load4(bArr4, 28);
        long j = (load313 & 2097151) + (load3 * load37);
        long j2 = ((load314 >> 2) & 2097151) + (load3 * load38) + (load4 * load47) + (load32 * load37);
        long j3 = ((load415 >> 4) & 2097151) + (load3 * load49) + (load4 * load48) + (load32 * load38) + (load42 * load47) + (load43 * load37);
        long j4 = ((load416 >> 6) & 2097151) + (load3 * load410) + (load4 * load39) + (load32 * load49) + (load42 * load48) + (load43 * load38) + (load33 * load47) + (load44 * load37);
        long j5 = (load317 & 2097151) + (load3 * load311) + (load4 * load310) + (load32 * load410) + (load42 * load39) + (load43 * load49) + (load33 * load48) + (load44 * load38) + (load34 * load47) + (load35 * load37);
        long j6 = ((load318 >> 2) & 2097151) + (load3 * load312) + (load4 * load411) + (load32 * load311) + (load42 * load310) + (load43 * load410) + (load33 * load39) + (load44 * load49) + (load34 * load48) + (load35 * load38) + (load45 * load47) + (load36 * load37);
        long j7 = (load4 * load412) + (load32 * load312) + (load42 * load411) + (load43 * load311) + (load33 * load310) + (load44 * load410) + (load34 * load39) + (load35 * load49) + (load45 * load48) + (load36 * load38) + (load47 * load46);
        long j8 = (load42 * load412) + (load43 * load312) + (load33 * load411) + (load44 * load311) + (load34 * load310) + (load35 * load410) + (load45 * load39) + (load36 * load49) + (load48 * load46);
        long j9 = (load33 * load412) + (load44 * load312) + (load34 * load411) + (load35 * load311) + (load45 * load310) + (load36 * load410) + (load39 * load46);
        long j10 = (load34 * load412) + (load35 * load312) + (load45 * load411) + (load36 * load311) + (load310 * load46);
        long j11 = (load45 * load412) + (load36 * load312) + (load411 * load46);
        long j12 = load46 * load412;
        long j13 = (j + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j14 = ((load413 >> 5) & 2097151) + (load3 * load47) + (load4 * load37) + j13;
        long j15 = (j2 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j16 = ((load414 >> 7) & 2097151) + (load3 * load48) + (load4 * load38) + (load32 * load47) + (load42 * load37) + j15;
        long j17 = (j3 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j18 = ((load315 >> 1) & 2097151) + (load3 * load39) + (load4 * load49) + (load32 * load48) + (load42 * load38) + (load43 * load47) + (load33 * load37) + j17;
        long j19 = (j4 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j20 = ((load316 >> 3) & 2097151) + (load3 * load310) + (load4 * load410) + (load32 * load39) + (load42 * load49) + (load43 * load48) + (load33 * load38) + (load44 * load47) + (load34 * load37) + j19;
        long j21 = (j5 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j22 = ((load417 >> 5) & 2097151) + (load3 * load411) + (load4 * load311) + (load32 * load310) + (load42 * load410) + (load43 * load39) + (load33 * load49) + (load44 * load48) + (load34 * load38) + (load35 * load47) + (load45 * load37) + j21;
        long j23 = (j6 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j24 = (load418 >> 7) + (load3 * load412) + (load4 * load312) + (load32 * load411) + (load42 * load311) + (load43 * load310) + (load33 * load410) + (load44 * load39) + (load34 * load49) + (load35 * load48) + (load45 * load38) + (load47 * load36) + (load37 * load46) + j23;
        long j25 = (j7 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j26 = (load32 * load412) + (load42 * load312) + (load43 * load411) + (load33 * load311) + (load44 * load310) + (load34 * load410) + (load35 * load39) + (load45 * load49) + (load48 * load36) + (load38 * load46) + j25;
        long j27 = (j8 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j28 = (load43 * load412) + (load33 * load312) + (load44 * load411) + (load34 * load311) + (load35 * load310) + (load45 * load410) + (load39 * load36) + (load49 * load46) + j27;
        long j29 = (j9 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j30 = (load44 * load412) + (load34 * load312) + (load35 * load411) + (load45 * load311) + (load310 * load36) + (load410 * load46) + j29;
        long j31 = (j10 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j32 = (load35 * load412) + (load45 * load312) + (load411 * load36) + (load311 * load46) + j31;
        long j33 = (j11 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j34 = (load36 * load412) + (load312 * load46) + j33;
        long j35 = (j12 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j36 = (j14 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j37 = (j16 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j38 = (j18 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j39 = (j20 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j40 = (j22 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j41 = (j24 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j42 = (j26 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j43 = (j28 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j44 = (j30 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j45 = (j10 - (j31 << 21)) + j44;
        long j46 = (j32 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j47 = (j11 - (j33 << 21)) + j46;
        long j48 = j32 - (j46 << 21);
        long j49 = (j34 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j50 = (j12 - (j35 << 21)) + j49;
        long j51 = j34 - (j49 << 21);
        long j52 = ((j9 - (j29 << 21)) + j43) - (j35 * 683901);
        long j53 = ((((j8 - (j27 << 21)) + j42) - (j35 * 997805)) + (j50 * 136657)) - (j51 * 683901);
        long j54 = ((((((j7 - (j25 << 21)) + j41) + (j35 * 470296)) + (j50 * 654183)) - (j51 * 997805)) + (j47 * 136657)) - (j48 * 683901);
        long j55 = (j4 - (j19 << 21)) + j38 + (j45 * 666643);
        long j56 = (j5 - (j21 << 21)) + j39 + (j47 * 666643) + (j48 * 470296) + (j45 * 654183);
        long j57 = ((((((j6 - (j23 << 21)) + j40) + (j50 * 666643)) + (j51 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j45 * 136657);
        long j58 = (j55 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j59 = (j20 - (j39 << 21)) + (j48 * 666643) + (j45 * 470296) + j58;
        long j60 = (j56 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j61 = (((((j22 - (j40 << 21)) + (j51 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j45 * 997805)) + j60;
        long j62 = (j57 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j63 = (((((((j24 - (j41 << 21)) + (j35 * 666643)) + (j50 * 470296)) + (j51 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j45 * 683901)) + j62;
        long j64 = (j54 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j65 = (((((j26 - (j42 << 21)) + (j35 * 654183)) - (j50 * 997805)) + (j51 * 136657)) - (j47 * 683901)) + j64;
        long j66 = (j53 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j67 = (((j28 - (j43 << 21)) + (j35 * 136657)) - (j50 * 683901)) + j66;
        long j68 = (j52 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j69 = (j30 - (j44 << 21)) + j68;
        long j70 = (j59 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j71 = (j61 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j72 = (j63 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j73 = (j54 - (j64 << 21)) + j72;
        long j74 = (j65 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j75 = (j53 - (j66 << 21)) + j74;
        long j76 = j65 - (j74 << 21);
        long j77 = (j67 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j78 = (j52 - (j68 << 21)) + j77;
        long j79 = j67 - (j77 << 21);
        long j80 = ((j57 - (j62 << 21)) + j71) - (j69 * 683901);
        long j81 = ((((j56 - (j60 << 21)) + j70) - (j69 * 997805)) + (j78 * 136657)) - (j79 * 683901);
        long j82 = (((((j55 - (j58 << 21)) + (j69 * 470296)) + (j78 * 654183)) - (j79 * 997805)) + (j75 * 136657)) - (j76 * 683901);
        long j83 = (j - (j13 << 21)) + (j73 * 666643);
        long j84 = (j2 - (j15 << 21)) + j36 + (j75 * 666643) + (j76 * 470296) + (j73 * 654183);
        long j85 = ((((((j3 - (j17 << 21)) + j37) + (j78 * 666643)) + (j79 * 470296)) + (j75 * 654183)) - (j76 * 997805)) + (j73 * 136657);
        long j86 = (j83 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j87 = (j14 - (j36 << 21)) + (j76 * 666643) + (j73 * 470296) + j86;
        long j88 = (j84 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j89 = (((((j16 - (j37 << 21)) + (j79 * 666643)) + (j75 * 470296)) + (j76 * 654183)) - (j73 * 997805)) + j88;
        long j90 = (j85 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j91 = (((((((j18 - (j38 << 21)) + (j69 * 666643)) + (j78 * 470296)) + (j79 * 654183)) - (j75 * 997805)) + (j76 * 136657)) - (j73 * 683901)) + j90;
        long j92 = (j82 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j93 = (((((j59 - (j70 << 21)) + (j69 * 654183)) - (j78 * 997805)) + (j79 * 136657)) - (j75 * 683901)) + j92;
        long j94 = (j81 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j95 = (((j61 - (j71 << 21)) + (j69 * 136657)) - (j78 * 683901)) + j94;
        long j96 = (j80 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j97 = (j63 - (j72 << 21)) + j96;
        long j98 = (j87 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j99 = (j89 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j100 = (j91 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j101 = (j93 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j102 = (j95 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j103 = (j97 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) >> 21;
        long j104 = (j83 - (j86 << 21)) + (j103 * 666643);
        long j105 = j104 >> 21;
        long j106 = (j87 - (j98 << 21)) + (j103 * 470296) + j105;
        long j107 = j106 >> 21;
        long j108 = (j84 - (j88 << 21)) + j98 + (j103 * 654183) + j107;
        long j109 = j108 >> 21;
        long j110 = ((j89 - (j99 << 21)) - (j103 * 997805)) + j109;
        long j111 = j110 >> 21;
        long j112 = (j85 - (j90 << 21)) + j99 + (j103 * 136657) + j111;
        long j113 = j112 >> 21;
        long j114 = ((j91 - (j100 << 21)) - (j103 * 683901)) + j113;
        long j115 = j114 >> 21;
        long j116 = (j82 - (j92 << 21)) + j100 + j115;
        long j117 = j116 >> 21;
        long j118 = (j93 - (j101 << 21)) + j117;
        long j119 = j118 >> 21;
        long j120 = (j81 - (j94 << 21)) + j101 + j119;
        long j121 = j120 >> 21;
        long j122 = (j95 - (j102 << 21)) + j121;
        long j123 = j122 >> 21;
        long j124 = (j80 - (j96 << 21)) + j102 + j123;
        long j125 = j124 >> 21;
        long j126 = (j97 - (j103 << 21)) + j125;
        long j127 = j126 >> 21;
        long j128 = (j104 - (j105 << 21)) + (666643 * j127);
        long j129 = j128 >> 21;
        long j130 = (j106 - (j107 << 21)) + (470296 * j127) + j129;
        long j131 = j130 >> 21;
        long j132 = (j108 - (j109 << 21)) + (654183 * j127) + j131;
        long j133 = j130 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = ((j110 - (j111 << 21)) - (997805 * j127)) + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = (j112 - (j113 << 21)) + (136657 * j127) + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = ((j114 - (j115 << 21)) - (683901 * j127)) + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = (j116 - (j117 << 21)) + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = (j118 - (j119 << 21)) + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = (j120 - (j121 << 21)) + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = (j122 - (j123 << 21)) + j152;
        long j154 = j153 >> 21;
        long j155 = (j124 - (j125 << 21)) + j154;
        long j156 = j153 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = (j126 - (j127 << 21)) + j157;
        long j159 = j155 - (j157 << 21);
        bArr[0] = (byte) (j128 - (j129 << 21));
        bArr[1] = (byte) (r0 >> 8);
        bArr[2] = (byte) ((r0 >> 16) | (j133 << 5));
        bArr[3] = (byte) (j133 >> 3);
        bArr[4] = (byte) (j133 >> 11);
        bArr[5] = (byte) ((j133 >> 19) | (j136 << 2));
        bArr[6] = (byte) (j136 >> 6);
        bArr[7] = (byte) ((j136 >> 14) | (j139 << 7));
        bArr[8] = (byte) (j139 >> 1);
        bArr[9] = (byte) (j139 >> 9);
        bArr[10] = (byte) ((j139 >> 17) | (j142 << 4));
        bArr[11] = (byte) (j142 >> 4);
        bArr[12] = (byte) (j142 >> 12);
        bArr[13] = (byte) ((j142 >> 20) | (j145 << 1));
        bArr[14] = (byte) (j145 >> 7);
        bArr[15] = (byte) ((j145 >> 15) | (j148 << 6));
        bArr[16] = (byte) (j148 >> 2);
        bArr[17] = (byte) (j148 >> 10);
        bArr[18] = (byte) ((j148 >> 18) | (j151 << 3));
        bArr[19] = (byte) (j151 >> 5);
        bArr[20] = (byte) (j151 >> 13);
        bArr[21] = (byte) (j150 - (j152 << 21));
        bArr[22] = (byte) (r4 >> 8);
        bArr[23] = (byte) ((r4 >> 16) | (j156 << 5));
        bArr[24] = (byte) (j156 >> 3);
        bArr[25] = (byte) (j156 >> 11);
        bArr[26] = (byte) ((j156 >> 19) | (j159 << 2));
        bArr[27] = (byte) (j159 >> 6);
        bArr[28] = (byte) ((j159 >> 14) | (j158 << 7));
        bArr[29] = (byte) (j158 >> 1);
        bArr[30] = (byte) (j158 >> 9);
        bArr[31] = (byte) (j158 >> 17);
    }

    public static byte[] getHashedScalar(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr, 0, 32);
        byte[] digest = engineFactory.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = b;
        digest[31] = (byte) (b | 64);
        return digest;
    }

    public static byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, bArr.length);
        java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr3, 32, 32);
        engineFactory.update(copyOfRange);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(scalarMultWithBase(digest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(copyOfRange2);
        engineFactory.update(bArr2);
        engineFactory.update(copyOfRange);
        byte[] digest2 = engineFactory.digest();
        reduce(digest2);
        byte[] bArr4 = new byte[32];
        mulAdd(bArr4, digest2, bArr3, digest);
        return com.google.crypto.tink.subtle.Bytes.concat(copyOfRange2, bArr4);
    }

    private static boolean isSmallerThanGroupOrder(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & 255;
            int i3 = GROUP_ORDER[i] & 255;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }

    public static boolean verify(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 32, 64);
        if (!isSmallerThanGroupOrder(copyOfRange)) {
            return false;
        }
        java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(bArr2, 0, 32);
        engineFactory.update(bArr3);
        engineFactory.update(bArr);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] bytes = doubleScalarMultVarTime(digest, com.google.crypto.tink.internal.Ed25519.XYZT.fromBytesNegateVarTime(bArr3), copyOfRange).toBytes();
        for (int i = 0; i < 32; i++) {
            if (bytes[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void init() {
        if (com.google.crypto.tink.internal.Ed25519Constants.D == null) {
            throw new java.lang.IllegalStateException("Could not initialize Ed25519.");
        }
    }

    private Ed25519() {
    }
}
