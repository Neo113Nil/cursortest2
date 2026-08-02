package com.paypal.oslo.feature.revolvingcreditservicing.event;

/* loaded from: classes14.dex */
public final class DataInvalidationEventBus_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus_Factory();

        private InstanceHolder() {
        }
    }
}
