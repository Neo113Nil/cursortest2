package com.paypal.oslo.feature.identity.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/di/IdentityModule;", "", "Lcom/paypal/oslo/feature/identity/foundation/IdentitySessionImpl;", "impl", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "bindIdentitySession", "(Lcom/paypal/oslo/feature/identity/foundation/IdentitySessionImpl;)Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "Lcom/paypal/oslo/feature/identity/login/IdentityTokenProviderImpl;", "Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "bindIdentityTokenProvider", "(Lcom/paypal/oslo/feature/identity/login/IdentityTokenProviderImpl;)Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "Lcom/paypal/oslo/feature/identity/stepup/StepupChallengeHandlerImpl;", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "bindStepupChallengeHandler", "(Lcom/paypal/oslo/feature/identity/stepup/StepupChallengeHandlerImpl;)Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module(includes = {com.paypal.oslo.feature.identity.foundation.di.FoundationAuthModule.class, com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.class})
/* loaded from: classes12.dex */
public interface IdentityModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.IdentitySession bindIdentitySession(com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.IdentityTokenProvider bindIdentityTokenProvider(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.identity.stepup.StepupChallengeHandler bindStepupChallengeHandler(com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl impl);
}
