package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/CardInfo;", "", "", "cardBrand", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "lastFourDigits", "cardImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/CardInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardBrand", "getCardType", "getLastFourDigits", "getCardImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardInfo {
    public static final int $stable = 0;
    private final java.lang.String cardBrand;
    private final java.lang.String cardImageUrl;
    private final java.lang.String cardType;
    private final java.lang.String lastFourDigits;

    public CardInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.cardBrand = str;
        this.cardType = str2;
        this.lastFourDigits = str3;
        this.cardImageUrl = str4;
    }

    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardBrand;
        java.lang.String str2 = this.cardType;
        java.lang.String str3 = this.lastFourDigits;
        java.lang.String str4 = this.cardImageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardInfo(cardBrand=");
        sb.append(str);
        sb.append(", cardType=");
        sb.append(str2);
        sb.append(", lastFourDigits=");
        sb.append(str3);
        sb.append(", cardImageUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.cardBrand.hashCode() * 31) + this.cardType.hashCode()) * 31) + this.lastFourDigits.hashCode()) * 31) + this.cardImageUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo cardInfo = (com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardBrand, cardInfo.cardBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, cardInfo.cardType) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, cardInfo.lastFourDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardImageUrl, cardInfo.cardImageUrl);
    }

    public final com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo copy(java.lang.String cardBrand, java.lang.String cardType, java.lang.String lastFourDigits, java.lang.String cardImageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageUrl, "");
        return new com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo(cardBrand, cardType, lastFourDigits, cardImageUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardImageUrl() {
        return this.cardImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo cardInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardInfo.cardBrand;
        }
        if ((i & 2) != 0) {
            str2 = cardInfo.cardType;
        }
        if ((i & 4) != 0) {
            str3 = cardInfo.lastFourDigits;
        }
        if ((i & 8) != 0) {
            str4 = cardInfo.cardImageUrl;
        }
        return cardInfo.copy(str, str2, str3, str4);
    }
}
