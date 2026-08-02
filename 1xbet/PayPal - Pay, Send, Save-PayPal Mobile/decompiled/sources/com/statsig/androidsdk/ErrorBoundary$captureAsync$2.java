package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.ErrorBoundary", f = "ErrorBoundary.kt", i = {0, 0}, l = {87, 90}, m = "captureAsync", n = {"this", "recover"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ErrorBoundary$captureAsync$2<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.ErrorBoundary this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.captureAsync(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorBoundary$captureAsync$2(com.statsig.androidsdk.ErrorBoundary errorBoundary, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.ErrorBoundary$captureAsync$2> continuation) {
        super(continuation);
        this.this$0 = errorBoundary;
    }
}
