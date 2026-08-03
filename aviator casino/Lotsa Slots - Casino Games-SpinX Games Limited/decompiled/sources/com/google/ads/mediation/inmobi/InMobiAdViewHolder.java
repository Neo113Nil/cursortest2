package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiAdViewHolder {
    private final android.widget.FrameLayout frameLayout;

    InMobiAdViewHolder(android.widget.FrameLayout frameLayout) {
        this.frameLayout = frameLayout;
    }

    public android.widget.FrameLayout getFrameLayout() {
        return this.frameLayout;
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        this.frameLayout.setLayoutParams(layoutParams);
    }

    public void addView(com.google.ads.mediation.inmobi.InMobiBannerWrapper inMobiBannerWrapper) {
        this.frameLayout.addView(inMobiBannerWrapper.getInMobiBanner());
    }
}
