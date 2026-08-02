package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1", f = "CryptoAssetSelectionViewModel.kt", i = {}, l = {110, 111, 112, 113}, m = "invokeSuspend", n = {}, nl = {111, 112, 113, 109}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoAssetSelectionViewModel$loadAssets$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.access$loadAssetPrices(r18.getHighSpeedVideoFpsRangesFor, r18) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.access$loadAssetPrices(r18.getHighSpeedVideoFpsRangesFor, r18) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.access$loadAssetHoldings(r18.getHighSpeedVideoFpsRangesFor, r18) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.access$loadAssetPrices(r18.getHighSpeedVideoFpsRangesFor, r18) == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState) mutableStateFlow2.getValue(), true, false, null, null, null, null, null, 126, null));
            assetSelectionOperationType = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            int i2 = com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1.WhenMappings.$EnumSwitchMapping$0[assetSelectionOperationType.ordinal()];
            if (i2 == 1) {
                this.getHighSpeedVideoSizes = 1;
            } else if (i2 == 2) {
                this.getHighSpeedVideoSizes = 2;
            } else if (i2 == 3) {
                this.getHighSpeedVideoSizes = 3;
            } else {
                if (i2 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes = 4;
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.RECEIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.LOYALTY_REDEEM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAssetSelectionViewModel$loadAssets$1(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoAssetSelectionViewModel;
    }
}
