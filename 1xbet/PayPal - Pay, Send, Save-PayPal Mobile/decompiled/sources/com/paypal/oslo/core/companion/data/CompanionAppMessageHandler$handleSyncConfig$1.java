package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleSyncConfig$1", f = "CompanionAppMessageHandler.kt", i = {0}, l = {125}, m = "invokeSuspend", n = {"config"}, nl = {126}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class CompanionAppMessageHandler$handleSyncConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionAppMessageHandler getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.os.Messenger getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration;
        com.paypal.oslo.core.companion.domain.CompanionConfigurationApi companionConfigurationApi;
        kotlinx.serialization.json.Json json;
        kotlinx.serialization.json.Json json2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes != null) {
                com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.Companion companion = com.paypal.oslo.core.companion.domain.CompanionAppConfiguration.INSTANCE;
                java.lang.String str = this.getHighSpeedVideoSizes;
                json = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                companionAppConfiguration = companion.fromJson(str, json);
            } else {
                companionAppConfiguration = null;
            }
            companionConfigurationApi = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companionAppConfiguration);
            this.Camera2StreamConfigurationMap = 1;
            obj = companionConfigurationApi.syncConfiguration(companionAppConfiguration, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        json2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        java.lang.String json3 = ((com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) obj).toJson(json2);
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 6);
        obtain.setData(androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to(com.paypal.oslo.core.companion.domain.CompanionIpcConstants.KEY_CONFIG_DATA, json3)));
        try {
            this.getHighSpeedVideoFpsRangesFor.send(obtain);
        } catch (android.os.RemoteException e) {
            com.paypal.oslo.core.companion.LoggerKt.log.e("Failed to send sync response", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleSyncConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleSyncConfig$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionAppMessageHandler$handleSyncConfig$1(java.lang.String str, com.paypal.oslo.core.companion.data.CompanionAppMessageHandler companionAppMessageHandler, android.os.Messenger messenger, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionAppMessageHandler$handleSyncConfig$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = companionAppMessageHandler;
        this.getHighSpeedVideoFpsRangesFor = messenger;
    }
}
