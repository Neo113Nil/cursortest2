package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeModule;", "", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManagerImpl;", "impl", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "bindAdobeEnvironmentManager", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManagerImpl;)Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushTokenListener;", "Lcom/paypal/oslo/core/telemetry/push/PushTokenListener;", "bindAdobePushTokenListener", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushTokenListener;)Lcom/paypal/oslo/core/telemetry/push/PushTokenListener;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProviderImpl;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;", "bindAdobeProvider", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProviderImpl;)Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeProvider;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManagerImpl;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "bindAdobePushManager", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManagerImpl;)Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface AdobeModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager bindAdobeEnvironmentManager(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProvider bindAdobeProvider(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl impl);

    @dagger.Binds
    com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager bindAdobePushManager(com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.telemetry.push.PushTokenListener bindAdobePushTokenListener(com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener impl);
}
