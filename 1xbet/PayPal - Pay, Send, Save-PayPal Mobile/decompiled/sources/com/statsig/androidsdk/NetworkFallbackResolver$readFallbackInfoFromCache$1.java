package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.NetworkFallbackResolver", f = "NetworkFallbackResolver.kt", i = {0}, l = {137}, m = "readFallbackInfoFromCache", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class NetworkFallbackResolver$readFallbackInfoFromCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.NetworkFallbackResolver this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readFallbackInfoFromCache(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFallbackResolver$readFallbackInfoFromCache$1(com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$1> continuation) {
        super(continuation);
        this.this$0 = networkFallbackResolver;
    }
}
