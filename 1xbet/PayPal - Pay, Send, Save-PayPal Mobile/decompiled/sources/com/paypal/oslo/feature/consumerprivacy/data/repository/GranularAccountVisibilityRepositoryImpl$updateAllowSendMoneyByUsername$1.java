package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl", f = "GranularAccountVisibilityRepositoryImpl.kt", i = {0}, l = {95}, m = "updateAllowSendMoneyByUsername", n = {"allowSendMoneyByUsername"}, nl = {203}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updateAllowSendMoneyByUsername(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1(com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl granularAccountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = granularAccountVisibilityRepositoryImpl;
    }
}
