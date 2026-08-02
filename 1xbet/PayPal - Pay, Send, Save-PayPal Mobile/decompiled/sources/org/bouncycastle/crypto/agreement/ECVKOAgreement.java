package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class ECVKOAgreement {
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    public byte[] calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.Camera2StreamConfigurationMap.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new java.lang.IllegalStateException("ECVKO public key has wrong domain parameters");
        }
        java.math.BigInteger mod = parameters.getH().multiply(this.getHighSpeedVideoFpsRangesFor).multiply(this.Camera2StreamConfigurationMap.getD()).mod(parameters.getN());
        org.bouncycastle.math.ec.ECPoint cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (cleanPoint.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        org.bouncycastle.math.ec.ECPoint normalize = cleanPoint.multiply(mod).normalize();
        if (normalize.isInfinity()) {
            throw new java.lang.IllegalStateException("Infinity is not a valid agreement value for ECVKO");
        }
        java.math.BigInteger bigInteger = normalize.getAffineXCoord().toBigInteger();
        java.math.BigInteger bigInteger2 = normalize.getAffineYCoord().toBigInteger();
        int i = bigInteger.toByteArray().length > 33 ? 64 : 32;
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(i, bigInteger);
        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(i, bigInteger2);
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i3] = asUnsignedByteArray[(i - i3) - 1];
        }
        for (int i4 = 0; i4 != i; i4++) {
            bArr[i + i4] = asUnsignedByteArray2[(i - i4) - 1];
        }
        this.getHighSpeedVideoSizes.update(bArr, 0, i2);
        byte[] bArr2 = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
        return bArr2;
    }

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.ParametersWithUKM parametersWithUKM = (org.bouncycastle.crypto.params.ParametersWithUKM) cipherParameters;
        this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) parametersWithUKM.getParameters();
        byte[] ukm = parametersWithUKM.getUKM();
        int length = ukm.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = ukm[(ukm.length - i) - 1];
        }
        this.getHighSpeedVideoFpsRangesFor = new java.math.BigInteger(1, bArr);
    }

    public int getFieldSize() {
        return (this.Camera2StreamConfigurationMap.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    public ECVKOAgreement(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = digest;
    }
}
