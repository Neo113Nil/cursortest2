package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CloseClicked", "ViewYourCardClicked", "AddCardholderButtonClicked", "OnEligibleSuccess", "OnEligibleFailure", "OnProvisioningSuccess", "OnProvisioningFailure", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$AddCardholderButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$CloseClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnEligibleFailure;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnEligibleSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnProvisioningFailure;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnProvisioningSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$ViewYourCardClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardCreationSuccessScreenEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardCreationSuccessScreenEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$CloseClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.CloseClicked();

        public final int hashCode() {
            return -2035156938;
        }

        private CloseClicked() {
            super("CloseClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$ViewYourCardClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewYourCardClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.ViewYourCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.ViewYourCardClicked();

        public final int hashCode() {
            return 1559405656;
        }

        private ViewYourCardClicked() {
            super("ViewYourCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ViewYourCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.ViewYourCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$AddCardholderButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCardholderButtonClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.AddCardholderButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.AddCardholderButtonClicked();

        public final int hashCode() {
            return -1959172033;
        }

        private AddCardholderButtonClicked() {
            super("AddCardholderButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "AddCardholderButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.AddCardholderButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnEligibleSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEligibleSuccess extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleSuccess();

        public final int hashCode() {
            return -1041970810;
        }

        private OnEligibleSuccess() {
            super("OnEligibleSuccess", null);
        }

        public final java.lang.String toString() {
            return "OnEligibleSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnEligibleFailure;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEligibleFailure extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleFailure INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleFailure();

        public final int hashCode() {
            return -261375219;
        }

        private OnEligibleFailure() {
            super("OnEligibleFailure", null);
        }

        public final java.lang.String toString() {
            return "OnEligibleFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnEligibleFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnProvisioningSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisioningSuccess extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningSuccess();

        public final int hashCode() {
            return -540496208;
        }

        private OnProvisioningSuccess() {
            super("OnProvisioningSuccess", null);
        }

        public final java.lang.String toString() {
            return "OnProvisioningSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent$OnProvisioningFailure;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/mvi/DebitCardCreationSuccessScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisioningFailure extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningFailure INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningFailure();

        public final int hashCode() {
            return 240099383;
        }

        private OnProvisioningFailure() {
            super("OnProvisioningFailure", null);
        }

        public final java.lang.String toString() {
            return "OnProvisioningFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent.OnProvisioningFailure)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardCreationSuccessScreenEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
