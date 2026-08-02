package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

/* loaded from: classes12.dex */
public final class ShowDebitCardReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer_Factory create() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer newInstance() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer_Factory();

        private InstanceHolder() {
        }
    }
}
