package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2", f = "AuthModule.kt", i = {}, l = {203, 207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class AuthModuleImpl$refresh$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.lang.Integer>>, java.lang.Object> {
    final /* synthetic */ okhttp3.Request getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ okhttp3.OkHttpClient getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = com.zettle.sdk.core.auth.AuthModuleImpl.access$refreshTokens(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxInt(0)));
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.network.HttpPayload httpPayload = (com.zettle.sdk.core.network.HttpPayload) obj;
        int code = httpPayload.getCode();
        if (200 <= code && code < 300) {
            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Persisting in refresh ");
            sb.append(httpPayload);
            sb.append(".body!!");
            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, sb.toString());
            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object body = httpPayload.getBody();
            kotlin.jvm.internal.Intrinsics.checkNotNull(body);
            this.getHighSpeedVideoSizes = 2;
            Camera2StreamConfigurationMap = authModuleImpl2.Camera2StreamConfigurationMap((com.zettle.sdk.core.auth.OAuthTokensInternal) body, this);
        } else {
            com.zettle.sdk.core.log.LogKt.warn$default(this.getHighSpeedVideoFpsRangesFor, "Error refreshing tokens: ".concat(java.lang.String.valueOf(httpPayload.getRawBody())), null, 2, null);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxInt(-1)));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.lang.Integer>> continuation) {
        return ((com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$refresh$2(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, okhttp3.Request request, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = authModuleImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = request;
        this.getHighSpeedVideoFpsRanges = okHttpClient;
    }
}
