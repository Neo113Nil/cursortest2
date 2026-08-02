package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 M2\u00020\u0001:\u0001MB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0017\u0010.\u001a\u00020-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R&\u00109\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000206048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\b\u0012\u0004\u0012\u0002050:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u0002060?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010E\u001a\u00020D2\u0006\u0010\u001b\u001a\u00020D8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010H\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010/R(\u0010K\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u00101"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceReducer;", "reducer", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getAutoReloadInitialConfigUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffLowBalanceAutoReloadUseCase;", "turnOffLowBalanceAutoReloadUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getAccountTypeUseCase", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceReducer;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffLowBalanceAutoReloadUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;)V", "", "xSellAmount", "", "xSellCurrencyCode", "", "initialize", "(Ljava/lang/Double;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "intent", "processIntent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;)V", "p0", "", "getHighSpeedVideoSizes", "(D)Ljava/util/List;", "p1", "", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffLowBalanceAutoReloadUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "rechargeAmountRequestId", "Ljava/lang/String;", "getRechargeAmountRequestId-QDVFmTU", "()Ljava/lang/String;", "thresholdAmountRequestId", "getThresholdAmountRequestId-QDVFmTU", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEffect;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "", "isConsumerAccountType", "Z", "()Z", "getInputFormats", "Ljava/lang/Double;", "getOutputMinFrameDuration", "xSellFormattedAmount", "getXSellFormattedAmount", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LowBalanceViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.manager.BalanceFeatureManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private java.lang.Double getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.lang.String getInputFormats;
    private boolean isConsumerAccountType;
    private final java.lang.String rechargeAmountRequestId;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore> state;
    private final java.lang.String thresholdAmountRequestId;
    private java.lang.String xSellFormattedAmount;
    public static final int $stable = 8;
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"50.00", "100.00", "200.00", "300.00"});

    @javax.inject.Inject
    public LowBalanceViewModel(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReducer lowBalanceReducer, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase turnOffLowBalanceAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadInitialConfigUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffLowBalanceAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFeatureManager, "");
        this.getHighSpeedVideoFpsRanges = formatCurrencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = getAutoReloadInitialConfigUseCase;
        this.Camera2StreamConfigurationMap = turnOffLowBalanceAutoReloadUseCase;
        this.getHighSpeedVideoSizes = getAccountTypeUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = balanceFeatureManager;
        this.rechargeAmountRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.thresholdAmountRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("LowBalanceStateStore", new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 32767, null), lowBalanceReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$fetchLowBalanceConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this, input, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$validateRechargeAmount$1(input, ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount) event).getAmount(), com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$turnOffLowBalanceAutoReload$1(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.this, input, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.state = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
        this.isConsumerAccountType = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v104, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0537 -> B:20:0x0548). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x045d -> B:31:0x0476). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$createLoadedEvent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$createLoadedEvent$1 lowBalanceViewModel$createLoadedEvent$1;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String plainString;
        java.lang.String str5;
        java.lang.String str6;
        java.util.List<java.lang.String> list;
        java.util.List<java.lang.String> highSpeedVideoSizes;
        java.lang.String str7;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig2;
        java.lang.String str8;
        java.lang.String str9;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel2;
        java.math.BigDecimal amount;
        java.lang.String plainString2;
        java.math.BigDecimal amount2;
        java.lang.String plainString3;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Object highResolutionOutputSizeshNQ4ISI2;
        java.util.List<java.lang.String> list2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig3;
        java.lang.String str12;
        int i;
        int i2;
        java.util.Iterator it;
        java.lang.Object obj;
        java.lang.String str13;
        java.lang.Object obj2;
        java.util.Collection collection;
        java.util.List<java.lang.String> list3;
        java.lang.String str14;
        java.util.ArrayList arrayList;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.List list4;
        java.util.Iterator it2;
        java.lang.String str15;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig4;
        int i3;
        java.util.List<java.lang.String> list5;
        java.util.List<java.lang.String> list6;
        java.lang.String str16;
        int i4;
        java.lang.String str17;
        java.lang.Object obj5;
        java.lang.String str18;
        java.util.Collection collection2;
        java.util.List<java.lang.String> list7;
        java.util.Iterator it3;
        java.lang.String str19;
        java.lang.String str20;
        int i5;
        int i6;
        java.lang.Object obj6;
        java.util.List<java.lang.String> list8;
        java.util.ArrayList arrayList2;
        java.util.List list9;
        java.lang.Object obj7;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        java.lang.String str24;
        java.lang.String str25;
        java.util.List<java.lang.String> list10;
        java.lang.String str26;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig5;
        java.lang.String str27;
        int i7;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig6;
        java.util.Iterator it4;
        java.lang.Object obj8;
        java.util.ArrayList arrayList3;
        java.lang.String str28;
        int i8;
        java.lang.Object obj9;
        java.util.List<java.lang.String> list11;
        java.lang.String str29;
        java.util.Collection collection3;
        java.lang.Object highResolutionOutputSizeshNQ4ISI3;
        java.lang.Object obj10;
        java.util.List list12;
        java.lang.String str30;
        java.lang.String str31;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi;
        java.util.ArrayList arrayList4;
        java.lang.String str32;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig7;
        java.util.List<java.lang.String> list13;
        java.util.List<java.lang.String> list14;
        java.lang.String str33;
        java.lang.String str34;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$createLoadedEvent$1) {
            lowBalanceViewModel$createLoadedEvent$1 = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$createLoadedEvent$1) continuation;
            if ((lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames & Integer.MIN_VALUE) != 0) {
                lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames -= 2147483648;
                java.lang.Object obj11 = lowBalanceViewModel$createLoadedEvent$1.accessartificialFrame;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj11);
                        str = "25.00";
                        str2 = lowBalanceViewModel.isConsumerAccountType ? "25.00" : "500.00";
                        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount = lowBalanceConfig.getReloadAmount();
                        if (reloadAmount == null || (str3 = reloadAmount.m12029getCurrencyCodehkTgrg()) == null) {
                            str3 = "USD";
                        }
                        str4 = str3;
                        java.lang.Double d = lowBalanceViewModel.getOutputFormats;
                        plainString = d != null ? new java.math.BigDecimal(java.lang.String.valueOf(d.doubleValue())).toPlainString() : null;
                        com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold = lowBalanceConfig.getReloadThreshold();
                        str5 = (reloadThreshold == null || (amount2 = reloadThreshold.getAmount()) == null || (plainString3 = amount2.toPlainString()) == null) ? plainString == null ? str2 : plainString : plainString3;
                        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount2 = lowBalanceConfig.getReloadAmount();
                        str6 = (reloadAmount2 == null || (amount = reloadAmount2.getAmount()) == null || (plainString2 = amount.toPlainString()) == null) ? plainString == null ? str2 : plainString : plainString2;
                        list = getHighSpeedVideoFpsRanges;
                        highSpeedVideoSizes = getHighSpeedVideoSizes(java.lang.Double.parseDouble(str5));
                        str7 = "10000.00";
                        if (plainString != null && (str8 = lowBalanceViewModel.getInputFormats) != null) {
                            lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig;
                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plainString);
                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                            lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                            lowBalanceViewModel$createLoadedEvent$1.toString = "25.00";
                            lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = "10000.00";
                            lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                            lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                            lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plainString);
                            lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = lowBalanceViewModel;
                            lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor = 0;
                            lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 1;
                            java.lang.Object highResolutionOutputSizeshNQ4ISI4 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str8, plainString, 2, lowBalanceViewModel$createLoadedEvent$1);
                            if (highResolutionOutputSizeshNQ4ISI4 != coroutine_suspended) {
                                lowBalanceConfig2 = lowBalanceConfig;
                                str9 = plainString;
                                obj11 = highResolutionOutputSizeshNQ4ISI4;
                                lowBalanceViewModel2 = lowBalanceViewModel;
                                lowBalanceViewModel2.xSellFormattedAmount = (java.lang.String) obj11;
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                plainString = str9;
                                lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig2;
                                lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                                lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plainString);
                                lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                                lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                                lowBalanceViewModel$createLoadedEvent$1.toString = str;
                                lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str7;
                                lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                                lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                                lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = null;
                                lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = null;
                                lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = null;
                                lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 2;
                                highResolutionOutputSizeshNQ4ISI = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str, 2, lowBalanceViewModel$createLoadedEvent$1);
                                if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        lowBalanceConfig2 = lowBalanceConfig;
                        lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig2;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plainString);
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                        lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                        lowBalanceViewModel$createLoadedEvent$1.toString = str;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str7;
                        lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = null;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = null;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = null;
                        lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 2;
                        highResolutionOutputSizeshNQ4ISI = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str, 2, lowBalanceViewModel$createLoadedEvent$1);
                        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                            str10 = plainString;
                            obj11 = highResolutionOutputSizeshNQ4ISI;
                            str11 = (java.lang.String) obj11;
                            lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig2;
                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                            lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                            lowBalanceViewModel$createLoadedEvent$1.toString = str;
                            lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str7;
                            lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                            lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                            lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str11;
                            lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 3;
                            highResolutionOutputSizeshNQ4ISI2 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str7, 2, lowBalanceViewModel$createLoadedEvent$1);
                            if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended) {
                                obj11 = highResolutionOutputSizeshNQ4ISI2;
                                java.lang.String str35 = (java.lang.String) obj11;
                                list2 = list;
                                java.lang.String str36 = str11;
                                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                                lowBalanceConfig3 = lowBalanceConfig2;
                                str12 = str36;
                                i = 0;
                                i2 = 0;
                                it = list2.iterator();
                                obj = coroutine_suspended;
                                lowBalanceViewModel$createLoadedEvent$1 = lowBalanceViewModel$createLoadedEvent$1;
                                str13 = str35;
                                obj2 = list2;
                                java.lang.String str37 = str7;
                                collection = arrayList5;
                                list3 = highSpeedVideoSizes;
                                str14 = str37;
                                if (!it.hasNext()) {
                                    java.lang.Object next = it.next();
                                    java.util.Iterator it5 = it;
                                    java.lang.String str38 = (java.lang.String) next;
                                    lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig3;
                                    com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig8 = lowBalanceConfig3;
                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                                    lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                                    lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                                    lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                                    lowBalanceViewModel$createLoadedEvent$1.toString = str;
                                    lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str14;
                                    lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                                    lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = list3;
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str12;
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = str13;
                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                                    lowBalanceViewModel$createLoadedEvent$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                                    lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = collection;
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = it5;
                                    java.lang.String str39 = str12;
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str38);
                                    lowBalanceViewModel$createLoadedEvent$1.getOutputSizes = collection;
                                    lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor = i;
                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = 0;
                                    str17 = str13;
                                    lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 4;
                                    java.lang.Object highResolutionOutputSizeshNQ4ISI5 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str38, 0, lowBalanceViewModel$createLoadedEvent$1);
                                    obj5 = obj;
                                    if (highResolutionOutputSizeshNQ4ISI5 == obj5) {
                                        return obj5;
                                    }
                                    str18 = str6;
                                    collection2 = collection;
                                    list7 = list3;
                                    obj11 = highResolutionOutputSizeshNQ4ISI5;
                                    java.util.List<java.lang.String> list15 = list2;
                                    it3 = it5;
                                    lowBalanceConfig3 = lowBalanceConfig8;
                                    str19 = str2;
                                    str20 = str39;
                                    i5 = i2;
                                    i6 = i;
                                    obj6 = obj2;
                                    list8 = list15;
                                    collection.add((java.lang.String) obj11);
                                    collection = collection2;
                                    list3 = list7;
                                    it = it3;
                                    list2 = list8;
                                    str6 = str18;
                                    obj2 = obj6;
                                    i = i6;
                                    str13 = str17;
                                    i2 = i5;
                                    obj = obj5;
                                    str12 = str20;
                                    str2 = str19;
                                    if (!it.hasNext()) {
                                        java.lang.String str40 = str12;
                                        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig9 = lowBalanceConfig3;
                                        java.util.List<java.lang.String> list16 = list3;
                                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list16, 10));
                                        obj3 = list16;
                                        obj4 = obj3;
                                        list4 = (java.util.List) collection;
                                        it2 = list16.iterator();
                                        str15 = str13;
                                        lowBalanceConfig4 = lowBalanceConfig9;
                                        i3 = 0;
                                        list5 = list3;
                                        list6 = list;
                                        str16 = str40;
                                        i4 = 0;
                                        if (it2.hasNext()) {
                                            java.lang.Object next2 = it2.next();
                                            i7 = i4;
                                            java.lang.String str41 = (java.lang.String) next2;
                                            lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig4;
                                            lowBalanceConfig6 = lowBalanceConfig4;
                                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                            lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                                            lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                                            lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                                            lowBalanceViewModel$createLoadedEvent$1.toString = str;
                                            lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str14;
                                            lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list6;
                                            lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = list5;
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str16;
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = str15;
                                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = list4;
                                            lowBalanceViewModel$createLoadedEvent$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                                            lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = arrayList;
                                            java.util.Iterator it6 = it2;
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI = it6;
                                            java.lang.String str42 = str15;
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next2);
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str41);
                                            lowBalanceViewModel$createLoadedEvent$1.getOutputStallDuration = arrayList;
                                            lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                                            lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = 0;
                                            it4 = it6;
                                            lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 5;
                                            java.util.List list17 = list4;
                                            java.lang.Object highResolutionOutputSizeshNQ4ISI6 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str41, 0, lowBalanceViewModel$createLoadedEvent$1);
                                            coroutine_suspended = obj;
                                            if (highResolutionOutputSizeshNQ4ISI6 != coroutine_suspended) {
                                                obj8 = obj3;
                                                arrayList3 = arrayList;
                                                str28 = str42;
                                                list4 = list17;
                                                i8 = i3;
                                                obj9 = obj4;
                                                list11 = list6;
                                                str29 = str16;
                                                obj11 = highResolutionOutputSizeshNQ4ISI6;
                                                collection3 = arrayList3;
                                                collection3.add((java.lang.String) obj11);
                                                str16 = str29;
                                                it2 = it4;
                                                list6 = list11;
                                                obj4 = obj9;
                                                i3 = i8;
                                                i4 = i7;
                                                lowBalanceConfig4 = lowBalanceConfig6;
                                                java.lang.Object obj12 = obj8;
                                                obj = coroutine_suspended;
                                                str15 = str28;
                                                arrayList = arrayList3;
                                                obj3 = obj12;
                                                if (it2.hasNext()) {
                                                    java.util.List list18 = list4;
                                                    java.lang.String str43 = str15;
                                                    com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig10 = lowBalanceConfig4;
                                                    coroutine_suspended = obj;
                                                    arrayList2 = arrayList;
                                                    lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig10;
                                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                                    lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                                                    lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                                                    lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                                    lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                                                    lowBalanceViewModel$createLoadedEvent$1.toString = str;
                                                    lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str14;
                                                    lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list6;
                                                    lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = list5;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str16;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = str43;
                                                    list9 = list18;
                                                    lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = list9;
                                                    lowBalanceViewModel$createLoadedEvent$1.getInputFormats = arrayList2;
                                                    lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = str5;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = null;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI = null;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM = null;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputSizes = null;
                                                    lowBalanceViewModel$createLoadedEvent$1.getOutputStallDuration = null;
                                                    lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 6;
                                                    java.lang.String str44 = str16;
                                                    obj11 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str5, 2, lowBalanceViewModel$createLoadedEvent$1);
                                                    if (obj11 != coroutine_suspended) {
                                                        obj7 = coroutine_suspended;
                                                        str21 = str;
                                                        str22 = str6;
                                                        str23 = str4;
                                                        str24 = str43;
                                                        str25 = str14;
                                                        list10 = list5;
                                                        str26 = str44;
                                                        lowBalanceConfig5 = lowBalanceConfig10;
                                                        str27 = str5;
                                                        java.util.ArrayList arrayList6 = arrayList2;
                                                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str5, (java.lang.String) obj11);
                                                        lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig5;
                                                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                                        lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str23;
                                                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                                                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str27);
                                                        lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str22);
                                                        lowBalanceViewModel$createLoadedEvent$1.toString = str21;
                                                        lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str25;
                                                        lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list6;
                                                        lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = list10;
                                                        lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str26;
                                                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = str24;
                                                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = list9;
                                                        lowBalanceViewModel$createLoadedEvent$1.getInputFormats = arrayList6;
                                                        lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = reloadAmountUi2;
                                                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = str22;
                                                        lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 7;
                                                        java.lang.String str45 = str23;
                                                        highResolutionOutputSizeshNQ4ISI3 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str45, str22, 2, lowBalanceViewModel$createLoadedEvent$1);
                                                        obj10 = obj7;
                                                        if (highResolutionOutputSizeshNQ4ISI3 != obj10) {
                                                            return obj10;
                                                        }
                                                        list12 = list9;
                                                        str30 = str26;
                                                        str31 = str45;
                                                        reloadAmountUi = reloadAmountUi2;
                                                        arrayList4 = arrayList6;
                                                        obj11 = highResolutionOutputSizeshNQ4ISI3;
                                                        str32 = str21;
                                                        lowBalanceConfig7 = lowBalanceConfig5;
                                                        list13 = list10;
                                                        list14 = list6;
                                                        java.lang.String str46 = str25;
                                                        str33 = str24;
                                                        str34 = str46;
                                                        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded(reloadAmountUi, new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str22, (java.lang.String) obj11), str31, str32, str34, list14, list13, str30, str33, list12, arrayList4, lowBalanceConfig7.isEnabled(), lowBalanceConfig7.getFinancialInstrumentId());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        int i9 = lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor;
                        int i10 = lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        lowBalanceViewModel2 = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        highSpeedVideoSizes = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        list = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        str7 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        str = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        str6 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        str5 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        str9 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        str4 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        str2 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        lowBalanceConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        lowBalanceViewModel2.xSellFormattedAmount = (java.lang.String) obj11;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        plainString = str9;
                        lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig2;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plainString);
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                        lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                        lowBalanceViewModel$createLoadedEvent$1.toString = str;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str7;
                        lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = null;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = null;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = null;
                        lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 2;
                        highResolutionOutputSizeshNQ4ISI = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str, 2, lowBalanceViewModel$createLoadedEvent$1);
                        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        java.util.List<java.lang.String> list19 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        java.util.List<java.lang.String> list20 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        java.lang.String str47 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        java.lang.String str48 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        java.lang.String str49 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str50 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        java.lang.String str51 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        java.lang.String str52 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        java.lang.String str53 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig11 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        lowBalanceConfig2 = lowBalanceConfig11;
                        str2 = str53;
                        str4 = str52;
                        str10 = str51;
                        str5 = str50;
                        str6 = str49;
                        str = str48;
                        str7 = str47;
                        list = list20;
                        highSpeedVideoSizes = list19;
                        str11 = (java.lang.String) obj11;
                        lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig2;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str4;
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str5;
                        lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str6;
                        lowBalanceViewModel$createLoadedEvent$1.toString = str;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str7;
                        lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = highSpeedVideoSizes;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str11;
                        lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 3;
                        highResolutionOutputSizeshNQ4ISI2 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str4, str7, 2, lowBalanceViewModel$createLoadedEvent$1);
                        if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        str11 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputFormats;
                        highSpeedVideoSizes = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        list = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        str7 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        str = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        str6 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        str5 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        str10 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        str4 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        str2 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        lowBalanceConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        java.lang.String str352 = (java.lang.String) obj11;
                        list2 = list;
                        java.lang.String str362 = str11;
                        java.util.ArrayList arrayList52 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                        lowBalanceConfig3 = lowBalanceConfig2;
                        str12 = str362;
                        i = 0;
                        i2 = 0;
                        it = list2.iterator();
                        obj = coroutine_suspended;
                        lowBalanceViewModel$createLoadedEvent$1 = lowBalanceViewModel$createLoadedEvent$1;
                        str13 = str352;
                        obj2 = list2;
                        java.lang.String str372 = str7;
                        collection = arrayList52;
                        list3 = highSpeedVideoSizes;
                        str14 = str372;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 4:
                        int i11 = lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                        int i12 = lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor;
                        int i13 = lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        collection = (java.util.Collection) lowBalanceViewModel$createLoadedEvent$1.getOutputSizes;
                        java.lang.Object obj13 = lowBalanceViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI;
                        java.util.Iterator it7 = (java.util.Iterator) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        collection2 = (java.util.Collection) lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI;
                        ?? r10 = (java.lang.Iterable) lowBalanceViewModel$createLoadedEvent$1.getInputFormats;
                        java.lang.Object obj14 = (java.lang.Iterable) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        java.lang.String str54 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration;
                        str20 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputFormats;
                        list7 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        java.util.List<java.lang.String> list21 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        str14 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        java.lang.String str55 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        str18 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str56 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        java.lang.String str57 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        java.lang.String str58 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        str19 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        lowBalanceConfig3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        i5 = i13;
                        list = list21;
                        it3 = it7;
                        str = str55;
                        obj5 = coroutine_suspended;
                        list8 = r10;
                        str5 = str56;
                        obj6 = obj14;
                        str10 = str57;
                        i6 = i12;
                        str17 = str54;
                        str4 = str58;
                        collection.add((java.lang.String) obj11);
                        collection = collection2;
                        list3 = list7;
                        it = it3;
                        list2 = list8;
                        str6 = str18;
                        obj2 = obj6;
                        i = i6;
                        str13 = str17;
                        i2 = i5;
                        obj = obj5;
                        str12 = str20;
                        str2 = str19;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        int i14 = lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                        int i15 = lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor;
                        int i16 = lowBalanceViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        collection3 = (java.util.Collection) lowBalanceViewModel$createLoadedEvent$1.getOutputStallDuration;
                        java.lang.Object obj15 = lowBalanceViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM;
                        java.util.Iterator it8 = (java.util.Iterator) lowBalanceViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI;
                        ?? r102 = (java.util.Collection) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        java.lang.Object obj16 = (java.lang.Iterable) lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI;
                        java.lang.Object obj17 = (java.lang.Iterable) lowBalanceViewModel$createLoadedEvent$1.getInputFormats;
                        java.util.List list22 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        str28 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration;
                        str29 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputFormats;
                        list5 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        java.util.List<java.lang.String> list23 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        java.lang.String str59 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        java.lang.String str60 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        java.lang.String str61 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str62 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        java.lang.String str63 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        java.lang.String str64 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        java.lang.String str65 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig12 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        it4 = it8;
                        str6 = str61;
                        obj8 = obj16;
                        str10 = str63;
                        i8 = i15;
                        list4 = list22;
                        str2 = str65;
                        lowBalanceConfig6 = lowBalanceConfig12;
                        i7 = i16;
                        str14 = str59;
                        arrayList3 = r102;
                        str5 = str62;
                        obj9 = obj17;
                        str4 = str64;
                        list11 = list23;
                        str = str60;
                        collection3.add((java.lang.String) obj11);
                        str16 = str29;
                        it2 = it4;
                        list6 = list11;
                        obj4 = obj9;
                        i3 = i8;
                        i4 = i7;
                        lowBalanceConfig4 = lowBalanceConfig6;
                        java.lang.Object obj122 = obj8;
                        obj = coroutine_suspended;
                        str15 = str28;
                        arrayList = arrayList3;
                        obj3 = obj122;
                        if (it2.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 6:
                        java.lang.String str66 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI;
                        ?? r5 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.getInputFormats;
                        java.util.List list24 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        str24 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration;
                        java.lang.String str67 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputFormats;
                        java.util.List<java.lang.String> list25 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        java.util.List<java.lang.String> list26 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        str25 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        java.lang.String str68 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        java.lang.String str69 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str70 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        java.lang.String str71 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        java.lang.String str72 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        java.lang.String str73 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig13 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        obj7 = coroutine_suspended;
                        str21 = str68;
                        str22 = str69;
                        str2 = str73;
                        arrayList2 = r5;
                        lowBalanceConfig5 = lowBalanceConfig13;
                        str23 = str72;
                        str27 = str70;
                        list6 = list26;
                        str10 = str71;
                        list9 = list24;
                        str26 = str67;
                        list10 = list25;
                        str5 = str66;
                        java.util.ArrayList arrayList62 = arrayList2;
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi22 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str5, (java.lang.String) obj11);
                        lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = lowBalanceConfig5;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        lowBalanceViewModel$createLoadedEvent$1.unwrapAs = str23;
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                        lowBalanceViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str27);
                        lowBalanceViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str22);
                        lowBalanceViewModel$createLoadedEvent$1.toString = str21;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineCreation = str25;
                        lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt = list6;
                        lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary = list10;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputFormats = str26;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration = str24;
                        lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = list9;
                        lowBalanceViewModel$createLoadedEvent$1.getInputFormats = arrayList62;
                        lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = reloadAmountUi22;
                        lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = str22;
                        lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames = 7;
                        java.lang.String str452 = str23;
                        highResolutionOutputSizeshNQ4ISI3 = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(str452, str22, 2, lowBalanceViewModel$createLoadedEvent$1);
                        obj10 = obj7;
                        if (highResolutionOutputSizeshNQ4ISI3 != obj10) {
                        }
                        break;
                    case 7:
                        str22 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi3 = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi) lowBalanceViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI;
                        ?? r4 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.getInputFormats;
                        java.util.List list27 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        java.lang.String str74 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputMinFrameDuration;
                        java.lang.String str75 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.getOutputFormats;
                        java.util.List<java.lang.String> list28 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.coroutineBoundary;
                        list14 = (java.util.List) lowBalanceViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        java.lang.String str76 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.coroutineCreation;
                        java.lang.String str77 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.toString;
                        java.lang.String str78 = (java.lang.String) lowBalanceViewModel$createLoadedEvent$1.unwrapAs;
                        lowBalanceConfig7 = (com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig) lowBalanceViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj11);
                        arrayList4 = r4;
                        list12 = list27;
                        reloadAmountUi = reloadAmountUi3;
                        str33 = str74;
                        str31 = str78;
                        str30 = str75;
                        str32 = str77;
                        list13 = list28;
                        str34 = str76;
                        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded(reloadAmountUi, new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str22, (java.lang.String) obj11), str31, str32, str34, list14, list13, str30, str33, list12, arrayList4, lowBalanceConfig7.isEnabled(), lowBalanceConfig7.getFinancialInstrumentId());
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        lowBalanceViewModel$createLoadedEvent$1 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$createLoadedEvent$1(lowBalanceViewModel, continuation);
        java.lang.Object obj112 = lowBalanceViewModel$createLoadedEvent$1.accessartificialFrame;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (lowBalanceViewModel$createLoadedEvent$1.ArtificialStackFrames) {
        }
    }

    /* renamed from: getRechargeAmountRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getRechargeAmountRequestId() {
        return this.rechargeAmountRequestId;
    }

    /* renamed from: getThresholdAmountRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getThresholdAmountRequestId() {
        return this.thresholdAmountRequestId;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect> getEffect() {
        return this.effect;
    }

    /* renamed from: isConsumerAccountType, reason: from getter */
    public final boolean getIsConsumerAccountType() {
        return this.isConsumerAccountType;
    }

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, java.lang.Double d, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        lowBalanceViewModel.initialize(d, str);
    }

    public final void initialize(java.lang.Double xSellAmount, java.lang.String xSellCurrencyCode) {
        this.getOutputFormats = xSellAmount;
        this.getInputFormats = xSellCurrencyCode;
        processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize.INSTANCE);
    }

    public final void processIntent(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!(intent instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick) || this.getHighResolutionOutputSizeshNQ4ISI.isAutoReloadEnabled()) {
            this.getInputSizeshNQ4ISI.onEvent(intent);
        }
    }

    public final java.lang.String getXSellFormattedAmount() {
        return this.xSellFormattedAmount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List<java.lang.String> getHighSpeedVideoSizes(double p0) {
        double ceil = java.lang.Math.ceil(p0);
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf((int) ((((kotlin.collections.IntIterator) it).nextInt() * 100) + ceil)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$formatCurrency$1 lowBalanceViewModel$formatCurrency$1;
        int i2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = str2;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$formatCurrency$1) {
            lowBalanceViewModel$formatCurrency$1 = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$formatCurrency$1) continuation;
            if ((lowBalanceViewModel$formatCurrency$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                lowBalanceViewModel$formatCurrency$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lowBalanceViewModel$formatCurrency$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoFpsRanges;
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str5);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, i, null, null, 24, null);
                    lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges = str;
                    lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor = str5;
                    lowBalanceViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    lowBalanceViewModel$formatCurrency$1.Camera2StreamConfigurationMap = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, lowBalanceViewModel$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = lowBalanceViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
                    str5 = (java.lang.String) lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
                    str3 = (java.lang.String) lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str4 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str4 == null) {
                    return str4;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append(" ");
                sb.append(str5);
                return sb.toString();
            }
        }
        lowBalanceViewModel$formatCurrency$1 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = lowBalanceViewModel$formatCurrency$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lowBalanceViewModel$formatCurrency$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        str4 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str4 == null) {
        }
    }

    public static final /* synthetic */ void access$onTurnOffResult(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, boolean z, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input) {
        if (z) {
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffSuccess.INSTANCE);
        } else {
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError.INSTANCE);
        }
    }
}
