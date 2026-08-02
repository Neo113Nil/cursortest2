package androidx.camera.core.resolutionselector;

/* loaded from: classes6.dex */
public final class ResolutionSelector {
    public static final int PREFER_CAPTURE_RATE_OVER_HIGHER_RESOLUTION = 0;
    public static final int PREFER_HIGHER_RESOLUTION_OVER_CAPTURE_RATE = 1;
    private final androidx.camera.core.resolutionselector.ResolutionFilter Camera2StreamConfigurationMap;
    private final androidx.camera.core.resolutionselector.AspectRatioStrategy getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.resolutionselector.ResolutionStrategy getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AllowedResolutionMode {
    }

    ResolutionSelector(androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy, androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy, androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = aspectRatioStrategy;
        this.getHighSpeedVideoFpsRanges = resolutionStrategy;
        this.Camera2StreamConfigurationMap = resolutionFilter;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final androidx.camera.core.resolutionselector.AspectRatioStrategy getAspectRatioStrategy() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.camera.core.resolutionselector.ResolutionStrategy getResolutionStrategy() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.camera.core.resolutionselector.ResolutionFilter getResolutionFilter() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getAllowedResolutionMode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Builder {
        private androidx.camera.core.resolutionselector.AspectRatioStrategy Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private androidx.camera.core.resolutionselector.ResolutionFilter getHighSpeedVideoFpsRanges;
        private androidx.camera.core.resolutionselector.ResolutionStrategy getHighSpeedVideoSizes;

        public Builder() {
            this.Camera2StreamConfigurationMap = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        private Builder(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            this.Camera2StreamConfigurationMap = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = resolutionSelector.getAspectRatioStrategy();
            this.getHighSpeedVideoSizes = resolutionSelector.getResolutionStrategy();
            this.getHighSpeedVideoFpsRanges = resolutionSelector.getResolutionFilter();
            this.getHighResolutionOutputSizeshNQ4ISI = resolutionSelector.getAllowedResolutionMode();
        }

        public static androidx.camera.core.resolutionselector.ResolutionSelector.Builder fromResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            return new androidx.camera.core.resolutionselector.ResolutionSelector.Builder(resolutionSelector);
        }

        public final androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy) {
            this.Camera2StreamConfigurationMap = aspectRatioStrategy;
            return this;
        }

        public final androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy) {
            this.getHighSpeedVideoSizes = resolutionStrategy;
            return this;
        }

        public final androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionFilter(androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter) {
            this.getHighSpeedVideoFpsRanges = resolutionFilter;
            return this;
        }

        public final androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAllowedResolutionMode(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.camera.core.resolutionselector.ResolutionSelector build() {
            return new androidx.camera.core.resolutionselector.ResolutionSelector(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
