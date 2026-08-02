package com.bumptech.glide.load;

import p000.ec0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: j */
    public final boolean f1314j;

    ImageHeaderParser$ImageType(boolean z) {
        this.f1314j = z;
    }

    public boolean hasAlpha() {
        return this.f1314j;
    }

    public boolean isWebp() {
        int i = ec0.f2057a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
