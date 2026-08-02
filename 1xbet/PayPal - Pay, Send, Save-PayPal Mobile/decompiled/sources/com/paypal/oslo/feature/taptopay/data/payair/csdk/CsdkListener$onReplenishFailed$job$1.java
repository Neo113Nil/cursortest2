package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onReplenishFailed$job$1", f = "CsdkListener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "invokeSuspend", n = {}, nl = {238}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CsdkListener$onReplenishFailed$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                    java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(kotlin.time.DurationKt.toDuration(num.intValue() * 30, kotlin.time.DurationUnit.SECONDS), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                payairCardPaymentKeysReplenisher = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                payairCardPaymentKeysReplenisher.replenishKeysIfNeeded(this.getHighSpeedVideoSizes, false);
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to replenish keys after retry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", this.getHighSpeedVideoSizes)), null, e, 4, null);
            }
            concurrentHashMap2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            concurrentHashMap2.remove(this.getHighSpeedVideoSizes);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            concurrentHashMap = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            concurrentHashMap.remove(this.getHighSpeedVideoSizes);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onReplenishFailed$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onReplenishFailed$job$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CsdkListener$onReplenishFailed$job$1(java.lang.Integer num, com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onReplenishFailed$job$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = num;
        this.Camera2StreamConfigurationMap = csdkListener;
        this.getHighSpeedVideoSizes = str;
    }
}
