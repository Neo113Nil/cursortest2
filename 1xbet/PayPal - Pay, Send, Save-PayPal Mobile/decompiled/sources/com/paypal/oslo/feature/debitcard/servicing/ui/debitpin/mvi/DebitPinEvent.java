package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PinChanged", "ConfirmPinChanged", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, "BackClicked", "RetryClicked", "PinValidated", "ConfirmPinValidated", "PinCreationSucceeded", "PinCreationFailed", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$RetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$SubmitClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitPinEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitPinEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "pin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinChanged extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.String pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinChanged(java.lang.String str) {
            super("PinChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pin = str;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PinChanged(pin=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged) other).pin);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged copy(java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged(pin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged pinChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pinChanged.pin;
            }
            return pinChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinChanged;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "confirmPin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmPinChanged extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.String confirmPin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmPinChanged(java.lang.String str) {
            super("ConfirmPinChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.confirmPin = str;
        }

        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmPin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPinChanged(confirmPin=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmPin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPin, ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged) other).confirmPin);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged copy(java.lang.String confirmPin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged(confirmPin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmPin() {
            return this.confirmPin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged confirmPinChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmPinChanged.confirmPin;
            }
            return confirmPinChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$SubmitClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.SubmitClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.SubmitClicked();

        public final int hashCode() {
            return 1922928730;
        }

        private SubmitClicked() {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_SUBMIT_CLICKED;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.SubmitClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked();

        public final int hashCode() {
            return -1746504853;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$RetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.RetryClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.RetryClicked();

        public final int hashCode() {
            return -261870700;
        }

        private RetryClicked() {
            super("RetryClicked", null);
        }

        public final java.lang.String toString() {
            return "RetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.RetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "isValid", "", "errorMessageResId", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinValidated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinValidated extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.Integer errorMessageResId;
        private final boolean isValid;

        public PinValidated(boolean z, java.lang.Integer num) {
            super("PinValidated", null);
            this.isValid = z;
            this.errorMessageResId = num;
        }

        public /* synthetic */ PinValidated(boolean z, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            boolean z = this.isValid;
            java.lang.Integer num = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PinValidated(isValid=");
            sb.append(z);
            sb.append(", errorMessageResId=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isValid);
            java.lang.Integer num = this.errorMessageResId;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated pinValidated = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated) other;
            return this.isValid == pinValidated.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, pinValidated.errorMessageResId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated copy(boolean isValid, java.lang.Integer errorMessageResId) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated(isValid, errorMessageResId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated pinValidated, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pinValidated.isValid;
            }
            if ((i & 2) != 0) {
                num = pinValidated.errorMessageResId;
            }
            return pinValidated.copy(z, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinValidated;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "isValid", "", "errorMessageResId", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinValidated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "getErrorMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmPinValidated extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.Integer errorMessageResId;
        private final boolean isValid;

        public ConfirmPinValidated(boolean z, java.lang.Integer num) {
            super("ConfirmPinValidated", null);
            this.isValid = z;
            this.errorMessageResId = num;
        }

        public /* synthetic */ ConfirmPinValidated(boolean z, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public final java.lang.String toString() {
            boolean z = this.isValid;
            java.lang.Integer num = this.errorMessageResId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPinValidated(isValid=");
            sb.append(z);
            sb.append(", errorMessageResId=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isValid);
            java.lang.Integer num = this.errorMessageResId;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated confirmPinValidated = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated) other;
            return this.isValid == confirmPinValidated.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageResId, confirmPinValidated.errorMessageResId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated copy(boolean isValid, java.lang.Integer errorMessageResId) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated(isValid, errorMessageResId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorMessageResId() {
            return this.errorMessageResId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated confirmPinValidated, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = confirmPinValidated.isValid;
            }
            if ((i & 2) != 0) {
                num = confirmPinValidated.errorMessageResId;
            }
            return confirmPinValidated.copy(z, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "pin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinCreationSucceeded extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.String pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinCreationSucceeded(java.lang.String str) {
            super("PinCreationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pin = str;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PinCreationSucceeded(pin=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded) other).pin);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded copy(java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded(pin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded pinCreationSucceeded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pinCreationSucceeded.pin;
            }
            return pinCreationSucceeded.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "", "errorMessage", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinCreationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinCreationFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinCreationFailed(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("PinCreationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorMessage = str;
            this.errorCode = str2;
            this.errorType = debitErrorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PinCreationFailed(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorMessage.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed pinCreationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, pinCreationFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, pinCreationFailed.errorCode) && this.errorType == pinCreationFailed.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed copy(java.lang.String errorMessage, java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed(errorMessage, errorCode, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed pinCreationFailed, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pinCreationFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                str2 = pinCreationFailed.errorCode;
            }
            if ((i & 4) != 0) {
                debitErrorType = pinCreationFailed.errorType;
            }
            return pinCreationFailed.copy(str, str2, debitErrorType);
        }
    }

    public /* synthetic */ DebitPinEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
