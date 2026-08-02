package com.paypal.oslo.feature.identity.challenges.shared.di;

/* loaded from: classes5.dex */
public final class ChallengeModule_ProvideNotifyChallengeInputBuilderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> get() {
        return provideNotifyChallengeInputBuilder();
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideNotifyChallengeInputBuilderFactory create() {
        return com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideNotifyChallengeInputBuilderFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideNotifyChallengeInputBuilder() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule.INSTANCE.provideNotifyChallengeInputBuilder());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideNotifyChallengeInputBuilderFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule_ProvideNotifyChallengeInputBuilderFactory();

        private InstanceHolder() {
        }
    }
}
