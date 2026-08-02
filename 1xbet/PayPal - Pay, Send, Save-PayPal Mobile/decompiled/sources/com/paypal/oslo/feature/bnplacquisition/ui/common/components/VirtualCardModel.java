package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/VirtualCardModel;", "", "", "amount", "expiration", "lastFourDigits", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/VirtualCardModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getExpiration", "getLastFourDigits", "getCardType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VirtualCardModel {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String cardType;
    private final java.lang.String expiration;
    private final java.lang.String lastFourDigits;

    public VirtualCardModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.amount = str;
        this.expiration = str2;
        this.lastFourDigits = str3;
        this.cardType = str4;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getExpiration() {
        return this.expiration;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.expiration;
        java.lang.String str3 = this.lastFourDigits;
        java.lang.String str4 = this.cardType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCardModel(amount=");
        sb.append(str);
        sb.append(", expiration=");
        sb.append(str2);
        sb.append(", lastFourDigits=");
        sb.append(str3);
        sb.append(", cardType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.amount.hashCode() * 31) + this.expiration.hashCode()) * 31) + this.lastFourDigits.hashCode()) * 31) + this.cardType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel virtualCardModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, virtualCardModel.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiration, virtualCardModel.expiration) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, virtualCardModel.lastFourDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, virtualCardModel.cardType);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel copy(java.lang.String amount, java.lang.String expiration, java.lang.String lastFourDigits, java.lang.String cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel(amount, expiration, lastFourDigits, cardType);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExpiration() {
        return this.expiration;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardModel virtualCardModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = virtualCardModel.amount;
        }
        if ((i & 2) != 0) {
            str2 = virtualCardModel.expiration;
        }
        if ((i & 4) != 0) {
            str3 = virtualCardModel.lastFourDigits;
        }
        if ((i & 8) != 0) {
            str4 = virtualCardModel.cardType;
        }
        return virtualCardModel.copy(str, str2, str3, str4);
    }
}
