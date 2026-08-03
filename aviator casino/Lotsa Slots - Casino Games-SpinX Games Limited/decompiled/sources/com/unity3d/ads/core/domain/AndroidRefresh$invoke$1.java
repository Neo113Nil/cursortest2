package com.unity3d.ads.core.domain;

/* compiled from: AndroidRefresh.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", i = {}, l = {25}, m = "invoke", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidRefresh$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidRefresh$invoke$1(com.unity3d.ads.core.domain.AndroidRefresh androidRefresh, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidRefresh$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidRefresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
