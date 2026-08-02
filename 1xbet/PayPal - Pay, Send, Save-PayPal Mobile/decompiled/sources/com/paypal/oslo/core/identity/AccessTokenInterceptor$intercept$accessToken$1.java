package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.identity.AccessTokenInterceptor$intercept$accessToken$1", f = "AccessTokenInterceptor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class AccessTokenInterceptor$intercept$accessToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.identity.domain.model.TokenType getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.identity.AccessTokenInterceptor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tokenProvider = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = tokenProvider.getToken(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.core.identity.domain.model.Token token = (com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either) obj).getOrNull();
        if (token != null) {
            return token.getValue();
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.core.identity.AccessTokenInterceptor$intercept$accessToken$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.identity.AccessTokenInterceptor$intercept$accessToken$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessTokenInterceptor$intercept$accessToken$1(com.paypal.oslo.core.identity.AccessTokenInterceptor accessTokenInterceptor, com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.identity.AccessTokenInterceptor$intercept$accessToken$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = accessTokenInterceptor;
        this.getHighResolutionOutputSizeshNQ4ISI = tokenType;
    }
}
