package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class AddEditEmailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> getHighSpeedVideoSizes;

    private AddEditEmailViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider5) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailValidator emailValidator, com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase addEmailUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel(context, observeUserStoreUseCase, emailValidator, addEmailUseCase, emailErrorHandler);
    }
}
