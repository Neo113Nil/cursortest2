package com.paypal.oslo.feature.taptopay.ui.paymode.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "", "LoadCards", "RetryLoadCards", "SelectCard", "ObservePayments", "CancelObservePayments", "ResetToDefaultState", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$CancelObservePayments;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$LoadCards;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$ObservePayments;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$ResetToDefaultState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$RetryLoadCards;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$SelectCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PayModeIntent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$LoadCards;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "initialPaymentState", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$LoadCards;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "getInitialPaymentState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadCards implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState initialPaymentState;

        public LoadCards(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState) {
            this.initialPaymentState = paymentState;
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState getInitialPaymentState() {
            return this.initialPaymentState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = this.initialPaymentState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadCards(initialPaymentState=");
            sb.append(paymentState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = this.initialPaymentState;
            if (paymentState == null) {
                return 0;
            }
            return paymentState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialPaymentState, ((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards) other).initialPaymentState);
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards copy(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState initialPaymentState) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards(initialPaymentState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState getInitialPaymentState() {
            return this.initialPaymentState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards loadCards, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentState = loadCards.initialPaymentState;
            }
            return loadCards.copy(paymentState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$RetryLoadCards;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoadCards implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.RetryLoadCards INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.RetryLoadCards();

        public final int hashCode() {
            return 1892646475;
        }

        private RetryLoadCards() {
        }

        public final java.lang.String toString() {
            return "RetryLoadCards";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.RetryLoadCards)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$SelectCard;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "", "cardIndex", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$SelectCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCardIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectCard implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 0;
        private final int cardIndex;

        public SelectCard(int i) {
            this.cardIndex = i;
        }

        public final int getCardIndex() {
            return this.cardIndex;
        }

        public final java.lang.String toString() {
            int i = this.cardIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectCard(cardIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.cardIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard) && this.cardIndex == ((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard) other).cardIndex;
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard copy(int cardIndex) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard(cardIndex);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCardIndex() {
            return this.cardIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard selectCard, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = selectCard.cardIndex;
            }
            return selectCard.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$ObservePayments;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "initialPaymentState", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$ObservePayments;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "getInitialPaymentState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ObservePayments implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState initialPaymentState;

        public ObservePayments(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState) {
            this.initialPaymentState = paymentState;
        }

        public /* synthetic */ ObservePayments(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentState);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState getInitialPaymentState() {
            return this.initialPaymentState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = this.initialPaymentState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ObservePayments(initialPaymentState=");
            sb.append(paymentState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState = this.initialPaymentState;
            if (paymentState == null) {
                return 0;
            }
            return paymentState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialPaymentState, ((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments) other).initialPaymentState);
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments copy(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState initialPaymentState) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments(initialPaymentState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState getInitialPaymentState() {
            return this.initialPaymentState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments observePayments, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentState = observePayments.initialPaymentState;
            }
            return observePayments.copy(paymentState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ObservePayments() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$CancelObservePayments;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelObservePayments implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.CancelObservePayments INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.CancelObservePayments();

        public final int hashCode() {
            return -390448167;
        }

        private CancelObservePayments() {
        }

        public final java.lang.String toString() {
            return "CancelObservePayments";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.CancelObservePayments)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent$ResetToDefaultState;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetToDefaultState implements com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ResetToDefaultState INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ResetToDefaultState();

        public final int hashCode() {
            return -991999004;
        }

        private ResetToDefaultState() {
        }

        public final java.lang.String toString() {
            return "ResetToDefaultState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ResetToDefaultState)) {
                return false;
            }
            return true;
        }
    }
}
