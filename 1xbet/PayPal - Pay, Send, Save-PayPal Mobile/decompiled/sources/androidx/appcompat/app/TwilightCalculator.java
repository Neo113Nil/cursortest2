package androidx.appcompat.app;

/* loaded from: classes3.dex */
class TwilightCalculator {
    private static androidx.appcompat.app.TwilightCalculator Camera2StreamConfigurationMap;
    public long getHighSpeedVideoFpsRanges;
    public int getHighSpeedVideoFpsRangesFor;
    public long getHighSpeedVideoSizes;

    TwilightCalculator() {
    }

    static androidx.appcompat.app.TwilightCalculator getHighSpeedVideoSizes() {
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = new androidx.appcompat.app.TwilightCalculator();
        }
        return Camera2StreamConfigurationMap;
    }

    public final void getHighSpeedVideoFpsRangesFor(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (java.lang.Math.sin(d3) * 0.03341960161924362d) + d3 + (java.lang.Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (java.lang.Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = java.lang.Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d2) / 360.0d) + (java.lang.Math.sin(d3) * 0.0053d) + (java.lang.Math.sin(2.0d * sin) * (-0.0069d));
        double asin = java.lang.Math.asin(java.lang.Math.sin(sin) * java.lang.Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin2 = (java.lang.Math.sin(-0.10471975803375244d) - (java.lang.Math.sin(d4) * java.lang.Math.sin(asin))) / (java.lang.Math.cos(d4) * java.lang.Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.getHighSpeedVideoFpsRangesFor = 1;
            this.getHighSpeedVideoFpsRanges = -1L;
            this.getHighSpeedVideoSizes = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoFpsRanges = -1L;
                this.getHighSpeedVideoSizes = -1L;
                return;
            }
            double acos = (float) (java.lang.Math.acos(sin2) / 6.283185307179586d);
            this.getHighSpeedVideoFpsRanges = java.lang.Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = java.lang.Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.getHighSpeedVideoSizes = round2;
            if (round2 < j && this.getHighSpeedVideoFpsRanges > j) {
                this.getHighSpeedVideoFpsRangesFor = 0;
            } else {
                this.getHighSpeedVideoFpsRangesFor = 1;
            }
        }
    }
}
