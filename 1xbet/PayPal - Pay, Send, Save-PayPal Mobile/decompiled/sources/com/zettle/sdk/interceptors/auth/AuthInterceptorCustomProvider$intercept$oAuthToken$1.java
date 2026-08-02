package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$intercept$oAuthToken$1", f = "AuthInterceptorCustomProvider.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class AuthInterceptorCustomProvider$intercept$oAuthToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokensInternal>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.commons.network.Scope getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.auth.AuthModule authModule;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        authModule = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object accessToken$default = com.zettle.sdk.core.auth.AuthModule.DefaultImpls.getAccessToken$default(authModule, this.getHighResolutionOutputSizeshNQ4ISI, false, 0L, this, 4, null);
        return accessToken$default == coroutine_suspended ? coroutine_suspended : accessToken$default;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokensInternal> continuation) {
        return ((com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$intercept$oAuthToken$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$intercept$oAuthToken$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthInterceptorCustomProvider$intercept$oAuthToken$1(com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider, com.zettle.sdk.commons.network.Scope scope, kotlin.coroutines.Continuation<? super com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$intercept$oAuthToken$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = authInterceptorCustomProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = scope;
    }
}
