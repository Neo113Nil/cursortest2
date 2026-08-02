package com.paypal.oslo.feature.identity.stepup.data.mapper;

/* loaded from: classes13.dex */
public final class StepupChallengeMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper_Factory create() {
        return com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper newInstance() {
        return new com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper_Factory();

        private InstanceHolder() {
        }
    }
}
