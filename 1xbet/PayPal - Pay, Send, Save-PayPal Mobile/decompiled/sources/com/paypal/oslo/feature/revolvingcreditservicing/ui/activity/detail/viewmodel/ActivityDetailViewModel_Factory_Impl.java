package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityDetailViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory Camera2StreamConfigurationMap;

    private ActivityDetailViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory c0385ActivityDetailViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0385ActivityDetailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
        return this.Camera2StreamConfigurationMap.get(activityDetailDestinationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory c0385ActivityDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel_Factory_Impl(c0385ActivityDetailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory c0385ActivityDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel_Factory_Impl(c0385ActivityDetailViewModel_Factory));
    }
}
