package com.paypal.oslo.core.telemetry.analytics.transformer;

/* loaded from: classes10.dex */
public final class TransformationDelegate_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate_Factory create() {
        return com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate newInstance() {
        return new com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate_Factory();

        private InstanceHolder() {
        }
    }
}
