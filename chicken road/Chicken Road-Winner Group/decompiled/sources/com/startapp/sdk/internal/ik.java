package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3887a;

    public ik(View view, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3887a = handler;
        handler.postDelayed(new hk(this, new WeakReference(view), point, bannerOptions, eVar), 100L);
    }
}
