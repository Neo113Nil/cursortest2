package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public final class KDFFeedbackParameters implements org.bouncycastle.crypto.DerivationParameters {
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public final boolean useCounter() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getR() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final byte[] getKI() {
        return this.Camera2StreamConfigurationMap;
    }

    public final byte[] getIV() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getFixedInputData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.crypto.params.KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new org.bouncycastle.crypto.params.KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public static org.bouncycastle.crypto.params.KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            return new org.bouncycastle.crypto.params.KDFFeedbackParameters(bArr, bArr2, bArr3, i, true);
        }
        throw new java.lang.IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        if (bArr3 == null) {
            this.getHighSpeedVideoFpsRanges = new byte[0];
        } else {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr3);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (bArr2 == null) {
            this.getHighSpeedVideoFpsRangesFor = new byte[0];
        } else {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr2);
        }
        this.getHighSpeedVideoSizes = z;
    }
}
