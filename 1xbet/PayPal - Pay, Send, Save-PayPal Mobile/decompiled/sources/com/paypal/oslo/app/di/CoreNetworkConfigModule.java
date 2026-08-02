package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/di/CoreNetworkConfigModule;", "", "Lcom/paypal/oslo/app/config/AppSSLConfig;", "impl", "Lcom/paypal/oslo/app/config/SSLConfig;", "bindSSLConfig", "(Lcom/paypal/oslo/app/config/AppSSLConfig;)Lcom/paypal/oslo/app/config/SSLConfig;", "Lcom/paypal/oslo/app/config/AppHttpConfig;", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "bindHttpConfig", "(Lcom/paypal/oslo/app/config/AppHttpConfig;)Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "Lcom/paypal/oslo/app/config/AppRestConfig;", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "bindRestConfig", "(Lcom/paypal/oslo/app/config/AppRestConfig;)Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "Lcom/paypal/oslo/app/config/AppSseConfig;", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "bindSseConfig", "(Lcom/paypal/oslo/app/config/AppSseConfig;)Lcom/paypal/oslo/core/network/sse/config/SseConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface CoreNetworkConfigModule {
    @dagger.Binds
    com.paypal.oslo.core.network.http.config.HttpConfig bindHttpConfig(com.paypal.oslo.app.config.AppHttpConfig impl);

    @dagger.Binds
    com.paypal.oslo.core.network.rest.config.RestConfig bindRestConfig(com.paypal.oslo.app.config.AppRestConfig impl);

    @dagger.Binds
    com.paypal.oslo.app.config.SSLConfig bindSSLConfig(com.paypal.oslo.app.config.AppSSLConfig impl);

    @dagger.Binds
    com.paypal.oslo.core.network.sse.config.SseConfig bindSseConfig(com.paypal.oslo.app.config.AppSseConfig impl);
}
