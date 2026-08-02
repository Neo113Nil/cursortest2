package com.paypal.oslo.feature.taptopay.ui.paymode.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "", "DefaultCardState", "ReadyForPaymentState", "PaymentSuccessState", "TransactionInterruptedErrorState", "ReadyForSecondTap", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$DefaultCardState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$PaymentSuccessState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$ReadyForPaymentState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$ReadyForSecondTap;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$TransactionInterruptedErrorState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PayModeUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$DefaultCardState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DefaultCardState implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState();

        public final int hashCode() {
            return -1825199379;
        }

        private DefaultCardState() {
        }

        public final java.lang.String toString() {
            return "DefaultCardState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$ReadyForPaymentState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyForPaymentState implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForPaymentState INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForPaymentState();

        public final int hashCode() {
            return -75568194;
        }

        private ReadyForPaymentState() {
        }

        public final java.lang.String toString() {
            return "ReadyForPaymentState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForPaymentState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$PaymentSuccessState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentSuccessState implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.PaymentSuccessState INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.PaymentSuccessState();

        public final int hashCode() {
            return -1479714937;
        }

        private PaymentSuccessState() {
        }

        public final java.lang.String toString() {
            return "PaymentSuccessState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.PaymentSuccessState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$TransactionInterruptedErrorState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionInterruptedErrorState implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.TransactionInterruptedErrorState INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.TransactionInterruptedErrorState();

        public final int hashCode() {
            return 595600858;
        }

        private TransactionInterruptedErrorState() {
        }

        public final java.lang.String toString() {
            return "TransactionInterruptedErrorState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.TransactionInterruptedErrorState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState$ReadyForSecondTap;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyForSecondTap implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForSecondTap INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForSecondTap();

        public final int hashCode() {
            return 1076652508;
        }

        private ReadyForSecondTap() {
        }

        public final java.lang.String toString() {
            return "ReadyForSecondTap";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForSecondTap)) {
                return false;
            }
            return true;
        }
    }
}
