package com.paypal.oslo.core.security.initializer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.security.initializer.MagnesInitializer$create$1", f = "MagnesInitializer.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, nl = {51}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class MagnesInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.concurrent.CountDownLatch Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.security.di.SecurityEntryPoint getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (this.getHighSpeedVideoSizes.riskDataConfigurator().setUp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "Magnes SDK initialization completed", null, null, 6, null);
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.security.LoggerKt.log, "Magnes SDK initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("initializerClass", "MagnesInitializer")), null, e, 4, null);
            }
            this.Camera2StreamConfigurationMap.countDown();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.countDown();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.security.initializer.MagnesInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.security.initializer.MagnesInitializer$create$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MagnesInitializer$create$1(com.paypal.oslo.core.security.di.SecurityEntryPoint securityEntryPoint, java.util.concurrent.CountDownLatch countDownLatch, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.security.initializer.MagnesInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = securityEntryPoint;
        this.Camera2StreamConfigurationMap = countDownLatch;
    }
}
