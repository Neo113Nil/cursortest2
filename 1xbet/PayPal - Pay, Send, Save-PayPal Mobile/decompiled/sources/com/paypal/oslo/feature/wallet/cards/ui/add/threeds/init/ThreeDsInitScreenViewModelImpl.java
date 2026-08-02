package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;", "args", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreeDsInitScreenViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel {
    public static final int $stable = 8;
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState> uiState;

    @javax.inject.Inject
    public ThreeDsInitScreenViewModelImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getHighSpeedVideoFpsRanges = args;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs threeDsInitScreenArgs = null;
        if (args == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            args = null;
        }
        com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs threeDsFlowArgs = args.getThreeDsFlowArgs();
        if (threeDsFlowArgs instanceof com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData) {
            com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData withSupplementalData = (com.paypal.oslo.feature.wallet.api.ui.cards.add.threeds.ThreeDsFlowArgs.WithSupplementalData) threeDsFlowArgs;
            this.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading(withSupplementalData.getCardNetworkUrl(), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_3ds_confirming_info_title, withSupplementalData.getCardNetworkName()), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_3ds_just_a_few_more_seconds, new java.lang.Object[0])));
        } else {
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading.INSTANCE);
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs threeDsInitScreenArgs2 = this.getHighSpeedVideoFpsRanges;
        if (threeDsInitScreenArgs2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            threeDsInitScreenArgs = threeDsInitScreenArgs2;
        }
        com.paypal.android.logger.Logger.d$default(logger, threeDsInitScreenArgs.getAnalyticsContext().toString(), null, null, 6, null);
    }
}
