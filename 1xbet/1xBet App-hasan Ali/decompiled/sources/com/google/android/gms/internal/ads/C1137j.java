package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137j {

    /* renamed from: a, reason: collision with root package name */
    public final C1829yH f14028a;

    /* renamed from: b, reason: collision with root package name */
    public final C1049h f14029b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoreographerFrameCallbackC1094i f14030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14031d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f14032e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f14033g;

    /* renamed from: h, reason: collision with root package name */
    public float f14034h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f14035j;

    /* renamed from: k, reason: collision with root package name */
    public long f14036k;

    /* renamed from: l, reason: collision with root package name */
    public long f14037l;

    /* renamed from: m, reason: collision with root package name */
    public long f14038m;

    /* renamed from: n, reason: collision with root package name */
    public long f14039n;

    /* renamed from: o, reason: collision with root package name */
    public long f14040o;

    /* renamed from: p, reason: collision with root package name */
    public long f14041p;

    /* renamed from: q, reason: collision with root package name */
    public long f14042q;

    public C1137j(Context context) {
        DisplayManager displayManager;
        C1829yH c1829yH = new C1829yH();
        c1829yH.f16428a = new C1784xH();
        c1829yH.f16429b = new C1784xH();
        c1829yH.f16431d = -9223372036854775807L;
        this.f14028a = c1829yH;
        C1049h c1049h = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C1049h(this, displayManager);
        this.f14029b = c1049h;
        this.f14030c = c1049h != null ? ChoreographerFrameCallbackC1094i.f13841o : null;
        this.f14036k = -9223372036854775807L;
        this.f14037l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.f14035j = 0;
    }

    public static /* bridge */ /* synthetic */ void a(C1137j c1137j, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c1137j.f14036k = refreshRate;
            c1137j.f14037l = (refreshRate * 80) / 100;
        } else {
            JB.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c1137j.f14036k = -9223372036854775807L;
            c1137j.f14037l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (AbstractC1260lo.f14419a < 30 || (surface = this.f14032e) == null || this.f14035j == Integer.MIN_VALUE || this.f14034h == 0.0f) {
            return;
        }
        this.f14034h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e3) {
            JB.g("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }

    public final void c() {
        float f;
        if (AbstractC1260lo.f14419a < 30 || this.f14032e == null) {
            return;
        }
        C1829yH c1829yH = this.f14028a;
        if (!c1829yH.f16428a.c()) {
            f = this.f;
        } else if (c1829yH.f16428a.c()) {
            f = (float) (1.0E9d / (c1829yH.f16428a.f16285e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f5 = this.f14033g;
        if (f != f5) {
            if (f != -1.0f && f5 != -1.0f) {
                float f6 = 1.0f;
                if (c1829yH.f16428a.c()) {
                    if ((c1829yH.f16428a.c() ? c1829yH.f16428a.f : -9223372036854775807L) >= 5000000000L) {
                        f6 = 0.02f;
                    }
                }
                if (Math.abs(f - this.f14033g) < f6) {
                    return;
                }
            } else if (f == -1.0f && c1829yH.f16432e < 30) {
                return;
            }
            this.f14033g = f;
            d(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z3) {
        Surface surface;
        float f;
        if (AbstractC1260lo.f14419a < 30 || (surface = this.f14032e) == null || this.f14035j == Integer.MIN_VALUE) {
            return;
        }
        try {
            if (this.f14031d) {
                float f5 = this.f14033g;
                if (f5 != -1.0f) {
                    f = f5 * this.i;
                    if (z3 && this.f14034h == f) {
                        return;
                    }
                    this.f14034h = f;
                    surface.setFrameRate(f, f != 0.0f ? 0 : 1);
                    return;
                }
            }
            surface.setFrameRate(f, f != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e3) {
            JB.g("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
            return;
        }
        f = 0.0f;
        if (z3) {
        }
        this.f14034h = f;
    }
}
