package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class h {
    public static final String d = IAlog.a(h.class);

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.r f5338a;
    public final int b;
    public final x0 c;

    public h(x0 x0Var) {
        this.c = x0Var;
        com.fyber.inneractive.sdk.config.r rVar = IAConfigManager.R.u.b;
        this.f5338a = rVar;
        this.b = rVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(m mVar) {
        b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        if (mVar.f5350a.size() < 1) {
            return;
        }
        b a2 = mVar.a();
        com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
        Iterator it = mVar.f5350a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (b) it.next();
                if (bVar.i() == iVar) {
                    break;
                }
            }
        }
        if (this.c.f5419a >= 0) {
            if (a2 == null) {
                IAlog.a("%sapplyEndcardTimeUnderPolicy was called with a null endcard", d);
                return;
            } else {
                IAlog.a("%s: applying endcard time under skip/close policy", d);
                a2.f = this.c.b;
                return;
            }
        }
        if (a2 != null && a2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && a2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && a2.l() && (oVar = a2.c.e.f) != null && oVar.d && bVar != null && bVar.l()) {
            a(a2, bVar.l());
            a(bVar, true, a2.k());
        } else if (a2 == bVar || a2 == null || a2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
            a(a2, false, false);
        } else {
            a(a2, false);
        }
    }

    public final void a(b bVar, boolean z) {
        int b;
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", d);
            return;
        }
        if (bVar.k()) {
            if (z) {
                b = this.f5338a.b("d_e_pl_dl_pl", this.b, 0);
            } else {
                b = this.f5338a.b("d_e_pl", this.b, 0);
            }
        } else if (z) {
            b = this.f5338a.b("d_e_npl_dl_npl", this.b, 0);
        } else {
            b = this.f5338a.b("d_e_npl", this.b, 0);
        }
        bVar.f = b;
    }

    public final void a(b bVar, boolean z, boolean z2) {
        int b;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z) {
            b = this.f5338a.b("d_e_def", this.b, 0);
        } else if (z2) {
            b = this.f5338a.b("d_e_pl_dl_dl", this.b, 0);
        } else {
            b = this.f5338a.b("d_e_npl_dl_dl", this.b, 0);
        }
        bVar.f = b;
    }
}
