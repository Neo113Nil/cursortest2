package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class MakePrimaryEmailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryEmailUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> getHighSpeedVideoSizes;

    private MakePrimaryEmailViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider3) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryEmailUseCase makePrimaryEmailUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel(context, makePrimaryEmailUseCase, emailErrorHandler);
    }
}
