package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0982fe implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13475k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1117ie f13476l;

    public /* synthetic */ RunnableC0982fe(TextureViewSurfaceTextureListenerC1117ie textureViewSurfaceTextureListenerC1117ie, int i) {
        this.f13475k = i;
        this.f13476l = textureViewSurfaceTextureListenerC1117ie;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13475k) {
            case 0:
                C0711Wd c0711Wd = this.f13476l.f13947p;
                if (c0711Wd != null) {
                    c0711Wd.h();
                    break;
                }
                break;
            case 1:
                C0711Wd c0711Wd2 = this.f13476l.f13947p;
                if (c0711Wd2 != null) {
                    c0711Wd2.f();
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC1117ie textureViewSurfaceTextureListenerC1117ie = this.f13476l;
                C0937ee c0937ee = textureViewSurfaceTextureListenerC1117ie.f11653l;
                float f = c0937ee.f13319c ? c0937ee.f13321e ? 0.0f : c0937ee.f : 0.0f;
                C0614Ie c0614Ie = textureViewSurfaceTextureListenerC1117ie.f13949r;
                if (c0614Ie == null) {
                    U2.j.i("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        ME me = c0614Ie.f9557q;
                        if (me != null) {
                            me.f10609n.d();
                            C1109iE c1109iE = me.f10608m;
                            c1109iE.t0();
                            float max = Math.max(0.0f, Math.min(f, 1.0f));
                            if (c1109iE.f13901U != max) {
                                c1109iE.f13901U = max;
                                c1109iE.y1(1, 2, Float.valueOf(max * c1109iE.f13889G.f11346e));
                                Fz fz = new Fz(23);
                                Fk fk = c1109iE.f13921v;
                                fk.c(22, fz);
                                fk.b();
                                break;
                            } else {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        U2.j.j("", e3);
                        return;
                    }
                }
                break;
            case 3:
                C0711Wd c0711Wd3 = this.f13476l.f13947p;
                if (c0711Wd3 != null) {
                    c0711Wd3.i();
                    break;
                }
                break;
            case 4:
                C0711Wd c0711Wd4 = this.f13476l.f13947p;
                if (c0711Wd4 != null) {
                    c0711Wd4.e();
                    break;
                }
                break;
            case 5:
                C0711Wd c0711Wd5 = this.f13476l.f13947p;
                if (c0711Wd5 != null) {
                    RunnableC0704Vd runnableC0704Vd = c0711Wd5.f12048o;
                    runnableC0704Vd.f11887l = false;
                    T2.H h3 = T2.L.f5672l;
                    h3.removeCallbacks(runnableC0704Vd);
                    h3.postDelayed(runnableC0704Vd, 250L);
                    h3.post(new RunnableC0697Ud(c0711Wd5, 1));
                    break;
                }
                break;
            case 6:
                C0711Wd c0711Wd6 = this.f13476l.f13947p;
                if (c0711Wd6 != null) {
                    c0711Wd6.d();
                    break;
                }
                break;
            default:
                C0711Wd c0711Wd7 = this.f13476l.f13947p;
                if (c0711Wd7 != null) {
                    c0711Wd7.g();
                    break;
                }
                break;
        }
    }
}
