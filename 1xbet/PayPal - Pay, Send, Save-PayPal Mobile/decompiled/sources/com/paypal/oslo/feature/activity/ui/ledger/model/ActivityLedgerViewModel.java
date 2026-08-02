package com.paypal.oslo.feature.activity.ui.ledger.model;

@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0000¢\u0006\u0004\b*\u0010+J%\u00100\u001a\u00020#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020 0,2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302¢\u0006\u0004\b4\u00105J#\u0010:\u001a\u00020#2\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b:\u0010;J#\u0010B\u001a\u00020#2\u0006\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010C\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010I\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010NR\u0014\u0010O\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010SR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020U028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010VR\u0018\u0010L\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010[R \u0010]\u001a\b\u0012\u0004\u0012\u00020U0(8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010+R\u001a\u0010`\u001a\u00020>8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020>8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010cR\u001a\u0010f\u001a\u00020>8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityLedgerBaseViewModel;", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;", "activityLedgerUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;", "activityLedgerFilterUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUserActivitiesPaginationUseCase;", "activityLedgerUserActivitiesPaginationUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerActionsUseCase;", "activityLedgerActionsUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;", "activityNavigationUseCase", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "errorMapper", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;", "packageTrackingEmailLinkStatusUseCase", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerReducer;", "activityLedgerReducer", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUserActivitiesPaginationUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerActionsUseCase;Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerReducer;Lcom/paypal/oslo/core/userstore/UserStore;)V", "getActivityComposeConfig$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "userActivitiesActivityItems$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lkotlinx/coroutines/flow/Flow;", "", "navigateToSearchScreen$activity_prodRelease", "()V", "fetchActivityLedgerItems$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "emptyUIStateFlow$activity_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "", "items", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "currentScreenState", "validateAndUpdateEmptyStateIfRequired$activity_prodRelease", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getNextPageCursor", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "invokeAction$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;", "transactionTileNavigationTypes", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "navResultRequestId", "navigateByNavigationType-VU73JmE$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes;Ljava/lang/String;)V", "navigateByNavigationType", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUserActivitiesPaginationUseCase;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerActionsUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityNavigationUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/Job;", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityActionCardHelper;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityActionCardHelper;", "getOutputSizeshNQ4ISI", "activityLedgerUIState", "Lkotlinx/coroutines/flow/StateFlow;", "getActivityLedgerUIState$activity_prodRelease", "navActivityDetailRequestId", "Ljava/lang/String;", "getNavActivityDetailRequestId-QDVFmTU$activity_prodRelease", "()Ljava/lang/String;", "navActivitySearchRequestId", "getNavActivitySearchRequestId-QDVFmTU$activity_prodRelease", "navPackageTrackingRequestId", "getNavPackageTrackingRequestId-QDVFmTU$activity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerViewModel extends com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> activityLedgerUIState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;
    private final java.lang.String navActivityDetailRequestId;
    private final java.lang.String navActivitySearchRequestId;
    private final java.lang.String navPackageTrackingRequestId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public ActivityLedgerViewModel(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase activityLedgerUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase activityLedgerFilterUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase activityLedgerActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer activityLedgerReducer, com.paypal.oslo.core.userstore.UserStore userStore) {
        super(activityComposeConfig.getNavigator(), userStore, getPackageTrackingEmailLinkStatusUseCase, activityLedgerReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerFilterUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUserActivitiesPaginationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerActionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNavigationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPackageTrackingEmailLinkStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityComposeConfig;
        this.getHighSpeedVideoFpsRanges = activityLedgerUseCase;
        this.Camera2StreamConfigurationMap = activityLedgerFilterUseCase;
        this.getHighSpeedVideoFpsRangesFor = activityLedgerUserActivitiesPaginationUseCase;
        this.getHighSpeedVideoSizes = activityLedgerActionsUseCase;
        this.getOutputFormats = activityNavigationUseCase;
        this.getInputSizeshNQ4ISI = iActivityErrorMapper;
        this.getHighSpeedVideoSizesFor = activityFeatureManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading.INSTANCE);
        this.getInputFormats = MutableStateFlow;
        this.getOutputSizeshNQ4ISI = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean isLedgerActionCardEnabled;
                isLedgerActionCardEnabled = com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this.getHighSpeedVideoSizesFor.isLedgerActionCardEnabled();
                return java.lang.Boolean.valueOf(isLedgerActionCardEnabled);
            }
        });
        this.activityLedgerUIState = MutableStateFlow;
        this.navActivityDetailRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.navActivitySearchRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.navPackageTrackingRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> getActivityLedgerUIState$activity_prodRelease() {
        return this.activityLedgerUIState;
    }

    /* renamed from: getActivityComposeConfig$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getNavActivityDetailRequestId-QDVFmTU$activity_prodRelease, reason: not valid java name and from getter */
    public final java.lang.String getNavActivityDetailRequestId() {
        return this.navActivityDetailRequestId;
    }

    /* renamed from: getNavActivitySearchRequestId-QDVFmTU$activity_prodRelease, reason: not valid java name and from getter */
    public final java.lang.String getNavActivitySearchRequestId() {
        return this.navActivitySearchRequestId;
    }

    /* renamed from: getNavPackageTrackingRequestId-QDVFmTU$activity_prodRelease, reason: not valid java name and from getter */
    public final java.lang.String getNavPackageTrackingRequestId() {
        return this.navPackageTrackingRequestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow userActivitiesActivityItems$activity_prodRelease$default(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
        int i2 = 1;
        if ((i & 1) != 0) {
            activityFilterType = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, i2, 0 == true ? 1 : 0);
        }
        return activityLedgerViewModel.userActivitiesActivityItems$activity_prodRelease(activityFilterType);
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> userActivitiesActivityItems$activity_prodRelease(final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> activityItemsPaginationDataFlow$activity_prodRelease = getActivityItemsPaginationDataFlow$activity_prodRelease();
        if (activityItemsPaginationDataFlow$activity_prodRelease != null) {
            return activityItemsPaginationDataFlow$activity_prodRelease;
        }
        final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> fetchCompletedLedgerItems$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper.INSTANCE.fetchCompletedLedgerItems$activity_prodRelease(getNextPageCursor(), activityFilterType, this.getHighSpeedVideoFpsRangesFor);
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> cachedIn = androidx.paging.CachedPagingDataKt.cachedIn(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2(flowCollector, this, activityFilterType), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper activityActionCardHelper;
                    if (continuation instanceof com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                activityActionCardHelper = this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI;
                                androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> injectIntoPagingData = activityActionCardHelper.injectIntoPagingData((androidx.paging.PagingData) obj, this.getHighSpeedVideoFpsRangesFor.getEmailLinkStatus$activity_prodRelease().getValue(), this.getHighSpeedVideoFpsRanges);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(injectIntoPagingData, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1$2", f = "ActivityLedgerViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$userActivitiesActivityItems$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
                    this.getHighSpeedVideoFpsRanges = activityFilterType;
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        setActivityItemsPaginationDataFlow$activity_prodRelease(cachedIn);
        return cachedIn;
    }

    public final void navigateToSearchScreen$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = getGetHighResolutionOutputSizeshNQ4ISI().getNavigator();
        if (navigator != null) {
            navigator.m11575navigateForResultInternaluBl809w(this.navActivitySearchRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.$r8$lambda$5pjmYJ4zOycVGPqVNjdokAcMDY0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchActivityLedgerItems$activity_prodRelease$default(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
        int i2 = 1;
        if ((i & 1) != 0) {
            activityFilterType = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, i2, 0 == true ? 1 : 0);
        }
        activityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease(activityFilterType);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> emptyUIStateFlow$activity_prodRelease() {
        com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState value = getLedgerScreenState$activity_prodRelease().getValue();
        if (value instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
            return this.getHighSpeedVideoFpsRanges.getShowEmptyUIContent$activity_prodRelease();
        }
        if (value instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) {
            return this.Camera2StreamConfigurationMap.getShowEmptyUIContent$activity_prodRelease();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void validateAndUpdateEmptyStateIfRequired$activity_prodRelease(java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> items, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState currentScreenState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentScreenState, "");
        boolean z = false;
        int i = 1;
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (currentScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) currentScreenState).getActivityFilterType(), new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(str, i, objArr3 == true ? 1 : 0));
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showEmptyUIContent$activity_prodRelease = this.getHighSpeedVideoFpsRanges.getShowEmptyUIContent$activity_prodRelease();
            if (areEqual && items.isEmpty()) {
                z = true;
            }
            showEmptyUIContent$activity_prodRelease.setValue(java.lang.Boolean.valueOf(z));
            return;
        }
        if (!(currentScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) currentScreenState).getActivityFilterType(), new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showEmptyUIContent$activity_prodRelease2 = this.Camera2StreamConfigurationMap.getShowEmptyUIContent$activity_prodRelease();
        if (!areEqual2 && com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.shouldShowFilterEmptyState(items)) {
            z = true;
        }
        showEmptyUIContent$activity_prodRelease2.setValue(java.lang.Boolean.valueOf(z));
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getNextPageCursor() {
        com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState value = getLedgerScreenState$activity_prodRelease().getValue();
        if (value instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
            return this.getHighSpeedVideoFpsRanges.getNextPageCursor$activity_prodRelease();
        }
        if (value instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) {
            return this.Camera2StreamConfigurationMap.getNextPageCursor$activity_prodRelease();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void invokeAction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        com.paypal.oslo.core.navigation.AppNavigator navigator;
        if (activityActionModel == null) {
            activityActionModel = activityTransactionModel != null ? com.paypal.oslo.feature.activity.domain.ledger.models.extension.ActivityTransactionModelExtensionsKt.toUPRActionModel(activityTransactionModel) : null;
        }
        if (activityActionModel != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1(this, activityActionModel, null), 3, null);
            return;
        }
        final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey activityDetailDestinationKey = activityTransactionModel != null ? com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toActivityDetailDestinationKey(activityTransactionModel, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_LEDGER) : null;
        if (activityDetailDestinationKey == null || (navigator = getGetHighResolutionOutputSizeshNQ4ISI().getNavigator()) == null) {
            return;
        }
        navigator.m11575navigateForResultInternaluBl809w(this.navActivityDetailRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.$r8$lambda$FWfEXrno7mG1CD5P6RZ_NvKgufQ(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateByNavigationType-VU73JmE$activity_prodRelease$default, reason: not valid java name */
    public static /* synthetic */ void m11865navigateByNavigationTypeVU73JmE$activity_prodRelease$default(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        activityLedgerViewModel.m11869navigateByNavigationTypeVU73JmE$activity_prodRelease(transactionTileNavigationTypes, str);
    }

    /* renamed from: navigateByNavigationType-VU73JmE$activity_prodRelease, reason: not valid java name */
    public final void m11869navigateByNavigationTypeVU73JmE$activity_prodRelease(com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes transactionTileNavigationTypes, java.lang.String navResultRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTileNavigationTypes, "");
        this.getOutputFormats.m11790invokeVU73JmE(transactionTileNavigationTypes, navResultRequestId);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5pjmYJ4zOycVGPqVNjdokAcMDY0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FWfEXrno7mG1CD5P6RZ_NvKgufQ(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(payPalActivityTransactionDetailScreenDestinationKey);
        return kotlin.Unit.INSTANCE;
    }

    public final void fetchActivityLedgerItems$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        this.getInputFormats.setValue(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading.INSTANCE);
        this.getOutputSizeshNQ4ISI.reset();
        resetActivityLazyPaginationAndScrollState$activity_prodRelease();
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1(this, activityFilterType, null), 3, null);
        this.getOutputMinFrameDuration = launch$default;
    }
}
