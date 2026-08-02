package com.paypal.oslo.feature.checkcapture.di;

/* loaded from: classes5.dex */
public final class FraudForceModule_ProvideFraudForceWrapperFactory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper get() {
        return provideFraudForceWrapper();
    }

    public static com.paypal.oslo.feature.checkcapture.di.FraudForceModule_ProvideFraudForceWrapperFactory create() {
        return com.paypal.oslo.feature.checkcapture.di.FraudForceModule_ProvideFraudForceWrapperFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper provideFraudForceWrapper() {
        return (com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.checkcapture.di.FraudForceModule.INSTANCE.provideFraudForceWrapper());
    }

    /* loaded from: classes11.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.checkcapture.di.FraudForceModule_ProvideFraudForceWrapperFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.checkcapture.di.FraudForceModule_ProvideFraudForceWrapperFactory();

        private InstanceHolder() {
        }
    }
}
