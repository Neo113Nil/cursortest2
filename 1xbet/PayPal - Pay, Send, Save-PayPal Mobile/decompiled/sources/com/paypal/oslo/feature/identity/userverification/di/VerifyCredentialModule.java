package com.paypal.oslo.feature.identity.userverification.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/di/VerifyCredentialModule;", "", "Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyCredentialRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "bindVerifyCredentialRepository", "(Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyCredentialRepositoryImpl;)Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyEmailCredentialRepositoryImpl;", "bindVerifyEmailCredentialRepository", "(Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyEmailCredentialRepositoryImpl;)Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "Lcom/paypal/oslo/feature/identity/userverification/data/repository/GoogleSignUpRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;", "bindGoogleSignUpRepository", "(Lcom/paypal/oslo/feature/identity/userverification/data/repository/GoogleSignUpRepositoryImpl;)Lcom/paypal/oslo/feature/identity/userverification/domain/repository/GoogleSignUpRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface VerifyCredentialModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule.Companion INSTANCE = com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule.Companion.getHighSpeedVideoFpsRanges;

    @dagger.Binds
    com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository bindGoogleSignUpRepository(com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository bindVerifyCredentialRepository(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository bindVerifyEmailCredentialRepository(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/di/VerifyCredentialModule$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.userverification.di.VerifyCredentialModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
            return kotlinx.coroutines.Dispatchers.getDefault();
        }
    }
}
