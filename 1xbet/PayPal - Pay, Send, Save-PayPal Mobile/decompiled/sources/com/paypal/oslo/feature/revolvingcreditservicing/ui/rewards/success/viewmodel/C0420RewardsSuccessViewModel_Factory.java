package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0420RewardsSuccessViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessReducer> getHighResolutionOutputSizeshNQ4ISI;

    private C0420RewardsSuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsSuccessArgs rewardsSuccessArgs) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), rewardsSuccessArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.C0420RewardsSuccessViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessReducer rewardsSuccessReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsSuccessArgs rewardsSuccessArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel(rewardsSuccessReducer, factory, rewardsSuccessArgs);
    }
}
