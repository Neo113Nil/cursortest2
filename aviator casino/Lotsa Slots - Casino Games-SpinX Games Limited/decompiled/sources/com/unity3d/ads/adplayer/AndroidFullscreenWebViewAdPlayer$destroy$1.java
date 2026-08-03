package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0, 1, 2}, l = {192, 197, 201, 203}, m = "destroy", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class AndroidFullscreenWebViewAdPlayer$destroy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$destroy$1(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1> continuation) {
        super(continuation);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.destroy(this);
    }
}
