package com.paypal.oslo.feature.businesscustomers.data.di;

/* loaded from: classes11.dex */
public final class CustomersEventsBusModule_BindCustomersEventsBusFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus get() {
        return bindCustomersEventsBus();
    }

    public static com.paypal.oslo.feature.businesscustomers.data.di.CustomersEventsBusModule_BindCustomersEventsBusFactory create() {
        return com.paypal.oslo.feature.businesscustomers.data.di.CustomersEventsBusModule_BindCustomersEventsBusFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus bindCustomersEventsBus() {
        return (com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesscustomers.data.di.CustomersEventsBusModule.INSTANCE.bindCustomersEventsBus());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesscustomers.data.di.CustomersEventsBusModule_BindCustomersEventsBusFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.businesscustomers.data.di.CustomersEventsBusModule_BindCustomersEventsBusFactory();

        private InstanceHolder() {
        }
    }
}
