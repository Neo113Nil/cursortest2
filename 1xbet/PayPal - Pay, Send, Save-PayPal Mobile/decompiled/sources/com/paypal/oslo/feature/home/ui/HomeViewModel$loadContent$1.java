package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.HomeViewModel$loadContent$1", f = "HomeViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {}, nl = {473}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class HomeViewModel$loadContent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.HomeViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase getHomeFeedSectionsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Loading home feed content", null, null, 6, null);
            getHomeFeedSectionsUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = getHomeFeedSectionsUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.home.ui.HomeViewModel homeViewModel = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Failed to load home feed content", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed("Failed to load content. Please try again."));
        } else if (ior instanceof arrow.core.Ior.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Home feed loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sectionCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded(list, homeViewModel.getHighSpeedVideoFpsRanges.isHomeHapticFeedbackEnabled()));
            com.paypal.oslo.feature.home.ui.HomeViewModel.access$restoreScrollPosition(homeViewModel, function1);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            java.util.List list2 = (java.util.List) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Partial success loading home feed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) leftValue).getClass()).getSimpleName())), null, 4, null);
            function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded(list2, homeViewModel.getHighSpeedVideoFpsRanges.isHomeHapticFeedbackEnabled()));
            com.paypal.oslo.feature.home.ui.HomeViewModel.access$restoreScrollPosition(homeViewModel, function1);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.home.ui.HomeViewModel$loadContent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.HomeViewModel$loadContent$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeViewModel$loadContent$1(com.paypal.oslo.feature.home.ui.HomeViewModel homeViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.HomeViewModel$loadContent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = homeViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
