package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenArgs;", "args", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenArgs;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenArgs;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreeDsConfirmScreenViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState> uiState;

    @javax.inject.Inject
    public ThreeDsConfirmScreenViewModelImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), false));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighResolutionOutputSizeshNQ4ISI = args;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs threeDsConfirmScreenArgs = this.getHighResolutionOutputSizeshNQ4ISI;
        if (threeDsConfirmScreenArgs == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            threeDsConfirmScreenArgs = null;
        }
        com.paypal.android.logger.Logger.d$default(logger, threeDsConfirmScreenArgs.getAnalyticsContext().toString(), null, null, 6, null);
    }
}
