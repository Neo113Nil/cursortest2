package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class KDFCounterParameters implements org.bouncycastle.crypto.DerivationParameters {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public final int getR() {
        return this.Camera2StreamConfigurationMap;
    }

    public final byte[] getKI() {
        return this.getHighSpeedVideoSizes;
    }

    public final byte[] getFixedInputDataCounterSuffix() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final byte[] getFixedInputDataCounterPrefix() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public final byte[] getFixedInputData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        if (bArr2 == null) {
            this.getHighSpeedVideoFpsRangesFor = new byte[0];
        } else {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[0];
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr3);
        }
        if (i != 8 && i != 16 && i != 24 && i != 32) {
            throw new java.lang.IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        this.Camera2StreamConfigurationMap = i;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, null, bArr2, i);
    }
}
