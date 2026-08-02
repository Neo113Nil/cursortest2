package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ZettleSDKImpl$refresh$2", f = "ZettleSDK.kt", i = {}, l = {711, 712, 716}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ZettleSDKImpl$refresh$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.core.auth.ZettleService getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.core.network.NetworkModule getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r1.refreshServices(r8, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r7.getHighResolutionOutputSizeshNQ4ISI.refresh(r7.getHighSpeedVideoSizes.getClient(), r7) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object mo23158refresh0E7RQCE;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo23158refresh0E7RQCE = kotlin.Unit.INSTANCE;
                    return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(mo23158refresh0E7RQCE));
                }
                kotlin.ResultKt.throwOnFailure(obj);
                mo23158refresh0E7RQCE = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                com.zettle.sdk.core.auth.ZettleService zettleService = this.getHighResolutionOutputSizeshNQ4ISI;
                com.zettle.sdk.core.network.NetworkModule networkModule = this.getHighSpeedVideoSizes;
                if (kotlin.Result.m23442isSuccessimpl(mo23158refresh0E7RQCE)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    int intValue = ((java.lang.Number) mo23158refresh0E7RQCE).intValue();
                    com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.ZettleSDKImpl.INSTANCE, "Auth-refresh -> ".concat(java.lang.String.valueOf(intValue)));
                    if (intValue >= 0) {
                        okhttp3.OkHttpClient getOutputFormats = networkModule.getGetOutputFormats();
                        this.Camera2StreamConfigurationMap = 3;
                    }
                    mo23158refresh0E7RQCE = kotlin.Unit.INSTANCE;
                }
                return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(mo23158refresh0E7RQCE));
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.auth.AuthModule authModule = this.getHighSpeedVideoFpsRanges;
        okhttp3.OkHttpClient getOutputFormats2 = this.getHighSpeedVideoSizes.getGetOutputFormats();
        com.zettle.sdk.core.auth.ZettleService zettleService2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zettleService2, "");
        this.Camera2StreamConfigurationMap = 2;
        mo23158refresh0E7RQCE = authModule.mo23158refresh0E7RQCE(getOutputFormats2, (com.zettle.sdk.core.auth.ServiceProvider) zettleService2, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
        return ((com.zettle.sdk.ZettleSDKImpl$refresh$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.ZettleSDKImpl$refresh$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleSDKImpl$refresh$2(com.zettle.sdk.core.auth.ZettleService zettleService, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.AuthModule authModule, kotlin.coroutines.Continuation<? super com.zettle.sdk.ZettleSDKImpl$refresh$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = zettleService;
        this.getHighSpeedVideoSizes = networkModule;
        this.getHighSpeedVideoFpsRanges = authModule;
    }
}
