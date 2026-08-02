package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
public class HMacSP800DRBG implements org.bouncycastle.crypto.prng.drbg.SP80090DRBG {
    private byte[] Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.prng.EntropySource getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Mac getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getInputFormats;

    public HMacSP800DRBG(org.bouncycastle.crypto.Mac mac, int i, org.bouncycastle.crypto.prng.EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i > org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(mac)) {
            throw new java.lang.IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (entropySource.entropySize() < i) {
            throw new java.lang.IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRanges = entropySource;
        this.getHighSpeedVideoFpsRangesFor = mac;
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(getHighResolutionOutputSizeshNQ4ISI(), bArr2, bArr);
        int macSize = mac.getMacSize();
        this.Camera2StreamConfigurationMap = new byte[macSize];
        byte[] bArr3 = new byte[macSize];
        this.getHighSpeedVideoSizes = bArr3;
        org.bouncycastle.util.Arrays.fill(bArr3, (byte) 1);
        getHighSpeedVideoFpsRanges(concatenate, (byte) 0);
        if (concatenate != null) {
            getHighSpeedVideoFpsRanges(concatenate, (byte) 1);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 1L;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new java.lang.IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI > 140737488355328L) {
            return -1;
        }
        if (z) {
            reseed(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            getHighSpeedVideoFpsRanges(bArr2, (byte) 0);
            if (bArr2 != null) {
                getHighSpeedVideoFpsRanges(bArr2, (byte) 1);
            }
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / this.getHighSpeedVideoSizes.length;
        this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.KeyParameter(this.Camera2StreamConfigurationMap));
        for (int i = 0; i < length3; i++) {
            org.bouncycastle.crypto.Mac mac = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            mac.update(bArr4, 0, bArr4.length);
            this.getHighSpeedVideoFpsRangesFor.doFinal(this.getHighSpeedVideoSizes, 0);
            byte[] bArr5 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
        }
        byte[] bArr6 = this.getHighSpeedVideoSizes;
        if (bArr6.length * length3 < length2) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr6, 0, bArr6.length);
            this.getHighSpeedVideoFpsRangesFor.doFinal(this.getHighSpeedVideoSizes, 0);
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
        }
        getHighSpeedVideoFpsRanges(bArr2, (byte) 0);
        if (bArr2 != null) {
            getHighSpeedVideoFpsRanges(bArr2, (byte) 1);
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
        java.lang.System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(getHighResolutionOutputSizeshNQ4ISI(), bArr);
        getHighSpeedVideoFpsRanges(concatenate, (byte) 0);
        if (concatenate != null) {
            getHighSpeedVideoFpsRanges(concatenate, (byte) 1);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 1L;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.getHighSpeedVideoSizes.length * 8;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte b) {
        this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.KeyParameter(this.Camera2StreamConfigurationMap));
        org.bouncycastle.crypto.Mac mac = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        mac.update(bArr2, 0, bArr2.length);
        this.getHighSpeedVideoFpsRangesFor.update(b);
        if (bArr != null) {
            this.getHighSpeedVideoFpsRangesFor.update(bArr, 0, bArr.length);
        }
        this.getHighSpeedVideoFpsRangesFor.doFinal(this.Camera2StreamConfigurationMap, 0);
        this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.KeyParameter(this.Camera2StreamConfigurationMap));
        org.bouncycastle.crypto.Mac mac2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        mac2.update(bArr3, 0, bArr3.length);
        this.getHighSpeedVideoFpsRangesFor.doFinal(this.getHighSpeedVideoSizes, 0);
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() {
        byte[] entropy = this.getHighSpeedVideoFpsRanges.getEntropy();
        if (entropy.length >= (this.getInputFormats + 7) / 8) {
            return entropy;
        }
        throw new java.lang.IllegalStateException("Insufficient entropy provided by entropy source");
    }
}
