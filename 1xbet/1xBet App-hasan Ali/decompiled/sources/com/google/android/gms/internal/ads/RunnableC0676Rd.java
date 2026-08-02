package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0676Rd implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11426k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11428m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0690Td f11429n;

    public /* synthetic */ RunnableC0676Rd(AbstractC0690Td abstractC0690Td, int i, int i5, int i6) {
        this.f11426k = i6;
        this.f11427l = i;
        this.f11428m = i5;
        this.f11429n = abstractC0690Td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11426k) {
            case 0:
                C0711Wd c0711Wd = ((TextureViewSurfaceTextureListenerC0683Sd) this.f11429n).f11553z;
                if (c0711Wd != null) {
                    c0711Wd.j(this.f11427l, this.f11428m);
                    break;
                }
                break;
            default:
                C0711Wd c0711Wd2 = ((TextureViewSurfaceTextureListenerC1117ie) this.f11429n).f13947p;
                if (c0711Wd2 != null) {
                    c0711Wd2.j(this.f11427l, this.f11428m);
                    break;
                }
                break;
        }
    }
}
