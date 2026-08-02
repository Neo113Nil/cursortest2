package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0354DebitCardCreationSuccessScreenViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> getHighSpeedVideoSizes;

    private C0354DebitCardCreationSuccessScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z) {
        return newInstance(debitCardProductName, z, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenReducer debitCardCreationSuccessScreenReducer, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel(debitCardProductName, z, debitCardCreationSuccessScreenReducer, userStore, debitCardWebViewUrlBuilder);
    }
}
