package com.paypal.oslo.feature.onboarding.signup.address.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/data/repository/AddressRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;", "addressService", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;)V", "", "query", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "requestAddressSuggestions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeId", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "requestAddressDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/service/AddressService;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AddressRepositoryImpl(com.paypal.oslo.feature.onboarding.signup.address.domain.service.AddressService addressService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressService, "");
        this.Camera2StreamConfigurationMap = addressService;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository
    public final java.lang.Object requestAddressSuggestions(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion>>> continuation) {
        return this.Camera2StreamConfigurationMap.requestAddressSuggestions(str, str2, continuation);
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository
    public final java.lang.Object requestAddressDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.core.i18n.domain.model.Address>> continuation) {
        return this.Camera2StreamConfigurationMap.requestAddressDetails(str, continuation);
    }
}
