package com.paypal.oslo.feature.shaketoreport.ui;

/* loaded from: classes14.dex */
public final class BugReportFlowViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;

    private BugReportFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel(userStore);
    }
}
