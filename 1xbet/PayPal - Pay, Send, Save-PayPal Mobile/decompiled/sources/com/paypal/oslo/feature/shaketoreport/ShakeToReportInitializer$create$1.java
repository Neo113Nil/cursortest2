package com.paypal.oslo.feature.shaketoreport;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1", f = "ShakeToReportInitializer.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {64}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ShakeToReportInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.app.Application Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateFlow = this.getHighSpeedVideoSizes.featureGate().checkGateFlow(com.paypal.oslo.feature.shaketoreport.ShakeToReportFeatureGate.INSTANCE.getShakeToReport());
            final com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer shakeToReportInitializer = this.getHighSpeedVideoFpsRangesFor;
            final android.app.Application application = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (checkGateFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_start_evaluation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("is_shake_to_send_enabled", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue))), null, 4, null);
                    com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer.this.evaluateAndApply$shake_to_report_prodRelease(application, booleanValue);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShakeToReportInitializer$create$1(com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint shakeToReportEntryPoint, com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer shakeToReportInitializer, android.app.Application application, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = shakeToReportEntryPoint;
        this.getHighSpeedVideoFpsRangesFor = shakeToReportInitializer;
        this.Camera2StreamConfigurationMap = application;
    }
}
