package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.ErrorBoundary", f = "ErrorBoundary.kt", i = {0}, l = {79}, m = "captureAsync", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ErrorBoundary$captureAsync$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.ErrorBoundary this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.captureAsync(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorBoundary$captureAsync$1(com.statsig.androidsdk.ErrorBoundary errorBoundary, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.ErrorBoundary$captureAsync$1> continuation) {
        super(continuation);
        this.this$0 = errorBoundary;
    }
}
