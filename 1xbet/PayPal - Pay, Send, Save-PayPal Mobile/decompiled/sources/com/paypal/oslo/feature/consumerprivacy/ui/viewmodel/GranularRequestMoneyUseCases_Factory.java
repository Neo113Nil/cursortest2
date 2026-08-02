package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class GranularRequestMoneyUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase> getHighSpeedVideoFpsRangesFor;

    private GranularRequestMoneyUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase> provider4) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByNameUseCase updateAllowRequestMoneyByNameUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByEmailUseCase updateAllowRequestMoneyByEmailUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByPhoneUseCase updateAllowRequestMoneyByPhoneUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowRequestMoneyByUsernameUseCase updateAllowRequestMoneyByUsernameUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases(updateAllowRequestMoneyByNameUseCase, updateAllowRequestMoneyByEmailUseCase, updateAllowRequestMoneyByPhoneUseCase, updateAllowRequestMoneyByUsernameUseCase);
    }
}
