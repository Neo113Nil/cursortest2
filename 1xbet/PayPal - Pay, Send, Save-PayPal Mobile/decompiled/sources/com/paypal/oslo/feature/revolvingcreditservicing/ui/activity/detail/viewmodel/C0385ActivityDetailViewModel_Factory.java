package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0385ActivityDetailViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory> getHighSpeedVideoFpsRanges;

    private C0385ActivityDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), activityDetailDestinationArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.C0385ActivityDetailViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.ActivityDetailStateStoreFactory activityDetailStateStoreFactory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel(activityDetailStateStoreFactory, activityDetailDestinationArgs);
    }
}
