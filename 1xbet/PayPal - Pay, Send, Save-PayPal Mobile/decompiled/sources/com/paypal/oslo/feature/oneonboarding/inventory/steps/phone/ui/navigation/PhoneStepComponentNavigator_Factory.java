package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation;

/* loaded from: classes13.dex */
public final class PhoneStepComponentNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.navigation.PhoneStepComponentNavigator_Factory();

        private InstanceHolder() {
        }
    }
}
