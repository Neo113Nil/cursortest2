package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class GOST3410Signer implements org.bouncycastle.crypto.DSAExt {
    org.bouncycastle.crypto.params.GOST3410KeyParameters getHighResolutionOutputSizeshNQ4ISI;
    java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(bArr));
        org.bouncycastle.crypto.params.GOST3410Parameters parameters = this.getHighResolutionOutputSizeshNQ4ISI.getParameters();
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || parameters.getQ().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || parameters.getQ().compareTo(bigInteger2) <= 0) {
            return false;
        }
        java.math.BigInteger modPow = bigInteger3.modPow(parameters.getQ().subtract(new java.math.BigInteger(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D)), parameters.getQ());
        return parameters.getA().modPow(bigInteger2.multiply(modPow).mod(parameters.getQ()), parameters.getP()).multiply(((org.bouncycastle.crypto.params.GOST3410PublicKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI).getY().modPow(parameters.getQ().subtract(bigInteger).multiply(modPow).mod(parameters.getQ()), parameters.getP())).mod(parameters.getP()).mod(parameters.getQ()).equals(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!z) {
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.GOST3410PublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getHighSpeedVideoSizes = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters) cipherParameters;
        } else {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighSpeedVideoSizes = parametersWithRandom.getRandom();
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters) parametersWithRandom.getParameters();
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getParameters().getQ();
    }

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        java.math.BigInteger createRandomBigInteger;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, org.bouncycastle.util.Arrays.reverse(bArr));
        org.bouncycastle.crypto.params.GOST3410Parameters parameters = this.getHighResolutionOutputSizeshNQ4ISI.getParameters();
        do {
            createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(parameters.getQ().bitLength(), this.getHighSpeedVideoSizes);
        } while (createRandomBigInteger.compareTo(parameters.getQ()) >= 0);
        java.math.BigInteger mod = parameters.getA().modPow(createRandomBigInteger, parameters.getP()).mod(parameters.getQ());
        return new java.math.BigInteger[]{mod, createRandomBigInteger.multiply(bigInteger).add(((org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI).getX().multiply(mod)).mod(parameters.getQ())};
    }
}
