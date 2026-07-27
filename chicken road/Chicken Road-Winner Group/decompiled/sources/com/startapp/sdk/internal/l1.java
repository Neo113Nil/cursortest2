package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* loaded from: classes.dex */
public final class l1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f3975b;

    public l1(m1 m1Var) {
        this.f3975b = m1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f3974a) {
            return;
        }
        this.f3974a = true;
        this.f3975b.f4025c.f2956b.removeOnAttachStateChangeListener(this);
        com.startapp.sdk.ads.banner.d dVar = this.f3975b.f4025c;
        BannerListener bannerListener = dVar.f2955a;
        if (bannerListener != null) {
            bannerListener.onReceiveAd(dVar.f2956b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
