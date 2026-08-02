package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfig$1", f = "MerchantProviderDetailedConfig.kt", i = {2}, l = {125, 126, 130}, m = "invokeSuspend", n = {"e"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$getUserConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

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
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.io.IOException iOException;
        java.lang.Object obj2;
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
        } catch (java.io.IOException e) {
            this.getHighResolutionOutputSizeshNQ4ISI = e;
            this.getHighSpeedVideoSizes = 3;
            highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
            if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                iOException = e;
                obj = highResolutionOutputSizeshNQ4ISI;
            }
            return coroutine_suspended;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userConfig = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            if (userConfig != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(userConfig);
                return kotlin.Result.m23435boximpl(obj2);
            }
            this.getHighSpeedVideoSizes = 1;
            obj = com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.access$syncUserConfig(this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) obj;
                    if (detailedUserConfig != null) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        obj2 = kotlin.Result.m23436constructorimpl(detailedUserConfig);
                    } else {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Error("Could not retrieve user config")));
                    }
                    return kotlin.Result.m23435boximpl(obj2);
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iOException = (java.io.IOException) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig2 = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) obj;
                if (detailedUserConfig2 != null) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    obj2 = kotlin.Result.m23436constructorimpl(detailedUserConfig2);
                } else {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(iOException));
                }
                return kotlin.Result.m23435boximpl(obj2);
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) obj;
        if (userConfig2 != null) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            obj2 = kotlin.Result.m23436constructorimpl(userConfig2);
            return kotlin.Result.m23435boximpl(obj2);
        }
        this.getHighSpeedVideoSizes = 2;
        obj = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfig$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$getUserConfig$1(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfig$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = merchantProviderDetailedConfig;
    }
}
