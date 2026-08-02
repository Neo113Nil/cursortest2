package com.paypal.oslo.feature.onboarding.signup.address.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/domain/usecase/AddressAutocompleteUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;)V", "", "query", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "invoke-JmYZZyY", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/repository/AddressRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressAutocompleteUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddressAutocompleteUseCase(com.paypal.oslo.feature.onboarding.signup.address.domain.repository.AddressRepository addressRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        this.getHighSpeedVideoSizes = addressRepository;
    }

    /* renamed from: invoke-JmYZZyY, reason: not valid java name */
    public final java.lang.Object m16212invokeJmYZZyY(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion>>> continuation) {
        return this.getHighSpeedVideoSizes.requestAddressSuggestions(str, str2, continuation);
    }
}
