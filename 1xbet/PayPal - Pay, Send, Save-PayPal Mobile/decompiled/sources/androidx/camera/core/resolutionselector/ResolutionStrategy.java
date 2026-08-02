package androidx.camera.core.resolutionselector;

/* loaded from: classes6.dex */
public final class ResolutionStrategy {
    public static final int FALLBACK_RULE_CLOSEST_HIGHER = 2;
    public static final int FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER = 1;
    public static final int FALLBACK_RULE_CLOSEST_LOWER = 4;
    public static final int FALLBACK_RULE_CLOSEST_LOWER_THEN_HIGHER = 3;
    public static final int FALLBACK_RULE_NONE = 0;
    public static final androidx.camera.core.resolutionselector.ResolutionStrategy HIGHEST_AVAILABLE_STRATEGY = new androidx.camera.core.resolutionselector.ResolutionStrategy();
    private android.util.Size getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ResolutionFallbackRule {
    }

    private ResolutionStrategy() {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    public ResolutionStrategy(android.util.Size size, int i) {
        this.getHighSpeedVideoFpsRanges = size;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final android.util.Size getBoundSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getFallbackRule() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
