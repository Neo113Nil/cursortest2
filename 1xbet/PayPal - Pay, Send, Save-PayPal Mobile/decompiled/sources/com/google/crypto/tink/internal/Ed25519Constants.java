package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
final class Ed25519Constants {
    static final com.google.crypto.tink.internal.Ed25519.CachedXYT[] B2;
    static final com.google.crypto.tink.internal.Ed25519.CachedXYT[][] B_TABLE;
    static final long[] D;
    static final long[] D2;
    private static final java.math.BigInteger D2_BI;
    private static final java.math.BigInteger D_BI;
    private static final java.math.BigInteger P_BI;
    static final long[] SQRTM1;
    private static final java.math.BigInteger SQRTM1_BI;

    static {
        java.math.BigInteger subtract = java.math.BigInteger.valueOf(2L).pow(255).subtract(java.math.BigInteger.valueOf(19L));
        P_BI = subtract;
        java.math.BigInteger mod = java.math.BigInteger.valueOf(-121665L).multiply(java.math.BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        D_BI = mod;
        java.math.BigInteger mod2 = java.math.BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        D2_BI = mod2;
        java.math.BigInteger modPow = java.math.BigInteger.valueOf(2L).modPow(subtract.subtract(java.math.BigInteger.ONE).divide(java.math.BigInteger.valueOf(4L)), subtract);
        SQRTM1_BI = modPow;
        com.google.crypto.tink.internal.Ed25519Constants.Point point = new com.google.crypto.tink.internal.Ed25519Constants.Point();
        point.y = java.math.BigInteger.valueOf(4L).multiply(java.math.BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        point.x = recoverX(point.y);
        D = com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(mod));
        D2 = com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(mod2));
        SQRTM1 = com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(modPow));
        B_TABLE = (com.google.crypto.tink.internal.Ed25519.CachedXYT[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.crypto.tink.internal.Ed25519.CachedXYT.class, 32, 8);
        com.google.crypto.tink.internal.Ed25519Constants.Point point2 = point;
        for (int i = 0; i < 32; i++) {
            com.google.crypto.tink.internal.Ed25519Constants.Point point3 = point2;
            for (int i2 = 0; i2 < 8; i2++) {
                B_TABLE[i][i2] = getCachedXYT(point3);
                point3 = edwards(point3, point2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                point2 = edwards(point2, point2);
            }
        }
        com.google.crypto.tink.internal.Ed25519Constants.Point edwards = edwards(point, point);
        B2 = new com.google.crypto.tink.internal.Ed25519.CachedXYT[8];
        for (int i4 = 0; i4 < 8; i4++) {
            B2[i4] = getCachedXYT(point);
            point = edwards(point, edwards);
        }
    }

    static class Point {
        private java.math.BigInteger x;
        private java.math.BigInteger y;

        private Point() {
        }
    }

    private static java.math.BigInteger recoverX(java.math.BigInteger bigInteger) {
        java.math.BigInteger subtract = bigInteger.pow(2).subtract(java.math.BigInteger.ONE);
        java.math.BigInteger add = D_BI.multiply(bigInteger.pow(2)).add(java.math.BigInteger.ONE);
        java.math.BigInteger bigInteger2 = P_BI;
        java.math.BigInteger multiply = subtract.multiply(add.modInverse(bigInteger2));
        java.math.BigInteger modPow = multiply.modPow(bigInteger2.add(java.math.BigInteger.valueOf(3L)).divide(java.math.BigInteger.valueOf(8L)), bigInteger2);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger2).equals(java.math.BigInteger.ZERO)) {
            modPow = modPow.multiply(SQRTM1_BI).mod(bigInteger2);
        }
        return modPow.testBit(0) ? bigInteger2.subtract(modPow) : modPow;
    }

    private static com.google.crypto.tink.internal.Ed25519Constants.Point edwards(com.google.crypto.tink.internal.Ed25519Constants.Point point, com.google.crypto.tink.internal.Ed25519Constants.Point point2) {
        com.google.crypto.tink.internal.Ed25519Constants.Point point3 = new com.google.crypto.tink.internal.Ed25519Constants.Point();
        java.math.BigInteger multiply = D_BI.multiply(point.x.multiply(point2.x).multiply(point.y).multiply(point2.y));
        java.math.BigInteger bigInteger = P_BI;
        java.math.BigInteger mod = multiply.mod(bigInteger);
        point3.x = point.x.multiply(point2.y).add(point2.x.multiply(point.y)).multiply(java.math.BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        point3.y = point.y.multiply(point2.y).add(point.x.multiply(point2.x)).multiply(java.math.BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return point3;
    }

    private static byte[] toLittleEndian(java.math.BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = 32 - byteArray.length;
        java.lang.System.arraycopy(byteArray, 0, bArr, length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static com.google.crypto.tink.internal.Ed25519.CachedXYT getCachedXYT(com.google.crypto.tink.internal.Ed25519Constants.Point point) {
        java.math.BigInteger add = point.y.add(point.x);
        java.math.BigInteger bigInteger = P_BI;
        return new com.google.crypto.tink.internal.Ed25519.CachedXYT(com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(add.mod(bigInteger))), com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(point.y.subtract(point.x).mod(bigInteger))), com.google.crypto.tink.internal.Field25519.expand(toLittleEndian(D2_BI.multiply(point.x).multiply(point.y).mod(bigInteger))));
    }

    private Ed25519Constants() {
    }
}
