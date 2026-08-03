package com.unity3d.ads.adplayer;

/* compiled from: EmbeddableAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddableAdPlayer extends com.unity3d.ads.adplayer.AdPlayer {

    /* compiled from: EmbeddableAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object destroy(com.unity3d.ads.adplayer.EmbeddableAdPlayer embeddableAdPlayer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object destroy = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, continuation);
            return destroy == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? destroy : kotlin.Unit.INSTANCE;
        }

        public static void show(com.unity3d.ads.adplayer.EmbeddableAdPlayer embeddableAdPlayer, com.unity3d.ads.adplayer.ShowOptions showOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
