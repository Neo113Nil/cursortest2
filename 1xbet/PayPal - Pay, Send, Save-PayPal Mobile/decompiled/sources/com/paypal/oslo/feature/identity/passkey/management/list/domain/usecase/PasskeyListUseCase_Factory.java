package com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase;

/* loaded from: classes12.dex */
public final class PasskeyListUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository> getHighSpeedVideoFpsRanges;

    private PasskeyListUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase newInstance(com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository passkeyListRepository) {
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase(passkeyListRepository);
    }
}
