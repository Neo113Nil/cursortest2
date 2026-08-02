package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl", f = "XoomLocalRepositoryImpl.kt", i = {}, l = {36}, m = "userId", n = {}, nl = {39}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class XoomLocalRepositoryImpl$userId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$userId(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    XoomLocalRepositoryImpl$userId$1(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = xoomLocalRepositoryImpl;
    }
}
