package com.applovin.impl.mediation;

import com.applovin.impl.g3;
import com.applovin.impl.i0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final l f4324a;
    private final p b;
    private final a c;
    private i0 d;

    public interface a {
        void a(g3 g3Var);
    }

    c(l lVar, a aVar) {
        this.f4324a = lVar;
        this.b = lVar.Q();
        this.c = aVar;
    }

    public void a(final g3 g3Var, long j) {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = i0.a(j, this.f4324a, new Runnable() { // from class: com.applovin.impl.mediation.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(g3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g3 g3Var) {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.c.a(g3Var);
    }

    public void a() {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.a();
            this.d = null;
        }
    }
}
