package com.paypal.oslo.feature.oneonboarding.ui.mvi;

/* loaded from: classes13.dex */
public final class OneOnboardingReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingReducer_Factory();

        private InstanceHolder() {
        }
    }
}
