package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateAllowSendMoneyByUsernameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> getHighSpeedVideoFpsRangesFor;

    private UpdateAllowSendMoneyByUsernameUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository granularAccountVisibilityRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase(granularAccountVisibilityRepository);
    }
}
