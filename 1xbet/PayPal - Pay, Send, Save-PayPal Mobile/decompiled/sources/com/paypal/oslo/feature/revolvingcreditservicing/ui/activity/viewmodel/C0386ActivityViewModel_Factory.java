package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0386ActivityViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory> Camera2StreamConfigurationMap;

    private C0386ActivityViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), activityHubArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.C0386ActivityViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.ActivityStateStoreFactory activityStateStoreFactory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel(activityStateStoreFactory, activityHubArgs);
    }
}
