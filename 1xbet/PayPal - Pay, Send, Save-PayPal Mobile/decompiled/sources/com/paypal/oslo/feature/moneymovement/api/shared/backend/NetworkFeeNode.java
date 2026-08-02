package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;", "", "Ljava/math/BigDecimal;", "amount", "", "currency", "feeType", "formattedAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrency", "getFeeType", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NetworkFeeNode {
    public static final int $stable = 0;
    private final java.math.BigDecimal amount;
    private final java.lang.String currency;
    private final java.lang.String feeType;
    private final java.lang.String formattedAmount;

    public NetworkFeeNode(java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = bigDecimal;
        this.currency = str;
        this.feeType = str2;
        this.formattedAmount = str3;
    }

    public /* synthetic */ NetworkFeeNode(java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.lang.String getFeeType() {
        return this.feeType;
    }

    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.amount;
        java.lang.String str = this.currency;
        java.lang.String str2 = this.feeType;
        java.lang.String str3 = this.formattedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkFeeNode(amount=");
        sb.append(bigDecimal);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", feeType=");
        sb.append(str2);
        sb.append(", formattedAmount=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.currency.hashCode();
        java.lang.String str = this.feeType;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.formattedAmount;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, networkFeeNode.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, networkFeeNode.currency) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeType, networkFeeNode.feeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, networkFeeNode.formattedAmount);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode copy(java.math.BigDecimal amount, java.lang.String currency, java.lang.String feeType, java.lang.String formattedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode(amount, currency, feeType, formattedAmount);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFeeType() {
        return this.feeType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode, java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = networkFeeNode.amount;
        }
        if ((i & 2) != 0) {
            str = networkFeeNode.currency;
        }
        if ((i & 4) != 0) {
            str2 = networkFeeNode.feeType;
        }
        if ((i & 8) != 0) {
            str3 = networkFeeNode.formattedAmount;
        }
        return networkFeeNode.copy(bigDecimal, str, str2, str3);
    }
}
