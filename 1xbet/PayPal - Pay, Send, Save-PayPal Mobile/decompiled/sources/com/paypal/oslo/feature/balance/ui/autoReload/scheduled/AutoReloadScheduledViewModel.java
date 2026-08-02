package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 R2\u00020\u0001:\u0001RBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020!2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u0010(\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00104R\u0011\u00108\u001a\u0002058G¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\u0002098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u0002098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020B0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u00020A0E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010K\u001a\b\u0012\u0004\u0012\u00020B0J8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010O\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010Q"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledReducer;", "reducer", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getAutoReloadInitialConfigUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;", "turnOffScheduledAutoReloadUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getAccountTypeUseCase", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "featureManager", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "formatOrdinalUseCase", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledReducer;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledIntent;)V", "", "p0", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljava/time/LocalDate;", "", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function1;)Ljava/time/LocalDate;", "dayOfMonth", "formatOrdinal", "(I)Ljava/lang/String;", "getOutputFormats", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "amountScheduledRequestId", "Ljava/lang/String;", "getAmountScheduledRequestId-QDVFmTU", "()Ljava/lang/String;", "frequencyScheduledRequestId", "getFrequencyScheduledRequestId-QDVFmTU", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "isConsumerAccountType", "Z", "()Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadScheduledViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase getOutputFormats;
    private final java.lang.String amountScheduledRequestId;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect> effect;
    private final java.lang.String frequencyScheduledRequestId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.manager.BalanceFeatureManager getOutputMinFrameDuration;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase Camera2StreamConfigurationMap;
    private boolean isConsumerAccountType;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState> uiState;
    public static final int $stable = 8;
    private static final java.util.List<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"50.00", "100.00", "150.00", "200.00"});

    @javax.inject.Inject
    public AutoReloadScheduledViewModel(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledReducer autoReloadScheduledReducer, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase turnOffScheduledAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadScheduledReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadInitialConfigUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffScheduledAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOrdinalUseCase, "");
        this.getHighSpeedVideoFpsRanges = localeInformation;
        this.getHighResolutionOutputSizeshNQ4ISI = formatCurrencyUseCase;
        this.getHighSpeedVideoSizes = getAutoReloadInitialConfigUseCase;
        this.Camera2StreamConfigurationMap = turnOffScheduledAutoReloadUseCase;
        this.getHighSpeedVideoFpsRangesFor = getAccountTypeUseCase;
        this.getOutputMinFrameDuration = balanceFeatureManager;
        this.getOutputFormats = formatOrdinalUseCase;
        this.amountScheduledRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.frequencyScheduledRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AutoReloadScheduledState", com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial.INSTANCE, autoReloadScheduledReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this, input, null), 3, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffButtonClick.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.this, input, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
        this.isConsumerAccountType = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x026e, code lost:
    
        if (r15 == r3) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0375 -> B:13:0x0386). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$createLoadedEvent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$createLoadedEvent$1 autoReloadScheduledViewModel$createLoadedEvent$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly weekly;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency;
        java.time.LocalDate plusDays;
        java.time.LocalDate localDate;
        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List<java.lang.String> list;
        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig2;
        java.lang.String str5;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.math.BigDecimal amount;
        java.lang.String plainString;
        java.time.DayOfWeek valueOf;
        java.time.DayOfWeek valueOf2;
        java.time.LocalDate plusDays2;
        java.lang.Object highSpeedVideoFpsRangesFor2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig3;
        java.lang.String str6;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency2;
        java.time.LocalDate localDate2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Object highSpeedVideoFpsRangesFor3;
        java.lang.String str12;
        java.lang.String str13;
        java.time.LocalDate localDate3;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency3;
        java.lang.String str14;
        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig4;
        java.lang.String str15;
        java.util.List<java.lang.String> list2;
        java.util.List<java.lang.String> list3;
        java.util.ArrayList arrayList;
        java.util.List<java.lang.String> list4;
        java.lang.String str16;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency4;
        java.lang.Object obj;
        int i2;
        int i3;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.util.Iterator it;
        java.lang.Object obj2;
        java.lang.String str20;
        java.lang.String str21;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$createLoadedEvent$1) {
            autoReloadScheduledViewModel$createLoadedEvent$1 = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$createLoadedEvent$1) continuation;
            if ((autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary & Integer.MIN_VALUE) != 0) {
                autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary -= 2147483648;
                java.lang.Object obj3 = autoReloadScheduledViewModel$createLoadedEvent$1.accessartificialFrame;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    str = "25.00";
                    str2 = ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel) autoReloadScheduledViewModel).isConsumerAccountType ? "25.00" : "500.00";
                    java.time.DayOfWeek dayOfWeek = java.time.LocalDate.now().plusDays(1L).getDayOfWeek();
                    java.lang.String recurrence = scheduledConfig.getRecurrence();
                    if (recurrence != null) {
                        int hashCode = recurrence.hashCode();
                        if (hashCode != -1738378111) {
                            if (hashCode != 313318265) {
                                if (hashCode == 1954618349 && recurrence.equals("MONTHLY")) {
                                    java.lang.String startDate = scheduledConfig.getStartDate();
                                    if (startDate == null || (plusDays2 = java.time.LocalDate.parse(startDate)) == null) {
                                        plusDays2 = java.time.LocalDate.now().plusDays(1L);
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(plusDays2);
                                    weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(plusDays2);
                                    autoReloadFrequency = weekly;
                                    if (autoReloadFrequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
                                        final java.lang.String startDate2 = scheduledConfig.getStartDate();
                                        if (startDate2 == null || (plusDays = getHighSpeedVideoFpsRanges(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.m12109$r8$lambda$q6lS6ZpTa7AA1cZ7ueqZNxUK0E(startDate2, (java.time.LocalDate) obj4));
                                            }
                                        })) == null) {
                                            plusDays = java.time.LocalDate.now().plusDays(1L);
                                        }
                                    } else {
                                        final java.lang.String startDate3 = scheduledConfig.getStartDate();
                                        if (startDate3 == null || (plusDays = getHighSpeedVideoFpsRanges(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.m12108$r8$lambda$DEptTGwb7cl1dPlE8it6vlP0A(startDate3, (java.time.LocalDate) obj4));
                                            }
                                        })) == null) {
                                            plusDays = java.time.LocalDate.now().plusDays(1L);
                                        }
                                    }
                                    localDate = plusDays;
                                    reloadAmount = scheduledConfig.getReloadAmount();
                                    if (reloadAmount != null || (r1 = reloadAmount.m12029getCurrencyCodehkTgrg()) == null) {
                                        java.lang.String str22 = "USD";
                                    }
                                    str3 = str22;
                                    com.paypal.oslo.feature.balance.domain.model.Money reloadAmount2 = scheduledConfig.getReloadAmount();
                                    str4 = (reloadAmount2 != null || (amount = reloadAmount2.getAmount()) == null || (plainString = amount.toPlainString()) == null) ? str2 : plainString;
                                    list = getHighSpeedVideoSizes;
                                    scheduledConfig2 = scheduledConfig;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                    autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = "25.00";
                                    str5 = "1000.00";
                                    autoReloadScheduledViewModel$createLoadedEvent$1.toString = "1000.00";
                                    autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                                    autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 1;
                                    highSpeedVideoFpsRangesFor = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str4, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                                }
                            } else if (recurrence.equals("BI_WEEKLY")) {
                                java.lang.String startDay = scheduledConfig.getStartDay();
                                if (startDay != null && (valueOf2 = java.time.DayOfWeek.valueOf(startDay)) != null) {
                                    dayOfWeek = valueOf2;
                                }
                                kotlin.jvm.internal.Intrinsics.checkNotNull(dayOfWeek);
                                weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly(dayOfWeek);
                                autoReloadFrequency = weekly;
                                if (autoReloadFrequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
                                }
                                localDate = plusDays;
                                reloadAmount = scheduledConfig.getReloadAmount();
                                if (reloadAmount != null) {
                                }
                                java.lang.String str222 = "USD";
                                str3 = str222;
                                com.paypal.oslo.feature.balance.domain.model.Money reloadAmount22 = scheduledConfig.getReloadAmount();
                                if (reloadAmount22 != null) {
                                }
                                list = getHighSpeedVideoSizes;
                                scheduledConfig2 = scheduledConfig;
                                autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
                                autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
                                autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
                                autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
                                autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
                                autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = "25.00";
                                str5 = "1000.00";
                                autoReloadScheduledViewModel$createLoadedEvent$1.toString = "1000.00";
                                autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                                autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 1;
                                highSpeedVideoFpsRangesFor = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str4, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                            }
                        } else if (recurrence.equals("WEEKLY")) {
                            java.lang.String startDay2 = scheduledConfig.getStartDay();
                            if (startDay2 != null && (valueOf = java.time.DayOfWeek.valueOf(startDay2)) != null) {
                                dayOfWeek = valueOf;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(dayOfWeek);
                            weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(dayOfWeek);
                            autoReloadFrequency = weekly;
                            if (autoReloadFrequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
                            }
                            localDate = plusDays;
                            reloadAmount = scheduledConfig.getReloadAmount();
                            if (reloadAmount != null) {
                            }
                            java.lang.String str2222 = "USD";
                            str3 = str2222;
                            com.paypal.oslo.feature.balance.domain.model.Money reloadAmount222 = scheduledConfig.getReloadAmount();
                            if (reloadAmount222 != null) {
                            }
                            list = getHighSpeedVideoSizes;
                            scheduledConfig2 = scheduledConfig;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
                            autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
                            autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
                            autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = "25.00";
                            str5 = "1000.00";
                            autoReloadScheduledViewModel$createLoadedEvent$1.toString = "1000.00";
                            autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                            autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 1;
                            highSpeedVideoFpsRangesFor = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str4, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                        }
                        r9.add((java.lang.String) obj3);
                        list4 = r8;
                        str19 = r14;
                        obj = r16;
                        str21 = r20;
                        scheduledConfig4 = r23;
                        arrayList = r24;
                        i3 = r18;
                        obj2 = r0;
                        str16 = r7;
                        autoReloadFrequency4 = r22;
                        if (it.hasNext()) {
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(dayOfWeek);
                    weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(dayOfWeek);
                    autoReloadFrequency = weekly;
                    if (autoReloadFrequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
                    }
                    localDate = plusDays;
                    reloadAmount = scheduledConfig.getReloadAmount();
                    if (reloadAmount != null) {
                    }
                    java.lang.String str22222 = "USD";
                    str3 = str22222;
                    com.paypal.oslo.feature.balance.domain.model.Money reloadAmount2222 = scheduledConfig.getReloadAmount();
                    if (reloadAmount2222 != null) {
                    }
                    list = getHighSpeedVideoSizes;
                    scheduledConfig2 = scheduledConfig;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
                    autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = "25.00";
                    str5 = "1000.00";
                    autoReloadScheduledViewModel$createLoadedEvent$1.toString = "1000.00";
                    autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                    autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 1;
                    highSpeedVideoFpsRangesFor = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str4, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                } else if (i == 1) {
                    list = (java.util.List) autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames;
                    str5 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.toString;
                    str = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                    str4 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                    str3 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor;
                    localDate = (java.time.LocalDate) autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs;
                    autoReloadFrequency = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                    str2 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig5 = (com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig) autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    highSpeedVideoFpsRangesFor = obj3;
                    scheduledConfig2 = scheduledConfig5;
                } else {
                    if (i == 2) {
                        java.lang.String str23 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        java.util.List<java.lang.String> list5 = (java.util.List) autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames;
                        str10 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.toString;
                        str9 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        str8 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        str7 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        localDate2 = (java.time.LocalDate) autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs;
                        autoReloadFrequency2 = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        str6 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                        scheduledConfig3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig) autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        str11 = str23;
                        list = list5;
                        java.lang.String str24 = (java.lang.String) obj3;
                        autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig3;
                        autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                        autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency2;
                        autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate2;
                        autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str7;
                        autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str8;
                        autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str9;
                        autoReloadScheduledViewModel$createLoadedEvent$1.toString = str10;
                        autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                        autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt = str11;
                        autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = str24;
                        autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 3;
                        highSpeedVideoFpsRangesFor3 = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str7, str10, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                        if (highSpeedVideoFpsRangesFor3 != coroutine_suspended) {
                            str12 = str8;
                            str13 = str7;
                            localDate3 = localDate2;
                            autoReloadFrequency3 = autoReloadFrequency2;
                            str14 = str6;
                            scheduledConfig4 = scheduledConfig3;
                            java.util.List<java.lang.String> list6 = list;
                            str15 = str24;
                            obj3 = highSpeedVideoFpsRangesFor3;
                            list2 = list6;
                            java.lang.String str25 = (java.lang.String) obj3;
                            list3 = list2;
                            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            list4 = list2;
                            str16 = str10;
                            autoReloadFrequency4 = autoReloadFrequency3;
                            obj = list3;
                            i2 = 0;
                            i3 = 0;
                            str17 = str15;
                            str18 = str12;
                            str19 = str25;
                            java.lang.String str26 = str13;
                            it = list3.iterator();
                            autoReloadScheduledViewModel$createLoadedEvent$1 = autoReloadScheduledViewModel$createLoadedEvent$1;
                            obj2 = coroutine_suspended;
                            str20 = str9;
                            str21 = str26;
                            if (it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        str15 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        str11 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        list2 = (java.util.List) autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames;
                        str10 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.toString;
                        str9 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        str12 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        str13 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        localDate3 = (java.time.LocalDate) autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs;
                        autoReloadFrequency3 = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        str14 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                        scheduledConfig4 = (com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig) autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        java.lang.String str252 = (java.lang.String) obj3;
                        list3 = list2;
                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                        list4 = list2;
                        str16 = str10;
                        autoReloadFrequency4 = autoReloadFrequency3;
                        obj = list3;
                        i2 = 0;
                        i3 = 0;
                        str17 = str15;
                        str18 = str12;
                        str19 = str252;
                        java.lang.String str262 = str13;
                        it = list3.iterator();
                        autoReloadScheduledViewModel$createLoadedEvent$1 = autoReloadScheduledViewModel$createLoadedEvent$1;
                        obj2 = coroutine_suspended;
                        str20 = str9;
                        str21 = str262;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = autoReloadScheduledViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap;
                        int i5 = autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges;
                        int i6 = autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor;
                        java.util.Collection collection = (java.util.Collection) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM;
                        java.lang.Object obj4 = autoReloadScheduledViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI;
                        it = (java.util.Iterator) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputStallDuration;
                        ?? r11 = (java.util.Collection) autoReloadScheduledViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI;
                        java.lang.Object obj5 = (java.lang.Iterable) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDuration;
                        ?? r13 = (java.lang.Iterable) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputFormats;
                        java.lang.String str27 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getInputFormats;
                        java.lang.String str28 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor;
                        str11 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt;
                        java.util.List<java.lang.String> list7 = (java.util.List) autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames;
                        java.lang.String str29 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.toString;
                        java.lang.String str30 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI;
                        java.lang.String str31 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str32 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor;
                        java.time.LocalDate localDate4 = (java.time.LocalDate) autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs;
                        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency5 = (com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency) autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM;
                        java.lang.String str33 = (java.lang.String) autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig6 = (com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig) autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        java.util.ArrayList arrayList2 = r11;
                        java.lang.Object obj6 = obj5;
                        localDate3 = localDate4;
                        java.lang.Object obj7 = coroutine_suspended;
                        str20 = str30;
                        int i7 = i6;
                        str17 = str28;
                        list3 = r13;
                        str14 = str33;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig7 = scheduledConfig6;
                        str18 = str31;
                        i2 = i5;
                        collection.add((java.lang.String) obj3);
                        list4 = list7;
                        str19 = str27;
                        obj = obj6;
                        str21 = str32;
                        scheduledConfig4 = scheduledConfig7;
                        arrayList = arrayList2;
                        i3 = i7;
                        obj2 = obj7;
                        str16 = str29;
                        autoReloadFrequency4 = autoReloadFrequency5;
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            java.util.Iterator it2 = it;
                            java.lang.String str34 = (java.lang.String) next;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig4;
                            scheduledConfig7 = scheduledConfig4;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str14);
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency4;
                            autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate3;
                            autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str21;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str18;
                            autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str20;
                            autoReloadScheduledViewModel$createLoadedEvent$1.toString = str16;
                            autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list4;
                            autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt = str11;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = str17;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getInputFormats = str19;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                            java.util.ArrayList arrayList3 = arrayList;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getInputSizeshNQ4ISI = arrayList3;
                            java.lang.String str35 = str16;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputStallDuration = it2;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str34);
                            autoReloadScheduledViewModel$createLoadedEvent$1.getOutputStallDurationlomOqCM = arrayList3;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRangesFor = i3;
                            autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoFpsRanges = i2;
                            autoReloadScheduledViewModel$createLoadedEvent$1.Camera2StreamConfigurationMap = 0;
                            obj6 = obj;
                            autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 4;
                            java.lang.Object highSpeedVideoFpsRangesFor4 = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str21, str34, 0, autoReloadScheduledViewModel$createLoadedEvent$1);
                            obj7 = obj2;
                            if (highSpeedVideoFpsRangesFor4 == obj7) {
                                return obj7;
                            }
                            autoReloadFrequency5 = autoReloadFrequency4;
                            arrayList2 = arrayList3;
                            i7 = i3;
                            str29 = str35;
                            str32 = str21;
                            list7 = list4;
                            str27 = str19;
                            obj3 = highSpeedVideoFpsRangesFor4;
                            collection = arrayList2;
                            it = it2;
                            collection.add((java.lang.String) obj3);
                            list4 = list7;
                            str19 = str27;
                            obj = obj6;
                            str21 = str32;
                            scheduledConfig4 = scheduledConfig7;
                            arrayList = arrayList2;
                            i3 = i7;
                            obj2 = obj7;
                            str16 = str29;
                            autoReloadFrequency4 = autoReloadFrequency5;
                            if (it.hasNext()) {
                                java.lang.String str36 = str16;
                                com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig8 = scheduledConfig4;
                                java.util.ArrayList arrayList4 = arrayList;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(localDate3);
                                com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str18, str11);
                                com.paypal.oslo.feature.balance.domain.model.Money reloadAmount3 = scheduledConfig8.getReloadAmount();
                                return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataLoaded(autoReloadFrequency4, localDate3, reloadAmountUi, str21, (reloadAmount3 != null ? reloadAmount3.getAmount() : null) != null, scheduledConfig8.isEnabled(), scheduledConfig8.getFinancialInstrumentId(), str20, str36, list4, str17, str19, arrayList4);
                            }
                        }
                    }
                }
                java.lang.String str37 = (java.lang.String) highSpeedVideoFpsRangesFor;
                autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
                autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
                autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
                autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
                autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
                autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str;
                autoReloadScheduledViewModel$createLoadedEvent$1.toString = str5;
                autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt = str37;
                autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 2;
                highSpeedVideoFpsRangesFor2 = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                    scheduledConfig3 = scheduledConfig2;
                    obj3 = highSpeedVideoFpsRangesFor2;
                    str6 = str2;
                    autoReloadFrequency2 = autoReloadFrequency;
                    localDate2 = localDate;
                    str7 = str3;
                    str8 = str4;
                    str9 = str;
                    str10 = str5;
                    str11 = str37;
                    java.lang.String str242 = (java.lang.String) obj3;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig3;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency2;
                    autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate2;
                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str7;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str8;
                    autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str9;
                    autoReloadScheduledViewModel$createLoadedEvent$1.toString = str10;
                    autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
                    autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt = str11;
                    autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizesFor = str242;
                    autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 3;
                    highSpeedVideoFpsRangesFor3 = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str7, str10, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
                    if (highSpeedVideoFpsRangesFor3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        autoReloadScheduledViewModel$createLoadedEvent$1 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$createLoadedEvent$1(autoReloadScheduledViewModel, continuation);
        java.lang.Object obj32 = autoReloadScheduledViewModel$createLoadedEvent$1.accessartificialFrame;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary;
        if (i != 0) {
        }
        java.lang.String str372 = (java.lang.String) highSpeedVideoFpsRangesFor;
        autoReloadScheduledViewModel$createLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = scheduledConfig2;
        autoReloadScheduledViewModel$createLoadedEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        autoReloadScheduledViewModel$createLoadedEvent$1.getOutputMinFrameDurationlomOqCM = autoReloadFrequency;
        autoReloadScheduledViewModel$createLoadedEvent$1.unwrapAs = localDate;
        autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedFor = str3;
        autoReloadScheduledViewModel$createLoadedEvent$1.getValidOutputFormatsForInputhNQ4ISI = str4;
        autoReloadScheduledViewModel$createLoadedEvent$1.isOutputSupportedForhNQ4ISI = str;
        autoReloadScheduledViewModel$createLoadedEvent$1.toString = str5;
        autoReloadScheduledViewModel$createLoadedEvent$1.ArtificialStackFrames = list;
        autoReloadScheduledViewModel$createLoadedEvent$1.CoroutineDebuggingKt = str372;
        autoReloadScheduledViewModel$createLoadedEvent$1.coroutineBoundary = 2;
        highSpeedVideoFpsRangesFor2 = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor(str3, str, 2, autoReloadScheduledViewModel$createLoadedEvent$1);
        if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final java.util.Locale getUserLocale() {
        return this.getHighSpeedVideoFpsRanges.getUserLocale();
    }

    /* renamed from: getAmountScheduledRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAmountScheduledRequestId() {
        return this.amountScheduledRequestId;
    }

    /* renamed from: getFrequencyScheduledRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getFrequencyScheduledRequestId() {
        return this.frequencyScheduledRequestId;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect> getEffect() {
        return this.effect;
    }

    /* renamed from: isConsumerAccountType, reason: from getter */
    public final boolean getIsConsumerAccountType() {
        return this.isConsumerAccountType;
    }

    public final void processIntent(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!(intent instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffButtonClick) || this.getOutputMinFrameDuration.isAutoReloadEnabled()) {
            this.getHighSpeedVideoSizesFor.onEvent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$formatCurrency$1 autoReloadScheduledViewModel$formatCurrency$1;
        int i2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = str2;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$formatCurrency$1) {
            autoReloadScheduledViewModel$formatCurrency$1 = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$formatCurrency$1) continuation;
            if ((autoReloadScheduledViewModel$formatCurrency$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                autoReloadScheduledViewModel$formatCurrency$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = autoReloadScheduledViewModel$formatCurrency$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str5);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, i, null, null, 24, null);
                    autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges = str;
                    autoReloadScheduledViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI = str5;
                    autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoSizes = i;
                    autoReloadScheduledViewModel$formatCurrency$1.Camera2StreamConfigurationMap = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, autoReloadScheduledViewModel$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoSizes;
                    str5 = (java.lang.String) autoReloadScheduledViewModel$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoFpsRanges;
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
        autoReloadScheduledViewModel$formatCurrency$1 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = autoReloadScheduledViewModel$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = autoReloadScheduledViewModel$formatCurrency$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        str4 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str4 == null) {
        }
    }

    private static java.time.LocalDate getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super java.time.LocalDate, java.lang.Boolean> p0) {
        java.time.LocalDate now = java.time.LocalDate.now();
        do {
            now = now.plusDays(1L);
            kotlin.jvm.internal.Intrinsics.checkNotNull(now);
        } while (!p0.invoke(now).booleanValue());
        kotlin.jvm.internal.Intrinsics.checkNotNull(now);
        return now;
    }

    public final java.lang.String formatOrdinal(int dayOfMonth) {
        java.lang.Object value;
        arrow.core.Either invoke$default = com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase.invoke$default(this.getOutputFormats, dayOfMonth, null, 2, null);
        if (invoke$default instanceof arrow.core.Either.Left) {
            value = java.lang.String.valueOf(dayOfMonth);
        } else {
            if (!(invoke$default instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            value = ((arrow.core.Either.Right) invoke$default).getValue();
        }
        return (java.lang.String) value;
    }

    /* renamed from: $r8$lambda$D-EptTGwb7cl1-dPlE8it6vlP0A, reason: not valid java name */
    public static /* synthetic */ boolean m12108$r8$lambda$DEptTGwb7cl1dPlE8it6vlP0A(java.lang.String str, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        return java.time.LocalDate.parse(str).getDayOfMonth() == localDate.getDayOfMonth();
    }

    /* renamed from: $r8$lambda$q6lS6ZpTa7AA1cZ7ueq-ZNxUK0E, reason: not valid java name */
    public static /* synthetic */ boolean m12109$r8$lambda$q6lS6ZpTa7AA1cZ7ueqZNxUK0E(java.lang.String str, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        return java.time.LocalDate.parse(str).getDayOfWeek() == localDate.getDayOfWeek();
    }
}
