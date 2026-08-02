package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
public class DualECPoints {
    private final org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public int getMaxOutlen() {
        int fieldSize = this.Camera2StreamConfigurationMap.getCurve().getFieldSize();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return ((fieldSize - (i2 + 13)) / 8) * 8;
            }
            i2++;
        }
    }

    public int getSeedLen() {
        return this.Camera2StreamConfigurationMap.getCurve().getFieldSize();
    }

    public int getSecurityStrength() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.math.ec.ECPoint getP() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getCofactor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public DualECPoints(int i, org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.math.ec.ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new java.lang.IllegalArgumentException("points need to be on the same curve");
        }
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = eCPoint;
        this.getHighSpeedVideoFpsRangesFor = eCPoint2;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }
}
