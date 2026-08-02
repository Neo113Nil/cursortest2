package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\"\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\",-./0123456789:;<=>?@ABCDEFGHIJKLM"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "BackButtonClicked", "CancelButtonClicked", "DismissCancelConfirmation", "ConfirmCancelTransaction", "ShowErrorScreen", "DismissErrorScreen", "ShowContactSection", "HideContactSection", "TogglePaymentMethodSection", "TogglePaymentTypeSection", "ToggleShippingSection", "ShippingItemSelected", "ConversionOptionsClicked", "ExecuteTransfer", "UpdateLoadingState", "TransferSucceeded", "TransferFailed", "NetworkErrorOccurred", "UpdatePayNowButtonAmount", "UpdateBaseTransferAmount", "SearchContactsClicked", "UpdateTransferAttemptId", "UpdateFundingOptionId", "UpdateSelectedFundingOption", "UpdateSelectedContact", "UpdateIntent", "DisclosureLinkClicked", "InitiateRedirectionContingency", "NavigateToConfirmBankRequested", "ContingencyResolutionStarted", "ContingencyStepResolved", "AllContingenciesResolved", "ContingencyResolutionAborted", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$AllContingenciesResolved;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$BackButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$CancelButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ConfirmCancelTransaction;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyResolutionAborted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyResolutionStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyStepResolved;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ConversionOptionsClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DisclosureLinkClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DismissCancelConfirmation;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DismissErrorScreen;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ExecuteTransfer;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$HideContactSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$InitiateRedirectionContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$NavigateToConfirmBankRequested;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$NetworkErrorOccurred;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$SearchContactsClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShippingItemSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShowContactSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShowErrorScreen;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TogglePaymentMethodSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TogglePaymentTypeSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ToggleShippingSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateBaseTransferAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateFundingOptionId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateIntent;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateLoadingState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdatePayNowButtonAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedContact;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedFundingOption;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateTransferAttemptId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.Initialize INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.Initialize();

        public final int hashCode() {
            return 254745796;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$BackButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class BackButtonClicked extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.BackButtonClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.BackButtonClicked();

        public final int hashCode() {
            return 183970618;
        }

        private BackButtonClicked() {
            super("BackButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "BackButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.BackButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$CancelButtonClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CancelButtonClicked extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.CancelButtonClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.CancelButtonClicked();

        public final int hashCode() {
            return 1331070343;
        }

        private CancelButtonClicked() {
            super("CancelButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "CancelButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.CancelButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DismissCancelConfirmation;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class DismissCancelConfirmation extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissCancelConfirmation INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissCancelConfirmation();

        public final int hashCode() {
            return -139892667;
        }

        private DismissCancelConfirmation() {
            super("DismissCancelConfirmation", null);
        }

        public final java.lang.String toString() {
            return "DismissCancelConfirmation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissCancelConfirmation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ConfirmCancelTransaction;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ConfirmCancelTransaction extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConfirmCancelTransaction INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConfirmCancelTransaction();

        public final int hashCode() {
            return -1735838888;
        }

        private ConfirmCancelTransaction() {
            super("ConfirmCancelTransaction", null);
        }

        public final java.lang.String toString() {
            return "ConfirmCancelTransaction";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConfirmCancelTransaction)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShowErrorScreen;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;", "source", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShowErrorScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ErrorSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ShowErrorScreen extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorScreen(com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource errorSource) {
            super("ShowErrorScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSource, "");
            this.source = errorSource;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource errorSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorScreen(source=");
            sb.append(errorSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen) && this.source == ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen) other).source;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen copy(com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen(source);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen showErrorScreen, com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource errorSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorSource = showErrorScreen.source;
            }
            return showErrorScreen.copy(errorSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DismissErrorScreen;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class DismissErrorScreen extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissErrorScreen INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissErrorScreen();

        public final int hashCode() {
            return 2110427358;
        }

        private DismissErrorScreen() {
            super("DismissErrorScreen", null);
        }

        public final java.lang.String toString() {
            return "DismissErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DismissErrorScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShowContactSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ShowContactSection extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowContactSection INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowContactSection();

        public final int hashCode() {
            return 1910379574;
        }

        private ShowContactSection() {
            super("ShowContactSection", null);
        }

        public final java.lang.String toString() {
            return "ShowContactSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowContactSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$HideContactSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class HideContactSection extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.HideContactSection INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.HideContactSection();

        public final int hashCode() {
            return 1301363131;
        }

        private HideContactSection() {
            super("HideContactSection", null);
        }

        public final java.lang.String toString() {
            return "HideContactSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.HideContactSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TogglePaymentMethodSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TogglePaymentMethodSection extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection();

        public final int hashCode() {
            return -322759418;
        }

        private TogglePaymentMethodSection() {
            super("TogglePaymentMethodSection", null);
        }

        public final java.lang.String toString() {
            return "TogglePaymentMethodSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TogglePaymentTypeSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TogglePaymentTypeSection extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection();

        public final int hashCode() {
            return 2031081741;
        }

        private TogglePaymentTypeSection() {
            super("TogglePaymentTypeSection", null);
        }

        public final java.lang.String toString() {
            return "TogglePaymentTypeSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ToggleShippingSection;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ToggleShippingSection extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection();

        public final int hashCode() {
            return 415246767;
        }

        private ToggleShippingSection() {
            super("ToggleShippingSection", null);
        }

        public final java.lang.String toString() {
            return "ToggleShippingSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ShippingItemSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ShippingItemSelected extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShippingItemSelected INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShippingItemSelected();

        public final int hashCode() {
            return 145918928;
        }

        private ShippingItemSelected() {
            super("ShippingItemSelected", null);
        }

        public final java.lang.String toString() {
            return "ShippingItemSelected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShippingItemSelected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ConversionOptionsClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ConversionOptionsClicked extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConversionOptionsClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConversionOptionsClicked();

        public final int hashCode() {
            return -1766511469;
        }

        private ConversionOptionsClicked() {
            super("ConversionOptionsClicked", null);
        }

        public final java.lang.String toString() {
            return "ConversionOptionsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ConversionOptionsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ExecuteTransfer;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ExecuteTransfer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ExecuteTransfer extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExecuteTransfer(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
            super("ExecuteTransfer", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
            this.intent = paymentTransferIntent;
        }

        public /* synthetic */ ExecuteTransfer(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND : paymentTransferIntent);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteTransfer(intent=");
            sb.append(paymentTransferIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer) && this.intent == ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer) other).intent;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ExecuteTransfer executeTransfer, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferIntent = executeTransfer.intent;
            }
            return executeTransfer.copy(paymentTransferIntent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExecuteTransfer() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateLoadingState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "", "isLoading", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateLoadingState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateLoadingState extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final boolean isLoading;

        public UpdateLoadingState(boolean z) {
            super("UpdateLoadingState", null);
            this.isLoading = z;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final java.lang.String toString() {
            boolean z = this.isLoading;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateLoadingState(isLoading=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isLoading);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState) && this.isLoading == ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState) other).isLoading;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState copy(boolean isLoading) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState(isLoading);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState updateLoadingState, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateLoadingState.isLoading;
            }
            return updateLoadingState.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TransferSucceeded extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferSucceeded(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult) {
            super("TransferSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferResult, "");
            this.result = paymentTransferResult;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSucceeded(result=");
            sb.append(paymentTransferResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded) other).result);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded transferSucceeded, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult paymentTransferResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferResult = transferSucceeded.result;
            }
            return transferSucceeded.copy(paymentTransferResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "error", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/UiText;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/UiText;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/UiText;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$TransferFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/UiText;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TransferFailed extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.UiText error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferFailed(com.paypal.oslo.feature.p2p.ui.UiText uiText) {
            super("TransferFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText, "");
            this.error = uiText;
        }

        public final com.paypal.oslo.feature.p2p.ui.UiText getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.UiText uiText = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferFailed(error=");
            sb.append(uiText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed) other).error);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed copy(com.paypal.oslo.feature.p2p.ui.UiText error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.UiText getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed transferFailed, com.paypal.oslo.feature.p2p.ui.UiText uiText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = transferFailed.error;
            }
            return transferFailed.copy(uiText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$NetworkErrorOccurred;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class NetworkErrorOccurred extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NetworkErrorOccurred INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NetworkErrorOccurred();

        public final int hashCode() {
            return 515034099;
        }

        private NetworkErrorOccurred() {
            super("NetworkErrorOccurred", null);
        }

        public final java.lang.String toString() {
            return "NetworkErrorOccurred";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NetworkErrorOccurred)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdatePayNowButtonAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdatePayNowButtonAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdatePayNowButtonAmount extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount amount;

        public UpdatePayNowButtonAmount(com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
            super("UpdatePayNowButtonAmount", null);
            this.amount = amount;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePayNowButtonAmount(amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount) other).amount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount copy(com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdatePayNowButtonAmount updatePayNowButtonAmount, com.paypal.oslo.feature.p2p.domain.model.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = updatePayNowButtonAmount.amount;
            }
            return updatePayNowButtonAmount.copy(amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateBaseTransferAmount;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateBaseTransferAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateBaseTransferAmount extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount amount;

        public UpdateBaseTransferAmount(com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
            super("UpdateBaseTransferAmount", null);
            this.amount = amount;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBaseTransferAmount(amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount) other).amount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount copy(com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateBaseTransferAmount updateBaseTransferAmount, com.paypal.oslo.feature.p2p.domain.model.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = updateBaseTransferAmount.amount;
            }
            return updateBaseTransferAmount.copy(amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$SearchContactsClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class SearchContactsClicked extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.SearchContactsClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.SearchContactsClicked();

        public final int hashCode() {
            return 1751926744;
        }

        private SearchContactsClicked() {
            super("SearchContactsClicked", null);
        }

        public final java.lang.String toString() {
            return "SearchContactsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.SearchContactsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateTransferAttemptId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateTransferAttemptId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateTransferAttemptId extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateTransferAttemptId(java.lang.String str) {
            super("UpdateTransferAttemptId", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptId = str;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateTransferAttemptId(transferAttemptId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferAttemptId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId) other).transferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId copy(java.lang.String transferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId(transferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateTransferAttemptId updateTransferAttemptId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateTransferAttemptId.transferAttemptId;
            }
            return updateTransferAttemptId.copy(str);
        }
    }

    @kotlin.Deprecated(message = "Use UpdateSelectedFundingOption instead")
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateFundingOptionId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateFundingOptionId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingOptionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateFundingOptionId extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingOptionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFundingOptionId(java.lang.String str) {
            super("UpdateFundingOptionId", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingOptionId = str;
        }

        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingOptionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateFundingOptionId(fundingOptionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingOptionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId) other).fundingOptionId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId copy(java.lang.String fundingOptionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId(fundingOptionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingOptionId() {
            return this.fundingOptionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateFundingOptionId updateFundingOptionId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateFundingOptionId.fundingOptionId;
            }
            return updateFundingOptionId.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedFundingOption;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "fundingOption", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedFundingOption;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "getFundingOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateSelectedFundingOption extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption;

        public UpdateSelectedFundingOption(com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption) {
            super("UpdateSelectedFundingOption", null);
            this.fundingOption = fundingOption;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getFundingOption() {
            return this.fundingOption;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.fundingOption;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSelectedFundingOption(fundingOption=");
            sb.append(fundingOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.fundingOption;
            if (fundingOption == null) {
                return 0;
            }
            return fundingOption.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOption, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption) other).fundingOption);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption copy(com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption(fundingOption);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getFundingOption() {
            return this.fundingOption;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption updateSelectedFundingOption, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingOption = updateSelectedFundingOption.fundingOption;
            }
            return updateSelectedFundingOption.copy(fundingOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedContact;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "contact", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateSelectedContact;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateSelectedContact extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact;

        public UpdateSelectedContact(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
            super("UpdateSelectedContact", null);
            this.contact = p2PContactItem;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSelectedContact(contact=");
            sb.append(p2PContactItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            if (p2PContactItem == null) {
                return 0;
            }
            return p2PContactItem.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact) other).contact);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact copy(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact(contact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedContact updateSelectedContact, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                p2PContactItem = updateSelectedContact.contact;
            }
            return updateSelectedContact.copy(p2PContactItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateIntent;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$UpdateIntent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UpdateIntent extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateIntent(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
            super("UpdateIntent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
            this.intent = paymentTransferIntent;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateIntent(intent=");
            sb.append(paymentTransferIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent) && this.intent == ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent) other).intent;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent copy(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateIntent updateIntent, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferIntent = updateIntent.intent;
            }
            return updateIntent.copy(paymentTransferIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DisclosureLinkClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "", "linkUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$DisclosureLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLinkUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class DisclosureLinkClicked extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String linkUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclosureLinkClicked(java.lang.String str) {
            super("DisclosureLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.linkUrl = str;
        }

        public final java.lang.String getLinkUrl() {
            return this.linkUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.linkUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisclosureLinkClicked(linkUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.linkUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkUrl, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked) other).linkUrl);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked copy(java.lang.String linkUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkUrl, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked(linkUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLinkUrl() {
            return this.linkUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked disclosureLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclosureLinkClicked.linkUrl;
            }
            return disclosureLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$InitiateRedirectionContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class InitiateRedirectionContingency extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.InitiateRedirectionContingency INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.InitiateRedirectionContingency();

        public final int hashCode() {
            return 1429071152;
        }

        private InitiateRedirectionContingency() {
            super("InitiateRedirectionContingency", null);
        }

        public final java.lang.String toString() {
            return "InitiateRedirectionContingency";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.InitiateRedirectionContingency)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$NavigateToConfirmBankRequested;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "bankFundingSource", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$NavigateToConfirmBankRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "getBankFundingSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class NavigateToConfirmBankRequested extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingSource bankFundingSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConfirmBankRequested(com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource) {
            super("NavigateToConfirmBankRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource, "");
            this.bankFundingSource = fundingSource;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingSource getBankFundingSource() {
            return this.bankFundingSource;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource = this.bankFundingSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToConfirmBankRequested(bankFundingSource=");
            sb.append(fundingSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bankFundingSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankFundingSource, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested) other).bankFundingSource);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested copy(com.paypal.oslo.feature.p2p.domain.model.FundingSource bankFundingSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankFundingSource, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested(bankFundingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingSource getBankFundingSource() {
            return this.bankFundingSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.NavigateToConfirmBankRequested navigateToConfirmBankRequested, com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingSource = navigateToConfirmBankRequested.bankFundingSource;
            }
            return navigateToConfirmBankRequested.copy(fundingSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyResolutionStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ContingencyResolutionStarted extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionStarted INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionStarted();

        public final int hashCode() {
            return 692296666;
        }

        private ContingencyResolutionStarted() {
            super("ContingencyResolutionStarted", null);
        }

        public final java.lang.String toString() {
            return "ContingencyResolutionStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyStepResolved;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "updatedFundingOptions", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyStepResolved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getUpdatedFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ContingencyStepResolved extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions updatedFundingOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContingencyStepResolved(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
            super("ContingencyStepResolved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
            this.updatedFundingOptions = fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getUpdatedFundingOptions() {
            return this.updatedFundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.updatedFundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContingencyStepResolved(updatedFundingOptions=");
            sb.append(fundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatedFundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedFundingOptions, ((com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved) other).updatedFundingOptions);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved copy(com.paypal.oslo.feature.p2p.domain.model.FundingOptions updatedFundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedFundingOptions, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved(updatedFundingOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getUpdatedFundingOptions() {
            return this.updatedFundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyStepResolved contingencyStepResolved, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingOptions = contingencyStepResolved.updatedFundingOptions;
            }
            return contingencyStepResolved.copy(fundingOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$AllContingenciesResolved;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class AllContingenciesResolved extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved();

        public final int hashCode() {
            return -2033273512;
        }

        private AllContingenciesResolved() {
            super("AllContingenciesResolved", null);
        }

        public final java.lang.String toString() {
            return "AllContingenciesResolved";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.AllContingenciesResolved)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent$ContingencyResolutionAborted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ContingencyResolutionAborted extends com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionAborted INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionAborted();

        public final int hashCode() {
            return 1394704168;
        }

        private ContingencyResolutionAborted() {
            super("ContingencyResolutionAborted", null);
        }

        public final java.lang.String toString() {
            return "ContingencyResolutionAborted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ContingencyResolutionAborted)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
