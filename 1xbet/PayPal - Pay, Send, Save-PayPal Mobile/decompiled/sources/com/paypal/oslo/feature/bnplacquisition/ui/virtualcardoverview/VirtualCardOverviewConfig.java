package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/UIs;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/UIs;", "uis", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/Actions;", "actions$delegate", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VirtualCardOverviewConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public VirtualCardOverviewConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        this.ctx = configContext;
        this.getHighSpeedVideoFpsRangesFor = nfcLockScreenConfig;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig.$r8$lambda$nmok23bIoGGNL86ID6H0hlBvBQI(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig.this);
            }
        });
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig.$r8$lambda$6jI9TuTN9QMjaM9rvMUW0iA1sl8(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.UIs getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.UIs) this.uis.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions) this.actions.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions $r8$lambda$6jI9TuTN9QMjaM9rvMUW0iA1sl8(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig virtualCardOverviewConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions(virtualCardOverviewConfig.ctx, virtualCardOverviewConfig.getHighSpeedVideoFpsRangesFor);
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.UIs $r8$lambda$nmok23bIoGGNL86ID6H0hlBvBQI(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig virtualCardOverviewConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.UIs(virtualCardOverviewConfig.ctx);
    }
}
