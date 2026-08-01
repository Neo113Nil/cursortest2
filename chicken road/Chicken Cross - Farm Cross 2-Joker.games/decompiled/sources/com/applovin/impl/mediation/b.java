package com.applovin.impl.mediation;

import com.applovin.impl.g3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.l;
import com.applovin.impl.x2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes5.dex */
public class b implements a.InterfaceC0076a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f4323a;
    private final c b;

    public b(l lVar) {
        this.f4323a = new a(lVar);
        this.b = new c(lVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(g3 g3Var) {
        h B;
        if (g3Var == null || (B = g3Var.B()) == null || !g3Var.x().compareAndSet(false, true)) {
            return;
        }
        g3Var.w().set(true);
        x2.e(B.c(), g3Var);
    }

    public void a() {
        this.b.a();
        this.f4323a.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0076a
    public void b(final g3 g3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c(g3Var);
            }
        }, g3Var.p0());
    }

    public void e(g3 g3Var) {
        long q0 = g3Var.q0();
        if (q0 >= 0) {
            this.b.a(g3Var, q0);
        }
        if (g3Var.B0() || g3Var.C0()) {
            this.f4323a.a(g3Var, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(g3 g3Var) {
        c(g3Var);
    }
}
