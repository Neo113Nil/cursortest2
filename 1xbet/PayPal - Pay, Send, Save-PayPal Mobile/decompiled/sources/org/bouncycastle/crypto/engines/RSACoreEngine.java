package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
class RSACoreEngine {
    org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    public final java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger) {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        if (!(rSAKeyParameters instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters)) {
            return bigInteger.modPow(rSAKeyParameters.getExponent(), this.getHighSpeedVideoFpsRangesFor.getModulus());
        }
        org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) rSAKeyParameters;
        java.math.BigInteger p = rSAPrivateCrtKeyParameters.getP();
        java.math.BigInteger q = rSAPrivateCrtKeyParameters.getQ();
        java.math.BigInteger dp = rSAPrivateCrtKeyParameters.getDP();
        java.math.BigInteger dq = rSAPrivateCrtKeyParameters.getDQ();
        java.math.BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        java.math.BigInteger modPow = bigInteger.remainder(p).modPow(dp, p);
        java.math.BigInteger modPow2 = bigInteger.remainder(q).modPow(dq, q);
        return modPow.subtract(modPow2).multiply(qInv).mod(p).multiply(q).add(modPow2);
    }

    public final int getHighSpeedVideoFpsRanges() {
        int bitLength = (this.getHighSpeedVideoFpsRangesFor.getModulus().bitLength() + 7) / 8;
        return this.getHighSpeedVideoSizes ? bitLength : bitLength - 1;
    }

    public final int getHighSpeedVideoFpsRangesFor() {
        int bitLength = (this.getHighSpeedVideoFpsRangesFor.getModulus().bitLength() + 7) / 8;
        return this.getHighSpeedVideoSizes ? bitLength - 1 : bitLength;
    }

    public final byte[] Camera2StreamConfigurationMap(java.math.BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.getHighSpeedVideoSizes) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                java.lang.System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                java.lang.System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            org.bouncycastle.util.Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > getHighSpeedVideoFpsRanges()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            java.lang.System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= getHighSpeedVideoFpsRanges()) {
            return byteArray;
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        byte[] bArr3 = new byte[highSpeedVideoFpsRanges];
        java.lang.System.arraycopy(byteArray, 0, bArr3, highSpeedVideoFpsRanges - byteArray.length, byteArray.length);
        return bArr3;
    }

    public final java.math.BigInteger getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
        if (i2 > getHighSpeedVideoFpsRangesFor() + 1) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for RSA cipher.");
        }
        if (i2 == getHighSpeedVideoFpsRangesFor() + 1 && !this.getHighSpeedVideoSizes) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for RSA cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(this.getHighSpeedVideoFpsRangesFor.getModulus()) < 0) {
            return bigInteger;
        }
        throw new org.bouncycastle.crypto.DataLengthException("input too large for RSA cipher.");
    }

    RSACoreEngine() {
    }
}
