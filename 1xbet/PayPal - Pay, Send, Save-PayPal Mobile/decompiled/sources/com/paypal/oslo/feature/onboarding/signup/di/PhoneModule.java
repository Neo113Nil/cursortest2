package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/di/PhoneModule;", "", "Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/PhoneRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;", "bindPhoneRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/PhoneRepositoryImpl;)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/data/service/PhoneServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;", "bindPhoneService", "(Lcom/paypal/oslo/feature/onboarding/signup/data/service/PhoneServiceImpl;)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/service/PhoneService;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/SmsRetrieverRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/SmsRetrieverRepository;", "bindSmsRetrieverRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/SmsRetrieverRepositoryImpl;)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/SmsRetrieverRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface PhoneModule {
    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository bindPhoneRepository(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService bindPhoneService(com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository bindSmsRetrieverRepository(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl impl);
}
