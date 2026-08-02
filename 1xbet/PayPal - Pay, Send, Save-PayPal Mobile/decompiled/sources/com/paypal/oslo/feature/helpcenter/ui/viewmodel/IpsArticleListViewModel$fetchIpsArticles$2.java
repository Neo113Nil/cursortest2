package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel$fetchIpsArticles$2", f = "IpsArticleListViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class IpsArticleListViewModel$fetchIpsArticles$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState failure;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            fetchIpsArticlesUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = mutableStateFlow;
            this.getInputFormats = 1;
            java.lang.Object invoke = fetchIpsArticlesUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = mutableStateFlow;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel ipsArticleListViewModel = this.getInputSizeshNQ4ISI;
        kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> triple = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            ipsArticleListViewModel.getHighSpeedVideoSizes = triple;
            failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(list);
        } else if (either instanceof arrow.core.Either.Left) {
            java.lang.String errorMessage = ((com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Either.Left) either).getValue()).getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "Unknown error occurred";
            }
            failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, errorMessage, 1, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow2.setValue(failure);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel$fetchIpsArticles$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel$fetchIpsArticles$2(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpsArticleListViewModel$fetchIpsArticles$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel ipsArticleListViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> triple, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel$fetchIpsArticles$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = ipsArticleListViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getHighSpeedVideoFpsRanges = triple;
    }
}
