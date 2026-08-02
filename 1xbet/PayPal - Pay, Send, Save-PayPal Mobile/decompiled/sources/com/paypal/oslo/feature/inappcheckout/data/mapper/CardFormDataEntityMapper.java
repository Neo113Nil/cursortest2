package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/CardFormDataEntityMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardFormDataDTO;", "dto", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "convert", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardFormDataDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardFormDataEntityMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardFormDataEntityMapper() {
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity convert(com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO dto) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderName cardholderName;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dto, "");
        com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholder = dto.getCardholder();
        com.paypal.oslo.feature.inappcheckout.domain.entity.PrefillCardInfo prefillCardInfo = null;
        if (cardholder != null) {
            java.lang.String givenName = cardholder.getGivenName();
            if (givenName == null) {
                givenName = "";
            }
            java.lang.String surname = cardholder.getSurname();
            if (surname == null) {
                surname = "";
            }
            cardholderName = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderName(givenName, surname);
        } else {
            cardholderName = null;
        }
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> addresses = dto.getAddresses();
        if (addresses != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> list = addresses;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO savedAddressDTO : list) {
                java.lang.String id = savedAddressDTO.getId();
                java.lang.String str = id == null ? "" : id;
                java.lang.String addressLine1 = savedAddressDTO.getAddressLine1();
                java.lang.String str2 = addressLine1 == null ? "" : addressLine1;
                java.lang.String addressLine2 = savedAddressDTO.getAddressLine2();
                java.lang.String str3 = addressLine2 == null ? "" : addressLine2;
                java.lang.String adminArea2 = savedAddressDTO.getAdminArea2();
                java.lang.String str4 = adminArea2 == null ? "" : adminArea2;
                java.lang.String adminArea1 = savedAddressDTO.getAdminArea1();
                java.lang.String str5 = adminArea1 == null ? "" : adminArea1;
                java.lang.String postalCode = savedAddressDTO.getPostalCode();
                arrayList2.add(new com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress(str, (java.lang.String) null, str2, str3, str4, str5, postalCode == null ? "" : postalCode, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfo2 = dto.getPrefillCardInfo();
        if (prefillCardInfo2 != null) {
            java.lang.String last4Digits = prefillCardInfo2.getLast4Digits();
            if (last4Digits == null) {
                last4Digits = "";
            }
            java.lang.String cardBrand = prefillCardInfo2.getCardBrand();
            prefillCardInfo = new com.paypal.oslo.feature.inappcheckout.domain.entity.PrefillCardInfo(last4Digits, cardBrand != null ? cardBrand : "");
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity(cardholderName, arrayList, prefillCardInfo);
    }
}
