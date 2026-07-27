package com.startapp.sdk.internal;

import com.startapp.sdk.ads.banner.BannerFormat;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4082a;

    static {
        int[] iArr = new int[BannerFormat.values().length];
        f4082a = iArr;
        try {
            iArr[BannerFormat.MREC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4082a[BannerFormat.COVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
