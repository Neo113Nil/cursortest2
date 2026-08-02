package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$enrollForPYUSDRewards$1", f = "CryptoHubViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {"it", "$i$a$-let-CryptoHubViewModel$enrollForPYUSDRewards$1$updatedState$1"}, nl = {263}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubViewModel$enrollForPYUSDRewards$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow9;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow10;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow11;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState = ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow.getValue()).getLoadedCryptoHubUiState();
            if (loadedCryptoHubUiState == null || (pyusdRewardsCardUiState2 = loadedCryptoHubUiState.getPyusdRewardsCardUiState()) == null || !pyusdRewardsCardUiState2.isLoading()) {
                mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState cryptoHubUiState = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow3.getValue();
                mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState2 = ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow4.getValue()).getLoadedCryptoHubUiState();
                mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default(cryptoHubUiState, false, loadedCryptoHubUiState2 != null ? com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiStateKt.setPyusdRewardsLoadingState(loadedCryptoHubUiState2, true) : null, 1, null));
                mutableStateFlow5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState3 = ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow5.getValue()).getLoadedCryptoHubUiState();
                if (loadedCryptoHubUiState3 != null && (pyusdRewardsCardUiState = loadedCryptoHubUiState3.getPyusdRewardsCardUiState()) != null) {
                    pYUSDRewardsCardFacade = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pyusdRewardsCardUiState);
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.Camera2StreamConfigurationMap = 1;
                    obj = pYUSDRewardsCardFacade.enroll(pyusdRewardsCardUiState, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    pYUSDRewardsCardUiState = null;
                    if (pYUSDRewardsCardUiState != null) {
                        mutableStateFlow6 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        mutableStateFlow7 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState cryptoHubUiState2 = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow7.getValue();
                        mutableStateFlow8 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState4 = ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow8.getValue()).getLoadedCryptoHubUiState();
                        mutableStateFlow6.setValue(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default(cryptoHubUiState2, false, loadedCryptoHubUiState4 != null ? com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiStateKt.setPyusdRewardsLoadingState(loadedCryptoHubUiState4, false) : null, 1, null));
                    } else {
                        if (pYUSDRewardsCardUiState.getStatus().isAccruingRewards()) {
                            channel = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
                            channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsOptInSuccessBottomSheet.INSTANCE);
                        }
                        mutableStateFlow9 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState5 = ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow9.getValue()).getLoadedCryptoHubUiState();
                        mutableStateFlow10 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        mutableStateFlow11 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                        mutableStateFlow10.setValue(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow11.getValue(), false, loadedCryptoHubUiState5 != null ? com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState.copy$default(loadedCryptoHubUiState5, null, pYUSDRewardsCardUiState, null, null, null, false, 61, null) : null, 1, null));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pYUSDRewardsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) obj;
        if (pYUSDRewardsCardUiState != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$enrollForPYUSDRewards$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$enrollForPYUSDRewards$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHubViewModel$enrollForPYUSDRewards$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$enrollForPYUSDRewards$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoHubViewModel;
    }
}
