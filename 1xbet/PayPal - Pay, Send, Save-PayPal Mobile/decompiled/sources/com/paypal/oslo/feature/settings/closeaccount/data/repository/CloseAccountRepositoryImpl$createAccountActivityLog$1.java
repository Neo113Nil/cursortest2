package com.paypal.oslo.feature.settings.closeaccount.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl", f = "CloseAccountRepositoryImpl.kt", i = {0, 0}, l = {94}, m = "createAccountActivityLog", n = {"activityLog", "input"}, nl = {95}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class CloseAccountRepositoryImpl$createAccountActivityLog$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.createAccountActivityLog(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseAccountRepositoryImpl$createAccountActivityLog$1(com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl closeAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$createAccountActivityLog$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = closeAccountRepositoryImpl;
    }
}
