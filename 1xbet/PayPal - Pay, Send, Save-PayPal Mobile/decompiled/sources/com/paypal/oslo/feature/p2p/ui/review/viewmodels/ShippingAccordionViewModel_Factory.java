package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class ShippingAccordionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
