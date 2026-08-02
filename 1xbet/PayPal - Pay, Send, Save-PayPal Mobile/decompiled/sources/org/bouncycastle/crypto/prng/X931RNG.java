package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class X931RNG {
    long Camera2StreamConfigurationMap = 1;
    byte[] getHighResolutionOutputSizeshNQ4ISI;
    final org.bouncycastle.crypto.prng.EntropySource getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizes;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputMinFrameDuration;

    final int Camera2StreamConfigurationMap(byte[] bArr, boolean z) {
        if (this.getInputSizeshNQ4ISI.length == 8) {
            if (this.Camera2StreamConfigurationMap > 32768) {
                return -1;
            }
            if (bArr != null && bArr.length > 512) {
                throw new java.lang.IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.Camera2StreamConfigurationMap > 8388608) {
                return -1;
            }
            if (bArr != null && bArr.length > 32768) {
                throw new java.lang.IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z || this.getHighResolutionOutputSizeshNQ4ISI == null) {
            byte[] entropy = this.getHighSpeedVideoFpsRanges.getEntropy();
            this.getHighResolutionOutputSizeshNQ4ISI = entropy;
            if (entropy.length != this.getHighSpeedVideoSizes.getBlockSize()) {
                throw new java.lang.IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / this.getInputSizeshNQ4ISI.length;
        for (int i = 0; i < length; i++) {
            this.getHighSpeedVideoSizes.processBlock(this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputMinFrameDuration, 0);
            getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr2, 0, bArr, bArr2.length * i, bArr2.length);
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                byte b = (byte) (bArr3[length2] + 1);
                bArr3[length2] = b;
                if (b == 0) {
                }
            }
        }
        int length3 = bArr.length - (this.getInputSizeshNQ4ISI.length * length);
        if (length3 > 0) {
            this.getHighSpeedVideoSizes.processBlock(this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputMinFrameDuration, 0);
            getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
            byte[] bArr4 = this.getInputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr4, 0, bArr, length * bArr4.length, length3);
            byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
            for (int length4 = bArr5.length - 1; length4 >= 0; length4--) {
                byte b2 = (byte) (bArr5[length4] + 1);
                bArr5[length4] = b2;
                if (b2 != 0) {
                    break;
                }
            }
        }
        this.Camera2StreamConfigurationMap++;
        return bArr.length;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.getHighSpeedVideoSizes.processBlock(bArr, 0, bArr, 0);
    }

    public X931RNG(org.bouncycastle.crypto.BlockCipher blockCipher, byte[] bArr, org.bouncycastle.crypto.prng.EntropySource entropySource) {
        this.getHighSpeedVideoSizes = blockCipher;
        this.getHighSpeedVideoFpsRanges = entropySource;
        int blockSize = blockCipher.getBlockSize();
        byte[] bArr2 = new byte[blockSize];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, blockSize);
        this.getOutputMinFrameDuration = new byte[blockCipher.getBlockSize()];
        this.getInputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
    }
}
