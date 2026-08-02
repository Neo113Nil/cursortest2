package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class PSSSigner implements org.bouncycastle.crypto.Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getOutputFormats;
    private int getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizeshNQ4ISI;
    private byte getOutputStallDuration;

    private byte[] Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, int i3) {
        int i4;
        org.bouncycastle.crypto.Digest digest = this.getOutputFormats;
        if (digest instanceof org.bouncycastle.crypto.Xof) {
            byte[] bArr2 = new byte[i3];
            digest.update(bArr, i, i2);
            ((org.bouncycastle.crypto.Xof) this.getOutputFormats).doFinal(bArr2, 0, i3);
            return bArr2;
        }
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[this.getOutputMinFrameDuration];
        byte[] bArr5 = new byte[4];
        digest.reset();
        int i5 = 0;
        while (true) {
            i4 = this.getOutputMinFrameDuration;
            if (i5 >= i3 / i4) {
                break;
            }
            bArr5[0] = (byte) (i5 >>> 24);
            bArr5[1] = (byte) (i5 >>> 16);
            bArr5[2] = (byte) (i5 >>> 8);
            bArr5[3] = (byte) i5;
            this.getOutputFormats.update(bArr, i, i2);
            this.getOutputFormats.update(bArr5, 0, 4);
            this.getOutputFormats.doFinal(bArr4, 0);
            int i6 = this.getOutputMinFrameDuration;
            java.lang.System.arraycopy(bArr4, 0, bArr3, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            bArr5[0] = (byte) (i5 >>> 24);
            bArr5[1] = (byte) (i5 >>> 16);
            bArr5[2] = (byte) (i5 >>> 8);
            bArr5[3] = (byte) i5;
            this.getOutputFormats.update(bArr, i, i2);
            this.getOutputFormats.update(bArr5, 0, 4);
            this.getOutputFormats.doFinal(bArr4, 0);
            int i7 = i5 * this.getOutputMinFrameDuration;
            java.lang.System.arraycopy(bArr4, 0, bArr3, i7, i3 - i7);
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException, org.bouncycastle.crypto.DataLengthException {
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr = this.getInputFormats;
        digest.doFinal(bArr, (bArr.length - this.getHighSpeedVideoFpsRangesFor) - this.getHighSpeedVideoSizesFor);
        if (this.getHighSpeedVideoSizesFor != 0) {
            if (!this.getOutputMinFrameDurationlomOqCM) {
                this.getInputSizeshNQ4ISI.nextBytes(this.getOutputSizeshNQ4ISI);
            }
            byte[] bArr2 = this.getOutputSizeshNQ4ISI;
            byte[] bArr3 = this.getInputFormats;
            int length = bArr3.length;
            int i = this.getHighSpeedVideoSizesFor;
            java.lang.System.arraycopy(bArr2, 0, bArr3, length - i, i);
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr4 = new byte[i2];
        org.bouncycastle.crypto.Digest digest2 = this.Camera2StreamConfigurationMap;
        byte[] bArr5 = this.getInputFormats;
        digest2.update(bArr5, 0, bArr5.length);
        this.Camera2StreamConfigurationMap.doFinal(bArr4, 0);
        byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
        int length2 = bArr6.length;
        int i3 = this.getHighSpeedVideoSizesFor;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
        java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr4, 0, i2, (this.getHighSpeedVideoFpsRanges.length - this.getHighSpeedVideoFpsRangesFor) - 1);
        for (int i5 = 0; i5 != Camera2StreamConfigurationMap.length; i5++) {
            byte[] bArr7 = this.getHighSpeedVideoFpsRanges;
            bArr7[i5] = (byte) (bArr7[i5] ^ Camera2StreamConfigurationMap[i5]);
        }
        byte[] bArr8 = this.getHighSpeedVideoFpsRanges;
        int length3 = bArr8.length;
        int i6 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr4, 0, bArr8, (length3 - i6) - 1, i6);
        byte[] bArr9 = this.getHighSpeedVideoFpsRanges;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.getHighSpeedVideoSizes)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.getOutputStallDuration;
        byte[] processBlock = this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr9, 0, bArr9.length);
        byte[] bArr10 = this.getHighSpeedVideoFpsRanges;
        for (int i7 = 0; i7 != bArr10.length; i7++) {
            bArr10[i7] = 0;
        }
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b;
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr3 = this.getInputFormats;
        digest.doFinal(bArr3, (bArr3.length - this.getHighSpeedVideoFpsRangesFor) - this.getHighSpeedVideoSizesFor);
        try {
            byte[] processBlock = this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
            org.bouncycastle.util.Arrays.fill(bArr4, 0, bArr4.length - processBlock.length, (byte) 0);
            byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(processBlock, 0, bArr5, bArr5.length - processBlock.length, processBlock.length);
            bArr2 = this.getHighSpeedVideoFpsRanges;
            length = 255 >>> ((bArr2.length * 8) - this.getHighSpeedVideoSizes);
            b = bArr2[0];
        } catch (java.lang.Exception unused) {
        }
        if ((b & 255) != (b & length) || bArr2[bArr2.length - 1] != this.getOutputStallDuration) {
            for (int i = 0; i != bArr2.length; i++) {
                bArr2[i] = 0;
            }
            return false;
        }
        int length2 = bArr2.length;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr2, (length2 - i2) - 1, i2, (bArr2.length - i2) - 1);
        for (int i3 = 0; i3 != Camera2StreamConfigurationMap.length; i3++) {
            byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
            bArr6[i3] = (byte) (bArr6[i3] ^ Camera2StreamConfigurationMap[i3]);
        }
        byte[] bArr7 = this.getHighSpeedVideoFpsRanges;
        bArr7[0] = (byte) (length & bArr7[0]);
        int i4 = 0;
        while (true) {
            byte[] bArr8 = this.getHighSpeedVideoFpsRanges;
            int length3 = bArr8.length;
            int i5 = this.getHighSpeedVideoFpsRangesFor;
            int i6 = this.getHighSpeedVideoSizesFor;
            if (i4 != ((length3 - i5) - i6) - 2) {
                if (bArr8[i4] != 0) {
                    for (int i7 = 0; i7 != bArr8.length; i7++) {
                        bArr8[i7] = 0;
                    }
                    return false;
                }
                i4++;
            } else {
                if (bArr8[((bArr8.length - i5) - i6) - 2] != 1) {
                    for (int i8 = 0; i8 != bArr8.length; i8++) {
                        bArr8[i8] = 0;
                    }
                    return false;
                }
                if (this.getOutputMinFrameDurationlomOqCM) {
                    byte[] bArr9 = this.getOutputSizeshNQ4ISI;
                    byte[] bArr10 = this.getInputFormats;
                    java.lang.System.arraycopy(bArr9, 0, bArr10, bArr10.length - i6, i6);
                } else {
                    int length4 = bArr8.length;
                    byte[] bArr11 = this.getInputFormats;
                    java.lang.System.arraycopy(bArr8, ((length4 - i6) - i5) - 1, bArr11, bArr11.length - i6, i6);
                }
                org.bouncycastle.crypto.Digest digest2 = this.Camera2StreamConfigurationMap;
                byte[] bArr12 = this.getInputFormats;
                digest2.update(bArr12, 0, bArr12.length);
                org.bouncycastle.crypto.Digest digest3 = this.Camera2StreamConfigurationMap;
                byte[] bArr13 = this.getInputFormats;
                digest3.doFinal(bArr13, bArr13.length - this.getHighSpeedVideoFpsRangesFor);
                int length5 = this.getHighSpeedVideoFpsRanges.length;
                int i9 = this.getHighSpeedVideoFpsRangesFor;
                int i10 = (length5 - i9) - 1;
                int length6 = this.getInputFormats.length - i9;
                while (true) {
                    byte[] bArr14 = this.getInputFormats;
                    if (length6 == bArr14.length) {
                        for (int i11 = 0; i11 != bArr14.length; i11++) {
                            bArr14[i11] = 0;
                        }
                        byte[] bArr15 = this.getHighSpeedVideoFpsRanges;
                        for (int i12 = 0; i12 != bArr15.length; i12++) {
                            bArr15[i12] = 0;
                        }
                        return true;
                    }
                    if ((this.getHighSpeedVideoFpsRanges[i10] ^ bArr14[length6]) != 0) {
                        for (int i13 = 0; i13 != bArr14.length; i13++) {
                            bArr14[i13] = 0;
                        }
                        byte[] bArr16 = this.getHighSpeedVideoFpsRanges;
                        for (int i14 = 0; i14 != bArr16.length; i14++) {
                            bArr16[i14] = 0;
                        }
                        return false;
                    }
                    i10++;
                    length6++;
                }
            }
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
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.CipherParameters cipherParameters2;
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            cipherParameters2 = parametersWithRandom.getParameters();
            this.getInputSizeshNQ4ISI = parametersWithRandom.getRandom();
        } else {
            if (z) {
                this.getInputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            cipherParameters2 = cipherParameters;
        }
        if (cipherParameters2 instanceof org.bouncycastle.crypto.params.RSABlindingParameters) {
            rSAKeyParameters = ((org.bouncycastle.crypto.params.RSABlindingParameters) cipherParameters2).getPublicKey();
            this.getHighResolutionOutputSizeshNQ4ISI.init(z, cipherParameters);
        } else {
            rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters2;
            this.getHighResolutionOutputSizeshNQ4ISI.init(z, cipherParameters2);
        }
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        int i = bitLength - 1;
        this.getHighSpeedVideoSizes = i;
        if (i < (this.getHighSpeedVideoFpsRangesFor * 8) + (this.getHighSpeedVideoSizesFor * 8) + 9) {
            throw new java.lang.IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.getHighSpeedVideoFpsRanges = new byte[(bitLength + 6) / 8];
        reset();
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2, byte[] bArr, byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
        this.Camera2StreamConfigurationMap = digest;
        this.getOutputFormats = digest2;
        this.getHighSpeedVideoFpsRangesFor = digest.getDigestSize();
        this.getOutputMinFrameDuration = digest2.getDigestSize();
        this.getOutputMinFrameDurationlomOqCM = true;
        int length = bArr.length;
        this.getHighSpeedVideoSizesFor = length;
        this.getOutputSizeshNQ4ISI = bArr;
        this.getInputFormats = new byte[length + 8 + this.getHighSpeedVideoFpsRangesFor];
        this.getOutputStallDuration = b;
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2, int i, byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
        this.Camera2StreamConfigurationMap = digest;
        this.getOutputFormats = digest2;
        this.getHighSpeedVideoFpsRangesFor = digest.getDigestSize();
        this.getOutputMinFrameDuration = digest2.getDigestSize();
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoSizesFor = i;
        this.getOutputSizeshNQ4ISI = new byte[i];
        this.getInputFormats = new byte[i + 8 + this.getHighSpeedVideoFpsRangesFor];
        this.getOutputStallDuration = b;
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2, int i) {
        this(asymmetricBlockCipher, digest, digest2, i, TRAILER_IMPLICIT);
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, int i, byte b) {
        this(asymmetricBlockCipher, digest, digest, i, b);
    }

    public PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, int i) {
        this(asymmetricBlockCipher, digest, i, TRAILER_IMPLICIT);
    }
}
