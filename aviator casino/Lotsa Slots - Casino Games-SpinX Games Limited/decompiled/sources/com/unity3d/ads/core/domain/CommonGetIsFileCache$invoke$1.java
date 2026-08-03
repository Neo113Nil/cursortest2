package com.unity3d.ads.core.domain;

/* compiled from: CommonGetIsFileCache.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", i = {0, 0}, l = {18}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
final class CommonGetIsFileCache$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.CommonGetIsFileCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGetIsFileCache$invoke$1(com.unity3d.ads.core.domain.CommonGetIsFileCache commonGetIsFileCache, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetIsFileCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
