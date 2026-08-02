package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class GranularSendMoneyUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase> getHighSpeedVideoSizes;

    private GranularSendMoneyUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase> provider4) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByNameUseCase updateAllowSendMoneyByNameUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByEmailUseCase updateAllowSendMoneyByEmailUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByPhoneUseCase updateAllowSendMoneyByPhoneUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowSendMoneyByUsernameUseCase updateAllowSendMoneyByUsernameUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases(updateAllowSendMoneyByNameUseCase, updateAllowSendMoneyByEmailUseCase, updateAllowSendMoneyByPhoneUseCase, updateAllowSendMoneyByUsernameUseCase);
    }
}
