package com.paypal.oslo.feature.debitcard.servicing.ui.widget;

/* loaded from: classes12.dex */
public final class DebitCardWidgetProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl_Factory create() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl newInstance() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
