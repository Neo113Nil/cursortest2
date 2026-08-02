package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.Statsig", f = "Statsig.kt", i = {}, l = {com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE}, m = "shutdownSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Statsig$shutdownSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.Statsig this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shutdownSuspend(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Statsig$shutdownSuspend$1(com.statsig.androidsdk.Statsig statsig, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.Statsig$shutdownSuspend$1> continuation) {
        super(continuation);
        this.this$0 = statsig;
    }
}
