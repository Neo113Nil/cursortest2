package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ZettleSDKManager$initialize$tokenProvider$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange) this.receiver).exchangeTokenForAuthCode(continuation);
    }

    ZettleSDKManager$initialize$tokenProvider$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange.class, "exchangeTokenForAuthCode", "exchangeTokenForAuthCode(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
