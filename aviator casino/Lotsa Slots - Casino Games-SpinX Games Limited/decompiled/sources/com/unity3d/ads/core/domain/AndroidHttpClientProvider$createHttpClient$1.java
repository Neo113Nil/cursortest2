package com.unity3d.ads.core.domain;

/* compiled from: AndroidHttpClientProvider.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", i = {0, 0, 0}, l = {74}, m = "createHttpClient", n = {"this", "selectedHttpClient", "startTime"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes5.dex */
final class AndroidHttpClientProvider$createHttpClient$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClientProvider$createHttpClient$1(com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1> continuation) {
        super(continuation);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object createHttpClient;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createHttpClient = this.this$0.createHttpClient(this);
        return createHttpClient;
    }
}
