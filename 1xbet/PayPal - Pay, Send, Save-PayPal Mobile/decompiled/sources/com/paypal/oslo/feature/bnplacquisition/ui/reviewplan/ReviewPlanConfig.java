package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig$Actions;", "actions$delegate", "Lkotlin/Lazy;", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig$Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Actions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    @javax.inject.Inject
    public ReviewPlanConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.m12455$r8$lambda$IZtNEfOb18i71AofEw_MOhI714(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions) this.actions.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig$Actions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanConfig$Actions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "isNfcProvisioning", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Actions {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

        public Actions(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
            this.ctx = configContext;
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public final boolean isNfcProvisioning() {
            return this.ctx.getCountry() == com.paypal.oslo.feature.bnplacquisition.config.Country.DE;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Actions(ctx=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions) other).ctx);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions(ctx);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
            return this.ctx;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions actions, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configContext = actions.ctx;
            }
            return actions.copy(configContext);
        }
    }

    /* renamed from: $r8$lambda$IZ-tNEfOb18i71AofEw_MOhI714, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions m12455$r8$lambda$IZtNEfOb18i71AofEw_MOhI714(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig reviewPlanConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig.Actions(reviewPlanConfig.ctx);
    }
}
