package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchRecommendedArticles$1", f = "ContactUsViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactUsViewModel$fetchRecommendedArticles$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fetchRecommendedArticlesUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
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
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            if (ior instanceof arrow.core.Ior.Both) {
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(((arrow.core.Ior.Both) ior).getRightValue());
            } else if (ior instanceof arrow.core.Ior.Left) {
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, null, 3, null);
            } else {
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                success = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(((arrow.core.Ior.Right) ior).getValue());
            }
            mutableStateFlow2.setValue(success);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.helpcenter.LoggerKt.log.e("Failed to fetch recommended articles for contact us", e);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, null, 3, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchRecommendedArticles$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchRecommendedArticles$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactUsViewModel$fetchRecommendedArticles$1(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel contactUsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$fetchRecommendedArticles$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = contactUsViewModel;
    }
}
