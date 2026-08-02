package com.paypal.oslo.feature.p2p.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils", f = "UserPaymentUtils.kt", i = {0}, l = {30}, m = "getUserEmail", n = {"userStore"}, nl = {36}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class UserPaymentUtils$getUserEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getUserEmail(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserPaymentUtils$getUserEmail$1(com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils userPaymentUtils, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = userPaymentUtils;
    }
}
