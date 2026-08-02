package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl", f = "DeleteCardApiImpl.kt", i = {0}, l = {31}, m = "invoke", n = {"id"}, nl = {40}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class DeleteCardApiImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteCardApiImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl deleteCardApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = deleteCardApiImpl;
    }
}
