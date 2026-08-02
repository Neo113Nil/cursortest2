package com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardSubType;", "subtype", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBrand;", "cardBrand", "", "lastDigits", "rewardId", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardSubType;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBrand;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardSubType;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBrand;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardSubType;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBrand;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardSubType;", "getSubtype", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBrand;", "getCardBrand", "Ljava/lang/String;", "getLastDigits", "getRewardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardFundingFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand cardBrand;
    private final java.lang.String lastDigits;
    private final java.lang.String rewardId;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType subtype;

    public CardFundingFields(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardSubType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.subtype = externalCardSubType;
        this.cardBrand = externalCardBrand;
        this.lastDigits = str;
        this.rewardId = str2;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType getSubtype() {
        return this.subtype;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final java.lang.String getRewardId() {
        return this.rewardId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType = this.subtype;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand = this.cardBrand;
        java.lang.String str = this.lastDigits;
        java.lang.String str2 = this.rewardId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardFundingFields(subtype=");
        sb.append(externalCardSubType);
        sb.append(", cardBrand=");
        sb.append(externalCardBrand);
        sb.append(", lastDigits=");
        sb.append(str);
        sb.append(", rewardId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.subtype.hashCode();
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand = this.cardBrand;
        int hashCode2 = externalCardBrand == null ? 0 : externalCardBrand.hashCode();
        int hashCode3 = this.lastDigits.hashCode();
        java.lang.String str = this.rewardId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields cardFundingFields = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields) other;
        return this.subtype == cardFundingFields.subtype && this.cardBrand == cardFundingFields.cardBrand && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, cardFundingFields.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardId, cardFundingFields.rewardId);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType subtype, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand cardBrand, java.lang.String lastDigits, java.lang.String rewardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtype, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields(subtype, cardBrand, lastDigits, rewardId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType getSubtype() {
        return this.subtype;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields cardFundingFields, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            externalCardSubType = cardFundingFields.subtype;
        }
        if ((i & 2) != 0) {
            externalCardBrand = cardFundingFields.cardBrand;
        }
        if ((i & 4) != 0) {
            str = cardFundingFields.lastDigits;
        }
        if ((i & 8) != 0) {
            str2 = cardFundingFields.rewardId;
        }
        return cardFundingFields.copy(externalCardSubType, externalCardBrand, str, str2);
    }
}
