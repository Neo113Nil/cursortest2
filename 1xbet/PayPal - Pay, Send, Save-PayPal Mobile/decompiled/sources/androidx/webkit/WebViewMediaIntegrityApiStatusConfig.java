package androidx.webkit;

/* loaded from: classes7.dex */
public class WebViewMediaIntegrityApiStatusConfig {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    private final int getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    public WebViewMediaIntegrityApiStatusConfig(androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder builder) {
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Builder {
        private final int getHighSpeedVideoFpsRanges;
        private java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

        public Builder(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder addOverrideRule(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRangesFor.put(str, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder setOverrideRules(java.util.Map<java.lang.String, java.lang.Integer> map) {
            this.getHighSpeedVideoFpsRangesFor = map;
            return this;
        }

        public final androidx.webkit.WebViewMediaIntegrityApiStatusConfig build() {
            return new androidx.webkit.WebViewMediaIntegrityApiStatusConfig(this);
        }
    }

    public int getDefaultStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getOverrideRules() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
