package com.paypal.oslo.feature.bnplservicing.config.plandetails;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00168GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/UIs;", "", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/UIs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/config/ConfigContext;", "getCtx", "Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/SummarySection;", "summarySection$delegate", "Lkotlin/Lazy;", "getSummarySection", "()Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/SummarySection;", "summarySection", "Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/SnoozeSection;", "snoozeSection$delegate", "getSnoozeSection", "()Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/SnoozeSection;", "snoozeSection", "Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/PlanContentSection;", "planContentSection$delegate", "getPlanContentSection", "()Lcom/paypal/oslo/feature/bnplservicing/config/plandetails/PlanContentSection;", "planContentSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UIs {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx;

    /* renamed from: planContentSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy planContentSection;

    /* renamed from: snoozeSection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy snoozeSection;

    /* renamed from: summarySection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy summarySection;

    public UIs(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.summarySection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.m12510$r8$lambda$XwPAxuBtzBSyO9KLfLPnEiGxno(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.this);
            }
        });
        this.snoozeSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.$r8$lambda$VUX91WxY2uzE7WhbAbKwsm_IUDU(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.this);
            }
        });
        this.planContentSection = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.m12511$r8$lambda$auwsMKtYRGW_SdsWicLoLziE2Q(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplservicing.config.plandetails.SummarySection getSummarySection() {
        return (com.paypal.oslo.feature.bnplservicing.config.plandetails.SummarySection) this.summarySection.getValue();
    }

    public final com.paypal.oslo.feature.bnplservicing.config.plandetails.SnoozeSection getSnoozeSection() {
        return (com.paypal.oslo.feature.bnplservicing.config.plandetails.SnoozeSection) this.snoozeSection.getValue();
    }

    public final com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanContentSection getPlanContentSection() {
        return (com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanContentSection) this.planContentSection.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.config.plandetails.SnoozeSection $r8$lambda$VUX91WxY2uzE7WhbAbKwsm_IUDU(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs uIs) {
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.SnoozeSection(uIs.ctx);
    }

    /* renamed from: $r8$lambda$XwPAxuBtzBSyO9K-LfLPnEiGxno, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.config.plandetails.SummarySection m12510$r8$lambda$XwPAxuBtzBSyO9KLfLPnEiGxno(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs uIs) {
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.SummarySection(uIs.ctx);
    }

    /* renamed from: $r8$lambda$auws-MKtYRGW_SdsWicLoLziE2Q, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanContentSection m12511$r8$lambda$auwsMKtYRGW_SdsWicLoLziE2Q(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs uIs) {
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.PlanContentSection(uIs.ctx);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext = this.ctx;
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs) other).ctx);
    }

    public final com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs copy(com.paypal.oslo.feature.bnplservicing.config.ConfigContext ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        return new com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs(ctx);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs copy$default(com.paypal.oslo.feature.bnplservicing.config.plandetails.UIs uIs, com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = uIs.ctx;
        }
        return uIs.copy(configContext);
    }
}
