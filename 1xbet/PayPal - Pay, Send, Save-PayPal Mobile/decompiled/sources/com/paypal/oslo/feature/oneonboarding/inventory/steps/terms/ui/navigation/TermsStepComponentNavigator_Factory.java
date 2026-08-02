package com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation;

/* loaded from: classes13.dex */
public final class TermsStepComponentNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.ui.navigation.TermsStepComponentNavigator_Factory();

        private InstanceHolder() {
        }
    }
}
