package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data;

/* loaded from: classes13.dex */
public final class StepUpViewComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.data.StepUpViewComponentParser_Factory();

        private InstanceHolder() {
        }
    }
}
