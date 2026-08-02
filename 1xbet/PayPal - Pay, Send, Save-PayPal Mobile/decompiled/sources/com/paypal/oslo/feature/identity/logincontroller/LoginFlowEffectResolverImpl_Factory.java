package com.paypal.oslo.feature.identity.logincontroller;

/* loaded from: classes12.dex */
public final class LoginFlowEffectResolverImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl_Factory create() {
        return com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl newInstance() {
        return new com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.logincontroller.LoginFlowEffectResolverImpl_Factory();

        private InstanceHolder() {
        }
    }
}
