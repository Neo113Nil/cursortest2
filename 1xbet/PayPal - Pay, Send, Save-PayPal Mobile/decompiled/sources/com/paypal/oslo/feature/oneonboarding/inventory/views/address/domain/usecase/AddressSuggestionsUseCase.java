package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/usecase/AddressSuggestionsUseCase;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/repository/AddressRepository;", "addressRepository", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/repository/AddressRepository;)V", "", "query", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;", "matchingScope", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/error/ApiCallError;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;", "invoke-AttygxE", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressMatchingScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/repository/AddressRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSuggestionsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AddressSuggestionsUseCase(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository addressRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        this.Camera2StreamConfigurationMap = addressRepository;
    }

    /* renamed from: invoke-AttygxE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m16924invokeAttygxE$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase addressSuggestionsUseCase, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            addressMatchingScope = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope.LOCALITY_LEVEL;
        }
        return addressSuggestionsUseCase.m16925invokeAttygxE(str, str2, addressMatchingScope, continuation);
    }

    /* renamed from: invoke-AttygxE, reason: not valid java name */
    public final java.lang.Object m16925invokeAttygxE(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion>>> continuation) {
        return this.Camera2StreamConfigurationMap.mo16894requestAddressSuggestionsAttygxE(str, str2, addressMatchingScope, continuation);
    }
}
