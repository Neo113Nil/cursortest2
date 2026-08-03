package com.inmobi.ads.banner;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/inmobi/ads/banner/InMobiBannerAudioManager;", "", "Landroid/view/ViewGroup;", "T", "t", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "", "setAudioListener", "(Landroid/view/ViewGroup;Lcom/inmobi/ads/banner/AudioListener;)V", "", "isEnabled", "setAudioEnabled", "(Z)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InMobiBannerAudioManager {
    public static final com.inmobi.ads.banner.InMobiBannerAudioManager INSTANCE = new com.inmobi.ads.banner.InMobiBannerAudioManager();

    public static com.inmobi.ads.InMobiBanner a(android.view.ViewGroup viewGroup) {
        com.inmobi.ads.InMobiBanner a2;
        if (viewGroup instanceof com.inmobi.ads.InMobiBanner) {
            if (viewGroup.getVisibility() == 0 && viewGroup.isShown()) {
                return (com.inmobi.ads.InMobiBanner) viewGroup;
            }
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof android.view.ViewGroup) && (a2 = a((android.view.ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final void setAudioEnabled(boolean isEnabled) {
        com.inmobi.media.C2323c9 c2323c9 = com.inmobi.media.C2323c9.c;
        com.inmobi.media.C2323c9.d.set(isEnabled);
    }

    @kotlin.jvm.JvmStatic
    public static final <T extends android.view.ViewGroup> void setAudioListener(T t, com.inmobi.ads.banner.AudioListener audioListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioListener, "audioListener");
        INSTANCE.getClass();
        com.inmobi.ads.InMobiBanner a2 = a(t);
        if (a2 == null || !a2.isAudioAd()) {
            return;
        }
        a2.setAudioListener(audioListener);
    }
}
