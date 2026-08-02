package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

/* loaded from: classes13.dex */
public final class PhoneConfirmationReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer_Factory create() {
        return com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer newInstance() {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer_Factory();

        private InstanceHolder() {
        }
    }
}
