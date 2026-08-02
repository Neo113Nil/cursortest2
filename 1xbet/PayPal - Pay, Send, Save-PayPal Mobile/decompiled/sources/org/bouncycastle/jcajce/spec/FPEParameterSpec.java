package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class FPEParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final boolean Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    public boolean isUsingInverseFunction() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getTweak() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public int getRadix() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public FPEParameterSpec(int i, byte[] bArr, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.Camera2StreamConfigurationMap = z;
    }

    public FPEParameterSpec(int i, byte[] bArr) {
        this(i, bArr, false);
    }
}
