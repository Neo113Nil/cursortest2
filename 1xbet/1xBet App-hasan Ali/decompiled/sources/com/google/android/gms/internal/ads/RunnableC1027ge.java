package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1027ge implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13593k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f13594l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13595m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13596n;

    public /* synthetic */ RunnableC1027ge(Object obj, boolean z3, long j5, int i) {
        this.f13593k = i;
        this.f13596n = obj;
        this.f13594l = z3;
        this.f13595m = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13593k) {
            case 0:
                ((TextureViewSurfaceTextureListenerC1117ie) this.f13596n).f13944m.g0(this.f13595m, this.f13594l);
                break;
            case 1:
                ((InterfaceC0677Re) this.f13596n).g0(this.f13595m, this.f13594l);
                break;
            default:
                ((C1028gf) this.f13596n).f13613k.g0(this.f13595m, this.f13594l);
                break;
        }
    }
}
