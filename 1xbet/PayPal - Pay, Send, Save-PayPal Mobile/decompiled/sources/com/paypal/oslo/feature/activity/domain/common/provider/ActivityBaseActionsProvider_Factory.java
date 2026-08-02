package com.paypal.oslo.feature.activity.domain.common.provider;

/* loaded from: classes10.dex */
public final class ActivityBaseActionsProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler> getHighSpeedVideoFpsRangesFor;

    private ActivityBaseActionsProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler> provider4) {
        return new com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider newInstance(com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository iActivityActionsRepository, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider, com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler activityNavigationActionOperationHandler, com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityWebKitActionOperationHandler activityWebKitActionOperationHandler) {
        return new com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider(iActivityActionsRepository, activityDeepLinkNavigationProvider, activityNavigationActionOperationHandler, activityWebKitActionOperationHandler);
    }
}
