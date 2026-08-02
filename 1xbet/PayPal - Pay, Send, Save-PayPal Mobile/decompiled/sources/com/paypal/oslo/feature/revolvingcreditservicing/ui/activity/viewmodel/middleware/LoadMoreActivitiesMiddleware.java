package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/LoadMoreActivitiesMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesUseCase;", "getActivitiesPage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "uiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Ready;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState$Ready;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "", "", "p2", "p3", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/activities/GetFinancialActivitiesUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoadMoreActivitiesMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LoadMoreActivitiesMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase getFinancialActivitiesUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFinancialActivitiesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubTransactionItemUiModelMapper, "");
        this.getHighSpeedVideoSizes = getFinancialActivitiesUseCase;
        this.Camera2StreamConfigurationMap = activityHubTransactionItemUiModelMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(activityState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready) activityState, function1, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready ready, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel paginationState = ready.getUiModel().getPaginationState();
        if (!(paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore)) {
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs args = ready.getArgs();
        return (args.getCpi() != null && (highSpeedVideoSizes = getHighSpeedVideoSizes(args.getCpi(), args.getCreditAccountId(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore) paginationState).getNextOffset().intValue(), function1, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware$loadNextActivityPage$1 loadMoreActivitiesMiddleware$loadNextActivityPage$1;
        int i2;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest;
        arrow.core.Either either;
        int i3;
        java.lang.Object mapList;
        java.util.Locale locale;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.String str3;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivitiesPage;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function13;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = creditProductIdentifier;
        int i6 = i;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function14 = function1;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware$loadNextActivityPage$1) {
            loadMoreActivitiesMiddleware$loadNextActivityPage$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware$loadNextActivityPage$1) continuation;
            if ((loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    function14.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadingMoreActivities.INSTANCE);
                    str2 = str;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest(creditProductIdentifier3, str2, i6);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase getFinancialActivitiesUseCase = this.getHighSpeedVideoSizes;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap = creditProductIdentifier3;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats = function14;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesRequest2);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges = i6;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration = 1;
                    java.lang.Object invoke2 = getFinancialActivitiesUseCase.invoke2(activitiesRequest2, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage>>) loadMoreActivitiesMiddleware$loadNextActivityPage$1);
                    if (invoke2 != coroutine_suspended) {
                        activitiesRequest = activitiesRequest2;
                        obj = invoke2;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizes;
                        int i8 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i9 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges;
                        list = (java.util.List) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizes;
                        function13 = (kotlin.jvm.functions.Function1) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizeshNQ4ISI;
                        financialActivitiesPage = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnAddingMoreActivities(list, (java.util.List) obj, financialActivitiesPage.getHasNextPage(), financialActivitiesPage.getNextOffset()));
                        return kotlin.Unit.INSTANCE;
                    }
                    i4 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizes;
                    int i10 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function15 = (kotlin.jvm.functions.Function1) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizeshNQ4ISI;
                    locale = (java.util.Locale) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus financialActivitiesByStatus2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivitiesPage2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputFormats;
                    either = (arrow.core.Either) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizesFor;
                    activitiesRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats;
                    str3 = (java.lang.String) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i10;
                    function13 = function15;
                    function12 = function16;
                    i5 = i11;
                    financialActivitiesPage = financialActivitiesPage2;
                    financialActivitiesByStatus = financialActivitiesByStatus2;
                    creditProductIdentifier2 = creditProductIdentifier4;
                    mapList = obj;
                    java.util.List list2 = (java.util.List) mapList;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper = this.Camera2StreamConfigurationMap;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> completed = financialActivitiesByStatus == null ? financialActivitiesByStatus.getCompleted() : null;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesRequest);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputFormats = financialActivitiesPage;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizeshNQ4ISI = function13;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizes = list2;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges = i5;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizes = i4;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration = 3;
                    obj = activityHubTransactionItemUiModelMapper.mapList(completed, true, locale, loadMoreActivitiesMiddleware$loadNextActivityPage$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                    function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnAddingMoreActivities(list, (java.util.List) obj, financialActivitiesPage.getHasNextPage(), financialActivitiesPage.getNextOffset()));
                    return kotlin.Unit.INSTANCE;
                }
                int i12 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration;
                function14 = (kotlin.jvm.functions.Function1) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats;
                str2 = (java.lang.String) loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                activitiesRequest = activitiesRequest3;
                i6 = i12;
                creditProductIdentifier3 = creditProductIdentifier5;
                either = ((arrow.core.Ior) obj).toEither();
                i3 = 0;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivitiesPage3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus fromActivities = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesByStatus.INSTANCE.fromActivities(financialActivitiesPage3.getCreditActivities());
                    java.util.Locale locale2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier3);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper2 = this.Camera2StreamConfigurationMap;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> pending = fromActivities != null ? fromActivities.getPending() : null;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesRequest);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputFormats = financialActivitiesPage3;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputSizeshNQ4ISI = fromActivities;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDurationlomOqCM = locale2;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizeshNQ4ISI = function14;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges = i6;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizes = 0;
                    loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration = 2;
                    mapList = activityHubTransactionItemUiModelMapper2.mapList(pending, true, locale2, loadMoreActivitiesMiddleware$loadNextActivityPage$1);
                    if (mapList != coroutine_suspended) {
                        locale = locale2;
                        financialActivitiesByStatus = fromActivities;
                        creditProductIdentifier2 = creditProductIdentifier3;
                        str3 = str2;
                        i4 = 0;
                        function12 = function14;
                        financialActivitiesPage = financialActivitiesPage3;
                        i5 = i6;
                        function13 = function12;
                        java.util.List list22 = (java.util.List) mapList;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper3 = this.Camera2StreamConfigurationMap;
                        if (financialActivitiesByStatus == null) {
                        }
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitiesRequest);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputFormats = financialActivitiesPage;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialActivitiesByStatus);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizeshNQ4ISI = function13;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputSizes = list22;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoFpsRanges = i5;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getHighSpeedVideoSizes = i4;
                        loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration = 3;
                        obj = activityHubTransactionItemUiModelMapper3.mapList(completed, true, locale, loadMoreActivitiesMiddleware$loadNextActivityPage$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError financialActivitiesRequestError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("nextOffset", kotlin.coroutines.jvm.internal.Boxing.boxInt(i6));
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(financialActivitiesRequestError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
                    com.paypal.android.logger.Logger.e$default(logger, "Failed to load more activities", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                    function14.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadingMoreActivitiesFailed(i6));
                    return kotlin.Unit.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        loadMoreActivitiesMiddleware$loadNextActivityPage$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware$loadNextActivityPage$1(this, continuation);
        java.lang.Object obj2 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = loadMoreActivitiesMiddleware$loadNextActivityPage$1.getOutputStallDuration;
        if (i2 != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        i3 = 0;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
