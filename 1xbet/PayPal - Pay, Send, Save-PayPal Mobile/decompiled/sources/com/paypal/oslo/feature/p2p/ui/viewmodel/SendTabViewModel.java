package com.paypal.oslo.feature.p2p.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/viewmodel/SendTabViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "p2pFeatureGateManager", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;)V", "", "amount", "trackAmountChange", "(Ljava/lang/String;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "getHighSpeedVideoFpsRanges", "", "isQrcFlowEnabled", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SendTabViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SendTabViewModel(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        this.getHighSpeedVideoFpsRanges = p2pFeatureGateManager;
    }

    public final boolean isQrcFlowEnabled() {
        return this.getHighSpeedVideoFpsRanges.isQrcFlowEnabled();
    }

    public final java.lang.String trackAmountChange(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.AMOUNT_LENGTH_UI, java.lang.Integer.valueOf(amount.length()));
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_AMOUNT_UI, java.lang.Boolean.valueOf(amount.length() > 0));
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_MODIFIED_AMOUNT_INPUT, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return amount;
    }
}
