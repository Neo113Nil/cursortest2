package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class IESParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private boolean getOutputFormats;

    public void setPointCompression(boolean z) {
        this.getOutputFormats = z;
    }

    public boolean getPointCompression() {
        return this.getOutputFormats;
    }

    public byte[] getNonce() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public int getMacKeySize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getEncodingV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public byte[] getDerivationV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getCipherKeySize() {
        return this.Camera2StreamConfigurationMap;
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.getHighSpeedVideoFpsRanges = bArr4;
            java.lang.System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.getHighSpeedVideoFpsRanges = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.getHighSpeedVideoSizes = bArr5;
            java.lang.System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.getHighSpeedVideoSizes = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getOutputFormats = z;
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, false);
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, null, false);
    }
}
