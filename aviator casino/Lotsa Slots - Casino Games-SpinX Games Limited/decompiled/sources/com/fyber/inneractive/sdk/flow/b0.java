package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class b0 implements com.fyber.inneractive.sdk.external.InneractiveAdRenderer, com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot f3675a;
    public com.fyber.inneractive.sdk.flow.x b;
    public com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public java.lang.Runnable g;
    public com.fyber.inneractive.sdk.click.r h;
    public com.fyber.inneractive.sdk.flow.z i;
    public android.view.View j;

    public final boolean A() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null && (rVar = xVar.c) != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.b.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar.getClass();
            if (new java.util.ArrayList(cVar.c.values()).size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            return xVar.b();
        }
        return true;
    }

    public boolean D() {
        return this instanceof com.fyber.inneractive.sdk.renderers.c0;
    }

    public final void E() {
        com.fyber.inneractive.sdk.response.e eVar;
        w();
        if (this.e || this.c == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdImpression", com.fyber.inneractive.sdk.util.IAlog.a(this));
        this.c.onAdImpression(this.f3675a);
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null && (eVar = xVar.b) != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.w;
            if (x0Var != null) {
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = eVar.n;
                com.fyber.inneractive.sdk.external.ImpressionData impressionData = eVar.r;
                x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVar.x);
                if (this.b.isVideoAd()) {
                    x0Var.a(unitDisplayType, new java.lang.String[]{"LAST_VAST_SKIPED"}[0], "0");
                    x0Var.a(unitDisplayType, new java.lang.String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                x0Var.a(unitDisplayType, new java.lang.String[]{"LAST_CLICKED"}[0], "0");
            }
            com.fyber.inneractive.sdk.util.y0 y0Var = iAConfigManager.z;
            com.fyber.inneractive.sdk.config.s0 s0Var = this.b.d;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData2 = eVar.r;
            if (s0Var != null) {
                com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f4320a;
                if (onGlobalImpressionDataListener != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    onGlobalImpressionDataListener.onImpression(r0Var.b, r0Var.f3627a, impressionData2);
                }
            } else {
                y0Var.getClass();
            }
            com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = this.c;
            if (eventsListener instanceof com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f3675a, eVar.r);
            } else if (eventsListener instanceof com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData) {
                ((com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f3675a, eVar.r);
            }
        }
        this.e = true;
    }

    public final void F() {
        if (this.c != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdWillOpenExternalApp", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.c.onAdWillOpenExternalApp(this.f3675a);
        }
    }

    public void G() {
        android.view.View x = x();
        if (x == null || this.j == null || x.getParent() == null || !(x.getParent() instanceof android.view.ViewGroup)) {
            return;
        }
        x.getLayoutParams();
        ((android.view.ViewGroup) x.getParent()).removeView(this.j);
        e(this.j);
        this.j = null;
    }

    public final void H() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        java.lang.String str = eVar.o;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.e("%sfiring rewarded completion!", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.util.IAlog.d("AD_REWARDED_COMPLETION", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.network.z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(android.content.Context context, java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z, com.fyber.inneractive.sdk.click.o oVar) {
        java.lang.String str2;
        java.lang.String str3;
        boolean z2;
        com.fyber.inneractive.sdk.click.r rVar;
        com.fyber.inneractive.sdk.web.v0 a2;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.click.r rVar2;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        if (!z && (!this.f || this.d)) {
            java.lang.String str4 = this.d ? "external/browser is already open" : "click is in grace period";
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str4);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception(str4));
        }
        if (context != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sBlocking clicks until grace has ended", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.f = false;
            java.lang.Runnable runnable = this.g;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            }
            com.fyber.inneractive.sdk.flow.a0 a0Var = new com.fyber.inneractive.sdk.flow.a0(this);
            this.g = a0Var;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(a0Var, 1000L);
        }
        float f = g1Var.f4292a;
        c(z);
        if (android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new java.lang.Object[0]);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("empty url"));
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        if (xVar2 != null && (eVar2 = xVar2.b) != null && eVar2.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.D;
            if (hVar.f) {
                hVar.a((com.digitalturbine.ignite.authenticator.listeners.internal.a) null);
            }
        }
        this.i = new com.fyber.inneractive.sdk.flow.z(this, g1Var, gVar, oVar);
        if (!android.text.TextUtils.isEmpty(str)) {
            android.net.Uri parse = android.net.Uri.parse(str);
            java.lang.String scheme = parse.getScheme();
            java.lang.String host = parse.getHost();
            if (scheme != null && scheme.equals("fybernativebrowser") && host != null && host.equals("navigate")) {
                str2 = parse.getQueryParameter("url");
                java.lang.String scheme2 = android.text.TextUtils.isEmpty(str) ? android.net.Uri.parse(str).getScheme() : null;
                if (android.text.TextUtils.isEmpty(str2)) {
                    str3 = str2;
                } else {
                    str3 = str;
                    if (!str3.contains("FYBER_OPEN_BROWSER")) {
                        z2 = true;
                        if (str3.contains("[IS_CTA_CLICK]")) {
                            str3 = str3.replace("[IS_CTA_CLICK]", java.lang.String.valueOf(B() && gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA));
                        }
                        if (x() != null) {
                            v();
                        }
                        rVar = this.h;
                        if (rVar != null) {
                            rVar.f = true;
                            java.util.Iterator it = rVar.j.iterator();
                            while (it.hasNext()) {
                                ((com.fyber.inneractive.sdk.click.a) it.next()).a();
                            }
                            rVar.j.clear();
                            com.fyber.inneractive.sdk.network.h1 h1Var = rVar.i;
                            if (h1Var != null) {
                                h1Var.f3857a = true;
                            }
                            com.fyber.inneractive.sdk.util.z0 z0Var = rVar.f3581a;
                            z0Var.c = false;
                            com.fyber.inneractive.sdk.config.e eVar3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.b;
                            if (eVar3 != null) {
                                eVar3.f3594a.remove(z0Var);
                            }
                            rVar.e = null;
                            this.h = null;
                        }
                        com.fyber.inneractive.sdk.click.r rVar3 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
                        rVar3.j.addAll(java.util.Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
                        this.h = rVar3;
                        com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
                        a2 = xVar3 != null ? xVar3.a() : null;
                        if (a2 != null) {
                            a2.i = this;
                        }
                        com.fyber.inneractive.sdk.flow.x xVar4 = this.b;
                        boolean z3 = xVar4 == null && xVar4.a(g1Var.c, gVar);
                        xVar = this.b;
                        if (xVar != null && xVar.b != null) {
                            xVar.e();
                        }
                        rVar2 = this.h;
                        if (rVar2 != null) {
                            com.fyber.inneractive.sdk.flow.z zVar = this.i;
                            com.fyber.inneractive.sdk.flow.x xVar5 = this.b;
                            com.fyber.inneractive.sdk.ignite.m mVar = (xVar5 == null || (eVar = xVar5.b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.E;
                            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
                            rVar2.a(context, str3, zVar, a2, z3, mVar, inneractiveAdSpot != null ? inneractiveAdSpot.getLocalUniqueId() : null);
                        }
                        com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
                        context.getClass();
                        return new com.fyber.inneractive.sdk.util.d0(g0Var, null);
                    }
                }
                z2 = false;
                if (str3.contains("[IS_CTA_CLICK]")) {
                }
                if (x() != null) {
                }
                rVar = this.h;
                if (rVar != null) {
                }
                com.fyber.inneractive.sdk.click.r rVar32 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
                rVar32.j.addAll(java.util.Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
                this.h = rVar32;
                com.fyber.inneractive.sdk.flow.x xVar32 = this.b;
                if (xVar32 != null) {
                }
                if (a2 != null) {
                }
                com.fyber.inneractive.sdk.flow.x xVar42 = this.b;
                if (xVar42 == null) {
                }
                xVar = this.b;
                if (xVar != null) {
                    xVar.e();
                }
                rVar2 = this.h;
                if (rVar2 != null) {
                }
                com.fyber.inneractive.sdk.util.g0 g0Var2 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
                context.getClass();
                return new com.fyber.inneractive.sdk.util.d0(g0Var2, null);
            }
        }
        str2 = null;
        if (android.text.TextUtils.isEmpty(str)) {
        }
        if (android.text.TextUtils.isEmpty(str2)) {
        }
        z2 = false;
        if (str3.contains("[IS_CTA_CLICK]")) {
        }
        if (x() != null) {
        }
        rVar = this.h;
        if (rVar != null) {
        }
        com.fyber.inneractive.sdk.click.r rVar322 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
        rVar322.j.addAll(java.util.Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
        this.h = rVar322;
        com.fyber.inneractive.sdk.flow.x xVar322 = this.b;
        if (xVar322 != null) {
        }
        if (a2 != null) {
        }
        com.fyber.inneractive.sdk.flow.x xVar422 = this.b;
        if (xVar422 == null) {
        }
        xVar = this.b;
        if (xVar != null) {
        }
        rVar2 = this.h;
        if (rVar2 != null) {
        }
        com.fyber.inneractive.sdk.util.g0 g0Var22 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new com.fyber.inneractive.sdk.util.d0(g0Var22, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        if (r11.booleanValue() != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.fyber.inneractive.sdk.click.b bVar, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.model.vast.a aVar;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.config.global.r rVar2;
        com.fyber.inneractive.sdk.config.global.r rVar3;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f3765a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        org.json.JSONArray b = (xVar == null || (rVar3 = xVar.c) == null) ? null : rVar3.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        com.fyber.inneractive.sdk.network.x xVar2 = new com.fyber.inneractive.sdk.network.x();
        int z = z();
        int y = y();
        long j = bVar.e;
        if (j != 0) {
            xVar2.a(java.lang.Long.valueOf(j), "time_passed");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bVar.f.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("url", jVar.f3577a);
                jSONObject.put("success", jVar.b);
                jSONObject.put("opened_by", jVar.c);
                jSONObject.put("reason", jVar.d);
            } catch (java.lang.Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        xVar2.a(jSONArray, "urls");
        xVar2.a(gVar, "origin");
        if (gVar == com.fyber.inneractive.sdk.util.g.FMP_ENDCARD) {
            xVar2.a(gVar.a(), "version");
        }
        if (g1Var != null && g1Var.c) {
            xVar2.a(java.lang.Boolean.TRUE, "is_auto_click");
        }
        if (g1Var != null) {
            if (g1Var.f4292a > 0.0f && g1Var.b > 0.0f) {
                int b2 = C() ? z : com.fyber.inneractive.sdk.util.o.b(z);
                float f = b2 == 0 ? 0.0f : g1Var.f4292a / b2;
                int b3 = C() ? y : com.fyber.inneractive.sdk.util.o.b(y);
                float f2 = b3 != 0 ? g1Var.b / b3 : 0.0f;
                com.fyber.inneractive.sdk.util.IAlog.a("Point location -  x - %.2f , y- %.2f", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
                C();
                java.util.Locale locale = java.util.Locale.ENGLISH;
                com.fyber.inneractive.sdk.network.x a2 = xVar2.a(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(f)), "td_x");
                C();
                a2.a(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(f2)), "td_y");
            }
        }
        if (C() || D()) {
            xVar2.a(com.fyber.inneractive.sdk.util.o.c() == 1 ? "p" : androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "o");
        } else if (z > 0 || y > 0) {
            xVar2.a(java.lang.Integer.valueOf(z), "b_w");
            xVar2.a(java.lang.Integer.valueOf(y), "b_h");
        }
        com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
        com.fyber.inneractive.sdk.config.global.features.d dVar = (xVar3 == null || (rVar2 = xVar3.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.d) rVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
        if (dVar != null && (aVar = dVar.e) != null && aVar.d) {
            if (!com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD.equals(gVar) && !com.fyber.inneractive.sdk.util.g.VIDEO_CTA.equals(gVar)) {
                if (com.fyber.inneractive.sdk.util.g.VIDEO_CLICK.equals(gVar)) {
                    com.fyber.inneractive.sdk.flow.x xVar4 = this.b;
                    com.fyber.inneractive.sdk.config.global.features.v vVar = (xVar4 == null || (rVar = xVar4.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
                    if (vVar != null) {
                        java.lang.Boolean c = vVar.c("show_cta");
                        if (c != null) {
                        }
                    }
                }
            }
            xVar2.a(com.fyber.inneractive.sdk.config.IAConfigManager.N.o, "cta_lng");
        }
        wVar.f.put(xVar2.f3861a);
        wVar.a((java.lang.String) null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(android.view.View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.d) {
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.d = false;
        }
        java.lang.Runnable runnable = this.g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.g = null;
        }
        this.b = null;
        this.c = null;
        this.f3675a = null;
        if (this.h != null) {
            G();
            com.fyber.inneractive.sdk.click.r rVar = this.h;
            rVar.f = true;
            java.util.Iterator it = rVar.j.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).a();
            }
            rVar.j.clear();
            com.fyber.inneractive.sdk.network.h1 h1Var = rVar.i;
            if (h1Var != null) {
                h1Var.f3857a = true;
            }
            com.fyber.inneractive.sdk.util.z0 z0Var = rVar.f3581a;
            z0Var.c = false;
            com.fyber.inneractive.sdk.config.e eVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.b;
            if (eVar != null) {
                eVar.f3594a.remove(z0Var);
            }
            rVar.e = null;
            this.h = null;
            this.i = null;
        }
    }

    public void e(android.view.View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.f3675a = inneractiveAdSpot;
        this.b = inneractiveAdSpot.getAdContent();
        this.c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public final com.fyber.inneractive.sdk.ignite.m o() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        return (xVar == null || !xVar.c() || (eVar = this.b.b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.E;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        F();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        com.fyber.inneractive.sdk.util.IAlog.a("onInternalBrowserDismissed callback called", new java.lang.Object[0]);
        if (this.d) {
            this.d = false;
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.c != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.c.onAdWillCloseInternalBrowser(this.f3675a);
        }
    }

    public void t() {
        E();
    }

    public void v() {
        android.view.View x = x();
        if (x == null || x.getParent() == null || !(x.getParent() instanceof android.view.ViewGroup) || this.j != null) {
            return;
        }
        android.view.View inflate = android.view.View.inflate(x.getContext(), com.fyber.inneractive.sdk.R.layout.ia_layout_click_overlay, null);
        this.j = inflate;
        if (inflate != null) {
            ((android.view.ViewGroup) x.getParent()).addView(this.j, x.getLayoutParams());
            d(this.j);
        }
    }

    public android.content.Context w() {
        return com.fyber.inneractive.sdk.util.o.a(x());
    }

    public abstract android.view.View x();

    public int y() {
        return -1;
    }

    public int z() {
        return -1;
    }

    public final void c(boolean z) {
        com.fyber.inneractive.sdk.response.e eVar;
        if (z) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : will not notify click on fallback", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        if (this.c != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdClicked", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.c.onAdClicked(this.f3675a);
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.IAConfigManager.N.w.a(eVar.n, "LAST_CLICKED", "1");
    }

    public final android.content.Context c(android.view.View view) {
        android.view.View view2;
        int i = 0;
        android.view.View[] viewArr = {view, x()};
        while (true) {
            if (i >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i];
            if (view2 != null) {
                break;
            }
            i++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(java.lang.String str, com.fyber.inneractive.sdk.click.q qVar) {
        org.json.JSONArray jSONArray;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            eVar = xVar.b;
            inneractiveAdRequest = xVar.f3765a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar.c;
            jSONArray = rVar != null ? rVar.b() : null;
        } else {
            jSONArray = null;
            eVar = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((java.lang.String) null);
    }

    public final void a(com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        java.lang.String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        java.lang.String message = webViewRendererProcessHasGoneError.getMessage();
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f3765a : null, xVar != null ? xVar.b : null);
        if (this.c != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.c.onAdEnteredErrorState(this.f3675a, webViewRendererProcessHasGoneError);
        }
    }
}
