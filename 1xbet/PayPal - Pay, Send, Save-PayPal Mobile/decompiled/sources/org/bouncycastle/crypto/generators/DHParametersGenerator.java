package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DHParametersGenerator {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(2);
    private int Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    public void init(int i, int i2, java.security.SecureRandom secureRandom) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
    }

    public org.bouncycastle.crypto.params.DHParameters generateParameters() {
        java.math.BigInteger[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.generators.DHParametersHelper.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        java.math.BigInteger bigInteger = highSpeedVideoFpsRangesFor[0];
        return new org.bouncycastle.crypto.params.DHParameters(bigInteger, org.bouncycastle.crypto.generators.DHParametersHelper.getHighSpeedVideoFpsRanges(bigInteger, this.getHighResolutionOutputSizeshNQ4ISI), highSpeedVideoFpsRangesFor[1], getHighSpeedVideoFpsRangesFor, (org.bouncycastle.crypto.params.DHValidationParameters) null);
    }
}
