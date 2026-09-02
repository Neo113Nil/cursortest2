package D0;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f198b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f199c;

    public /* synthetic */ f(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f197a = i2;
        this.f199c = obj;
        this.f198b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E1.i iVar;
        Z0.h hVar;
        p0.InterfaceC0953e interfaceC0953e;
        java.util.Set set;
        p0.InterfaceC0953e interfaceC0953e2 = null;
        switch (this.f197a) {
            case 0:
                D0.g gVar = (D0.g) this.f199c;
                try {
                    com.google.android.gms.tasks.Task y2 = ((Z0.h) gVar.f202c).y((com.google.android.gms.tasks.Task) this.f198b);
                    if (y2 == null) {
                        ((D0.m) gVar.f203d).e(new java.lang.NullPointerException("Continuation returned null"));
                        return;
                    }
                    D0.k kVar = D0.e.f196b;
                    y2.a(kVar, gVar);
                    D0.m mVar = (D0.m) y2;
                    D0.h hVar2 = new D0.h(kVar, gVar, 1);
                    D0.j jVar = mVar.f214b;
                    jVar.c(hVar2);
                    mVar.h();
                    jVar.c(new D0.h(kVar, gVar, 0));
                    mVar.h();
                    return;
                } catch (D0.c e2) {
                    if (e2.getCause() instanceof java.lang.Exception) {
                        ((D0.m) gVar.f203d).e((java.lang.Exception) e2.getCause());
                        return;
                    } else {
                        ((D0.m) gVar.f203d).e(e2);
                        return;
                    }
                } catch (java.lang.Exception e3) {
                    ((D0.m) gVar.f203d).e(e3);
                    return;
                }
            case 1:
                synchronized (((D0.g) this.f199c).f202c) {
                    try {
                        D0.a aVar = (D0.a) ((D0.g) this.f199c).f203d;
                        if (aVar != null) {
                            aVar.onComplete((com.google.android.gms.tasks.Task) this.f198b);
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                synchronized (((D0.g) this.f199c).f202c) {
                    try {
                        D0.b bVar = (D0.b) ((D0.g) this.f199c).f203d;
                        if (bVar != null) {
                            bVar.onSuccess(((com.google.android.gms.tasks.Task) this.f198b).c());
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                break;
            case 4:
                h.C0151i c0151i = (h.C0151i) this.f199c;
                g.j jVar2 = c0151i.f3163c;
                if (jVar2 != null && (hVar = jVar2.f2964e) != null) {
                    ((androidx.appcompat.widget.ActionMenuView) hVar.f1903b).getClass();
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = c0151i.f3167g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    h.C0148f c0148f = (h.C0148f) this.f198b;
                    if (!c0148f.b()) {
                        if (c0148f.f3012e != null) {
                            c0148f.d(0, 0, false, false);
                        }
                    }
                    c0151i.f3178r = c0148f;
                }
                c0151i.t = null;
                return;
            case 5:
                h.C0160s c0160s = (h.C0160s) ((java.lang.ref.WeakReference) this.f198b).get();
                if (c0160s != null && c0160s.f3259m) {
                    android.widget.TextView textView = c0160s.f3247a;
                    android.graphics.Typeface typeface = (android.graphics.Typeface) this.f199c;
                    textView.setTypeface(typeface);
                    c0160s.f3258l = typeface;
                    return;
                }
                return;
            case 6:
                o0.o oVar = (o0.o) this.f199c;
                o0.m mVar2 = (o0.m) oVar.f8173f.f8142j.get(oVar.f8169b);
                if (mVar2 == null) {
                    return;
                }
                m0.b bVar2 = (m0.b) this.f198b;
                if ((bVar2.f8043b == 0 ? 1 : 0) == 0) {
                    mVar2.o(bVar2, null);
                    return;
                }
                oVar.f8172e = true;
                n0.InterfaceC0939c interfaceC0939c = oVar.f8168a;
                if (interfaceC0939c.i()) {
                    if (!oVar.f8172e || (interfaceC0953e = oVar.f8170c) == null) {
                        return;
                    }
                    interfaceC0939c.l(interfaceC0953e, oVar.f8171d);
                    return;
                }
                try {
                    interfaceC0939c.l(null, interfaceC0939c.f());
                    return;
                } catch (java.lang.SecurityException e4) {
                    android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    interfaceC0939c.h("Failed to get service from broker.");
                    mVar2.o(new m0.b(10), null);
                    return;
                }
            case 7:
                C0.f fVar = (C0.f) this.f198b;
                m0.b bVar3 = fVar.f109b;
                boolean z2 = bVar3.f8043b == 0;
                o0.v vVar = (o0.v) this.f199c;
                if (z2) {
                    p0.C0962n c0962n = fVar.f110c;
                    p0.AbstractC0966r.c(c0962n);
                    m0.b bVar4 = c0962n.f8275c;
                    if (bVar4.f8043b != 0) {
                        android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(java.lang.String.valueOf(bVar4)), new java.lang.Exception());
                        vVar.f8196h.b(bVar4);
                        vVar.f8195g.g();
                        return;
                    }
                    o0.o oVar2 = vVar.f8196h;
                    android.os.IBinder iBinder = c0962n.f8274b;
                    if (iBinder != null) {
                        int i2 = p0.AbstractBinderC0949a.f8221b;
                        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0953e2 = queryLocalInterface instanceof p0.InterfaceC0953e ? (p0.InterfaceC0953e) queryLocalInterface : new p0.C0948C(iBinder);
                    }
                    oVar2.getClass();
                    if (interfaceC0953e2 == null || (set = vVar.f8193e) == null) {
                        android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
                        oVar2.b(new m0.b(4));
                    } else {
                        oVar2.f8170c = interfaceC0953e2;
                        oVar2.f8171d = set;
                        if (oVar2.f8172e) {
                            oVar2.f8168a.l(interfaceC0953e2, set);
                        }
                    }
                } else {
                    vVar.f8196h.b(bVar3);
                }
                vVar.f8195g.g();
                return;
            case 8:
                P1.B b2 = (P1.B) ((Z0.h) this.f198b).f1903b;
                if (b2 != null) {
                    b2.b((android.graphics.Typeface) this.f199c);
                    return;
                }
                return;
            case 9:
                ((v.d) this.f198b).accept(this.f199c);
                return;
            default:
                x0.e eVar = (x0.e) this.f198b;
                android.content.Context context = (android.content.Context) eVar.f8409b;
                java.lang.String string = x0.e.t(context).getString(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID, null);
                long j2 = x0.e.t((android.content.Context) eVar.f8409b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                D0.m mVar3 = ((D0.d) this.f199c).f194a;
                if (string == null || java.lang.System.currentTimeMillis() > j3) {
                    string = java.util.UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID, string).commit()) {
                            java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
                            android.util.Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new java.lang.String("Failed to store app set ID generated for App "));
                            throw new x0.d("Failed to store the app set ID.");
                        }
                        x0.e.u(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", java.lang.System.currentTimeMillis()).commit()) {
                            java.lang.String valueOf2 = java.lang.String.valueOf(context.getPackageName());
                            android.util.Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new java.lang.String("Failed to store app set ID creation time for App "));
                            throw new x0.d("Failed to store the app set ID creation time.");
                        }
                    } catch (x0.d e5) {
                        mVar3.e(e5);
                        return;
                    }
                } else {
                    try {
                        x0.e.u(context);
                    } catch (x0.d e6) {
                        mVar3.e(e6);
                        return;
                    }
                }
                mVar3.f(new j0.C0916a(string, 1));
                return;
        }
        do {
            try {
                ((java.lang.Runnable) this.f198b).run();
            } catch (java.lang.Throwable th) {
                z1.AbstractC1068v.d(th, k1.j.f7951a);
            }
            iVar = (E1.i) this.f199c;
            java.lang.Runnable o2 = iVar.o();
            if (o2 == null) {
                return;
            }
            this.f198b = o2;
            r2++;
        } while (r2 < 16);
        G1.l lVar = iVar.f280c;
        lVar.getClass();
        lVar.l(iVar, this);
    }

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, int i2, boolean z2) {
        this.f197a = i2;
        this.f198b = obj;
        this.f199c = obj2;
    }
}
