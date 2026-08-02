package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010,R \u0010/\u001a\b\u0012\u0004\u0012\u00020+0.8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00105R \u00107\u001a\b\u0012\u0004\u0012\u000204068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010<"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "accountSnapshotProvider", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/DismissEngagementCardUseCase;", "dismissEngagementCardUseCase", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetBusinessHomeFeedUseCase;", "getBusinessHomeFeedUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/businesshome/common/featuregate/BusinessHomeFeatureGatesManager;", "featureGatesManager", "<init>", "(Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;Lcom/paypal/oslo/feature/businesshome/domain/usecase/DismissEngagementCardUseCase;Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetBusinessHomeFeedUseCase;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/businesshome/common/featuregate/BusinessHomeFeatureGatesManager;)V", "", "loadData$business_home_prodRelease", "()V", "onDisputesClick", "onPayablesClick", "onReceivablesClick", "onRecentTransactionsClick", "dismissAccountSetupCard", "", "Lcom/paypal/oslo/feature/businesshome/ui/home/EngagementCardUiData;", "cards", "seedEngagementCards$business_home_prodRelease", "(Ljava/util/List;)V", "", "cardId", "dismissEngagementCard", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "getAccountSnapshotProvider", "()Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/DismissEngagementCardUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetBusinessHomeFeedUseCase;", "getOutputFormats", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/businesshome/domain/model/Activity;", "Lcom/paypal/oslo/feature/businesshome/domain/model/Activity;", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessHomeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.home.api.AccountSnapshotProvider accountSnapshotProvider;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect> effects;
    private final com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.businesshome.domain.model.Activity getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private com.paypal.oslo.feature.businesshome.domain.model.Activity getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> uiState;

    @javax.inject.Inject
    public BusinessHomeViewModel(com.paypal.oslo.feature.home.api.AccountSnapshotProvider accountSnapshotProvider, com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase dismissEngagementCardUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getBusinessHomeFeedUseCase, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager businessHomeFeatureGatesManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissEngagementCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessHomeFeedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessHomeFeatureGatesManager, "");
        this.accountSnapshotProvider = accountSnapshotProvider;
        this.Camera2StreamConfigurationMap = dismissEngagementCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getBusinessHomeFeedUseCase;
        this.getHighSpeedVideoFpsRanges = userStore;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor = Channel$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        if (!businessHomeFeatureGatesManager.isBusinessExperienceAvailable()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1(this, null), 3, null);
        } else {
            loadData$business_home_prodRelease();
        }
    }

    public final com.paypal.oslo.feature.home.api.AccountSnapshotProvider getAccountSnapshotProvider() {
        return this.accountSnapshotProvider;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect> getEffects() {
        return this.effects;
    }

    public final void loadData$business_home_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$loadData$1(this, null), 3, null);
    }

    public final void onDisputesClick() {
        this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToDisputes.INSTANCE);
    }

    public final void onPayablesClick() {
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity = this.getOutputMinFrameDuration;
        com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType type = activity != null ? activity.getType() : null;
        int i = type == null ? -1 : com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == -1) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayablesList.INSTANCE));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail(activity.getId())));
        } else if (i == 2) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail(activity.getId())));
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void onReceivablesClick() {
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity = this.getInputSizeshNQ4ISI;
        com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType type = activity != null ? activity.getType() : null;
        int i = type == null ? -1 : com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == -1) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivablesList.INSTANCE));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail(activity.getId())));
        } else if (i == 2) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail(activity.getId())));
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void onRecentTransactionsClick() {
        this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToRecentTransactions.INSTANCE);
    }

    public final void dismissAccountSetupCard() {
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState value;
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success success;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            success = value;
            if (success instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) {
                com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success success2 = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) success;
                java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> cards = success2.getData().getCards();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : cards) {
                    if (!(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card) obj) instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup)) {
                        arrayList.add(obj);
                    }
                }
                success = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success(success2.getData().copy(arrayList));
            }
        } while (!mutableStateFlow.compareAndSet(value, success));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void seedEngagementCards$business_home_prodRelease(java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> cards) {
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState value;
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            success = value;
            if (success instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) {
                com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success success2 = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) success;
                java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> cards2 = success2.getData().getCards();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : cards2) {
                    if (!(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card) obj) instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards)) {
                        arrayList.add(obj);
                    }
                }
                success = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success(success2.getData().copy(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards>) arrayList, new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards(cards, null, 2, 0 == true ? 1 : 0))));
            }
        } while (!mutableStateFlow.compareAndSet(value, success));
    }

    public final void dismissEngagementCard(java.lang.String cardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$dismissEngagementCard$1(this, cardId, null), 3, null);
    }

    public static final /* synthetic */ boolean access$isBusiness(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel, com.paypal.oslo.core.userstore.model.UserState userState) {
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountType;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
        return (profileLoaded == null || (user = profileLoaded.getUser()) == null || (accountType = user.getAccountType()) == null || !kotlin.text.StringsKt.equals(accountType, "BUSINESS", true)) ? false : true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.MONEY_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.INVOICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
