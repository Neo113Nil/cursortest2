package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$logout$1", f = "AuthenticatorTrigger.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class TokenProviderAuthenticatorTrigger$logout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.auth.AuthModule authModule;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            authModule = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (authModule.clean(this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        if (function1 != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$logout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$logout$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TokenProviderAuthenticatorTrigger$logout$1(com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger tokenProviderAuthenticatorTrigger, boolean z, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$logout$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = tokenProviderAuthenticatorTrigger;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = function1;
    }
}
