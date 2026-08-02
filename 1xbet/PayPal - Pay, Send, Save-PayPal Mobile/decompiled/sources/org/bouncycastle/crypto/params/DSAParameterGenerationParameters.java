package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public int getUsageIndex() {
        return this.getHighSpeedVideoSizes;
    }

    public java.security.SecureRandom getRandom() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getN() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getL() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getCertainty() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public DSAParameterGenerationParameters(int i, int i2, int i3, java.security.SecureRandom secureRandom, int i4) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getHighSpeedVideoSizes = i4;
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    public DSAParameterGenerationParameters(int i, int i2, int i3, java.security.SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }
}
