package com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data;

/* loaded from: classes13.dex */
public final class SubmissionStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.oneonboarding.inventory.steps.submission.data.SubmissionStepComponentParser_Factory();

        private InstanceHolder() {
        }
    }
}
