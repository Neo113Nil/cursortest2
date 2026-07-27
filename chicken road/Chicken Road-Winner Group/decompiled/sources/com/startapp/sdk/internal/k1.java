package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* loaded from: classes.dex */
public final class k1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f3944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.b f3945c;

    public k1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.f3945c = bVar;
        this.f3944b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f3943a) {
            return;
        }
        this.f3943a = true;
        this.f3944b.removeOnAttachStateChangeListener(this);
        this.f3944b.onReceiveAd(this.f3945c.f2888b.f2954d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
