package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1", f = "MerchantProviderSimplifiedConfig.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig simplifiedUserConfig = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) obj;
        if (simplifiedUserConfig != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(simplifiedUserConfig);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Error("Could not retrieve user config")));
        }
        return kotlin.Result.m23435boximpl(m23436constructorimpl);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = merchantProviderSimplifiedConfig;
    }
}
