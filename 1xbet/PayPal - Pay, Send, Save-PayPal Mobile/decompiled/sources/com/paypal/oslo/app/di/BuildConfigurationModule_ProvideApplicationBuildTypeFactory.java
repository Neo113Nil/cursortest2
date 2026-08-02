package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class BuildConfigurationModule_ProvideApplicationBuildTypeFactory implements dagger.internal.Factory<java.lang.String> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return provideApplicationBuildType();
    }

    public static com.paypal.oslo.app.di.BuildConfigurationModule_ProvideApplicationBuildTypeFactory create() {
        return com.paypal.oslo.app.di.BuildConfigurationModule_ProvideApplicationBuildTypeFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static java.lang.String provideApplicationBuildType() {
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.BuildConfigurationModule.INSTANCE.provideApplicationBuildType());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.BuildConfigurationModule_ProvideApplicationBuildTypeFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.app.di.BuildConfigurationModule_ProvideApplicationBuildTypeFactory();

        private InstanceHolder() {
        }
    }
}
