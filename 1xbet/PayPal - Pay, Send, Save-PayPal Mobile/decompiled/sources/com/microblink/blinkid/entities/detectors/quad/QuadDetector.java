package com.microblink.blinkid.entities.detectors.quad;

/* loaded from: classes9.dex */
public abstract class QuadDetector<R extends com.microblink.blinkid.entities.detectors.quad.QuadDetector.Result> extends com.microblink.blinkid.entities.detectors.Detector<R> {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.detectors.quad.QuadDetector";

    public static abstract class Result extends com.microblink.blinkid.entities.detectors.Detector.Result {
        protected Result(long j) {
            super(j);
        }

        private static native void nativeGetQuad(long j, float[] fArr);

        public com.microblink.blinkid.geometry.Quadrilateral getDetectionLocation() {
            float[] fArr = new float[8];
            nativeGetQuad(getNativeContext(), fArr);
            return new com.microblink.blinkid.geometry.Quadrilateral(fArr);
        }

        public java.lang.String toString() {
            return getDetectionLocation().toString();
        }
    }

    protected QuadDetector(long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result result) {
        super(j, result);
    }

    protected QuadDetector(long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
