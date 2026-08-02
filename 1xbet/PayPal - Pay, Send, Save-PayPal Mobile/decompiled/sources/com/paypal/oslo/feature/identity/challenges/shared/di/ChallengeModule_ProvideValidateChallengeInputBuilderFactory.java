package com.paypal.oslo.feature.identity.challenges.shared.di;

/* loaded from: classes5.dex */
public final class ChallengeModule_ProvideValidateChallengeInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideValidateChallengeInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideValidateChallengeInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideValidateChallengeInputBuilderFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideValidateChallengeInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule.INSTANCE.provideValidateChallengeInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideValidateChallengeInputBuilderFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideValidateChallengeInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
