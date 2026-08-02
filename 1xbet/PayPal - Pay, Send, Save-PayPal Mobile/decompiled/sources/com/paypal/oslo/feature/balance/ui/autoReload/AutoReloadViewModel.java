package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001PBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010#\u001a\u00020\"*\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00100\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u00106\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00105R&\u0010.\u001a\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000209078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>R \u0010A\u001a\b\u0012\u0004\u0012\u0002080@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010F\u001a\b\u0012\u0004\u0012\u0002090E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR$\u0010K\u001a\u00020J2\u0006\u0010\u001d\u001a\u00020J8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u0016\u0010:\u001a\u00020N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010O"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadReducer;", "reducer", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getAutoReloadInitialConfigUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getAccountTypeUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffAutoTransferUseCase;", "turnOffAutoTransferUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;", "checkAutoTransferEnabledUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "formatOrdinalUseCase", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadReducer;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffAutoTransferUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;)V", "initialize", "()V", "dismiss", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "p0", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dayOfMonth", "formatOrdinal", "(I)Ljava/lang/String;", "getInputFormats", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffAutoTransferUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "", "isConsumerAccountType", "Z", "()Z", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "AutoReloadChoiceSheetUi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase getHighSpeedVideoSizes;
    private boolean isConsumerAccountType;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState> uiState;

    @javax.inject.Inject
    public AutoReloadViewModel(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer autoReloadReducer, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase turnOffAutoTransferUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase checkAutoTransferEnabledUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadInitialConfigUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffAutoTransferUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkAutoTransferEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOrdinalUseCase, "");
        this.Camera2StreamConfigurationMap = localeInformation;
        this.getHighSpeedVideoFpsRanges = formatCurrencyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getAutoReloadInitialConfigUseCase;
        this.getHighSpeedVideoFpsRangesFor = getAccountTypeUseCase;
        this.getHighSpeedVideoSizes = turnOffAutoTransferUseCase;
        this.getInputFormats = checkAutoTransferEnabledUseCase;
        this.getHighSpeedVideoSizesFor = formatOrdinalUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(com.paypal.oslo.feature.balance.common.AutoReloadConstants.ComponentNames.AUTO_RELOAD_VIEWMODEL_STORE, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle.INSTANCE, autoReloadReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent>() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.this, input, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$turnOffAutoTransfer$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.this, input, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.isConsumerAccountType = true;
        this.getInputSizeshNQ4ISI = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(false, null, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$onFetchSuccess(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$onFetchSuccess$1 autoReloadViewModel$onFetchSuccess$1;
        int i;
        kotlin.jvm.functions.Function1 function1;
        boolean z;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$onFetchSuccess$1) {
            autoReloadViewModel$onFetchSuccess$1 = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$onFetchSuccess$1) continuation;
            if ((autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = autoReloadViewModel$onFetchSuccess$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1 eventDispatcher = input.getEventDispatcher();
                    boolean isActive = autoReloadViewModel.getInputSizeshNQ4ISI.isActive();
                    autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input);
                    autoReloadViewModel$onFetchSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig);
                    autoReloadViewModel$onFetchSuccess$1.getHighResolutionOutputSizeshNQ4ISI = eventDispatcher;
                    autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizes = autoReloadConfig;
                    autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoFpsRangesFor = isActive;
                    autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = autoReloadViewModel.getHighResolutionOutputSizeshNQ4ISI(autoReloadConfig, autoReloadViewModel$onFetchSuccess$1);
                    if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = eventDispatcher;
                    obj = highResolutionOutputSizeshNQ4ISI;
                    z = isActive;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoFpsRangesFor;
                    autoReloadConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) autoReloadViewModel$onFetchSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess(z, autoReloadConfig, (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        autoReloadViewModel$onFetchSuccess$1 = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$onFetchSuccess$1(autoReloadViewModel, continuation);
        java.lang.Object obj2 = autoReloadViewModel$onFetchSuccess$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadViewModel$onFetchSuccess$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess(z, autoReloadConfig, (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi) obj2));
        return kotlin.Unit.INSTANCE;
    }

    public final java.util.Locale getUserLocale() {
        return this.Camera2StreamConfigurationMap.getUserLocale();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: isConsumerAccountType, reason: from getter */
    public final boolean getIsConsumerAccountType() {
        return this.isConsumerAccountType;
    }

    public final void processIntent(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.getOutputFormats.onEvent(intent);
    }

    public final void initialize() {
        processIntent(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize.INSTANCE);
    }

    public final void dismiss() {
        processIntent(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getChoiceSheetUi$1 autoReloadViewModel$getChoiceSheetUi$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig2;
        java.lang.String str;
        java.lang.Object highSpeedVideoFpsRangesFor2;
        java.lang.String str2;
        java.lang.String str3;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getChoiceSheetUi$1) {
            autoReloadViewModel$getChoiceSheetUi$1 = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getChoiceSheetUi$1) continuation;
            if ((autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = autoReloadViewModel$getChoiceSheetUi$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.Money reloadAmount = autoReloadConfig.getLowBalance().getReloadAmount();
                    autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor = autoReloadConfig;
                    autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRangesFor(reloadAmount, autoReloadViewModel$getChoiceSheetUi$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (java.lang.String) autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRanges;
                            str2 = (java.lang.String) autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi(str3, str2, (java.lang.String) obj);
                        }
                        str = (java.lang.String) autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI;
                        autoReloadConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str4 = (java.lang.String) obj;
                        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount2 = autoReloadConfig2.getScheduled().getReloadAmount();
                        autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig2);
                        autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI = str;
                        autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRanges = str4;
                        autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes = 3;
                        highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(reloadAmount2, autoReloadViewModel$getChoiceSheetUi$1);
                        if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                            str2 = str;
                            str3 = str4;
                            obj = highSpeedVideoFpsRangesFor2;
                            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi(str3, str2, (java.lang.String) obj);
                        }
                        return coroutine_suspended;
                    }
                    autoReloadConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str5 = (java.lang.String) obj;
                com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold = autoReloadConfig.getLowBalance().getReloadThreshold();
                autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor = autoReloadConfig;
                autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI = str5;
                autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes = 2;
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(reloadThreshold, autoReloadViewModel$getChoiceSheetUi$1);
                if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                    autoReloadConfig2 = autoReloadConfig;
                    str = str5;
                    obj = highSpeedVideoFpsRangesFor;
                    java.lang.String str42 = (java.lang.String) obj;
                    com.paypal.oslo.feature.balance.domain.model.Money reloadAmount22 = autoReloadConfig2.getScheduled().getReloadAmount();
                    autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig2);
                    autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRanges = str42;
                    autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes = 3;
                    highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(reloadAmount22, autoReloadViewModel$getChoiceSheetUi$1);
                    if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        autoReloadViewModel$getChoiceSheetUi$1 = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getChoiceSheetUi$1(this, continuation);
        java.lang.Object obj2 = autoReloadViewModel$getChoiceSheetUi$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.lang.String str52 = (java.lang.String) obj2;
        com.paypal.oslo.feature.balance.domain.model.Money reloadThreshold2 = autoReloadConfig.getLowBalance().getReloadThreshold();
        autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoFpsRangesFor = autoReloadConfig;
        autoReloadViewModel$getChoiceSheetUi$1.getHighResolutionOutputSizeshNQ4ISI = str52;
        autoReloadViewModel$getChoiceSheetUi$1.getHighSpeedVideoSizes = 2;
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(reloadThreshold2, autoReloadViewModel$getChoiceSheetUi$1);
        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getFormattedOrEmpty$1 autoReloadViewModel$getFormattedOrEmpty$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getFormattedOrEmpty$1) {
            autoReloadViewModel$getFormattedOrEmpty$1 = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getFormattedOrEmpty$1) continuation;
            if ((autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (money != null) {
                        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoFpsRanges;
                        java.math.BigDecimal amount = money.getAmount();
                        com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(money.m12029getCurrencyCodehkTgrg(), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 2, null, null, 24, null);
                        autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoFpsRanges = money;
                        autoReloadViewModel$getFormattedOrEmpty$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                        autoReloadViewModel$getFormattedOrEmpty$1.Camera2StreamConfigurationMap = 0;
                        autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoSizes = 1;
                        obj = formatCurrencyUseCase.invoke(amount, currencyConfiguration, autoReloadViewModel$getFormattedOrEmpty$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return "";
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = autoReloadViewModel$getFormattedOrEmpty$1.Camera2StreamConfigurationMap;
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str == null) {
                    java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
                    java.lang.String plainString = money.getAmount().toPlainString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m12029getCurrencyCodehkTgrg);
                    sb.append(" ");
                    sb.append(plainString);
                    str = sb.toString();
                }
                return str == null ? str : "";
            }
        }
        autoReloadViewModel$getFormattedOrEmpty$1 = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$getFormattedOrEmpty$1(this, continuation);
        java.lang.Object obj2 = autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadViewModel$getFormattedOrEmpty$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str == null) {
        }
        if (str == null) {
        }
    }

    public final java.lang.String formatOrdinal(int dayOfMonth) {
        java.lang.Object value;
        arrow.core.Either invoke$default = com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase.invoke$default(this.getHighSpeedVideoSizesFor, dayOfMonth, null, 2, null);
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "", "", "lowBalanceThresholdAmount", "lowBalanceReloadAmount", "scheduledReloadAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLowBalanceThresholdAmount", "getLowBalanceReloadAmount", "getScheduledReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoReloadChoiceSheetUi {
        public static final int $stable = 0;
        private final java.lang.String lowBalanceReloadAmount;
        private final java.lang.String lowBalanceThresholdAmount;
        private final java.lang.String scheduledReloadAmount;

        public AutoReloadChoiceSheetUi(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.lowBalanceThresholdAmount = str;
            this.lowBalanceReloadAmount = str2;
            this.scheduledReloadAmount = str3;
        }

        public /* synthetic */ AutoReloadChoiceSheetUi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        public final java.lang.String getLowBalanceThresholdAmount() {
            return this.lowBalanceThresholdAmount;
        }

        public final java.lang.String getLowBalanceReloadAmount() {
            return this.lowBalanceReloadAmount;
        }

        public final java.lang.String getScheduledReloadAmount() {
            return this.scheduledReloadAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.lowBalanceThresholdAmount;
            java.lang.String str2 = this.lowBalanceReloadAmount;
            java.lang.String str3 = this.scheduledReloadAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadChoiceSheetUi(lowBalanceThresholdAmount=");
            sb.append(str);
            sb.append(", lowBalanceReloadAmount=");
            sb.append(str2);
            sb.append(", scheduledReloadAmount=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.lowBalanceThresholdAmount.hashCode() * 31) + this.lowBalanceReloadAmount.hashCode()) * 31) + this.scheduledReloadAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.lowBalanceThresholdAmount, autoReloadChoiceSheetUi.lowBalanceThresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.lowBalanceReloadAmount, autoReloadChoiceSheetUi.lowBalanceReloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheduledReloadAmount, autoReloadChoiceSheetUi.scheduledReloadAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi copy(java.lang.String lowBalanceThresholdAmount, java.lang.String lowBalanceReloadAmount, java.lang.String scheduledReloadAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceThresholdAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceReloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledReloadAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi(lowBalanceThresholdAmount, lowBalanceReloadAmount, scheduledReloadAmount);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getScheduledReloadAmount() {
            return this.scheduledReloadAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLowBalanceReloadAmount() {
            return this.lowBalanceReloadAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLowBalanceThresholdAmount() {
            return this.lowBalanceThresholdAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = autoReloadChoiceSheetUi.lowBalanceThresholdAmount;
            }
            if ((i & 2) != 0) {
                str2 = autoReloadChoiceSheetUi.lowBalanceReloadAmount;
            }
            if ((i & 4) != 0) {
                str3 = autoReloadChoiceSheetUi.scheduledReloadAmount;
            }
            return autoReloadChoiceSheetUi.copy(str, str2, str3);
        }

        public AutoReloadChoiceSheetUi() {
            this(null, null, null, 7, null);
        }
    }
}
