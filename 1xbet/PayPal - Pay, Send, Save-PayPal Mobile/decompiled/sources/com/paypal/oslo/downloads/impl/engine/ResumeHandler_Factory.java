package com.paypal.oslo.downloads.impl.engine;

/* loaded from: classes10.dex */
public final class ResumeHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.engine.ResumeHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.engine.ResumeHandler get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.engine.ResumeHandler_Factory create() {
        return com.paypal.oslo.downloads.impl.engine.ResumeHandler_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.downloads.impl.engine.ResumeHandler newInstance() {
        return new com.paypal.oslo.downloads.impl.engine.ResumeHandler();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.engine.ResumeHandler_Factory getHighSpeedVideoSizes = new com.paypal.oslo.downloads.impl.engine.ResumeHandler_Factory();

        private InstanceHolder() {
        }
    }
}
