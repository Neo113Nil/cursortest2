package com.paypal.oslo.feature.bnplacquisition.domain.model.plans;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansPage;", "page", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansPage;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansPage;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansPage;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansPage;", "getPage", "getHasPlans", "()Z", "hasPlans"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplPlansResponse {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage page;

    public BnplPlansResponse(com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage bnplPlansPage) {
        this.page = bnplPlansPage;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage getPage() {
        return this.page;
    }

    public final boolean getHasPlans() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem> items;
        com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage bnplPlansPage = this.page;
        return (bnplPlansPage == null || (items = bnplPlansPage.getItems()) == null || !(items.isEmpty() ^ true)) ? false : true;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage bnplPlansPage = this.page;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplPlansResponse(page=");
        sb.append(bnplPlansPage);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage bnplPlansPage = this.page;
        if (bnplPlansPage == null) {
            return 0;
        }
        return bnplPlansPage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse) other).page);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse copy(com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage page) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse(page);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage getPage() {
        return this.page;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse bnplPlansResponse, com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage bnplPlansPage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bnplPlansPage = bnplPlansResponse.page;
        }
        return bnplPlansResponse.copy(bnplPlansPage);
    }
}
