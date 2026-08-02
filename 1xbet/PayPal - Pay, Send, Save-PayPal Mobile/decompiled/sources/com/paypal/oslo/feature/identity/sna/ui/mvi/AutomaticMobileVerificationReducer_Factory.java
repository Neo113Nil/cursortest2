package com.paypal.oslo.feature.identity.sna.ui.mvi;

/* loaded from: classes13.dex */
public final class AutomaticMobileVerificationReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer_Factory create() {
        return com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer newInstance() {
        return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer_Factory();

        private InstanceHolder() {
        }
    }
}
