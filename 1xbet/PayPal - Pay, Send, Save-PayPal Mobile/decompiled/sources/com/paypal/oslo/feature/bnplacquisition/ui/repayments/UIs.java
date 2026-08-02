package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00168GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/UIs;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/UIs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FooterSection;", "footerSection$delegate", "Lkotlin/Lazy;", "getFooterSection", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FooterSection;", "footerSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UIs {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: footerSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy footerSection;

    public UIs(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.footerSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs.$r8$lambda$xZFvGd8r_7KLX93p0FUWYceTCeo(com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FooterSection getFooterSection() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.repayments.FooterSection) this.footerSection.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.FooterSection $r8$lambda$xZFvGd8r_7KLX93p0FUWYceTCeo(com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs uIs) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.FooterSection(uIs.ctx);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UIs(ctx=");
        sb.append(configContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.ctx.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs(ctx);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs uIs, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = uIs.ctx;
        }
        return uIs.copy(configContext);
    }
}
