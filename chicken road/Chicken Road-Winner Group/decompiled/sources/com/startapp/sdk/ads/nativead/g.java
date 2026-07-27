package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.ads.nativead.StartAppNativeAd;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3020a;

    static {
        int[] iArr = new int[StartAppNativeAd.CampaignAction.values().length];
        f3020a = iArr;
        try {
            iArr[StartAppNativeAd.CampaignAction.OPEN_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3020a[StartAppNativeAd.CampaignAction.LAUNCH_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
