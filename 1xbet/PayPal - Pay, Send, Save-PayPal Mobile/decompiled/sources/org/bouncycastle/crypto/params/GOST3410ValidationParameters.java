package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410ValidationParameters {
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoSizes;

    public int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        long j = this.getHighSpeedVideoSizes;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        return ((((i ^ i2) ^ ((int) j)) ^ ((int) (j >> 32))) ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }

    public long getX0L() {
        return this.getHighSpeedVideoSizes;
    }

    public int getX0() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public long getCL() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getC() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.GOST3410ValidationParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.GOST3410ValidationParameters gOST3410ValidationParameters = (org.bouncycastle.crypto.params.GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.Camera2StreamConfigurationMap == this.Camera2StreamConfigurationMap && gOST3410ValidationParameters.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRanges && gOST3410ValidationParameters.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && gOST3410ValidationParameters.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
    }

    public GOST3410ValidationParameters(int i, int i2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
    }
}
