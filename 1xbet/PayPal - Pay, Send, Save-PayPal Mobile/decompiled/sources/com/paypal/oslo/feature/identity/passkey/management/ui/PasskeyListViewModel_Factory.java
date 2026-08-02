package com.paypal.oslo.feature.identity.passkey.management.ui;

/* loaded from: classes12.dex */
public final class PasskeyListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase> getHighSpeedVideoSizes;

    private PasskeyListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider4) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel newInstance(com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase passkeyListUseCase, com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase passkeyDeleteUseCase, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel(passkeyListUseCase, passkeyDeleteUseCase, passkeyCreateUseCase, appStorage);
    }
}
