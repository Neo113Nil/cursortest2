package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class HKDFParameters implements org.bouncycastle.crypto.DerivationParameters {
    private final boolean Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoSizes;

    public boolean skipExtract() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getSalt() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public byte[] getInfo() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public byte[] getIKM() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.crypto.params.HKDFParameters skipExtractParameters(byte[] bArr, byte[] bArr2) {
        return new org.bouncycastle.crypto.params.HKDFParameters(bArr, true, null, bArr2);
    }

    public static org.bouncycastle.crypto.params.HKDFParameters defaultParameters(byte[] bArr) {
        return new org.bouncycastle.crypto.params.HKDFParameters(bArr, false, null, null);
    }

    public HKDFParameters(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }

    private HKDFParameters(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.Camera2StreamConfigurationMap = z;
        if (bArr2 == null || bArr2.length == 0) {
            this.getHighSpeedVideoSizes = null;
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.getHighSpeedVideoFpsRanges = new byte[0];
        } else {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr3);
        }
    }
}
