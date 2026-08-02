package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J<\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/repository/AddressRepository;", "", "", "query", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;", "addressMatchingScope", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;", "requestAddressSuggestions-AttygxE", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAddressSuggestions", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVerificationResult;", "verifyAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AddressRepository {
    /* renamed from: requestAddressSuggestions-AttygxE */
    java.lang.Object mo16894requestAddressSuggestionsAttygxE(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion>>> continuation);

    java.lang.Object verifyAddress(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: requestAddressSuggestions-AttygxE$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m16922requestAddressSuggestionsAttygxE$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository addressRepository, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAddressSuggestions-AttygxE");
        }
        if ((i & 4) != 0) {
            addressMatchingScope = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope.LOCALITY_LEVEL;
        }
        return addressRepository.mo16894requestAddressSuggestionsAttygxE(str, str2, addressMatchingScope, continuation);
    }
}
