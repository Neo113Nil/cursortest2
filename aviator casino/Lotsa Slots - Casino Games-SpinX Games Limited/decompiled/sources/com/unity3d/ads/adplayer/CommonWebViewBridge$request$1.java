package com.unity3d.ads.adplayer;

/* compiled from: CommonWebViewBridge.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", i = {0}, l = {77, 79}, m = "request", n = {"callback"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class CommonWebViewBridge$request$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.adplayer.CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$request$1(com.unity3d.ads.adplayer.CommonWebViewBridge commonWebViewBridge, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.CommonWebViewBridge$request$1> continuation) {
        super(continuation);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.request(null, null, null, this);
    }
}
