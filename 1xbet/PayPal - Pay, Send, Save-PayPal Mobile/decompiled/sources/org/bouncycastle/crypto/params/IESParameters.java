package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class IESParameters implements org.bouncycastle.crypto.CipherParameters {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public int getMacKeySize() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getEncodingV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public byte[] getDerivationV() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public IESParameters(byte[] bArr, byte[] bArr2, int i) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoSizes = i;
    }
}
