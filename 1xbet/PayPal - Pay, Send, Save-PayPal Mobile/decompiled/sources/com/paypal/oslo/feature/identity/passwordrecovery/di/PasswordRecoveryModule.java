package com.paypal.oslo.feature.identity.passwordrecovery.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/di/PasswordRecoveryModule;", "", "Lcom/paypal/oslo/feature/identity/passwordrecovery/data/repository/PasswordRecoveryRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;", "bindPasswordRecoveryRepository", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/data/repository/PasswordRecoveryRepositoryImpl;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidatorImpl;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "bindPasswordValidator", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidatorImpl;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface PasswordRecoveryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule.Companion INSTANCE = com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule.Companion.getHighSpeedVideoFpsRanges;

    @dagger.Binds
    com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository bindPasswordRecoveryRepository(com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator bindPasswordValidator(com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidatorImpl impl);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/di/PasswordRecoveryModule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "provideInitiatePasswordRecoveryInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.passwordrecovery.di.PasswordRecoveryModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @dagger.multibindings.IntoSet
        public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> provideInitiatePasswordRecoveryInputBuilder() {
            return com.paypal.oslo.feature.identity.passwordrecovery.data.PasswordRecoveryInputBuildersKt.initiatePasswordRecoveryInputBuilder();
        }
    }
}
