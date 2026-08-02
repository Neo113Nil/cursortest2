package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl", f = "SessionRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {101}, m = "pollForSession", n = {"sessionInfo", "statusResolution", "input", "isLastPollCall"}, nl = {107}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class SessionRepositoryImpl$pollForSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.pollForSession(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRepositoryImpl$pollForSession$1(com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl sessionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$pollForSession$1> continuation) {
        super(continuation);
        this.getInputFormats = sessionRepositoryImpl;
    }
}
