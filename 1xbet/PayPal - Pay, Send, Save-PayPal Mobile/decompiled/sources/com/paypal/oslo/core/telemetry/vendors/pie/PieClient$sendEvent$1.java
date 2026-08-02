package com.paypal.oslo.core.telemetry.vendors.pie;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.pie.PieClient$sendEvent$1", f = "PieClient.kt", i = {0, 0, 0}, l = {36}, m = "invokeSuspend", n = {"activityType", "pieId", "request"}, nl = {67}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class PieClient$sendEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.event.EventType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.pie.PieClient getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String access$getPieId;
        com.paypal.oslo.core.telemetry.vendors.pie.PieService pieService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String access$toActivityType = com.paypal.oslo.core.telemetry.vendors.pie.PieClient.access$toActivityType(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
            if (access$toActivityType != null && (access$getPieId = com.paypal.oslo.core.telemetry.vendors.pie.PieClient.access$getPieId(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges)) != null) {
                com.paypal.oslo.core.telemetry.vendors.pie.PieRequest access$buildPieRequest = com.paypal.oslo.core.telemetry.vendors.pie.PieClient.access$buildPieRequest(this.getOutputMinFrameDuration, access$toActivityType, access$getPieId);
                pieService = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$toActivityType);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$getPieId);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildPieRequest);
                this.getInputSizeshNQ4ISI = 1;
                obj = pieService.sendEvent(access$buildPieRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[PIE] Event sent successfully", null, null, 6, null);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.telemetry.util.NetworkErrorExtensionsKt.logErrors((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue(), "[PIE] Failed to send event");
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.vendors.pie.PieClient$sendEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieClient$sendEvent$1(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PieClient$sendEvent$1(com.paypal.oslo.core.telemetry.vendors.pie.PieClient pieClient, com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.pie.PieClient$sendEvent$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = pieClient;
        this.getHighResolutionOutputSizeshNQ4ISI = eventType;
        this.getHighSpeedVideoFpsRanges = map;
    }
}
