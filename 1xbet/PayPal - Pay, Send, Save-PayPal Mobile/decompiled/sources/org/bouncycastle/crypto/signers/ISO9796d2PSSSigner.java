package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ISO9796d2PSSSigner implements org.bouncycastle.crypto.SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private boolean Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private java.security.SecureRandom getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private byte[] unwrapAs;

    private byte[] getHighSpeedVideoSizes(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.getHighSpeedVideoSizes];
        byte[] bArr4 = new byte[4];
        this.getHighSpeedVideoFpsRangesFor.reset();
        int i5 = 0;
        while (true) {
            i4 = this.getHighSpeedVideoSizes;
            if (i5 >= i3 / i4) {
                break;
            }
            bArr4[0] = (byte) (i5 >>> 24);
            bArr4[1] = (byte) (i5 >>> 16);
            bArr4[2] = (byte) (i5 >>> 8);
            bArr4[3] = (byte) i5;
            this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
            this.getHighSpeedVideoFpsRangesFor.update(bArr4, 0, 4);
            this.getHighSpeedVideoFpsRangesFor.doFinal(bArr3, 0);
            int i6 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            bArr4[0] = (byte) (i5 >>> 24);
            bArr4[1] = (byte) (i5 >>> 16);
            bArr4[2] = (byte) (i5 >>> 8);
            bArr4[3] = (byte) i5;
            this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
            this.getHighSpeedVideoFpsRangesFor.update(bArr4, 0, 4);
            this.getHighSpeedVideoFpsRangesFor.doFinal(bArr3, 0);
            int i7 = i5 * this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr3, 0, bArr2, i7, i3 - i7);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException {
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI * 8, bArr2);
        this.getHighSpeedVideoFpsRangesFor.update(bArr2, 0, 8);
        this.getHighSpeedVideoFpsRangesFor.update(this.getInputFormats, 0, this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor.update(bArr, 0, digestSize);
        byte[] bArr3 = this.unwrapAs;
        if (bArr3 == null) {
            bArr3 = new byte[this.getOutputStallDuration];
            this.getOutputSizes.nextBytes(bArr3);
        }
        this.getHighSpeedVideoFpsRangesFor.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr4, 0);
        int i = this.getValidOutputFormatsForInputhNQ4ISI == 188 ? 1 : 2;
        byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = bArr5.length;
        int i2 = this.getInputSizeshNQ4ISI;
        int length2 = (((length - i2) - bArr3.length) - this.getHighSpeedVideoSizes) - i;
        bArr5[length2 - 1] = 1;
        java.lang.System.arraycopy(this.getInputFormats, 0, bArr5, length2, i2);
        java.lang.System.arraycopy(bArr3, 0, this.getHighResolutionOutputSizeshNQ4ISI, length2 + this.getInputSizeshNQ4ISI, bArr3.length);
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr4, 0, digestSize2, (this.getHighResolutionOutputSizeshNQ4ISI.length - this.getHighSpeedVideoSizes) - i);
        for (int i3 = 0; i3 != highSpeedVideoSizes.length; i3++) {
            byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr6[i3] = (byte) (bArr6[i3] ^ highSpeedVideoSizes[i3]);
        }
        byte[] bArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
        int length3 = bArr7.length;
        int i4 = this.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(bArr4, 0, bArr7, (length3 - i4) - i, i4);
        int i5 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i5 == 188) {
            byte[] bArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr8[bArr8.length - 1] = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr9[bArr9.length - 2] = (byte) (i5 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i5;
        }
        byte[] bArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
        bArr10[0] = (byte) (bArr10[0] & Byte.MAX_VALUE);
        byte[] processBlock = this.getHighSpeedVideoFpsRanges.processBlock(bArr10, 0, bArr10.length);
        int i6 = this.getInputSizeshNQ4ISI;
        byte[] bArr11 = new byte[i6];
        this.getOutputSizeshNQ4ISI = bArr11;
        byte[] bArr12 = this.getInputFormats;
        this.Camera2StreamConfigurationMap = i6 <= bArr12.length;
        java.lang.System.arraycopy(bArr12, 0, bArr11, 0, i6);
        byte[] bArr13 = this.getInputFormats;
        for (int i7 = 0; i7 != bArr13.length; i7++) {
            bArr13[i7] = 0;
        }
        byte[] bArr14 = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i8 = 0; i8 != bArr14.length; i8++) {
            bArr14[i8] = 0;
        }
        this.getInputSizeshNQ4ISI = 0;
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getInputSizeshNQ4ISI = 0;
        byte[] bArr = this.getInputFormats;
        if (bArr != null) {
            for (int i = 0; i != bArr.length; i++) {
                bArr[i] = 0;
            }
        }
        byte[] bArr2 = this.getOutputSizeshNQ4ISI;
        if (bArr2 != null) {
            for (int i2 = 0; i2 != bArr2.length; i2++) {
                bArr2[i2] = 0;
            }
            this.getOutputSizeshNQ4ISI = null;
        }
        this.Camera2StreamConfigurationMap = false;
        if (this.getOutputStallDurationlomOqCM != null) {
            this.getOutputStallDurationlomOqCM = null;
            byte[] bArr3 = this.getOutputMinFrameDuration;
            for (int i3 = 0; i3 != bArr3.length; i3++) {
                bArr3[i3] = 0;
            }
            this.getOutputMinFrameDuration = null;
        }
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i;
        byte[] processBlock = this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr.length);
        int length = processBlock.length;
        int i2 = (this.getOutputFormats + 7) / 8;
        if (length < i2) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(processBlock, 0, bArr2, i2 - processBlock.length, processBlock.length);
            for (int i3 = 0; i3 != processBlock.length; i3++) {
                processBlock[i3] = 0;
            }
            processBlock = bArr2;
        }
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i4 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            java.lang.Integer trailer = org.bouncycastle.crypto.signers.ISOTrailers.getTrailer(this.getHighSpeedVideoFpsRangesFor);
            if (trailer == null) {
                throw new java.lang.IllegalArgumentException("unrecognised hash in signature");
            }
            int intValue = trailer.intValue();
            if (i4 != intValue && (intValue != 15052 || i4 != 16588)) {
                throw new java.lang.IllegalStateException("signer initialised with wrong digest for trailer ".concat(java.lang.String.valueOf(i4)));
            }
        }
        this.getHighSpeedVideoFpsRangesFor.doFinal(new byte[this.getHighSpeedVideoSizes], 0);
        int length2 = processBlock.length;
        int i5 = this.getHighSpeedVideoSizes;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(processBlock, (length2 - i5) - i, i5, (processBlock.length - i5) - i);
        for (int i6 = 0; i6 != highSpeedVideoSizes.length; i6++) {
            processBlock[i6] = (byte) (processBlock[i6] ^ highSpeedVideoSizes[i6]);
        }
        processBlock[0] = (byte) (processBlock[0] & Byte.MAX_VALUE);
        int i7 = 0;
        while (i7 != processBlock.length && processBlock[i7] != 1) {
            i7++;
        }
        int i8 = i7 + 1;
        if (i8 >= processBlock.length) {
            for (int i9 = 0; i9 != processBlock.length; i9++) {
                processBlock[i9] = 0;
            }
        }
        this.Camera2StreamConfigurationMap = i8 > 1;
        int length3 = (highSpeedVideoSizes.length - i8) - this.getOutputStallDuration;
        byte[] bArr3 = new byte[length3];
        this.getOutputSizeshNQ4ISI = bArr3;
        java.lang.System.arraycopy(processBlock, i8, bArr3, 0, length3);
        byte[] bArr4 = this.getOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr4, 0, this.getInputFormats, 0, bArr4.length);
        this.getOutputStallDurationlomOqCM = bArr;
        this.getOutputMinFrameDuration = processBlock;
        this.getHighSpeedVideoSizesFor = i8;
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr2 = new byte[i];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        byte[] bArr3 = this.getOutputStallDurationlomOqCM;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (java.lang.Exception unused) {
                return false;
            }
        } else if (!org.bouncycastle.util.Arrays.areEqual(bArr3, bArr)) {
            throw new java.lang.IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.getOutputMinFrameDuration;
        int i2 = this.getHighSpeedVideoSizesFor;
        int i3 = this.getOutputMinFrameDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        byte[] bArr5 = new byte[8];
        getHighSpeedVideoSizes(this.getOutputSizeshNQ4ISI.length * 8, bArr5);
        this.getHighSpeedVideoFpsRangesFor.update(bArr5, 0, 8);
        byte[] bArr6 = this.getOutputSizeshNQ4ISI;
        if (bArr6.length != 0) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr6, 0, bArr6.length);
        }
        this.getHighSpeedVideoFpsRangesFor.update(bArr2, 0, i);
        byte[] bArr7 = this.unwrapAs;
        if (bArr7 != null) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr7, 0, bArr7.length);
        } else {
            this.getHighSpeedVideoFpsRangesFor.update(bArr4, i2 + this.getOutputSizeshNQ4ISI.length, this.getOutputStallDuration);
        }
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr8, 0);
        int length = bArr4.length;
        boolean z = true;
        for (int i4 = 0; i4 != digestSize; i4++) {
            if (bArr8[i4] != bArr4[((length - i3) - digestSize) + i4]) {
                z = false;
            }
        }
        for (int i5 = 0; i5 != bArr4.length; i5++) {
            bArr4[i5] = 0;
        }
        for (int i6 = 0; i6 != digestSize; i6++) {
            bArr8[i6] = 0;
        }
        if (!z) {
            this.Camera2StreamConfigurationMap = false;
            this.getInputSizeshNQ4ISI = 0;
            byte[] bArr9 = this.getOutputSizeshNQ4ISI;
            for (int i7 = 0; i7 != bArr9.length; i7++) {
                bArr9[i7] = 0;
            }
            return false;
        }
        int i8 = this.getInputSizeshNQ4ISI;
        if (i8 != 0) {
            byte[] bArr10 = this.getInputFormats;
            byte[] bArr11 = this.getOutputSizeshNQ4ISI;
            boolean z2 = i8 == bArr11.length;
            for (int i9 = 0; i9 != bArr11.length; i9++) {
                if (bArr10[i9] != bArr11[i9]) {
                    z2 = false;
                }
            }
            if (!z2) {
                this.getInputSizeshNQ4ISI = 0;
                byte[] bArr12 = this.getInputFormats;
                for (int i10 = 0; i10 != bArr12.length; i10++) {
                    bArr12[i10] = 0;
                }
                return false;
            }
        }
        this.getInputSizeshNQ4ISI = 0;
        byte[] bArr13 = this.getInputFormats;
        for (int i11 = 0; i11 != bArr13.length; i11++) {
            bArr13[i11] = 0;
        }
        return true;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        if (this.getOutputStallDurationlomOqCM == null) {
            while (i2 > 0 && this.getInputSizeshNQ4ISI < this.getInputFormats.length) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
        if (i2 > 0) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        if (this.getOutputStallDurationlomOqCM == null) {
            int i = this.getInputSizeshNQ4ISI;
            byte[] bArr = this.getInputFormats;
            if (i < bArr.length) {
                this.getInputSizeshNQ4ISI = i + 1;
                bArr[i] = b;
                return;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters;
        java.security.SecureRandom secureRandom;
        int i = this.getOutputStallDuration;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) parametersWithRandom.getParameters();
            if (z) {
                secureRandom = parametersWithRandom.getRandom();
                this.getOutputSizes = secureRandom;
            }
            this.getHighSpeedVideoFpsRanges.init(z, rSAKeyParameters);
            int bitLength = rSAKeyParameters.getModulus().bitLength();
            this.getOutputFormats = bitLength;
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[(bitLength + 7) / 8];
            if (this.getValidOutputFormatsForInputhNQ4ISI != 188) {
                this.getInputFormats = new byte[((r4 - this.getHighSpeedVideoFpsRangesFor.getDigestSize()) - i) - 2];
            } else {
                this.getInputFormats = new byte[((r4 - this.getHighSpeedVideoFpsRangesFor.getDigestSize()) - i) - 3];
            }
            reset();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithSalt) {
            org.bouncycastle.crypto.params.ParametersWithSalt parametersWithSalt = (org.bouncycastle.crypto.params.ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.unwrapAs = salt;
            i = salt.length;
            if (salt.length != this.getOutputStallDuration) {
                throw new java.lang.IllegalArgumentException("Fixed salt is of wrong length");
            }
        } else {
            rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
            if (z) {
                secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
                this.getOutputSizes = secureRandom;
            }
        }
        this.getHighSpeedVideoFpsRanges.init(z, rSAKeyParameters);
        int bitLength2 = rSAKeyParameters.getModulus().bitLength();
        this.getOutputFormats = bitLength2;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[(bitLength2 + 7) / 8];
        if (this.getValidOutputFormatsForInputhNQ4ISI != 188) {
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.getOutputSizeshNQ4ISI;
    }

    private static void getHighSpeedVideoSizes(long j, byte[] bArr) {
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        bArr[4] = (byte) (j >>> 24);
        bArr[5] = (byte) (j >>> 16);
        bArr[6] = (byte) (j >>> 8);
        bArr[7] = (byte) j;
    }

    public ISO9796d2PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, int i, boolean z) {
        int intValue;
        this.getHighSpeedVideoFpsRanges = asymmetricBlockCipher;
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoSizes = digest.getDigestSize();
        this.getOutputStallDuration = i;
        if (z) {
            intValue = 188;
        } else {
            java.lang.Integer trailer = org.bouncycastle.crypto.signers.ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no valid trailer for digest: ");
                sb.append(digest.getAlgorithmName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            intValue = trailer.intValue();
        }
        this.getValidOutputFormatsForInputhNQ4ISI = intValue;
    }

    public ISO9796d2PSSSigner(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, int i) {
        this(asymmetricBlockCipher, digest, i, false);
    }
}
