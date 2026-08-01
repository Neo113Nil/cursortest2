package com.applovin.impl;

import com.applovin.impl.i6;
import com.applovin.impl.u7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes5.dex */
class q6 extends n5 {
    private final y7 g;
    private final AppLovinAdLoadListener h;

    q6(y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderVastAd", lVar);
        this.h = appLovinAdLoadListener;
        this.g = y7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        d8 d8Var = null;
        h8 h8Var = null;
        x7 x7Var = null;
        w7 w7Var = null;
        String str2 = "";
        for (t8 t8Var : this.g.a()) {
            t8 b = t8Var.b(g8.b(t8Var) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
            if (b != null) {
                t8 b2 = b.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
                if (b2 != null) {
                    d8Var = d8.a(b2, d8Var, this.f4351a);
                }
                str = g8.a(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i, str);
                str2 = g8.a(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j, str2);
                g8.a(b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n), hashSet, this.g, this.f4351a);
                t8 c = b.c("ViewableImpression");
                if (c != null) {
                    g8.a(c.a("Viewable"), hashSet, this.g, this.f4351a);
                }
                t8 b3 = b.b("AdVerifications");
                if (b3 != null) {
                    w7Var = w7.a(b3, w7Var, this.g, this.f4351a);
                }
                g8.a(b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c), hashSet2, this.g, this.f4351a);
                t8 c2 = b.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
                if (c2 != null) {
                    for (t8 t8Var2 : c2.b()) {
                        t8 c3 = t8Var2.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
                        if (c3 != null) {
                            h8Var = h8.a(c3, h8Var, this.g, this.f4351a);
                        } else {
                            t8 b4 = t8Var2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
                            if (b4 != null) {
                                t8 b5 = b4.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M);
                                if (b5 != null) {
                                    x7Var = x7.a(b5, x7Var, this.g, this.f4351a);
                                }
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.c.b(this.b, "Received and will skip rendering for an unidentified creative: " + t8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Did not find wrapper or inline response for node: " + t8Var);
            }
        }
        u7 a2 = new u7.b().a(this.f4351a).a(this.g.b()).b(this.g.e()).a(this.g.c()).b(str).a(str2).a(d8Var).a(h8Var).a(x7Var).a(w7Var).b(hashSet).a(w7Var).a(hashSet2).a();
        z7 c4 = g8.c(a2);
        if (c4 != null) {
            g8.a(this.g, this.h, c4, -6, this.f4351a);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finished rendering VAST ad: " + a2);
        }
        a2.getAdEventTracker().e();
        this.f4351a.s0().a((n5) new s5(a2, this.f4351a, this.h), i6.b.CACHING);
    }
}
