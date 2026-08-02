package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes10.dex */
public final class TtfdReporter_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter_Factory create() {
        return com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter newInstance() {
        return new com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.telemetry.vendors.datadog.TtfdReporter_Factory();

        private InstanceHolder() {
        }
    }
}
