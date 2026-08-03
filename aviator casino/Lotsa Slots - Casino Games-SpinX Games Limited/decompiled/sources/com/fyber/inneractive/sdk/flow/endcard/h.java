package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f3685a;
    public final int b;

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
        this.f3685a = oVar;
        this.b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, boolean z) {
        if (bVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", com.fyber.inneractive.sdk.util.IAlog.a(this));
        } else {
            bVar.f = bVar.k() ? z ? this.f3685a.b("d_e_pl_dl_pl", this.b, 0) : this.f3685a.b("d_e_pl", this.b, 0) : z ? this.f3685a.b("d_e_npl_dl_npl", this.b, 0) : this.f3685a.b("d_e_npl", this.b, 0);
        }
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, boolean z, boolean z2) {
        int b;
        if (bVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        if (!z) {
            b = this.f3685a.b("d_e_def", this.b, 0);
        } else if (z2) {
            b = this.f3685a.b("d_e_pl_dl_dl", this.b, 0);
        } else {
            b = this.f3685a.b("d_e_npl_dl_dl", this.b, 0);
        }
        bVar.f = b;
    }
}
