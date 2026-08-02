package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "cpiAvailabilityProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "getCpiAvailabilityProvider", "()Lcom/paypal/oslo/feature/bnplacquisition/config/CpiAvailabilityProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/UIs;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/UIs;", "uis", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/Actions;", "actions$delegate", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public OffersConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpiAvailabilityProvider, "");
        this.ctx = configContext;
        this.cpiAvailabilityProvider = cpiAvailabilityProvider;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig.$r8$lambda$x3Rzf7Vf_NG5GYY3l3KGLfbmqDE(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig.this);
            }
        });
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig.$r8$lambda$OK_ZTaOHOY4len7Tlpi3HZDQQkc(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider getCpiAvailabilityProvider() {
        return this.cpiAvailabilityProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.UIs getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.offers.UIs) this.uis.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.offers.Actions) this.actions.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.Actions $r8$lambda$OK_ZTaOHOY4len7Tlpi3HZDQQkc(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig offersConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.Actions(offersConfig.ctx, offersConfig.cpiAvailabilityProvider);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.UIs $r8$lambda$x3Rzf7Vf_NG5GYY3l3KGLfbmqDE(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig offersConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.UIs(offersConfig.ctx);
    }
}
