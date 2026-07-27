package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f3844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e f3845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik f3846e;

    public hk(ik ikVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f3846e = ikVar;
        this.f3842a = weakReference;
        this.f3843b = point;
        this.f3844c = bannerOptions;
        this.f3845d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk a3 = fk.a((View) this.f3842a.get(), this.f3843b, this.f3844c, new AtomicReference(), true);
        this.f3845d.a(a3.f3937d == null, a3);
        this.f3846e.f3887a.postDelayed(this, 100L);
    }
}
