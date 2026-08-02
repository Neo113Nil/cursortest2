package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class PlainDSAEncoding implements org.bouncycastle.crypto.signers.DSAEncoding {
    public static final org.bouncycastle.crypto.signers.PlainDSAEncoding INSTANCE = new org.bouncycastle.crypto.signers.PlainDSAEncoding();

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public byte[] encode(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        int unsignedByteLength = org.bouncycastle.util.BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr = new byte[unsignedByteLength * 2];
        getHighResolutionOutputSizeshNQ4ISI(bigInteger, bigInteger2, bArr, 0, unsignedByteLength);
        getHighResolutionOutputSizeshNQ4ISI(bigInteger, bigInteger3, bArr, unsignedByteLength, unsignedByteLength);
        return bArr;
    }

    protected java.math.BigInteger decodeValue(java.math.BigInteger bigInteger, byte[] bArr, int i, int i2) {
        return checkValue(bigInteger, new java.math.BigInteger(1, org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i2 + i)));
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public java.math.BigInteger[] decode(java.math.BigInteger bigInteger, byte[] bArr) {
        int unsignedByteLength = org.bouncycastle.util.BigIntegers.getUnsignedByteLength(bigInteger);
        if (bArr.length == unsignedByteLength * 2) {
            return new java.math.BigInteger[]{decodeValue(bigInteger, bArr, 0, unsignedByteLength), decodeValue(bigInteger, bArr, unsignedByteLength, unsignedByteLength)};
        }
        throw new java.lang.IllegalArgumentException("Encoding has incorrect length");
    }

    protected java.math.BigInteger checkValue(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new java.lang.IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr, int i, int i2) {
        byte[] byteArray = checkValue(bigInteger, bigInteger2).toByteArray();
        int max = java.lang.Math.max(0, byteArray.length - i2);
        int length = byteArray.length - max;
        int i3 = (i2 - length) + i;
        org.bouncycastle.util.Arrays.fill(bArr, i, i3, (byte) 0);
        java.lang.System.arraycopy(byteArray, max, bArr, i3, length);
    }
}
