package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl", f = "SpecialFinancingRepositoryImpl.kt", i = {0, 0}, l = {42}, m = "getSpecialFinancingPage", n = {"request", "query"}, nl = {47}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getSpecialFinancingPage(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl specialFinancingRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl$getSpecialFinancingPage$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = specialFinancingRepositoryImpl;
    }
}
