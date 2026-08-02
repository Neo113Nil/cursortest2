package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/InitializeActivityHubMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesOverviewUseCase;", "getActivitiesOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubSectionMapper;", "sectionMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesOverviewUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubSectionMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesOverviewUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubSectionMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InitializeActivityHubMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public InitializeActivityHubMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase getFinancialActivitiesOverviewUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFinancialActivitiesOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubSectionMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getFinancialActivitiesOverviewUseCase;
        this.getHighSpeedVideoFpsRanges = activityHubSectionMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(activityState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) activityState).getArgs(), function1, continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        if (!(activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading) activityState).getArgs(), function1, continuation);
        if (highSpeedVideoSizes != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            highSpeedVideoSizes = kotlin.Unit.INSTANCE;
        }
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (getHighSpeedVideoSizes(r1, r2, r4) != r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$handleLoading$1 initializeActivityHubMiddleware$handleLoading$1;
        int i;
        java.lang.Object mapUpcomingSection;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus;
        int i2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState;
        java.lang.Object mapPendingSection;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function13;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus2;
        java.lang.Object mapCompletedSection;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState2;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs3;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs4 = activityHubArgs;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function14 = function1;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$handleLoading$1) {
            initializeActivityHubMiddleware$handleLoading$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$handleLoading$1) continuation;
            if ((initializeActivityHubMiddleware$handleLoading$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                initializeActivityHubMiddleware$handleLoading$1.getInputFormats -= 2147483648;
                java.lang.Object obj = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeActivityHubMiddleware$handleLoading$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i3 = (activityHubArgs.getPayments() == null || activityHubArgs.getActivities() == null || activityHubArgs.getCustomerServiceContact() == null) ? 1 : 0;
                    if (i3 != 0) {
                        initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityHubArgs);
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i3;
                        initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 1;
                    } else {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus fromActivities = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus.INSTANCE.fromActivities(activityHubArgs.getActivities());
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper = this.getHighSpeedVideoFpsRanges;
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> payments = activityHubArgs.getPayments();
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = activityHubArgs.getCpi();
                        initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = activityHubArgs4;
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes = fromActivities;
                        initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI = function14;
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i3;
                        initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 2;
                        mapUpcomingSection = activityHubSectionMapper.mapUpcomingSection(payments, cpi, initializeActivityHubMiddleware$handleLoading$1);
                        if (mapUpcomingSection != coroutine_suspended) {
                            financialActivitiesByStatus = fromActivities;
                            i2 = i3;
                            function12 = function14;
                            activitySectionUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) mapUpcomingSection;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper2 = this.getHighSpeedVideoFpsRanges;
                            if (financialActivitiesByStatus == null) {
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi2 = activityHubArgs4.getCpi();
                            initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = activityHubArgs4;
                            initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                            initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes = financialActivitiesByStatus;
                            initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI = activitySectionUiState;
                            initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration = function12;
                            initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i2;
                            initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 3;
                            mapPendingSection = activityHubSectionMapper2.mapPendingSection(r13, cpi2, initializeActivityHubMiddleware$handleLoading$1);
                            if (mapPendingSection != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    int i4 = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    int i5 = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function15 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs5 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i5;
                    activityHubArgs4 = activityHubArgs5;
                    financialActivitiesByStatus = financialActivitiesByStatus3;
                    function12 = function15;
                    function14 = function16;
                    mapUpcomingSection = obj;
                    activitySectionUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) mapUpcomingSection;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper22 = this.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> pending = financialActivitiesByStatus == null ? financialActivitiesByStatus.getPending() : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi22 = activityHubArgs4.getCpi();
                    initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = activityHubArgs4;
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes = financialActivitiesByStatus;
                    initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI = activitySectionUiState;
                    initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration = function12;
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i2;
                    initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 3;
                    mapPendingSection = activityHubSectionMapper22.mapPendingSection(pending, cpi22, initializeActivityHubMiddleware$handleLoading$1);
                    if (mapPendingSection != coroutine_suspended) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus4 = financialActivitiesByStatus;
                        activityHubArgs2 = activityHubArgs4;
                        function13 = function12;
                        obj = mapPendingSection;
                        financialActivitiesByStatus2 = financialActivitiesByStatus4;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper3 = this.getHighSpeedVideoFpsRanges;
                        if (financialActivitiesByStatus2 != null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi3 = activityHubArgs2.getCpi();
                        initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = activityHubArgs2;
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus2);
                        initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI = activitySectionUiState;
                        initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration = activitySectionUiState3;
                        initializeActivityHubMiddleware$handleLoading$1.getInputSizeshNQ4ISI = function13;
                        initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i2;
                        initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 4;
                        mapCompletedSection = activityHubSectionMapper3.mapCompletedSection(r7, cpi3, initializeActivityHubMiddleware$handleLoading$1);
                        if (mapCompletedSection != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    int i6 = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function17 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI;
                    financialActivitiesByStatus2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function18 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges;
                    activityHubArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = i6;
                    function13 = function17;
                    function14 = function18;
                    activitySectionUiState = activitySectionUiState4;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper32 = this.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> completed = financialActivitiesByStatus2 != null ? financialActivitiesByStatus2.getCompleted() : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi32 = activityHubArgs2.getCpi();
                    initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap = activityHubArgs2;
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus2);
                    initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI = activitySectionUiState;
                    initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration = activitySectionUiState32;
                    initializeActivityHubMiddleware$handleLoading$1.getInputSizeshNQ4ISI = function13;
                    initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor = i2;
                    initializeActivityHubMiddleware$handleLoading$1.getInputFormats = 4;
                    mapCompletedSection = activityHubSectionMapper32.mapCompletedSection(completed, cpi32, initializeActivityHubMiddleware$handleLoading$1);
                    if (mapCompletedSection != coroutine_suspended) {
                        activitySectionUiState2 = activitySectionUiState32;
                        activityHubArgs3 = activityHubArgs2;
                        obj = mapCompletedSection;
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoFpsRangesFor;
                function13 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$handleLoading$1.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$handleLoading$1.getOutputMinFrameDuration;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$handleLoading$1.getHighResolutionOutputSizeshNQ4ISI;
                activityHubArgs3 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$handleLoading$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                activitySectionUiState = activitySectionUiState6;
                activitySectionUiState2 = activitySectionUiState5;
                function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview(activityHubArgs3.getCustomerServiceContact(), activitySectionUiState, activitySectionUiState2, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj, activityHubArgs3.getHasMoreActivities(), activityHubArgs3.getNextActivitiesOffset()));
                return kotlin.Unit.INSTANCE;
            }
        }
        initializeActivityHubMiddleware$handleLoading$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$handleLoading$1(this, continuation);
        java.lang.Object obj2 = initializeActivityHubMiddleware$handleLoading$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeActivityHubMiddleware$handleLoading$1.getInputFormats;
        if (i != 0) {
        }
        function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview(activityHubArgs3.getCustomerServiceContact(), activitySectionUiState, activitySectionUiState2, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj2, activityHubArgs3.getHasMoreActivities(), activityHubArgs3.getNextActivitiesOffset()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$loadActivitiesOverview$1 initializeActivityHubMiddleware$loadActivitiesOverview$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function12;
        arrow.core.Either either;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview financialActivitiesOverview;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs3;
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function13;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus;
        arrow.core.Either either2;
        java.lang.Object mapPendingSection;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs4;
        int i4;
        int i5;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview financialActivitiesOverview2;
        java.lang.Object mapCompletedSection;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$loadActivitiesOverview$1) {
            initializeActivityHubMiddleware$loadActivitiesOverview$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$loadActivitiesOverview$1) continuation;
            if ((initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    activitiesOverviewRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest(activityHubArgs.getCpi(), activityHubArgs.getCreditAccountId());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase getFinancialActivitiesOverviewUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    activityHubArgs2 = activityHubArgs;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = activityHubArgs2;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = function1;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 1;
                    obj = getFinancialActivitiesOverviewUseCase.invoke2(activitiesOverviewRequest, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>>) initializeActivityHubMiddleware$loadActivitiesOverview$1);
                    if (obj != coroutine_suspended) {
                        function12 = function1;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        i3 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes;
                        int i6 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges;
                        function12 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration;
                        financialActivitiesByStatus = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI;
                        financialActivitiesOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview) initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats;
                        either2 = (arrow.core.Either) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor;
                        activitiesOverviewRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor;
                        function13 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap;
                        activityHubArgs3 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i6;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper = this.getHighSpeedVideoFpsRanges;
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> pending = financialActivitiesByStatus == null ? financialActivitiesByStatus.getPending() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = activityHubArgs3.getCpi();
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = activityHubArgs3;
                        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs5 = activityHubArgs3;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest2);
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats = financialActivitiesOverview;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI = financialActivitiesByStatus;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration = function12;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats = activitySectionUiState3;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges = i2;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes = i3;
                        initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 3;
                        mapPendingSection = activityHubSectionMapper.mapPendingSection(pending, cpi, initializeActivityHubMiddleware$loadActivitiesOverview$1);
                        if (mapPendingSection != coroutine_suspended) {
                            activityHubArgs4 = activityHubArgs5;
                            i4 = i2;
                            i5 = i3;
                            activitySectionUiState = activitySectionUiState3;
                            obj = mapPendingSection;
                            financialActivitiesOverview2 = financialActivitiesOverview;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper2 = this.getHighSpeedVideoFpsRanges;
                            if (financialActivitiesByStatus == null) {
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi2 = activityHubArgs4.getCpi();
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityHubArgs4);
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest2);
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats = financialActivitiesOverview2;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus);
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration = function12;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats = activitySectionUiState;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputStallDurationlomOqCM = activitySectionUiState4;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges = i4;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes = i5;
                            initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 4;
                            mapCompletedSection = activityHubSectionMapper2.mapCompletedSection(r11, cpi2, initializeActivityHubMiddleware$loadActivitiesOverview$1);
                            if (mapCompletedSection != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes;
                        int i8 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputStallDurationlomOqCM;
                        activitySectionUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats;
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function14 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration;
                        financialActivitiesOverview2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview) initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12 = function14;
                        activitySectionUiState2 = activitySectionUiState5;
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview(financialActivitiesOverview2.getServicingContact(), activitySectionUiState, activitySectionUiState2, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj, financialActivitiesOverview2.getHasNextPage(), financialActivitiesOverview2.getNextOffset()));
                        return kotlin.Unit.INSTANCE;
                    }
                    int i9 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes;
                    i4 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats;
                    function12 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration;
                    financialActivitiesByStatus = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI;
                    financialActivitiesOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview) initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats;
                    either2 = (arrow.core.Either) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor;
                    activitiesOverviewRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor;
                    function13 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap;
                    activityHubArgs4 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i5 = i9;
                    activitySectionUiState = activitySectionUiState6;
                    financialActivitiesOverview2 = financialActivitiesOverview;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState42 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper22 = this.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> completed = financialActivitiesByStatus == null ? financialActivitiesByStatus.getCompleted() : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi22 = activityHubArgs4.getCpi();
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityHubArgs4);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest2);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats = financialActivitiesOverview2;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration = function12;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats = activitySectionUiState;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputStallDurationlomOqCM = activitySectionUiState42;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges = i4;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes = i5;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 4;
                    mapCompletedSection = activityHubSectionMapper22.mapCompletedSection(completed, cpi22, initializeActivityHubMiddleware$loadActivitiesOverview$1);
                    if (mapCompletedSection != coroutine_suspended) {
                        activitySectionUiState2 = activitySectionUiState42;
                        obj = mapCompletedSection;
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview(financialActivitiesOverview2.getServicingContact(), activitySectionUiState, activitySectionUiState2, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj, financialActivitiesOverview2.getHasNextPage(), financialActivitiesOverview2.getNextOffset()));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor;
                function12 = (kotlin.jvm.functions.Function1) initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs6 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                activitiesOverviewRequest = activitiesOverviewRequest3;
                activityHubArgs2 = activityHubArgs6;
                either = ((arrow.core.Ior) obj).toEither();
                if (either instanceof arrow.core.Either.Right) {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function12.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesAndPaymentsFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                financialActivitiesOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview) ((arrow.core.Either.Right) either).getValue();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus fromActivities = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus.INSTANCE.fromActivities(financialActivitiesOverview.getCreditActivities());
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper3 = this.getHighSpeedVideoFpsRanges;
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repaymentActivity = financialActivitiesOverview.getRepaymentActivity();
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi3 = activityHubArgs2.getCpi();
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = activityHubArgs2;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest);
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats = financialActivitiesOverview;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI = fromActivities;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration = function12;
                i2 = 0;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges = 0;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes = 0;
                initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 2;
                java.lang.Object mapUpcomingSection = activityHubSectionMapper3.mapUpcomingSection(repaymentActivity, cpi3, initializeActivityHubMiddleware$loadActivitiesOverview$1);
                if (mapUpcomingSection != coroutine_suspended) {
                    activityHubArgs3 = activityHubArgs2;
                    i3 = 0;
                    function13 = function12;
                    activitiesOverviewRequest2 = activitiesOverviewRequest;
                    financialActivitiesByStatus = fromActivities;
                    either2 = either;
                    obj = mapUpcomingSection;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper4 = this.getHighSpeedVideoFpsRanges;
                    if (financialActivitiesByStatus == null) {
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi4 = activityHubArgs3.getCpi();
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighResolutionOutputSizeshNQ4ISI = activityHubArgs3;
                    com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs52 = activityHubArgs3;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesOverviewRequest2);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputFormats = financialActivitiesOverview;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getInputSizeshNQ4ISI = financialActivitiesByStatus;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDuration = function12;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputFormats = activitySectionUiState32;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoFpsRanges = i2;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getHighSpeedVideoSizes = i3;
                    initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM = 3;
                    mapPendingSection = activityHubSectionMapper4.mapPendingSection(pending, cpi4, initializeActivityHubMiddleware$loadActivitiesOverview$1);
                    if (mapPendingSection != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        initializeActivityHubMiddleware$loadActivitiesOverview$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$loadActivitiesOverview$1(this, continuation);
        java.lang.Object obj2 = initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeActivityHubMiddleware$loadActivitiesOverview$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    public static final /* synthetic */ java.lang.Object access$handleReloading(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware initializeActivityHubMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading reloading, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        java.lang.Object highSpeedVideoSizes = initializeActivityHubMiddleware.getHighSpeedVideoSizes(reloading.getArgs(), function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }
}
