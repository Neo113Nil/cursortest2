package com.paypal.oslo.feature.shaketoreport.di;

/* loaded from: classes5.dex */
public final class ShakeToReportModule_ProvideJson$shake_to_report_prodReleaseFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideJson$shake_to_report_prodRelease();
    }

    public static com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideJson$shake_to_report_prodReleaseFactory create() {
        return com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideJson$shake_to_report_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.serialization.json.Json provideJson$shake_to_report_prodRelease() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule.INSTANCE.provideJson$shake_to_report_prodRelease());
    }

    /* loaded from: classes14.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideJson$shake_to_report_prodReleaseFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideJson$shake_to_report_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}
