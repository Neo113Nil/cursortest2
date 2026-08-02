package com.paypal.oslo.feature.taptopay.data.payair.replenishment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1", f = "PayairCardPaymentKeysReplenisher.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, nl = {66}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (r2 >= r5) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.TokenManager tokenManager;
        java.lang.Object localTokenDetails;
        com.payair.logic.managers.PaymentManager paymentManager;
        com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager payairWorkManager;
        int i;
        com.payair.model.TokenDetails tokenDetails;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ReplenishKeysIfNeeded called.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("forceReplenishment", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes))), null, 4, null);
            tokenManager = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            localTokenDetails = tokenManager.getLocalTokenDetails(this.Camera2StreamConfigurationMap, false, this);
            if (localTokenDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            localTokenDetails = obj;
        }
        com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) localTokenDetails;
        com.payair.model.CardScheme scheme = (tokenDetailsWithAsset == null || (tokenDetails = tokenDetailsWithAsset.getTokenDetails()) == null) ? null : tokenDetails.getScheme();
        paymentManager = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        int numberOfPaymentKeys = paymentManager.getNumberOfPaymentKeys(this.Camera2StreamConfigurationMap);
        if (!this.getHighSpeedVideoSizes && scheme != com.payair.model.CardScheme.VISA) {
            if (scheme == com.payair.model.CardScheme.MASTERCARD) {
                i = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Replenishment will not be attempted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("forceReplenish", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes)), kotlin.TuplesKt.to("Scheme", scheme), kotlin.TuplesKt.to("Number of payment keys", kotlin.coroutines.jvm.internal.Boxing.boxInt(numberOfPaymentKeys))), null, 4, null);
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Replenishment requirements met, attempting to replenish the token.", null, null, 6, null);
        payairWorkManager = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        payairWorkManager.setupAndRunTheReplenishWork(com.paypal.oslo.feature.taptopay.data.mapper.ReplenishPaymentMapper.INSTANCE.toData(new com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1(boolean z, com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher$replenishKeysIfNeeded$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = payairCardPaymentKeysReplenisher;
        this.Camera2StreamConfigurationMap = str;
    }
}
