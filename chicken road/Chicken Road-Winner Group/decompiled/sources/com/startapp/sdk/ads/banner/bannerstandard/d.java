package com.startapp.sdk.ads.banner.bannerstandard;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f2937b;

    public d(BannerStandard bannerStandard, String str) {
        this.f2937b = bannerStandard;
        this.f2936a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2937b.reloadImpl(this.f2936a);
    }
}
