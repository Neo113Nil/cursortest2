package com.paypal.oslo.feature.identity.challenges.shared.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H!¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH!¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/di/SharedChallengeModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/NotifyChallengeRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;", "bindNotifyChallengeRepository$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/NotifyChallengeRepositoryImpl;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;", "Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/ValidateChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/ValidateChallengeRepository;", "bindValidateChallengeRepository$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/ValidateChallengeRepositoryImpl;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/ValidateChallengeRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public abstract class SharedChallengeModule {
    public static final int $stable = 0;

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository bindNotifyChallengeRepository$identity_prodRelease(com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository bindValidateChallengeRepository$identity_prodRelease(com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl impl);
}
