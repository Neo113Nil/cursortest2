package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/di/AddressModule;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/data/repository/AddressRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;", "bindAddressRepository", "(Lcom/paypal/oslo/feature/onboarding/signup/address/data/repository/AddressRepositoryImpl;)Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/address/data/service/AddressServiceImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;", "bindAddressService", "(Lcom/paypal/oslo/feature/onboarding/signup/address/data/service/AddressServiceImpl;)Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface AddressModule {
    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository bindAddressRepository(com.paypal.oslo.feature.onboarding.signup.address.data.repository.AddressRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService bindAddressService(com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl impl);
}
