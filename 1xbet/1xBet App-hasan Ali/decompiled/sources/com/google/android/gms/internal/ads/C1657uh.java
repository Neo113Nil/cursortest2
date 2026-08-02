package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1657uh implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15887a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f15888b;

    /* renamed from: c, reason: collision with root package name */
    public final C1745wf f15889c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f15890d;

    public /* synthetic */ C1657uh(C1565sf c1565sf, C1745wf c1745wf, CD cd, int i) {
        this.f15887a = i;
        this.f15888b = c1565sf;
        this.f15889c = c1745wf;
        this.f15890d = cd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        C1875za c1875za;
        switch (this.f15887a) {
            case 0:
                Context a5 = this.f15888b.a();
                Nr nr = (Nr) this.f15890d.d();
                U2.a a6 = this.f15889c.a();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1612th(a5, nr, a6, c0606Hd);
            case 1:
                Context a7 = this.f15888b.a();
                U2.a a8 = this.f15889c.a();
                Nr nr2 = (Nr) this.f15890d.d();
                synchronized (new Object()) {
                    Context applicationContext = a7.getApplicationContext();
                    if (applicationContext != null) {
                        a7 = applicationContext;
                    }
                    c1875za = new C1875za(a7, a8, (String) Q2.r.f5053d.f5056c.a(F7.f8796a), nr2);
                }
                return c1875za;
            default:
                return new Nr(this.f15888b.a(), this.f15889c.a(), (C0855cl) this.f15890d.d(), new V9(14));
        }
    }

    public C1657uh(C1565sf c1565sf, CD cd, C1745wf c1745wf) {
        this.f15887a = 0;
        this.f15888b = c1565sf;
        this.f15890d = cd;
        this.f15889c = c1745wf;
    }
}
