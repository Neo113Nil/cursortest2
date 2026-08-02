package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.AppGUID", f = "AppGUID.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {126, 69, 71}, m = "getValue", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$this$getValue_u24lambda_u241_u240", "$i$f$withLock", "$i$a$-withLock$default-AppGUID$getValue$3", "$i$a$-run-AppGUID$getValue$3$1", "$this$withLock_u24default$iv", "$this$getValue_u24lambda_u241_u240", "loadedGuid", "newGuid", "$i$f$withLock", "$i$a$-withLock$default-AppGUID$getValue$3", "$i$a$-run-AppGUID$getValue$3$1", "$i$a$-also-AppGUID$getValue$3$1$finalGuid$1"}, nl = {127, 70, 72}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes4.dex */
final class AppGUID$getValue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.AppGUID getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.getValue(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppGUID$getValue$1(com.paypal.oslo.core.appidentity.data.AppGUID appGUID, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.AppGUID$getValue$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = appGUID;
    }
}
