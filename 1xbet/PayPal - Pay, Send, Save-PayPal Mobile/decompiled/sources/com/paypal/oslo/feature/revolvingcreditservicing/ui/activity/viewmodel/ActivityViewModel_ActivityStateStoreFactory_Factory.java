package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityViewModel_ActivityStateStoreFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory> getHighSpeedVideoSizes;

    private ActivityViewModel_ActivityStateStoreFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel_ActivityStateStoreFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory> provider5) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel_ActivityStateStoreFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityReducer activityReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware initializeActivityHubMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware loadMoreActivitiesMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware cancelScheduledPaymentMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.ActivityHubObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory(activityReducer, initializeActivityHubMiddleware, loadMoreActivitiesMiddleware, cancelScheduledPaymentMiddleware, factory);
    }
}
