package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class FPEParameters implements org.bouncycastle.crypto.CipherParameters {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public final boolean isUsingInverseFunction() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getTweak() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int getRadix() {
        return this.getHighSpeedVideoSizes;
    }

    public final org.bouncycastle.crypto.params.KeyParameter getKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public FPEParameters(org.bouncycastle.crypto.params.KeyParameter keyParameter, int i, byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRanges = keyParameter;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public FPEParameters(org.bouncycastle.crypto.params.KeyParameter keyParameter, int i, byte[] bArr) {
        this(keyParameter, i, bArr, false);
    }
}
