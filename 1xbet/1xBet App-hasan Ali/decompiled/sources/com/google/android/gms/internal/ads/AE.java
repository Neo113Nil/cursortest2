package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class AE implements InterfaceC1783xG, AF {

    /* renamed from: a, reason: collision with root package name */
    public final CE f7553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1170jo f7554b;

    public AE(C1170jo c1170jo, CE ce) {
        this.f7554b = c1170jo;
        this.f7553a = ce;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void a(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        Pair f = f(c1603tG);
        if (f != null) {
            ((C1439pn) this.f7554b.f14153t).b(new RunnableC1871zE(this, f, c1199kG, c1469qG, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void b(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        Pair f = f(c1603tG);
        if (f != null) {
            ((C1439pn) this.f7554b.f14153t).b(new RunnableC1871zE(this, f, c1199kG, c1469qG, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void c(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        Pair f = f(c1603tG);
        if (f != null) {
            ((C1439pn) this.f7554b.f14153t).b(new RunnableC1871zE(this, f, c1199kG, c1469qG, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void d(int i, C1603tG c1603tG, C1469qG c1469qG) {
        Pair f = f(c1603tG);
        if (f != null) {
            ((C1439pn) this.f7554b.f14153t).b(new RunnableC1362o(this, f, c1469qG, 10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void e(int i, C1603tG c1603tG, final C1199kG c1199kG, final C1469qG c1469qG, final IOException iOException, final boolean z3) {
        final Pair f = f(c1603tG);
        if (f != null) {
            ((C1439pn) this.f7554b.f14153t).b(new Runnable() { // from class: com.google.android.gms.internal.ads.yE
                @Override // java.lang.Runnable
                public final void run() {
                    SE se = (SE) AE.this.f7554b.f14152s;
                    Pair pair = f;
                    se.e(((Integer) pair.first).intValue(), (C1603tG) pair.second, c1199kG, c1469qG, iOException, z3);
                }
            });
        }
    }

    public final Pair f(C1603tG c1603tG) {
        C1603tG c1603tG2;
        CE ce = this.f7553a;
        C1603tG c1603tG3 = null;
        if (c1603tG != null) {
            int i = 0;
            while (true) {
                if (i >= ce.f7983c.size()) {
                    c1603tG2 = null;
                    break;
                }
                if (((C1603tG) ce.f7983c.get(i)).f15682d == c1603tG.f15682d) {
                    c1603tG2 = c1603tG.a(Pair.create(ce.f7982b, c1603tG.f15679a));
                    break;
                }
                i++;
            }
            if (c1603tG2 == null) {
                return null;
            }
            c1603tG3 = c1603tG2;
        }
        return Pair.create(Integer.valueOf(ce.f7984d), c1603tG3);
    }
}
