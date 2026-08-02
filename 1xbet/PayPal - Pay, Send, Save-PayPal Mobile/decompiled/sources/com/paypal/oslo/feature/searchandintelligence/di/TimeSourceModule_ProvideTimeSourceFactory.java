package com.paypal.oslo.feature.searchandintelligence.di;

/* loaded from: classes14.dex */
public final class TimeSourceModule_ProvideTimeSourceFactory implements dagger.internal.Factory<kotlin.time.TimeSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.time.TimeSource get() {
        return provideTimeSource();
    }

    public static com.paypal.oslo.feature.searchandintelligence.di.TimeSourceModule_ProvideTimeSourceFactory create() {
        return com.paypal.oslo.feature.searchandintelligence.di.TimeSourceModule_ProvideTimeSourceFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.time.TimeSource provideTimeSource() {
        return (kotlin.time.TimeSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.searchandintelligence.di.TimeSourceModule.INSTANCE.provideTimeSource());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.di.TimeSourceModule_ProvideTimeSourceFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.searchandintelligence.di.TimeSourceModule_ProvideTimeSourceFactory();

        private InstanceHolder() {
        }
    }
}
