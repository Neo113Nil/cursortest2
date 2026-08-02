package com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibility;", "cardEligibility", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/FinancialProductEligibility;", "promoEligibility", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "riskDecision", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCardEligibility", "getPromoEligibility", "getRiskDecision"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardEligibilityResult {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility;
    private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> promoEligibility;
    private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> riskDecision;

    /* JADX WARN: Multi-variable type inference failed */
    public CardEligibilityResult(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> list, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> list2, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.cardEligibility = list;
        this.promoEligibility = list2;
        this.riskDecision = list3;
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> getCardEligibility() {
        return this.cardEligibility;
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> getPromoEligibility() {
        return this.promoEligibility;
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> getRiskDecision() {
        return this.riskDecision;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> list = this.cardEligibility;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> list2 = this.promoEligibility;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> list3 = this.riskDecision;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardEligibilityResult(cardEligibility=");
        sb.append(list);
        sb.append(", promoEligibility=");
        sb.append(list2);
        sb.append(", riskDecision=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cardEligibility.hashCode() * 31) + this.promoEligibility.hashCode()) * 31) + this.riskDecision.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult cardEligibilityResult = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardEligibility, cardEligibilityResult.cardEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.promoEligibility, cardEligibilityResult.promoEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.riskDecision, cardEligibilityResult.riskDecision);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult copy(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> promoEligibility, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> riskDecision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardEligibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoEligibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDecision, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult(cardEligibility, promoEligibility, riskDecision);
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision> component3() {
        return this.riskDecision;
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> component2() {
        return this.promoEligibility;
    }

    public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> component1() {
        return this.cardEligibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult cardEligibilityResult, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = cardEligibilityResult.cardEligibility;
        }
        if ((i & 2) != 0) {
            list2 = cardEligibilityResult.promoEligibility;
        }
        if ((i & 4) != 0) {
            list3 = cardEligibilityResult.riskDecision;
        }
        return cardEligibilityResult.copy(list, list2, list3);
    }
}
