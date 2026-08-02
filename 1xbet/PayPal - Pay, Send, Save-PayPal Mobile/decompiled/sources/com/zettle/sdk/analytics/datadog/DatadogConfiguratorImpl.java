package com.zettle.sdk.analytics.datadog;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/analytics/datadog/DatadogConfiguratorImpl;", "Lcom/zettle/sdk/analytics/datadog/DatadogConfigurator;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "Lokhttp3/OkHttpClient$Builder;", "p0", "configureOkHttp", "(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient$Builder;", "Lcom/zettle/sdk/Configuration;", "", "init", "(Lcom/zettle/sdk/Configuration;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class DatadogConfiguratorImpl implements com.zettle.sdk.analytics.datadog.DatadogConfigurator, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes = "DatadogConfigurator";

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.analytics.datadog.DatadogConfigurator
    public final void init(com.zettle.sdk.Configuration p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        com.zettle.sdk.core.log.LogKt.log(this, "DataDogWrapper has been init");
        com.zettle.sdk.DataDogUtilsKt.initializeDataDogRum(p0.getContext());
    }

    @Override // com.zettle.sdk.analytics.datadog.DatadogConfigurator
    public final okhttp3.OkHttpClient.Builder configureOkHttp(okhttp3.OkHttpClient.Builder p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return p0.addInterceptor(com.zettle.sdk.DataDogUtilsKt.getO11YWrapper().getDDOkHttpInterceptor());
    }
}
