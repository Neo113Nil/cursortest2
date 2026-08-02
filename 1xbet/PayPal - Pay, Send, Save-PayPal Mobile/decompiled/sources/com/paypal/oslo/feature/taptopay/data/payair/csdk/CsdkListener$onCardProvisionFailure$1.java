package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onCardProvisionFailure$1", f = "CsdkListener.kt", i = {1}, l = {108, 110}, m = "invokeSuspend", n = {"card"}, nl = {109, 113}, s = {"L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CsdkListener$onCardProvisionFailure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:7:0x0016, B:9:0x0040, B:11:0x0046, B:14:0x0054, B:28:0x0022, B:29:0x003a, B:31:0x0029), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager;
        java.util.Iterator it;
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to clean up stale cards after provision failure", e);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sdkTokenManager = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = sdkTokenManager.getCards(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) it.next();
                    if (digitizedCard.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown) {
                        sdkTokenManager2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges = it;
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                        if (sdkTokenManager2.deleteCard(digitizedCard.getCardId(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onCardProvisionFailure$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onCardProvisionFailure$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CsdkListener$onCardProvisionFailure$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onCardProvisionFailure$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = csdkListener;
    }
}
