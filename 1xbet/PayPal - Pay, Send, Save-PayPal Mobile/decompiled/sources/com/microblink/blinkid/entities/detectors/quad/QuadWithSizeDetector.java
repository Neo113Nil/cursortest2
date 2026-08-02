package com.microblink.blinkid.entities.detectors.quad;

/* loaded from: classes9.dex */
public abstract class QuadWithSizeDetector<R extends com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result> extends com.microblink.blinkid.entities.detectors.quad.QuadDetector<R> {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector";

    public static abstract class Result extends com.microblink.blinkid.entities.detectors.quad.QuadDetector.Result {
        public Result(long j) {
            super(j);
        }

        private static native float physicalHeightInInchesNativeGet(long j);

        public float getPhysicalHeightInInches() {
            return physicalHeightInInchesNativeGet(getNativeContext());
        }
    }

    public QuadWithSizeDetector(long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result result) {
        super(j, result);
    }

    public QuadWithSizeDetector(long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
