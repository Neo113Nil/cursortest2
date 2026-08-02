package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0$8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R \u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "intent", "", "currencyCode", "minimumAmount", "maximumAmount", "", "options", "formattedMinimum", "formattedMaximum", "formattedOptions", "", "initialize", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;", "event", "handleEvent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;)V", "p0", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "ensureTwoDecimalsPlaces", "(Ljava/lang/String;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> uiState;

    @javax.inject.Inject
    public AmountViewModel(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = formatCurrencyUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState(null, null, null, null, null, null, null, false, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$formatCurrency(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$formatCurrency$1 amountViewModel$formatCurrency$1;
        int i2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$formatCurrency$1) {
            amountViewModel$formatCurrency$1 = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$formatCurrency$1) continuation;
            if ((amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = amountViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = amountViewModel.getHighSpeedVideoFpsRangesFor;
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str2);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, i, null, null, 24, null);
                    amountViewModel$formatCurrency$1.Camera2StreamConfigurationMap = str;
                    amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges = str2;
                    amountViewModel$formatCurrency$1.getHighSpeedVideoSizes = i;
                    amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, amountViewModel$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    str4 = str;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = amountViewModel$formatCurrency$1.getHighSpeedVideoSizes;
                    str3 = (java.lang.String) amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges;
                    str4 = (java.lang.String) amountViewModel$formatCurrency$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str5 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str5 == null) {
                    return str5;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str4);
                sb.append(" ");
                sb.append(str3);
                return sb.toString();
            }
        }
        amountViewModel$formatCurrency$1 = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$formatCurrency$1(amountViewModel, continuation);
        java.lang.Object obj2 = amountViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = amountViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        str5 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str5 == null) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent, java.lang.String currencyCode, java.lang.String minimumAmount, java.lang.String maximumAmount, java.util.List<java.lang.String> options, java.lang.String formattedMinimum, java.lang.String formattedMaximum, java.util.List<java.lang.String> formattedOptions) {
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState copy;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState value;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState copy2;
        com.paypal.pds.components.SelectionCardModel create;
        java.util.List<java.lang.String> list = options;
        java.util.List<java.lang.String> list2 = formattedOptions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        java.lang.String thresholdAmount = intent instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge ? ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge) intent).getThresholdAmount() : minimumAmount;
        java.lang.String currentAmount = java.lang.Double.parseDouble(intent.getCurrentAmount()) >= java.lang.Double.parseDouble(thresholdAmount) ? intent.getCurrentAmount() : thresholdAmount;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState value2 = mutableStateFlow.getValue();
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState = value2;
            java.lang.String ensureTwoDecimalsPlaces = ensureTwoDecimalsPlaces(currentAmount);
            java.lang.String ensureTwoDecimalsPlaces2 = ensureTwoDecimalsPlaces(currentAmount);
            java.util.List<java.lang.String> list3 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            int i = 0;
            for (java.lang.Object obj : list3) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String str = (java.lang.String) obj;
                create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(str, (r18 & 2) != 0 ? null : (i < 0 || i >= formattedOptions.size()) ? str : list2.get(i), (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : java.lang.Double.parseDouble(str) == java.lang.Double.parseDouble(currentAmount), (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                arrayList.add(create);
                i++;
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> mutableStateFlow2 = mutableStateFlow;
            java.lang.String str2 = currentAmount;
            copy = amountUiState.copy((r26 & 1) != 0 ? amountUiState.intent : intent, (r26 & 2) != 0 ? amountUiState.currencyCode : currencyCode, (r26 & 4) != 0 ? amountUiState.minimumAmount : thresholdAmount, (r26 & 8) != 0 ? amountUiState.formattedMinimum : formattedMinimum, (r26 & 16) != 0 ? amountUiState.maximumAmount : maximumAmount, (r26 & 32) != 0 ? amountUiState.formattedMaximum : formattedMaximum, (r26 & 64) != 0 ? amountUiState.options : options, (r26 & 128) != 0 ? amountUiState.mayInputCustomAmount : true, (r26 & 256) != 0 ? amountUiState.optionsUi : arrayList, (r26 & 512) != 0 ? amountUiState.amount : ensureTwoDecimalsPlaces2, (r26 & 1024) != 0 ? amountUiState.initialAmount : ensureTwoDecimalsPlaces, (r26 & 2048) != 0 ? amountUiState.amountValidation : null);
            if (mutableStateFlow2.compareAndSet(value2, copy)) {
                break;
            }
            list = options;
            list2 = formattedOptions;
            mutableStateFlow = mutableStateFlow2;
            currentAmount = str2;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState> mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow3.getValue();
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState2 = value;
            copy2 = amountUiState2.copy((r26 & 1) != 0 ? amountUiState2.intent : null, (r26 & 2) != 0 ? amountUiState2.currencyCode : null, (r26 & 4) != 0 ? amountUiState2.minimumAmount : null, (r26 & 8) != 0 ? amountUiState2.formattedMinimum : null, (r26 & 16) != 0 ? amountUiState2.maximumAmount : null, (r26 & 32) != 0 ? amountUiState2.formattedMaximum : null, (r26 & 64) != 0 ? amountUiState2.options : null, (r26 & 128) != 0 ? amountUiState2.mayInputCustomAmount : false, (r26 & 256) != 0 ? amountUiState2.optionsUi : null, (r26 & 512) != 0 ? amountUiState2.amount : null, (r26 & 1024) != 0 ? amountUiState2.initialAmount : null, (r26 & 2048) != 0 ? amountUiState2.amountValidation : getHighSpeedVideoFpsRangesFor(amountUiState2.getAmount()));
        } while (!mutableStateFlow3.compareAndSet(value, copy2));
    }

    public final void handleEvent(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel$handleEvent$1(event, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getIntent();
        double parseDouble = java.lang.Double.parseDouble(p0);
        double parseDouble2 = java.lang.Double.parseDouble(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getMinimumAmount());
        double parseDouble3 = java.lang.Double.parseDouble(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getMaximumAmount());
        boolean z = intent instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge;
        if (z && parseDouble < parseDouble2) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getFormattedMinimum());
        }
        if (parseDouble < parseDouble2) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getFormattedMinimum());
        }
        if (parseDouble > parseDouble3) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getFormattedMaximum());
        }
        if (z) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getFormattedMinimum());
        }
        return com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid.INSTANCE;
    }

    public final java.lang.String ensureTwoDecimalsPlaces(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = kotlin.text.StringsKt.substringAfter$default(str, ".", (java.lang.String) null, 2, (java.lang.Object) null).length();
        if (length == str.length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(".00");
            return sb.toString();
        }
        if (length == 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
            return sb2.toString();
        }
        if (length != 1) {
            return str;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("0");
        return sb3.toString();
    }
}
