package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/config/AppRestConfig;", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppRestConfig implements com.paypal.oslo.core.network.rest.config.RestConfig {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AppRestConfig(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = environmentProvider;
    }

    @Override // com.paypal.oslo.core.network.rest.config.RestConfig
    public final java.lang.String getBaseUrl() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment().getBaseUrl();
    }
}
