package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "", "NavigateToInvoiceSent", "NavigateBackWithError", "NavigateToShareLink", "NavigateToAddCustomer", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToAddCustomer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToInvoiceSent;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToShareLink;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RequestPaymentUiEffect {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToInvoiceSent;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToInvoiceSent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "getInvoice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInvoiceSent implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice;

        public NavigateToInvoiceSent(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
            this.invoice = invoice;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
            return this.invoice;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice = this.invoice;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInvoiceSent(invoice=");
            sb.append(invoice);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoice.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoice, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent) other).invoice);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent copy(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent(invoice);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
            return this.invoice;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToInvoiceSent navigateToInvoiceSent, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                invoice = navigateToInvoiceSent.invoice;
            }
            return navigateToInvoiceSent.copy(invoice);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithError implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError();

        public final int hashCode() {
            return -1837188756;
        }

        private NavigateBackWithError() {
        }

        public final java.lang.String toString() {
            return "NavigateBackWithError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateBackWithError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToShareLink;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToShareLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "getInvoice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToShareLink implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice;

        public NavigateToShareLink(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
            this.invoice = invoice;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
            return this.invoice;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice = this.invoice;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToShareLink(invoice=");
            sb.append(invoice);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoice.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoice, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink) other).invoice);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink copy(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink(invoice);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
            return this.invoice;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToShareLink navigateToShareLink, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                invoice = navigateToShareLink.invoice;
            }
            return navigateToShareLink.copy(invoice);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect$NavigateToAddCustomer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddCustomer implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToAddCustomer INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToAddCustomer();

        public final int hashCode() {
            return -1252538411;
        }

        private NavigateToAddCustomer() {
        }

        public final java.lang.String toString() {
            return "NavigateToAddCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect.NavigateToAddCustomer)) {
                return false;
            }
            return true;
        }
    }
}
