package com.paypal.oslo.core.i18n.domain.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Ljava/util/Locale;", "locale", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/AddressMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;", "getAddressMetadata", "(Ljava/lang/String;Ljava/util/Locale;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AddressRepository {
    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> getAddressMetadata(java.lang.String country, java.util.Locale locale);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ kotlinx.coroutines.flow.Flow getAddressMetadata$default(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAddressMetadata");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            locale = null;
        }
        return addressRepository.getAddressMetadata(str, locale);
    }
}
