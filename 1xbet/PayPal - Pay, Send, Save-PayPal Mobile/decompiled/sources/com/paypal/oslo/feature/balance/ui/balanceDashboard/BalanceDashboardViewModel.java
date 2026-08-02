package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020'¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020'¢\u0006\u0004\b+\u0010)J\r\u0010,\u001a\u00020'¢\u0006\u0004\b,\u0010)J\r\u0010-\u001a\u00020'¢\u0006\u0004\b-\u0010)J\r\u0010.\u001a\u00020'¢\u0006\u0004\b.\u0010)J\r\u0010/\u001a\u00020'¢\u0006\u0004\b/\u0010)J\r\u00100\u001a\u00020'¢\u0006\u0004\b0\u0010)J\r\u00101\u001a\u00020'¢\u0006\u0004\b1\u0010)J\r\u00102\u001a\u00020'¢\u0006\u0004\b2\u0010)J\r\u00103\u001a\u00020'¢\u0006\u0004\b3\u0010)J\r\u00104\u001a\u00020'¢\u0006\u0004\b4\u0010)J\r\u00105\u001a\u00020'¢\u0006\u0004\b5\u0010)J\r\u00106\u001a\u00020'¢\u0006\u0004\b6\u0010)J\r\u00107\u001a\u00020'¢\u0006\u0004\b7\u0010)J\u0015\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u001a¢\u0006\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010<\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010?\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010J\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010LR\u0014\u0010E\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010MR\u0014\u0010B\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010NR&\u0010H\u001a\u0014\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020Q0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020P0T8\u0007¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Q0Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010_\u001a\u00020'2\u0006\u0010^\u001a\u00020'8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010)R\u0018\u0010b\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010a"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;", "getBalanceUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getAccountTypeUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getAutoReloadInitialConfigUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/nba/GetNbaDomainRecommendationsUseCase;", "getNbaDomainRecommendationsUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "getTaxHoldPolicyUseCase", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "checkAccountRoutingEligibilityUseCase", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "balanceFeatureManager", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/nba/GetNbaDomainRecommendationsUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardReducer;)V", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "money", "", "formatMoney", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;)V", "initialize", "()V", "Landroidx/navigation3/runtime/NavKey;", "navigateToARN", "()Landroidx/navigation3/runtime/NavKey;", "", "isPreferredPaymentModeEnabled", "()Z", "isAddCashStoresEnabled", "isCashInCheckEnabled", "isFileTaxesEnabled", "isDirectDepositEnabled", "isSmartRouteEnabled", "isNbaEnabled", "isNbaCategorySelectionEnabled", "isMoreOptionsEnabled", "isAccountRoutingEnabled", "isActivityWidgetEnabled", "isViewCurrenciesEnabled", "isAddMoneyEnabled", "isAutoReloadEnabled", "isAccountRoutingProvisioned", "headerCTAText", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "getActivityWidget", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetBalanceUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getHighSpeedVideoSizes", "getOutputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadInitialConfigUseCase;", "getHighSpeedVideoFpsRanges", "getInputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/nba/GetNbaDomainRecommendationsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/balance/domain/usecase/onholddetails/GetTaxHoldPolicyUseCase;", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardEffect;", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "p0", "isConsumerAccount", "Z", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "getOutputStallDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceDashboardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.activity.api.widget.IActivityWidget getOutputStallDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.manager.BalanceFeatureManager getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect> getInputFormats;
    private boolean isConsumerAccount;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState> uiState;

    @jakarta.inject.Inject
    public BalanceDashboardViewModel(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getBalanceUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase getNbaDomainRecommendationsUseCase, com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase, com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer balanceDashboardReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBalanceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadInitialConfigUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getNbaDomainRecommendationsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxHoldPolicyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkAccountRoutingEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardReducer, "");
        this.getHighSpeedVideoFpsRangesFor = iActivityWidgetProvider;
        this.Camera2StreamConfigurationMap = getBalanceUseCase;
        this.getHighSpeedVideoSizes = getAccountTypeUseCase;
        this.getHighSpeedVideoFpsRanges = getAutoReloadInitialConfigUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getNbaDomainRecommendationsUseCase;
        this.getHighSpeedVideoSizesFor = getTaxHoldPolicyUseCase;
        this.getInputSizeshNQ4ISI = checkAccountRoutingEligibilityUseCase;
        this.getOutputFormats = balanceFeatureManager;
        this.getOutputMinFrameDuration = formatCurrencyUseCase;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(com.paypal.oslo.feature.balance.common.BalanceConstants.ComponentNames.BALANCE_DASHBOARD_VIEWMODEL_STORE, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading.INSTANCE, balanceDashboardReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1(this)), androidx.view.ViewModelKt.getViewModelScope(balanceDashboardViewModel));
        this.getInputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        this.isConsumerAccount = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(balanceDashboardViewModel), null, null, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$loadUserType$1(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$toUiModel(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, com.paypal.oslo.feature.balance.domain.model.Balance balance, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$toUiModel$1 balanceDashboardViewModel$toUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.balance.domain.model.Balance balance2;
        java.lang.String str;
        java.lang.Object formatMoney;
        java.lang.String str2;
        com.paypal.oslo.feature.balance.domain.model.Balance balance3;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$toUiModel$1) {
            balanceDashboardViewModel$toUiModel$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$toUiModel$1) continuation;
            if ((balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.Money reservedAmount = balance.getReservedAmount();
                    balance2 = balance;
                    if (reservedAmount == null) {
                        str = null;
                        com.paypal.oslo.feature.balance.domain.model.Money availableAmount = balance2.getAvailableAmount();
                        balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap = balance2;
                        balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRanges = str;
                        balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes = 2;
                        formatMoney = balanceDashboardViewModel.formatMoney(availableAmount, balanceDashboardViewModel$toUiModel$1);
                        if (formatMoney != coroutine_suspended) {
                            str2 = str;
                            balance3 = balance2;
                            obj = formatMoney;
                            java.lang.String str3 = (java.lang.String) obj;
                            java.lang.String plainString = balance3.getAvailableAmount().getAmount().toPlainString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
                            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel(plainString, balance3.getAvailableAmount().m12029getCurrencyCodehkTgrg(), str3, balance3.getCurrencies().size() <= 1, balance3.getAvailableAmount().isPositive(), balance3.getAvailableAmount().isNegative(), balance3.getCurrencies().size() <= 1, balance3.getHasMoneyOnHold(), balance3.getHasTaxOnHold(), str2, balance3.getTaxOnHoldAmount(), balance3.getMoneyOnHoldAmount(), balance3.getPrimaryCurrency());
                        }
                        return coroutine_suspended;
                    }
                    balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap = balance2;
                    balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reservedAmount);
                    balanceDashboardViewModel$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes = 1;
                    obj = balanceDashboardViewModel.formatMoney(reservedAmount, balanceDashboardViewModel$toUiModel$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.String str4 = (java.lang.String) balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRanges;
                        balance3 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = str4;
                        java.lang.String str32 = (java.lang.String) obj;
                        java.lang.String plainString2 = balance3.getAvailableAmount().getAmount().toPlainString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString2, "");
                        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel(plainString2, balance3.getAvailableAmount().m12029getCurrencyCodehkTgrg(), str32, balance3.getCurrencies().size() <= 1, balance3.getAvailableAmount().isPositive(), balance3.getAvailableAmount().isNegative(), balance3.getCurrencies().size() <= 1, balance3.getHasMoneyOnHold(), balance3.getHasTaxOnHold(), str2, balance3.getTaxOnHoldAmount(), balance3.getMoneyOnHoldAmount(), balance3.getPrimaryCurrency());
                    }
                    int i2 = balanceDashboardViewModel$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    balance2 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                com.paypal.oslo.feature.balance.domain.model.Money availableAmount2 = balance2.getAvailableAmount();
                balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap = balance2;
                balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRanges = str;
                balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes = 2;
                formatMoney = balanceDashboardViewModel.formatMoney(availableAmount2, balanceDashboardViewModel$toUiModel$1);
                if (formatMoney != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        balanceDashboardViewModel$toUiModel$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$toUiModel$1(balanceDashboardViewModel, continuation);
        java.lang.Object obj2 = balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        com.paypal.oslo.feature.balance.domain.model.Money availableAmount22 = balance2.getAvailableAmount();
        balanceDashboardViewModel$toUiModel$1.Camera2StreamConfigurationMap = balance2;
        balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoFpsRanges = str;
        balanceDashboardViewModel$toUiModel$1.getHighSpeedVideoSizes = 2;
        formatMoney = balanceDashboardViewModel.formatMoney(availableAmount22, balanceDashboardViewModel$toUiModel$1);
        if (formatMoney != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect> getUiEffect() {
        return this.uiEffect;
    }

    /* renamed from: isConsumerAccount, reason: from getter */
    public final boolean getIsConsumerAccount() {
        return this.isConsumerAccount;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatMoney(com.paypal.oslo.feature.balance.domain.model.Money money, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$formatMoney$1 balanceDashboardViewModel$formatMoney$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$formatMoney$1) {
            balanceDashboardViewModel$formatMoney$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$formatMoney$1) continuation;
            if ((balanceDashboardViewModel$formatMoney$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$formatMoney$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = balanceDashboardViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$formatMoney$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getOutputMinFrameDuration;
                    java.math.BigDecimal amount = money.getAmount();
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(money.m12029getCurrencyCodehkTgrg(), null, 0, null, null, 30, null);
                    balanceDashboardViewModel$formatMoney$1.Camera2StreamConfigurationMap = money;
                    balanceDashboardViewModel$formatMoney$1.getHighSpeedVideoSizes = 1;
                    obj = formatCurrencyUseCase.invoke(amount, currencyConfiguration, balanceDashboardViewModel$formatMoney$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) balanceDashboardViewModel$formatMoney$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Currency formatting failed, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", money.m12029getCurrencyCodehkTgrg()), kotlin.TuplesKt.to("amount", money.getAmount().toPlainString()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
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
        balanceDashboardViewModel$formatMoney$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$formatMoney$1(this, continuation);
        java.lang.Object obj2 = balanceDashboardViewModel$formatMoney$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$formatMoney$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    public final void processIntent(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.getInputFormats.onEvent(intent);
    }

    public final void initialize() {
        processIntent(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize.INSTANCE);
    }

    public final androidx.navigation3.runtime.NavKey navigateToARN() {
        if (this.isConsumerAccount) {
            return com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination.INSTANCE;
        }
        return new com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination((java.lang.String) null, (java.lang.String) null, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean isPreferredPaymentModeEnabled() {
        return this.getOutputFormats.isPreferredPaymentModeEnabled();
    }

    public final boolean isAddCashStoresEnabled() {
        return this.getOutputFormats.isAddCashStoresEnabled();
    }

    public final boolean isCashInCheckEnabled() {
        return this.getOutputFormats.isCashInCheckEnabled();
    }

    public final boolean isFileTaxesEnabled() {
        return this.getOutputFormats.isFileTaxesEnabled();
    }

    public final boolean isDirectDepositEnabled() {
        return this.getOutputFormats.isDirectDepositEnabled();
    }

    public final boolean isSmartRouteEnabled() {
        return this.getOutputFormats.isSmartRouteEnabled();
    }

    public final boolean isNbaEnabled() {
        return this.getOutputFormats.isNbaEnabled();
    }

    public final boolean isNbaCategorySelectionEnabled() {
        return this.getOutputFormats.isNbaCategorySelectionEnabled();
    }

    public final boolean isMoreOptionsEnabled() {
        return this.getOutputFormats.isMoreOptionsEnabled();
    }

    public final boolean isAccountRoutingEnabled() {
        return this.getOutputFormats.isAccountRoutingEnabled();
    }

    public final boolean isActivityWidgetEnabled() {
        return this.getOutputFormats.isActivityWidgetEnabled();
    }

    public final boolean isViewCurrenciesEnabled() {
        return this.getOutputFormats.isViewCurrenciesEnabled();
    }

    public final boolean isAddMoneyEnabled() {
        return this.getOutputFormats.isAddMoneyEnabled();
    }

    public final boolean isAutoReloadEnabled() {
        return this.getOutputFormats.isAutoReloadEnabled();
    }

    public final boolean isAccountRoutingProvisioned() {
        return this.getOutputFormats.isAccountRoutingProvisioned();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.api.widget.IActivityWidget getActivityWidget(java.lang.String headerCTAText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerCTAText, "");
        com.paypal.oslo.feature.activity.api.widget.IActivityWidget iActivityWidget = this.getOutputStallDuration;
        if (iActivityWidget != null) {
            return iActivityWidget;
        }
        com.paypal.oslo.feature.activity.api.widget.IActivityWidget createWidget = this.getHighSpeedVideoFpsRangesFor.createWidget(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.INSTANCE.builder("balance_hub").setFiltersConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance), (java.util.List) null, (java.util.List) null, (java.lang.String) null, 15728639, (kotlin.jvm.internal.DefaultConstructorMarker) null)).setUiConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(false, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_VISIBLE_IN_ALL_CASES, false, 0 == true ? 1 : 0, false, 29, 0 == true ? 1 : 0)).setContentConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig((java.lang.String) null, headerCTAText, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 125, (kotlin.jvm.internal.DefaultConstructorMarker) null)).build());
        this.getOutputStallDuration = createWidget;
        return createWidget;
    }
}
