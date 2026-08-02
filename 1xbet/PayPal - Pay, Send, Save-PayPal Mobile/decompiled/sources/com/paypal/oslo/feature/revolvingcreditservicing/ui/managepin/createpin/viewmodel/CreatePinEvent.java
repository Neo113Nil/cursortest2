package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnPinChanged", "OnPinConfirmationChanged", "OnActionButtonClicked", "OnBackClicked", "OnPinSet", "OnErrorSettingPin", "OnValidationError", "OnTryAgainClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnActionButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnErrorSettingPin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinConfirmationChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinSet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnValidationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CreatePinEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CreatePinEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "", "isChangingPin", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnViewCreated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        private final boolean isChangingPin;

        public OnViewCreated(boolean z) {
            super("OnViewCreated", null);
            this.isChangingPin = z;
        }

        public final boolean isChangingPin() {
            return this.isChangingPin;
        }

        public final java.lang.String toString() {
            boolean z = this.isChangingPin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(isChangingPin=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isChangingPin);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated) && this.isChangingPin == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated) other).isChangingPin;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated copy(boolean isChangingPin) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated(isChangingPin);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChangingPin() {
            return this.isChangingPin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnViewCreated onViewCreated, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onViewCreated.isChangingPin;
            }
            return onViewCreated.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "", "pin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPinChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        private final java.lang.String pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPinChanged(java.lang.String str) {
            super("OnPinChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pin = str;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPinChanged(pin=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged) other).pin);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged copy(java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged(pin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinChanged onPinChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPinChanged.pin;
            }
            return onPinChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinConfirmationChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "", "pinConfirmation", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinConfirmationChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPinConfirmation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPinConfirmationChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        private final java.lang.String pinConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPinConfirmationChanged(java.lang.String str) {
            super("OnPinConfirmationChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pinConfirmation = str;
        }

        public final java.lang.String getPinConfirmation() {
            return this.pinConfirmation;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pinConfirmation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPinConfirmationChanged(pinConfirmation=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pinConfirmation.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinConfirmation, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged) other).pinConfirmation);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged copy(java.lang.String pinConfirmation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinConfirmation, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged(pinConfirmation);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPinConfirmation() {
            return this.pinConfirmation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinConfirmationChanged onPinConfirmationChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPinConfirmationChanged.pinConfirmation;
            }
            return onPinConfirmationChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnActionButtonClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActionButtonClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnActionButtonClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnActionButtonClicked();

        public final int hashCode() {
            return -1532224646;
        }

        private OnActionButtonClicked() {
            super("OnActionButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OnActionButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnActionButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnBackClicked();

        public final int hashCode() {
            return -257685061;
        }

        private OnBackClicked() {
            super("OnBackClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnPinSet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPinSet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinSet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinSet();

        public final int hashCode() {
            return -1552472782;
        }

        private OnPinSet() {
            super("OnPinSet", null);
        }

        public final java.lang.String toString() {
            return "OnPinSet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnPinSet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnErrorSettingPin;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnErrorSettingPin extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnErrorSettingPin INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnErrorSettingPin();

        public final int hashCode() {
            return -1596014520;
        }

        private OnErrorSettingPin() {
            super("OnErrorSettingPin", null);
        }

        public final java.lang.String toString() {
            return "OnErrorSettingPin";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnErrorSettingPin)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnValidationError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinValidationError;", "fieldsAndErrors", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getFieldsAndErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnValidationError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> fieldsAndErrors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnValidationError(java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> map) {
            super("OnValidationError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.fieldsAndErrors = map;
        }

        public final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> getFieldsAndErrors() {
            return this.fieldsAndErrors;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> map = this.fieldsAndErrors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnValidationError(fieldsAndErrors=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fieldsAndErrors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.fieldsAndErrors, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError) other).fieldsAndErrors);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError copy(java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> fieldsAndErrors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldsAndErrors, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError(fieldsAndErrors);
        }

        public final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> component1() {
            return this.fieldsAndErrors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnValidationError onValidationError, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = onValidationError.fieldsAndErrors;
            }
            return onValidationError.copy(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/createpin/viewmodel/CreatePinEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnTryAgainClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnTryAgainClicked();

        public final int hashCode() {
            return -987500291;
        }

        private OnTryAgainClicked() {
            super("OnTryAgainClicked", null);
        }

        public final java.lang.String toString() {
            return "OnTryAgainClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinEvent.OnTryAgainClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CreatePinEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
