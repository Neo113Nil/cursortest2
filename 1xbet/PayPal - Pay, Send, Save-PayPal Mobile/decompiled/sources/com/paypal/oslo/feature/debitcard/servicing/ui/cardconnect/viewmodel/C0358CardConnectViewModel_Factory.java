package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0358CardConnectViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer> getHighSpeedVideoSizes;

    private C0358CardConnectViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), debitCardProductName, str, this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer> provider3) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel newInstance(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer cardConnectReducer) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel(cardConnectApi, remoteConfigConfig, debitCardProductName, str, cardConnectReducer);
    }
}
