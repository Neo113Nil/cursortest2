package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCancelActionFromSwitchBackUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoSizes;

    private GetCancelActionFromSwitchBackUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder switchBackActionBuilder) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase(appSwitchSession, switchBackActionBuilder);
    }
}
