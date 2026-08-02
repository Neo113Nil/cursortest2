package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfigAsync$1", f = "MerchantProviderSimplifiedConfig.kt", i = {2}, l = {99, 100, 103}, m = "invokeSuspend", n = {"e"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$getUserConfigAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r6 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r6 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Exception exc;
        java.lang.Object obj2;
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.lang.Exception e) {
            this.getHighSpeedVideoSizes = e;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
            if (highSpeedVideoFpsRanges != coroutine_suspended) {
                exc = e;
                obj = highSpeedVideoFpsRanges;
            }
            return coroutine_suspended;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userConfig = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            if (userConfig == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$syncUserConfig(this.Camera2StreamConfigurationMap, this);
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(userConfig);
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.Result.m23435boximpl(obj2));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig simplifiedUserConfig = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) obj;
                    if (simplifiedUserConfig != null) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        obj2 = kotlin.Result.m23436constructorimpl(simplifiedUserConfig);
                    } else {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Error("Could not retrieve user config")));
                    }
                    this.getHighSpeedVideoFpsRanges.invoke(kotlin.Result.m23435boximpl(obj2));
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (java.lang.Exception) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig simplifiedUserConfig2 = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) obj;
                if (simplifiedUserConfig2 != null) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    obj2 = kotlin.Result.m23436constructorimpl(simplifiedUserConfig2);
                } else {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exc));
                }
                this.getHighSpeedVideoFpsRanges.invoke(kotlin.Result.m23435boximpl(obj2));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) obj;
        if (userConfig2 == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            obj = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
        } else {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m23436constructorimpl(userConfig2);
            this.getHighSpeedVideoFpsRanges.invoke(kotlin.Result.m23435boximpl(obj2));
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfigAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfigAsync$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MerchantProviderSimplifiedConfig$getUserConfigAsync$1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfigAsync$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = merchantProviderSimplifiedConfig;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
