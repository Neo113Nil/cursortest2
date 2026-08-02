package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$sendEvent$1", f = "FPTIClient.kt", i = {0}, l = {68}, m = "invokeSuspend", n = {"request"}, nl = {148}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class FPTIClient$sendEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService fPTIService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
            java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys keys = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.INSTANCE;
            java.lang.Object obj2 = map.get(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.Keys.Camera2StreamConfigurationMap());
            if (obj2 == null) {
                obj2 = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.UNKNOWN_EVENT;
            }
            com.paypal.android.logger.Logger.d$default(logger, "Sending FPTI event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME, obj2)), null, 4, null);
            com.paypal.oslo.core.telemetry.vendors.fpti.FPTIRequest access$buildRequest = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.access$buildRequest(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
            fPTIService = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildRequest);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = fPTIService.sendEvent(access$buildRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "FPTI send event succeeded", null, null, 6, null);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.telemetry.util.NetworkErrorExtensionsKt.logErrors((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue(), "[FPTI] Failed to send event");
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$sendEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$sendEvent$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FPTIClient$sendEvent$1(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient fPTIClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient$sendEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighSpeedVideoSizes = fPTIClient;
    }
}
