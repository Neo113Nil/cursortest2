package com.paypal.oslo.feature.onboarding.mgm.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMUrlProvider;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "", "getMgmUrl", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MGMUrlProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public MGMUrlProvider(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighSpeedVideoSizes = webEnvironmentProvider;
    }

    public final java.lang.String getMgmUrl() {
        return okhttp3.HttpUrl.INSTANCE.get(this.getHighSpeedVideoSizes.getWebBaseUrl()).newBuilder().addEncodedPathSegments("cgp/mgm/referrer").addQueryParameter("intent", "mktg").build().toString();
    }
}
