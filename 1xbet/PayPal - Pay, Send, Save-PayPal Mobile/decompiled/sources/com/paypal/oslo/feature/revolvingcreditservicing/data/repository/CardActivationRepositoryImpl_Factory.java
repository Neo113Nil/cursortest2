package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class CardActivationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
