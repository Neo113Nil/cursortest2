package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/AmountValidationData;", "", "Ljava/math/BigDecimal;", "amount", "maxAmount", "", "formattedMaxAmount", "", "hasScheduledPayment", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "component1", "()Ljava/math/BigDecimal;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/AmountValidationData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/math/BigDecimal;", "getAmount", "getMaxAmount", "Ljava/lang/String;", "getFormattedMaxAmount", "Z", "getHasScheduledPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AmountValidationData {
    public static final int $stable = 0;
    private final java.math.BigDecimal amount;
    private final java.lang.String formattedMaxAmount;
    private final boolean hasScheduledPayment;
    private final java.math.BigDecimal maxAmount;

    public AmountValidationData(java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = bigDecimal;
        this.maxAmount = bigDecimal2;
        this.formattedMaxAmount = str;
        this.hasScheduledPayment = z;
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public final java.lang.String getFormattedMaxAmount() {
        return this.formattedMaxAmount;
    }

    public final boolean getHasScheduledPayment() {
        return this.hasScheduledPayment;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.amount;
        java.math.BigDecimal bigDecimal2 = this.maxAmount;
        java.lang.String str = this.formattedMaxAmount;
        boolean z = this.hasScheduledPayment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountValidationData(amount=");
        sb.append(bigDecimal);
        sb.append(", maxAmount=");
        sb.append(bigDecimal2);
        sb.append(", formattedMaxAmount=");
        sb.append(str);
        sb.append(", hasScheduledPayment=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.amount.hashCode() * 31) + this.maxAmount.hashCode()) * 31) + this.formattedMaxAmount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasScheduledPayment);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData amountValidationData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountValidationData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, amountValidationData.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaxAmount, amountValidationData.formattedMaxAmount) && this.hasScheduledPayment == amountValidationData.hasScheduledPayment;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData copy(java.math.BigDecimal amount, java.math.BigDecimal maxAmount, java.lang.String formattedMaxAmount, boolean hasScheduledPayment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaxAmount, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData(amount, maxAmount, formattedMaxAmount, hasScheduledPayment);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasScheduledPayment() {
        return this.hasScheduledPayment;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormattedMaxAmount() {
        return this.formattedMaxAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.math.BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData amountValidationData, java.math.BigDecimal bigDecimal, java.math.BigDecimal bigDecimal2, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = amountValidationData.amount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = amountValidationData.maxAmount;
        }
        if ((i & 4) != 0) {
            str = amountValidationData.formattedMaxAmount;
        }
        if ((i & 8) != 0) {
            z = amountValidationData.hasScheduledPayment;
        }
        return amountValidationData.copy(bigDecimal, bigDecimal2, str, z);
    }
}
