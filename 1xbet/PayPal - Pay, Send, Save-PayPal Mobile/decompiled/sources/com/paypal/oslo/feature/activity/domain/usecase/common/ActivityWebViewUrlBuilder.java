package com.paypal.oslo.feature.activity.domain.usecase.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityWebViewUrlBuilder;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityWebViewDto;", "webViewDomainData", "", "build", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityWebViewDto;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWebViewUrlBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ActivityWebViewUrlBuilder(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.Camera2StreamConfigurationMap = webEnvironmentProvider;
    }

    public final java.lang.String build(com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto webViewDomainData) {
        java.lang.String webUrl = webViewDomainData != null ? webViewDomainData.getWebUrl() : null;
        if (webUrl != null && !kotlin.text.StringsKt.isBlank(webUrl)) {
            return webViewDomainData.getWebUrl();
        }
        java.lang.String webPath = webViewDomainData != null ? webViewDomainData.getWebPath() : null;
        if (webPath == null || kotlin.text.StringsKt.isBlank(webPath)) {
            return null;
        }
        okhttp3.HttpUrl.Builder newBuilder = okhttp3.HttpUrl.INSTANCE.get(this.Camera2StreamConfigurationMap.getWebBaseUrl()).newBuilder();
        java.lang.String webPath2 = webViewDomainData.getWebPath();
        java.lang.String trimStart = webPath2 != null ? kotlin.text.StringsKt.trimStart(webPath2, kotlinx.io.files.FileSystemKt.UnixPathSeparator) : null;
        if (trimStart == null) {
            trimStart = "";
        }
        return newBuilder.addEncodedPathSegments(trimStart).build().toString();
    }
}
