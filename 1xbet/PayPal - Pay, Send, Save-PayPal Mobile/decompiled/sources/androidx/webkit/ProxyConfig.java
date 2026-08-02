package androidx.webkit;

/* loaded from: classes7.dex */
public final class ProxyConfig {
    public static final java.lang.String MATCH_ALL_SCHEMES = "*";
    public static final java.lang.String MATCH_HTTP = "http";
    public static final java.lang.String MATCH_HTTPS = "https";
    private final boolean Camera2StreamConfigurationMap;
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<androidx.webkit.ProxyConfig.ProxyRule> getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ProxyScheme {
    }

    public ProxyConfig(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> list, java.util.List<java.lang.String> list2, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = list2;
        this.Camera2StreamConfigurationMap = z;
    }

    public final java.util.List<androidx.webkit.ProxyConfig.ProxyRule> getProxyRules() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.util.List<java.lang.String> getBypassRules() {
        return java.util.Collections.unmodifiableList(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean isReverseBypassEnabled() {
        return this.Camera2StreamConfigurationMap;
    }

    public static final class ProxyRule {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoFpsRanges;

        public ProxyRule(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = str2;
        }

        public ProxyRule(java.lang.String str) {
            this("*", str);
        }

        public final java.lang.String getSchemeFilter() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String getUrl() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static final class Builder {
        private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;
        private final java.util.List<androidx.webkit.ProxyConfig.ProxyRule> getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        public Builder() {
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        }

        public Builder(androidx.webkit.ProxyConfig proxyConfig) {
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoFpsRangesFor = proxyConfig.getProxyRules();
            this.Camera2StreamConfigurationMap = proxyConfig.getBypassRules();
            this.getHighSpeedVideoSizes = proxyConfig.isReverseBypassEnabled();
        }

        public final androidx.webkit.ProxyConfig build() {
            return new androidx.webkit.ProxyConfig(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }

        public final androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.add(new androidx.webkit.ProxyConfig.ProxyRule(str));
            return this;
        }

        public final androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRangesFor.add(new androidx.webkit.ProxyConfig.ProxyRule(str2, str));
            return this;
        }

        public final androidx.webkit.ProxyConfig.Builder addBypassRule(java.lang.String str) {
            this.Camera2StreamConfigurationMap.add(str);
            return this;
        }

        public final androidx.webkit.ProxyConfig.Builder addDirect(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.add(new androidx.webkit.ProxyConfig.ProxyRule(str, "direct://"));
            return this;
        }

        public final androidx.webkit.ProxyConfig.Builder addDirect() {
            return addDirect("*");
        }

        public final androidx.webkit.ProxyConfig.Builder bypassSimpleHostnames() {
            return addBypassRule("<local>");
        }

        public final androidx.webkit.ProxyConfig.Builder removeImplicitRules() {
            return addBypassRule("<-loopback>");
        }

        public final androidx.webkit.ProxyConfig.Builder setReverseBypassEnabled(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }
    }
}
