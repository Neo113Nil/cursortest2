package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleGetConfig$1", f = "CompanionAppMessageHandler.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {94}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class CompanionAppMessageHandler$handleGetConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionAppMessageHandler getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.os.Messenger getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.companion.domain.CompanionConfigurationApi companionConfigurationApi;
        kotlinx.serialization.json.Json json;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            companionConfigurationApi = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = companionConfigurationApi.getDefaultConfiguration(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        json = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        java.lang.String json2 = ((com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) obj).toJson(json);
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 2);
        obtain.setData(androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to(com.paypal.oslo.core.companion.domain.CompanionIpcConstants.KEY_CONFIG_DATA, json2)));
        try {
            this.getHighSpeedVideoSizes.send(obtain);
        } catch (android.os.RemoteException e) {
            com.paypal.oslo.core.companion.LoggerKt.log.e("Failed to send configuration response", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleGetConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleGetConfig$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionAppMessageHandler$handleGetConfig$1(com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler, android.os.Messenger messenger, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleGetConfig$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = companionAppMessageHandler;
        this.getHighSpeedVideoSizes = messenger;
    }
}
