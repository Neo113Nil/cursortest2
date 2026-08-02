package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755wp implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16167a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f16168b;

    /* renamed from: c, reason: collision with root package name */
    public final DD f16169c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f16170d;

    public /* synthetic */ C1755wp(DD dd, ID id, ID id2, int i) {
        this.f16167a = i;
        this.f16169c = dd;
        this.f16168b = id;
        this.f16170d = id2;
    }

    public Oo a() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo((Object) c0606Hd, ((Mt) ((C0650Nf) this.f16169c).f10799b).f10741l, ((CD) this.f16168b).d(), (Object) ((KD) this.f16170d).d(), 4);
    }

    public Oo b() {
        Context a5 = ((C1565sf) this.f16169c).a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo(a5, c0606Hd, ((Hh) this.f16168b).a(), ((C1745wf) this.f16170d).a());
    }

    public Oo c() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo(c0606Hd, (Object) ((C1565sf) this.f16169c).a(), (Object) ((C1745wf) this.f16168b).a(), (Object) ((C1520rf) this.f16170d).c(), 7);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f16167a) {
            case 0:
                return a();
            case 1:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new Oo((Object) c0606Hd, (Object) ((Hh) this.f16169c).a(), ((CD) this.f16168b).d(), (Object) ((C1476qf) this.f16170d).a(), 5);
            case 2:
                return b();
            case 3:
                return c();
            default:
                AbstractC1400ot.D(((C1428pc) ((Zp) this.f16169c).f12528b.f834m).f14998n);
                C0568Cd c0568Cd = (C0568Cd) ((CD) this.f16168b).d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((CD) this.f16170d).d();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new Vo(c0568Cd, scheduledExecutorService, c0606Hd2);
        }
    }
}
