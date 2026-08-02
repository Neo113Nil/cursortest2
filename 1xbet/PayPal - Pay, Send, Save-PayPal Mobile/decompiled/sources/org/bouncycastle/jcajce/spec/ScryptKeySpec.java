package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class ScryptKeySpec implements java.security.spec.KeySpec {
    private final char[] Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;

    public byte[] getSalt() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    public char[] getPassword() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getParallelizationParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getKeyLength() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getCostParameter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getBlockSize() {
        return this.getHighSpeedVideoSizes;
    }

    public ScryptKeySpec(char[] cArr, byte[] bArr, int i, int i2, int i3, int i4) {
        this.Camera2StreamConfigurationMap = cArr;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getHighSpeedVideoFpsRangesFor = i4;
    }
}
