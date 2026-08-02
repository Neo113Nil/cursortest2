package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "", "<init>", "()V", "Loading", "Eligible", "Ineligible", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Eligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CardConnectEligibilityState {
    public static final int $stable = 0;

    private CardConnectEligibilityState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading();

        public final int hashCode() {
            return 1934693011;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Eligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Eligible extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Eligible INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Eligible();

        public final int hashCode() {
            return -1899547808;
        }

        private Eligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Eligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Eligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible();

        public final int hashCode() {
            return 1555434821;
        }

        private Ineligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Ineligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardConnectEligibilityState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
