package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;", "", "Ljava/math/BigDecimal;", "minAmount", "maxAmount", "", "currency", "dailyLimit", "remainingDailyLimit", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/math/BigDecimal;", "getMinAmount", "getMaxAmount", "Ljava/lang/String;", "getCurrency", "getDailyLimit", "getRemainingDailyLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountLimitsNode {
    public static final int $stable = 0;
    private final java.lang.String currency;
    private final java.math.BigDecimal dailyLimit;
    private final java.math.BigDecimal maxAmount;
    private final java.math.BigDecimal minAmount;
    private final java.math.BigDecimal remainingDailyLimit;

    public AmountLimitsNode(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.String str, java.math.BigDecimal bigDecimal3, java.math.BigDecimal bigDecimal4) {
        this.minAmount = bigDecimal;
        this.maxAmount = bigDecimal2;
        this.currency = str;
        this.dailyLimit = bigDecimal3;
        this.remainingDailyLimit = bigDecimal4;
    }

    public /* synthetic */ AmountLimitsNode(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.String str, java.math.BigDecimal bigDecimal3, java.math.BigDecimal bigDecimal4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : bigDecimal2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bigDecimal3, (i & 16) != 0 ? null : bigDecimal4);
    }

    public final java.math.BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.math.BigDecimal getDailyLimit() {
        return this.dailyLimit;
    }

    public final java.math.BigDecimal getRemainingDailyLimit() {
        return this.remainingDailyLimit;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.minAmount;
        java.math.BigDecimal bigDecimal2 = this.maxAmount;
        java.lang.String str = this.currency;
        java.math.BigDecimal bigDecimal3 = this.dailyLimit;
        java.math.BigDecimal bigDecimal4 = this.remainingDailyLimit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountLimitsNode(minAmount=");
        sb.append(bigDecimal);
        sb.append(", maxAmount=");
        sb.append(bigDecimal2);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", dailyLimit=");
        sb.append(bigDecimal3);
        sb.append(", remainingDailyLimit=");
        sb.append(bigDecimal4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.math.BigDecimal bigDecimal = this.minAmount;
        int hashCode = bigDecimal == null ? 0 : bigDecimal.hashCode();
        java.math.BigDecimal bigDecimal2 = this.maxAmount;
        int hashCode2 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.String str = this.currency;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.math.BigDecimal bigDecimal3 = this.dailyLimit;
        int hashCode4 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.math.BigDecimal bigDecimal4 = this.remainingDailyLimit;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, amountLimitsNode.minAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, amountLimitsNode.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, amountLimitsNode.currency) && kotlin.jvm.internal.Intrinsics.areEqual(this.dailyLimit, amountLimitsNode.dailyLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingDailyLimit, amountLimitsNode.remainingDailyLimit);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode copy(java.math.BigDecimal minAmount, java.math.BigDecimal maxAmount, java.lang.String currency, java.math.BigDecimal dailyLimit, java.math.BigDecimal remainingDailyLimit) {
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode(minAmount, maxAmount, currency, dailyLimit, remainingDailyLimit);
    }

    /* renamed from: component5, reason: from getter */
    public final java.math.BigDecimal getRemainingDailyLimit() {
        return this.remainingDailyLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final java.math.BigDecimal getDailyLimit() {
        return this.dailyLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode, java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.String str, java.math.BigDecimal bigDecimal3, java.math.BigDecimal bigDecimal4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = amountLimitsNode.minAmount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = amountLimitsNode.maxAmount;
        }
        java.math.BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 4) != 0) {
            str = amountLimitsNode.currency;
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            bigDecimal3 = amountLimitsNode.dailyLimit;
        }
        java.math.BigDecimal bigDecimal6 = bigDecimal3;
        if ((i & 16) != 0) {
            bigDecimal4 = amountLimitsNode.remainingDailyLimit;
        }
        return amountLimitsNode.copy(bigDecimal, bigDecimal5, str2, bigDecimal6, bigDecimal4);
    }

    public AmountLimitsNode() {
        this(null, null, null, null, null, 31, null);
    }
}
