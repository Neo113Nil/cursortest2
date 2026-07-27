package com.startapp.sdk.ads.banner;

/* loaded from: classes.dex */
public class BannerSize {
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    public BannerSize(int i3, int i4) {
        this.width = i3;
        this.height = i4;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
