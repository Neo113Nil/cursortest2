package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentUiState;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "amount", "", "customerName", "shareUrl", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getAmount", "Ljava/lang/String;", "getCustomerName", "getShareUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceSentUiState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount;
    private final java.lang.String customerName;
    private final java.lang.String shareUrl;

    public InvoiceSentUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidMoney, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = getPaidMoney;
        this.customerName = str;
        this.shareUrl = str2;
    }

    public /* synthetic */ InvoiceSentUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(getPaidMoney, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
        return this.amount;
    }

    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    public final java.lang.String getShareUrl() {
        return this.shareUrl;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.amount;
        java.lang.String str = this.customerName;
        java.lang.String str2 = this.shareUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceSentUiState(amount=");
        sb.append(getPaidMoney);
        sb.append(", customerName=");
        sb.append(str);
        sb.append(", shareUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + this.customerName.hashCode()) * 31) + this.shareUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState invoiceSentUiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceSentUiState.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerName, invoiceSentUiState.customerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.shareUrl, invoiceSentUiState.shareUrl);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState copy(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount, java.lang.String customerName, java.lang.String shareUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareUrl, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState(amount, customerName, shareUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getShareUrl() {
        return this.shareUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState invoiceSentUiState, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            getPaidMoney = invoiceSentUiState.amount;
        }
        if ((i & 2) != 0) {
            str = invoiceSentUiState.customerName;
        }
        if ((i & 4) != 0) {
            str2 = invoiceSentUiState.shareUrl;
        }
        return invoiceSentUiState.copy(getPaidMoney, str, str2);
    }
}
