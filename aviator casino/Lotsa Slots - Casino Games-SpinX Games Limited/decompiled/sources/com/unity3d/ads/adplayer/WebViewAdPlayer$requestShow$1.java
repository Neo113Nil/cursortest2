package com.unity3d.ads.adplayer;

/* compiled from: WebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0, 0, 1, 1, 1}, l = {201, 202, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "requestShow", n = {"this", "unityAdsShowOptions", "it", "this", "unityAdsShowOptions", "it"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class WebViewAdPlayer$requestShow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.adplayer.WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$requestShow$1(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1> continuation) {
        super(continuation);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestShow(null, this);
    }
}
