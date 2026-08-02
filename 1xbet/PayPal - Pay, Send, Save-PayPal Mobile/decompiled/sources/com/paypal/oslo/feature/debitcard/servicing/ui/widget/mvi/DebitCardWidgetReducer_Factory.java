package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

/* loaded from: classes12.dex */
public final class DebitCardWidgetReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer_Factory create() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer newInstance() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer_Factory();

        private InstanceHolder() {
        }
    }
}
