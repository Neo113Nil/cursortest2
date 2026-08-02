package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;", "", "", "name", "", "logo", "cardNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", com.visa.cbp.getEncExpo.warmup, "getLogo", "getCardNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LoyaltyCardData {
    public static final int $stable = 0;
    private final java.lang.String cardNumber;
    private final int logo;
    private final java.lang.String name;

    public LoyaltyCardData(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.logo = i;
        this.cardNumber = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getLogo() {
        return this.logo;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        int i = this.logo;
        java.lang.String str2 = this.cardNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoyaltyCardData(name=");
        sb.append(str);
        sb.append(", logo=");
        sb.append(i);
        sb.append(", cardNumber=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + java.lang.Integer.hashCode(this.logo)) * 31) + this.cardNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData = (com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, loyaltyCardData.name) && this.logo == loyaltyCardData.logo && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, loyaltyCardData.cardNumber);
    }

    public final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData copy(java.lang.String name2, int logo, java.lang.String cardNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        return new com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData(name2, logo, cardNumber);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLogo() {
        return this.logo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData copy$default(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = loyaltyCardData.name;
        }
        if ((i2 & 2) != 0) {
            i = loyaltyCardData.logo;
        }
        if ((i2 & 4) != 0) {
            str2 = loyaltyCardData.cardNumber;
        }
        return loyaltyCardData.copy(str, i, str2);
    }
}
