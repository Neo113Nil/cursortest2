package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class u extends com.fyber.inneractive.sdk.flow.k implements com.fyber.inneractive.sdk.player.s {
    public com.fyber.inneractive.sdk.player.t m;
    public java.lang.String n;
    public final com.fyber.inneractive.sdk.flow.t o = new com.fyber.inneractive.sdk.flow.t(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (this.m != null) {
            com.fyber.inneractive.sdk.response.e eVar = this.b;
            this.m.a((eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).L) == null) ? null : bVar.d.size() == 0 ? new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null), null, true);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.l);
        this.k.a();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final java.lang.String e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.IAlog.a(this) + "start called", new java.lang.Object[0]);
        a(this.g, (com.fyber.inneractive.sdk.response.g) this.b, this.f3705a, this);
    }

    public final com.fyber.inneractive.sdk.player.ui.remote.g i() {
        com.fyber.inneractive.sdk.player.a aVar;
        com.fyber.inneractive.sdk.player.t tVar = this.m;
        if (tVar == null || (aVar = tVar.f) == null) {
            return null;
        }
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
        if (nVar.u != null) {
            return nVar.u;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.l);
        this.k.a();
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.player.s sVar) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.iab.omid.library.fyber.adsession.AdSessionConfiguration adSessionConfiguration;
        java.lang.String str;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = this.f3705a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? this.f : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig == null && gVar != null) {
            selectedUnitConfig = com.fyber.inneractive.sdk.config.a.a(gVar.m);
        }
        com.iab.omid.library.fyber.adsession.AdSessionContext adSessionContext = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = gVar == null ? null : gVar.L;
        if (bVar3 != null && bVar3.d.size() < bVar3.i) {
            bVar3.d.clear();
            bVar3.g.clear();
            bVar3.d.addAll(bVar3.k);
            bVar3.g.addAll(bVar3.l);
        }
        com.fyber.inneractive.sdk.flow.t0 t0Var = new com.fyber.inneractive.sdk.flow.t0(selectedUnitConfig, rVar, gVar, inneractiveAdRequest);
        this.c = t0Var;
        com.fyber.inneractive.sdk.player.t tVar2 = new com.fyber.inneractive.sdk.player.t(gVar, inneractiveAdRequest, t0Var, sVar);
        this.m = tVar2;
        com.fyber.inneractive.sdk.flow.t0 t0Var2 = (com.fyber.inneractive.sdk.flow.t0) this.c;
        t0Var2.i = tVar2;
        t0Var2.f = this.h;
        this.n = bVar3 != null ? bVar3.n : null;
        tVar2.e = null;
        if (gVar != null && (bVar2 = gVar.L) != null) {
            tVar2.e = (com.fyber.inneractive.sdk.model.vast.r) bVar2.d.poll();
        }
        if (tVar2.e == null) {
            com.fyber.inneractive.sdk.external.InneractiveVideoError.Error playerError = new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i = com.fyber.inneractive.sdk.player.r.f4158a[playerError.ordinal()];
            if (i == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i != 5) {
                com.fyber.inneractive.sdk.util.IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new java.lang.Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = tVar2.b;
            com.fyber.inneractive.sdk.response.g gVar2 = tVar2.c;
            org.json.JSONArray b = tVar2.h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar.b = tVar;
            wVar.f3860a = inneractiveAdRequest3;
            wVar.d = b;
            wVar.a((java.lang.String) null);
            sVar.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                tVar2.f = tVar2.f4159a.a();
            } catch (java.lang.Throwable th) {
                tVar2.d.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th));
            }
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f;
            if (aVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
                com.fyber.inneractive.sdk.measurement.e eVar = nVar.d;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.measurement.f fVar = new com.fyber.inneractive.sdk.measurement.f();
                    java.util.ArrayList arrayList = nVar.p.e;
                    com.fyber.inneractive.sdk.flow.t0 t0Var3 = nVar.b;
                    try {
                        try {
                            com.iab.omid.library.fyber.adsession.CreativeType creativeType = com.iab.omid.library.fyber.adsession.CreativeType.VIDEO;
                            com.iab.omid.library.fyber.adsession.ImpressionType impressionType = com.iab.omid.library.fyber.adsession.ImpressionType.UNSPECIFIED;
                            com.iab.omid.library.fyber.adsession.Owner owner = com.iab.omid.library.fyber.adsession.Owner.NATIVE;
                            adSessionConfiguration = com.iab.omid.library.fyber.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                        } catch (java.lang.Throwable th2) {
                            fVar.a(th2);
                            adSessionConfiguration = null;
                        }
                        java.util.ArrayList a2 = fVar.a(arrayList);
                        com.iab.omid.library.fyber.adsession.Partner partner = eVar.e;
                        if (partner != null && (str = eVar.b) != null) {
                            try {
                                adSessionContext = com.iab.omid.library.fyber.adsession.AdSessionContext.createNativeAdSessionContext(partner, str, a2, "", "");
                            } catch (java.lang.Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                        com.iab.omid.library.fyber.adsession.AdSession createAdSession = com.iab.omid.library.fyber.adsession.AdSession.createAdSession(adSessionConfiguration, adSessionContext);
                        fVar.f3787a = createAdSession;
                        fVar.b = com.iab.omid.library.fyber.adsession.AdEvents.createAdEvents(createAdSession);
                        fVar.c = com.iab.omid.library.fyber.adsession.media.MediaEvents.createMediaEvents(fVar.f3787a);
                        fVar.f3787a.start();
                        fVar.f = t0Var3;
                    } catch (java.lang.Throwable th4) {
                        fVar.a(th4);
                    }
                    nVar.e = fVar;
                    nVar.f = new com.fyber.inneractive.sdk.player.p(fVar);
                }
                if (nVar.e == null && (bVar = nVar.p) != null) {
                    java.util.Iterator it = bVar.e.iterator();
                    while (it.hasNext()) {
                        com.fyber.inneractive.sdk.measurement.h hVar = (com.fyber.inneractive.sdk.measurement.h) it.next();
                        com.fyber.inneractive.sdk.measurement.i iVar = com.fyber.inneractive.sdk.measurement.i.ERROR_DURING_RESOURCE_LOAD;
                        com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar), iVar), xVar);
                    }
                }
            }
            tVar2.a();
        }
        if (android.text.TextUtils.isEmpty(this.n)) {
            return;
        }
        com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.v0(this.o, com.fyber.inneractive.sdk.util.o.f4302a, new com.fyber.inneractive.sdk.cache.l(this.n)));
    }

    public final void a(java.lang.Exception exc, java.lang.String str, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("description", str);
        if (exc != null) {
            hashMap.put("exception", exc.getMessage());
        }
        if (i() != null) {
            i().f4174a.a();
        }
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR.name(), this.n, this.f3705a, this.b, hashMap, java.lang.Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(this.b, this.f3705a, "send_failed_vast_creatives", this.g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
