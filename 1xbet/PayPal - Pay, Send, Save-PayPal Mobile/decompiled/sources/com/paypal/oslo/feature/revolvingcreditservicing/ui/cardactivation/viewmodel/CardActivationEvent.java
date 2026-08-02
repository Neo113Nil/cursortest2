package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnDataLoaded", "OnDataLoadFailed", "OnBackClicked", "OnCvvChanged", "OnActivateClicked", "OnActivationSucceeded", "OnActivationFailed", "OnDidntGetCardClicked", "OnDidntGetCardSheetDismissed", "OnCallCreditCardSupportClicked", "OnNotReadyToActivateError", "OnAvailabilityCheckRequestFailure", "OnCardAlreadyActivatedError", "OnTryAgainClicked", "OnActivationMaxAttemptsError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivateClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationMaxAttemptsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationSucceeded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnAvailabilityCheckRequestFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCallCreditCardSupportClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCardAlreadyActivatedError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCvvChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDidntGetCardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDidntGetCardSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnNotReadyToActivateError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CardActivationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnViewCreated INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnViewCreated();

        public final int hashCode() {
            return 1993023010;
        }

        private OnViewCreated() {
            super("OnViewCreated", null);
        }

        public final java.lang.String toString() {
            return "OnViewCreated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnViewCreated)) {
                return false;
            }
            return true;
        }
    }

    private CardActivationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/uimodel/CardActivationUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/uimodel/CardActivationUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/uimodel/CardActivationUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/uimodel/CardActivationUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/uimodel/CardActivationUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel cardActivationUiModel) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationUiModel, "");
            this.data = cardActivationUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel cardActivationUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(data=");
            sb.append(cardActivationUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded) other).data);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel cardActivationUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardActivationUiModel = onDataLoaded.data;
            }
            return onDataLoaded.copy(cardActivationUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDataLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoadFailed(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super("OnDataLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.errorMessage = uiString;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoadFailed(errorMessage=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed onDataLoadFailed, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = onDataLoadFailed.errorMessage;
            }
            return onDataLoadFailed.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked();

        public final int hashCode() {
            return 562476767;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCvvChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCvvChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCvvChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged) other).cvv);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged onCvvChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCvvChanged.cvv;
            }
            return onCvvChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivateClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivateClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivateClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivateClicked();

        public final int hashCode() {
            return 1379604947;
        }

        private OnActivateClicked() {
            super("OnActivateClicked", null);
        }

        public final java.lang.String toString() {
            return "OnActivateClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivateClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationSucceeded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivationSucceeded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationSucceeded INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationSucceeded();

        public final int hashCode() {
            return -1394491254;
        }

        private OnActivationSucceeded() {
            super("OnActivationSucceeded", null);
        }

        public final java.lang.String toString() {
            return "OnActivationSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivationFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationFailed();

        public final int hashCode() {
            return 1323527860;
        }

        private OnActivationFailed() {
            super("OnActivationFailed", null);
        }

        public final java.lang.String toString() {
            return "OnActivationFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDidntGetCardClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDidntGetCardClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardClicked();

        public final int hashCode() {
            return 1196873285;
        }

        private OnDidntGetCardClicked() {
            super("OnDidntGetCardClicked", null);
        }

        public final java.lang.String toString() {
            return "OnDidntGetCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnDidntGetCardSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDidntGetCardSheetDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardSheetDismissed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardSheetDismissed();

        public final int hashCode() {
            return -1702633940;
        }

        private OnDidntGetCardSheetDismissed() {
            super("OnDidntGetCardSheetDismissed", null);
        }

        public final java.lang.String toString() {
            return "OnDidntGetCardSheetDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardSheetDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCallCreditCardSupportClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCallCreditCardSupportClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked();

        public final int hashCode() {
            return -541059040;
        }

        private OnCallCreditCardSupportClicked() {
            super("OnCallCreditCardSupportClicked", null);
        }

        public final java.lang.String toString() {
            return "OnCallCreditCardSupportClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnNotReadyToActivateError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNotReadyToActivateError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnNotReadyToActivateError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnNotReadyToActivateError();

        public final int hashCode() {
            return -773699447;
        }

        private OnNotReadyToActivateError() {
            super("OnNotReadyToActivateError", null);
        }

        public final java.lang.String toString() {
            return "OnNotReadyToActivateError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnNotReadyToActivateError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnAvailabilityCheckRequestFailure;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAvailabilityCheckRequestFailure extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure();

        public final int hashCode() {
            return 232669671;
        }

        private OnAvailabilityCheckRequestFailure() {
            super("OnAvailabilityCheckRequestFailure", null);
        }

        public final java.lang.String toString() {
            return "OnAvailabilityCheckRequestFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnCardAlreadyActivatedError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardAlreadyActivatedError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCardAlreadyActivatedError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCardAlreadyActivatedError();

        public final int hashCode() {
            return -9386146;
        }

        private OnCardAlreadyActivatedError() {
            super("OnCardAlreadyActivatedError", null);
        }

        public final java.lang.String toString() {
            return "OnCardAlreadyActivatedError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCardAlreadyActivatedError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked();

        public final int hashCode() {
            return 1021537313;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationMaxAttemptsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "", "supportPhoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent$OnActivationMaxAttemptsError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSupportPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivationMaxAttemptsError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent {
        public static final int $stable = 0;
        private final java.lang.String supportPhoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnActivationMaxAttemptsError(java.lang.String str) {
            super("OnActivationMaxAttemptsError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.supportPhoneNumber = str;
        }

        public final java.lang.String getSupportPhoneNumber() {
            return this.supportPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.supportPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnActivationMaxAttemptsError(supportPhoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.supportPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportPhoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError) other).supportPhoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError copy(java.lang.String supportPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportPhoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError(supportPhoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSupportPhoneNumber() {
            return this.supportPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError onActivationMaxAttemptsError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onActivationMaxAttemptsError.supportPhoneNumber;
            }
            return onActivationMaxAttemptsError.copy(str);
        }
    }

    public /* synthetic */ CardActivationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
