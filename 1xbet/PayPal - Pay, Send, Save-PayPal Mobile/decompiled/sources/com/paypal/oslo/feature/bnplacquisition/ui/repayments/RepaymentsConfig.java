package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/UIs;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/UIs;", "uis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public RepaymentsConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig.m12447$r8$lambda$r5NAvtvTXK5XzOY_apmzC99GE(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs) this.uis.getValue();
    }

    /* renamed from: $r8$lambda$-r5-NAvtvTXK5XzOY_apmzC99GE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs m12447$r8$lambda$r5NAvtvTXK5XzOY_apmzC99GE(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig repaymentsConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.UIs(repaymentsConfig.ctx);
    }
}
