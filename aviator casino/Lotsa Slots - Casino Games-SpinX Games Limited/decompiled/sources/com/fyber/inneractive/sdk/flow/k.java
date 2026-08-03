package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest f3705a;
    public com.fyber.inneractive.sdk.response.e b;
    public com.fyber.inneractive.sdk.flow.x c;
    public com.fyber.inneractive.sdk.interfaces.a d;
    public com.fyber.inneractive.sdk.interfaces.b e;
    public com.fyber.inneractive.sdk.config.r0 f;
    public com.fyber.inneractive.sdk.config.global.r g;
    public com.fyber.inneractive.sdk.network.timeouts.content.a j;
    public boolean h = false;
    public int i = 0;
    public final com.fyber.inneractive.sdk.flow.j l = new com.fyber.inneractive.sdk.flow.j(this);
    public com.fyber.inneractive.sdk.flow.d k = new com.fyber.inneractive.sdk.flow.d(this);

    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f3705a = inneractiveAdRequest;
        this.b = eVar;
        this.d = aVar;
        this.e = bVar;
        this.k = new com.fyber.inneractive.sdk.flow.d(this);
        this.g = rVar;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = eVar.n;
        this.j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(java.util.Locale.US) : com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER.name().toLowerCase(java.util.Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.H, eVar.A, com.fyber.inneractive.sdk.config.IAConfigManager.N.l, this.g);
        if (this.f3705a == null) {
            this.f = com.fyber.inneractive.sdk.config.a.a(eVar.m);
        }
        try {
            h();
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.f("Failed to start ContentLoader", com.fyber.inneractive.sdk.util.IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th, inneractiveAdRequest, eVar);
            this.k.a();
            b(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.CONTENT_LOADER_START_FAILED));
        }
    }

    public void c() {
        f();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public com.fyber.inneractive.sdk.external.InneractiveInfrastructureError d() {
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public abstract java.lang.String e();

    public final void f() {
        java.lang.String str;
        this.k.a();
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.f3705a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.b;
            if (eVar == null || (str = eVar.y) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.d.a(str).i();
        com.fyber.inneractive.sdk.flow.x xVar = this.c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.f3705a);
        }
    }

    public abstract void g();

    public final void h() {
        int i;
        int i2 = this.i;
        this.i = i2 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i2 = aVar.f3858a - i2;
            }
            i = (aVar.b * i2) + aVar.d + (i2 == aVar.f3858a ? aVar.h : 0);
        } else {
            i = 0;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.i - 1));
        com.fyber.inneractive.sdk.flow.d dVar = this.k;
        if (dVar.f3678a == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f3678a = new android.os.Handler(handlerThread.getLooper());
        }
        dVar.f3678a.postDelayed(dVar.d, i);
        g();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        int i;
        java.lang.String a2 = com.fyber.inneractive.sdk.util.IAlog.a(this);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.i - 1);
        int i2 = this.i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i2 = aVar.f3858a - i2;
            }
            i = (aVar.b * i2) + aVar.d + (i2 == aVar.f3858a ? aVar.h : 0);
        } else {
            i = 0;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", a2, valueOf, java.lang.Integer.valueOf(i));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.e;
        if (bVar != null) {
            bVar.b();
        }
        h();
    }

    public final void b(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        java.lang.String sb;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        com.fyber.inneractive.sdk.flow.d dVar = this.k;
        dVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", com.fyber.inneractive.sdk.util.IAlog.a(dVar));
        android.os.Handler handler = dVar.f3678a;
        if (handler != null) {
            handler.removeCallbacks(dVar.d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        boolean z = this.i <= (aVar != null ? aVar.f3858a : 0);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z));
        if (z) {
            com.fyber.inneractive.sdk.flow.x xVar = this.c;
            if (xVar != null) {
                xVar.destroy();
                this.c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.j;
            int i = aVar2 != null ? aVar2.e : 0;
            com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i));
            com.fyber.inneractive.sdk.util.r.b.postDelayed(this.l, i);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.f3705a;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.g;
        org.json.JSONArray b = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.b = tVar;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = b;
                if (inneractiveInfrastructureError.getCause() != null) {
                    sb = java.util.Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                    for (int i2 = 7; i2 >= 0 && i2 < 13 && i2 < stackTrace.length; i2++) {
                        sb2.append(stackTrace[i2].toString());
                        sb2.append(",");
                    }
                    android.util.Log.d("stack trace:", sb2.toString());
                    sb = sb2.toString();
                }
                java.lang.String obj = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", obj);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", obj);
                }
                try {
                    jSONObject.put("description", sb);
                } catch (java.lang.Exception unused2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "description", sb);
                }
                java.lang.String description = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", description);
                } catch (java.lang.Exception unused3) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", description);
                }
                wVar.f.put(jSONObject);
                wVar.a((java.lang.String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            com.fyber.inneractive.sdk.flow.a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.c, eVar, b);
        }
        cancel();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
        int i;
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError;
        java.lang.String a2 = com.fyber.inneractive.sdk.util.IAlog.a(this);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.i - 1);
        int i2 = this.i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i2 = aVar.f3858a - i2;
            }
            i = (aVar.b * i2) + aVar.d + (i2 == aVar.f3858a ? aVar.h : 0);
        } else {
            i = 0;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", a2, valueOf, java.lang.Integer.valueOf(i));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.j;
        if (this.i <= (aVar2 != null ? aVar2.f3858a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.IN_FLIGHT_TIMEOUT, com.fyber.inneractive.sdk.flow.i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(this.b, this.f3705a, e(), this.g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
