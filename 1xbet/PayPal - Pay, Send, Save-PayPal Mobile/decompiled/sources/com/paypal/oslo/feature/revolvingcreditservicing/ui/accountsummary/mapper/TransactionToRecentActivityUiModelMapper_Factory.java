package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

/* loaded from: classes14.dex */
public final class TransactionToRecentActivityUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> getHighSpeedVideoFpsRanges;

    private TransactionToRecentActivityUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper(activityHubTransactionItemUiModelMapper);
    }
}
