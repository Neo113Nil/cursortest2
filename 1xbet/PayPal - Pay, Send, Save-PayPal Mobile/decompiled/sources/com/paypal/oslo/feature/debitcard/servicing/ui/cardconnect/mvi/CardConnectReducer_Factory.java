package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

/* loaded from: classes12.dex */
public final class CardConnectReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer_Factory create() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer newInstance() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectReducer_Factory();

        private InstanceHolder() {
        }
    }
}
