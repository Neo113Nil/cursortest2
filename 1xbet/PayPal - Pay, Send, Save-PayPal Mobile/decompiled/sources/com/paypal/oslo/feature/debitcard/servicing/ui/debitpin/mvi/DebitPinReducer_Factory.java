package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

/* loaded from: classes12.dex */
public final class DebitPinReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer_Factory create() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer newInstance() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer_Factory();

        private InstanceHolder() {
        }
    }
}
