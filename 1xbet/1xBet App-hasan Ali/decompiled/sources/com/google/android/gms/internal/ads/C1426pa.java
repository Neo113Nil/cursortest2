package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426pa implements InterfaceC0648Nd, InterfaceC0641Md {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1515ra f14992k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Jr f14993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4.m f14994m;

    public /* synthetic */ C1426pa(C4.m mVar, C1515ra c1515ra, Jr jr) {
        this.f14992k = c1515ra;
        this.f14993l = jr;
        this.f14994m = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0641Md
    /* renamed from: a */
    public void mo16a() {
        Nr nr;
        T2.G.m("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f14994m.f) {
            try {
                T2.G.m("loadNewJavascriptEngine (failure): Lock acquired");
                this.f14994m.f908a = 1;
                T2.G.m("Failed loading new engine. Marking new engine destroyable.");
                this.f14992k.r();
                if (((Boolean) AbstractC0834c8.f12978d.s()).booleanValue() && (nr = (Nr) this.f14994m.f912e) != null) {
                    Jr jr = this.f14993l;
                    jr.C("Failed loading new engine");
                    jr.g(false);
                    nr.b(jr.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        T2.G.m("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo13k(Object obj) {
        Nr nr;
        T2.G.m("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f14994m.f) {
            try {
                T2.G.m("loadNewJavascriptEngine (success): Lock acquired");
                C4.m mVar = this.f14994m;
                mVar.f908a = 0;
                C1515ra c1515ra = (C1515ra) mVar.f913g;
                if (c1515ra != null && this.f14992k != c1515ra) {
                    T2.G.m("New JS engine is loaded, marking previous one as destroyable.");
                    ((C1515ra) this.f14994m.f913g).r();
                }
                this.f14994m.f913g = this.f14992k;
                if (((Boolean) AbstractC0834c8.f12978d.s()).booleanValue() && (nr = (Nr) this.f14994m.f912e) != null) {
                    Jr jr = this.f14993l;
                    jr.g(true);
                    nr.b(jr.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        T2.G.m("loadNewJavascriptEngine (success): Lock released");
    }
}
