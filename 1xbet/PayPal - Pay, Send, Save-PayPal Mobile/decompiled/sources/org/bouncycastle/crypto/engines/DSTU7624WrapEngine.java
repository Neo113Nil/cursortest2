package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class DSTU7624WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.util.ArrayList<byte[]> getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.engines.DSTU7624Engine getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("not set for unwrapping");
        }
        if (i2 % this.getHighSpeedVideoFpsRangesFor.getBlockSize() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unwrap data must be a multiple of ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.getBlockSize());
            sb.append(" bytes");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        int blockSize = (i2 * 2) / this.getHighSpeedVideoFpsRangesFor.getBlockSize();
        int i3 = blockSize - 1;
        int i4 = i3 * 6;
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        this.getHighSpeedVideoFpsRanges.clear();
        int blockSize2 = i2 - (this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        int blockSize3 = this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        while (blockSize2 != 0) {
            byte[] bArr4 = new byte[this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2];
            java.lang.System.arraycopy(bArr2, blockSize3, bArr4, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            this.getHighSpeedVideoFpsRanges.add(bArr4);
            blockSize2 -= this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
            blockSize3 += this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(blockSize - 2), 0, bArr2, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            java.lang.System.arraycopy(bArr3, 0, bArr2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            int i6 = i4 - i5;
            byte[] bArr5 = this.getOutputFormats;
            bArr5[3] = (byte) (i6 >> 24);
            bArr5[2] = (byte) (i6 >> 16);
            bArr5[1] = (byte) (i6 >> 8);
            bArr5[0] = (byte) i6;
            for (int i7 = 0; i7 < 4; i7++) {
                int blockSize4 = (this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2) + i7;
                bArr2[blockSize4] = (byte) (bArr2[blockSize4] ^ this.getOutputFormats[i7]);
            }
            this.getHighSpeedVideoFpsRangesFor.processBlock(bArr2, 0, bArr2, 0);
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            for (int i8 = 2; i8 < blockSize; i8++) {
                int i9 = blockSize - i8;
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(i9 - 1), 0, this.getHighSpeedVideoFpsRanges.get(i9), 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            }
            java.lang.System.arraycopy(bArr2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2, this.getHighSpeedVideoFpsRanges.get(0), 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        }
        java.lang.System.arraycopy(bArr3, 0, bArr2, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        int blockSize5 = this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        for (int i10 = 0; i10 < i3; i10++) {
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(i10), 0, bArr2, blockSize5, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            blockSize5 += this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        }
        java.lang.System.arraycopy(bArr2, i2 - this.getHighSpeedVideoFpsRangesFor.getBlockSize(), this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize());
        byte[] bArr6 = new byte[i2 - this.getHighSpeedVideoFpsRangesFor.getBlockSize()];
        if (!org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration)) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("checksum failed");
        }
        java.lang.System.arraycopy(bArr2, 0, bArr6, 0, i2 - this.getHighSpeedVideoFpsRangesFor.getBlockSize());
        return bArr6;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("not set for wrapping");
        }
        if (i2 % this.getHighSpeedVideoFpsRangesFor.getBlockSize() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("wrap data must be a multiple of ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.getBlockSize());
            sb.append(" bytes");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        int blockSize = ((i2 / this.getHighSpeedVideoFpsRangesFor.getBlockSize()) + 1) * 2;
        int i3 = blockSize - 1;
        int blockSize2 = this.getHighSpeedVideoFpsRangesFor.getBlockSize() + i2;
        byte[] bArr2 = new byte[blockSize2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        java.lang.System.arraycopy(bArr2, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        this.getHighSpeedVideoFpsRanges.clear();
        int blockSize3 = blockSize2 - (this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        int blockSize4 = this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2];
            java.lang.System.arraycopy(bArr2, blockSize4, bArr3, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            this.getHighSpeedVideoFpsRanges.add(bArr3);
            blockSize3 -= this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
            blockSize4 += this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        }
        int i4 = 0;
        while (i4 < i3 * 6) {
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr2, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(0), 0, bArr2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            this.getHighSpeedVideoFpsRangesFor.processBlock(bArr2, 0, bArr2, 0);
            i4++;
            byte[] bArr4 = this.getOutputFormats;
            bArr4[3] = (byte) (i4 >> 24);
            bArr4[2] = (byte) (i4 >> 16);
            bArr4[1] = (byte) (i4 >> 8);
            bArr4[0] = (byte) i4;
            for (int i5 = 0; i5 < 4; i5++) {
                int blockSize5 = (this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2) + i5;
                bArr2[blockSize5] = (byte) (bArr2[blockSize5] ^ this.getOutputFormats[i5]);
            }
            java.lang.System.arraycopy(bArr2, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2, this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            for (int i6 = 2; i6 < blockSize; i6++) {
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(i6 - 1), 0, this.getHighSpeedVideoFpsRanges.get(i6 - 2), 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            }
            java.lang.System.arraycopy(bArr2, 0, this.getHighSpeedVideoFpsRanges.get(blockSize - 2), 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        }
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr2, 0, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
        int blockSize6 = this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        for (int i7 = 0; i7 < i3; i7++) {
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges.get(i7), 0, bArr2, blockSize6, this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2);
            blockSize6 += this.getHighSpeedVideoFpsRangesFor.getBlockSize() / 2;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        this.getHighSpeedVideoSizes = z;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
        }
        this.getHighSpeedVideoFpsRangesFor.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    public DSTU7624WrapEngine(int i) {
        org.bouncycastle.crypto.engines.DSTU7624Engine dSTU7624Engine = new org.bouncycastle.crypto.engines.DSTU7624Engine(i);
        this.getHighSpeedVideoFpsRangesFor = dSTU7624Engine;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[dSTU7624Engine.getBlockSize() / 2];
        this.Camera2StreamConfigurationMap = new byte[this.getHighSpeedVideoFpsRangesFor.getBlockSize()];
        this.getOutputMinFrameDuration = new byte[this.getHighSpeedVideoFpsRangesFor.getBlockSize()];
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
        this.getOutputFormats = new byte[4];
    }
}
