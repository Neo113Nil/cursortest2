package com.paypal.oslo.feature.activity.ui.search.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$fetchSuggestions$1", f = "ActivitySearchViewModel.kt", i = {1}, l = {143, 148}, m = "invokeSuspend", n = {"input"}, nl = {144, 149}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivitySearchViewModel$fetchSuggestions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(300, r7) != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[Catch: Exception -> 0x00a1, CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, Exception -> 0x00a1, blocks: (B:7:0x0016, B:8:0x006a, B:10:0x0074, B:11:0x0097, B:15:0x0084, B:17:0x0088, B:18:0x009b, B:19:0x00a0, B:24:0x0041), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: Exception -> 0x00a1, CancellationException -> 0x00d3, TryCatch #2 {CancellationException -> 0x00d3, Exception -> 0x00a1, blocks: (B:7:0x0016, B:8:0x006a, B:10:0x0074, B:11:0x0097, B:15:0x0084, B:17:0x0088, B:18:0x009b, B:19:0x00a0, B:24:0x0041), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase activitySuggestionUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        arrow.core.Either either;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logActivitySearchSuggestionsException$activity_prodRelease("fetchActivitySearchSuggestions", e2);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = "Failed to fetch search suggestions";
            }
            mutableStateFlow.setValue(new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toErrorUIModel(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(message, null, 2, null)), 1, null)));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow4 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue());
                } else if (either instanceof arrow.core.Either.Left) {
                    obj2 = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) ((arrow.core.Either.Left) either).getValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                mutableStateFlow4.setValue(obj2);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
        mutableStateFlow2.setValue(this.getHighSpeedVideoFpsRanges);
        com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput searchSuggestionSearchInput$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchFiltersInputProvider.INSTANCE.getSearchSuggestionSearchInput$activity_prodRelease(this.getHighSpeedVideoFpsRanges);
        mutableStateFlow3 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
        activitySuggestionUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchSuggestionSearchInput$activity_prodRelease);
        this.getHighSpeedVideoSizes = mutableStateFlow3;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = activitySuggestionUseCase.invoke(searchSuggestionSearchInput$activity_prodRelease, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableStateFlow4 = mutableStateFlow3;
        either = ((arrow.core.Ior) obj).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        mutableStateFlow4.setValue(obj2);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$fetchSuggestions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$fetchSuggestions$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivitySearchViewModel$fetchSuggestions$1(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel$fetchSuggestions$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = activitySearchViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
