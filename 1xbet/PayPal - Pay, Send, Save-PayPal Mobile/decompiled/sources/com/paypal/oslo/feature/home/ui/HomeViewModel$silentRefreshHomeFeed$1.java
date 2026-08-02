package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.HomeViewModel$silentRefreshHomeFeed$1", f = "HomeViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {"currentSections"}, nl = {473}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class HomeViewModel$silentRefreshHomeFeed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeUiState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.HomeViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase refreshHomeFeedSectionsUseCase;
        java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.home.ui.mvi.HomeUiState homeUiState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections = homeUiState instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success ? ((com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success) homeUiState).getSections() : kotlin.collections.CollectionsKt.emptyList();
            refreshHomeFeedSectionsUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = sections;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object invoke = refreshHomeFeedSectionsUseCase.invoke(this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = sections;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.home.ui.HomeViewModel homeViewModel = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Silent refresh failed, keeping current content", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", ((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString())), null, 4, null);
        } else if (ior instanceof arrow.core.Ior.Right) {
            java.util.List list2 = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Silent refresh succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sectionCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list2.size()))), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded(com.paypal.oslo.feature.home.ui.HomeViewModel.access$mergeWithExistingAccountSnapshot(homeViewModel, com.paypal.oslo.feature.home.ui.HomeViewModel.access$getLatestSections(homeViewModel, list), list2), homeViewModel.getHighSpeedVideoFpsRanges.isHomeHapticFeedbackEnabled()));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            java.util.List list3 = (java.util.List) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Silent refresh partially succeeded", null, null, 6, null);
            function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded(com.paypal.oslo.feature.home.ui.HomeViewModel.access$mergeWithExistingAccountSnapshot(homeViewModel, com.paypal.oslo.feature.home.ui.HomeViewModel.access$getLatestSections(homeViewModel, list), list3), homeViewModel.getHighSpeedVideoFpsRanges.isHomeHapticFeedbackEnabled()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.home.ui.HomeViewModel$silentRefreshHomeFeed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.HomeViewModel$silentRefreshHomeFeed$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeViewModel$silentRefreshHomeFeed$1(com.paypal.oslo.feature.home.ui.mvi.HomeUiState homeUiState, com.paypal.oslo.feature.home.ui.HomeViewModel homeViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.HomeViewModel$silentRefreshHomeFeed$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = homeUiState;
        this.getHighSpeedVideoFpsRangesFor = homeViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
