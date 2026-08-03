package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$4 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.datasource.VolumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    AndroidFullscreenWebViewAdPlayer$show$4(java.lang.Object obj) {
        super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.data.datasource.VolumeSettingsChange volumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object handleVolumeSettingsChange;
        handleVolumeSettingsChange = ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, continuation);
        return handleVolumeSettingsChange;
    }
}
