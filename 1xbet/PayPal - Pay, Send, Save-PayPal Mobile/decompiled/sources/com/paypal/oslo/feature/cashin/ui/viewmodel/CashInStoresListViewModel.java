package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInRetailersUseCase;", "getCashInRetailersUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInRetailersUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "", "retry", "()V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInMoneyAmount;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInMoneyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInRetailersUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoresListUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInStoresListViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState> uiState;

    @javax.inject.Inject
    public CashInStoresListViewModel(com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase getCashInRetailersUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCashInRetailersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoFpsRanges = getCashInRetailersUseCase;
        this.getHighSpeedVideoSizes = formatCurrencyUseCase;
        this.Camera2StreamConfigurationMap = localeInformation;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$mapRetailerToUiModel(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, com.paypal.oslo.feature.cashin.domain.model.CashInRetailer cashInRetailer, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$mapRetailerToUiModel$1 cashInStoresListViewModel$mapRetailerToUiModel$1;
        int i;
        java.lang.String id;
        java.lang.String logoUrl;
        java.lang.String str;
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailer cashInRetailer2;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$mapRetailerToUiModel$1) {
            cashInStoresListViewModel$mapRetailerToUiModel$1 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$mapRetailerToUiModel$1) continuation;
            if ((cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cashInStoresListViewModel$mapRetailerToUiModel$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    id = cashInRetailer.getId();
                    java.lang.String name2 = cashInRetailer.getName();
                    logoUrl = cashInRetailer.getLogoUrl();
                    com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount fee = cashInRetailer.getFee();
                    cashInStoresListViewModel$mapRetailerToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = cashInRetailer;
                    cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRanges = id;
                    cashInStoresListViewModel$mapRetailerToUiModel$1.Camera2StreamConfigurationMap = name2;
                    cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoSizes = logoUrl;
                    cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI(fee, cashInStoresListViewModel$mapRetailerToUiModel$1);
                    if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = name2;
                    cashInRetailer2 = cashInRetailer;
                    obj = highResolutionOutputSizeshNQ4ISI;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoSizes;
                    java.lang.String str4 = (java.lang.String) cashInStoresListViewModel$mapRetailerToUiModel$1.Camera2StreamConfigurationMap;
                    id = (java.lang.String) cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRanges;
                    cashInRetailer2 = (com.paypal.oslo.feature.cashin.domain.model.CashInRetailer) cashInStoresListViewModel$mapRetailerToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    logoUrl = str3;
                    str = str4;
                }
                java.lang.String str5 = (java.lang.String) obj;
                str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cashInRetailer2.getTags());
                if (str2 == null) {
                    str2 = "";
                }
                return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel(id, str, logoUrl, str5, str2, cashInRetailer2.getPartner().getId(), null, null, 192, null);
            }
        }
        cashInStoresListViewModel$mapRetailerToUiModel$1 = new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$mapRetailerToUiModel$1(cashInStoresListViewModel, continuation);
        java.lang.Object obj2 = cashInStoresListViewModel$mapRetailerToUiModel$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashInStoresListViewModel$mapRetailerToUiModel$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.String str52 = (java.lang.String) obj2;
        str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cashInRetailer2.getTags());
        if (str2 == null) {
        }
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel(id, str, logoUrl, str52, str2, cashInRetailer2.getPartner().getId(), null, null, 192, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount cashInMoneyAmount, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$formatFee$1 cashInStoresListViewModel$formatFee$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$formatFee$1) {
            cashInStoresListViewModel$formatFee$1 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$formatFee$1) continuation;
            if ((cashInStoresListViewModel$formatFee$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cashInStoresListViewModel$formatFee$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cashInStoresListViewModel$formatFee$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashInStoresListViewModel$formatFee$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(cashInMoneyAmount.getCurrencyCode()), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 0, this.Camera2StreamConfigurationMap.getUserLocale(), null, 20, null);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoSizes;
                    java.math.BigDecimal value = cashInMoneyAmount.getValue();
                    cashInStoresListViewModel$formatFee$1.getHighSpeedVideoFpsRanges = cashInMoneyAmount;
                    cashInStoresListViewModel$formatFee$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                    cashInStoresListViewModel$formatFee$1.getHighSpeedVideoSizes = 1;
                    obj = formatCurrencyUseCase.invoke(value, currencyConfiguration, cashInStoresListViewModel$formatFee$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cashInMoneyAmount = (com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount) cashInStoresListViewModel$formatFee$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return cashInMoneyAmount.getFormatted();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cashInStoresListViewModel$formatFee$1 = new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$formatFee$1(this, continuation);
        java.lang.Object obj2 = cashInStoresListViewModel$formatFee$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashInStoresListViewModel$formatFee$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final void retry() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1(this, null), 3, null);
    }
}
