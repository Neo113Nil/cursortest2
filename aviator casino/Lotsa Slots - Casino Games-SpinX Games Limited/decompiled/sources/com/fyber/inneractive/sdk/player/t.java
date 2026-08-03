package com.fyber.inneractive.sdk.player;

/* loaded from: classes3.dex */
public final class t implements com.fyber.inneractive.sdk.player.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.b f4159a;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest b;
    public final com.fyber.inneractive.sdk.response.g c;
    public final com.fyber.inneractive.sdk.player.s d;
    public com.fyber.inneractive.sdk.model.vast.r e;
    public com.fyber.inneractive.sdk.player.a f;
    public boolean g = false;
    public final com.fyber.inneractive.sdk.config.global.r h;

    public t(com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.flow.t0 t0Var, com.fyber.inneractive.sdk.player.s sVar) {
        this.b = inneractiveAdRequest;
        this.c = gVar;
        this.d = sVar;
        this.h = t0Var.c;
        this.f4159a = new com.fyber.inneractive.sdk.player.b(t0Var);
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.a aVar = this.f;
        if (aVar == null) {
            this.d.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new java.lang.Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.r rVar = this.e;
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
        nVar.l = this;
        if (rVar != null) {
            java.lang.String str = rVar.g;
            nVar.n = rVar;
            nVar.k++;
            nVar.h = false;
            nVar.j = false;
            com.fyber.inneractive.sdk.util.IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            com.fyber.inneractive.sdk.util.IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new java.lang.Object[0]);
            if (nVar.i) {
                return;
            }
            nVar.f4138a.a(str, nVar.m);
        }
    }

    public final void a(com.fyber.inneractive.sdk.external.InneractiveVideoError inneractiveVideoError, org.json.JSONObject jSONObject, boolean z) {
        org.json.JSONObject jSONObject2;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.network.t tVar2;
        if (jSONObject != null || inneractiveVideoError == null || this.f == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new org.json.JSONObject();
            ((com.fyber.inneractive.sdk.player.n) this.f).b(inneractiveVideoError, jSONObject2);
        }
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            com.fyber.inneractive.sdk.external.InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i = com.fyber.inneractive.sdk.player.r.f4158a[playerError.ordinal()];
            if (i == 1) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i == 2) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i == 3) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i == 4) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i != 5) {
                com.fyber.inneractive.sdk.util.IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new java.lang.Object[0]);
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.b;
            com.fyber.inneractive.sdk.response.g gVar = this.c;
            org.json.JSONArray b = this.h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar.b = tVar2;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
            if (jSONObject2 != null) {
                try {
                    wVar.f.put(new org.json.JSONObject(jSONObject2.toString()));
                } catch (java.lang.Exception unused) {
                }
            }
            wVar.a((java.lang.String) null);
        }
        if (com.fyber.inneractive.sdk.external.InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            com.fyber.inneractive.sdk.network.t tVar3 = com.fyber.inneractive.sdk.network.t.VPAID_ERROR_UNSECURE_CONTENT;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = this.b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.c;
            org.json.JSONArray b2 = this.h.b();
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar2.b = tVar3;
            wVar2.f3860a = inneractiveAdRequest2;
            wVar2.d = b2;
            wVar2.a((java.lang.String) null);
        }
        if (inneractiveVideoError != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new java.lang.Object[0]);
            if (z) {
                inneractiveErrorCode = com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new java.lang.Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z) {
            return;
        }
        this.e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.c;
        if (gVar3 != null && (bVar = gVar3.L) != null) {
            this.e = (com.fyber.inneractive.sdk.model.vast.r) bVar.d.poll();
        }
        if (this.e == null) {
            com.fyber.inneractive.sdk.external.InneractiveVideoError.Error playerError2 = new com.fyber.inneractive.sdk.external.InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i2 = com.fyber.inneractive.sdk.player.r.f4158a[playerError2.ordinal()];
            if (i2 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i2 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i2 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i2 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i2 != 5) {
                com.fyber.inneractive.sdk.util.IAlog.a("IAReportError, Does not know player error " + playerError2.getErrorString(), new java.lang.Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = this.b;
            com.fyber.inneractive.sdk.response.g gVar4 = this.c;
            org.json.JSONArray b3 = this.h.b();
            com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar4);
            wVar3.b = tVar;
            wVar3.f3860a = inneractiveAdRequest3;
            wVar3.d = b3;
            wVar3.a((java.lang.String) null);
            com.fyber.inneractive.sdk.player.s sVar = this.d;
            if (sVar != null) {
                if (inneractiveVideoError != null) {
                    sVar.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(inneractiveErrorCode, iVar, inneractiveVideoError.getCause()));
                    return;
                } else {
                    sVar.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL));
                    return;
                }
            }
            return;
        }
        if (this.g) {
            return;
        }
        try {
            this.f = this.f4159a.a();
        } catch (java.lang.Throwable th) {
            this.d.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th));
        }
        a();
    }

    public final void a(java.lang.String str, java.lang.String... strArr) {
        com.fyber.inneractive.sdk.player.a aVar = this.f;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                nVar.r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (java.lang.String str2 : strArr) {
                    nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.a(str2));
                }
            }
        }
    }
}
