package com.paypal.oslo.core.appidentity.di;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020'H'¢\u0006\u0004\b)\u0010*À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/di/AppIdentityModule;", "", "Lcom/paypal/oslo/core/appidentity/data/AppIdentityProvider;", "appIdentityProvider", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "bindAppIdentity", "(Lcom/paypal/oslo/core/appidentity/data/AppIdentityProvider;)Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "Lcom/paypal/oslo/core/appidentity/data/AppInformationProvider;", "appInformationProvider", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "bindAppInformation", "(Lcom/paypal/oslo/core/appidentity/data/AppInformationProvider;)Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "Lcom/paypal/oslo/core/appidentity/data/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "bindDeviceInformation", "(Lcom/paypal/oslo/core/appidentity/data/DeviceInformationProvider;)Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "Lcom/paypal/oslo/core/appidentity/data/LocaleInformationProvider;", "localeInformationProvider", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "bindLocaleInformation", "(Lcom/paypal/oslo/core/appidentity/data/LocaleInformationProvider;)Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/appidentity/data/DistributionChannelProvider;", "distributionChannelProvider", "Lcom/paypal/oslo/core/appidentity/domain/DistributionChannel;", "bindDistributionChannel", "(Lcom/paypal/oslo/core/appidentity/data/DistributionChannelProvider;)Lcom/paypal/oslo/core/appidentity/domain/DistributionChannel;", "Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationInformationImpl;", "impl", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "bindDeviceRegistrationInformation", "(Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationInformationImpl;)Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationInformation;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "bindDeviceRegistrationWriter", "(Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationInformationImpl;)Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationSignalImpl;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "bindDeviceRegistrationSignal", "(Lcom/paypal/oslo/core/appidentity/data/DeviceRegistrationSignalImpl;)Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "Lcom/paypal/oslo/core/appidentity/data/AppGuidProviderImpl;", "Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;", "bindAppGuidProvider", "(Lcom/paypal/oslo/core/appidentity/data/AppGuidProviderImpl;)Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface AppIdentityModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.di.appguid.AppGuidProvider bindAppGuidProvider(com.paypal.oslo.core.appidentity.data.AppGuidProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.AppIdentity bindAppIdentity(com.paypal.oslo.core.appidentity.data.AppIdentityProvider appIdentityProvider);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.AppInformation bindAppInformation(com.paypal.oslo.core.appidentity.data.AppInformationProvider appInformationProvider);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.DeviceInformation bindDeviceInformation(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider deviceInformationProvider);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationInformation bindDeviceRegistrationInformation(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal bindDeviceRegistrationSignal(com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter bindDeviceRegistrationWriter(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.DistributionChannel bindDistributionChannel(com.paypal.oslo.core.appidentity.data.DistributionChannelProvider distributionChannelProvider);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.appidentity.domain.LocaleInformation bindLocaleInformation(com.paypal.oslo.core.appidentity.data.LocaleInformationProvider localeInformationProvider);
}
