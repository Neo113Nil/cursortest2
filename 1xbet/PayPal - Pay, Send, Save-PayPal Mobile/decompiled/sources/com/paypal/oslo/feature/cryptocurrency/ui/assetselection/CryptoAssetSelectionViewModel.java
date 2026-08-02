package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001BBS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010!\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u0010.\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00100R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00103R \u00105\u001a\b\u0012\u0004\u0012\u000202048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010;R \u0010>\u001a\b\u0012\u0004\u0012\u00020:0=8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/CryptoAssetSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "selectionType", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;", "getCurrentMarketPricesUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "getCryptoHoldingsUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/PricesToAssetSelectionUiItemMapper;", "pricesToAssetSelectionUiItemMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/HoldingsToAssetSelectionUiItemMapper;", "holdingsToAssetSelectionUiItemMapper", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "getAvailableNetworksUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "dynamicConfigurationManager", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getPYUSDRewardsStatusUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/PricesToAssetSelectionUiItemMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/HoldingsToAssetSelectionUiItemMapper;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;", "Camera2StreamConfigurationMap", "getInputFormats", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/PricesToAssetSelectionUiItemMapper;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/HoldingsToAssetSelectionUiItemMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputStallDuration", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAssetSelectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager getInputFormats;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect> getOutputStallDuration;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/CryptoAssetSelectionViewModel$Factory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "selectionType", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/CryptoAssetSelectionViewModel;", "create", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/CryptoAssetSelectionViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType selectionType);
    }

    @dagger.assisted.AssistedInject
    public CryptoAssetSelectionViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper pricesToAssetSelectionUiItemMapper, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper holdingsToAssetSelectionUiItemMapper, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSelectionOperationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrentMarketPricesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoHoldingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pricesToAssetSelectionUiItemMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdingsToAssetSelectionUiItemMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableNetworksUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = assetSelectionOperationType;
        this.Camera2StreamConfigurationMap = getCurrentMarketPricesUseCase;
        this.getHighSpeedVideoFpsRangesFor = getCryptoHoldingsUseCase;
        this.getHighSpeedVideoSizes = pricesToAssetSelectionUiItemMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = holdingsToAssetSelectionUiItemMapper;
        this.getOutputFormats = getAvailableNetworksUseCase;
        this.getInputFormats = dynamicConfigurationManager;
        this.getHighSpeedVideoSizesFor = getPYUSDRewardsStatusUseCase;
        this.getOutputMinFrameDuration = featureGateManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState(true, false, kotlin.collections.CollectionsKt.emptyList(), assetSelectionOperationType, null, null, null, 112, null));
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputStallDuration = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssets$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadAssetHoldings(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetHoldings$1 cryptoAssetSelectionViewModel$loadAssetHoldings$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetHoldings$1) {
            cryptoAssetSelectionViewModel$loadAssetHoldings$1 = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetHoldings$1) continuation;
            if ((cryptoAssetSelectionViewModel$loadAssetHoldings$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cryptoAssetSelectionViewModel$loadAssetHoldings$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cryptoAssetSelectionViewModel$loadAssetHoldings$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoAssetSelectionViewModel$loadAssetHoldings$1.Camera2StreamConfigurationMap;
                cryptoHoldings = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase = cryptoAssetSelectionViewModel.getHighSpeedVideoFpsRangesFor;
                    cryptoAssetSelectionViewModel$loadAssetHoldings$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase.invoke$default(getCryptoHoldingsUseCase, null, cryptoAssetSelectionViewModel$loadAssetHoldings$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    cryptoHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) ((arrow.core.Either.Right) either).getValue();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (cryptoHoldings != null) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow = cryptoAssetSelectionViewModel.getInputSizeshNQ4ISI;
                    mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow.getValue(), false, true, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 120, null));
                    return kotlin.Unit.INSTANCE;
                }
                java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings = cryptoHoldings.getHoldings();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(holdings, 10));
                java.util.Iterator<T> it = holdings.iterator();
                while (it.hasNext()) {
                    arrayList.add(cryptoAssetSelectionViewModel.getHighResolutionOutputSizeshNQ4ISI.map((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) it.next()));
                }
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow2 = cryptoAssetSelectionViewModel.getInputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow2.getValue(), false, false, arrayList, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null));
                return kotlin.Unit.INSTANCE;
            }
        }
        cryptoAssetSelectionViewModel$loadAssetHoldings$1 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetHoldings$1(cryptoAssetSelectionViewModel, continuation);
        java.lang.Object obj2 = cryptoAssetSelectionViewModel$loadAssetHoldings$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoAssetSelectionViewModel$loadAssetHoldings$1.Camera2StreamConfigurationMap;
        cryptoHoldings = null;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        if (cryptoHoldings != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r14 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4 A[LOOP:0: B:12:0x00ae->B:14:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadAssetPrices(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetPrices$1 cryptoAssetSelectionViewModel$loadAssetPrices$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices;
        arrow.core.Either either;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices2;
        java.util.Iterator<T> it;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetPrices$1) {
            cryptoAssetSelectionViewModel$loadAssetPrices$1 = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetPrices$1) continuation;
            if ((cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges;
                cryptoMarketPrices = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase = cryptoAssetSelectionViewModel.Camera2StreamConfigurationMap;
                    cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase.invoke$default(getCurrentMarketPricesUseCase, null, cryptoAssetSelectionViewModel$loadAssetPrices$1, 1, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cryptoMarketPrices2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices) cryptoAssetSelectionViewModel$loadAssetPrices$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = (java.lang.String) obj;
                        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> marketPrices = cryptoMarketPrices2.getMarketPrices();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(marketPrices, 10));
                        it = marketPrices.iterator();
                        while (it.hasNext()) {
                            arrayList.add(cryptoAssetSelectionViewModel.getHighSpeedVideoSizes.map((com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice) it.next(), str));
                        }
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow = cryptoAssetSelectionViewModel.getInputSizeshNQ4ISI;
                        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow.getValue(), false, false, arrayList, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null));
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    cryptoMarketPrices = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices) ((arrow.core.Either.Right) either).getValue();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (cryptoMarketPrices != null) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow2 = cryptoAssetSelectionViewModel.getInputSizeshNQ4ISI;
                    mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow2.getValue(), false, true, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, 120, null));
                    return kotlin.Unit.INSTANCE;
                }
                cryptoAssetSelectionViewModel$loadAssetPrices$1.Camera2StreamConfigurationMap = cryptoMarketPrices;
                cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges = 2;
                obj = cryptoAssetSelectionViewModel.getHighResolutionOutputSizeshNQ4ISI(cryptoAssetSelectionViewModel$loadAssetPrices$1);
                if (obj != coroutine_suspended) {
                    cryptoMarketPrices2 = cryptoMarketPrices;
                    java.lang.String str2 = (java.lang.String) obj;
                    java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> marketPrices2 = cryptoMarketPrices2.getMarketPrices();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(marketPrices2, 10));
                    it = marketPrices2.iterator();
                    while (it.hasNext()) {
                    }
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow3 = cryptoAssetSelectionViewModel.getInputSizeshNQ4ISI;
                    mutableStateFlow3.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow3.getValue(), false, false, arrayList2, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null));
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        cryptoAssetSelectionViewModel$loadAssetPrices$1 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$loadAssetPrices$1(cryptoAssetSelectionViewModel, continuation);
        java.lang.Object obj2 = cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoAssetSelectionViewModel$loadAssetPrices$1.getHighSpeedVideoFpsRanges;
        cryptoMarketPrices = null;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        if (cryptoMarketPrices != null) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent event) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NavigateBack.INSTANCE)) {
            this.getOutputStallDuration.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateBack.INSTANCE);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected) {
            java.lang.String assetSymbol = ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected) event).getAssetSymbol();
            int i = com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.ordinal()];
            if (i == 1) {
                this.getOutputStallDuration.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry(assetSymbol));
                return;
            }
            if (i == 2) {
                this.getOutputStallDuration.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry(assetSymbol));
                return;
            } else if (i == 3) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$handleAssetSelection$1(this, assetSymbol, null), 3, null);
                return;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getOutputStallDuration.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry(assetSymbol));
                return;
            }
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive) {
            java.lang.String networkId = ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive) event).getNetworkId();
            java.lang.String pendingReceiveAssetSymbol = this.getInputSizeshNQ4ISI.getValue().getPendingReceiveAssetSymbol();
            if (pendingReceiveAssetSymbol != null) {
                java.util.Iterator<T> it = this.getInputSizeshNQ4ISI.getValue().getAssetSelectionItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem) obj).getAssetSymbol(), pendingReceiveAssetSymbol)) {
                            break;
                        }
                    }
                }
                com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem cryptoAssetSelectionUiItem = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem) obj;
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow = this.getInputSizeshNQ4ISI;
                mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow.getValue(), false, false, null, null, null, kotlin.collections.CollectionsKt.emptyList(), null, 79, null));
                kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect> mutableSharedFlow = this.getOutputStallDuration;
                java.lang.String title = cryptoAssetSelectionUiItem != null ? cryptoAssetSelectionUiItem.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                java.lang.String logoUrl = cryptoAssetSelectionUiItem != null ? cryptoAssetSelectionUiItem.getLogoUrl() : null;
                mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen(pendingReceiveAssetSymbol, networkId, title, logoUrl != null ? logoUrl : ""));
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.DismissNetworkSelection.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState> mutableStateFlow2 = this.getInputSizeshNQ4ISI;
        mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiState.copy$default(mutableStateFlow2.getValue(), false, false, null, null, null, kotlin.collections.CollectionsKt.emptyList(), null, 79, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1 cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1) {
            cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1 = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1) continuation;
            if ((cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges != com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.BUY || !this.getOutputMinFrameDuration.isPyusdRewardsEnabled()) {
                        return null;
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase = this.getHighSpeedVideoSizesFor;
                    cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getPYUSDRewardsStatusUseCase.invoke(cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.String rate = ((com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either).getValue()).getRate();
                    return rate.length() != 0 ? rate : null;
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return null;
            }
        }
        cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1 = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1(this, continuation);
        java.lang.Object obj2 = cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoAssetSelectionViewModel$fetchPyusdRewardsRate$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
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
}
