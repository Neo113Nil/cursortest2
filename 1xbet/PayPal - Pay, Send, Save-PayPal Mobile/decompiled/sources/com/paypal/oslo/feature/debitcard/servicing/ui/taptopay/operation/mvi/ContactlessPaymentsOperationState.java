package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Ineligible", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactlessPaymentsOperationState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactlessPaymentsOperationState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading();

        public final int hashCode() {
            return 810852992;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Activate", "Deactivate", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success$Activate;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success$Deactivate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState {
        public static final int $stable = 0;

        private Success(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success$Activate;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Activate extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate();

            public final int hashCode() {
                return 711502298;
            }

            private Activate() {
                super("Success.Activate", null);
            }

            public final java.lang.String toString() {
                return "Activate";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Activate)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success$Deactivate;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Deactivate extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate();

            public final int hashCode() {
                return 1110902683;
            }

            private Deactivate() {
                super("Success.Deactivate", null);
            }

            public final java.lang.String toString() {
                return "Deactivate";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Success.Deactivate)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Success(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Ineligible INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Ineligible();

        public final int hashCode() {
            return 507501112;
        }

        private Ineligible() {
            super("Ineligible", null);
        }

        public final java.lang.String toString() {
            return "Ineligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState.Ineligible)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContactlessPaymentsOperationState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
