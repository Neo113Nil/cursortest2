package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public NotDisplayedReason f3801a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f3802b;

    /* renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.ads.nativead.f f3803c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3804d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3805e;
    public final Point f;

    /* renamed from: g, reason: collision with root package name */
    public final xf f3806g;

    /* renamed from: h, reason: collision with root package name */
    public final BannerOptions f3807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3808i;

    public gk(View view, Point point, xf xfVar, BannerOptions bannerOptions) {
        this.f3801a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f3804d = new Handler(Looper.getMainLooper());
        this.f3808i = true;
        this.f3805e = new WeakReference(view);
        this.f = point;
        this.f3806g = xfVar;
        this.f3807h = bannerOptions;
    }

    public final void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            xf xfVar = this.f3806g;
            if (xfVar != null && (notDisplayedReason = this.f3801a) != null) {
                xfVar.a(notDisplayedReason.toString(), this.f3802b);
            }
            this.f3804d.removeCallbacksAndMessages(null);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        NotDisplayedReason notDisplayedReason;
        AtomicReference atomicReference = new AtomicReference();
        NotDisplayedReason notDisplayedReason2 = fk.a((View) this.f3805e.get(), this.f, this.f3807h, atomicReference, false).f3937d;
        if (notDisplayedReason2 != null && ((notDisplayedReason = this.f3801a) == null || notDisplayedReason.a() <= notDisplayedReason2.a())) {
            this.f3801a = notDisplayedReason2;
            this.f3802b = (JSONObject) atomicReference.get();
        }
        return notDisplayedReason2 == null;
    }

    public final boolean c() {
        xf xfVar = this.f3806g;
        return (xfVar == null || xfVar.f4643j.get() != 0 || this.f3805e.get() == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                a();
                return;
            }
            boolean b3 = b();
            if (b3 && this.f3808i) {
                this.f3808i = false;
                this.f3806g.c();
            } else if (!b3 && !this.f3808i) {
                this.f3808i = true;
                this.f3806g.a();
                com.startapp.sdk.ads.nativead.f fVar = this.f3803c;
                if (fVar != null) {
                    fVar.a();
                }
            }
            this.f3804d.postDelayed(this, 100L);
        } catch (Throwable unused) {
            this.f3801a = NotDisplayedReason.INTERNAL_ERROR;
            a();
        }
    }

    public gk(WeakReference weakReference, xf xfVar, BannerOptions bannerOptions) {
        this.f3801a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;
        this.f3804d = new Handler(Looper.getMainLooper());
        this.f3808i = true;
        this.f3805e = weakReference;
        this.f = null;
        this.f3806g = xfVar;
        this.f3807h = bannerOptions;
    }
}
