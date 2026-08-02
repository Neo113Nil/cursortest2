package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHValidationParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    public int hashCode() {
        return this.getHighSpeedVideoSizes ^ org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getCounter() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.DHValidationParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.DHValidationParameters dHValidationParameters = (org.bouncycastle.crypto.params.DHValidationParameters) obj;
        if (dHValidationParameters.getHighSpeedVideoSizes != this.getHighSpeedVideoSizes) {
            return false;
        }
        return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, dHValidationParameters.getHighResolutionOutputSizeshNQ4ISI);
    }

    public DHValidationParameters(byte[] bArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoSizes = i;
    }
}
