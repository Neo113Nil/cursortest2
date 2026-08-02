package com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl", f = "CriticalAlertRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {63}, m = "trackAlert", n = {"alertData", "status", "$this$flatMap$iv", "input", "$i$f$flatMap", "$i$a$-flatMap-CriticalAlertRepositoryImpl$trackAlert$2"}, nl = {64}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertRepositoryImpl$trackAlert$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.trackAlert(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertRepositoryImpl$trackAlert$1(com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl criticalAlertRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.data.repository.CriticalAlertRepositoryImpl$trackAlert$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = criticalAlertRepositoryImpl;
    }
}
