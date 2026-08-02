package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1", f = "RemoteConfigCompanionInitializer.kt", i = {0, 0, 0}, l = {101}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1$1"}, nl = {102}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint = this.Camera2StreamConfigurationMap;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar autoRegistrar = remoteConfigInitializerEntryPoint.autoRegistrar();
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (autoRegistrar.autoRegisterFromCdn(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Exception during CDN auto-registration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", m23439exceptionOrNullimpl.toString())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1 remoteConfigCompanionInitializer$initializeCdnAutoRegistration$1 = new com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1(this.Camera2StreamConfigurationMap, continuation);
        remoteConfigCompanionInitializer$initializeCdnAutoRegistration$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return remoteConfigCompanionInitializer$initializeCdnAutoRegistration$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1(com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = remoteConfigInitializerEntryPoint;
    }
}
