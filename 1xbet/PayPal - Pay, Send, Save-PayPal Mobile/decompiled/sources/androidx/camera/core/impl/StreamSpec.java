package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class StreamSpec {
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_UNSPECIFIED = new android.util.Range<>(0, 0);

    public abstract androidx.camera.core.DynamicRange getDynamicRange();

    public abstract android.util.Range<java.lang.Integer> getExpectedFrameRateRange();

    public abstract androidx.camera.core.impl.Config getImplementationOptions();

    public abstract android.util.Size getOriginalConfiguredResolution();

    public abstract android.util.Size getResolution();

    public abstract int getSessionType();

    public abstract boolean getZslDisabled();

    public abstract androidx.camera.core.impl.StreamSpec.Builder toBuilder();

    public static androidx.camera.core.impl.StreamSpec.Builder builder(android.util.Size size) {
        return new androidx.camera.core.impl.AutoValue_StreamSpec.Builder().setResolution(size).setOriginalConfiguredResolution(size).setSessionType(0).setExpectedFrameRateRange(FRAME_RATE_RANGE_UNSPECIFIED).setDynamicRange(androidx.camera.core.DynamicRange.SDR).setZslDisabled(false);
    }

    public static abstract class Builder {
        public abstract androidx.camera.core.impl.StreamSpec build();

        public abstract androidx.camera.core.impl.StreamSpec.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setImplementationOptions(androidx.camera.core.impl.Config config);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setOriginalConfiguredResolution(android.util.Size size);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setResolution(android.util.Size size);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setSessionType(int i);

        public abstract androidx.camera.core.impl.StreamSpec.Builder setZslDisabled(boolean z);

        Builder() {
        }
    }
}
