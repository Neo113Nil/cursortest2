package org.bouncycastle.crypto.encodings;

/* loaded from: classes17.dex */
public class OAEPEncoding implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        return this.Camera2StreamConfigurationMap ? encodeBlock(bArr, i, i2) : decodeBlock(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoSizes = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getRandom() : org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighSpeedVideoFpsRangesFor.init(z, cipherParameters);
        this.Camera2StreamConfigurationMap = z;
    }

    public org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.getHighSpeedVideoFpsRangesFor.getOutputBlockSize();
        return this.Camera2StreamConfigurationMap ? outputBlockSize : (outputBlockSize - 1) - (this.getHighSpeedVideoFpsRanges.length * 2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.getHighSpeedVideoFpsRangesFor.getInputBlockSize();
        return this.Camera2StreamConfigurationMap ? (inputBlockSize - 1) - (this.getHighSpeedVideoFpsRanges.length * 2) : inputBlockSize;
    }

    public byte[] encodeBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (i2 > getInputBlockSize()) {
            throw new org.bouncycastle.crypto.DataLengthException("input data too long");
        }
        int inputBlockSize = getInputBlockSize() + 1 + (this.getHighSpeedVideoFpsRanges.length * 2);
        byte[] bArr2 = new byte[inputBlockSize];
        int i3 = inputBlockSize - i2;
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
        bArr2[i3 - 1] = 1;
        byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length = this.getHighSpeedVideoFpsRanges.length;
        byte[] bArr4 = new byte[length];
        this.getHighSpeedVideoSizes.nextBytes(bArr4);
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr4, 0, length, inputBlockSize - this.getHighSpeedVideoFpsRanges.length);
        for (int length2 = this.getHighSpeedVideoFpsRanges.length; length2 != inputBlockSize; length2++) {
            bArr2[length2] = (byte) (bArr2[length2] ^ highSpeedVideoFpsRangesFor[length2 - this.getHighSpeedVideoFpsRanges.length]);
        }
        java.lang.System.arraycopy(bArr4, 0, bArr2, 0, this.getHighSpeedVideoFpsRanges.length);
        byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
        for (int i4 = 0; i4 != this.getHighSpeedVideoFpsRanges.length; i4++) {
            bArr2[i4] = (byte) (bArr2[i4] ^ highSpeedVideoFpsRangesFor2[i4]);
        }
        return this.getHighSpeedVideoFpsRangesFor.processBlock(bArr2, 0, inputBlockSize);
    }

    public byte[] decodeBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] processBlock = this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i, i2);
        int outputBlockSize = this.getHighSpeedVideoFpsRangesFor.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        boolean z = outputBlockSize < (this.getHighSpeedVideoFpsRanges.length * 2) + 1;
        if (processBlock.length <= outputBlockSize) {
            java.lang.System.arraycopy(processBlock, 0, bArr4, outputBlockSize - processBlock.length, processBlock.length);
        } else {
            java.lang.System.arraycopy(processBlock, 0, bArr4, 0, outputBlockSize);
            z = true;
        }
        byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.getHighSpeedVideoFpsRanges;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ highSpeedVideoFpsRangesFor[i3]);
            i3++;
        }
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length = this.getHighSpeedVideoFpsRanges.length; length != outputBlockSize; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ highSpeedVideoFpsRangesFor2[length - this.getHighSpeedVideoFpsRanges.length]);
        }
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            bArr3 = this.getHighSpeedVideoFpsRanges;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                z2 = true;
            }
            i4++;
        }
        int i5 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((bArr4[length2] != 0) & (i5 == outputBlockSize)) {
                i5 = length2;
            }
        }
        boolean z3 = i5 > outputBlockSize + (-1);
        boolean z4 = bArr4[i5] != 1;
        int i6 = i5 + 1;
        if ((z3 | z4) || (z | z2)) {
            org.bouncycastle.util.Arrays.fill(bArr4, (byte) 0);
            throw new org.bouncycastle.crypto.InvalidCipherTextException("data wrong");
        }
        int i7 = outputBlockSize - i6;
        byte[] bArr6 = new byte[i7];
        java.lang.System.arraycopy(bArr4, i6, bArr6, 0, i7);
        org.bouncycastle.util.Arrays.fill(bArr4, (byte) 0);
        return bArr6;
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int digestSize = this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        int i4 = 0;
        while (i4 < i3 / digestSize) {
            org.bouncycastle.util.Pack.intToBigEndian(i4, bArr4, 0);
            this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI.update(bArr4, 0, 4);
            this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i4 * digestSize, digestSize);
            i4++;
        }
        int i5 = digestSize * i4;
        if (i5 < i3) {
            org.bouncycastle.util.Pack.intToBigEndian(i4, bArr4, 0);
            this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI.update(bArr4, 0, 4);
            this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    public OAEPEncoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }

    public OAEPEncoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = asymmetricBlockCipher;
        this.getHighResolutionOutputSizeshNQ4ISI = digest2;
        this.getHighSpeedVideoFpsRanges = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.getHighSpeedVideoFpsRanges, 0);
    }

    public OAEPEncoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, org.bouncycastle.crypto.util.DigestFactory.createSHA1(), null);
    }
}
