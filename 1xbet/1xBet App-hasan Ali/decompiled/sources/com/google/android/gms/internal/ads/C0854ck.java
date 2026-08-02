package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854ck implements Vh {

    /* renamed from: k, reason: collision with root package name */
    public final Gj f13030k;

    /* renamed from: l, reason: collision with root package name */
    public final Hj f13031l;

    /* renamed from: m, reason: collision with root package name */
    public final Executor f13032m;

    /* renamed from: n, reason: collision with root package name */
    public final Qw f13033n;

    public C0854ck(Gj gj, Hj hj, Executor executor, Qw qw) {
        this.f13030k = gj;
        this.f13031l = hj;
        this.f13032m = executor;
        this.f13033n = qw;
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        E3.a aVar;
        if (this.f13031l.f9458e) {
            Gj gj = this.f13030k;
            C1169jn T4 = gj.T();
            if (T4 == null) {
                synchronized (gj) {
                    aVar = gj.f9236m;
                }
                if (aVar != null && ((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue()) {
                    E3.a V4 = gj.V();
                    C0634Ld O5 = gj.O();
                    if (V4 == null || O5 == null) {
                        return;
                    }
                    Aw aw = new Aw(AbstractC1044gv.m(new E3.a[]{V4, O5}), false);
                    aw.a(new Kw(0, aw, new Qt(17, this)), this.f13033n);
                    return;
                }
            }
            if (T4 != null) {
                InterfaceC0677Re Q5 = gj.Q();
                InterfaceC0677Re R4 = gj.R();
                if (Q5 == null) {
                    Q5 = R4 != null ? R4 : null;
                }
                if (Q5 != null) {
                    this.f13032m.execute(new RunnableC0658Og(Q5, 3));
                }
            }
        }
    }
}
