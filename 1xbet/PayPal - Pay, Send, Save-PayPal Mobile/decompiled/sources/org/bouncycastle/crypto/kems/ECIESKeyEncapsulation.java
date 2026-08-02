package org.bouncycastle.crypto.kems;

/* loaded from: classes17.dex */
public class ECIESKeyEncapsulation implements org.bouncycastle.crypto.KeyEncapsulation {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(1);
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.DerivationFunction getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECKeyParameters getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ECKeyParameters)) {
            throw new java.lang.IllegalArgumentException("EC key required");
        }
        this.getOutputMinFrameDuration = (org.bouncycastle.crypto.params.ECKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public org.bouncycastle.crypto.CipherParameters encrypt(byte[] bArr, int i, int i2) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters = this.getOutputMinFrameDuration;
        if (!(eCKeyParameters instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
            throw new java.lang.IllegalArgumentException("Public key required for encryption");
        }
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) eCKeyParameters;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        org.bouncycastle.math.ec.ECCurve curve = parameters.getCurve();
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger h = parameters.getH();
        java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(getHighResolutionOutputSizeshNQ4ISI, n, this.getInputSizeshNQ4ISI);
        org.bouncycastle.math.ec.ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), createRandomInRange), eCPublicKeyParameters.getQ().multiply(this.getHighSpeedVideoFpsRangesFor ? createRandomInRange.multiply(h).mod(n) : createRandomInRange)};
        curve.normalizeAll(eCPointArr);
        org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[0];
        org.bouncycastle.math.ec.ECPoint eCPoint2 = eCPointArr[1];
        byte[] encoded = eCPoint.getEncoded(false);
        java.lang.System.arraycopy(encoded, 0, bArr, i, encoded.length);
        return deriveKey(i2, encoded, eCPoint2.getAffineXCoord().getEncoded());
    }

    public org.bouncycastle.crypto.CipherParameters encrypt(byte[] bArr, int i) {
        return encrypt(bArr, 0, i);
    }

    protected org.bouncycastle.crypto.params.KeyParameter deriveKey(int i, byte[] bArr, byte[] bArr2) {
        if (!this.getHighSpeedVideoSizes) {
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr, bArr2);
            org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
            bArr2 = concatenate;
        }
        try {
            this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KDFParameters(bArr2, null));
            byte[] bArr3 = new byte[i];
            this.getHighSpeedVideoFpsRanges.generateBytes(bArr3, 0, i);
            return new org.bouncycastle.crypto.params.KeyParameter(bArr3);
        } finally {
            org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public org.bouncycastle.crypto.CipherParameters decrypt(byte[] bArr, int i, int i2, int i3) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters = this.getOutputMinFrameDuration;
        if (!(eCKeyParameters instanceof org.bouncycastle.crypto.params.ECPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("Private key required for encryption");
        }
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) eCKeyParameters;
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        org.bouncycastle.math.ec.ECCurve curve = parameters.getCurve();
        java.math.BigInteger n = parameters.getN();
        java.math.BigInteger h = parameters.getH();
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        org.bouncycastle.math.ec.ECPoint decodePoint = curve.decodePoint(bArr2);
        if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRangesFor) {
            decodePoint = decodePoint.multiply(h);
        }
        java.math.BigInteger d = eCPrivateKeyParameters.getD();
        if (this.Camera2StreamConfigurationMap) {
            d = d.multiply(parameters.getHInv()).mod(n);
        }
        return deriveKey(i3, bArr2, decodePoint.multiply(d).normalize().getAffineXCoord().getEncoded());
    }

    public org.bouncycastle.crypto.CipherParameters decrypt(byte[] bArr, int i) {
        return decrypt(bArr, 0, bArr.length, i);
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }

    public ECIESKeyEncapsulation(org.bouncycastle.crypto.DerivationFunction derivationFunction, java.security.SecureRandom secureRandom, boolean z, boolean z2, boolean z3) {
        this.getHighSpeedVideoFpsRanges = derivationFunction;
        this.getInputSizeshNQ4ISI = secureRandom;
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = false;
        } else {
            this.getHighSpeedVideoFpsRangesFor = z2;
        }
        this.getHighSpeedVideoSizes = z3;
    }

    public ECIESKeyEncapsulation(org.bouncycastle.crypto.DerivationFunction derivationFunction, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = derivationFunction;
        this.getInputSizeshNQ4ISI = secureRandom;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizes = false;
    }
}
