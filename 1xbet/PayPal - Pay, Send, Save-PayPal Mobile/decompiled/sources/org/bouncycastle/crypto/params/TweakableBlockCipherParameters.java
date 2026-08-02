package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class TweakableBlockCipherParameters implements org.bouncycastle.crypto.CipherParameters {
    private final org.bouncycastle.crypto.params.KeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getTweak() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.KeyParameter getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public TweakableBlockCipherParameters(org.bouncycastle.crypto.params.KeyParameter keyParameter, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = keyParameter;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
