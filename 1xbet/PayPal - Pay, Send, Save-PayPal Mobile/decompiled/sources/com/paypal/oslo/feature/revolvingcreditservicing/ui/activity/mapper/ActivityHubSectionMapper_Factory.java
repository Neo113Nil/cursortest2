package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

/* loaded from: classes14.dex */
public final class ActivityHubSectionMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> getHighSpeedVideoFpsRangesFor;

    private ActivityHubSectionMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper(activityHubTransactionItemUiModelMapper);
    }
}
