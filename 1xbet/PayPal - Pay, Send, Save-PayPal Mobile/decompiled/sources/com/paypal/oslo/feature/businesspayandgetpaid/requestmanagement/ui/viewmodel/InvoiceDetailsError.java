package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "", "", "p0", "<init>", "(I)V", "text", com.visa.cbp.getEncExpo.warmup, "getText", "()I", "GeneralError", "SendReminderError", "CancelError", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$CancelError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$GeneralError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$SendReminderError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class InvoiceDetailsError {
    public static final int $stable = 0;
    private final int text;

    private InvoiceDetailsError(int i) {
        this.text = i;
    }

    public final int getText() {
        return this.text;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$GeneralError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GeneralError extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.GeneralError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.GeneralError();

        public final int hashCode() {
            return 18069559;
        }

        private GeneralError() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_load_invoice_error_description, null);
        }

        public final java.lang.String toString() {
            return "GeneralError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.GeneralError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$SendReminderError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendReminderError extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.SendReminderError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.SendReminderError();

        public final int hashCode() {
            return 598880823;
        }

        private SendReminderError() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_send_reminder_error, null);
        }

        public final java.lang.String toString() {
            return "SendReminderError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.SendReminderError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError$CancelError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelError extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.CancelError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.CancelError();

        public final int hashCode() {
            return -672399721;
        }

        private CancelError() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_cancel_invoice_error, null);
        }

        public final java.lang.String toString() {
            return "CancelError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.CancelError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ InvoiceDetailsError(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
