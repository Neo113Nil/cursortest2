package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/config/WebEnvironmentConfigProvider;", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentConfig;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/webview/config/WebEnvironment;", "getEnvironment", "()Lcom/paypal/oslo/core/webview/config/WebEnvironment;", "environment", "", "getApiBaseUrl", "()Ljava/lang/String;", "apiBaseUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebEnvironmentConfigProvider implements com.paypal.oslo.core.webview.config.WebEnvironmentConfig {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public WebEnvironmentConfigProvider(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.getHighSpeedVideoFpsRangesFor = environmentProvider;
    }

    @Override // com.paypal.oslo.core.webview.config.WebEnvironmentConfig
    public final com.paypal.oslo.core.webview.config.WebEnvironment getEnvironment() {
        com.paypal.oslo.app.environment.Environment environment = this.getHighSpeedVideoFpsRangesFor.getEnvironment();
        if (kotlin.jvm.internal.Intrinsics.areEqual(environment, com.paypal.oslo.app.environment.Environment.Production.INSTANCE)) {
            return com.paypal.oslo.core.webview.config.WebEnvironment.Production;
        }
        if (environment instanceof com.paypal.oslo.app.environment.Environment.Stage) {
            return com.paypal.oslo.core.webview.config.WebEnvironment.Development;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.paypal.oslo.core.webview.config.WebEnvironmentConfig
    public final java.lang.String getApiBaseUrl() {
        return this.getHighSpeedVideoFpsRangesFor.getEnvironment().getBaseUrl();
    }
}
