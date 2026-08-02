package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

/* loaded from: classes14.dex */
public final class RecentActivitiesSectionUiStateMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper> getHighSpeedVideoFpsRangesFor;

    private RecentActivitiesSectionUiStateMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper transactionToRecentActivityUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper(transactionToRecentActivityUiModelMapper);
    }
}
