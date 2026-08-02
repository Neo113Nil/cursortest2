package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class NaccacheSternKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private int Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public boolean isDebug() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getCntSmallPrimes() {
        return this.getHighSpeedVideoSizes;
    }

    public int getCertainty() {
        return this.Camera2StreamConfigurationMap;
    }

    public NaccacheSternKeyGenerationParameters(java.security.SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
        super(secureRandom, i);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.Camera2StreamConfigurationMap = i2;
        if (i3 % 2 == 1) {
            throw new java.lang.IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        }
        if (i3 < 30) {
            throw new java.lang.IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
        }
        this.getHighSpeedVideoSizes = i3;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public NaccacheSternKeyGenerationParameters(java.security.SecureRandom secureRandom, int i, int i2, int i3) {
        this(secureRandom, i, i2, i3, false);
    }
}
