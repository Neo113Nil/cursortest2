package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnCvvChanged", "OnViewPinClicked", "OnPinReceived", "OnWrongCvvError", "OnBackClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnCvvChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnPinReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnViewPinClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnWrongCvvError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class EnterCvvEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnterCvvEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/uimodel/EnterCvvUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/uimodel/EnterCvvUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/uimodel/EnterCvvUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/uimodel/EnterCvvUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/uimodel/EnterCvvUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel enterCvvUiModel) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterCvvUiModel, "");
            this.uiModel = enterCvvUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel enterCvvUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(uiModel=");
            sb.append(enterCvvUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated) other).uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel enterCvvUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enterCvvUiModel = onViewCreated.uiModel;
            }
            return onViewCreated.copy(enterCvvUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnCvvChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnCvvChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCvvChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCvvChanged(java.lang.String str) {
            super("OnCvvChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCvvChanged(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged) other).cvv);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnCvvChanged onCvvChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCvvChanged.cvv;
            }
            return onCvvChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnViewPinClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewPinClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewPinClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewPinClicked();

        public final int hashCode() {
            return -1884950118;
        }

        private OnViewPinClicked() {
            super("OnViewPinClicked", null);
        }

        public final java.lang.String toString() {
            return "OnViewPinClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewPinClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnPinReceived;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "", "pin", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnPinReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPinReceived extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        private final java.lang.String pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPinReceived(java.lang.String str) {
            super("OnPinReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.pin = str;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.pin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPinReceived(pin=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived) other).pin);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived copy(java.lang.String pin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived(pin);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived onPinReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPinReceived.pin;
            }
            return onPinReceived.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnWrongCvvError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWrongCvvError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnWrongCvvError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnWrongCvvError();

        public final int hashCode() {
            return 1019803023;
        }

        private OnWrongCvvError() {
            super("OnWrongCvvError", null);
        }

        public final java.lang.String toString() {
            return "OnWrongCvvError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnWrongCvvError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked();

        public final int hashCode() {
            return 1498550237;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EnterCvvEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
