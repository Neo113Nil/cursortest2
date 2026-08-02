package com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel;

/* loaded from: classes13.dex */
public final class ThanksViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer> getHighSpeedVideoSizes;

    private ThanksViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer> provider) {
        return new com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer thanksReducer) {
        return new com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel(thanksReducer);
    }
}
