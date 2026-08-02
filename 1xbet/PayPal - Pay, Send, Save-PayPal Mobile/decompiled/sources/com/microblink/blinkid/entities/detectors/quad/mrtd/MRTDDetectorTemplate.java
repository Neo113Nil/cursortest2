package com.microblink.blinkid.entities.detectors.quad.mrtd;

/* loaded from: classes9.dex */
class MRTDDetectorTemplate {
    private static native long[] specificationsNativeGet(long j);

    private static native void specificationsNativeSet(long j, long[] jArr);

    public static class Result {
        private static native void nativeGetMRZLocation(long j, float[] fArr);

        public java.lang.String toString() {
            float[] fArr = new float[8];
            nativeGetMRZLocation(0L, fArr);
            return new com.microblink.blinkid.geometry.Quadrilateral(fArr).toString();
        }
    }
}
