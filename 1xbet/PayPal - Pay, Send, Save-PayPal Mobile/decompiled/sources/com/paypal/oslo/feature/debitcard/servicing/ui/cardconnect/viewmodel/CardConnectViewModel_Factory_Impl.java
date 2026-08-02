package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel;

/* loaded from: classes12.dex */
public final class CardConnectViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CardConnectViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory c0358CardConnectViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0358CardConnectViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.get(debitCardProductName, str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory c0358CardConnectViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel_Factory_Impl(c0358CardConnectViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.C0358CardConnectViewModel_Factory c0358CardConnectViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel_Factory_Impl(c0358CardConnectViewModel_Factory));
    }
}
