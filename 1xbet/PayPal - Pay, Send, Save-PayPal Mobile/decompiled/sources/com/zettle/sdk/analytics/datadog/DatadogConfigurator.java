package com.zettle.sdk.analytics.datadog;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/analytics/datadog/DatadogConfigurator;", "", "Lokhttp3/OkHttpClient$Builder;", "builder", "configureOkHttp", "(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient$Builder;", "Lcom/zettle/sdk/Configuration;", "config", "", "init", "(Lcom/zettle/sdk/Configuration;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DatadogConfigurator {
    okhttp3.OkHttpClient.Builder configureOkHttp(okhttp3.OkHttpClient.Builder builder);

    void init(com.zettle.sdk.Configuration config);
}
