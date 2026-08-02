package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError;", "", "RemoveCustomerFailed", "SendInvoiceWithoutEmail", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError$RemoveCustomerFailed;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError$SendInvoiceWithoutEmail;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomerProfileError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError$RemoveCustomerFailed;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveCustomerFailed implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.RemoveCustomerFailed INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.RemoveCustomerFailed();

        public final int hashCode() {
            return 427068925;
        }

        private RemoveCustomerFailed() {
        }

        public final java.lang.String toString() {
            return "RemoveCustomerFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.RemoveCustomerFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError$SendInvoiceWithoutEmail;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendInvoiceWithoutEmail implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.SendInvoiceWithoutEmail INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.SendInvoiceWithoutEmail();

        public final int hashCode() {
            return -711359621;
        }

        private SendInvoiceWithoutEmail() {
        }

        public final java.lang.String toString() {
            return "SendInvoiceWithoutEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileError.SendInvoiceWithoutEmail)) {
                return false;
            }
            return true;
        }
    }
}
