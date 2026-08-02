package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class PaymentPlanDisclosureMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper_Factory();

        private InstanceHolder() {
        }
    }
}
