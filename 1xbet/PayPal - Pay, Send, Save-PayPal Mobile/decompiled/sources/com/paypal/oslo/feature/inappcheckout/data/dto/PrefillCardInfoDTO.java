package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;", "", "", "last4Digits", "cardBrand", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/PrefillCardInfoDTO;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLast4Digits", "getCardBrand"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PrefillCardInfoDTO {
    public static final int $stable = 0;
    private final java.lang.String cardBrand;
    private final java.lang.String last4Digits;

    public PrefillCardInfoDTO(java.lang.String str, java.lang.String str2) {
        this.last4Digits = str;
        this.cardBrand = str2;
    }

    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.last4Digits;
        java.lang.String str2 = this.cardBrand;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrefillCardInfoDTO(last4Digits=");
        sb.append(str);
        sb.append(", cardBrand=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.last4Digits;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cardBrand;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.last4Digits, prefillCardInfoDTO.last4Digits) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardBrand, prefillCardInfoDTO.cardBrand);
    }

    public final com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO copy(java.lang.String last4Digits, java.lang.String cardBrand) {
        return new com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO(last4Digits, cardBrand);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO copy$default(com.paypal.oslo.feature.inappcheckout.data.dto.PrefillCardInfoDTO prefillCardInfoDTO, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = prefillCardInfoDTO.last4Digits;
        }
        if ((i & 2) != 0) {
            str2 = prefillCardInfoDTO.cardBrand;
        }
        return prefillCardInfoDTO.copy(str, str2);
    }
}
