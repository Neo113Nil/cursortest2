package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class ElGamalParametersGenerator {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public void init(int i, int i2, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
    }

    public org.bouncycastle.crypto.params.ElGamalParameters generateParameters() {
        java.math.BigInteger[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.generators.DHParametersHelper.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        java.math.BigInteger bigInteger = highSpeedVideoFpsRangesFor[0];
        java.math.BigInteger bigInteger2 = highSpeedVideoFpsRangesFor[1];
        return new org.bouncycastle.crypto.params.ElGamalParameters(bigInteger, org.bouncycastle.crypto.generators.DHParametersHelper.getHighSpeedVideoFpsRanges(bigInteger, this.getHighResolutionOutputSizeshNQ4ISI));
    }
}
