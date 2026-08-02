package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory getHighSpeedVideoSizes;

    private ActivityViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory c0386ActivityViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0386ActivityViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        return this.getHighSpeedVideoSizes.get(activityHubArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory c0386ActivityViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel_Factory_Impl(c0386ActivityViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory c0386ActivityViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel_Factory_Impl(c0386ActivityViewModel_Factory));
    }
}
