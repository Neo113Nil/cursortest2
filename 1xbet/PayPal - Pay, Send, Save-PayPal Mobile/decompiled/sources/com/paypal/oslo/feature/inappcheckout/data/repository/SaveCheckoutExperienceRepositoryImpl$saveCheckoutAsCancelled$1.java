package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl", f = "SaveCheckoutExperienceRepositoryImpl.kt", i = {0, 0}, l = {56}, m = "saveCheckoutAsCancelled", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "mutation"}, nl = {136}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.saveCheckoutAsCancelled(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1(com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl saveCheckoutExperienceRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl$saveCheckoutAsCancelled$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = saveCheckoutExperienceRepositoryImpl;
    }
}
