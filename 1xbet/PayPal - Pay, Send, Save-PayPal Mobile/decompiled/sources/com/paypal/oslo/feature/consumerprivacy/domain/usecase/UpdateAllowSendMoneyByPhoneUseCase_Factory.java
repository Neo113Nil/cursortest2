package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateAllowSendMoneyByPhoneUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> getHighSpeedVideoSizes;

    private UpdateAllowSendMoneyByPhoneUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository granularAccountVisibilityRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase(granularAccountVisibilityRepository);
    }
}
