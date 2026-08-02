package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0352DebitCardAcquisitionIntroViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory> getHighSpeedVideoSizes;

    private C0352DebitCardAcquisitionIntroViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(debitCardProductName, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer debitCardAcquisitionIntroReducer, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware.Factory factory, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel(debitCardProductName, debitCardAcquisitionIntroReducer, factory, debitCardWebViewUrlBuilder, userStore);
    }
}
