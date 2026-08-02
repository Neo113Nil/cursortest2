package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "", "CallCustomer", "MessageCustomer", "EmailCustomer", "EditCustomer", "RemoveCustomer", "AddEmail", "AddPhone", "ChooseCustomer", "ClearError", com.paypal.oslo.feature.businesspayandgetpaid.graphql.SendInvoiceMutation.OPERATION_NAME, "EditNotes", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$AddEmail;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$AddPhone;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$CallCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$ChooseCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$ClearError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EditCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EditNotes;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EmailCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$MessageCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$RemoveCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$SendInvoice;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomerProfileEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$CallCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.CallCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.CallCustomer();

        public final int hashCode() {
            return 622385576;
        }

        private CallCustomer() {
        }

        public final java.lang.String toString() {
            return "CallCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.CallCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$MessageCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MessageCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.MessageCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.MessageCustomer();

        public final int hashCode() {
            return 767172665;
        }

        private MessageCustomer() {
        }

        public final java.lang.String toString() {
            return "MessageCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.MessageCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EmailCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EmailCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EmailCustomer();

        public final int hashCode() {
            return 1376142286;
        }

        private EmailCustomer() {
        }

        public final java.lang.String toString() {
            return "EmailCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EmailCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EditCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditCustomer();

        public final int hashCode() {
            return -1200529068;
        }

        private EditCustomer() {
        }

        public final java.lang.String toString() {
            return "EditCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$RemoveCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.RemoveCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.RemoveCustomer();

        public final int hashCode() {
            return 653700814;
        }

        private RemoveCustomer() {
        }

        public final java.lang.String toString() {
            return "RemoveCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.RemoveCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$AddEmail;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddEmail implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddEmail INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddEmail();

        public final int hashCode() {
            return 768958151;
        }

        private AddEmail() {
        }

        public final java.lang.String toString() {
            return "AddEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddEmail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$AddPhone;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPhone implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddPhone INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddPhone();

        public final int hashCode() {
            return 778981529;
        }

        private AddPhone() {
        }

        public final java.lang.String toString() {
            return "AddPhone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.AddPhone)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$ChooseCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChooseCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ChooseCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ChooseCustomer();

        public final int hashCode() {
            return -385357471;
        }

        private ChooseCustomer() {
        }

        public final java.lang.String toString() {
            return "ChooseCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ChooseCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$ClearError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearError implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ClearError INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ClearError();

        public final int hashCode() {
            return -792678393;
        }

        private ClearError() {
        }

        public final java.lang.String toString() {
            return "ClearError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.ClearError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$SendInvoice;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendInvoice implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.SendInvoice INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.SendInvoice();

        public final int hashCode() {
            return 586674105;
        }

        private SendInvoice() {
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.businesspayandgetpaid.graphql.SendInvoiceMutation.OPERATION_NAME;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.SendInvoice)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent$EditNotes;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditNotes implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditNotes INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditNotes();

        public final int hashCode() {
            return 887935243;
        }

        private EditNotes() {
        }

        public final java.lang.String toString() {
            return "EditNotes";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent.EditNotes)) {
                return false;
            }
            return true;
        }
    }
}
