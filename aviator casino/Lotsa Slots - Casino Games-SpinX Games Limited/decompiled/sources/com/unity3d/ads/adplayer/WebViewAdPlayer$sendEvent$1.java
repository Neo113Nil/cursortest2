package com.unity3d.ads.adplayer;

/* compiled from: WebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0}, l = {229, 243}, m = "sendEvent", n = {"this", "getEvent"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class WebViewAdPlayer$sendEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.adplayer.WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendEvent$1(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1> continuation) {
        super(continuation);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object sendEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendEvent = this.this$0.sendEvent(null, this);
        return sendEvent;
    }
}
