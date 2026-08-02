package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAValidationParameters {
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor ^ org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes);
    }

    public int getUsageIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public int getCounter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.DSAValidationParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.DSAValidationParameters dSAValidationParameters = (org.bouncycastle.crypto.params.DSAValidationParameters) obj;
        if (dSAValidationParameters.getHighSpeedVideoFpsRangesFor != this.getHighSpeedVideoFpsRangesFor) {
            return false;
        }
        return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizes, dSAValidationParameters.getHighSpeedVideoSizes);
    }

    public DSAValidationParameters(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public DSAValidationParameters(byte[] bArr, int i) {
        this(bArr, i, -1);
    }
}
