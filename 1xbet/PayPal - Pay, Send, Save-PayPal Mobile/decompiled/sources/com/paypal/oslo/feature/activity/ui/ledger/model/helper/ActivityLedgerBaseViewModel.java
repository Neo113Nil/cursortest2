package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00152\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0000¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010\"R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\"\u00106\u001a\u0002058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0018\u00010<8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR&\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020F0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010GR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010KR \u0010L\u001a\b\u0012\u0004\u0012\u00020F0<8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010BR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u00103R\"\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010K"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityLedgerBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;", "packageTrackingEmailLinkStatusUseCase", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerReducer;", "activityLedgerReducer", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerReducer;)V", "Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "deepLinkPayLoad$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "deepLinkPayLoad", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "getInitialState$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "event", "", "processEvent$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "logException$activity_prodRelease", "(Ljava/lang/Exception;)V", "ledgerScreenState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "getEmptyStateModel$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "initUserProfileInfo$activity_prodRelease", "()V", "fetchPackageTrackingEmailLinkStatus$activity_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshEmailLinkStatus$activity_prodRelease", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getPackageTrackingEmailLinkStatus$activity_prodRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "resetActivityLazyPaginationAndScrollState$activity_prodRelease", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;", "emailLinkStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getEmailLinkStatus$activity_prodRelease", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;", "savedScrollState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;", "getSavedScrollState$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;", "setSavedScrollState$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "activityItemsPaginationDataFlow", "Lkotlinx/coroutines/flow/Flow;", "getActivityItemsPaginationDataFlow$activity_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "setActivityItemsPaginationDataFlow$activity_prodRelease", "(Lkotlinx/coroutines/flow/Flow;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getLedgerScreenState$activity_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "ledgerScreenUIEffect", "getLedgerScreenUIEffect$activity_prodRelease", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityUserProfile;", "getHighSpeedVideoSizes", "userProfileInfo", "getUserProfileInfo$activity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ActivityLedgerBaseViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getHighSpeedVideoFpsRangesFor;
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> activityItemsPaginationDataFlow;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> emailLinkStatus;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState> ledgerScreenState;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect> ledgerScreenUIEffect;
    private com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState savedScrollState;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile> userProfileInfo;

    @javax.inject.Inject
    public ActivityLedgerBaseViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer activityLedgerReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPackageTrackingEmailLinkStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighSpeedVideoFpsRangesFor = getPackageTrackingEmailLinkStatusUseCase;
        this.emailLinkStatus = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.savedScrollState = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState(0, 0, 3, null);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ActivityLedgerViewModel.store", getInitialState$activity_prodRelease(deepLinkPayLoad$activity_prodRelease()), activityLedgerReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.ledgerScreenState = mviStateStore.getUiState();
        this.ledgerScreenUIEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.userProfileInfo = MutableStateFlow;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getEmailLinkStatus$activity_prodRelease() {
        return this.emailLinkStatus;
    }

    /* renamed from: getSavedScrollState$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState getSavedScrollState() {
        return this.savedScrollState;
    }

    public final void setSavedScrollState$activity_prodRelease(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState activityScrollState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityScrollState, "");
        this.savedScrollState = activityScrollState;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> getActivityItemsPaginationDataFlow$activity_prodRelease() {
        return this.activityItemsPaginationDataFlow;
    }

    public final void setActivityItemsPaginationDataFlow$activity_prodRelease(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> flow) {
        this.activityItemsPaginationDataFlow = flow;
    }

    public final com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto deepLinkPayLoad$activity_prodRelease() {
        java.util.List<androidx.navigation3.runtime.NavKey> backStack;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object obj = (appNavigator == null || (backStack = appNavigator.getBackStack()) == null) ? null : (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) backStack);
        return com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toActivityLedgerDeepLinkDto(obj instanceof com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey ? (com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey) obj : null);
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState getInitialState$activity_prodRelease(com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto deepLinkPayLoad) {
        java.lang.String obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkPayLoad, "");
        java.lang.String startDate = deepLinkPayLoad.getStartDate();
        java.lang.String str = (startDate == null || (obj2 = kotlin.text.StringsKt.trim(startDate).toString()) == null || kotlin.text.StringsKt.isBlank(obj2)) ? null : obj2;
        java.lang.String endDate = deepLinkPayLoad.getEndDate();
        java.lang.String str2 = (endDate == null || (obj = kotlin.text.StringsKt.trim(endDate).toString()) == null || kotlin.text.StringsKt.isBlank(obj)) ? null : obj;
        if ((str != null || str2 != null) && !kotlin.text.StringsKt.equals(str, str2, true)) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState(new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange(null, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel("", "", false, str, str2, false, 36, null), 1, null));
        }
        return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState(new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState> getLedgerScreenState$activity_prodRelease() {
        return this.ledgerScreenState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect> getLedgerScreenUIEffect$activity_prodRelease() {
        return this.ledgerScreenUIEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.common.models.ActivityUserProfile> getUserProfileInfo$activity_prodRelease() {
        return this.userProfileInfo;
    }

    public final void processEvent$activity_prodRelease(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }

    public final void logException$activity_prodRelease(java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.activity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchActivityLedgerItems");
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, exception.getClass().getSimpleName());
        java.lang.String message = exception.getMessage();
        pairArr[2] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(exception));
        com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_FETCH_LEDGER_ITEMS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel getEmptyStateModel$activity_prodRelease(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState ledgerScreenState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ledgerScreenState, "");
        if (ledgerScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
            return com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModelFactory.INSTANCE.createDefaultEmptyStateModel$activity_prodRelease();
        }
        if (!(ledgerScreenState instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModelFactory.INSTANCE.createFilterEmptyStateModel$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) ledgerScreenState).getActivityFilterType());
    }

    public final void initUserProfileInfo$activity_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$initUserProfileInfo$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPackageTrackingEmailLinkStatus$activity_prodRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1 activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1) {
            activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1 = (com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1) continuation;
            if ((activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRanges;
                boolean z = false;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    ?? r6 = this.emailLinkStatus.getValue() == null ? 1 : 0;
                    com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase = this.getHighSpeedVideoFpsRangesFor;
                    activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRangesFor = r6;
                    activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getPackageTrackingEmailLinkStatusUseCase.invoke(r6, activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo) it.next()).isLinked()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    this.emailLinkStatus.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logPackageTrackingLinkStatus$activity_prodRelease("fetchPackageTrackingEmailLinkStatus", ((java.lang.Exception) ((arrow.core.Either.Left) either).getValue()).getMessage());
                    this.emailLinkStatus.setValue(null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1 = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1(this, continuation);
        java.lang.Object obj2 = activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1.getHighSpeedVideoFpsRanges;
        boolean z2 = false;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void refreshEmailLinkStatus$activity_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$refreshEmailLinkStatus$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getPackageTrackingEmailLinkStatus$activity_prodRelease() {
        return this.emailLinkStatus;
    }

    public final void resetActivityLazyPaginationAndScrollState$activity_prodRelease() {
        this.savedScrollState = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState(0, 0, 3, null);
        this.activityItemsPaginationDataFlow = null;
    }
}
