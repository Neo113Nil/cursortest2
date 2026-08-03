package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class h0 implements com.fyber.inneractive.sdk.flow.i0, com.fyber.inneractive.sdk.flow.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3703a;
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener b;
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest c;
    public com.fyber.inneractive.sdk.flow.e0 d;
    public com.fyber.inneractive.sdk.flow.x e;
    public com.fyber.inneractive.sdk.flow.s0 f;
    public final java.util.HashSet g;
    public com.fyber.inneractive.sdk.flow.m h;
    public com.fyber.inneractive.sdk.flow.g0 i;
    public com.fyber.inneractive.sdk.flow.p l;
    public com.fyber.inneractive.sdk.rtb.watermark.b m;
    public boolean j = true;
    public boolean k = false;
    public final java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.lang.Object o = new java.lang.Object();

    public h0() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        this.f3703a = uuid;
        this.g = new java.util.HashSet();
        com.fyber.inneractive.sdk.util.IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), uuid);
    }

    public static java.lang.String a(com.fyber.inneractive.sdk.flow.h0 h0Var) {
        h0Var.getClass();
        return com.fyber.inneractive.sdk.util.IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            com.fyber.inneractive.sdk.flow.s0 s0Var = (com.fyber.inneractive.sdk.flow.s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.g.size() > 0) {
                java.util.Iterator it = new java.util.HashSet(this.g).iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController2 = (com.fyber.inneractive.sdk.external.InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.g.add(s0Var);
            if (this.e != null) {
                java.util.Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    com.fyber.inneractive.sdk.flow.s0 s0Var2 = (com.fyber.inneractive.sdk.flow.s0) it2.next();
                    if (s0Var2.supports(this)) {
                        this.f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        android.graphics.Bitmap bitmap;
        this.n.set(true);
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.external.InneractiveUnitController) it.next()).destroy();
        }
        this.g.clear();
        a((com.fyber.inneractive.sdk.flow.x) null);
        this.b = null;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.m;
        if (bVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s destroy called", "InneractiveWatermark");
            android.widget.ImageView imageView = bVar.f4262a;
            if (imageView != null) {
                android.graphics.drawable.Drawable background = imageView.getBackground();
                if ((background instanceof android.graphics.drawable.BitmapDrawable) && (bitmap = ((android.graphics.drawable.BitmapDrawable) background).getBitmap()) != null) {
                    try {
                        bitmap.recycle();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            com.fyber.inneractive.sdk.util.v.a(bVar.f4262a);
            bVar.f4262a = null;
            this.m = null;
        }
        a();
        com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.flow.x getAdContent() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest getCurrentProcessedRequest() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getLocalUniqueId() {
        return this.f3703a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveMediationName getMediationName() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getMediationNameString() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getMediationVersion() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getRequestedSpotId() {
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveUnitController getSelectedUnitController() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.flow.x xVar2 = this.e;
        if (xVar2 == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.e eVar = xVar2.b;
        boolean z = eVar != null && eVar.f4251a < java.lang.System.currentTimeMillis();
        if (z && (xVar = this.e) != null) {
            com.fyber.inneractive.sdk.response.e eVar2 = xVar.b;
            if (!this.k && eVar2 != null) {
                long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(java.lang.System.currentTimeMillis() - eVar2.c);
                long j = eVar2.b;
                long j2 = minutes - j;
                com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 802 - AdExpired - time passed- " + j2 + ", sessionTimeOut - " + j, new java.lang.Object[0]);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar.f3765a;
                org.json.JSONArray b = xVar.c.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.b = tVar;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = b;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.Long valueOf = java.lang.Long.valueOf(j2);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                java.lang.Long valueOf2 = java.lang.Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (java.lang.Exception unused2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                wVar.f.put(jSONObject);
                wVar.a((java.lang.String) null);
                this.k = true;
            }
        }
        return !z && this.e.d();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(java.lang.String str) {
        if (this.n.get()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : loadAd: spot is already destroyed", com.fyber.inneractive.sdk.util.IAlog.a(this));
            a(this.e);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (com.fyber.inneractive.sdk.config.IAConfigManager.c()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener3 = this.b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.d.a(this.f3703a).c();
        java.lang.String str2 = this.f3703a;
        this.l = new com.fyber.inneractive.sdk.flow.p(str2);
        if (this.d == null) {
            this.d = new com.fyber.inneractive.sdk.flow.e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r a2 = com.fyber.inneractive.sdk.config.global.r.a();
        com.fyber.inneractive.sdk.flow.c0 c0Var = new com.fyber.inneractive.sdk.flow.c0(this, yVar, a2, str);
        com.fyber.inneractive.sdk.util.IAlog.a("%s initOmidSdkIfNeeded", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (com.fyber.inneractive.sdk.config.IAConfigManager.g()) {
            android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
            com.fyber.inneractive.sdk.util.IAlog.c("initOmidSdk", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.config.a0(com.fyber.inneractive.sdk.config.IAConfigManager.N, application));
        }
        com.fyber.inneractive.sdk.config.IAConfigManager.N.E.a();
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, a2));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            com.fyber.inneractive.sdk.flow.s0 s0Var = this.f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f.destroy();
                this.f = null;
            }
            this.g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        if (com.fyber.inneractive.sdk.config.IAConfigManager.c()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%srequestAd called with request: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.c == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener3 = this.b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.c;
        java.lang.String str = this.f3703a;
        inneractiveAdRequest2.b = str;
        com.fyber.inneractive.sdk.metrics.d.d.a(str).c();
        if (this.g.isEmpty()) {
            com.fyber.inneractive.sdk.util.IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", com.fyber.inneractive.sdk.util.IAlog.a(this));
            if (this.b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.c;
                }
                a(inneractiveAdRequest, null);
                this.b.onInneractiveFailedAdRequest(this, com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.flow.m mVar = this.h;
        if (mVar != null) {
            boolean z = inneractiveAdRequest != null || this.c == null;
            com.fyber.inneractive.sdk.flow.l lVar = mVar.g;
            if (lVar != null) {
                com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.d = null;
            }
            mVar.a(z);
            mVar.b = null;
        }
        if (inneractiveAdRequest != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = this.c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.c = inneractiveAdRequest;
            com.fyber.inneractive.sdk.flow.x xVar = this.e;
            if (xVar != null) {
                xVar.destroy();
                this.j = true;
            }
            java.util.Iterator it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.c.f3758a = false;
                    break;
                } else if (((com.fyber.inneractive.sdk.flow.s0) it.next()) instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController) {
                    break;
                }
            }
        }
        this.h = new com.fyber.inneractive.sdk.flow.m(this.f3703a);
        if (this.d == null) {
            this.d = new com.fyber.inneractive.sdk.flow.e0(this);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sFound ad source for request! %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.h);
        com.fyber.inneractive.sdk.util.IAlog.a("%s initOmidSdkIfNeeded", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (com.fyber.inneractive.sdk.config.IAConfigManager.g()) {
            android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
            com.fyber.inneractive.sdk.util.IAlog.c("initOmidSdk", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.config.a0(com.fyber.inneractive.sdk.config.IAConfigManager.N, application));
        }
        com.fyber.inneractive.sdk.config.IAConfigManager.N.E.a();
        com.fyber.inneractive.sdk.flow.m mVar3 = this.h;
        if (mVar3 != null) {
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest4 = this.c;
            mVar3.b = this.d;
            if (com.fyber.inneractive.sdk.config.IAConfigManager.d()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            com.fyber.inneractive.sdk.flow.l lVar2 = new com.fyber.inneractive.sdk.flow.l(mVar3, inneractiveAdRequest4);
            mVar3.g = lVar2;
            com.fyber.inneractive.sdk.config.IAConfigManager.addListener(lVar2);
            com.fyber.inneractive.sdk.config.IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(com.fyber.inneractive.sdk.external.InneractiveMediationName inneractiveMediationName) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(java.lang.String str) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        com.fyber.inneractive.sdk.util.IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.f3703a);
        if (android.os.Looper.myLooper() == null || android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.flow.d0(this));
        } else {
            b();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(java.lang.String str) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener) {
        com.fyber.inneractive.sdk.util.IAlog.a("%ssetRequestListener called with: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), requestListener);
        this.b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(com.fyber.inneractive.sdk.flow.g0 g0Var) {
        this.i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        com.fyber.inneractive.sdk.flow.x xVar;
        org.json.JSONArray b;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.flow.x xVar2 = this.e;
        if (xVar2 != null) {
            if (xVar2.b() && (xVar = this.e) != null && !xVar.e) {
                java.lang.String arrays = java.util.Arrays.toString(java.lang.Thread.currentThread().getStackTrace());
                com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 803 - Stack trace - %s", arrays);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                com.fyber.inneractive.sdk.flow.x xVar3 = this.e;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar3.f3765a;
                com.fyber.inneractive.sdk.response.e eVar = xVar3.b;
                com.fyber.inneractive.sdk.flow.m mVar = this.h;
                com.fyber.inneractive.sdk.flow.p pVar = this.l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.c : null;
                if (mVar != null && (rVar = mVar.c) != null) {
                    b = rVar.b();
                } else {
                    b = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.b = tVar;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = b;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("stack_trace", arrays);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", arrays);
                }
                wVar.f.put(jSONObject);
                wVar.a((java.lang.String) null);
            }
            this.e.destroy();
            this.e = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.response.e eVar3;
        if (inneractiveAdRequest != null && inneractiveAdRequest.getSelectedUnitConfig() != null) {
            if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).c != null) {
                unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).c.b;
            } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f != null) {
                unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f.j;
            }
            com.fyber.inneractive.sdk.flow.x xVar = this.e;
            eVar2 = (xVar != null || (eVar3 = xVar.b) == null) ? eVar : eVar3;
            java.lang.String str = this.f3703a;
            if (unitDisplayType == null && eVar2 != null) {
                unitDisplayType = eVar2.n;
            }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = unitDisplayType;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.e;
            new com.fyber.inneractive.sdk.metrics.c(eVar2, inneractiveAdRequest, str, unitDisplayType2, xVar2 != null ? xVar2.c.b() : null).a();
        }
        unitDisplayType = null;
        com.fyber.inneractive.sdk.flow.x xVar3 = this.e;
        if (xVar3 != null) {
        }
        java.lang.String str2 = this.f3703a;
        if (unitDisplayType == null) {
            unitDisplayType = eVar2.n;
        }
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType22 = unitDisplayType;
        com.fyber.inneractive.sdk.flow.x xVar22 = this.e;
        new com.fyber.inneractive.sdk.metrics.c(eVar2, inneractiveAdRequest, str2, unitDisplayType22, xVar22 != null ? xVar22.c.b() : null).a();
    }

    public final void a(com.fyber.inneractive.sdk.flow.x xVar) {
        synchronized (this.o) {
            com.fyber.inneractive.sdk.flow.p pVar = this.l;
            if (pVar != null) {
                pVar.a(true);
                pVar.b = null;
                this.l = null;
            }
            com.fyber.inneractive.sdk.flow.m mVar = this.h;
            if (mVar != null) {
                com.fyber.inneractive.sdk.flow.l lVar = mVar.g;
                if (lVar != null) {
                    com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(lVar);
                }
                com.fyber.inneractive.sdk.network.m mVar2 = mVar.d;
                if (mVar2 != null) {
                    mVar2.a();
                    mVar.d = null;
                }
                mVar.a(true);
                mVar.b = null;
                this.h = null;
            }
            if (xVar != null) {
                xVar.destroy();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.config.i iVar = iAConfigManager.u;
        com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.t;
        if (sVar != null && sVar.b.a(true, "ext_wm") && iVar != null && !android.text.TextUtils.isEmpty(str2)) {
            this.m = new com.fyber.inneractive.sdk.rtb.watermark.b(iVar.a(), str2);
        }
        loadAd(str);
    }
}
