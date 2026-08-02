package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Set;
import q3.C2308a;

/* loaded from: classes.dex */
public final class Qo implements Mp {

    /* renamed from: d, reason: collision with root package name */
    public static String f11259d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11260a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11261b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11262c;

    public /* synthetic */ Qo(int i, Object obj, Object obj2) {
        this.f11260a = i;
        this.f11261b = obj;
        this.f11262c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f11260a) {
            case 0:
                return 4;
            case 1:
                return 10;
            case 2:
                return 54;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 27;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        switch (this.f11260a) {
            case 0:
                ((C2308a) this.f11261b).getClass();
                return AbstractC1400ot.c0(new Ro((Wq) this.f11262c, System.currentTimeMillis()));
            case 1:
                return ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8730N2)).booleanValue() ? AbstractC1400ot.c0(new Xo(1, null)) : AbstractC1400ot.h0(((C0568Cd) this.f11262c).e(), new C1364o1(10), (Qw) this.f11261b);
            case 2:
                return ((C0606Hd) this.f11261b).d(new S4(12, this));
            case 3:
                T2.G.m("HsdpMigrationSignal.produce");
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.rc)).booleanValue()) {
                    return AbstractC1400ot.c0(new C1710vp(null, 1));
                }
                boolean z3 = false;
                try {
                    if (((Intent) this.f11262c).resolveActivity(((Context) this.f11261b).getPackageManager()) != null) {
                        T2.G.m("HSDP intent is supported");
                        z3 = true;
                    }
                } catch (Exception e3) {
                    P2.o.f4767B.f4774g.i("HsdpMigrationSignal.isHsdpMigrationSupported", e3);
                }
                return AbstractC1400ot.c0(new C1710vp(Boolean.valueOf(z3), 1));
            case 4:
                return ((C0606Hd) this.f11261b).d(new S4(20, this));
            case 5:
                return ((C0606Hd) this.f11261b).d(new S4(22, this));
            case 6:
                Mw c02 = AbstractC1400ot.c0((String) this.f11262c);
                C1364o1 c1364o1 = new C1364o1(12);
                Qw qw = (Qw) this.f11261b;
                return AbstractC1400ot.X(AbstractC1400ot.h0(c02, c1364o1, qw), Throwable.class, new N9(13, this), qw);
            default:
                return ((C0606Hd) this.f11261b).d(new Xp(1, this));
        }
    }

    public Qo(U2.a aVar, C0606Hd c0606Hd) {
        this.f11260a = 2;
        this.f11262c = aVar;
        this.f11261b = c0606Hd;
    }

    public Qo(C0606Hd c0606Hd, Context context, Set set) {
        this.f11260a = 5;
        this.f11261b = c0606Hd;
        this.f11262c = set;
    }
}
