package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi;

/* loaded from: classes12.dex */
public final class StepupCreditCardReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer_Factory create() {
        return com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer newInstance() {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer_Factory();

        private InstanceHolder() {
        }
    }
}
