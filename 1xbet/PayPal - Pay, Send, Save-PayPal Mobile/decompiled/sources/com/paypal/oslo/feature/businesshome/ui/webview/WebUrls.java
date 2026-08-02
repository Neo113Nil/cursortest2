package com.paypal.oslo.feature.businesshome.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/webview/WebUrls;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighSpeedVideoFpsRanges", "", "getAccountVerification", "()Ljava/lang/String;", "accountVerification", "getConfirmEmail", "confirmEmail", "getDisputes", "disputes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WebUrls {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public WebUrls(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighSpeedVideoFpsRanges = webEnvironmentProvider;
    }

    public final java.lang.String getAccountVerification() {
        java.lang.String webBaseUrl = this.getHighSpeedVideoFpsRanges.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/unifiedonboarding/after-login");
        return sb.toString();
    }

    public final java.lang.String getConfirmEmail() {
        java.lang.String webBaseUrl = this.getHighSpeedVideoFpsRanges.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/businessmanage/profile/personalInformation/unifiedsettings/email");
        return sb.toString();
    }

    public final java.lang.String getDisputes() {
        java.lang.String webBaseUrl = this.getHighSpeedVideoFpsRanges.getWebBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webBaseUrl);
        sb.append("/disputes/dashboard");
        return sb.toString();
    }
}
