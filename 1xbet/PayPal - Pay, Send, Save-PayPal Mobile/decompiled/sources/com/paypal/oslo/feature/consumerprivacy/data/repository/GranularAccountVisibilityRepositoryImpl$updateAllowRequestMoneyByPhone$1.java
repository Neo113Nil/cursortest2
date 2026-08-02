package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl", f = "GranularAccountVisibilityRepositoryImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m = "updateAllowRequestMoneyByPhone", n = {"allowRequestMoneyByPhone"}, nl = {203}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateAllowRequestMoneyByPhone(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1(com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl granularAccountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = granularAccountVisibilityRepositoryImpl;
    }
}
