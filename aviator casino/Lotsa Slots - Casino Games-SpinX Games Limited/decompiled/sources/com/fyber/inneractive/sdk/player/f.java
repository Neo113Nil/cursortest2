package com.fyber.inneractive.sdk.player;

/* loaded from: classes3.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.q f4138a;
    public com.fyber.inneractive.sdk.flow.t0 b;
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest c;
    public com.fyber.inneractive.sdk.measurement.e d;
    public com.fyber.inneractive.sdk.measurement.f e;
    public com.fyber.inneractive.sdk.player.q l;
    public int m;
    public com.fyber.inneractive.sdk.model.vast.r n;
    public com.fyber.inneractive.sdk.player.p f = null;
    public boolean g = true;
    public boolean h = false;
    public volatile boolean i = false;
    public boolean j = false;
    public int k = 0;
    public final com.fyber.inneractive.sdk.player.c o = new com.fyber.inneractive.sdk.player.c(this);

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        java.lang.Boolean c;
        boolean booleanValue;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.q qVar2 = null;
        if (rVar != null) {
            try {
                c = ((com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c("use_fmp_cache_mechanism");
            } catch (java.lang.Throwable th) {
                if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Failed creating exo player", new java.lang.Object[0]);
                    th.printStackTrace();
                }
            }
            if (c != null) {
                booleanValue = c.booleanValue();
                qVar2 = new com.fyber.inneractive.sdk.player.controller.f(context, booleanValue, rVar);
                qVar2 = qVar2 == null ? new com.fyber.inneractive.sdk.player.controller.a(context) : qVar2;
                this.f4138a = qVar2;
                if (!qVar2.b.contains(this)) {
                    qVar2.b.add(this);
                }
                qVar = this.f4138a;
                if (!qVar.c.contains(this)) {
                    qVar.c.add(this);
                }
                this.f4138a.f = this.o;
            }
        }
        booleanValue = false;
        qVar2 = new com.fyber.inneractive.sdk.player.controller.f(context, booleanValue, rVar);
        if (qVar2 == null) {
        }
        this.f4138a = qVar2;
        if (!qVar2.b.contains(this)) {
        }
        qVar = this.f4138a;
        if (!qVar.c.contains(this)) {
        }
        this.f4138a.f = this.o;
    }

    public abstract void a(com.fyber.inneractive.sdk.external.InneractiveVideoError inneractiveVideoError, org.json.JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new org.json.JSONObject());
        if (this.h) {
            com.fyber.inneractive.sdk.util.IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new java.lang.Object[0]);
            a(new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new org.json.JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z) {
        try {
            com.fyber.inneractive.sdk.flow.t0 t0Var = this.b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.b : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.c;
            com.fyber.inneractive.sdk.flow.t0 t0Var2 = this.b;
            org.json.JSONArray b = t0Var2 == null ? null : t0Var2.c.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar.c = uVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
            if (this.n != null && gVar != null) {
                wVar.f.put(new com.fyber.inneractive.sdk.network.x().a(java.lang.String.valueOf(z), "waudio").a(this.n.g, "url").a(this.n.e, "bitrate").a(android.text.TextUtils.isEmpty(this.n.d) ? "na" : this.n.d, "mime").a(this.n.f3811a, com.ironsource.C3300u.g).a(java.lang.Integer.valueOf(this.k), "media_file_index").a(this.f4138a.d(), "player").f3861a);
            }
            wVar.a((java.lang.String) null);
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean a(int i, int i2, com.fyber.inneractive.sdk.config.s0 s0Var) {
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        if (s0Var != null && ((com.fyber.inneractive.sdk.config.r0) s0Var).e != null) {
            return false;
        }
        if (i2 == 1 || com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((com.fyber.inneractive.sdk.config.r0) s0Var).f : null;
        return (t0Var == null || t0Var.h == com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT || (unitDisplayType = t0Var.j) == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) ? false : true;
    }

    public static int a(com.fyber.inneractive.sdk.player.f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.flow.t0 t0Var = fVar.b;
        if (t0Var == null || (eVar = t0Var.b) == null) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) eVar).v;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.e;
        if (fVar != null) {
            if (fVar.f3787a != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.f3787a.finish();
                } catch (java.lang.Throwable th) {
                    fVar.a(th);
                }
            }
            fVar.b = null;
            fVar.f3787a = null;
            fVar.c = null;
        }
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        java.lang.Boolean c;
        mVar.getClass();
        return mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP && com.fyber.inneractive.sdk.config.IAConfigManager.N.D.n() && rVar != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) != null && ((c = ((com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class)).c("enable_app_info_button")) == null || c.booleanValue());
    }
}
