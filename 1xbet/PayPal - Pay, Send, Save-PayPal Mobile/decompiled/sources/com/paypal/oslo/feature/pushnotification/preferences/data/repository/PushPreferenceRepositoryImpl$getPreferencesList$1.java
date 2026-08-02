package com.paypal.oslo.feature.pushnotification.preferences.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl", f = "PushPreferenceRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "getPreferencesList", n = {"deviceId", "raise$iv$iv$iv", "$this$getPreferencesList_u24lambda_u240", "request", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushPreferenceRepositoryImpl$getPreferencesList$2"}, nl = {35}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushPreferenceRepositoryImpl$getPreferencesList$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.getPreferencesList(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushPreferenceRepositoryImpl$getPreferencesList$1(com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl pushPreferenceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.preferences.data.repository.PushPreferenceRepositoryImpl$getPreferencesList$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = pushPreferenceRepositoryImpl;
    }
}
