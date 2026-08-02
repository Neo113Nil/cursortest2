package com.paypal.oslo.feature.settings.closeaccount.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl", f = "CloseAccountRepositoryImpl.kt", i = {0, 0}, l = {74}, m = "closeAccount", n = {"reason", "skipNotification"}, nl = {75}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class CloseAccountRepositoryImpl$closeAccount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.closeAccount(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseAccountRepositoryImpl$closeAccount$1(com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl closeAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$closeAccount$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = closeAccountRepositoryImpl;
    }
}
