package com.startapp.sdk.ads.banner;

/* loaded from: classes.dex */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, 250),
    COVER(2, 300, 157);

    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i3, int i4, int i5) {
        this.type = i3;
        this.widthDp = i4;
        this.heightDp = i5;
    }
}
