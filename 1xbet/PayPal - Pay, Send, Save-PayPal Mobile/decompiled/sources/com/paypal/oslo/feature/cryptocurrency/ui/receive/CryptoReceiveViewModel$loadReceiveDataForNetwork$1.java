package com.paypal.oslo.feature.cryptocurrency.ui.receive;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1", f = "CryptoReceiveViewModel.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "invokeSuspend", n = {"blockchain"}, nl = {443}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveViewModel$loadReceiveDataForNetwork$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState copy;
        java.util.List list;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            copy = r5.copy((r26 & 1) != 0 ? r5.assetSymbol : null, (r26 & 2) != 0 ? r5.isLoading : true, (r26 & 4) != 0 ? r5.isError : false, (r26 & 8) != 0 ? r5.assetName : null, (r26 & 16) != 0 ? r5.networkName : null, (r26 & 32) != 0 ? r5.address : null, (r26 & 64) != 0 ? r5.logoUrl : null, (r26 & 128) != 0 ? r5.networkImageUrl : null, (r26 & 256) != 0 ? r5.availableNetworks : null, (r26 & 512) != 0 ? r5.selectedNetworkId : null, (r26 & 1024) != 0 ? r5.memo : null, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) mutableStateFlow2.getValue()).displayMemo : false);
            mutableStateFlow.setValue(copy);
            list = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj2).getId(), str)) {
                    break;
                }
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) obj2;
            java.lang.String blockchain = blockchainNetwork != null ? blockchainNetwork.getBlockchain() : null;
            final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel = this.getHighSpeedVideoFpsRangesFor;
            final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(blockchain);
            this.getHighSpeedVideoSizes = 1;
            if (com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.access$evaluateAndGenerateAddress(cryptoReceiveViewModel, str2, blockchain, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.this, str2, (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress) obj3);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.ReceiveAddress receiveAddress) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState copy;
        mutableStateFlow = cryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor;
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) mutableStateFlow.getValue()).getSelectedNetworkId(), str)) {
            mutableStateFlow2 = cryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow3 = cryptoReceiveViewModel.getHighSpeedVideoFpsRangesFor;
            copy = r1.copy((r26 & 1) != 0 ? r1.assetSymbol : null, (r26 & 2) != 0 ? r1.isLoading : false, (r26 & 4) != 0 ? r1.isError : false, (r26 & 8) != 0 ? r1.assetName : null, (r26 & 16) != 0 ? r1.networkName : receiveAddress.getNetworkName(), (r26 & 32) != 0 ? r1.address : receiveAddress.getAddress(), (r26 & 64) != 0 ? r1.logoUrl : null, (r26 & 128) != 0 ? r1.networkImageUrl : receiveAddress.getNetworkImageUrl(), (r26 & 256) != 0 ? r1.availableNetworks : null, (r26 & 512) != 0 ? r1.selectedNetworkId : str, (r26 & 1024) != 0 ? r1.memo : receiveAddress.getMemo(), (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveUiState) mutableStateFlow3.getValue()).displayMemo : receiveAddress.getDisplayMemo());
            mutableStateFlow2.setValue(copy);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveViewModel$loadReceiveDataForNetwork$1(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel$loadReceiveDataForNetwork$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoReceiveViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
