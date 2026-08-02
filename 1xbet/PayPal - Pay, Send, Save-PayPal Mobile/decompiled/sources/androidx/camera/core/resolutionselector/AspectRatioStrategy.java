package androidx.camera.core.resolutionselector;

/* loaded from: classes6.dex */
public final class AspectRatioStrategy {
    public static final int FALLBACK_RULE_AUTO = 1;
    public static final int FALLBACK_RULE_NONE = 0;
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    public static final androidx.camera.core.resolutionselector.AspectRatioStrategy RATIO_4_3_FALLBACK_AUTO_STRATEGY = new androidx.camera.core.resolutionselector.AspectRatioStrategy(0, 1);
    public static final androidx.camera.core.resolutionselector.AspectRatioStrategy RATIO_16_9_FALLBACK_AUTO_STRATEGY = new androidx.camera.core.resolutionselector.AspectRatioStrategy(1, 1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AspectRatioFallbackRule {
    }

    public AspectRatioStrategy(int i, int i2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    public final int getPreferredAspectRatio() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getFallbackRule() {
        return this.Camera2StreamConfigurationMap;
    }
}
