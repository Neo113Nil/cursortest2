package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class SM2KeyExchange {
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private org.bouncycastle.math.ec.ECPoint getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;

    private byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest, org.bouncycastle.math.ec.ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 2);
        byte[] encoded = eCPoint.getAffineYCoord().getEncoded();
        digest.update(encoded, 0, encoded.length);
        digest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest, org.bouncycastle.math.ec.ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 3);
        byte[] encoded = eCPoint.getAffineYCoord().getEncoded();
        digest.update(encoded, 0, encoded.length);
        digest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest, org.bouncycastle.math.ec.ECPoint eCPoint, byte[] bArr, byte[] bArr2, org.bouncycastle.math.ec.ECPoint eCPoint2, org.bouncycastle.math.ec.ECPoint eCPoint3) {
        byte[] encoded = eCPoint.getAffineXCoord().getEncoded();
        digest.update(encoded, 0, encoded.length);
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        byte[] encoded2 = eCPoint2.getAffineXCoord().getEncoded();
        digest.update(encoded2, 0, encoded2.length);
        byte[] encoded3 = eCPoint2.getAffineYCoord().getEncoded();
        digest.update(encoded3, 0, encoded3.length);
        byte[] encoded4 = eCPoint3.getAffineXCoord().getEncoded();
        digest.update(encoded4, 0, encoded4.length);
        byte[] encoded5 = eCPoint3.getAffineYCoord().getEncoded();
        digest.update(encoded5, 0, encoded5.length);
        byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr3, 0);
        return bArr3;
    }

    private org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters) {
        org.bouncycastle.crypto.params.ECDomainParameters parameters = this.getHighSpeedVideoSizesFor.getParameters();
        org.bouncycastle.math.ec.ECPoint cleanPoint = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        org.bouncycastle.math.ec.ECPoint cleanPoint2 = org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        java.math.BigInteger bit = this.getHighResolutionOutputSizeshNQ4ISI.getAffineXCoord().toBigInteger().and(java.math.BigInteger.valueOf(1L).shiftLeft(this.getOutputMinFrameDuration).subtract(java.math.BigInteger.valueOf(1L))).setBit(this.getOutputMinFrameDuration);
        java.math.BigInteger bit2 = cleanPoint2.getAffineXCoord().toBigInteger().and(java.math.BigInteger.valueOf(1L).shiftLeft(this.getOutputMinFrameDuration).subtract(java.math.BigInteger.valueOf(1L))).setBit(this.getOutputMinFrameDuration);
        java.math.BigInteger mod = this.getHighSpeedVideoFpsRangesFor.getH().multiply(this.getHighSpeedVideoSizesFor.getD().add(bit.multiply(this.Camera2StreamConfigurationMap.getD()))).mod(this.getHighSpeedVideoFpsRangesFor.getN());
        return org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(cleanPoint, mod, cleanPoint2, mod.multiply(bit2).mod(this.getHighSpeedVideoFpsRangesFor.getN())).normalize();
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Digest digest, byte[] bArr, org.bouncycastle.math.ec.ECPoint eCPoint) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
        byte[] encoded = this.getHighSpeedVideoFpsRangesFor.getCurve().getA().getEncoded();
        digest.update(encoded, 0, encoded.length);
        byte[] encoded2 = this.getHighSpeedVideoFpsRangesFor.getCurve().getB().getEncoded();
        digest.update(encoded2, 0, encoded2.length);
        byte[] encoded3 = this.getHighSpeedVideoFpsRangesFor.getG().getAffineXCoord().getEncoded();
        digest.update(encoded3, 0, encoded3.length);
        byte[] encoded4 = this.getHighSpeedVideoFpsRangesFor.getG().getAffineYCoord().getEncoded();
        digest.update(encoded4, 0, encoded4.length);
        byte[] encoded5 = eCPoint.getAffineXCoord().getEncoded();
        digest.update(encoded5, 0, encoded5.length);
        byte[] encoded6 = eCPoint.getAffineYCoord().getEncoded();
        digest.update(encoded6, 0, encoded6.length);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECPoint eCPoint, byte[] bArr, byte[] bArr2, int i) {
        org.bouncycastle.util.Memoable memoable;
        org.bouncycastle.util.Memoable memoable2;
        int digestSize = this.getHighSpeedVideoFpsRanges.getDigestSize();
        byte[] bArr3 = new byte[java.lang.Math.max(4, digestSize)];
        int i2 = (i + 7) / 8;
        byte[] bArr4 = new byte[i2];
        org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRanges;
        if (digest instanceof org.bouncycastle.util.Memoable) {
            byte[] encoded = eCPoint.getAffineXCoord().getEncoded();
            digest.update(encoded, 0, encoded.length);
            org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoFpsRanges;
            byte[] encoded2 = eCPoint.getAffineYCoord().getEncoded();
            digest2.update(encoded2, 0, encoded2.length);
            this.getHighSpeedVideoFpsRanges.update(bArr, 0, bArr.length);
            this.getHighSpeedVideoFpsRanges.update(bArr2, 0, bArr2.length);
            memoable = (org.bouncycastle.util.Memoable) this.getHighSpeedVideoFpsRanges;
            memoable2 = memoable.copy();
        } else {
            memoable = null;
            memoable2 = null;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (memoable != null) {
                memoable.reset(memoable2);
            } else {
                org.bouncycastle.crypto.Digest digest3 = this.getHighSpeedVideoFpsRanges;
                byte[] encoded3 = eCPoint.getAffineXCoord().getEncoded();
                digest3.update(encoded3, 0, encoded3.length);
                org.bouncycastle.crypto.Digest digest4 = this.getHighSpeedVideoFpsRanges;
                byte[] encoded4 = eCPoint.getAffineYCoord().getEncoded();
                digest4.update(encoded4, 0, encoded4.length);
                this.getHighSpeedVideoFpsRanges.update(bArr, 0, bArr.length);
                this.getHighSpeedVideoFpsRanges.update(bArr2, 0, bArr2.length);
            }
            i4++;
            org.bouncycastle.util.Pack.intToBigEndian(i4, bArr3, 0);
            this.getHighSpeedVideoFpsRanges.update(bArr3, 0, 4);
            this.getHighSpeedVideoFpsRanges.doFinal(bArr3, 0);
            int min = java.lang.Math.min(digestSize, i2 - i3);
            java.lang.System.arraycopy(bArr3, 0, bArr4, i3, min);
            i3 += min;
        }
        return bArr4;
    }

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters sM2KeyExchangePrivateParameters;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithID) {
            org.bouncycastle.crypto.params.ParametersWithID parametersWithID = (org.bouncycastle.crypto.params.ParametersWithID) cipherParameters;
            sM2KeyExchangePrivateParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters) parametersWithID.getParameters();
            this.getInputFormats = parametersWithID.getID();
        } else {
            sM2KeyExchangePrivateParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters) cipherParameters;
            this.getInputFormats = new byte[0];
        }
        this.getHighSpeedVideoSizes = sM2KeyExchangePrivateParameters.isInitiator();
        this.getHighSpeedVideoSizesFor = sM2KeyExchangePrivateParameters.getStaticPrivateKey();
        this.Camera2StreamConfigurationMap = sM2KeyExchangePrivateParameters.getEphemeralPrivateKey();
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getParameters();
        this.getInputSizeshNQ4ISI = sM2KeyExchangePrivateParameters.getStaticPublicPoint();
        this.getHighResolutionOutputSizeshNQ4ISI = sM2KeyExchangePrivateParameters.getEphemeralPublicPoint();
        this.getOutputMinFrameDuration = (this.getHighSpeedVideoFpsRangesFor.getCurve().getFieldSize() / 2) - 1;
    }

    public byte[][] calculateKeyWithConfirmation(int i, byte[] bArr, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] bArr2;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithID) {
            org.bouncycastle.crypto.params.ParametersWithID parametersWithID = (org.bouncycastle.crypto.params.ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            bArr2 = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters) cipherParameters;
            bArr2 = new byte[0];
        }
        if (this.getHighSpeedVideoSizes && bArr == null) {
            throw new java.lang.IllegalArgumentException("if initiating, confirmationTag must be set");
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getInputSizeshNQ4ISI);
        byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, bArr2, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        org.bouncycastle.math.ec.ECPoint highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(sM2KeyExchangePublicParameters);
        if (!this.getHighSpeedVideoSizes) {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, i);
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ(), this.getHighResolutionOutputSizeshNQ4ISI);
            return new byte[][]{highSpeedVideoSizes, getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, Camera2StreamConfigurationMap), Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, Camera2StreamConfigurationMap)};
        }
        byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, i);
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, this.getHighResolutionOutputSizeshNQ4ISI, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, Camera2StreamConfigurationMap2), bArr)) {
            return new byte[][]{highSpeedVideoSizes2, Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, Camera2StreamConfigurationMap2)};
        }
        throw new java.lang.IllegalStateException("confirmation tag mismatch");
    }

    public byte[] calculateKey(int i, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] bArr;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithID) {
            org.bouncycastle.crypto.params.ParametersWithID parametersWithID = (org.bouncycastle.crypto.params.ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            bArr = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters) cipherParameters;
            bArr = new byte[0];
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getInputSizeshNQ4ISI);
        byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, bArr, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        org.bouncycastle.math.ec.ECPoint highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(sM2KeyExchangePublicParameters);
        return this.getHighSpeedVideoSizes ? getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, i) : getHighSpeedVideoSizes(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, i);
    }

    public SM2KeyExchange(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRanges = digest;
    }

    public SM2KeyExchange() {
        this(new org.bouncycastle.crypto.digests.SM3Digest());
    }
}
