package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "", "", "paymentDueDate", "minimumPaymentDue", "avoidInterestMinimumPaymentDue", "learnMoreUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/uimodel/PaymentsUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentDueDate", "getMinimumPaymentDue", "getAvoidInterestMinimumPaymentDue", "getLearnMoreUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PaymentsUiModel {
    public static final int $stable = 0;
    private final java.lang.String avoidInterestMinimumPaymentDue;
    private final java.lang.String learnMoreUrl;
    private final java.lang.String minimumPaymentDue;
    private final java.lang.String paymentDueDate;

    public PaymentsUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.paymentDueDate = str;
        this.minimumPaymentDue = str2;
        this.avoidInterestMinimumPaymentDue = str3;
        this.learnMoreUrl = str4;
    }

    public final java.lang.String getPaymentDueDate() {
        return this.paymentDueDate;
    }

    public final java.lang.String getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    public final java.lang.String getAvoidInterestMinimumPaymentDue() {
        return this.avoidInterestMinimumPaymentDue;
    }

    public final java.lang.String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentDueDate;
        java.lang.String str2 = this.minimumPaymentDue;
        java.lang.String str3 = this.avoidInterestMinimumPaymentDue;
        java.lang.String str4 = this.learnMoreUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentsUiModel(paymentDueDate=");
        sb.append(str);
        sb.append(", minimumPaymentDue=");
        sb.append(str2);
        sb.append(", avoidInterestMinimumPaymentDue=");
        sb.append(str3);
        sb.append(", learnMoreUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.paymentDueDate.hashCode();
        int hashCode2 = this.minimumPaymentDue.hashCode();
        java.lang.String str = this.avoidInterestMinimumPaymentDue;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.learnMoreUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDueDate, paymentsUiModel.paymentDueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumPaymentDue, paymentsUiModel.minimumPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.avoidInterestMinimumPaymentDue, paymentsUiModel.avoidInterestMinimumPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.learnMoreUrl, paymentsUiModel.learnMoreUrl);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel copy(java.lang.String paymentDueDate, java.lang.String minimumPaymentDue, java.lang.String avoidInterestMinimumPaymentDue, java.lang.String learnMoreUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDueDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumPaymentDue, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel(paymentDueDate, minimumPaymentDue, avoidInterestMinimumPaymentDue, learnMoreUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAvoidInterestMinimumPaymentDue() {
        return this.avoidInterestMinimumPaymentDue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentDueDate() {
        return this.paymentDueDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentsUiModel.paymentDueDate;
        }
        if ((i & 2) != 0) {
            str2 = paymentsUiModel.minimumPaymentDue;
        }
        if ((i & 4) != 0) {
            str3 = paymentsUiModel.avoidInterestMinimumPaymentDue;
        }
        if ((i & 8) != 0) {
            str4 = paymentsUiModel.learnMoreUrl;
        }
        return paymentsUiModel.copy(str, str2, str3, str4);
    }
}
