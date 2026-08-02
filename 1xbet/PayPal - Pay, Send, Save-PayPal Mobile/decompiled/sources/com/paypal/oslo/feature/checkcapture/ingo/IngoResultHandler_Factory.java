package com.paypal.oslo.feature.checkcapture.ingo;

/* loaded from: classes11.dex */
public final class IngoResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler_Factory create() {
        return com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler newInstance() {
        return new com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler_Factory();

        private InstanceHolder() {
        }
    }
}
