package com.paypal.oslo.feature.shaketoreport.di;

/* loaded from: classes5.dex */
public final class ShakeToReportModule_ProvideSensorManager$shake_to_report_prodReleaseFactory implements dagger.internal.Factory<android.hardware.SensorManager> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ShakeToReportModule_ProvideSensorManager$shake_to_report_prodReleaseFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.hardware.SensorManager get() {
        return provideSensorManager$shake_to_report_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideSensorManager$shake_to_report_prodReleaseFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule_ProvideSensorManager$shake_to_report_prodReleaseFactory(provider);
    }

    public static android.hardware.SensorManager provideSensorManager$shake_to_report_prodRelease(android.content.Context context) {
        return (android.hardware.SensorManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule.INSTANCE.provideSensorManager$shake_to_report_prodRelease(context));
    }
}
