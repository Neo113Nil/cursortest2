package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$insights$1", f = "GetBusinessHomeFeedUseCase.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class GetBusinessHomeFeedUseCase$invoke$2$insights$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, ? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository merchantInsightsRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        merchantInsightsRepository = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object merchantInsights = merchantInsightsRepository.getMerchantInsights(this);
        return merchantInsights == coroutine_suspended ? coroutine_suspended : merchantInsights;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, ? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights>> continuation) {
        return ((com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$insights$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$insights$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetBusinessHomeFeedUseCase$invoke$2$insights$1(com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getBusinessHomeFeedUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$insights$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = getBusinessHomeFeedUseCase;
    }
}
