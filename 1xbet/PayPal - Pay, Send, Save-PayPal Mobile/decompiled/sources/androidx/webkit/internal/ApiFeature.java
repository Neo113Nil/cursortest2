package androidx.webkit.internal;

/* loaded from: classes7.dex */
public abstract class ApiFeature implements androidx.webkit.internal.ConditionallySupportedFeature {
    private static final java.util.Set<androidx.webkit.internal.ApiFeature> getHighSpeedVideoSizes = new java.util.HashSet();
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public abstract boolean isSupportedByFramework();

    ApiFeature(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        getHighSpeedVideoSizes.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public java.lang.String getPublicFeatureName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }

    public boolean isSupportedByWebView() {
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.containsFeature(androidx.webkit.internal.ApiFeature.LAZY_HOLDER.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public static java.util.Set<androidx.webkit.internal.ApiFeature> values() {
        return java.util.Collections.unmodifiableSet(getHighSpeedVideoSizes);
    }

    public static java.util.Set<java.lang.String> getWebViewApkFeaturesForTesting() {
        return androidx.webkit.internal.ApiFeature.LAZY_HOLDER.Camera2StreamConfigurationMap;
    }

    static class LAZY_HOLDER {
        static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = new java.util.HashSet(java.util.Arrays.asList(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getWebViewFeatures()));

        private LAZY_HOLDER() {
        }
    }

    public static class NoFramework extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        NoFramework(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class M extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        M(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class N extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        N(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class O extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        O(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class O_MR1 extends androidx.webkit.internal.ApiFeature {
        O_MR1(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class P extends androidx.webkit.internal.ApiFeature {
        P(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class Q extends androidx.webkit.internal.ApiFeature {
        Q(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class T extends androidx.webkit.internal.ApiFeature {
        T(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 33;
        }
    }
}
