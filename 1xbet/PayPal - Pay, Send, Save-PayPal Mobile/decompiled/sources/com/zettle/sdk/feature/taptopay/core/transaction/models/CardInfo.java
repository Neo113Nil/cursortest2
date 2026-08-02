package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "", "", "cardHolderName", "cardLastDigits", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardHolderName", "getCardLastDigits", "getCardType"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CardInfo {
    private final java.lang.String cardHolderName;
    private final java.lang.String cardLastDigits;
    private final java.lang.String cardType;

    public CardInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.cardHolderName = str;
        this.cardLastDigits = str2;
        this.cardType = str3;
    }

    public final java.lang.String getCardHolderName() {
        return this.cardHolderName;
    }

    public final java.lang.String getCardLastDigits() {
        return this.cardLastDigits;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardHolderName;
        java.lang.String str2 = this.cardLastDigits;
        java.lang.String str3 = this.cardType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardInfo(cardHolderName=");
        sb.append(str);
        sb.append(", cardLastDigits=");
        sb.append(str2);
        sb.append(", cardType=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.cardHolderName;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cardLastDigits;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.cardType;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo = (com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolderName, cardInfo.cardHolderName) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardLastDigits, cardInfo.cardLastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, cardInfo.cardType);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo copy(java.lang.String cardHolderName, java.lang.String cardLastDigits, java.lang.String cardType) {
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo(cardHolderName, cardLastDigits, cardType);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardLastDigits() {
        return this.cardLastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardHolderName() {
        return this.cardHolderName;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo copy$default(com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardInfo.cardHolderName;
        }
        if ((i & 2) != 0) {
            str2 = cardInfo.cardLastDigits;
        }
        if ((i & 4) != 0) {
            str3 = cardInfo.cardType;
        }
        return cardInfo.copy(str, str2, str3);
    }
}
