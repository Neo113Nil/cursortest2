package com.paypal.oslo.feature.settings.closeaccount.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl", f = "CloseAccountRepositoryImpl.kt", i = {0}, l = {57}, m = "checkCloseAccountEligibility", n = {"input"}, nl = {58}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class CloseAccountRepositoryImpl$checkCloseAccountEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.checkCloseAccountEligibility(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseAccountRepositoryImpl$checkCloseAccountEligibility$1(com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl closeAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$checkCloseAccountEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = closeAccountRepositoryImpl;
    }
}
