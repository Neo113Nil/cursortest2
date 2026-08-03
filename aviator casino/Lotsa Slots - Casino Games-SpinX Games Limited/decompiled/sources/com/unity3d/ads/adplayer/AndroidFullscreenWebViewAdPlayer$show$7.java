package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$7 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.model.SessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    AndroidFullscreenWebViewAdPlayer$show$7(java.lang.Object obj) {
        super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.data.model.SessionChange sessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object handleSessionChange;
        handleSessionChange = ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, continuation);
        return handleSessionChange;
    }
}
