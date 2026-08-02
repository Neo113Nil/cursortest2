package com.paypal.oslo.feature.activity.ui.search.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$special$$inlined$flatMapLatest$1", f = "ActivitySearchViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
public final class ActivitySearchViewModel$special$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>>, kotlin.Pair<? extends java.lang.String, ? extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow2;
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$special$$inlined$flatMapLatest$1 activitySearchViewModel$special$$inlined$flatMapLatest$1 = this;
            kotlin.Pair pair = (kotlin.Pair) obj2;
            java.lang.String str = (java.lang.String) pair.component1();
            com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType = (com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType) pair.component2();
            boolean z = str.length() >= 3;
            boolean z2 = activitySearchFilterType != null;
            if (z || z2) {
                mutableStateFlow = this.Camera2StreamConfigurationMap.getInputFormats;
                mutableStateFlow.setValue(null);
                com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activitySearchInputQueryType$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchFiltersInputProvider.INSTANCE.getActivitySearchInputQueryType$activity_prodRelease(str, activitySearchFilterType);
                activityLedgerUserActivitiesPaginationUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getInputFormats;
                invoke = activityLedgerUserActivitiesPaginationUseCase.invoke(mutableStateFlow2, activitySearchInputQueryType$activity_prodRelease);
            } else {
                invoke = kotlinx.coroutines.flow.FlowKt.flowOf(androidx.paging.PagingData.INSTANCE.empty());
            }
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, invoke, activitySearchViewModel$special$$inlined$flatMapLatest$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> flowCollector, kotlin.Pair<? extends java.lang.String, ? extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$special$$inlined$flatMapLatest$1 activitySearchViewModel$special$$inlined$flatMapLatest$1 = new com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$special$$inlined$flatMapLatest$1(continuation, this.Camera2StreamConfigurationMap);
        activitySearchViewModel$special$$inlined$flatMapLatest$1.getHighSpeedVideoFpsRanges = flowCollector;
        activitySearchViewModel$special$$inlined$flatMapLatest$1.getHighResolutionOutputSizeshNQ4ISI = pair;
        return activitySearchViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySearchViewModel$special$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = activitySearchViewModel;
    }
}
