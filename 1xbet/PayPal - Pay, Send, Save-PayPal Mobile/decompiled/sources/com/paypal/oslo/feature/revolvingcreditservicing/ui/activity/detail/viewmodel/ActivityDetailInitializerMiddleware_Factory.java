package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

/* loaded from: classes14.dex */
public final class ActivityDetailInitializerMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper> getHighSpeedVideoFpsRanges;

    private ActivityDetailInitializerMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper activityDetailUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware(activityDetailUiModelMapper);
    }
}
