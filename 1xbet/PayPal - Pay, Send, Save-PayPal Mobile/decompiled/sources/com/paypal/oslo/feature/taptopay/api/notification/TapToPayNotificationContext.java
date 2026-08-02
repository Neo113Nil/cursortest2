package com.paypal.oslo.feature.taptopay.api.notification;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "", "isApproved", "", "amount", "", "currencyCode", "networkTokenReference", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;ZDLjava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "component2", "()Z", "component3", "()D", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;ZDLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "getCardType", "Z", "D", "getAmount", "Ljava/lang/String;", "getCurrencyCode", "getNetworkTokenReference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TapToPayNotificationContext {
    private final double amount;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType;
    private final java.lang.String currencyCode;
    private final boolean isApproved;
    private final java.lang.String networkTokenReference;

    public TapToPayNotificationContext(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, boolean z, double d, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.cardType = cardType;
        this.isApproved = z;
        this.amount = d;
        this.currencyCode = str;
        this.networkTokenReference = str2;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getCardType() {
        return this.cardType;
    }

    public final boolean isApproved() {
        return this.isApproved;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = this.cardType;
        boolean z = this.isApproved;
        double d = this.amount;
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.networkTokenReference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TapToPayNotificationContext(cardType=");
        sb.append(cardType);
        sb.append(", isApproved=");
        sb.append(z);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", networkTokenReference=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardType.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isApproved);
        int hashCode3 = java.lang.Double.hashCode(this.amount);
        int hashCode4 = this.currencyCode.hashCode();
        java.lang.String str = this.networkTokenReference;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext tapToPayNotificationContext = (com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext) other;
        return this.cardType == tapToPayNotificationContext.cardType && this.isApproved == tapToPayNotificationContext.isApproved && java.lang.Double.compare(this.amount, tapToPayNotificationContext.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, tapToPayNotificationContext.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, tapToPayNotificationContext.networkTokenReference);
    }

    public final com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext copy(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, boolean isApproved, double amount, java.lang.String currencyCode, java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext(cardType, isApproved, amount, currencyCode, networkTokenReference);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsApproved() {
        return this.isApproved;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getCardType() {
        return this.cardType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext copy$default(com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext tapToPayNotificationContext, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, boolean z, double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardType = tapToPayNotificationContext.cardType;
        }
        if ((i & 2) != 0) {
            z = tapToPayNotificationContext.isApproved;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            d = tapToPayNotificationContext.amount;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            str = tapToPayNotificationContext.currencyCode;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = tapToPayNotificationContext.networkTokenReference;
        }
        return tapToPayNotificationContext.copy(cardType, z2, d2, str3, str2);
    }
}
