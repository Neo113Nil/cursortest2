package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class AEADParameters implements org.bouncycastle.crypto.CipherParameters {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.KeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getNonce() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public int getMacSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.params.KeyParameter getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getAssociatedText() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public AEADParameters(org.bouncycastle.crypto.params.KeyParameter keyParameter, int i, byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = keyParameter;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr2);
    }

    public AEADParameters(org.bouncycastle.crypto.params.KeyParameter keyParameter, int i, byte[] bArr) {
        this(keyParameter, i, bArr, null);
    }
}
