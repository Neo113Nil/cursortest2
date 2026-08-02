package com.paypal.oslo.feature.taptopay.api.domain.model.card;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardInfo;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "type", "", "brand", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "payLaterData", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "getType", "Ljava/lang/String;", "getBrand", "getDescription", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "getPayLaterData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardInfo {
    private final java.lang.String brand;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType type;

    public CardInfo(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        this.type = cardType;
        this.brand = str;
        this.description = str2;
        this.payLaterData = payLaterData;
    }

    public /* synthetic */ CardInfo(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardType, str, str2, (i & 8) != 0 ? null : payLaterData);
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getType() {
        return this.type;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = this.type;
        java.lang.String str = this.brand;
        java.lang.String str2 = this.description;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData = this.payLaterData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardInfo(type=");
        sb.append(cardType);
        sb.append(", brand=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", payLaterData=");
        sb.append(payLaterData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.brand;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData = this.payLaterData;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (payLaterData != null ? payLaterData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo cardInfo = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo) other;
        return this.type == cardInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, cardInfo.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, cardInfo.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.payLaterData, cardInfo.payLaterData);
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo copy(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType type, java.lang.String brand, java.lang.String description, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo(type, brand, description, payLaterData);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo copy$default(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo cardInfo, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardType = cardInfo.type;
        }
        if ((i & 2) != 0) {
            str = cardInfo.brand;
        }
        if ((i & 4) != 0) {
            str2 = cardInfo.description;
        }
        if ((i & 8) != 0) {
            payLaterData = cardInfo.payLaterData;
        }
        return cardInfo.copy(cardType, str, str2, payLaterData);
    }
}
