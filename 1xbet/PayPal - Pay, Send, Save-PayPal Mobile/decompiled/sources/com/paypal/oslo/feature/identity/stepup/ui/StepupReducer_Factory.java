package com.paypal.oslo.feature.identity.stepup.ui;

/* loaded from: classes13.dex */
public final class StepupReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.ui.StepupReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.ui.StepupReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.stepup.ui.StepupReducer_Factory create() {
        return com.paypal.oslo.feature.identity.stepup.ui.StepupReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.identity.stepup.ui.StepupReducer newInstance() {
        return new com.paypal.oslo.feature.identity.stepup.ui.StepupReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.stepup.ui.StepupReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.stepup.ui.StepupReducer_Factory();

        private InstanceHolder() {
        }
    }
}
