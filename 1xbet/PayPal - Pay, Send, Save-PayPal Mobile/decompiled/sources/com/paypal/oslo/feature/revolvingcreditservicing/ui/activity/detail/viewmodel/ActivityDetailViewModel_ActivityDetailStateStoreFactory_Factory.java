package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityDetailViewModel_ActivityDetailStateStoreFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> getHighSpeedVideoSizes;

    private ActivityDetailViewModel_ActivityDetailStateStoreFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel_ActivityDetailStateStoreFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory> provider5) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel_ActivityDetailStateStoreFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailReducer activityDetailReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware activityDetailInitializerMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory(activityDetailReducer, cancelRepaymentUseCase, dataInvalidationEventBus, activityDetailInitializerMiddleware, factory);
    }
}
