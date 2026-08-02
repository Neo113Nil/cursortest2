package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class KDFDoublePipelineIterationParameters implements org.bouncycastle.crypto.DerivationParameters {
    private final boolean Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public final boolean useCounter() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getR() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final byte[] getKI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getFixedInputData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public static org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i) {
        return new org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters(bArr, bArr2, i, true);
    }

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        if (bArr2 == null) {
            this.getHighSpeedVideoSizes = new byte[0];
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr2);
        }
        if (i != 8 && i != 16 && i != 24 && i != 32) {
            throw new java.lang.IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = z;
    }
}
