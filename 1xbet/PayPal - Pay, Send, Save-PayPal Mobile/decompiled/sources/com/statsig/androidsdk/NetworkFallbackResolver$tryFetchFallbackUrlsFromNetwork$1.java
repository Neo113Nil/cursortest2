package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.NetworkFallbackResolver", f = "NetworkFallbackResolver.kt", i = {0, 0}, l = {111}, m = "tryFetchFallbackUrlsFromNetwork", n = {"urlConfig", "result"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.NetworkFallbackResolver this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object tryFetchFallbackUrlsFromNetwork;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryFetchFallbackUrlsFromNetwork = this.this$0.tryFetchFallbackUrlsFromNetwork(null, this);
        return tryFetchFallbackUrlsFromNetwork;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1(com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1> continuation) {
        super(continuation);
        this.this$0 = networkFallbackResolver;
    }
}
