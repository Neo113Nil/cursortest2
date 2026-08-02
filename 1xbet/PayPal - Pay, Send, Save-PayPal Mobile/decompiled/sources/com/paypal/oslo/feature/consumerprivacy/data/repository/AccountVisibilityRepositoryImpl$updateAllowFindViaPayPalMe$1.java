package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl", f = "AccountVisibilityRepositoryImpl.kt", i = {0, 0}, l = {119}, m = "updateAllowFindViaPayPalMe", n = {"profileId", "allowFindViaPayPalMe"}, nl = {161}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateAllowFindViaPayPalMe(false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl accountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = accountVisibilityRepositoryImpl;
    }
}
