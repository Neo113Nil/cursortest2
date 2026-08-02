package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onUploadUnlockKeys$1", f = "CsdkListener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CsdkListener$onUploadUnlockKeys$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r1.updateUnlockKeys((java.lang.String) r6, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r6 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager sdkConfigurationManager;
        com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to upload unlock keys", e);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sdkConfigurationManager = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            authToken = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = sdkConfigurationManager;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = authToken.getToken(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            sdkConfigurationManager = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onUploadUnlockKeys$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onUploadUnlockKeys$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CsdkListener$onUploadUnlockKeys$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onUploadUnlockKeys$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = csdkListener;
    }
}
