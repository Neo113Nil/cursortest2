package com.paypal.oslo.core.webview.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/webview/config/DefaultWebEnvironmentProvider;", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentConfig;", "webEnvironmentConfig", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentConfig;)V", "", "getWebBaseUrl", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentConfig;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultWebEnvironmentProvider implements com.paypal.oslo.core.webview.config.WebEnvironmentProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentConfig getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider.Companion Companion = new com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public DefaultWebEnvironmentProvider(com.paypal.oslo.core.webview.config.WebEnvironmentConfig webEnvironmentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentConfig, "");
        this.getHighSpeedVideoFpsRanges = webEnvironmentConfig;
    }

    @Override // com.paypal.oslo.core.webview.config.WebEnvironmentProvider
    public final java.lang.String getWebBaseUrl() {
        int i = com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.getEnvironment().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String apiBaseUrl = this.getHighSpeedVideoFpsRanges.getApiBaseUrl();
        java.net.URI uri = new java.net.URI(apiBaseUrl);
        java.lang.String host = uri.getHost();
        if (host == null || !kotlin.text.StringsKt.startsWith$default(host, "api.", false, 2, (java.lang.Object) null)) {
            return kotlin.text.StringsKt.trimEnd(apiBaseUrl, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        }
        java.lang.String replace = new kotlin.text.Regex("(?<=\\.)te-").replace(new kotlin.text.Regex("(?<=\\.)te-([^.]+)\\.qa\\.").replace(new kotlin.text.Regex("^api\\.").replace(host, "www."), "$1.stage."), "");
        java.lang.String scheme = uri.getScheme();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(scheme);
        sb.append("://");
        sb.append(replace);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/config/DefaultWebEnvironmentProvider$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.webview.config.WebEnvironment.values().length];
            try {
                iArr[com.paypal.oslo.core.webview.config.WebEnvironment.Production.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.webview.config.WebEnvironment.Development.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
