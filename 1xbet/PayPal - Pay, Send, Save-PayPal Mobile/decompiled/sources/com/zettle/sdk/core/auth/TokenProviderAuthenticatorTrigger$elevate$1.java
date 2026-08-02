package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$elevate$1", f = "AuthenticatorTrigger.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class TokenProviderAuthenticatorTrigger$elevate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.commons.network.Scope getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter;
        com.zettle.sdk.core.auth.AuthModule authModule;
        java.lang.Object m23160verify0E7RQCE$default;
        com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            authAnalyticsReporter = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            authAnalyticsReporter.reportVerifyStarted();
            authModule = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            m23160verify0E7RQCE$default = com.zettle.sdk.core.auth.AuthModule.DefaultImpls.m23160verify0E7RQCE$default(authModule, this.getHighResolutionOutputSizeshNQ4ISI, false, this, 2, null);
            if (m23160verify0E7RQCE$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            m23160verify0E7RQCE$default = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
        }
        com.zettle.sdk.core.log.LogKt.debug(this.Camera2StreamConfigurationMap, "Got result from elevate -> ".concat(java.lang.String.valueOf(kotlin.Result.m23443toStringimpl(m23160verify0E7RQCE$default))));
        kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        if (function1 != null) {
            function1.invoke(kotlin.Result.m23435boximpl(m23160verify0E7RQCE$default));
        }
        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        if (kotlin.Result.m23441isFailureimpl(m23160verify0E7RQCE$default)) {
            m23160verify0E7RQCE$default = boxBoolean;
        }
        if (((java.lang.Boolean) m23160verify0E7RQCE$default).booleanValue()) {
            authAnalyticsReporter2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            authAnalyticsReporter2.reportVerifySuccess();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$elevate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$elevate$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TokenProviderAuthenticatorTrigger$elevate$1(com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger tokenProviderAuthenticatorTrigger, com.zettle.sdk.commons.network.Scope scope, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$elevate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = tokenProviderAuthenticatorTrigger;
        this.getHighResolutionOutputSizeshNQ4ISI = scope;
        this.getHighSpeedVideoSizes = function1;
    }
}
