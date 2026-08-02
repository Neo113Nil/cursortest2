package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class CramerShoupCoreEngine {
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.CramerShoupKeyParameters Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor = null;

    public org.bouncycastle.crypto.engines.CramerShoupCiphertext encryptBlock(java.math.BigInteger bigInteger) {
        if (this.Camera2StreamConfigurationMap.isPrivate() || !this.getHighResolutionOutputSizeshNQ4ISI) {
            return null;
        }
        org.bouncycastle.crypto.params.CramerShoupKeyParameters cramerShoupKeyParameters = this.Camera2StreamConfigurationMap;
        if (!(cramerShoupKeyParameters instanceof org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters)) {
            return null;
        }
        org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters) cramerShoupKeyParameters;
        java.math.BigInteger p = cramerShoupPublicKeyParameters.getParameters().getP();
        java.math.BigInteger g1 = cramerShoupPublicKeyParameters.getParameters().getG1();
        java.math.BigInteger g2 = cramerShoupPublicKeyParameters.getParameters().getG2();
        java.math.BigInteger h = cramerShoupPublicKeyParameters.getH();
        if (bigInteger.compareTo(p) >= 0) {
            return null;
        }
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRanges;
        java.math.BigInteger bigInteger2 = getHighSpeedVideoSizes;
        java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger2, p.subtract(bigInteger2), secureRandom);
        java.math.BigInteger modPow = g1.modPow(createRandomInRange, p);
        java.math.BigInteger modPow2 = g2.modPow(createRandomInRange, p);
        java.math.BigInteger mod = h.modPow(createRandomInRange, p).multiply(bigInteger).mod(p);
        org.bouncycastle.crypto.Digest h2 = cramerShoupPublicKeyParameters.getParameters().getH();
        byte[] byteArray = modPow.toByteArray();
        h2.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = modPow2.toByteArray();
        h2.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = mod.toByteArray();
        h2.update(byteArray3, 0, byteArray3.length);
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            h2.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[h2.getDigestSize()];
        h2.doFinal(bArr2, 0);
        return new org.bouncycastle.crypto.engines.CramerShoupCiphertext(modPow, modPow2, mod, cramerShoupPublicKeyParameters.getC().modPow(createRandomInRange, p).multiply(cramerShoupPublicKeyParameters.getD().modPow(createRandomInRange.multiply(new java.math.BigInteger(1, bArr2)), p)).mod(p));
    }

    protected java.security.SecureRandom initSecureRandom(boolean z, java.security.SecureRandom secureRandom) {
        if (z) {
            return org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters, java.lang.String str) {
        init(z, cipherParameters);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Strings.toUTF8ByteArray(str);
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.CramerShoupKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.CramerShoupKeyParameters) cipherParameters;
            secureRandom = null;
        }
        this.getHighSpeedVideoFpsRanges = initSecureRandom(z, secureRandom);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public int getOutputBlockSize() {
        int bitLength = (this.Camera2StreamConfigurationMap.getParameters().getP().bitLength() + 7) / 8;
        return this.getHighResolutionOutputSizeshNQ4ISI ? bitLength : bitLength - 1;
    }

    public int getInputBlockSize() {
        int bitLength = (this.Camera2StreamConfigurationMap.getParameters().getP().bitLength() + 7) / 8;
        return this.getHighResolutionOutputSizeshNQ4ISI ? bitLength - 1 : bitLength;
    }

    public java.math.BigInteger decryptBlock(org.bouncycastle.crypto.engines.CramerShoupCiphertext cramerShoupCiphertext) throws org.bouncycastle.crypto.engines.CramerShoupCoreEngine.CramerShoupCiphertextException {
        if (!this.Camera2StreamConfigurationMap.isPrivate() || this.getHighResolutionOutputSizeshNQ4ISI) {
            return null;
        }
        org.bouncycastle.crypto.params.CramerShoupKeyParameters cramerShoupKeyParameters = this.Camera2StreamConfigurationMap;
        if (!(cramerShoupKeyParameters instanceof org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters)) {
            return null;
        }
        org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters) cramerShoupKeyParameters;
        java.math.BigInteger p = cramerShoupPrivateKeyParameters.getParameters().getP();
        org.bouncycastle.crypto.Digest h = cramerShoupPrivateKeyParameters.getParameters().getH();
        byte[] byteArray = cramerShoupCiphertext.getU1().toByteArray();
        h.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = cramerShoupCiphertext.getU2().toByteArray();
        h.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = cramerShoupCiphertext.getE().toByteArray();
        h.update(byteArray3, 0, byteArray3.length);
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            h.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[h.getDigestSize()];
        h.doFinal(bArr2, 0);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr2);
        if (cramerShoupCiphertext.Camera2StreamConfigurationMap.equals(cramerShoupCiphertext.getHighResolutionOutputSizeshNQ4ISI.modPow(cramerShoupPrivateKeyParameters.getX1().add(cramerShoupPrivateKeyParameters.getY1().multiply(bigInteger)), p).multiply(cramerShoupCiphertext.getHighSpeedVideoFpsRangesFor.modPow(cramerShoupPrivateKeyParameters.getX2().add(cramerShoupPrivateKeyParameters.getY2().multiply(bigInteger)), p)).mod(p))) {
            return cramerShoupCiphertext.getHighSpeedVideoFpsRanges.multiply(cramerShoupCiphertext.getHighResolutionOutputSizeshNQ4ISI.modPow(cramerShoupPrivateKeyParameters.getZ(), p).modInverse(p)).mod(p);
        }
        throw new org.bouncycastle.crypto.engines.CramerShoupCoreEngine.CramerShoupCiphertextException("Sorry, that ciphertext is not correct");
    }

    public byte[] convertOutput(java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                java.lang.System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            }
        } else {
            if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
                int length2 = byteArray.length - 1;
                byte[] bArr2 = new byte[length2];
                java.lang.System.arraycopy(byteArray, 1, bArr2, 0, length2);
                return bArr2;
            }
            if (byteArray.length < getOutputBlockSize()) {
                int outputBlockSize = getOutputBlockSize();
                byte[] bArr3 = new byte[outputBlockSize];
                java.lang.System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
                return bArr3;
            }
        }
        return byteArray;
    }

    public java.math.BigInteger convertInput(byte[] bArr, int i, int i2) {
        if (i2 > getInputBlockSize() + 1) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for Cramer Shoup cipher.");
        }
        if (i2 == getInputBlockSize() + 1 && this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for Cramer Shoup cipher.");
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(this.Camera2StreamConfigurationMap.getParameters().getP()) < 0) {
            return bigInteger;
        }
        throw new org.bouncycastle.crypto.DataLengthException("input too large for Cramer Shoup cipher.");
    }

    public static class CramerShoupCiphertextException extends java.lang.Exception {
        private static final long serialVersionUID = -6360977166495345076L;

        public CramerShoupCiphertextException(java.lang.String str) {
            super(str);
        }
    }
}
