package com.unity3d.ads.core.domain;

/* compiled from: CommonCleanAssets.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonCleanAssets", f = "CommonCleanAssets.kt", i = {0, 0, 1, 1, 1}, l = {18, 19}, m = "invoke", n = {"this", "startTime", "this", "startTime", "currentSize"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1"})
/* loaded from: classes5.dex */
final class CommonCleanAssets$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    long J$1;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.CommonCleanAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonCleanAssets$invoke$1(com.unity3d.ads.core.domain.CommonCleanAssets commonCleanAssets, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonCleanAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
