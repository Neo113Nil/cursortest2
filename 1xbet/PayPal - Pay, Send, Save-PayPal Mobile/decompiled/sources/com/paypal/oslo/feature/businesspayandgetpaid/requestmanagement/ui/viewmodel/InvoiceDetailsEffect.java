package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "", "NavigateToInvoiceCancelled", "NavigateToReminderSent", "NavigateBack", "NavigateToInvoiceWebView", "NavigateToEditInvoice", "NavigateToCopyInvoice", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToCopyInvoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToEditInvoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToInvoiceCancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToInvoiceWebView;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToReminderSent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface InvoiceDetailsEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToInvoiceCancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "", "invoiceNumber", "shareUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToInvoiceCancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceNumber", "getShareUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInvoiceCancelled implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String invoiceNumber;
        private final java.lang.String shareUrl;

        public NavigateToInvoiceCancelled(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.invoiceNumber = str;
            this.shareUrl = str2;
        }

        public final java.lang.String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public final java.lang.String getShareUrl() {
            return this.shareUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceNumber;
            java.lang.String str2 = this.shareUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInvoiceCancelled(invoiceNumber=");
            sb.append(str);
            sb.append(", shareUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.invoiceNumber.hashCode() * 31) + this.shareUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled navigateToInvoiceCancelled = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceNumber, navigateToInvoiceCancelled.invoiceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.shareUrl, navigateToInvoiceCancelled.shareUrl);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled copy(java.lang.String invoiceNumber, java.lang.String shareUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareUrl, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled(invoiceNumber, shareUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getShareUrl() {
            return this.shareUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceCancelled navigateToInvoiceCancelled, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToInvoiceCancelled.invoiceNumber;
            }
            if ((i & 2) != 0) {
                str2 = navigateToInvoiceCancelled.shareUrl;
            }
            return navigateToInvoiceCancelled.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToReminderSent;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "", "recipientName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToReminderSent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRecipientName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReminderSent implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String recipientName;

        public NavigateToReminderSent(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.recipientName = str;
        }

        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.recipientName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReminderSent(recipientName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recipientName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent) other).recipientName);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent copy(java.lang.String recipientName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent(recipientName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRecipientName() {
            return this.recipientName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToReminderSent navigateToReminderSent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReminderSent.recipientName;
            }
            return navigateToReminderSent.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateBack implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateBack();

        private NavigateBack() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToInvoiceWebView;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToInvoiceWebView implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceWebView INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToInvoiceWebView();

        private NavigateToInvoiceWebView() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToEditInvoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToEditInvoice implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToEditInvoice INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToEditInvoice();

        private NavigateToEditInvoice() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect$NavigateToCopyInvoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToCopyInvoice implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToCopyInvoice INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect.NavigateToCopyInvoice();

        private NavigateToCopyInvoice() {
        }
    }
}
