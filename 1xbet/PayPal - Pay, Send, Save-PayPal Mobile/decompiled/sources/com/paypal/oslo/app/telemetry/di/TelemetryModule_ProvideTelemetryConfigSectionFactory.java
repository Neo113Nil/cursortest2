package com.paypal.oslo.app.telemetry.di;

/* loaded from: classes4.dex */
public final class TelemetryModule_ProvideTelemetryConfigSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver> getHighSpeedVideoSizes;

    private TelemetryModule_ProvideTelemetryConfigSectionFactory(dagger.internal.Provider<com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return provideTelemetryConfigSection(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.telemetry.di.TelemetryModule_ProvideTelemetryConfigSectionFactory create(dagger.internal.Provider<com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver> provider) {
        return new com.paypal.oslo.app.telemetry.di.TelemetryModule_ProvideTelemetryConfigSectionFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection provideTelemetryConfigSection(com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver telemetryConfigSectionFieldResolver) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.telemetry.di.TelemetryModule.INSTANCE.provideTelemetryConfigSection(telemetryConfigSectionFieldResolver));
    }
}
