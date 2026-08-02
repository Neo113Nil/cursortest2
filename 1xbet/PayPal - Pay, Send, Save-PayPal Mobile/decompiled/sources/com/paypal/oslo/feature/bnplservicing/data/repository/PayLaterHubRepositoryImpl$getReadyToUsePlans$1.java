package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl", f = "PayLaterHubRepositoryImpl.kt", i = {0}, l = {130}, m = "getReadyToUsePlans", n = {"plansInput"}, nl = {361}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubRepositoryImpl$getReadyToUsePlans$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl.access$getReadyToUsePlans(this.getHighResolutionOutputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubRepositoryImpl$getReadyToUsePlans$1(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getReadyToUsePlans$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = payLaterHubRepositoryImpl;
    }
}
