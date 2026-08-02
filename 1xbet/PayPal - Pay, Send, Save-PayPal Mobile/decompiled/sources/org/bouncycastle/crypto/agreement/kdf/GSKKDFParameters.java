package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class GSKKDFParameters implements org.bouncycastle.crypto.DerivationParameters {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public byte[] getZ() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getStartCounter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getNonce() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public GSKKDFParameters(byte[] bArr, int i, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = bArr2;
    }

    public GSKKDFParameters(byte[] bArr, int i) {
        this(bArr, i, null);
    }
}
