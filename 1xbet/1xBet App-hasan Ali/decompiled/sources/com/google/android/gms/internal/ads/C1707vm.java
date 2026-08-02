package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707vm implements InterfaceC1752wm {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16037a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f16038b;

    /* renamed from: c, reason: collision with root package name */
    public final C1389oi f16039c;

    public C1707vm(Map map, C0606Hd c0606Hd, C1389oi c1389oi) {
        this.f16037a = map;
        this.f16038b = c0606Hd;
        this.f16039c = c1389oi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1752wm
    public final E3.a a(C1428pc c1428pc) {
        this.f16039c.D(c1428pc);
        E3.a Z4 = AbstractC1400ot.Z(new C0856cm(3));
        for (String str : ((String) Q2.r.f5053d.f5056c.a(F7.O7)).split(",")) {
            ID id = (ID) this.f16037a.get(str.trim());
            if (id != null) {
                Z4 = AbstractC1400ot.X(Z4, C0856cm.class, new C0565Ca(6, id, c1428pc), this.f16038b);
            }
        }
        Z4.a(new Kw(0, Z4, new C1529ro(22, this)), AbstractC0613Id.f9544g);
        return Z4;
    }
}
