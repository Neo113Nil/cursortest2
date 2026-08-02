package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
public class HashSP800DRBG implements org.bouncycastle.crypto.prng.drbg.SP80090DRBG {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {1};
    private static final java.util.Hashtable getHighSpeedVideoFpsRanges;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;
    private long getInputFormats;
    private int getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.prng.EntropySource getOutputFormats;
    private int getOutputMinFrameDuration;

    private byte[] getHighSpeedVideoSizes(byte[] bArr) {
        byte[] bArr2 = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new java.lang.IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.getInputFormats > 140737488355328L) {
            return -1;
        }
        byte[] bArr3 = bArr2;
        if (z) {
            reseed(bArr3);
            bArr3 = null;
        }
        if (bArr3 != null) {
            byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr5 = new byte[bArr4.length + 1 + bArr3.length];
            bArr5[0] = 2;
            java.lang.System.arraycopy(bArr4, 0, bArr5, 1, bArr4.length);
            java.lang.System.arraycopy(bArr3, 0, bArr5, this.getHighSpeedVideoFpsRangesFor.length + 1, bArr3.length);
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(bArr5));
        }
        byte[] bArr6 = this.getHighSpeedVideoFpsRangesFor;
        int i = length / 8;
        int digestSize = i / this.getHighSpeedVideoSizes.getDigestSize();
        int length2 = bArr6.length;
        byte[] bArr7 = new byte[length2];
        java.lang.System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        byte[] bArr8 = new byte[i];
        int digestSize2 = this.getHighSpeedVideoSizes.getDigestSize();
        byte[] bArr9 = new byte[digestSize2];
        for (int i2 = 0; i2 <= digestSize; i2++) {
            this.getHighSpeedVideoSizes.update(bArr7, 0, length2);
            this.getHighSpeedVideoSizes.doFinal(bArr9, 0);
            int i3 = i2 * digestSize2;
            int i4 = i - i3;
            if (i4 > digestSize2) {
                i4 = digestSize2;
            }
            java.lang.System.arraycopy(bArr9, 0, bArr8, i3, i4);
            getHighSpeedVideoFpsRangesFor(bArr7, getHighResolutionOutputSizeshNQ4ISI);
        }
        byte[] bArr10 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr11 = new byte[bArr10.length + 1];
        java.lang.System.arraycopy(bArr10, 0, bArr11, 1, bArr10.length);
        bArr11[0] = 3;
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes(bArr11));
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, new byte[]{(byte) (r8 >> 24), (byte) (r8 >> 16), (byte) (r8 >> 8), (byte) this.getInputFormats});
        this.getInputFormats++;
        java.lang.System.arraycopy(bArr8, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] highSpeedVideoSizes = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, org.bouncycastle.util.Arrays.concatenate(getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap(), bArr), this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
        byte[] bArr2 = new byte[highSpeedVideoSizes.length + 1];
        bArr2[0] = 0;
        java.lang.System.arraycopy(highSpeedVideoSizes, 0, bArr2, 1, highSpeedVideoSizes.length);
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, bArr2, this.getInputSizeshNQ4ISI);
        this.getInputFormats = 1L;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.getHighSpeedVideoSizes.getDigestSize() * 8;
    }

    private byte[] Camera2StreamConfigurationMap() {
        byte[] entropy = this.getOutputFormats.getEntropy();
        if (entropy.length >= (this.getOutputMinFrameDuration + 7) / 8) {
            return entropy;
        }
        throw new java.lang.IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    public HashSP800DRBG(org.bouncycastle.crypto.Digest digest, int i, org.bouncycastle.crypto.prng.EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i > org.bouncycastle.crypto.prng.drbg.Utils.Camera2StreamConfigurationMap(digest)) {
            throw new java.lang.IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (entropySource.entropySize() < i) {
            throw new java.lang.IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.getHighSpeedVideoSizes = digest;
        this.getOutputFormats = entropySource;
        this.getOutputMinFrameDuration = i;
        this.getInputSizeshNQ4ISI = ((java.lang.Integer) getHighSpeedVideoFpsRanges.get(digest.getAlgorithmName())).intValue();
        byte[] highSpeedVideoSizes = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, org.bouncycastle.util.Arrays.concatenate(Camera2StreamConfigurationMap(), bArr2, bArr), this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
        byte[] bArr3 = new byte[highSpeedVideoSizes.length + 1];
        java.lang.System.arraycopy(highSpeedVideoSizes, 0, bArr3, 1, highSpeedVideoSizes.length);
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, bArr3, this.getInputSizeshNQ4ISI);
        this.getInputFormats = 1L;
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRanges = hashtable;
        hashtable.put("SHA-1", org.bouncycastle.util.Integers.valueOf(440));
        hashtable.put("SHA-224", org.bouncycastle.util.Integers.valueOf(440));
        hashtable.put("SHA-256", org.bouncycastle.util.Integers.valueOf(440));
        hashtable.put("SHA-512/256", org.bouncycastle.util.Integers.valueOf(440));
        hashtable.put(org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224, org.bouncycastle.util.Integers.valueOf(440));
        hashtable.put("SHA-384", org.bouncycastle.util.Integers.valueOf(888));
        hashtable.put("SHA-512", org.bouncycastle.util.Integers.valueOf(888));
    }
}
