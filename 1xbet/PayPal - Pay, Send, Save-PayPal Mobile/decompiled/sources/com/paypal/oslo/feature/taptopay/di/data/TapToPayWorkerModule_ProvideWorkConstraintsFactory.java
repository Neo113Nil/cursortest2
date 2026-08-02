package com.paypal.oslo.feature.taptopay.di.data;

/* loaded from: classes5.dex */
public final class TapToPayWorkerModule_ProvideWorkConstraintsFactory implements dagger.internal.Factory<androidx.work.Constraints> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.work.Constraints get() {
        return provideWorkConstraints();
    }

    public static com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule_ProvideWorkConstraintsFactory create() {
        return com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule_ProvideWorkConstraintsFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static androidx.work.Constraints provideWorkConstraints() {
        return (androidx.work.Constraints) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule.INSTANCE.provideWorkConstraints());
    }

    /* loaded from: classes15.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule_ProvideWorkConstraintsFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule_ProvideWorkConstraintsFactory();

        private InstanceHolder() {
        }
    }
}
