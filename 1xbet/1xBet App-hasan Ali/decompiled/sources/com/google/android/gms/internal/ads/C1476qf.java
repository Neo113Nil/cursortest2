package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476qf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15145a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f15146b;

    public /* synthetic */ C1476qf(CD cd, int i) {
        this.f15145a = i;
        this.f15146b = cd;
    }

    public T2.I a() {
        return ((C0568Cd) this.f15146b.d()).d();
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        int i = 1;
        CD cd = this.f15146b;
        switch (this.f15145a) {
            case 0:
                return a();
            case 1:
                return new Q4((P2.g) cd.d());
            case 2:
                Ll ll = (Ll) cd.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                Set singleton = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8667C1)).booleanValue() ? Collections.singleton(new Si(ll, c0606Hd)) : Collections.EMPTY_SET;
                AbstractC1400ot.D(singleton);
                return singleton;
            case 3:
                return new Nn((C0900dl) cd.d());
            case 4:
                return new C1126io((C0900dl) cd.d());
            case 5:
                Ik ik = (Ik) cd.d();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new C0995fr(ik, c0606Hd2);
            case 6:
                return new U2.m((String) cd.d());
            case 7:
                return new C0720Xf((Ul) cd.d(), 0);
            case 8:
                return new C0761ag(0, (Ul) cd.d());
            case 9:
                return new C0734Zf(i, (Kq) cd.d());
            case 10:
                return new C0734Zf();
            case 11:
                return new C0720Xf((Ul) cd.d(), 1);
            case 12:
                return new C0573Da(((C1875za) cd.d()).f16589a);
            case 13:
                Set singleton2 = Collections.singleton(new Si((C0707Vg) cd.d(), AbstractC0613Id.f9544g));
                AbstractC1400ot.D(singleton2);
                return singleton2;
            case 14:
                return new Si((C0700Ug) cd.d(), AbstractC0613Id.f);
            case 15:
                return new Si((C0700Ug) cd.d(), AbstractC0613Id.f);
            case 16:
                Set singleton3 = Collections.singleton(new Si((C0707Vg) cd.d(), AbstractC0613Id.f9544g));
                AbstractC1400ot.D(singleton3);
                return singleton3;
            case 17:
                C0728Yg c0728Yg = (C0728Yg) cd.d();
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new Si(c0728Yg, c0606Hd3);
            case 18:
                return new C1163jh((Yh) cd.d());
            case 19:
                C1164ji c1164ji = (C1164ji) cd.d();
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new Si(c1164ji, c0606Hd4);
            case 20:
                C1164ji c1164ji2 = (C1164ji) cd.d();
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                return new Si(c1164ji2, c0606Hd5);
            case C1639u7.zzm /* 21 */:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 22:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 23:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 24:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 25:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 26:
                return new Si((C1343nh) cd.d(), AbstractC0613Id.f9544g);
            case 27:
                Si si = new Si((C1522rh) cd.d(), AbstractC0613Id.f9544g);
                int i5 = AbstractC1177jv.f14189m;
                return new Jv(si);
            case 28:
                Si si2 = new Si((C1522rh) cd.d(), AbstractC0613Id.f9544g);
                int i6 = AbstractC1177jv.f14189m;
                return new Jv(si2);
            default:
                Xi xi = (Xi) cd.d();
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                return new Si(xi, c0606Hd6);
        }
    }

    public /* synthetic */ C1476qf(m2.g gVar, CD cd, int i) {
        this.f15145a = i;
        this.f15146b = cd;
    }
}
