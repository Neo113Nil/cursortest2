package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class h implements com.digitalturbine.ignite.authenticator.listeners.api.a, com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f3777a;
    public com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI b;
    public long k;
    public java.lang.String l;
    public com.fyber.inneractive.sdk.ignite.d m;
    public com.digitalturbine.ignite.authenticator.listeners.internal.a n;
    public com.fyber.inneractive.sdk.config.global.r o;
    public com.fyber.inneractive.sdk.ignite.l p;
    public final android.os.Bundle c = new android.os.Bundle();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public final java.util.concurrent.CopyOnWriteArrayList h = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean i = false;
    public boolean j = false;
    public final com.fyber.inneractive.sdk.ignite.i d = new com.fyber.inneractive.sdk.ignite.i(new com.fyber.inneractive.sdk.ignite.e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        this.o = rVar;
        if (!android.text.TextUtils.isEmpty(this.l)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s : initializing ignite features", "IgniteAdapter");
                java.lang.Boolean c = jVar.c("odt");
                this.e = c != null ? c.booleanValue() : false;
                java.lang.Boolean c2 = jVar.c("flow");
                this.f = c2 != null ? c2.booleanValue() : false;
                java.lang.Boolean c3 = jVar.c("updates");
                this.g = c3 != null ? c3.booleanValue() : false;
            }
            android.content.Context context = this.f3777a;
            if (context != null) {
                boolean z = this.e;
                if (z || this.f) {
                    if (this.p == null) {
                        this.j = false;
                        com.fyber.inneractive.sdk.ignite.l lVar = new com.fyber.inneractive.sdk.ignite.l(context, new com.fyber.inneractive.sdk.ignite.k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z, this.f, this.g, this);
                        this.p = lVar;
                        lVar.authenticate();
                    }
                    this.k = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.fyber.inneractive.sdk.config.IAConfigManager.N.v.f3637a.b.a("igniteInstallTimeOutInSeconds", 15, 1));
                }
            }
        }
    }

    public final void m() {
        com.fyber.inneractive.sdk.ignite.d dVar = this.m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
            this.m = null;
        }
    }

    public final boolean n() {
        com.fyber.inneractive.sdk.ignite.l lVar = this.p;
        return lVar != null && lVar.isConnected() && this.p.isAuthenticated();
    }

    public final boolean o() {
        com.fyber.inneractive.sdk.ignite.l lVar = this.p;
        return lVar == null || lVar.f3496a.f();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestFailed(java.lang.String str) {
        com.fyber.inneractive.sdk.ignite.l lVar = this.p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestSuccess(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.ignite.l lVar = this.p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticated(java.lang.String str) {
        this.c.putString("clientToken", str);
        com.fyber.inneractive.sdk.util.IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new java.lang.Object[0]);
        com.digitalturbine.ignite.authenticator.listeners.internal.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
            this.n = null;
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticationFailed(java.lang.String str) {
        this.b = null;
        a(com.fyber.inneractive.sdk.ignite.j.FAILED_TO_AUTHENTICATE, str);
        com.fyber.inneractive.sdk.util.IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        com.digitalturbine.ignite.authenticator.listeners.internal.a aVar = this.n;
        if (aVar != null) {
            aVar.a(str);
            this.n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onIgniteServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.fyber.inneractive.sdk.ignite.o newBuilder;
        java.lang.String str;
        android.content.Context context;
        com.fyber.inneractive.sdk.util.IAlog.a("IgniteAdapter: onIgniteServiceConnected", new java.lang.Object[0]);
        this.l = componentName.getPackageName();
        this.b = com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.j) {
            com.fyber.inneractive.sdk.ignite.l lVar = this.p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.j = true;
        byte[] bArr = null;
        try {
            newBuilder = com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest.newBuilder();
            java.lang.String str2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.c;
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppId(str2);
            java.lang.String packageName = com.fyber.inneractive.sdk.util.o.f4302a.getPackageName();
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setBundle(packageName);
            java.lang.String version = com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion();
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setSdkVersion(version);
            java.lang.String str3 = this.l;
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgnitePackageName(str3);
        } catch (java.lang.Throwable unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to build ignite request", new java.lang.Object[0]);
        }
        if (!android.text.TextUtils.isEmpty(this.l) && (context = this.f3777a) != null) {
            try {
                str = context.getPackageManager().getPackageInfo(this.l, 0).versionName;
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.a("Failed to resolve ignite version", new java.lang.Object[0]);
            }
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
            java.lang.String a2 = com.fyber.inneractive.sdk.util.o.a(this.f3777a);
            newBuilder.c();
            ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a2);
            bArr = ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
            if (bArr == null) {
                com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.a1(new com.fyber.inneractive.sdk.ignite.b(this), bArr, this.o));
                return;
            }
            return;
        }
        str = null;
        newBuilder.c();
        ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
        java.lang.String a22 = com.fyber.inneractive.sdk.util.o.a(this.f3777a);
        newBuilder.c();
        ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a22);
        bArr = ((com.fyber.inneractive.sdk.ignite.IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
        if (bArr == null) {
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceConnectionFailed(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onOdtUnsupported() {
        com.fyber.inneractive.sdk.ignite.l lVar;
        com.fyber.inneractive.sdk.util.IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f || (lVar = this.p) == null) {
            return;
        }
        lVar.destroy();
        this.p = null;
    }

    public final void a(com.fyber.inneractive.sdk.ignite.j jVar, java.lang.String str) {
        if (this.i) {
            return;
        }
        this.i = true;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
        wVar.b = tVar;
        wVar.f3860a = null;
        wVar.d = null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a2 = jVar.a();
        try {
            jSONObject.put(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, a2);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }

    public final void a(com.digitalturbine.ignite.authenticator.listeners.internal.a aVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new java.lang.Object[0]);
        this.n = aVar;
        com.fyber.inneractive.sdk.ignite.l lVar = this.p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(java.lang.String str, com.fyber.inneractive.sdk.ignite.g gVar) {
        java.lang.String a2;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("Starting install timeout with %d", java.lang.Long.valueOf(this.k));
        com.fyber.inneractive.sdk.ignite.d dVar = new com.fyber.inneractive.sdk.ignite.d(this);
        this.m = dVar;
        com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar, this.k);
        if (n() && !o() && this.b != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI iIgniteServiceAPI = this.b;
                java.lang.String jSONObject3 = jSONObject.toString();
                android.os.Bundle bundle = this.c;
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.fyber.inneractive.sdk.ignite.i iVar = this.d;
                com.fyber.inneractive.sdk.ignite.c cVar = new com.fyber.inneractive.sdk.ignite.c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(jSONObject3, bundle, bundle2, new com.fyber.inneractive.sdk.ignite.s((com.fyber.inneractive.sdk.ignite.e) iVar.f3778a, cVar));
                return;
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.a("Failed to install app", new java.lang.Object[0]);
                return;
            }
        }
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.ignite.r rVar = (com.fyber.inneractive.sdk.ignite.r) it.next();
            if (rVar != null) {
                if (o()) {
                    a2 = com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a();
                } else {
                    a2 = com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a();
                }
                rVar.a((java.lang.String) null, a2, (java.lang.String) null);
            }
        }
    }
}
