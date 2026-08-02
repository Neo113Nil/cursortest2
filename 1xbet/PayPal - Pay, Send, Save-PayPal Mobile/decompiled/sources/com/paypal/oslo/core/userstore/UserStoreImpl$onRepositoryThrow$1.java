package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl", f = "UserStoreImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "onRepositoryThrow", n = {"e", "attempt"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$onRepositoryThrow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI((java.lang.Exception) null, 0, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStoreImpl$onRepositoryThrow$1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$onRepositoryThrow$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = userStoreImpl;
    }
}
