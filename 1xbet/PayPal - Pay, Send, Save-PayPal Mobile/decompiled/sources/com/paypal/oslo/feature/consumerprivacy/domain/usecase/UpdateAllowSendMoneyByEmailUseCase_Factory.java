package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateAllowSendMoneyByEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> getHighSpeedVideoFpsRanges;

    private UpdateAllowSendMoneyByEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository granularAccountVisibilityRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase(granularAccountVisibilityRepository);
    }
}
