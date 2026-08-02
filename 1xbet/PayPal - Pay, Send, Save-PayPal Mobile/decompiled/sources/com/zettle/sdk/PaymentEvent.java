package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\""}, d2 = {"Lcom/zettle/sdk/PaymentEvent;", "", "<init>", "()V", "AuthorizePayment", "CardPresented", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "ConnectingToReader", "Failed", "FinalizePayment", "Gratuity", "Initial", "Offline", "OnlineAuthorizationRetry", "Pin", "PresentCard", "ProcessingPayment", "Queued", "ReaderFinalizationFailureReason", "UncertainPayment", "Lcom/zettle/sdk/PaymentEvent$AuthorizePayment;", "Lcom/zettle/sdk/PaymentEvent$CardPresented;", "Lcom/zettle/sdk/PaymentEvent$Completed;", "Lcom/zettle/sdk/PaymentEvent$ConnectingToReader;", "Lcom/zettle/sdk/PaymentEvent$Failed;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "Lcom/zettle/sdk/PaymentEvent$Gratuity;", "Lcom/zettle/sdk/PaymentEvent$Initial;", "Lcom/zettle/sdk/PaymentEvent$Offline;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry;", "Lcom/zettle/sdk/PaymentEvent$Pin;", "Lcom/zettle/sdk/PaymentEvent$PresentCard;", "Lcom/zettle/sdk/PaymentEvent$ProcessingPayment;", "Lcom/zettle/sdk/PaymentEvent$Queued;", "Lcom/zettle/sdk/PaymentEvent$UncertainPayment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class PaymentEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "READER_DISCONNECTED", "FINISH_TRANSACTION_ERROR", "DISPLAY_APPROVED_SCREEN_ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ReaderFinalizationFailureReason {
        READER_DISCONNECTED,
        FINISH_TRANSACTION_ERROR,
        DISPLAY_APPROVED_SCREEN_ERROR
    }

    private PaymentEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Queued;", "Lcom/zettle/sdk/PaymentEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Queued extends com.zettle.sdk.PaymentEvent {
        public static final com.zettle.sdk.PaymentEvent.Queued INSTANCE = new com.zettle.sdk.PaymentEvent.Queued();

        private Queued() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Initial;", "Lcom/zettle/sdk/PaymentEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initial extends com.zettle.sdk.PaymentEvent {
        public static final com.zettle.sdk.PaymentEvent.Initial INSTANCE = new com.zettle.sdk.PaymentEvent.Initial();

        private Initial() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$ConnectingToReader;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;)Lcom/zettle/sdk/PaymentEvent$ConnectingToReader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;", "getStep", "Step"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ConnectingToReader extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentEvent.ConnectingToReader.Step step;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$ConnectingToReader$Step;", "", "<init>", "(Ljava/lang/String;I)V", "NoReadersAvailable", "SelectingReader", "ReservingReader", "WaitingReaderConnected", "WaitingReaderTurnedOn", "WakingUpReader", "ReaderUpdating", "UpdateFailed", "ReaderRebooting", "ReaderReady"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Step {
            NoReadersAvailable,
            SelectingReader,
            ReservingReader,
            WaitingReaderConnected,
            WaitingReaderTurnedOn,
            WakingUpReader,
            ReaderUpdating,
            UpdateFailed,
            ReaderRebooting,
            ReaderReady
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectingToReader(com.zettle.sdk.PaymentEvent.ConnectingToReader.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.ConnectingToReader.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.ConnectingToReader.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectingToReader(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.ConnectingToReader) && this.step == ((com.zettle.sdk.PaymentEvent.ConnectingToReader) other).step;
        }

        public final com.zettle.sdk.PaymentEvent.ConnectingToReader copy(com.zettle.sdk.PaymentEvent.ConnectingToReader.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.ConnectingToReader(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.ConnectingToReader.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.ConnectingToReader copy$default(com.zettle.sdk.PaymentEvent.ConnectingToReader connectingToReader, com.zettle.sdk.PaymentEvent.ConnectingToReader.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = connectingToReader.step;
            }
            return connectingToReader.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$PresentCard;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/Amount;", "selectedGratuity", "<init>", "(Lcom/zettle/sdk/Amount;)V", "component1", "()Lcom/zettle/sdk/Amount;", "copy", "(Lcom/zettle/sdk/Amount;)Lcom/zettle/sdk/PaymentEvent$PresentCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/Amount;", "getSelectedGratuity"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PresentCard extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.Amount selectedGratuity;

        public PresentCard(com.zettle.sdk.Amount amount) {
            super(null);
            this.selectedGratuity = amount;
        }

        public /* synthetic */ PresentCard(com.zettle.sdk.Amount amount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : amount);
        }

        public final com.zettle.sdk.Amount getSelectedGratuity() {
            return this.selectedGratuity;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.Amount amount = this.selectedGratuity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PresentCard(selectedGratuity=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.zettle.sdk.Amount amount = this.selectedGratuity;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.PresentCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedGratuity, ((com.zettle.sdk.PaymentEvent.PresentCard) other).selectedGratuity);
        }

        public final com.zettle.sdk.PaymentEvent.PresentCard copy(com.zettle.sdk.Amount selectedGratuity) {
            return new com.zettle.sdk.PaymentEvent.PresentCard(selectedGratuity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.Amount getSelectedGratuity() {
            return this.selectedGratuity;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.PresentCard copy$default(com.zettle.sdk.PaymentEvent.PresentCard presentCard, com.zettle.sdk.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = presentCard.selectedGratuity;
            }
            return presentCard.copy(amount);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PresentCard() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$CardPresented;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/CardDetails;", "cardDetails", "<init>", "(Lcom/zettle/sdk/CardDetails;)V", "component1", "()Lcom/zettle/sdk/CardDetails;", "copy", "(Lcom/zettle/sdk/CardDetails;)Lcom/zettle/sdk/PaymentEvent$CardPresented;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/CardDetails;", "getCardDetails"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CardPresented extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.CardDetails cardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardPresented(com.zettle.sdk.CardDetails cardDetails) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            this.cardDetails = cardDetails;
        }

        public final com.zettle.sdk.CardDetails getCardDetails() {
            return this.cardDetails;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.CardDetails cardDetails = this.cardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardPresented(cardDetails=");
            sb.append(cardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.CardPresented) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.zettle.sdk.PaymentEvent.CardPresented) other).cardDetails);
        }

        public final com.zettle.sdk.PaymentEvent.CardPresented copy(com.zettle.sdk.CardDetails cardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            return new com.zettle.sdk.PaymentEvent.CardPresented(cardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.CardDetails getCardDetails() {
            return this.cardDetails;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.CardPresented copy$default(com.zettle.sdk.PaymentEvent.CardPresented cardPresented, com.zettle.sdk.CardDetails cardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardDetails = cardPresented.cardDetails;
            }
            return cardPresented.copy(cardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$ProcessingPayment;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;)Lcom/zettle/sdk/PaymentEvent$ProcessingPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;", "getStep", "Step"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ProcessingPayment extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentEvent.ProcessingPayment.Step step;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$ProcessingPayment$Step;", "", "<init>", "(Ljava/lang/String;I)V", "SelectInstallment", "SelectingPaymentApp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Step {
            SelectInstallment,
            SelectingPaymentApp
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessingPayment(com.zettle.sdk.PaymentEvent.ProcessingPayment.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.ProcessingPayment.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.ProcessingPayment.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingPayment(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.ProcessingPayment) && this.step == ((com.zettle.sdk.PaymentEvent.ProcessingPayment) other).step;
        }

        public final com.zettle.sdk.PaymentEvent.ProcessingPayment copy(com.zettle.sdk.PaymentEvent.ProcessingPayment.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.ProcessingPayment(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.ProcessingPayment.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.ProcessingPayment copy$default(com.zettle.sdk.PaymentEvent.ProcessingPayment processingPayment, com.zettle.sdk.PaymentEvent.ProcessingPayment.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = processingPayment.step;
            }
            return processingPayment.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$AuthorizePayment;", "Lcom/zettle/sdk/PaymentEvent;", "<init>", "()V", "Authorized", "Authorizing", "Lcom/zettle/sdk/PaymentEvent$AuthorizePayment$Authorized;", "Lcom/zettle/sdk/PaymentEvent$AuthorizePayment$Authorizing;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AuthorizePayment extends com.zettle.sdk.PaymentEvent {
        private AuthorizePayment() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$AuthorizePayment$Authorizing;", "Lcom/zettle/sdk/PaymentEvent$AuthorizePayment;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Authorizing extends com.zettle.sdk.PaymentEvent.AuthorizePayment {
            public static final com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorizing INSTANCE = new com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorizing();

            private Authorizing() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$AuthorizePayment$Authorized;", "Lcom/zettle/sdk/PaymentEvent$AuthorizePayment;", "Lcom/zettle/sdk/PaymentResult;", "result", "<init>", "(Lcom/zettle/sdk/PaymentResult;)V", "component1", "()Lcom/zettle/sdk/PaymentResult;", "copy", "(Lcom/zettle/sdk/PaymentResult;)Lcom/zettle/sdk/PaymentEvent$AuthorizePayment$Authorized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentResult;", "getResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Authorized extends com.zettle.sdk.PaymentEvent.AuthorizePayment {
            private final com.zettle.sdk.PaymentResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Authorized(com.zettle.sdk.PaymentResult paymentResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentResult, "");
                this.result = paymentResult;
            }

            public final com.zettle.sdk.PaymentResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.PaymentResult paymentResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Authorized(result=");
                sb.append(paymentResult);
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
                return (other instanceof com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized) other).result);
            }

            public final com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized copy(com.zettle.sdk.PaymentResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.PaymentResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized copy$default(com.zettle.sdk.PaymentEvent.AuthorizePayment.Authorized authorized, com.zettle.sdk.PaymentResult paymentResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    paymentResult = authorized.result;
                }
                return authorized.copy(paymentResult);
            }
        }

        public /* synthetic */ AuthorizePayment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "Lcom/zettle/sdk/PaymentEvent;", "<init>", "()V", "ApprovedScreenDisplayed", "ApprovedScreenDisplaying", "ReaderFinalizationFailed", "RemoveCard", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ApprovedScreenDisplayed;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ApprovedScreenDisplaying;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ReaderFinalizationFailed;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment$RemoveCard;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FinalizePayment extends com.zettle.sdk.PaymentEvent {
        private FinalizePayment() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ApprovedScreenDisplaying;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ApprovedScreenDisplaying extends com.zettle.sdk.PaymentEvent.FinalizePayment {
            public static final com.zettle.sdk.PaymentEvent.FinalizePayment.ApprovedScreenDisplaying INSTANCE = new com.zettle.sdk.PaymentEvent.FinalizePayment.ApprovedScreenDisplaying();

            private ApprovedScreenDisplaying() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ApprovedScreenDisplayed;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ApprovedScreenDisplayed extends com.zettle.sdk.PaymentEvent.FinalizePayment {
            public static final com.zettle.sdk.PaymentEvent.FinalizePayment.ApprovedScreenDisplayed INSTANCE = new com.zettle.sdk.PaymentEvent.FinalizePayment.ApprovedScreenDisplayed();

            private ApprovedScreenDisplayed() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$FinalizePayment$RemoveCard;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RemoveCard extends com.zettle.sdk.PaymentEvent.FinalizePayment {
            public static final com.zettle.sdk.PaymentEvent.FinalizePayment.RemoveCard INSTANCE = new com.zettle.sdk.PaymentEvent.FinalizePayment.RemoveCard();

            private RemoveCard() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ReaderFinalizationFailed;", "Lcom/zettle/sdk/PaymentEvent$FinalizePayment;", "Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;", "copy", "(Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;)Lcom/zettle/sdk/PaymentEvent$FinalizePayment$ReaderFinalizationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$ReaderFinalizationFailureReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ReaderFinalizationFailed extends com.zettle.sdk.PaymentEvent.FinalizePayment {
            private final com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReaderFinalizationFailed(com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason readerFinalizationFailureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerFinalizationFailureReason, "");
                this.reason = readerFinalizationFailureReason;
            }

            public final com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason readerFinalizationFailureReason = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ReaderFinalizationFailed(reason=");
                sb.append(readerFinalizationFailureReason);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed) && this.reason == ((com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed) other).reason;
            }

            public final com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed copy(com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed copy$default(com.zettle.sdk.PaymentEvent.FinalizePayment.ReaderFinalizationFailed readerFinalizationFailed, com.zettle.sdk.PaymentEvent.ReaderFinalizationFailureReason readerFinalizationFailureReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    readerFinalizationFailureReason = readerFinalizationFailed.reason;
                }
                return readerFinalizationFailed.copy(readerFinalizationFailureReason);
            }
        }

        public /* synthetic */ FinalizePayment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Completed;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentResult;", "result", "<init>", "(Lcom/zettle/sdk/PaymentResult;)V", "component1", "()Lcom/zettle/sdk/PaymentResult;", "copy", "(Lcom/zettle/sdk/PaymentResult;)Lcom/zettle/sdk/PaymentEvent$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentResult;", "getResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Completed extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(com.zettle.sdk.PaymentResult paymentResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentResult, "");
            this.result = paymentResult;
        }

        public final com.zettle.sdk.PaymentResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentResult paymentResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(result=");
            sb.append(paymentResult);
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
            return (other instanceof com.zettle.sdk.PaymentEvent.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.zettle.sdk.PaymentEvent.Completed) other).result);
        }

        public final com.zettle.sdk.PaymentEvent.Completed copy(com.zettle.sdk.PaymentResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.zettle.sdk.PaymentEvent.Completed(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.Completed copy$default(com.zettle.sdk.PaymentEvent.Completed completed, com.zettle.sdk.PaymentResult paymentResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentResult = completed.result;
            }
            return completed.copy(paymentResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;)Lcom/zettle/sdk/PaymentEvent$Gratuity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "getStep", "Step", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Gratuity extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentEvent.Gratuity.Step step;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Extra", "Total", "Percent"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Type {
            Extra,
            Total,
            Percent
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "", "Cancelling", "NotSupported", "Selecting", "WaitingForGratuity", "WrongValueEntered", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$Cancelling;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$NotSupported;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$Selecting;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WaitingForGratuity;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Step {

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WaitingForGratuity;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "type", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;)Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WaitingForGratuity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class WaitingForGratuity implements com.zettle.sdk.PaymentEvent.Gratuity.Step {
                private final com.zettle.sdk.PaymentEvent.Gratuity.Type type;

                public WaitingForGratuity(com.zettle.sdk.PaymentEvent.Gratuity.Type type) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    this.type = type;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentEvent.Gratuity.Type type = this.type;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("WaitingForGratuity(type=");
                    sb.append(type);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.type.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity) && this.type == ((com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity) other).type;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity copy(com.zettle.sdk.PaymentEvent.Gratuity.Type type) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    return new com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity(type);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity copy$default(com.zettle.sdk.PaymentEvent.Gratuity.Step.WaitingForGratuity waitingForGratuity, com.zettle.sdk.PaymentEvent.Gratuity.Type type, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type = waitingForGratuity.type;
                    }
                    return waitingForGratuity.copy(type);
                }
            }

            @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$Selecting;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "type", "", "gratuity", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;Ljava/lang/Long;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "component2", "()Ljava/lang/Long;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;Ljava/lang/Long;)Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$Selecting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getGratuity", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class Selecting implements com.zettle.sdk.PaymentEvent.Gratuity.Step {
                private final java.lang.Long gratuity;
                private final com.zettle.sdk.PaymentEvent.Gratuity.Type type;

                public Selecting(com.zettle.sdk.PaymentEvent.Gratuity.Type type, java.lang.Long l) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    this.type = type;
                    this.gratuity = l;
                }

                public final java.lang.Long getGratuity() {
                    return this.gratuity;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentEvent.Gratuity.Type type = this.type;
                    java.lang.Long l = this.gratuity;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Selecting(type=");
                    sb.append(type);
                    sb.append(", gratuity=");
                    sb.append(l);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    int hashCode = this.type.hashCode();
                    java.lang.Long l = this.gratuity;
                    return (hashCode * 31) + (l == null ? 0 : l.hashCode());
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting)) {
                        return false;
                    }
                    com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting selecting = (com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting) other;
                    return this.type == selecting.type && kotlin.jvm.internal.Intrinsics.areEqual(this.gratuity, selecting.gratuity);
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting copy(com.zettle.sdk.PaymentEvent.Gratuity.Type type, java.lang.Long gratuity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    return new com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting(type, gratuity);
                }

                /* renamed from: component2, reason: from getter */
                public final java.lang.Long getGratuity() {
                    return this.gratuity;
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting copy$default(com.zettle.sdk.PaymentEvent.Gratuity.Step.Selecting selecting, com.zettle.sdk.PaymentEvent.Gratuity.Type type, java.lang.Long l, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type = selecting.type;
                    }
                    if ((i & 2) != 0) {
                        l = selecting.gratuity;
                    }
                    return selecting.copy(type, l);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "type", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;", "error", "", "totalAmount", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;Ljava/lang/Long;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "component2", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;", "component3", "()Ljava/lang/Long;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;Ljava/lang/Long;)Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;", "getError", "Ljava/lang/Long;", "getTotalAmount", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "getType", "Error"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class WrongValueEntered implements com.zettle.sdk.PaymentEvent.Gratuity.Step {
                private final com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error error;
                private final java.lang.Long totalAmount;
                private final com.zettle.sdk.PaymentEvent.Gratuity.Type type;

                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$WrongValueEntered$Error;", "", "<init>", "(Ljava/lang/String;I)V", "TooLow", "TooHigh"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public enum Error {
                    TooLow,
                    TooHigh
                }

                public WrongValueEntered(com.zettle.sdk.PaymentEvent.Gratuity.Type type, com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error error, java.lang.Long l) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    this.type = type;
                    this.error = error;
                    this.totalAmount = l;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error getError() {
                    return this.error;
                }

                public final java.lang.Long getTotalAmount() {
                    return this.totalAmount;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentEvent.Gratuity.Type type = this.type;
                    com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error error = this.error;
                    java.lang.Long l = this.totalAmount;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("WrongValueEntered(type=");
                    sb.append(type);
                    sb.append(", error=");
                    sb.append(error);
                    sb.append(", totalAmount=");
                    sb.append(l);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    int hashCode = this.type.hashCode();
                    int hashCode2 = this.error.hashCode();
                    java.lang.Long l = this.totalAmount;
                    return (((hashCode * 31) + hashCode2) * 31) + (l == null ? 0 : l.hashCode());
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered)) {
                        return false;
                    }
                    com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered wrongValueEntered = (com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered) other;
                    return this.type == wrongValueEntered.type && this.error == wrongValueEntered.error && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, wrongValueEntered.totalAmount);
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered copy(com.zettle.sdk.PaymentEvent.Gratuity.Type type, com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error error, java.lang.Long totalAmount) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    return new com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered(type, error, totalAmount);
                }

                /* renamed from: component3, reason: from getter */
                public final java.lang.Long getTotalAmount() {
                    return this.totalAmount;
                }

                /* renamed from: component2, reason: from getter */
                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error getError() {
                    return this.error;
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered copy$default(com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered wrongValueEntered, com.zettle.sdk.PaymentEvent.Gratuity.Type type, com.zettle.sdk.PaymentEvent.Gratuity.Step.WrongValueEntered.Error error, java.lang.Long l, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type = wrongValueEntered.type;
                    }
                    if ((i & 2) != 0) {
                        error = wrongValueEntered.error;
                    }
                    if ((i & 4) != 0) {
                        l = wrongValueEntered.totalAmount;
                    }
                    return wrongValueEntered.copy(type, error, l);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$Cancelling;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Cancelling implements com.zettle.sdk.PaymentEvent.Gratuity.Step {
                public static final com.zettle.sdk.PaymentEvent.Gratuity.Step.Cancelling INSTANCE = new com.zettle.sdk.PaymentEvent.Gratuity.Step.Cancelling();

                private Cancelling() {
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$NotSupported;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Step;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "type", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;)Lcom/zettle/sdk/PaymentEvent$Gratuity$Step$NotSupported;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Gratuity$Type;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class NotSupported implements com.zettle.sdk.PaymentEvent.Gratuity.Step {
                private final com.zettle.sdk.PaymentEvent.Gratuity.Type type;

                public NotSupported(com.zettle.sdk.PaymentEvent.Gratuity.Type type) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    this.type = type;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentEvent.Gratuity.Type type = this.type;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("NotSupported(type=");
                    sb.append(type);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.type.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported) && this.type == ((com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported) other).type;
                }

                public final com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported copy(com.zettle.sdk.PaymentEvent.Gratuity.Type type) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    return new com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported(type);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentEvent.Gratuity.Type getType() {
                    return this.type;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported copy$default(com.zettle.sdk.PaymentEvent.Gratuity.Step.NotSupported notSupported, com.zettle.sdk.PaymentEvent.Gratuity.Type type, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type = notSupported.type;
                    }
                    return notSupported.copy(type);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gratuity(com.zettle.sdk.PaymentEvent.Gratuity.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.Gratuity.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.Gratuity.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gratuity(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.Gratuity) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.zettle.sdk.PaymentEvent.Gratuity) other).step);
        }

        public final com.zettle.sdk.PaymentEvent.Gratuity copy(com.zettle.sdk.PaymentEvent.Gratuity.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.Gratuity(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.Gratuity.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.Gratuity copy$default(com.zettle.sdk.PaymentEvent.Gratuity gratuity, com.zettle.sdk.PaymentEvent.Gratuity.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = gratuity.step;
            }
            return gratuity.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Pin;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Pin$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Pin$Step;)Lcom/zettle/sdk/PaymentEvent$Pin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "getStep", "Step"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Pin extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentEvent.Pin.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pin(com.zettle.sdk.PaymentEvent.Pin.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.Pin.Step getStep() {
            return this.step;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "", "PinEntrance", "WrongPinEntered", "Lcom/zettle/sdk/PaymentEvent$Pin$Step$PinEntrance;", "Lcom/zettle/sdk/PaymentEvent$Pin$Step$WrongPinEntered;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Step {

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Pin$Step$PinEntrance;", "Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "", "digitsEntered", "", "canSkip", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/zettle/sdk/PaymentEvent$Pin$Step$PinEntrance;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getCanSkip", com.visa.cbp.getEncExpo.warmup, "getDigitsEntered"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class PinEntrance implements com.zettle.sdk.PaymentEvent.Pin.Step {
                private final boolean canSkip;
                private final int digitsEntered;

                public PinEntrance(int i, boolean z) {
                    this.digitsEntered = i;
                    this.canSkip = z;
                }

                public final boolean getCanSkip() {
                    return this.canSkip;
                }

                public final int getDigitsEntered() {
                    return this.digitsEntered;
                }

                public final java.lang.String toString() {
                    int i = this.digitsEntered;
                    boolean z = this.canSkip;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PinEntrance(digitsEntered=");
                    sb.append(i);
                    sb.append(", canSkip=");
                    sb.append(z);
                    sb.append(")");
                    return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final int hashCode() {
                    int hashCode = java.lang.Integer.hashCode(this.digitsEntered);
                    boolean z = this.canSkip;
                    int i = z;
                    if (z != 0) {
                        i = 1;
                    }
                    return (hashCode * 31) + i;
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance)) {
                        return false;
                    }
                    com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance pinEntrance = (com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance) other;
                    return this.digitsEntered == pinEntrance.digitsEntered && this.canSkip == pinEntrance.canSkip;
                }

                public final com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance copy(int digitsEntered, boolean canSkip) {
                    return new com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance(digitsEntered, canSkip);
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getCanSkip() {
                    return this.canSkip;
                }

                /* renamed from: component1, reason: from getter */
                public final int getDigitsEntered() {
                    return this.digitsEntered;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance copy$default(com.zettle.sdk.PaymentEvent.Pin.Step.PinEntrance pinEntrance, int i, boolean z, int i2, java.lang.Object obj) {
                    if ((i2 & 1) != 0) {
                        i = pinEntrance.digitsEntered;
                    }
                    if ((i2 & 2) != 0) {
                        z = pinEntrance.canSkip;
                    }
                    return pinEntrance.copy(i, z);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Pin$Step$WrongPinEntered;", "Lcom/zettle/sdk/PaymentEvent$Pin$Step;", "", "lastAttempt", "canSkip", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/zettle/sdk/PaymentEvent$Pin$Step$WrongPinEntered;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCanSkip", "getLastAttempt"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class WrongPinEntered implements com.zettle.sdk.PaymentEvent.Pin.Step {
                private final boolean canSkip;
                private final boolean lastAttempt;

                public WrongPinEntered(boolean z, boolean z2) {
                    this.lastAttempt = z;
                    this.canSkip = z2;
                }

                public final boolean getCanSkip() {
                    return this.canSkip;
                }

                public final boolean getLastAttempt() {
                    return this.lastAttempt;
                }

                public final java.lang.String toString() {
                    boolean z = this.lastAttempt;
                    boolean z2 = this.canSkip;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("WrongPinEntered(lastAttempt=");
                    sb.append(z);
                    sb.append(", canSkip=");
                    sb.append(z2);
                    sb.append(")");
                    return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5 */
                public final int hashCode() {
                    boolean z = this.lastAttempt;
                    ?? r0 = z;
                    if (z) {
                        r0 = 1;
                    }
                    boolean z2 = this.canSkip;
                    return (r0 * 31) + (z2 ? 1 : z2 ? 1 : 0);
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered)) {
                        return false;
                    }
                    com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered wrongPinEntered = (com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered) other;
                    return this.lastAttempt == wrongPinEntered.lastAttempt && this.canSkip == wrongPinEntered.canSkip;
                }

                public final com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered copy(boolean lastAttempt, boolean canSkip) {
                    return new com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered(lastAttempt, canSkip);
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getCanSkip() {
                    return this.canSkip;
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getLastAttempt() {
                    return this.lastAttempt;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered copy$default(com.zettle.sdk.PaymentEvent.Pin.Step.WrongPinEntered wrongPinEntered, boolean z, boolean z2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        z = wrongPinEntered.lastAttempt;
                    }
                    if ((i & 2) != 0) {
                        z2 = wrongPinEntered.canSkip;
                    }
                    return wrongPinEntered.copy(z, z2);
                }
            }
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.Pin.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pin(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.Pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.zettle.sdk.PaymentEvent.Pin) other).step);
        }

        public final com.zettle.sdk.PaymentEvent.Pin copy(com.zettle.sdk.PaymentEvent.Pin.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.Pin(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.Pin.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.Pin copy$default(com.zettle.sdk.PaymentEvent.Pin pin, com.zettle.sdk.PaymentEvent.Pin.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = pin.step;
            }
            return pin.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;)Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "getStep", "Step"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OnlineAuthorizationRetry extends com.zettle.sdk.PaymentEvent {
        public static int getHighResolutionOutputSizeshNQ4ISI;
        public static int getHighSpeedVideoSizes;
        private final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnlineAuthorizationRetry(com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step getStep() {
            return this.step;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "", "Attempting", "Exhausted", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Attempting;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Exhausted;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Step {

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Attempting;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "", "attempt", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Attempting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getAttempt"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class Attempting implements com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step {
                private final int attempt;

                public Attempting(int i) {
                    this.attempt = i;
                }

                public final int getAttempt() {
                    return this.attempt;
                }

                public final java.lang.String toString() {
                    int i = this.attempt;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting(attempt=");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return java.lang.Integer.hashCode(this.attempt);
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting) && this.attempt == ((com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting) other).attempt;
                }

                public final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting copy(int attempt) {
                    return new com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting(attempt);
                }

                /* renamed from: component1, reason: from getter */
                public final int getAttempt() {
                    return this.attempt;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting copy$default(com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Attempting attempting, int i, int i2, java.lang.Object obj) {
                    if ((i2 & 1) != 0) {
                        i = attempting.attempt;
                    }
                    return attempting.copy(i);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Exhausted;", "Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step;", "", "attemptsPerformed", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/zettle/sdk/PaymentEvent$OnlineAuthorizationRetry$Step$Exhausted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getAttemptsPerformed"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class Exhausted implements com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step {
                private final int attemptsPerformed;

                public Exhausted(int i) {
                    this.attemptsPerformed = i;
                }

                public final int getAttemptsPerformed() {
                    return this.attemptsPerformed;
                }

                public final java.lang.String toString() {
                    int i = this.attemptsPerformed;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exhausted(attemptsPerformed=");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return java.lang.Integer.hashCode(this.attemptsPerformed);
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted) && this.attemptsPerformed == ((com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted) other).attemptsPerformed;
                }

                public final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted copy(int attemptsPerformed) {
                    return new com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted(attemptsPerformed);
                }

                /* renamed from: component1, reason: from getter */
                public final int getAttemptsPerformed() {
                    return this.attemptsPerformed;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted copy$default(com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step.Exhausted exhausted, int i, int i2, java.lang.Object obj) {
                    if ((i2 & 1) != 0) {
                        i = exhausted.attemptsPerformed;
                    }
                    return exhausted.copy(i);
                }
            }
        }

        public static int getHighSpeedVideoFpsRanges() {
            int i = getHighSpeedVideoSizes;
            int i2 = i % 6577925;
            getHighSpeedVideoSizes = i + 1;
            if (i2 != 0) {
                return getHighResolutionOutputSizeshNQ4ISI;
            }
            int i3 = (int) java.lang.Runtime.getRuntime().totalMemory();
            getHighResolutionOutputSizeshNQ4ISI = i3;
            return i3;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnlineAuthorizationRetry(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry) other).step);
        }

        public final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry copy(com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry copy$default(com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry onlineAuthorizationRetry, com.zettle.sdk.PaymentEvent.OnlineAuthorizationRetry.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = onlineAuthorizationRetry.step;
            }
            return onlineAuthorizationRetry.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "step", "<init>", "(Lcom/zettle/sdk/PaymentEvent$Offline$Step;)V", "component1", "()Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "copy", "(Lcom/zettle/sdk/PaymentEvent$Offline$Step;)Lcom/zettle/sdk/PaymentEvent$Offline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "getStep", "Step"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Offline extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentEvent.Offline.Step step;

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "", "FallbackToOffline", "OfflineDeclined", "OfflineFallbackFailed", "OfflinePaymentStoreFailed", "OfflinePaymentStored", "Lcom/zettle/sdk/PaymentEvent$Offline$Step$FallbackToOffline;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineDeclined;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineFallbackFailed;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflinePaymentStoreFailed;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflinePaymentStored;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Step {

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step$FallbackToOffline;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "Lcom/zettle/sdk/OfflineFallbackReason;", "reason", "<init>", "(Lcom/zettle/sdk/OfflineFallbackReason;)V", "component1", "()Lcom/zettle/sdk/OfflineFallbackReason;", "copy", "(Lcom/zettle/sdk/OfflineFallbackReason;)Lcom/zettle/sdk/PaymentEvent$Offline$Step$FallbackToOffline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/OfflineFallbackReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class FallbackToOffline implements com.zettle.sdk.PaymentEvent.Offline.Step {
                private final com.zettle.sdk.OfflineFallbackReason reason;

                public FallbackToOffline(com.zettle.sdk.OfflineFallbackReason offlineFallbackReason) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineFallbackReason, "");
                    this.reason = offlineFallbackReason;
                }

                public final com.zettle.sdk.OfflineFallbackReason getReason() {
                    return this.reason;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.OfflineFallbackReason offlineFallbackReason = this.reason;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("FallbackToOffline(reason=");
                    sb.append(offlineFallbackReason);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.reason.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline) && this.reason == ((com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline) other).reason;
                }

                public final com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline copy(com.zettle.sdk.OfflineFallbackReason reason) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                    return new com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline(reason);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.OfflineFallbackReason getReason() {
                    return this.reason;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline copy$default(com.zettle.sdk.PaymentEvent.Offline.Step.FallbackToOffline fallbackToOffline, com.zettle.sdk.OfflineFallbackReason offlineFallbackReason, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        offlineFallbackReason = fallbackToOffline.reason;
                    }
                    return fallbackToOffline.copy(offlineFallbackReason);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineFallbackFailed;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "reason", "<init>", "(Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;)V", "component1", "()Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "copy", "(Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;)Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineFallbackFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class OfflineFallbackFailed implements com.zettle.sdk.PaymentEvent.Offline.Step {
                private final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError reason;

                public OfflineFallbackFailed(com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineSystemError, "");
                    this.reason = offlineSystemError;
                }

                public final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError getReason() {
                    return this.reason;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError = this.reason;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineFallbackFailed(reason=");
                    sb.append(offlineSystemError);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.reason.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed) other).reason);
                }

                public final com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed copy(com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError reason) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                    return new com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed(reason);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError getReason() {
                    return this.reason;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed copy$default(com.zettle.sdk.PaymentEvent.Offline.Step.OfflineFallbackFailed offlineFallbackFailed, com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        offlineSystemError = offlineFallbackFailed.reason;
                    }
                    return offlineFallbackFailed.copy(offlineSystemError);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineDeclined;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "reason", "<init>", "(Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;)V", "component1", "()Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "copy", "(Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;)Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflineDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentFailureReason$AuthorizationFailure$OfflineAuthorizationDeclined;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class OfflineDeclined implements com.zettle.sdk.PaymentEvent.Offline.Step {
                private final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined reason;

                public OfflineDeclined(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined offlineAuthorizationDeclined) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineAuthorizationDeclined, "");
                    this.reason = offlineAuthorizationDeclined;
                }

                public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined getReason() {
                    return this.reason;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined offlineAuthorizationDeclined = this.reason;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineDeclined(reason=");
                    sb.append(offlineAuthorizationDeclined);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.reason.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined) other).reason);
                }

                public final com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined copy(com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined reason) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                    return new com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined(reason);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined getReason() {
                    return this.reason;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined copy$default(com.zettle.sdk.PaymentEvent.Offline.Step.OfflineDeclined offlineDeclined, com.zettle.sdk.PaymentFailureReason.AuthorizationFailure.OfflineAuthorizationDeclined offlineAuthorizationDeclined, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        offlineAuthorizationDeclined = offlineDeclined.reason;
                    }
                    return offlineDeclined.copy(offlineAuthorizationDeclined);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflinePaymentStored;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class OfflinePaymentStored implements com.zettle.sdk.PaymentEvent.Offline.Step {
                public static final com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStored INSTANCE = new com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStored();

                private OfflinePaymentStored() {
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflinePaymentStoreFailed;", "Lcom/zettle/sdk/PaymentEvent$Offline$Step;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "reason", "<init>", "(Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;)V", "component1", "()Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "copy", "(Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;)Lcom/zettle/sdk/PaymentEvent$Offline$Step$OfflinePaymentStoreFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentFailureReason$ValidationError$OfflineSystemError;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class OfflinePaymentStoreFailed implements com.zettle.sdk.PaymentEvent.Offline.Step {
                private final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError reason;

                public OfflinePaymentStoreFailed(com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offlineSystemError, "");
                    this.reason = offlineSystemError;
                }

                public final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError getReason() {
                    return this.reason;
                }

                public final java.lang.String toString() {
                    com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError = this.reason;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflinePaymentStoreFailed(reason=");
                    sb.append(offlineSystemError);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.reason.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed) other).reason);
                }

                public final com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed copy(com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError reason) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                    return new com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed(reason);
                }

                /* renamed from: component1, reason: from getter */
                public final com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError getReason() {
                    return this.reason;
                }

                public static /* synthetic */ com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed copy$default(com.zettle.sdk.PaymentEvent.Offline.Step.OfflinePaymentStoreFailed offlinePaymentStoreFailed, com.zettle.sdk.PaymentFailureReason.ValidationError.OfflineSystemError offlineSystemError, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        offlineSystemError = offlinePaymentStoreFailed.reason;
                    }
                    return offlinePaymentStoreFailed.copy(offlineSystemError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offline(com.zettle.sdk.PaymentEvent.Offline.Step step) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            this.step = step;
        }

        public final com.zettle.sdk.PaymentEvent.Offline.Step getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentEvent.Offline.Step step = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offline(step=");
            sb.append(step);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.Offline) && kotlin.jvm.internal.Intrinsics.areEqual(this.step, ((com.zettle.sdk.PaymentEvent.Offline) other).step);
        }

        public final com.zettle.sdk.PaymentEvent.Offline copy(com.zettle.sdk.PaymentEvent.Offline.Step step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.zettle.sdk.PaymentEvent.Offline(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentEvent.Offline.Step getStep() {
            return this.step;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.Offline copy$default(com.zettle.sdk.PaymentEvent.Offline offline, com.zettle.sdk.PaymentEvent.Offline.Step step, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                step = offline.step;
            }
            return offline.copy(step);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$Failed;", "Lcom/zettle/sdk/PaymentEvent;", "Lcom/zettle/sdk/PaymentFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/PaymentFailureReason;)V", "component1", "()Lcom/zettle/sdk/PaymentFailureReason;", "copy", "(Lcom/zettle/sdk/PaymentFailureReason;)Lcom/zettle/sdk/PaymentEvent$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PaymentFailureReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failed extends com.zettle.sdk.PaymentEvent {
        private final com.zettle.sdk.PaymentFailureReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.zettle.sdk.PaymentFailureReason paymentFailureReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFailureReason, "");
            this.reason = paymentFailureReason;
        }

        public final com.zettle.sdk.PaymentFailureReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.PaymentFailureReason paymentFailureReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(reason=");
            sb.append(paymentFailureReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.PaymentEvent.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.PaymentEvent.Failed) other).reason);
        }

        public final com.zettle.sdk.PaymentEvent.Failed copy(com.zettle.sdk.PaymentFailureReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.zettle.sdk.PaymentEvent.Failed(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.PaymentFailureReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.zettle.sdk.PaymentEvent.Failed copy$default(com.zettle.sdk.PaymentEvent.Failed failed, com.zettle.sdk.PaymentFailureReason paymentFailureReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentFailureReason = failed.reason;
            }
            return failed.copy(paymentFailureReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/PaymentEvent$UncertainPayment;", "Lcom/zettle/sdk/PaymentEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UncertainPayment extends com.zettle.sdk.PaymentEvent {
        public static final com.zettle.sdk.PaymentEvent.UncertainPayment INSTANCE = new com.zettle.sdk.PaymentEvent.UncertainPayment();

        private UncertainPayment() {
            super(null);
        }
    }

    public /* synthetic */ PaymentEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
