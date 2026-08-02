package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl", f = "PayLaterHubRepositoryImpl.kt", i = {0}, l = {140}, m = "getPlansSection", n = {"plansInput"}, nl = {361}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubRepositoryImpl$getPlansSection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getPlansSection(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubRepositoryImpl$getPlansSection$1(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansSection$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = payLaterHubRepositoryImpl;
    }
}
