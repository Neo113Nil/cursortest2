package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl", f = "UserStoreImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m = "handleProfileError", n = {"error"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$handleProfileError$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStoreImpl$handleProfileError$1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$handleProfileError$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = userStoreImpl;
    }
}
