package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class SM2Signer implements org.bouncycastle.crypto.Signer, org.bouncycastle.math.ec.ECConstants {
    private final org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.signers.DSAKCalculator getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.signers.DSAEncoding getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ECKeyParameters getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private org.bouncycastle.math.ec.ECPoint getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException {
        byte[] bArr = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
        this.Camera2StreamConfigurationMap.doFinal(bArr, 0);
        reset();
        java.math.BigInteger n = this.getHighSpeedVideoFpsRangesFor.getN();
        java.math.BigInteger calculateE = calculateE(n, bArr);
        java.math.BigInteger d = ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoSizes).getD();
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            java.math.BigInteger nextK = this.getHighResolutionOutputSizeshNQ4ISI.nextK();
            java.math.BigInteger mod = calculateE.add(createBasePointMultiplier.multiply(this.getHighSpeedVideoFpsRangesFor.getG(), nextK).normalize().getAffineXCoord().toBigInteger()).mod(n);
            if (!mod.equals(ZERO) && !mod.add(nextK).equals(n)) {
                java.math.BigInteger mod2 = org.bouncycastle.util.BigIntegers.modOddInverse(n, d.add(ONE)).multiply(nextK.subtract(mod.multiply(d)).mod(n)).mod(n);
                if (!mod2.equals(ZERO)) {
                    try {
                        return this.getHighSpeedVideoFpsRanges.encode(this.getHighSpeedVideoFpsRangesFor.getN(), mod, mod2);
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
                        sb.append(e.getMessage());
                        throw new org.bouncycastle.crypto.CryptoException(sb.toString(), e);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        byte[] decodeStrict;
        org.bouncycastle.math.ec.ECPoint q;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithID) {
            org.bouncycastle.crypto.params.ParametersWithID parametersWithID = (org.bouncycastle.crypto.params.ParametersWithID) cipherParameters;
            org.bouncycastle.crypto.CipherParameters parameters = parametersWithID.getParameters();
            byte[] id = parametersWithID.getID();
            if (id.length >= 8192) {
                throw new java.lang.IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            decodeStrict = id;
            cipherParameters = parameters;
        } else {
            decodeStrict = org.bouncycastle.util.encoders.Hex.decodeStrict("31323334353637383132333435363738");
        }
        if (z) {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters = (org.bouncycastle.crypto.params.ECKeyParameters) parametersWithRandom.getParameters();
                this.getHighSpeedVideoSizes = eCKeyParameters;
                org.bouncycastle.crypto.params.ECDomainParameters parameters2 = eCKeyParameters.getParameters();
                this.getHighSpeedVideoFpsRangesFor = parameters2;
                this.getHighResolutionOutputSizeshNQ4ISI.init(parameters2.getN(), parametersWithRandom.getRandom());
            } else {
                org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters2 = (org.bouncycastle.crypto.params.ECKeyParameters) cipherParameters;
                this.getHighSpeedVideoSizes = eCKeyParameters2;
                org.bouncycastle.crypto.params.ECDomainParameters parameters3 = eCKeyParameters2.getParameters();
                this.getHighSpeedVideoFpsRangesFor = parameters3;
                this.getHighResolutionOutputSizeshNQ4ISI.init(parameters3.getN(), org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
            }
            q = createBasePointMultiplier().multiply(this.getHighSpeedVideoFpsRangesFor.getG(), ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoSizes).getD()).normalize();
        } else {
            org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters3 = (org.bouncycastle.crypto.params.ECKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = eCKeyParameters3;
            this.getHighSpeedVideoFpsRangesFor = eCKeyParameters3.getParameters();
            q = ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoSizes).getQ();
        }
        this.getOutputMinFrameDuration = q;
        this.Camera2StreamConfigurationMap.reset();
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        int length = decodeStrict.length * 8;
        digest.update((byte) ((length >> 8) & 255));
        digest.update((byte) (length & 255));
        digest.update(decodeStrict, 0, decodeStrict.length);
        org.bouncycastle.crypto.Digest digest2 = this.Camera2StreamConfigurationMap;
        byte[] encoded = this.getHighSpeedVideoFpsRangesFor.getCurve().getA().getEncoded();
        digest2.update(encoded, 0, encoded.length);
        org.bouncycastle.crypto.Digest digest3 = this.Camera2StreamConfigurationMap;
        byte[] encoded2 = this.getHighSpeedVideoFpsRangesFor.getCurve().getB().getEncoded();
        digest3.update(encoded2, 0, encoded2.length);
        org.bouncycastle.crypto.Digest digest4 = this.Camera2StreamConfigurationMap;
        byte[] encoded3 = this.getHighSpeedVideoFpsRangesFor.getG().getAffineXCoord().getEncoded();
        digest4.update(encoded3, 0, encoded3.length);
        org.bouncycastle.crypto.Digest digest5 = this.Camera2StreamConfigurationMap;
        byte[] encoded4 = this.getHighSpeedVideoFpsRangesFor.getG().getAffineYCoord().getEncoded();
        digest5.update(encoded4, 0, encoded4.length);
        org.bouncycastle.crypto.Digest digest6 = this.Camera2StreamConfigurationMap;
        byte[] encoded5 = this.getOutputMinFrameDuration.getAffineXCoord().getEncoded();
        digest6.update(encoded5, 0, encoded5.length);
        org.bouncycastle.crypto.Digest digest7 = this.Camera2StreamConfigurationMap;
        byte[] encoded6 = this.getOutputMinFrameDuration.getAffineYCoord().getEncoded();
        digest7.update(encoded6, 0, encoded6.length);
        int digestSize = this.Camera2StreamConfigurationMap.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.Camera2StreamConfigurationMap.doFinal(bArr, 0);
        this.getInputFormats = bArr;
        this.Camera2StreamConfigurationMap.update(bArr, 0, digestSize);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            java.math.BigInteger[] decode = this.getHighSpeedVideoFpsRanges.decode(this.getHighSpeedVideoFpsRangesFor.getN(), bArr);
            java.math.BigInteger bigInteger = decode[0];
            java.math.BigInteger bigInteger2 = decode[1];
            java.math.BigInteger n = this.getHighSpeedVideoFpsRangesFor.getN();
            if (bigInteger.compareTo(ONE) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(ONE) < 0 || bigInteger2.compareTo(n) >= 0) {
                return false;
            }
            byte[] bArr2 = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
            this.Camera2StreamConfigurationMap.doFinal(bArr2, 0);
            reset();
            java.math.BigInteger calculateE = calculateE(n, bArr2);
            java.math.BigInteger mod = bigInteger.add(bigInteger2).mod(n);
            if (mod.equals(ZERO)) {
                return false;
            }
            org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(this.getHighSpeedVideoFpsRangesFor.getG(), bigInteger2, ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoSizes).getQ(), mod).normalize();
            if (normalize.isInfinity()) {
                return false;
            }
            return calculateE.add(normalize.getAffineXCoord().toBigInteger()).mod(n).equals(bigInteger);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.Camera2StreamConfigurationMap.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.Camera2StreamConfigurationMap.reset();
        byte[] bArr = this.getInputFormats;
        if (bArr != null) {
            this.Camera2StreamConfigurationMap.update(bArr, 0, bArr.length);
        }
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }

    protected java.math.BigInteger calculateE(java.math.BigInteger bigInteger, byte[] bArr) {
        return new java.math.BigInteger(1, bArr);
    }

    public SM2Signer(org.bouncycastle.crypto.signers.DSAEncoding dSAEncoding, org.bouncycastle.crypto.Digest digest) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.RandomDSAKCalculator();
        this.getHighSpeedVideoFpsRanges = dSAEncoding;
        this.Camera2StreamConfigurationMap = digest;
    }

    public SM2Signer(org.bouncycastle.crypto.signers.DSAEncoding dSAEncoding) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.RandomDSAKCalculator();
        this.getHighSpeedVideoFpsRanges = dSAEncoding;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.SM3Digest();
    }

    public SM2Signer(org.bouncycastle.crypto.Digest digest) {
        this(org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE, digest);
    }

    public SM2Signer() {
        this(org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE, new org.bouncycastle.crypto.digests.SM3Digest());
    }
}
