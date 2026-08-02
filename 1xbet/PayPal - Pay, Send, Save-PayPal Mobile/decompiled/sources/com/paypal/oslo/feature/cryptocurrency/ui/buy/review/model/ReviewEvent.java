package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "", "BuyAmountClick", "AccordionToggled", "RecurringOptionSelected", "RecurringContinueClick", "PaymentMethodSelected", "AddPaymentMethodClick", "BuyNowClick", "BackClick", "RefreshPaymentMethods", "PyusdRewardsToggleChange", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$AccordionToggled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$AddPaymentMethodClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BackClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BuyAmountClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BuyNowClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PaymentMethodSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PyusdRewardsToggleChange;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RecurringContinueClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RecurringOptionSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RefreshPaymentMethods;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ReviewEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BuyAmountClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyAmountClick implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyAmountClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyAmountClick();

        public final int hashCode() {
            return -1607620038;
        }

        private BuyAmountClick() {
        }

        public final java.lang.String toString() {
            return "BuyAmountClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyAmountClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$AccordionToggled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;", "step", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$AccordionToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AccordionToggled implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep step;

        public AccordionToggled(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewStep, "");
            this.step = reviewStep;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccordionToggled(step=");
            sb.append(reviewStep);
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled) && this.step == ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled) other).step;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled copy(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AccordionToggled accordionToggled, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewStep = accordionToggled.step;
            }
            return accordionToggled.copy(reviewStep);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RecurringOptionSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RecurringOptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecurringOptionSelected implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption option;

        public RecurringOptionSelected(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringOption, "");
            this.option = recurringOption;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecurringOptionSelected(option=");
            sb.append(recurringOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected) && this.option == ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected) other).option;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected copy(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringOptionSelected recurringOptionSelected, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recurringOption = recurringOptionSelected.option;
            }
            return recurringOptionSelected.copy(recurringOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RecurringContinueClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecurringContinueClick implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringContinueClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringContinueClick();

        public final int hashCode() {
            return -138629676;
        }

        private RecurringContinueClick() {
        }

        public final java.lang.String toString() {
            return "RecurringContinueClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RecurringContinueClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PaymentMethodSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;", "paymentMethod", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PaymentMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;", "getPaymentMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentMethodSelected implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod;

        public PaymentMethodSelected(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
            this.paymentMethod = paymentMethod;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = this.paymentMethod;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentMethodSelected(paymentMethod=");
            sb.append(paymentMethod);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethod, ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected) other).paymentMethod);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected copy(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected(paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PaymentMethodSelected paymentMethodSelected, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = paymentMethodSelected.paymentMethod;
            }
            return paymentMethodSelected.copy(paymentMethod);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$AddPaymentMethodClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethodClick implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AddPaymentMethodClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AddPaymentMethodClick();

        public final int hashCode() {
            return 464271154;
        }

        private AddPaymentMethodClick() {
        }

        public final java.lang.String toString() {
            return "AddPaymentMethodClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.AddPaymentMethodClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BuyNowClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyNowClick implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyNowClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyNowClick();

        public final int hashCode() {
            return 1574474344;
        }

        private BuyNowClick() {
        }

        public final java.lang.String toString() {
            return "BuyNowClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BuyNowClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$BackClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClick implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BackClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BackClick();

        public final int hashCode() {
            return 1810725457;
        }

        private BackClick() {
        }

        public final java.lang.String toString() {
            return "BackClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.BackClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$RefreshPaymentMethods;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshPaymentMethods implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RefreshPaymentMethods INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RefreshPaymentMethods();

        public final int hashCode() {
            return 1243171831;
        }

        private RefreshPaymentMethods() {
        }

        public final java.lang.String toString() {
            return "RefreshPaymentMethods";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.RefreshPaymentMethods)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PyusdRewardsToggleChange;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewEvent$PyusdRewardsToggleChange;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PyusdRewardsToggleChange implements com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public PyusdRewardsToggleChange(boolean z) {
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PyusdRewardsToggleChange(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange) && this.enabled == ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange) other).enabled;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange copy(boolean enabled) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewEvent.PyusdRewardsToggleChange pyusdRewardsToggleChange, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pyusdRewardsToggleChange.enabled;
            }
            return pyusdRewardsToggleChange.copy(z);
        }
    }
}
