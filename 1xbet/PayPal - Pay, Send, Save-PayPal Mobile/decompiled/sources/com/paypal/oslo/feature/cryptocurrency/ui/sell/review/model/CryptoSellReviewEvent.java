package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "", "PaymentAccordionToggled", "PaymentOptionSelected", "CryptoSellNowClick", "BackClick", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$BackClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$CryptoSellNowClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$PaymentAccordionToggled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$PaymentOptionSelected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoSellReviewEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$PaymentAccordionToggled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentAccordionToggled implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentAccordionToggled INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentAccordionToggled();

        public final int hashCode() {
            return 883116865;
        }

        private PaymentAccordionToggled() {
        }

        public final java.lang.String toString() {
            return "PaymentAccordionToggled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentAccordionToggled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$PaymentOptionSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$PaymentOptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentOptionSelected implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption option;

        public PaymentOptionSelected(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOption, "");
            this.option = cryptoSellPaymentOption;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOptionSelected(option=");
            sb.append(cryptoSellPaymentOption);
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.option, ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected) other).option);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected copy(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.PaymentOptionSelected paymentOptionSelected, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptoSellPaymentOption = paymentOptionSelected.option;
            }
            return paymentOptionSelected.copy(cryptoSellPaymentOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$CryptoSellNowClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoSellNowClick implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.CryptoSellNowClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.CryptoSellNowClick();

        public final int hashCode() {
            return 1336533330;
        }

        private CryptoSellNowClick() {
        }

        public final java.lang.String toString() {
            return "CryptoSellNowClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.CryptoSellNowClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent$BackClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClick implements com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.BackClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.BackClick();

        public final int hashCode() {
            return 1503231508;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEvent.BackClick)) {
                return false;
            }
            return true;
        }
    }
}
