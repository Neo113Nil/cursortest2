package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "", "<init>", "()V", "NoBackup", "NoPaymentMethod", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence$NoBackup;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence$NoPaymentMethod;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PaymentMethodAbsence {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence$NoBackup;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoBackup extends com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup();

        public final int hashCode() {
            return 686942620;
        }

        private NoBackup() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoBackup";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup)) {
                return false;
            }
            return true;
        }
    }

    private PaymentMethodAbsence() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence$NoPaymentMethod;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoPaymentMethod extends com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod();

        public final int hashCode() {
            return -2116668051;
        }

        private NoPaymentMethod() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoPaymentMethod";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PaymentMethodAbsence(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
