package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceQrCodeUiState;", "", "", "invoiceId", "amount", "qrCodeData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceQrCodeUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceId", "getAmount", "getQrCodeData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceQrCodeUiState {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String invoiceId;
    private final java.lang.String qrCodeData;

    public InvoiceQrCodeUiState(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.invoiceId = str;
        this.amount = str2;
        this.qrCodeData = str3;
    }

    public /* synthetic */ InvoiceQrCodeUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getInvoiceId() {
        return this.invoiceId;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getQrCodeData() {
        return this.qrCodeData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.invoiceId;
        java.lang.String str2 = this.amount;
        java.lang.String str3 = this.qrCodeData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceQrCodeUiState(invoiceId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", qrCodeData=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.invoiceId.hashCode();
        int hashCode2 = this.amount.hashCode();
        java.lang.String str = this.qrCodeData;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState invoiceQrCodeUiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, invoiceQrCodeUiState.invoiceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceQrCodeUiState.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeData, invoiceQrCodeUiState.qrCodeData);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState copy(java.lang.String invoiceId, java.lang.String amount, java.lang.String qrCodeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState(invoiceId, amount, qrCodeData);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getQrCodeData() {
        return this.qrCodeData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInvoiceId() {
        return this.invoiceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceQrCodeUiState invoiceQrCodeUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = invoiceQrCodeUiState.invoiceId;
        }
        if ((i & 2) != 0) {
            str2 = invoiceQrCodeUiState.amount;
        }
        if ((i & 4) != 0) {
            str3 = invoiceQrCodeUiState.qrCodeData;
        }
        return invoiceQrCodeUiState.copy(str, str2, str3);
    }
}
