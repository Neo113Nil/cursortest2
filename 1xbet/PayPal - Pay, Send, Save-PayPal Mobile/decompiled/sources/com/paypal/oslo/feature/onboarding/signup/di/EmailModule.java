package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/di/EmailModule;", "", "Lcom/paypal/oslo/feature/onboarding/signup/email/data/repository/EmailRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "bindEmailRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/email/data/repository/EmailRepositoryImpl;)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/data/service/EmailServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "bindEmailService", "(Lcom/paypal/oslo/feature/onboarding/signup/data/service/EmailServiceImpl;)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "Lcom/paypal/oslo/feature/onboarding/signup/email/data/repository/EmailValidationRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailValidationRepository;", "bindEmailValidationRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/email/data/repository/EmailValidationRepositoryImpl;)Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailValidationRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface EmailModule {
    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository bindEmailRepository(com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService bindEmailService(com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailValidationRepository bindEmailValidationRepository(com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl impl);
}
