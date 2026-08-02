package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/Actions;", "actions$delegate", "Lkotlin/Lazy;", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntermediaryLoadingConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getHighSpeedVideoSizes;

    @javax.inject.Inject
    public IntermediaryLoadingConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        this.ctx = configContext;
        this.getHighSpeedVideoSizes = nfcLockScreenConfig;
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig.m12402$r8$lambda$ziWlzulHezJM_DhJPhr80Tk0nE(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions) this.actions.getValue();
    }

    /* renamed from: $r8$lambda$ziWlzulHezJM_DhJPh-r80Tk0nE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions m12402$r8$lambda$ziWlzulHezJM_DhJPhr80Tk0nE(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig intermediaryLoadingConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.Actions(intermediaryLoadingConfig.getHighSpeedVideoSizes);
    }
}
