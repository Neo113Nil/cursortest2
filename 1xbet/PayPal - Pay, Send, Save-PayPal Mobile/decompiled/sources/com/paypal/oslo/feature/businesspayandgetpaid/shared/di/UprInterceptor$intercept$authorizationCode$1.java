package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "Lcom/paypal/oslo/feature/identity/api/model/TokenToCodeExchangeData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor$intercept$authorizationCode$1", f = "UprInterceptor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class UprInterceptor$intercept$authorizationCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        tokenToCodeExchange = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object exchangeTokenToCode = tokenToCodeExchange.exchangeTokenToCode(this.getHighSpeedVideoFpsRangesFor, this);
        return exchangeTokenToCode == coroutine_suspended ? coroutine_suspended : exchangeTokenToCode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData>> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor$intercept$authorizationCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor$intercept$authorizationCode$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UprInterceptor$intercept$authorizationCode$1(com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor uprInterceptor, com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor$intercept$authorizationCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = uprInterceptor;
        this.getHighSpeedVideoFpsRangesFor = tokenToCodeExchangeAuthenticationContext;
    }
}
