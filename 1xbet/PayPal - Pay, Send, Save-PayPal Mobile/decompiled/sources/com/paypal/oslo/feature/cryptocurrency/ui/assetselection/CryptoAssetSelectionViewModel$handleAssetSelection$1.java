package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$handleAssetSelection$1", f = "CryptoAssetSelectionViewModel.kt", i = {0, 0}, l = {197}, m = "invokeSuspend", n = {"selectedAsset", "isMultichain"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoAssetSelectionViewModel$handleAssetSelection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7 A[LOOP:0: B:9:0x00c1->B:11:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0110  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object obj2;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem cryptoAssetSelectionUiItem;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem cryptoAssetSelectionUiItem2;
        java.util.List emptyList;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem> assetSelectionItems = ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState) mutableStateFlow.getValue()).getAssetSelectionItems();
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.util.Iterator<T> it2 = assetSelectionItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem) obj2).getAssetSymbol(), str)) {
                    break;
                }
            }
            cryptoAssetSelectionUiItem = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem) obj2;
            dynamicConfigurationManager = this.Camera2StreamConfigurationMap.getInputFormats;
            boolean contains = dynamicConfigurationManager.getMultichainAssets().contains(this.getHighSpeedVideoFpsRangesFor);
            if (contains) {
                getAvailableNetworksUseCase = this.Camera2StreamConfigurationMap.getOutputFormats;
                this.getHighSpeedVideoFpsRanges = cryptoAssetSelectionUiItem;
                this.getHighResolutionOutputSizeshNQ4ISI = contains;
                this.getHighSpeedVideoSizes = 1;
                invoke = getAvailableNetworksUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cryptoAssetSelectionUiItem2 = cryptoAssetSelectionUiItem;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem cryptoAssetSelectionUiItem3 = cryptoAssetSelectionUiItem;
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            cryptoAssetSelectionUiItem2 = cryptoAssetSelectionUiItem3;
            java.util.List list = emptyList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.cryptocurrency.ui.receive.mapper.NetworkOptionMapperKt.toNetworkOption((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) it.next()));
            }
            arrayList = arrayList2;
            if (arrayList.size() > 1) {
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
                mutableStateFlow3 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState) mutableStateFlow3.getValue(), false, false, null, null, this.getHighSpeedVideoFpsRangesFor, arrayList, "", 15, null));
                mutableSharedFlow2 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                mutableSharedFlow2.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.ShowNetworkSelectionSheet.INSTANCE);
            } else {
                mutableSharedFlow = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.String title = cryptoAssetSelectionUiItem2 != null ? cryptoAssetSelectionUiItem2.getTitle() : null;
                java.lang.String str3 = title == null ? "" : title;
                java.lang.String logoUrl = cryptoAssetSelectionUiItem2 != null ? cryptoAssetSelectionUiItem2.getLogoUrl() : null;
                mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen(str2, null, str3, logoUrl == null ? "" : logoUrl, 2, null));
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cryptoAssetSelectionUiItem2 = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        invoke = obj;
        arrow.core.Either either = (arrow.core.Either) invoke;
        if (either instanceof arrow.core.Either.Right) {
            emptyList = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            java.util.List list2 = emptyList;
            java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            arrayList = arrayList22;
            if (arrayList.size() > 1) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (either instanceof arrow.core.Either.Left) {
            cryptoAssetSelectionUiItem = cryptoAssetSelectionUiItem2;
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem cryptoAssetSelectionUiItem32 = cryptoAssetSelectionUiItem;
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            cryptoAssetSelectionUiItem2 = cryptoAssetSelectionUiItem32;
            java.util.List list22 = emptyList;
            java.util.ArrayList arrayList222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            arrayList = arrayList222;
            if (arrayList.size() > 1) {
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$handleAssetSelection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$handleAssetSelection$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAssetSelectionViewModel$handleAssetSelection$1(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$handleAssetSelection$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cryptoAssetSelectionViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
