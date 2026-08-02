package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class AppIdentityModule_ProvideTapToPayAppGuidFactory implements dagger.internal.Factory<kotlin.Lazy<java.lang.String>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighSpeedVideoSizes;

    private AppIdentityModule_ProvideTapToPayAppGuidFactory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.Lazy<java.lang.String> get() {
        return provideTapToPayAppGuid(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.AppIdentityModule_ProvideTapToPayAppGuidFactory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider) {
        return new com.paypal.oslo.feature.taptopay.di.AppIdentityModule_ProvideTapToPayAppGuidFactory(provider);
    }

    public static kotlin.Lazy<java.lang.String> provideTapToPayAppGuid(com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        return (kotlin.Lazy) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.AppIdentityModule.INSTANCE.provideTapToPayAppGuid(appInformation));
    }
}
