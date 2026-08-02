package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/zettle/sdk/AmountBreakdown;", "", "Lcom/zettle/sdk/Amount;", "order", "Lcom/zettle/sdk/Gratuity;", "tip", "tax", "<init>", "(Lcom/zettle/sdk/Amount;Lcom/zettle/sdk/Gratuity;Lcom/zettle/sdk/Amount;)V", "component1", "()Lcom/zettle/sdk/Amount;", "component2", "()Lcom/zettle/sdk/Gratuity;", "component3", "copy", "(Lcom/zettle/sdk/Amount;Lcom/zettle/sdk/Gratuity;Lcom/zettle/sdk/Amount;)Lcom/zettle/sdk/AmountBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/Amount;", "getOrder", "getTax", "Lcom/zettle/sdk/Gratuity;", "getTip"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AmountBreakdown {
    private final com.zettle.sdk.Amount order;
    private final com.zettle.sdk.Amount tax;
    private final com.zettle.sdk.Gratuity tip;

    public AmountBreakdown(com.zettle.sdk.Amount amount, com.zettle.sdk.Gratuity gratuity, com.zettle.sdk.Amount amount2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuity, "");
        this.order = amount;
        this.tip = gratuity;
        this.tax = amount2;
    }

    public /* synthetic */ AmountBreakdown(com.zettle.sdk.Amount amount, com.zettle.sdk.Gratuity gratuity, com.zettle.sdk.Amount amount2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(amount, gratuity, (i & 4) != 0 ? null : amount2);
    }

    public final com.zettle.sdk.Amount getOrder() {
        return this.order;
    }

    public final com.zettle.sdk.Gratuity getTip() {
        return this.tip;
    }

    public final com.zettle.sdk.Amount getTax() {
        return this.tax;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.Amount amount = this.order;
        com.zettle.sdk.Gratuity gratuity = this.tip;
        com.zettle.sdk.Amount amount2 = this.tax;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountBreakdown(order=");
        sb.append(amount);
        sb.append(", tip=");
        sb.append(gratuity);
        sb.append(", tax=");
        sb.append(amount2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.order.hashCode();
        int hashCode2 = this.tip.hashCode();
        com.zettle.sdk.Amount amount = this.tax;
        return (((hashCode * 31) + hashCode2) * 31) + (amount == null ? 0 : amount.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.AmountBreakdown)) {
            return false;
        }
        com.zettle.sdk.AmountBreakdown amountBreakdown = (com.zettle.sdk.AmountBreakdown) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.order, amountBreakdown.order) && kotlin.jvm.internal.Intrinsics.areEqual(this.tip, amountBreakdown.tip) && kotlin.jvm.internal.Intrinsics.areEqual(this.tax, amountBreakdown.tax);
    }

    public final com.zettle.sdk.AmountBreakdown copy(com.zettle.sdk.Amount order, com.zettle.sdk.Gratuity tip, com.zettle.sdk.Amount tax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(order, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tip, "");
        return new com.zettle.sdk.AmountBreakdown(order, tip, tax);
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.Amount getTax() {
        return this.tax;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.Gratuity getTip() {
        return this.tip;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.Amount getOrder() {
        return this.order;
    }

    public static /* synthetic */ com.zettle.sdk.AmountBreakdown copy$default(com.zettle.sdk.AmountBreakdown amountBreakdown, com.zettle.sdk.Amount amount, com.zettle.sdk.Gratuity gratuity, com.zettle.sdk.Amount amount2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = amountBreakdown.order;
        }
        if ((i & 2) != 0) {
            gratuity = amountBreakdown.tip;
        }
        if ((i & 4) != 0) {
            amount2 = amountBreakdown.tax;
        }
        return amountBreakdown.copy(amount, gratuity, amount2);
    }
}
