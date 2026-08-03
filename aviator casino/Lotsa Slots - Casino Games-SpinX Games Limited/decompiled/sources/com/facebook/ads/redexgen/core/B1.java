package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class B1 {
    public static java.lang.String[] A00 = {"XFGs1lyyeZSUQVmeVGOQgjZdx0Lg5SQ7", "gIr6pD0DRCuLw9pu", "xFdIOEguE42sAuXi", "sWe2SXgfKDUPeP6q9qV3qPenQfS3yrFL", "xArwsOhMvePeNXFYJk80LlCaAczGuKur", "d6DKz523SxuOwdk6", "C714aw4WOKSmleIF7c9CmjeVatfjbSsR", "QY3y3Mpjcqc9dDZ4GPBIzJJwsqI"};

    public static int A00(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean A07;
        java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        A07 = com.facebook.ads.redexgen.core.B3.A07();
        if (A07) {
            return 0;
        }
        android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
            if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                return 2;
            }
        }
        if (A00[3].charAt(9) != 'D') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[5] = "YcALvT0VMkVLsK9p";
        strArr[1] = "SPZaEiX7Pp9WtVjf";
        return 1;
    }
}
