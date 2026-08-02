package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/SuggestedAmountNode;", "", "Ljava/math/BigDecimal;", "amount", "", "currency", "label", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/SuggestedAmountNode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrency", "getLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestedAmountNode {
    public static final int $stable = 0;
    private final java.math.BigDecimal amount;
    private final java.lang.String currency;
    private final java.lang.String label;

    public SuggestedAmountNode(java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = bigDecimal;
        this.currency = str;
        this.label = str2;
    }

    public /* synthetic */ SuggestedAmountNode(java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, (i & 4) != 0 ? null : str2);
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.amount;
        java.lang.String str = this.currency;
        java.lang.String str2 = this.label;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedAmountNode(amount=");
        sb.append(bigDecimal);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        int hashCode2 = this.currency.hashCode();
        java.lang.String str = this.label;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode suggestedAmountNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, suggestedAmountNode.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, suggestedAmountNode.currency) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, suggestedAmountNode.label);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode copy(java.math.BigDecimal amount, java.lang.String currency, java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode(amount, currency, label);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode suggestedAmountNode, java.math.BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = suggestedAmountNode.amount;
        }
        if ((i & 2) != 0) {
            str = suggestedAmountNode.currency;
        }
        if ((i & 4) != 0) {
            str2 = suggestedAmountNode.label;
        }
        return suggestedAmountNode.copy(bigDecimal, str, str2);
    }
}
