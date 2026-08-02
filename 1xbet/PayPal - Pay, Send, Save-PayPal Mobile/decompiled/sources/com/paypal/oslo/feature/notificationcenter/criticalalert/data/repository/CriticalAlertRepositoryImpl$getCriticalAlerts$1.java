package com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl", f = "CriticalAlertRepositoryImpl.kt", i = {}, l = {48}, m = "getCriticalAlerts", n = {}, nl = {49}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertRepositoryImpl$getCriticalAlerts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCriticalAlerts(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertRepositoryImpl$getCriticalAlerts$1(com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl criticalAlertRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$getCriticalAlerts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = criticalAlertRepositoryImpl;
    }
}
