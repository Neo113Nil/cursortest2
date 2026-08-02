package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ISO9796d2Signer implements org.bouncycastle.crypto.SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;

    private boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        this.getOutputFormats = 0;
        byte[] bArr2 = this.getOutputMinFrameDuration;
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = 0;
        }
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException {
        int length;
        int i;
        int i2;
        int i3;
        int digestSize = this.getHighSpeedVideoSizes.getDigestSize();
        if (this.getOutputMinFrameDurationlomOqCM == 188) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            length = (bArr.length - digestSize) - 1;
            this.getHighSpeedVideoSizes.doFinal(bArr, length);
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            bArr2[bArr2.length - 1] = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
            i = 8;
        } else {
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            length = (bArr3.length - digestSize) - 2;
            this.getHighSpeedVideoSizes.doFinal(bArr3, length);
            byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
            int length2 = bArr4.length;
            int i4 = this.getOutputMinFrameDurationlomOqCM;
            bArr4[length2 - 2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i = 16;
        }
        int i5 = this.getOutputFormats;
        int i6 = ((((digestSize + i5) * 8) + i) + 4) - this.getHighSpeedVideoFpsRanges;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            i2 = length - i7;
            java.lang.System.arraycopy(this.getOutputMinFrameDuration, 0, this.getHighSpeedVideoFpsRangesFor, i2, i7);
            this.getInputFormats = new byte[i7];
            i3 = 96;
        } else {
            i2 = length - i5;
            java.lang.System.arraycopy(this.getOutputMinFrameDuration, 0, this.getHighSpeedVideoFpsRangesFor, i2, i5);
            this.getInputFormats = new byte[this.getOutputFormats];
            i3 = 64;
        }
        int i8 = i2 - 1;
        if (i8 > 0) {
            for (int i9 = i8; i9 != 0; i9--) {
                this.getHighSpeedVideoFpsRangesFor[i9] = -69;
            }
            byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
            bArr5[i8] = (byte) (bArr5[i8] ^ 1);
            bArr5[0] = com.google.common.base.Ascii.VT;
            bArr5[0] = (byte) (i3 | 11);
        } else {
            byte[] bArr6 = this.getHighSpeedVideoFpsRangesFor;
            bArr6[0] = 10;
            bArr6[0] = (byte) (i3 | 10);
        }
        org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr7 = this.getHighSpeedVideoFpsRangesFor;
        byte[] processBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.Camera2StreamConfigurationMap = (i3 & 32) == 0;
        byte[] bArr8 = this.getOutputMinFrameDuration;
        byte[] bArr9 = this.getInputFormats;
        java.lang.System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.getOutputFormats = 0;
        byte[] bArr10 = this.getOutputMinFrameDuration;
        for (int i10 = 0; i10 != bArr10.length; i10++) {
            bArr10[i10] = 0;
        }
        byte[] bArr11 = this.getHighSpeedVideoFpsRangesFor;
        for (int i11 = 0; i11 != bArr11.length; i11++) {
            bArr11[i11] = 0;
        }
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoSizes.reset();
        this.getOutputFormats = 0;
        byte[] bArr = this.getOutputMinFrameDuration;
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
        byte[] bArr2 = this.getInputFormats;
        if (bArr2 != null) {
            for (int i2 = 0; i2 != bArr2.length; i2++) {
                bArr2[i2] = 0;
            }
        }
        this.getInputFormats = null;
        this.Camera2StreamConfigurationMap = false;
        if (this.getHighSpeedVideoSizesFor != null) {
            this.getHighSpeedVideoSizesFor = null;
            byte[] bArr3 = this.getInputSizeshNQ4ISI;
            for (int i3 = 0; i3 != bArr3.length; i3++) {
                bArr3[i3] = 0;
            }
            this.getInputSizeshNQ4ISI = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        int i;
        boolean z;
        byte[] bArr2 = this.getHighSpeedVideoSizesFor;
        if (bArr2 == null) {
            try {
                processBlock = this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr, 0, bArr.length);
            } catch (java.lang.Exception unused) {
                return false;
            }
        } else {
            if (!org.bouncycastle.util.Arrays.areEqual(bArr2, bArr)) {
                throw new java.lang.IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            processBlock = this.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizesFor = null;
            this.getInputSizeshNQ4ISI = null;
        }
        if (((processBlock[0] & com.visa.cbp.getEncExpo.startTransaction) ^ 64) == 0 && ((processBlock[processBlock.length - 1] & com.google.common.base.Ascii.SI) ^ 12) == 0) {
            if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                i = 2;
                int i2 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
                java.lang.Integer trailer = org.bouncycastle.crypto.signers.ISOTrailers.getTrailer(this.getHighSpeedVideoSizes);
                if (trailer == null) {
                    throw new java.lang.IllegalArgumentException("unrecognised hash in signature");
                }
                int intValue = trailer.intValue();
                if (i2 != intValue && (intValue != 15052 || i2 != 16588)) {
                    throw new java.lang.IllegalStateException("signer initialised with wrong digest for trailer ".concat(java.lang.String.valueOf(i2)));
                }
            }
            int i3 = 0;
            while (i3 != processBlock.length && ((processBlock[i3] & com.google.common.base.Ascii.SI) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            int digestSize = this.getHighSpeedVideoSizes.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (processBlock.length - i) - digestSize;
            int i5 = length - i4;
            if (i5 <= 0) {
                return getHighResolutionOutputSizeshNQ4ISI(processBlock);
            }
            if ((processBlock[0] & 32) == 0) {
                this.Camera2StreamConfigurationMap = true;
                if (this.getOutputFormats > i5) {
                    return getHighResolutionOutputSizeshNQ4ISI(processBlock);
                }
                this.getHighSpeedVideoSizes.reset();
                this.getHighSpeedVideoSizes.update(processBlock, i4, i5);
                this.getHighSpeedVideoSizes.doFinal(bArr3, 0);
                boolean z2 = true;
                for (int i6 = 0; i6 != digestSize; i6++) {
                    int i7 = length + i6;
                    byte b = (byte) (processBlock[i7] ^ bArr3[i6]);
                    processBlock[i7] = b;
                    if (b != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return getHighResolutionOutputSizeshNQ4ISI(processBlock);
                }
                byte[] bArr4 = new byte[i5];
                this.getInputFormats = bArr4;
                java.lang.System.arraycopy(processBlock, i4, bArr4, 0, i5);
            } else {
                this.Camera2StreamConfigurationMap = false;
                this.getHighSpeedVideoSizes.doFinal(bArr3, 0);
                boolean z3 = true;
                for (int i8 = 0; i8 != digestSize; i8++) {
                    int i9 = length + i8;
                    byte b2 = (byte) (processBlock[i9] ^ bArr3[i8]);
                    processBlock[i9] = b2;
                    if (b2 != 0) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    return getHighResolutionOutputSizeshNQ4ISI(processBlock);
                }
                byte[] bArr5 = new byte[i5];
                this.getInputFormats = bArr5;
                java.lang.System.arraycopy(processBlock, i4, bArr5, 0, i5);
            }
            int i10 = this.getOutputFormats;
            if (i10 != 0) {
                byte[] bArr6 = this.getOutputMinFrameDuration;
                byte[] bArr7 = this.getInputFormats;
                if (i10 > bArr6.length) {
                    z = bArr6.length <= bArr7.length;
                    for (int i11 = 0; i11 != this.getOutputMinFrameDuration.length; i11++) {
                        if (bArr6[i11] != bArr7[i11]) {
                            z = false;
                        }
                    }
                } else {
                    z = i10 == bArr7.length;
                    for (int i12 = 0; i12 != bArr7.length; i12++) {
                        if (bArr6[i12] != bArr7[i12]) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    return getHighResolutionOutputSizeshNQ4ISI(processBlock);
                }
            }
            byte[] bArr8 = this.getOutputMinFrameDuration;
            for (int i13 = 0; i13 != bArr8.length; i13++) {
                bArr8[i13] = 0;
            }
            for (int i14 = 0; i14 != processBlock.length; i14++) {
                processBlock[i14] = 0;
            }
            this.getOutputFormats = 0;
            return true;
        }
        return getHighResolutionOutputSizeshNQ4ISI(processBlock);
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i;
        byte[] processBlock = this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr, 0, bArr.length);
        if (((processBlock[0] & com.visa.cbp.getEncExpo.startTransaction) ^ 64) != 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("malformed signature");
        }
        if (((processBlock[processBlock.length - 1] & com.google.common.base.Ascii.SI) ^ 12) != 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("malformed signature");
        }
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i2 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            java.lang.Integer trailer = org.bouncycastle.crypto.signers.ISOTrailers.getTrailer(this.getHighSpeedVideoSizes);
            if (trailer == null) {
                throw new java.lang.IllegalArgumentException("unrecognised hash in signature");
            }
            int intValue = trailer.intValue();
            if (i2 != intValue && (intValue != 15052 || i2 != 16588)) {
                throw new java.lang.IllegalStateException("signer initialised with wrong digest for trailer ".concat(java.lang.String.valueOf(i2)));
            }
        }
        int i3 = 0;
        while (i3 != processBlock.length && ((processBlock[i3] & com.google.common.base.Ascii.SI) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int length = ((processBlock.length - i) - this.getHighSpeedVideoSizes.getDigestSize()) - i4;
        if (length <= 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("malformed block");
        }
        if ((processBlock[0] & 32) == 0) {
            this.Camera2StreamConfigurationMap = true;
            byte[] bArr2 = new byte[length];
            this.getInputFormats = bArr2;
            java.lang.System.arraycopy(processBlock, i4, bArr2, 0, length);
        } else {
            this.Camera2StreamConfigurationMap = false;
            byte[] bArr3 = new byte[length];
            this.getInputFormats = bArr3;
            java.lang.System.arraycopy(processBlock, i4, bArr3, 0, length);
        }
        this.getHighSpeedVideoSizesFor = bArr;
        this.getInputSizeshNQ4ISI = processBlock;
        org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoSizes;
        byte[] bArr4 = this.getInputFormats;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.getInputFormats;
        this.getOutputFormats = bArr5.length;
        java.lang.System.arraycopy(bArr5, 0, this.getOutputMinFrameDuration, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.getOutputFormats < this.getOutputMinFrameDuration.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.getHighSpeedVideoSizes.update(bArr, i, i2);
        this.getOutputFormats += i2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoSizes.update(b);
        int i = this.getOutputFormats;
        byte[] bArr = this.getOutputMinFrameDuration;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.getOutputFormats = i + 1;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(z, rSAKeyParameters);
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        this.getHighSpeedVideoFpsRanges = bitLength;
        this.getHighSpeedVideoFpsRangesFor = new byte[(bitLength + 7) / 8];
        if (this.getOutputMinFrameDurationlomOqCM == 188) {
            this.getOutputMinFrameDuration = new byte[(r2 - this.getHighSpeedVideoSizes.getDigestSize()) - 2];
        } else {
            this.getOutputMinFrameDuration = new byte[(r2 - this.getHighSpeedVideoSizes.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.getInputFormats;
    }

    public ISO9796d2Signer(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, boolean z) {
        int intValue;
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
        this.getHighSpeedVideoSizes = digest;
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
        this.getOutputMinFrameDurationlomOqCM = intValue;
    }

    public ISO9796d2Signer(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}
