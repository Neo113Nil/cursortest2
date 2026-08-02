package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948ep implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final C0568Cd f13350a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.g f13351b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13352c;

    /* renamed from: d, reason: collision with root package name */
    public final C0606Hd f13353d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13354e;

    public C0948ep(Context context, C0568Cd c0568Cd, ScheduledExecutorService scheduledExecutorService, C0606Hd c0606Hd) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8759S2)).booleanValue()) {
            this.f13351b = new v3.g(context);
        }
        this.f13354e = context;
        this.f13350a = c0568Cd;
        this.f13352c = scheduledExecutorService;
        this.f13353d = c0606Hd;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        D3.o d5;
        A7 a7 = F7.f8736O2;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            if (!((Boolean) rVar.f5056c.a(F7.f8764T2)).booleanValue()) {
                if (!((Boolean) rVar.f5056c.a(F7.f8742P2)).booleanValue()) {
                    return AbstractC1400ot.h0(AbstractC1400ot.d(this.f13351b.d()), new C1364o1(11), AbstractC0613Id.f9544g);
                }
                if (((Boolean) rVar.f5056c.a(F7.f8759S2)).booleanValue()) {
                    AbstractC1561sb.e(this.f13354e, false);
                    synchronized (AbstractC1561sb.f15516c0) {
                        d5 = AbstractC1561sb.f15512a0;
                    }
                } else {
                    d5 = this.f13351b.d();
                }
                if (d5 == null) {
                    return AbstractC1400ot.c0(new C0993fp(-1, 0, null));
                }
                E3.a j02 = AbstractC1400ot.j0(AbstractC1400ot.d(d5), new C0727Yf(11), AbstractC0613Id.f9544g);
                if (((Boolean) rVar.f5056c.a(F7.f8748Q2)).booleanValue()) {
                    j02 = AbstractC1400ot.l0(j02, ((Long) rVar.f5056c.a(F7.f8754R2)).longValue(), TimeUnit.MILLISECONDS, this.f13352c);
                }
                return AbstractC1400ot.U(j02, Exception.class, new C1383oc(4, this), this.f13353d);
            }
        }
        return AbstractC1400ot.c0(new C0993fp(-1, 0, null));
    }
}
