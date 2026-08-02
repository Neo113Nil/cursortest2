package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantContent$1$1", f = "PpwMerchantScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PpwMerchantScreenKt$PpwMerchantContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.getHighSpeedVideoFpsRanges
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L28
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.getHighSpeedVideoFpsRanges = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L28
            return r0
        L28:
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, kotlin.Unit> r6 = r5.getHighResolutionOutputSizeshNQ4ISI
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent$TimerTick r1 = com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.TimerTick.INSTANCE
            r6.invoke(r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantContent$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PpwMerchantScreenKt$PpwMerchantContent$1$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantScreenKt$PpwMerchantContent$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
