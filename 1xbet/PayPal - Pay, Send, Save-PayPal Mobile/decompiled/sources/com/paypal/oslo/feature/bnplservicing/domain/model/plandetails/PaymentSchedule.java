package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaymentSchedule;", "", "", "", "formattedInstallments", "finalPaymentText", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaymentSchedule;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getFormattedInstallments", "Ljava/lang/String;", "getFinalPaymentText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentSchedule {
    public static final int $stable = 8;
    private final java.lang.String finalPaymentText;
    private final java.util.List<java.lang.String> formattedInstallments;

    public PaymentSchedule(java.util.List<java.lang.String> list, java.lang.String str) {
        this.formattedInstallments = list;
        this.finalPaymentText = str;
    }

    public /* synthetic */ PaymentSchedule(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    public final java.util.List<java.lang.String> getFormattedInstallments() {
        return this.formattedInstallments;
    }

    public final java.lang.String getFinalPaymentText() {
        return this.finalPaymentText;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.formattedInstallments;
        java.lang.String str = this.finalPaymentText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentSchedule(formattedInstallments=");
        sb.append(list);
        sb.append(", finalPaymentText=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<java.lang.String> list = this.formattedInstallments;
        int hashCode = list == null ? 0 : list.hashCode();
        java.lang.String str = this.finalPaymentText;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule paymentSchedule = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedInstallments, paymentSchedule.formattedInstallments) && kotlin.jvm.internal.Intrinsics.areEqual(this.finalPaymentText, paymentSchedule.finalPaymentText);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule copy(java.util.List<java.lang.String> formattedInstallments, java.lang.String finalPaymentText) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule(formattedInstallments, finalPaymentText);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFinalPaymentText() {
        return this.finalPaymentText;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.formattedInstallments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule paymentSchedule, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = paymentSchedule.formattedInstallments;
        }
        if ((i & 2) != 0) {
            str = paymentSchedule.finalPaymentText;
        }
        return paymentSchedule.copy(list, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSchedule() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
