package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public final class e implements com.digitalturbine.ignite.authenticator.decorator.a {
    public android.content.Context e;
    public java.lang.String f;
    public java.lang.String g;
    public final java.lang.String h;
    public com.digitalturbine.ignite.authenticator.entities.a i;
    public com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI j;
    public com.digitalturbine.ignite.authenticator.decorator.a n;
    public com.digitalturbine.ignite.authenticator.decorator.a o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3505a = false;
    public boolean b = false;
    public long c = 0;
    public boolean d = false;
    public final android.os.Bundle k = new android.os.Bundle();
    public final java.lang.Object l = new java.lang.Object();
    public java.lang.String p = null;
    public final com.digitalturbine.ignite.authenticator.decorator.b q = new com.digitalturbine.ignite.authenticator.decorator.b(this);
    public final com.digitalturbine.ignite.authenticator.callbacks.a m = new com.digitalturbine.ignite.authenticator.callbacks.a(this);

    public e(android.content.Context context) {
        java.lang.String str = null;
        this.e = context.getApplicationContext();
        android.content.Intent intent = new android.content.Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        android.content.Context context2 = this.e;
        if (context2 != null) {
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices.size() > 0) {
                str = queryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.h = str;
        this.i = new com.digitalturbine.ignite.authenticator.entities.a(false, "");
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean a() {
        com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI iIgniteServiceAPI;
        return this.d && (iIgniteServiceAPI = this.j) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void b() {
        if (!(!android.text.TextUtils.isEmpty(this.h))) {
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            com.digitalturbine.ignite.authenticator.utils.concurency.c.f3513a.execute(this.q);
            return;
        }
        if (!this.f3505a || f()) {
            m();
            return;
        }
        java.lang.Object[] objArr = {"IgniteAuthenticationComponent"};
        com.digitalturbine.ignite.authenticator.logger.ILogger iLogger = com.digitalturbine.ignite.authenticator.logger.a.b.f3510a;
        if (iLogger != null) {
            iLogger.i("%s : already authenticated", objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(java.lang.String str) {
        java.lang.String str2;
        com.digitalturbine.ignite.authenticator.decorator.a aVar;
        com.digitalturbine.ignite.authenticator.logger.a.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.b = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.p = str;
        this.k.putString("clientToken", str);
        this.f3505a = true;
        java.lang.String str3 = "";
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                str2 = new java.lang.String(android.util.Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (java.lang.Exception e) {
                com.digitalturbine.ignite.authenticator.logger.a.b("%s : decodeJwtBody : %s", "JwtUtil", e.toString());
            }
            if (!str2.isEmpty()) {
                try {
                    long optLong = new org.json.JSONObject(str2).optLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_EXP);
                    this.c = optLong;
                    long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(optLong);
                    try {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.setTimeInMillis(millis);
                        str3 = simpleDateFormat.format(calendar.getTime());
                    } catch (java.lang.Exception unused) {
                    }
                    com.digitalturbine.ignite.authenticator.logger.a.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
                } catch (java.lang.Exception e2) {
                    com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e2);
                    com.digitalturbine.ignite.authenticator.logger.a.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e2.toString());
                }
            }
            aVar = this.n;
            if (aVar == null) {
                aVar.c(str);
                return;
            }
            return;
        }
        str2 = "";
        if (!str2.isEmpty()) {
        }
        aVar = this.n;
        if (aVar == null) {
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String d() {
        return this.h;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void destroy() {
        if (this.e != null && a()) {
            this.e.unbindService(this);
            this.e = null;
        }
        this.o = null;
        this.n = null;
        this.j = null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String e() {
        return this.p;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean f() {
        return this.c > 0 && java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis()) > this.c;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final android.content.Context g() {
        return this.e;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean h() {
        return this.f3505a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String i() {
        return this.i.f3507a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean j() {
        return this.i.b;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI k() {
        return this.j;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void l() {
        b();
    }

    public final void m() {
        if (a()) {
            java.lang.String str = this.f;
            java.lang.String str2 = this.g;
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || this.b) {
                return;
            }
            if ((f() || !this.f3505a) && this.j != null) {
                try {
                    this.b = true;
                    this.k.putInt("sdkFlowTypeKey", 1);
                    this.j.authenticate(this.f, this.g, this.k, this.m);
                } catch (android.os.RemoteException e) {
                    this.b = false;
                    com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_AUTHENTICATION_ERROR, e);
                    com.digitalturbine.ignite.authenticator.logger.a.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e.toString());
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestFailed(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.logger.a.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestSuccess(java.lang.String str, java.lang.String str2) {
        this.f = str;
        this.g = str2;
        m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.j = com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.d = true;
        com.digitalturbine.ignite.authenticator.utils.concurency.c.f3513a.execute(new com.digitalturbine.ignite.authenticator.decorator.c(this, new com.digitalturbine.ignite.authenticator.decorator.d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.d = false;
        this.c = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.logger.a.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.b = false;
        com.digitalturbine.ignite.authenticator.decorator.a aVar = this.n;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.digitalturbine.ignite.authenticator.decorator.a aVar = this.o;
        if (aVar != null) {
            aVar.a(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(com.digitalturbine.ignite.authenticator.decorator.a aVar) {
        this.n = aVar;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void b(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.logger.a.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        com.digitalturbine.ignite.authenticator.decorator.a aVar = this.o;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void b(com.digitalturbine.ignite.authenticator.decorator.a aVar) {
        this.o = aVar;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final boolean c() {
        return f() || !a();
    }
}
