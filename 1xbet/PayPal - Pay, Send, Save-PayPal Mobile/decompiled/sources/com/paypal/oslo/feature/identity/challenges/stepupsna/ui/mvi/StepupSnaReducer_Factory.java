package com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi;

/* loaded from: classes12.dex */
public final class StepupSnaReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer_Factory create() {
        return com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer newInstance() {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer_Factory();

        private InstanceHolder() {
        }
    }
}
