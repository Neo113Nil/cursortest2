package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0669Qd implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0683Sd f11205l;

    public /* synthetic */ RunnableC0669Qd(TextureViewSurfaceTextureListenerC0683Sd textureViewSurfaceTextureListenerC0683Sd, int i) {
        this.f11204k = i;
        this.f11205l = textureViewSurfaceTextureListenerC0683Sd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11204k) {
            case 0:
                C0711Wd c0711Wd = this.f11205l.f11553z;
                if (c0711Wd != null) {
                    c0711Wd.d();
                    break;
                }
                break;
            case 1:
                C0711Wd c0711Wd2 = this.f11205l.f11553z;
                if (c0711Wd2 != null) {
                    RunnableC0704Vd runnableC0704Vd = c0711Wd2.f12048o;
                    runnableC0704Vd.f11887l = false;
                    T2.H h3 = T2.L.f5672l;
                    h3.removeCallbacks(runnableC0704Vd);
                    h3.postDelayed(runnableC0704Vd, 250L);
                    h3.post(new RunnableC0697Ud(c0711Wd2, 1));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC0683Sd textureViewSurfaceTextureListenerC0683Sd = this.f11205l;
                C0711Wd c0711Wd3 = textureViewSurfaceTextureListenerC0683Sd.f11553z;
                if (c0711Wd3 != null) {
                    c0711Wd3.e();
                    textureViewSurfaceTextureListenerC0683Sd.f11553z.i();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC0683Sd textureViewSurfaceTextureListenerC0683Sd2 = this.f11205l;
                C0711Wd c0711Wd4 = textureViewSurfaceTextureListenerC0683Sd2.f11553z;
                if (c0711Wd4 != null) {
                    if (!textureViewSurfaceTextureListenerC0683Sd2.f11538A) {
                        c0711Wd4.h();
                        textureViewSurfaceTextureListenerC0683Sd2.f11538A = true;
                    }
                    textureViewSurfaceTextureListenerC0683Sd2.f11553z.f();
                    break;
                }
                break;
            default:
                C0711Wd c0711Wd5 = this.f11205l.f11553z;
                if (c0711Wd5 != null) {
                    c0711Wd5.e();
                    break;
                }
                break;
        }
    }
}
