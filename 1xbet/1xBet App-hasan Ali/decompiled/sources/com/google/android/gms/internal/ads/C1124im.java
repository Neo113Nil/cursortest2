package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124im implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13981a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f13982b;

    /* renamed from: c, reason: collision with root package name */
    public final Hh f13983c;

    /* renamed from: d, reason: collision with root package name */
    public final C1565sf f13984d;

    /* renamed from: e, reason: collision with root package name */
    public final CD f13985e;

    public C1124im(CD cd, C1565sf c1565sf, Hh hh, CD cd2) {
        this.f13982b = cd;
        this.f13984d = c1565sf;
        this.f13983c = hh;
        this.f13985e = cd2;
    }

    public Oo a() {
        return new Oo((C1396op) this.f13982b.d(), this.f13983c.a(), this.f13984d.a(), (C0568Cd) this.f13985e.d(), 1);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        E3.a d5;
        switch (this.f13981a) {
            case 0:
                final Q4 q42 = (Q4) this.f13982b.d();
                final Context a5 = this.f13984d.a();
                Wq a6 = this.f13983c.a();
                long longValue = ((Long) this.f13985e.d()).longValue();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                int intValue = ((Integer) Q2.r.f5053d.f5056c.a(F7.f8685F2)).intValue();
                if (intValue == -1 || Integer.toString(intValue).equals(G4.d.P(G4.d.Q(a6.f12098d)))) {
                    P2.o.f4767B.f4776j.getClass();
                    if (System.currentTimeMillis() - longValue < ((Integer) r7.f5056c.a(F7.f8697H2)).intValue()) {
                        final int i = 0;
                        d5 = c0606Hd.d(new Callable() { // from class: com.google.android.gms.internal.ads.hm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i) {
                                    case 0:
                                        return q42.f11167b.f(a5);
                                    default:
                                        return q42.f11167b.c(a5);
                                }
                            }
                        });
                        AbstractC1400ot.D(d5);
                        return d5;
                    }
                }
                final int i5 = 1;
                d5 = c0606Hd.d(new Callable() { // from class: com.google.android.gms.internal.ads.hm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i5) {
                            case 0:
                                return q42.f11167b.f(a5);
                            default:
                                return q42.f11167b.c(a5);
                        }
                    }
                });
                AbstractC1400ot.D(d5);
                return d5;
            default:
                return a();
        }
    }

    public C1124im(CD cd, Hh hh, C1565sf c1565sf, CD cd2) {
        this.f13982b = cd;
        this.f13983c = hh;
        this.f13984d = c1565sf;
        this.f13985e = cd2;
    }
}
