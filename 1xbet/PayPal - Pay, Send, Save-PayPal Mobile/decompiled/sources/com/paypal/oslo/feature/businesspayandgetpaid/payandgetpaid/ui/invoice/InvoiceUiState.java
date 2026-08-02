package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState;", "", "Loading", "Error", "Success", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Error;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Loading;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface InvoiceUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Loading;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Loading INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Loading();

        public final int hashCode() {
            return 1141360626;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Error;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Error INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Error();

        public final int hashCode() {
            return -1265504706;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u0010&J¼\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010!R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010#R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bC\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010&R\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\b\r\u0010&R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bE\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bF\u0010&R\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bG\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bH\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bI\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010.R\u001a\u0010\u0015\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bL\u0010&R\u001a\u0010\u0016\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bM\u0010&R\u001a\u0010\u0017\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bN\u0010&R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010\u001eR\u001a\u0010Q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010\u001eR\u001a\u0010T\u001a\u00020S8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020S8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u001a\u0010Z\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010\u001eR\u0013\u0010]\u001a\u0004\u0018\u00010S8G¢\u0006\u0006\u001a\u0004\b\\\u0010WR\u0011\u0010^\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b^\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Success;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState;", "", "invoiceId", "currencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "customer", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "items", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "", "isNoteExpanded", "isInvoiceOptionsExpanded", "dueDate", "allowTips", "allowPartialPayment", "minimumDue", "showSendInvoiceError", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "taxSettings", "showDiscardChangesDialog", "showNoteContainsUrlError", "showNoteTooLongError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;ZZZ)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "toInvoice", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "component4", "()Ljava/util/List;", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;ZZLjava/lang/String;ZLcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;ZZZ)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceId", "getCurrencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "getCustomer", "Ljava/util/List;", "getItems", "getNote", "Z", "getDueDate", "getAllowTips", "getAllowPartialPayment", "getMinimumDue", "getShowSendInvoiceError", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "getTaxSettings", "getShowDiscardChangesDialog", "getShowNoteContainsUrlError", "getShowNoteTooLongError", "subtotalFormatted", "getSubtotalFormatted", "taxFormatted", "getTaxFormatted", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "totalDiscount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getTotalDiscount", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "total", "getTotal", "totalFormatted", "getTotalFormatted", "getMinimumDueMoney", "minimumDueMoney", "isMinimumDueExceedsTotal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState {
        public static final int $stable = 8;
        private final boolean allowPartialPayment;
        private final boolean allowTips;
        private final java.lang.String currencyCode;
        private final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer;
        private final java.lang.String dueDate;
        private final java.lang.String invoiceId;
        private final boolean isInvoiceOptionsExpanded;
        private final boolean isNoteExpanded;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items;
        private final java.lang.String minimumDue;
        private final java.lang.String note;
        private final boolean showDiscardChangesDialog;
        private final boolean showNoteContainsUrlError;
        private final boolean showNoteTooLongError;
        private final boolean showSendInvoiceError;
        private final java.lang.String subtotalFormatted;
        private final java.lang.String taxFormatted;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney total;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalDiscount;
        private final java.lang.String totalFormatted;

        public Success(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, boolean z3, boolean z4, java.lang.String str5, boolean z5, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, boolean z6, boolean z7, boolean z8) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
            this.invoiceId = str;
            this.currencyCode = str2;
            this.customer = customer;
            this.items = list;
            this.note = str3;
            this.isNoteExpanded = z;
            this.isInvoiceOptionsExpanded = z2;
            this.dueDate = str4;
            this.allowTips = z3;
            this.allowPartialPayment = z4;
            this.minimumDue = str5;
            this.showSendInvoiceError = z5;
            this.taxSettings = taxSettings;
            this.showDiscardChangesDialog = z6;
            this.showNoteContainsUrlError = z7;
            this.showNoteTooLongError = z8;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list2 = list;
            this.subtotalFormatted = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.subTotalFormatted(list2, str2);
            this.taxFormatted = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.totalTaxFormatted(list2, str2, taxSettings);
            this.totalDiscount = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.totalDiscount(list2, str2);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.total(list2, str2, taxSettings);
            this.total = getPaidMoney;
            this.totalFormatted = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(getPaidMoney, null, 1, null);
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, java.util.List list, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, boolean z3, boolean z4, java.lang.String str5, boolean z5, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, boolean z6, boolean z7, boolean z8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : customer, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? false : z5, taxSettings, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? false : z7, (i & 32768) != 0 ? false : z8);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getItems() {
            return this.items;
        }

        public final java.lang.String getNote() {
            return this.note;
        }

        public final boolean isNoteExpanded() {
            return this.isNoteExpanded;
        }

        public final boolean isInvoiceOptionsExpanded() {
            return this.isInvoiceOptionsExpanded;
        }

        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        public final boolean getAllowTips() {
            return this.allowTips;
        }

        public final boolean getAllowPartialPayment() {
            return this.allowPartialPayment;
        }

        public final java.lang.String getMinimumDue() {
            return this.minimumDue;
        }

        public final boolean getShowSendInvoiceError() {
            return this.showSendInvoiceError;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings getTaxSettings() {
            return this.taxSettings;
        }

        public final boolean getShowDiscardChangesDialog() {
            return this.showDiscardChangesDialog;
        }

        public final boolean getShowNoteContainsUrlError() {
            return this.showNoteContainsUrlError;
        }

        public final boolean getShowNoteTooLongError() {
            return this.showNoteTooLongError;
        }

        public final java.lang.String getSubtotalFormatted() {
            return this.subtotalFormatted;
        }

        public final java.lang.String getTaxFormatted() {
            return this.taxFormatted;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotalDiscount() {
            return this.totalDiscount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotal() {
            return this.total;
        }

        public final java.lang.String getTotalFormatted() {
            return this.totalFormatted;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getMinimumDueMoney() {
            java.lang.String str = this.minimumDue;
            if (str != null) {
                if (kotlin.text.StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(str, this.currencyCode);
                }
            }
            return null;
        }

        public final boolean isMinimumDueExceedsTotal() {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney minimumDueMoney = getMinimumDueMoney();
            return minimumDueMoney != null && minimumDueMoney.compareTo(this.total) > 0;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice toInvoice() {
            java.lang.String str = this.invoiceId;
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = this.customer;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.items;
            java.lang.String str2 = this.currencyCode;
            java.lang.String str3 = this.note;
            if (kotlin.text.StringsKt.isBlank(str3)) {
                str3 = null;
            }
            java.lang.String str4 = str3;
            java.lang.String str5 = this.dueDate;
            boolean z = this.allowTips;
            boolean z2 = this.allowPartialPayment;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney minimumDueMoney = getMinimumDueMoney();
            return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice(str, str2, customer, null, list, str4, new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceConfiguration(str5, z, z2, minimumDueMoney != null ? minimumDueMoney.formatAsNumberUnsigned() : null, this.taxSettings.isTaxCalculatedAfterDiscount(), this.taxSettings.isTaxInclusive()), null, 136, null);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceId;
            java.lang.String str2 = this.currencyCode;
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = this.customer;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.items;
            java.lang.String str3 = this.note;
            boolean z = this.isNoteExpanded;
            boolean z2 = this.isInvoiceOptionsExpanded;
            java.lang.String str4 = this.dueDate;
            boolean z3 = this.allowTips;
            boolean z4 = this.allowPartialPayment;
            java.lang.String str5 = this.minimumDue;
            boolean z5 = this.showSendInvoiceError;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings = this.taxSettings;
            boolean z6 = this.showDiscardChangesDialog;
            boolean z7 = this.showNoteContainsUrlError;
            boolean z8 = this.showNoteTooLongError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(invoiceId=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", customer=");
            sb.append(customer);
            sb.append(", items=");
            sb.append(list);
            sb.append(", note=");
            sb.append(str3);
            sb.append(", isNoteExpanded=");
            sb.append(z);
            sb.append(", isInvoiceOptionsExpanded=");
            sb.append(z2);
            sb.append(", dueDate=");
            sb.append(str4);
            sb.append(", allowTips=");
            sb.append(z3);
            sb.append(", allowPartialPayment=");
            sb.append(z4);
            sb.append(", minimumDue=");
            sb.append(str5);
            sb.append(", showSendInvoiceError=");
            sb.append(z5);
            sb.append(", taxSettings=");
            sb.append(taxSettings);
            sb.append(", showDiscardChangesDialog=");
            sb.append(z6);
            sb.append(", showNoteContainsUrlError=");
            sb.append(z7);
            sb.append(", showNoteTooLongError=");
            sb.append(z8);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.invoiceId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.currencyCode.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = this.customer;
            int hashCode3 = customer == null ? 0 : customer.hashCode();
            int hashCode4 = this.items.hashCode();
            int hashCode5 = this.note.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isNoteExpanded);
            int hashCode7 = java.lang.Boolean.hashCode(this.isInvoiceOptionsExpanded);
            int hashCode8 = this.dueDate.hashCode();
            int hashCode9 = java.lang.Boolean.hashCode(this.allowTips);
            int hashCode10 = java.lang.Boolean.hashCode(this.allowPartialPayment);
            java.lang.String str2 = this.minimumDue;
            return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showSendInvoiceError)) * 31) + this.taxSettings.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showDiscardChangesDialog)) * 31) + java.lang.Boolean.hashCode(this.showNoteContainsUrlError)) * 31) + java.lang.Boolean.hashCode(this.showNoteTooLongError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Success success = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, success.invoiceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, success.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, success.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, success.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, success.note) && this.isNoteExpanded == success.isNoteExpanded && this.isInvoiceOptionsExpanded == success.isInvoiceOptionsExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, success.dueDate) && this.allowTips == success.allowTips && this.allowPartialPayment == success.allowPartialPayment && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumDue, success.minimumDue) && this.showSendInvoiceError == success.showSendInvoiceError && kotlin.jvm.internal.Intrinsics.areEqual(this.taxSettings, success.taxSettings) && this.showDiscardChangesDialog == success.showDiscardChangesDialog && this.showNoteContainsUrlError == success.showNoteContainsUrlError && this.showNoteTooLongError == success.showNoteTooLongError;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Success copy(java.lang.String invoiceId, java.lang.String currencyCode, com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items, java.lang.String note, boolean isNoteExpanded, boolean isInvoiceOptionsExpanded, java.lang.String dueDate, boolean allowTips, boolean allowPartialPayment, java.lang.String minimumDue, boolean showSendInvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, boolean showDiscardChangesDialog, boolean showNoteContainsUrlError, boolean showNoteTooLongError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(note, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceUiState.Success(invoiceId, currencyCode, customer, items, note, isNoteExpanded, isInvoiceOptionsExpanded, dueDate, allowTips, allowPartialPayment, minimumDue, showSendInvoiceError, taxSettings, showDiscardChangesDialog, showNoteContainsUrlError, showNoteTooLongError);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getAllowTips() {
            return this.allowTips;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsInvoiceOptionsExpanded() {
            return this.isInvoiceOptionsExpanded;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsNoteExpanded() {
            return this.isNoteExpanded;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNote() {
            return this.note;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> component4() {
            return this.items;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getShowNoteTooLongError() {
            return this.showNoteTooLongError;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getShowNoteContainsUrlError() {
            return this.showNoteContainsUrlError;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShowDiscardChangesDialog() {
            return this.showDiscardChangesDialog;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings getTaxSettings() {
            return this.taxSettings;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getShowSendInvoiceError() {
            return this.showSendInvoiceError;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getMinimumDue() {
            return this.minimumDue;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getAllowPartialPayment() {
            return this.allowPartialPayment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }
    }
}
