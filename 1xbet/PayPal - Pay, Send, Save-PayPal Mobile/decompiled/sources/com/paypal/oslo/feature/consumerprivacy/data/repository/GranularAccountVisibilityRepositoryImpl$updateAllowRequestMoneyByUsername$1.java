package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl", f = "GranularAccountVisibilityRepositoryImpl.kt", i = {0}, l = {183}, m = "updateAllowRequestMoneyByUsername", n = {"allowRequestMoneyByUsername"}, nl = {203}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateAllowRequestMoneyByUsername(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1(com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl granularAccountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = granularAccountVisibilityRepositoryImpl;
    }
}
