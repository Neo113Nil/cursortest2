package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl", f = "GranularAccountVisibilityRepositoryImpl.kt", i = {0}, l = {73}, m = "updateAllowSendMoneyByName", n = {"allowSendMoneyByName"}, nl = {203}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateAllowSendMoneyByName(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1(com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl granularAccountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = granularAccountVisibilityRepositoryImpl;
    }
}
