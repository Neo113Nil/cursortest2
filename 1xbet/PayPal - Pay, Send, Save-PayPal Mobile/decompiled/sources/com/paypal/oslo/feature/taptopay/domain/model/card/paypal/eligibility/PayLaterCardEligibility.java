package com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterCardEligibility;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibility;", "", "isEligible", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "id", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "type", "", "brand", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "last4", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "cardArtCollection", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;", "payLaterData", "<init>", "(ZLcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "component8", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;", "copy", "(ZLcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterCardEligibility;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "getId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "getType", "Ljava/lang/String;", "getBrand", "getDescription", "getLast4", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "getCardArtCollection", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;", "getPayLaterData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayLaterCardEligibility implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility {
    public static final int $stable = 0;
    private final java.lang.String brand;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId id;
    private final boolean isEligible;
    private final java.lang.String last4;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type;

    public PayLaterCardEligibility(boolean z, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        this.isEligible = z;
        this.id = payPalCardId;
        this.type = cardType;
        this.brand = str;
        this.description = str2;
        this.last4 = str3;
        this.cardArtCollection = cardArtCollection;
        this.payLaterData = payLaterData;
    }

    public /* synthetic */ PayLaterCardEligibility(boolean z, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, payPalCardId, cardType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : cardArtCollection, (i & 128) != 0 ? null : payLaterData);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final boolean isEligible() {
        return this.isEligible;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final java.lang.String getBrand() {
        return this.brand;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final java.lang.String getDescription() {
        return this.description;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final java.lang.String getLast4() {
        return this.last4;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getCardArtCollection() {
        return this.cardArtCollection;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    public final java.lang.String toString() {
        boolean z = this.isEligible;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = this.id;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.type;
        java.lang.String str = this.brand;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.last4;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.cardArtCollection;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData = this.payLaterData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayLaterCardEligibility(isEligible=");
        sb.append(z);
        sb.append(", id=");
        sb.append(payPalCardId);
        sb.append(", type=");
        sb.append(cardType);
        sb.append(", brand=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", last4=");
        sb.append(str3);
        sb.append(", cardArtCollection=");
        sb.append(cardArtCollection);
        sb.append(", payLaterData=");
        sb.append(payLaterData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEligible);
        int hashCode2 = this.id.hashCode();
        int hashCode3 = this.type.hashCode();
        java.lang.String str = this.brand;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.last4;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.cardArtCollection;
        int hashCode7 = cardArtCollection == null ? 0 : cardArtCollection.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData = this.payLaterData;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (payLaterData != null ? payLaterData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility payLaterCardEligibility = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility) other;
        return this.isEligible == payLaterCardEligibility.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.id, payLaterCardEligibility.id) && this.type == payLaterCardEligibility.type && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, payLaterCardEligibility.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, payLaterCardEligibility.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.last4, payLaterCardEligibility.last4) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtCollection, payLaterCardEligibility.cardArtCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.payLaterData, payLaterCardEligibility.payLaterData);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility copy(boolean isEligible, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId id, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type, java.lang.String brand, java.lang.String description, java.lang.String last4, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility(isEligible, id, type, brand, description, last4, cardArtCollection, payLaterData);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getCardArtCollection() {
        return this.cardArtCollection;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLast4() {
        return this.last4;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }
}
