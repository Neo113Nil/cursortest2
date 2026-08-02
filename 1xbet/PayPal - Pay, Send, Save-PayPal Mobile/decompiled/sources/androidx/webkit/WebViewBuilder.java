package androidx.webkit;

/* loaded from: classes7.dex */
public final class WebViewBuilder {
    public static final int PRESET_LEGACY = 0;
    private final java.util.List<androidx.webkit.RestrictionAllowlist> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Preset {
    }

    public WebViewBuilder(int i) {
        if (i != 0) {
            throw new java.lang.IllegalArgumentException("Invalid preset: ".concat(java.lang.String.valueOf(i)));
        }
    }

    public final androidx.webkit.WebViewBuilder restrictJavaScriptInterfaces() {
        this.getHighSpeedVideoFpsRanges = true;
        return this;
    }

    public final androidx.webkit.WebViewBuilder setProfile(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return this;
    }

    public final androidx.webkit.WebViewBuilder addAllowlist(androidx.webkit.RestrictionAllowlist restrictionAllowlist) {
        this.Camera2StreamConfigurationMap.add(restrictionAllowlist);
        return this;
    }

    public final android.webkit.WebView build(android.content.Context context) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_BUILDER_V1.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getWebViewBuilder();
        }
        org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config config = new org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config();
        config.restrictJavascriptInterface = this.getHighSpeedVideoFpsRanges;
        config.profileName = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            java.util.Iterator<androidx.webkit.RestrictionAllowlist> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                java.util.Iterator<androidx.webkit.RestrictionAllowlist.ConfigTask> it2 = it.next().getHighSpeedVideoSizes.iterator();
                while (it2.hasNext()) {
                    it2.next().configure(config);
                }
            }
            return this.getHighSpeedVideoFpsRangesFor.build(context, config);
        } catch (java.lang.RuntimeException e) {
            throw new androidx.webkit.WebViewBuilderException(e);
        }
    }
}
