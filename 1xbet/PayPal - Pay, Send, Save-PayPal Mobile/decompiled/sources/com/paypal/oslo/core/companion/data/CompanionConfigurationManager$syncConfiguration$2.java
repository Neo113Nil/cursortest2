package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionConfigurationManager$syncConfiguration$2", f = "CompanionConfigurationManager.kt", i = {2}, l = {78, 83, 87}, m = "invokeSuspend", n = {"mergedConfig"}, nl = {79, 85, 88}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class CompanionConfigurationManager$syncConfiguration$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.companion.domain.CompanionAppConfiguration Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionConfigurationManager getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r11 != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration;
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration2;
        java.lang.Object highSpeedVideoSizes2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap == null) {
                com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager = this.getHighSpeedVideoFpsRanges;
                companionAppConfiguration = companionConfigurationManager.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 1;
                highSpeedVideoSizes = companionConfigurationManager.getHighSpeedVideoSizes(companionAppConfiguration, this);
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Synchronizing configuration", null, null, 6, null);
                this.getHighSpeedVideoFpsRangesFor = 2;
                highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this);
            }
        } else {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                companionAppConfiguration2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                return companionAppConfiguration2;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration3 = (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                return companionAppConfiguration3;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.companion.domain.CompanionAppConfiguration access$mergeWithDefaultConfig = com.paypal.oslo.core.companion.data.CompanionConfigurationManager.access$mergeWithDefaultConfig(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes = access$mergeWithDefaultConfig;
            this.getHighSpeedVideoFpsRangesFor = 3;
            highSpeedVideoSizes2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(access$mergeWithDefaultConfig, this);
            if (highSpeedVideoSizes2 != coroutine_suspended) {
                return access$mergeWithDefaultConfig;
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation) {
        return ((com.paypal.oslo.core.companion.data.CompanionConfigurationManager$syncConfiguration$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$syncConfiguration$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionConfigurationManager$syncConfiguration$2(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionConfigurationManager$syncConfiguration$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = companionAppConfiguration;
        this.getHighSpeedVideoFpsRanges = companionConfigurationManager;
    }
}
