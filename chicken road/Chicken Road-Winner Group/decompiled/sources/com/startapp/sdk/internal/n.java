package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.StartAppAd;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4075a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f4075a = iArr;
        try {
            iArr[StartAppAd.AdMode.OFFERWALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4075a[StartAppAd.AdMode.OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4075a[StartAppAd.AdMode.FULLPAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4075a[StartAppAd.AdMode.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4075a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4075a[StartAppAd.AdMode.AUTOMATIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
