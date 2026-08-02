package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardFormDataDTO;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardholderDTO;", "cardholder", "", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/SavedAddressDTO;", "addresses", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;", "prefillCardInfo", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardholderDTO;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardholderDTO;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardholderDTO;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardFormDataDTO;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/CardholderDTO;", "getCardholder", "Ljava/util/List;", "getAddresses", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;", "getPrefillCardInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardFormDataDTO {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> addresses;
    private final com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholder;
    private final com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfo;

    public CardFormDataDTO(com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholderDTO, java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> list, com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO) {
        this.cardholder = cardholderDTO;
        this.addresses = list;
        this.prefillCardInfo = prefillCardInfoDTO;
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO getCardholder() {
        return this.cardholder;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> getAddresses() {
        return this.addresses;
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO getPrefillCardInfo() {
        return this.prefillCardInfo;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholderDTO = this.cardholder;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> list = this.addresses;
        com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO = this.prefillCardInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardFormDataDTO(cardholder=");
        sb.append(cardholderDTO);
        sb.append(", addresses=");
        sb.append(list);
        sb.append(", prefillCardInfo=");
        sb.append(prefillCardInfoDTO);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholderDTO = this.cardholder;
        int hashCode = cardholderDTO == null ? 0 : cardholderDTO.hashCode();
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> list = this.addresses;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO = this.prefillCardInfo;
        return (((hashCode * 31) + hashCode2) * 31) + (prefillCardInfoDTO != null ? prefillCardInfoDTO.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO cardFormDataDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardholder, cardFormDataDTO.cardholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, cardFormDataDTO.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefillCardInfo, cardFormDataDTO.prefillCardInfo);
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO copy(com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholder, java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> addresses, com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfo) {
        return new com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO(cardholder, addresses, prefillCardInfo);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO getPrefillCardInfo() {
        return this.prefillCardInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.SavedAddressDTO> component2() {
        return this.addresses;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO getCardholder() {
        return this.cardholder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO copy$default(com.paypal.oslo.feature.inappcheckout.data.dto.CardFormDataDTO cardFormDataDTO, com.paypal.oslo.feature.inappcheckout.data.dto.CardholderDTO cardholderDTO, java.util.List list, com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardholderDTO = cardFormDataDTO.cardholder;
        }
        if ((i & 2) != 0) {
            list = cardFormDataDTO.addresses;
        }
        if ((i & 4) != 0) {
            prefillCardInfoDTO = cardFormDataDTO.prefillCardInfo;
        }
        return cardFormDataDTO.copy(cardholderDTO, list, prefillCardInfoDTO);
    }
}
