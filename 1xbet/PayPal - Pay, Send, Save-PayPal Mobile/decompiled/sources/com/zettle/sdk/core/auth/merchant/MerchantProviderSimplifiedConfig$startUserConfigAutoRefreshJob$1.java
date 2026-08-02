package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1", f = "MerchantProviderSimplifiedConfig.kt", i = {0, 1}, l = {154, 155}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$syncUserConfig(r6.getHighResolutionOutputSizeshNQ4ISI, r6) != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:6:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    this.getHighSpeedVideoSizes = coroutineScope;
                    this.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.m23165access$getRefreshDelayUwyO8pc(this.getHighResolutionOutputSizeshNQ4ISI), this) != coroutine_suspended) {
                        coroutineScope2 = coroutineScope;
                        this.getHighSpeedVideoSizes = coroutineScope2;
                        this.Camera2StreamConfigurationMap = 2;
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = coroutineScope2;
            this.Camera2StreamConfigurationMap = 2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1 merchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        merchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1.getHighSpeedVideoSizes = obj;
        return merchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = merchantProviderSimplifiedConfig;
    }
}
