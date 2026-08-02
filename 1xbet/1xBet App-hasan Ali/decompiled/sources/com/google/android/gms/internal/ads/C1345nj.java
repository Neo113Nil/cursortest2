package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345nj implements InterfaceC0896dh {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14691a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14692b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f14693c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f14694d;

    /* renamed from: e, reason: collision with root package name */
    public final Kj f14695e;

    public C1345nj(Map map, Map map2, Map map3, CD cd, Kj kj) {
        this.f14691a = map;
        this.f14692b = map2;
        this.f14693c = map3;
        this.f14694d = cd;
        this.f14695e = kj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0896dh
    public final InterfaceC1259ln a(String str, int i) {
        InterfaceC1259ln a5;
        InterfaceC1259ln interfaceC1259ln = (InterfaceC1259ln) this.f14691a.get(str);
        if (interfaceC1259ln != null) {
            return interfaceC1259ln;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            Pn pn = (Pn) this.f14693c.get(str);
            if (pn != null) {
                return new C1304mn(pn, new C1364o1(5));
            }
            a5 = (InterfaceC1259ln) this.f14692b.get(str);
            if (a5 == null) {
                return null;
            }
        } else if (this.f14695e.f10214d == null || (a5 = ((InterfaceC0896dh) this.f14694d.d()).a(str, i)) == null) {
            return null;
        }
        return new C1304mn(a5, new C1364o1(6));
    }
}
