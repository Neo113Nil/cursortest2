package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl$start$1", f = "AuthModule.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class AuthModuleImpl$start$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.auth.ServiceProvider Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ okhttp3.OkHttpClient getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object mo23158refresh0E7RQCE;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            mo23158refresh0E7RQCE = this.getHighSpeedVideoSizes.mo23158refresh0E7RQCE(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
            if (mo23158refresh0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            mo23158refresh0E7RQCE = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
        }
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl = this.getHighSpeedVideoSizes;
        java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
        if (kotlin.Result.m23441isFailureimpl(mo23158refresh0E7RQCE)) {
            mo23158refresh0E7RQCE = boxInt;
        }
        com.zettle.sdk.core.log.LogKt.log(authModuleImpl, "Tokens refreshed? ".concat(java.lang.String.valueOf(((java.lang.Number) mo23158refresh0E7RQCE).intValue() > 0)));
        this.getHighSpeedVideoSizes.getInputFormats = null;
        this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI = null;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.AuthModuleImpl$start$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.AuthModuleImpl$start$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$start$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, okhttp3.OkHttpClient okHttpClient, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$start$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = authModuleImpl;
        this.getHighSpeedVideoFpsRangesFor = okHttpClient;
        this.Camera2StreamConfigurationMap = serviceProvider;
    }
}
