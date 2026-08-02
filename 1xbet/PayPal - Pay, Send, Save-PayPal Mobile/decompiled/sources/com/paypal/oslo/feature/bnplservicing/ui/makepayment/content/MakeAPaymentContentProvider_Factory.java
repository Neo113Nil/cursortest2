package com.paypal.oslo.feature.bnplservicing.ui.makepayment.content;

/* loaded from: classes11.dex */
public final class MakeAPaymentContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
