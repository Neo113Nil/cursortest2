package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.unity3d.ads.adplayer.DisplayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    AndroidFullscreenWebViewAdPlayer$show$3(java.lang.Object obj) {
        super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.adplayer.DisplayMessage displayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object show$displayEventsRouter;
        show$displayEventsRouter = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, continuation);
        return show$displayEventsRouter;
    }
}
