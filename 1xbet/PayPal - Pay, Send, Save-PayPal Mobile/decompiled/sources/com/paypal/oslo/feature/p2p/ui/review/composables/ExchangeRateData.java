package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData;", "", "FromFxQuote", "FromPlanExchange", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromPlanExchange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
interface ExchangeRateData {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "fxQuote", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromFxQuote;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromFxQuote implements com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;

        public FromFxQuote(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            this.fxQuote = fxQuote;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromFxQuote(fxQuote=");
            sb.append(fxQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fxQuote.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, ((com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote) other).fxQuote);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote copy(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            return new com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote(fxQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote copy$default(com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote fromFxQuote, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fxQuote = fromFxQuote.fxQuote;
            }
            return fromFxQuote.copy(fxQuote);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromPlanExchange;", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "exchange", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;)Lcom/paypal/oslo/feature/p2p/ui/review/composables/ExchangeRateData$FromPlanExchange;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "getExchange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromPlanExchange implements com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange exchange;

        public FromPlanExchange(com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchange, "");
            this.exchange = planCurrencyExchange;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getExchange() {
            return this.exchange;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.exchange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromPlanExchange(exchange=");
            sb.append(planCurrencyExchange);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.exchange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchange, ((com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange) other).exchange);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange copy(com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange exchange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "");
            return new com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange(exchange);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getExchange() {
            return this.exchange;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange copy$default(com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange fromPlanExchange, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planCurrencyExchange = fromPlanExchange.exchange;
            }
            return fromPlanExchange.copy(planCurrencyExchange);
        }
    }
}
