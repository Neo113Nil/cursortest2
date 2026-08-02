package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl", f = "ProcessAuthIntentUseCaseImpl.kt", i = {0, 0, 1, 1}, l = {52, 56}, m = "invoke", n = {"authIntent", "profileIntent", "authIntent", "profileIntent"}, nl = {55, 57}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ProcessAuthIntentUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessAuthIntentUseCaseImpl$invoke$1(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl processAuthIntentUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = processAuthIntentUseCaseImpl;
    }
}
