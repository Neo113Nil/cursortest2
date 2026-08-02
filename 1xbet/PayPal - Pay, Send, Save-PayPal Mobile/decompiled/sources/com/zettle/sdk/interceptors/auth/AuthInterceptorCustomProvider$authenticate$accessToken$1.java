package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$authenticate$accessToken$1", f = "AuthInterceptorCustomProvider.kt", i = {0, 1}, l = {125, 52}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class AuthInterceptorCustomProvider$authenticate$accessToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.commons.network.Scope getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider getInputSizeshNQ4ISI;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider;
        com.zettle.sdk.commons.network.Scope scope;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.String str;
        com.zettle.sdk.core.auth.AuthModule authModule;
        com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider2;
        long j;
        int i;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (r1 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                authInterceptorCustomProvider = this.getInputSizeshNQ4ISI;
                com.zettle.sdk.commons.network.Scope scope2 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = mutex;
                this.getHighSpeedVideoFpsRanges = authInterceptorCustomProvider;
                this.Camera2StreamConfigurationMap = scope2;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    scope = scope2;
                }
                return coroutine_suspended;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authInterceptorCustomProvider2 = (com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider) this.getHighSpeedVideoFpsRanges;
                mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = ((com.zettle.sdk.core.auth.OAuthTokensInternal) obj).getAccessToken();
                authInterceptorCustomProvider2.getHighSpeedVideoFpsRanges = str2;
                authInterceptorCustomProvider2.getHighSpeedVideoSizes = java.lang.System.currentTimeMillis();
                mutex2.unlock(null);
                return str2;
            }
            com.zettle.sdk.commons.network.Scope scope3 = (com.zettle.sdk.commons.network.Scope) this.Camera2StreamConfigurationMap;
            com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider3 = (com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider) this.getHighSpeedVideoFpsRanges;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            scope = scope3;
            authInterceptorCustomProvider = authInterceptorCustomProvider3;
            mutex2 = mutex;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            str = authInterceptorCustomProvider.getHighSpeedVideoFpsRanges;
            if (str != null) {
                j = authInterceptorCustomProvider.getHighSpeedVideoSizes;
                long j2 = currentTimeMillis - j;
                i = authInterceptorCustomProvider.Camera2StreamConfigurationMap;
                if (j2 < i) {
                    com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# authenticate call - reuse cached token");
                    str2 = authInterceptorCustomProvider.getHighSpeedVideoFpsRanges;
                    mutex2.unlock(null);
                    return str2;
                }
            }
            com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# authenticate call - acquired lock for token refresh");
            authModule = authInterceptorCustomProvider.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = mutex2;
            this.getHighSpeedVideoFpsRanges = authInterceptorCustomProvider;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object accessToken$default = com.zettle.sdk.core.auth.AuthModule.DefaultImpls.getAccessToken$default(authModule, scope, true, 0L, this, 4, null);
            if (accessToken$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            authInterceptorCustomProvider2 = authInterceptorCustomProvider;
            obj = accessToken$default;
            str2 = ((com.zettle.sdk.core.auth.OAuthTokensInternal) obj).getAccessToken();
            authInterceptorCustomProvider2.getHighSpeedVideoFpsRanges = str2;
            authInterceptorCustomProvider2.getHighSpeedVideoSizes = java.lang.System.currentTimeMillis();
            mutex2.unlock(null);
            return str2;
        } catch (java.lang.Throwable th) {
            r1.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$authenticate$accessToken$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$authenticate$accessToken$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthInterceptorCustomProvider$authenticate$accessToken$1(com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider, com.zettle.sdk.commons.network.Scope scope, kotlin.coroutines.Continuation<? super com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$authenticate$accessToken$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = authInterceptorCustomProvider;
        this.getHighSpeedVideoSizes = scope;
    }
}
