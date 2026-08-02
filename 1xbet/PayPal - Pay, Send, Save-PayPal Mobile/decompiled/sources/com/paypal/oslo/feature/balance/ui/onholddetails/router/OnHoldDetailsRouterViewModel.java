package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b \u0010\u001bJ\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000200038\u0007¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010:R \u0010=\u001a\b\u0012\u0004\u0012\u0002090<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;", "getBalanceUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "getTaxHoldPolicyUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterIntent;)V", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "money", "", "digits", "", "formatMoney", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatScaledMoney", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateString", "formatDate", "(Ljava/lang/String;)Ljava/lang/String;", "p0", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;)V", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterEffect;", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnHoldDetailsRouterViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterEffect> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState> uiState;

    @javax.inject.Inject
    public OnHoldDetailsRouterViewModel(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getBalanceUseCase, com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBalanceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxHoldPolicyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.getHighSpeedVideoSizes = localeInformation;
        this.getHighSpeedVideoFpsRanges = getBalanceUseCase;
        this.Camera2StreamConfigurationMap = getTaxHoldPolicyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = formatCurrencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = dateTimeFormatUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Idle.INSTANCE);
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoSizesFor = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processIntent(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterIntent.Initialize) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$initialize$1(this, null), 3, null);
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatMoney(com.paypal.oslo.feature.balance.domain.model.Money money, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatMoney$1 onHoldDetailsRouterViewModel$formatMoney$1;
        int i2;
        com.paypal.oslo.feature.balance.domain.model.Money money2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatMoney$1) {
            onHoldDetailsRouterViewModel$formatMoney$1 = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatMoney$1) continuation;
            if ((onHoldDetailsRouterViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                onHoldDetailsRouterViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = onHoldDetailsRouterViewModel$formatMoney$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = onHoldDetailsRouterViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.math.BigDecimal amount = money.getAmount();
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(money.m12029getCurrencyCodehkTgrg(), null, i, null, null, 26, null);
                    onHoldDetailsRouterViewModel$formatMoney$1.getHighSpeedVideoFpsRangesFor = money;
                    onHoldDetailsRouterViewModel$formatMoney$1.Camera2StreamConfigurationMap = i;
                    onHoldDetailsRouterViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = formatCurrencyUseCase.invoke(amount, currencyConfiguration, onHoldDetailsRouterViewModel$formatMoney$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    money2 = money;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onHoldDetailsRouterViewModel$formatMoney$1.Camera2StreamConfigurationMap;
                    money2 = (com.paypal.oslo.feature.balance.domain.model.Money) onHoldDetailsRouterViewModel$formatMoney$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Currency formatting failed, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", money2.m12029getCurrencyCodehkTgrg()), kotlin.TuplesKt.to("amount", money2.getAmount().toPlainString()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
                    java.lang.String m12029getCurrencyCodehkTgrg = money2.m12029getCurrencyCodehkTgrg();
                    java.lang.String plainString = money2.getAmount().toPlainString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m12029getCurrencyCodehkTgrg);
                    sb.append(" ");
                    sb.append(plainString);
                    return sb.toString();
                }
                if (either instanceof arrow.core.Either.Right) {
                    return ((arrow.core.Either.Right) either).getValue();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        onHoldDetailsRouterViewModel$formatMoney$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatMoney$1(this, continuation);
        java.lang.Object obj2 = onHoldDetailsRouterViewModel$formatMoney$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = onHoldDetailsRouterViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatScaledMoney(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatScaledMoney$1 onHoldDetailsRouterViewModel$formatScaledMoney$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatScaledMoney$1) {
            onHoldDetailsRouterViewModel$formatScaledMoney$1 = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatScaledMoney$1) continuation;
            if ((onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = onHoldDetailsRouterViewModel$formatScaledMoney$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.math.BigDecimal amount = money.getAmount();
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(money.m12029getCurrencyCodehkTgrg(), null, 0, null, com.paypal.oslo.core.i18n.domain.model.CurrencyScale.SCALE_TWO, 14, null);
                    onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRangesFor = money;
                    onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRanges = 1;
                    obj = formatCurrencyUseCase.invoke(amount, currencyConfiguration, onHoldDetailsRouterViewModel$formatScaledMoney$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Currency scaled formatting failed, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", money.m12029getCurrencyCodehkTgrg()), kotlin.TuplesKt.to("amount", money.getAmount().toPlainString()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
                    java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
                    java.lang.String plainString = money.getAmount().toPlainString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m12029getCurrencyCodehkTgrg);
                    sb.append(" ");
                    sb.append(plainString);
                    return sb.toString();
                }
                if (either instanceof arrow.core.Either.Right) {
                    return ((arrow.core.Either.Right) either).getValue();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        onHoldDetailsRouterViewModel$formatScaledMoney$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatScaledMoney$1(this, continuation);
        java.lang.Object obj2 = onHoldDetailsRouterViewModel$formatScaledMoney$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onHoldDetailsRouterViewModel$formatScaledMoney$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    public final java.lang.String formatDate(java.lang.String dateString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "");
        try {
            java.util.Date from = java.util.Date.from(java.time.Instant.parse(dateString));
            com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration = new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_MEDIUM, null, 2, null);
            com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(from);
            java.lang.String id = this.getHighSpeedVideoSizes.getTimezone().getID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
            java.lang.String orNull = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id), dateTimeConfiguration).getOrNull();
            if (orNull != null) {
                return orNull;
            }
            java.lang.String obj = from.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Date formatting failed, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("datestring", dateString), kotlin.TuplesKt.to("error", e)), null, null, 12, null);
            return dateString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1 onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1) {
            onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1 = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1) continuation;
            if ((onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase = this.Camera2StreamConfigurationMap;
                    onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor = money;
                    onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoSizes = 1;
                    obj = getTaxHoldPolicyUseCase.invoke(onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to fetch tax hold policy", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue())), null, null, 12, null);
                    this.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    getHighResolutionOutputSizeshNQ4ISI(money, (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    getHighResolutionOutputSizeshNQ4ISI(money, (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) both.getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1(this, continuation);
        java.lang.Object obj2 = onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = onHoldDetailsRouterViewModel$fetchTaxHoldPolicy$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.domain.model.Money p0, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy p1) {
        this.getInputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success(new com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold(p0, p1.getPolicyStatus() == com.paypal.oslo.api.graphql.schema.type.PolicyStatus.IN_GRACE_PERIOD && p1.getProcessStatus() == com.paypal.oslo.api.graphql.schema.type.ProcessStatus.COMPLETED, p1.getTaxRate(), p1.getNextWithholdingDate(), p1.getAmountThreshold())));
    }

    public static final /* synthetic */ java.lang.Object access$onBalanceSuccess(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, com.paypal.oslo.feature.balance.domain.model.Balance balance, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.domain.model.Money taxOnHoldAmount = balance.getTaxOnHoldAmount();
        com.paypal.oslo.feature.balance.domain.model.Money moneyOnHoldAmount = balance.getMoneyOnHoldAmount();
        if (taxOnHoldAmount != null) {
            java.lang.Object highSpeedVideoFpsRanges = onHoldDetailsRouterViewModel.getHighSpeedVideoFpsRanges(taxOnHoldAmount, continuation);
            return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
        }
        if (moneyOnHoldAmount != null) {
            onHoldDetailsRouterViewModel.getInputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success(new com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold(moneyOnHoldAmount)));
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "No holds found in balance data, navigating back", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            java.lang.Object send = onHoldDetailsRouterViewModel.getHighSpeedVideoSizesFor.send(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterEffect.NavigateBack.INSTANCE, continuation);
            if (send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
