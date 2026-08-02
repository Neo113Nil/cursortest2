package com.paypal.oslo.feature.identity.passkey.management.ui;

/* loaded from: classes12.dex */
public final class PasskeyManagementViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> Camera2StreamConfigurationMap;

    private PasskeyManagementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel newInstance(com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase passkeyListUseCase) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel(passkeyListUseCase);
    }
}
