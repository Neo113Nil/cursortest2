package com.paypal.oslo.feature.identity.challenges.shared.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/di/ChallengeModule;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "provideNotifyChallengeInputBuilder", "()Lkotlin/jvm/functions/Function1;", "provideValidateChallengeInputBuilder"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class ChallengeModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule INSTANCE = new com.paypal.oslo.feature.identity.challenges.shared.di.ChallengeModule();

    private ChallengeModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideNotifyChallengeInputBuilder() {
        return com.paypal.oslo.feature.identity.challenges.shared.data.NotifyChallengeInputBuilderKt.notifyChallengeInputBuilder();
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideValidateChallengeInputBuilder() {
        return com.paypal.oslo.feature.identity.challenges.shared.data.ValidateChallengeInputBuilderKt.validateChallengeInputBuilder();
    }
}
