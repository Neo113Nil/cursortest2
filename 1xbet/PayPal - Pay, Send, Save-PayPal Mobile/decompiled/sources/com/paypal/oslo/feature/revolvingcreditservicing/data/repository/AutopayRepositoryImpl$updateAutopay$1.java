package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl", f = "AutopayRepositoryImpl.kt", i = {0, 0}, l = {73}, m = "updateAutopay", n = {"request", "mutation"}, nl = {78}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class AutopayRepositoryImpl$updateAutopay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updateAutopay(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutopayRepositoryImpl$updateAutopay$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl autopayRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = autopayRepositoryImpl;
    }
}
