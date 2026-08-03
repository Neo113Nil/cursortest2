package com.vungle.ads;

/* compiled from: BaseAd.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/FullscreenAd;", "Lcom/vungle/ads/Ad;", "play", "", "context", "Landroid/content/Context;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface FullscreenAd extends com.vungle.ads.Ad {
    void play(android.content.Context context);

    /* compiled from: BaseAd.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(com.vungle.ads.FullscreenAd fullscreenAd, android.content.Context context, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }
}
