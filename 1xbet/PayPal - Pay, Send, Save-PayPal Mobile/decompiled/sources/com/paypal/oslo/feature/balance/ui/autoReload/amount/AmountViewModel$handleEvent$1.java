package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$handleEvent$1", f = "AmountViewModel.kt", i = {0}, l = {130}, m = "invokeSuspend", n = {"amount"}, nl = {131}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class AmountViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object access$formatCurrency;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object value2;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType highSpeedVideoFpsRangesFor2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState copy2;
        com.paypal.pds.components.SelectionCardModel create;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent amountScreenEvent = this.getHighSpeedVideoFpsRangesFor;
            if (amountScreenEvent instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected) {
                mutableStateFlow6 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent amountScreenEvent2 = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel = this.Camera2StreamConfigurationMap;
                do {
                    value2 = mutableStateFlow6.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) value2;
                    com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected onAmountSelected = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected) amountScreenEvent2;
                    java.lang.String amount = onAmountSelected.getAmount();
                    highSpeedVideoFpsRangesFor2 = amountViewModel.getHighSpeedVideoFpsRangesFor(onAmountSelected.getAmount());
                    mutableStateFlow7 = amountViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List<com.paypal.pds.components.SelectionCardModel> optionsUi = ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) mutableStateFlow7.getValue()).getOptionsUi();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(optionsUi, 10));
                    for (com.paypal.pds.components.SelectionCardModel selectionCardModel : optionsUi) {
                        create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(selectionCardModel.getId(), (r18 & 2) != 0 ? null : selectionCardModel.getLabel(), (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : java.lang.Double.parseDouble(selectionCardModel.getId()) == java.lang.Double.parseDouble(onAmountSelected.getAmount()), (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                        arrayList.add(create);
                    }
                    copy2 = amountUiState.copy((r26 & 1) != 0 ? amountUiState.intent : null, (r26 & 2) != 0 ? amountUiState.currencyCode : null, (r26 & 4) != 0 ? amountUiState.minimumAmount : null, (r26 & 8) != 0 ? amountUiState.formattedMinimum : null, (r26 & 16) != 0 ? amountUiState.maximumAmount : null, (r26 & 32) != 0 ? amountUiState.formattedMaximum : null, (r26 & 64) != 0 ? amountUiState.options : null, (r26 & 128) != 0 ? amountUiState.mayInputCustomAmount : false, (r26 & 256) != 0 ? amountUiState.optionsUi : arrayList, (r26 & 512) != 0 ? amountUiState.amount : amount, (r26 & 1024) != 0 ? amountUiState.initialAmount : null, (r26 & 2048) != 0 ? amountUiState.amountValidation : highSpeedVideoFpsRangesFor2);
                } while (!mutableStateFlow6.compareAndSet(value2, copy2));
            } else if (amountScreenEvent instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput) {
                mutableStateFlow5 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent amountScreenEvent3 = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel2 = this.Camera2StreamConfigurationMap;
                do {
                    value = mutableStateFlow5.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput onNumberInput = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput) amountScreenEvent3;
                    java.lang.String number = onNumberInput.getNumber();
                    highSpeedVideoFpsRangesFor = amountViewModel2.getHighSpeedVideoFpsRangesFor(onNumberInput.getNumber());
                    copy = r7.copy((r26 & 1) != 0 ? r7.intent : null, (r26 & 2) != 0 ? r7.currencyCode : null, (r26 & 4) != 0 ? r7.minimumAmount : null, (r26 & 8) != 0 ? r7.formattedMinimum : null, (r26 & 16) != 0 ? r7.maximumAmount : null, (r26 & 32) != 0 ? r7.formattedMaximum : null, (r26 & 64) != 0 ? r7.options : null, (r26 & 128) != 0 ? r7.mayInputCustomAmount : false, (r26 & 256) != 0 ? r7.optionsUi : null, (r26 & 512) != 0 ? r7.amount : number, (r26 & 1024) != 0 ? r7.initialAmount : null, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) value).amountValidation : highSpeedVideoFpsRangesFor);
                } while (!mutableStateFlow5.compareAndSet(value, copy));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(amountScreenEvent, com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnSaveButtonClick.INSTANCE)) {
                mutableStateFlow = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.toDoubleOrNull(((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) mutableStateFlow.getValue()).getAmount()), kotlin.text.StringsKt.toDoubleOrNull(this.Camera2StreamConfigurationMap.getUiState().getValue().getInitialAmount()))) {
                    mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult("", "")));
                } else {
                    mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidation = ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) mutableStateFlow2.getValue()).getAmountValidation();
                    if ((amountValidation instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid) || (amountValidation instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning)) {
                        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel3 = this.Camera2StreamConfigurationMap;
                        mutableStateFlow3 = amountViewModel3.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String ensureTwoDecimalsPlaces = amountViewModel3.ensureTwoDecimalsPlaces(((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) mutableStateFlow3.getValue()).getAmount());
                        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel4 = this.Camera2StreamConfigurationMap;
                        mutableStateFlow4 = amountViewModel4.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoSizes = ensureTwoDecimalsPlaces;
                        this.getHighSpeedVideoFpsRanges = 1;
                        access$formatCurrency = com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.access$formatCurrency(amountViewModel4, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) mutableStateFlow4.getValue()).getCurrencyCode(), ensureTwoDecimalsPlaces, 2, this);
                        if (access$formatCurrency == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = ensureTwoDecimalsPlaces;
                    }
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        access$formatCurrency = obj;
        mutableSharedFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(mutableSharedFlow2.tryEmit(new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult(str, (java.lang.String) access$formatCurrency)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$handleEvent$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountViewModel$handleEvent$1(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent amountScreenEvent, com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = amountScreenEvent;
        this.Camera2StreamConfigurationMap = amountViewModel;
    }
}
