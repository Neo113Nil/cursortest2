package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$performSearch$1", f = "HelpCenterSearchViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class HelpCenterSearchViewModel$performSearch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase searchArticlesUseCase;
        java.util.List list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Performing search", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoFpsRangesFor.length()))), null, 4, null);
            searchArticlesUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = searchArticlesUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
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
        if (ior.isLeft()) {
            com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ior.leftOrNull();
            if (helpCenterDomainError != null) {
                com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Search failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", helpCenterDomainError.toString())), null, 4, null);
                mutableStateFlow4 = helpCenterSearchViewModel.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow4.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, helpCenterDomainError.getErrorMessage(), 1, null));
            }
        } else if (ior.isBoth()) {
            java.util.List list2 = (java.util.List) ior.getOrNull();
            if (list2 != null) {
                com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError2 = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ior.leftOrNull();
                if (helpCenterDomainError2 != null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Search returned partial results", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list2.size())), kotlin.TuplesKt.to("error", helpCenterDomainError2.toString())), null, 4, null);
                }
                mutableStateFlow3 = helpCenterSearchViewModel2.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow3.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(list2));
            }
        } else if (ior.isRight() && (list = (java.util.List) ior.getOrNull()) != null) {
            com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Search succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
            mutableStateFlow2 = helpCenterSearchViewModel3.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(list));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$performSearch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$performSearch$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterSearchViewModel$performSearch$1(com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel helpCenterSearchViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel$performSearch$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = helpCenterSearchViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
