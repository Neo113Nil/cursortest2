package androidx.webkit;

/* loaded from: classes7.dex */
public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PredefinedCategories {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TracingMode {
    }

    public TracingConfig(int i, java.util.List<java.lang.String> list, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = arrayList;
        this.Camera2StreamConfigurationMap = i;
        arrayList.addAll(list);
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public int getPredefinedCategories() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.List<java.lang.String> getCustomIncludedCategories() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getTracingMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static class Builder {
        private int getHighSpeedVideoSizes = 0;
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        private int Camera2StreamConfigurationMap = 1;

        public androidx.webkit.TracingConfig build() {
            return new androidx.webkit.TracingConfig(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }

        public androidx.webkit.TracingConfig.Builder addCategories(int... iArr) {
            for (int i : iArr) {
                this.getHighSpeedVideoSizes = i | this.getHighSpeedVideoSizes;
            }
            return this;
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.lang.String... strArr) {
            this.getHighSpeedVideoFpsRangesFor.addAll(java.util.Arrays.asList(strArr));
            return this;
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.util.Collection<java.lang.String> collection) {
            this.getHighSpeedVideoFpsRangesFor.addAll(collection);
            return this;
        }

        public androidx.webkit.TracingConfig.Builder setTracingMode(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }
    }
}
