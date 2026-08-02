package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001RBu\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00103R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u00105\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001e0<8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0015\u0010C\u001a\u00020A8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b4\u0010BR\u0015\u0010E\u001a\u00020D8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010BR&\u0010J\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020H0F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010IR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0K8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010P\u001a\b\u0012\u0004\u0012\u00020H0<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "getAccountSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "balanceModuleMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;", "recentActivitiesMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;", "rewardMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "specialFinancingMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;", "getWalletStatusUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;", "getProvisionedWalletTokensUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEngagementActionHandlerMiddleware;", "engagementActionSideEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AccountSummaryNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEngagementActionHandlerMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AccountSummaryNavigationArgs;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEvent;", "event", "", "handleDataInvalidationEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;", "getHighSpeedVideoFpsRanges", "getOutputStallDuration", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "getOutputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AccountSummaryNavigationArgs;", "Lkotlinx/coroutines/flow/Flow;", "dataInvalidationEvents", "Lkotlinx/coroutines/flow/Flow;", "getDataInvalidationEvents", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryObservabilityMiddleware;", "Lkotlin/Lazy;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/FetchAccountSummaryMiddleware;", "getOutputSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputMinFrameDurationlomOqCM", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiEffect", "getUiEffect", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> dataInvalidationEvents;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AccountSummaryNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/arguments/AccountSummaryNavigationArgs;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs navArgs, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient);
    }

    @dagger.assisted.AssistedInject
    public AccountSummaryViewModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper balanceModuleUiMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper recentActivitiesSectionUiStateMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper cashbackRewardMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase getProvisionedWalletTokensUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware accountSummaryEngagementActionHandlerMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer accountSummaryReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, @dagger.assisted.Assisted final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceModuleUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentActivitiesSectionUiStateMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProvisionedWalletTokensUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryEngagementActionHandlerMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryNavigationArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        this.Camera2StreamConfigurationMap = getAccountSummaryUseCase;
        this.getHighSpeedVideoSizes = balanceModuleUiMapper;
        this.getHighSpeedVideoFpsRanges = recentActivitiesSectionUiStateMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = cashbackRewardMapper;
        this.getHighSpeedVideoFpsRangesFor = specialFinancingMapper;
        this.getOutputMinFrameDuration = dateFormatterFacade;
        this.getHighSpeedVideoSizesFor = getWalletStatusUseCase;
        this.getInputFormats = getProvisionedWalletTokensUseCase;
        this.getOutputFormats = dataInvalidationEventBus;
        this.getInputSizeshNQ4ISI = accountSummaryNavigationArgs;
        this.dataInvalidationEvents = dataInvalidationEventBus.getEvents();
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.$r8$lambda$PVug7fhUrlNcEnZDp2JOWttp3J4(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.this);
            }
        });
        this.getOutputSizeshNQ4ISI = lazy;
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.$r8$lambda$IsVeIo9BwtjUgZfOS60R4pZ8q7Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.this, starPayClient);
            }
        });
        this.getOutputSizes = lazy2;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AccountSummaryViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial.INSTANCE, accountSummaryReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware) lazy2.getValue(), (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryObservabilityMiddleware) lazy.getValue(), accountSummaryEngagementActionHandlerMiddleware}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDurationlomOqCM = mviStateStore;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated(accountSummaryNavigationArgs.getCreditProductIdentifier()));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent> getDataInvalidationEvents() {
        return this.dataInvalidationEvents;
    }

    public final void handleDataInvalidationEvent(com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if ((this.getOutputMinFrameDurationlomOqCM.getUiState().getValue() instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading) || (this.getOutputMinFrameDurationlomOqCM.getUiState().getValue() instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial)) {
            this.getOutputFormats.resetEvents();
            return;
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged) {
            processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload.INSTANCE);
        }
        this.getOutputFormats.resetEvents();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDurationlomOqCM.onEvent(event);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware $r8$lambda$IsVeIo9BwtjUgZfOS60R4pZ8q7Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware(accountSummaryViewModel.getInputSizeshNQ4ISI.getCreditProductIdentifier(), accountSummaryViewModel.Camera2StreamConfigurationMap, accountSummaryViewModel.getHighSpeedVideoSizes, accountSummaryViewModel.getHighSpeedVideoFpsRanges, accountSummaryViewModel.getHighResolutionOutputSizeshNQ4ISI, accountSummaryViewModel.getHighSpeedVideoFpsRangesFor, accountSummaryViewModel.getOutputMinFrameDuration, starPayClient, accountSummaryViewModel.getHighSpeedVideoSizesFor, accountSummaryViewModel.getInputFormats);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryObservabilityMiddleware $r8$lambda$PVug7fhUrlNcEnZDp2JOWttp3J4(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryObservabilityMiddleware(accountSummaryViewModel.getInputSizeshNQ4ISI.getCreditProductIdentifier());
    }
}
