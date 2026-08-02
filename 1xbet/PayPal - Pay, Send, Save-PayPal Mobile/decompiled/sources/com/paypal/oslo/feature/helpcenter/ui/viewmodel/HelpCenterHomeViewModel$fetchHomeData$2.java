package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel$fetchHomeData$2", f = "HelpCenterHomeViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, nl = {72}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class HelpCenterHomeViewModel$fetchHomeData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure failure;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fetchRecommendedArticlesUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                obj = fetchRecommendedArticlesUseCase.invoke(this);
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
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Fetch articles result received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isBoth", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(ior.isBoth()))), null, 4, null);
            if (ior.isBoth()) {
                java.lang.Object leftOrNull = ior.leftOrNull();
                if (leftOrNull == null) {
                    throw new java.lang.IllegalArgumentException("Both should have left value".toString());
                }
                com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) leftOrNull;
                java.lang.Object orNull = ior.getOrNull();
                if (orNull == null) {
                    throw new java.lang.IllegalArgumentException("Both should have right value".toString());
                }
                java.util.List list = (java.util.List) orNull;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("articleCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()));
                pairArr[1] = kotlin.TuplesKt.to("errorMessage", helpCenterDomainError.getErrorMessage());
                if (helpCenterDomainError.getCallError() == null) {
                    z = false;
                }
                pairArr[2] = kotlin.TuplesKt.to("hasCallError", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                com.paypal.android.logger.Logger.w$default(logger, "Partial success fetching articles", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(list);
            } else {
                arrow.core.Either either = ior.toEither();
                if (either instanceof arrow.core.Either.Right) {
                    failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success((java.util.List) ((arrow.core.Either.Right) either).getValue());
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError2 = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Failed to fetch articles", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", helpCenterDomainError2.getErrorMessage())), null, 4, null);
                    failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(helpCenterDomainError2.getCallError()), null, 2, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Screen state updated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("stateType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(failure.getClass()).getSimpleName())), null, 4, null);
            mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(failure);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.helpcenter.LoggerKt.log.e("Failed to fetch recommended articles", e);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR, null, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel$fetchHomeData$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel$fetchHomeData$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterHomeViewModel$fetchHomeData$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel helpCenterHomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel$fetchHomeData$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = helpCenterHomeViewModel;
    }
}
