package com.paypal.oslo.feature.pushnotification.tokenmanagement.di;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/di/PushProviderModule;", "", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProviderImpl;", "pushTokenProviderImpl", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "bindPushTokenProvider", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProviderImpl;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushTokenProvider;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProviderImpl;", "pushConsentProviderImpl", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "bindPushConsentProvider", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProviderImpl;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/provider/CloudIdentityProviderImpl;", "impl", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "bindCloudIdentityProvider", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/provider/CloudIdentityProviderImpl;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/CloudIdentityProvider;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/PushSubscriptionStateObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "bindSubscriptionStateObserver", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/PushSubscriptionStateObserver;)Lcom/paypal/oslo/core/session/LogoutObserver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface PushProviderModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.CloudIdentityProvider bindCloudIdentityProvider(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider bindPushConsentProvider(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl pushConsentProviderImpl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProvider bindPushTokenProvider(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl pushTokenProviderImpl);

    @javax.inject.Singleton
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.session.LogoutObserver bindSubscriptionStateObserver(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver impl);
}
