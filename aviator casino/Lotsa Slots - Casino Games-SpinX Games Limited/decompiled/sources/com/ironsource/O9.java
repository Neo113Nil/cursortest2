package com.ironsource;

/* loaded from: classes5.dex */
public final class O9 implements com.ironsource.InterfaceC3118je, com.ironsource.InterfaceC3305u4, com.ironsource.InterfaceC3287t4, com.ironsource.InterfaceC3251r4, com.ironsource.InterfaceC3269s4, com.ironsource.U9, com.ironsource.Mc {
    private static final java.lang.String m = "IronSourceAdsPublisherAgent";
    private static com.ironsource.O9 n;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f5871a;
    private java.lang.String b;
    private java.lang.String c;
    private com.ironsource.U4 d;
    private com.ironsource.C3188nc e;
    private com.ironsource.C2947a4 g;
    private boolean f = false;
    private com.ironsource.sdk.controller.FeaturesManager h = com.ironsource.sdk.controller.FeaturesManager.getInstance();
    private com.ironsource.M8.a i = com.ironsource.Jb.Q().j();
    private com.ironsource.Q.a j = com.ironsource.Jb.Q().G();
    private com.ironsource.Q k = com.ironsource.Jb.Y().I();
    private com.ironsource.InterfaceC3166m8 l = com.ironsource.Jb.Y().t();

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5872a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.T4 c;

        a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4) {
            this.f5872a = str;
            this.b = str2;
            this.c = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5872a, this.b, this.c, (com.ironsource.InterfaceC3305u4) o9);
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f5873a;

        b(org.json.JSONObject jSONObject) {
            this.f5873a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5873a, (com.ironsource.InterfaceC3305u4) o9);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5874a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.T4 c;

        c(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4) {
            this.f5874a = str;
            this.b = str2;
            this.c = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5874a, this.b, this.c, (com.ironsource.InterfaceC3287t4) o9);
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5875a;

        d(java.lang.String str) {
            this.f5875a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5875a, o9);
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f5876a;

        e(org.json.JSONObject jSONObject) {
            this.f5876a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5876a, (com.ironsource.InterfaceC3287t4) o9);
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.J9 f5877a;
        final /* synthetic */ java.util.Map b;

        f(com.ironsource.J9 j9, java.util.Map map) {
            this.f5877a = j9;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3202o8.e eVar = this.f5877a.i() ? com.ironsource.C3202o8.e.Banner : com.ironsource.C3202o8.e.Interstitial;
            com.ironsource.T4 a2 = com.ironsource.O9.this.d.a(eVar, this.f5877a);
            com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
            c3238q8.a(com.ironsource.B5.x, java.lang.Boolean.valueOf(this.f5877a.j())).a(com.ironsource.B5.G, java.lang.Boolean.valueOf(this.f5877a.m())).a(com.ironsource.B5.v, this.f5877a.g()).a(com.ironsource.B5.w, com.ironsource.V9.a(this.f5877a)).a(com.ironsource.B5.I, java.lang.Long.valueOf(com.ironsource.N.f5845a.b(this.f5877a.e())));
            com.ironsource.C3327v8.a(com.ironsource.C3083he.h, c3238q8.a());
            if (eVar == com.ironsource.C3202o8.e.Banner) {
                com.ironsource.O9 o9 = com.ironsource.O9.this;
                o9.f5871a.a(o9.b, o9.c, a2, (com.ironsource.InterfaceC3269s4) o9);
                com.ironsource.O9 o92 = com.ironsource.O9.this;
                o92.f5871a.a(a2, this.b, (com.ironsource.InterfaceC3269s4) o92);
                return;
            }
            com.ironsource.O9 o93 = com.ironsource.O9.this;
            o93.f5871a.a(o93.b, o93.c, a2, (com.ironsource.InterfaceC3287t4) o93);
            com.ironsource.O9 o94 = com.ironsource.O9.this;
            o94.f5871a.b(a2, this.b, o94);
        }
    }

    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f5878a;
        final /* synthetic */ java.util.Map b;

        g(com.ironsource.T4 t4, java.util.Map map) {
            this.f5878a = t4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.O9 o9 = com.ironsource.O9.this;
            o9.f5871a.a(this.f5878a, this.b, (com.ironsource.InterfaceC3287t4) o9);
        }
    }

    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.J9 f5879a;

        h(com.ironsource.J9 j9) {
            this.f5879a = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3202o8.e eVar = this.f5879a.i() ? com.ironsource.C3202o8.e.Banner : com.ironsource.C3202o8.e.Interstitial;
            com.ironsource.T4 a2 = com.ironsource.O9.this.d.a(eVar, this.f5879a);
            com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
            c3238q8.a(com.ironsource.B5.x, java.lang.Boolean.valueOf(this.f5879a.j())).a(com.ironsource.B5.v, this.f5879a.g()).a(com.ironsource.B5.w, com.ironsource.V9.a(this.f5879a)).a("isMultipleAdObjects", java.lang.Boolean.valueOf(this.f5879a.l()));
            com.ironsource.C3327v8.a(com.ironsource.C3083he.m, c3238q8.a());
            if (eVar == com.ironsource.C3202o8.e.Banner) {
                com.ironsource.O9.this.f5871a.a(a2);
            } else {
                a2.a(false);
                com.ironsource.O9.this.f5871a.b(a2);
            }
        }
    }

    private O9(android.content.Context context, int i) {
        c(context);
    }

    public static com.ironsource.U9 a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return a(str, str2, context);
    }

    public static synchronized com.ironsource.O9 b(android.content.Context context) throws java.lang.Exception {
        com.ironsource.O9 a2;
        synchronized (com.ironsource.O9.class) {
            a2 = a(context, 0);
        }
        return a2;
    }

    private void c(android.content.Context context) {
        try {
            com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration();
            com.ironsource.C2989ca.a(context);
            com.ironsource.sdk.utils.IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.Bf(com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.X3.a.k)));
            com.ironsource.C2989ca.e().d(com.ironsource.sdk.utils.SDKUtils.getSDKVersion());
            this.d = new com.ironsource.U4();
            com.ironsource.C2947a4 c2947a4 = new com.ironsource.C2947a4();
            this.g = c2947a4;
            if (context instanceof android.app.Activity) {
                c2947a4.a((android.app.Activity) context);
            }
            int debugMode = this.h.getDebugMode();
            this.e = new com.ironsource.C3188nc();
            this.f5871a = new com.ironsource.sdk.controller.e(context, this.g, this.d, com.ironsource.Q7.f5934a, debugMode, this.h.getDataManagerConfig(), this.b, this.c, this.e);
            com.ironsource.sdk.utils.Logger.enableLogging(debugMode);
            com.ironsource.sdk.utils.Logger.i(m, "C'tor");
            a(context);
            this.e.d();
            this.e.e();
            this.e.a(context);
            this.e.b();
            this.e.a();
            this.e.b(context);
            this.e.c();
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3287t4
    public void d(java.lang.String str, java.lang.String str2) {
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.Interstitial, str);
        if (d2 != null) {
            com.ironsource.J9 c2 = d2.c();
            this.j.a(com.ironsource.EnumC3194o0.SHOW_FAIL, c2.e());
            if (c(c2)) {
                this.i.a(new com.ironsource.C3137kf(this.k.a(c2.e())));
            }
            com.ironsource.Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.Mc
    public void e(android.app.Activity activity) {
        this.g.a(activity);
        this.f5871a.g();
        this.f5871a.b(activity);
    }

    @Override // com.ironsource.InterfaceC3287t4
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.Interstitial, str);
        com.ironsource.Jc b2 = b(d2);
        if (d2 == null || b2 == null) {
            return;
        }
        b2.onInterstitialAdRewarded(str, i);
    }

    public static synchronized com.ironsource.U9 a(java.lang.String str, java.lang.String str2, android.content.Context context) {
        com.ironsource.O9 o9;
        synchronized (com.ironsource.O9.class) {
            if (n == null) {
                com.ironsource.C3327v8.a(com.ironsource.C3083he.f6293a);
                n = new com.ironsource.O9(str, str2, context);
            }
            o9 = n;
        }
        return o9;
    }

    private com.ironsource.Jc b(com.ironsource.T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (com.ironsource.Jc) t4.i();
    }

    @Override // com.ironsource.InterfaceC3118je
    public void b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("demandSourceName");
        if (android.text.TextUtils.isEmpty(optString)) {
            return;
        }
        this.f5871a.a(new com.ironsource.O9.d(optString));
    }

    @Override // com.ironsource.InterfaceC3118je, com.ironsource.U9
    public void b(android.app.Activity activity) {
        if (this.f) {
            return;
        }
        d(activity);
    }

    public static synchronized com.ironsource.O9 a(android.content.Context context, int i) throws java.lang.Exception {
        com.ironsource.O9 o9;
        synchronized (com.ironsource.O9.class) {
            com.ironsource.sdk.utils.Logger.i(m, "getInstance()");
            if (n == null) {
                n = new com.ironsource.O9(context, i);
            }
            o9 = n;
        }
        return o9;
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void b(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        com.ironsource.Jc b2;
        com.ironsource.T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
                com.ironsource.Oc c2 = c(d2);
                if (c2 != null) {
                    c2.d();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.C3202o8.e.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialClose();
        }
    }

    private com.ironsource.T4 d(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.ironsource.U9
    public com.ironsource.sdk.controller.e a() {
        return this.f5871a;
    }

    private com.ironsource.Hc a(com.ironsource.T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (com.ironsource.Hc) t4.i();
    }

    @Override // com.ironsource.InterfaceC3118je
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.Oc oc) {
        this.b = str;
        this.c = str2;
        this.f5871a.a(new com.ironsource.O9.a(str, str2, this.d.a(com.ironsource.C3202o8.e.RewardedVideo, str3, map, oc)));
    }

    @Override // com.ironsource.Mc
    public void d(android.app.Activity activity) {
        try {
            this.f5871a.e();
            this.f5871a.a((android.content.Context) activity);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    O9(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.b = str;
        this.c = str2;
        c(context);
    }

    @Override // com.ironsource.InterfaceC3305u4
    public void b(java.lang.String str, java.lang.String str2) {
        com.ironsource.Oc c2;
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(str2);
    }

    @Override // com.ironsource.InterfaceC3118je
    public void a(org.json.JSONObject jSONObject) {
        this.f5871a.a(new com.ironsource.O9.b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3118je
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.Jc jc) {
        this.b = str;
        this.c = str2;
        this.f5871a.a(new com.ironsource.O9.c(str, str2, this.d.a(com.ironsource.C3202o8.e.Interstitial, str3, map, jc)));
    }

    @Override // com.ironsource.InterfaceC3287t4
    public void b(java.lang.String str) {
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.Interstitial, str);
        if (d2 != null) {
            com.ironsource.J9 c2 = d2.c();
            this.j.a(com.ironsource.EnumC3194o0.SHOW_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new com.ironsource.C3155lf(this.k.a(c2.e())));
            }
            com.ironsource.Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3118je
    public boolean a(java.lang.String str) {
        return this.f5871a.a(str);
    }

    @Override // com.ironsource.InterfaceC3118je, com.ironsource.U9
    public void a(android.app.Activity activity) {
        if (this.f) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void a(com.ironsource.C3202o8.e eVar, java.lang.String str, com.ironsource.C2962b1 c2962b1) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(eVar, str);
        if (d2 != null) {
            d2.b(2);
            if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
                com.ironsource.Oc c2 = c(d2);
                if (c2 != null) {
                    c2.a(c2962b1);
                    return;
                }
                return;
            }
            if (eVar == com.ironsource.C3202o8.e.Interstitial) {
                com.ironsource.Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.C3202o8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.W9
    public void b(android.app.Activity activity, com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) {
        if (com.ironsource.Jb.Y().h().j()) {
            this.g.a(activity);
        }
        a(j9, map);
    }

    private void b(com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) {
        com.ironsource.sdk.utils.Logger.d(m, "loadOnNewInstance " + j9.e());
        this.f5871a.a(new com.ironsource.O9.f(j9, map));
    }

    @Override // com.ironsource.W9
    public void b(com.ironsource.J9 j9) {
        com.ironsource.sdk.utils.Logger.d(m, "destroyInstance " + j9.e());
        if (c(j9)) {
            this.j.a(com.ironsource.EnumC3194o0.DESTROYED, j9.e());
            this.i.a(new com.ironsource.C3084hf(this.k.a(j9.e())));
        }
        this.f5871a.a(new com.ironsource.O9.h(j9));
    }

    private com.ironsource.Oc c(com.ironsource.T4 t4) {
        if (t4 == null) {
            return null;
        }
        return (com.ironsource.Oc) t4.i();
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void a(com.ironsource.C3202o8.e eVar, java.lang.String str, java.lang.String str2) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(eVar, str);
        com.ironsource.C3238q8 a3 = new com.ironsource.C3238q8().a(com.ironsource.B5.v, str).a(com.ironsource.B5.w, eVar).a(com.ironsource.B5.A, str2);
        if (d2 != null) {
            com.ironsource.N n2 = com.ironsource.N.f5845a;
            a3.a(com.ironsource.B5.I, java.lang.Long.valueOf(n2.b(d2.h())));
            a3.a(com.ironsource.B5.x, java.lang.Boolean.valueOf(com.ironsource.C3345w8.a(d2)));
            n2.a(d2.h());
            d2.b(3);
            if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
                com.ironsource.Oc c2 = c(d2);
                if (c2 != null) {
                    c2.b(str2);
                }
            } else if (eVar == com.ironsource.C3202o8.e.Interstitial) {
                com.ironsource.Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitFailed(str2);
                }
            } else if (eVar == com.ironsource.C3202o8.e.Banner && (a2 = a(d2)) != null) {
                a2.onBannerLoadFail(str2);
            }
        }
        com.ironsource.C3327v8.a(com.ironsource.C3083he.i, a3.a());
    }

    @Override // com.ironsource.InterfaceC3118je
    public void c(org.json.JSONObject jSONObject) {
        this.f5871a.a(new com.ironsource.O9.e(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3118je, com.ironsource.U9
    public void c(android.app.Activity activity) {
        try {
            com.ironsource.sdk.utils.Logger.i(m, "release()");
            com.ironsource.X4.g();
            this.g.b();
            this.f5871a.a((android.content.Context) activity);
            this.f5871a.a();
            this.f5871a = null;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
        n = null;
    }

    @Override // com.ironsource.InterfaceC3305u4
    public void c(java.lang.String str) {
        com.ironsource.Oc c2;
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.c();
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void c(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        com.ironsource.Oc c2;
        com.ironsource.T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == com.ironsource.C3202o8.e.Interstitial) {
                com.ironsource.Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.C3202o8.e.RewardedVideo || (c2 = c(d2)) == null) {
                return;
            }
            c2.b();
        }
    }

    @Override // com.ironsource.InterfaceC3269s4
    public void c(java.lang.String str, java.lang.String str2) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadFail(str2);
    }

    private void c(com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            map = a(map);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.A, e2.getMessage()).a(com.ironsource.B5.x, java.lang.Boolean.valueOf(j9.j())).a(com.ironsource.B5.G, java.lang.Boolean.valueOf(j9.m())).a(com.ironsource.B5.v, j9.g()).a(com.ironsource.B5.w, com.ironsource.V9.a(j9)).a(com.ironsource.B5.I, java.lang.Long.valueOf(com.ironsource.N.f5845a.b(j9.e())));
            com.ironsource.N.f5845a.a(j9.e());
            com.ironsource.C3327v8.a(com.ironsource.C3083he.k, a2.a());
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.ironsource.sdk.utils.Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(j9, map);
    }

    @Override // com.ironsource.InterfaceC3305u4
    public void a(java.lang.String str, int i) {
        com.ironsource.Oc c2;
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.RewardedVideo, str);
        if (d2 == null || (c2 = c(d2)) == null) {
            return;
        }
        c2.a(i);
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void a(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(eVar, str);
        if (d2 != null) {
            if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
                com.ironsource.Oc c2 = c(d2);
                if (c2 != null) {
                    c2.a();
                    return;
                }
                return;
            }
            if (eVar == com.ironsource.C3202o8.e.Interstitial) {
                com.ironsource.Jc b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.C3202o8.e.Banner || (a2 = a(d2)) == null) {
                return;
            }
            a2.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC3251r4
    public void a(com.ironsource.C3202o8.e eVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(eVar, str);
        if (d2 == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            com.ironsource.sdk.utils.Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + d2.f());
            if (eVar == com.ironsource.C3202o8.e.Interstitial) {
                com.ironsource.Jc b2 = b(d2);
                if (b2 != null) {
                    jSONObject.put("demandSourceName", str);
                    b2.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == com.ironsource.C3202o8.e.RewardedVideo) {
                com.ironsource.Oc c2 = c(d2);
                if (c2 != null) {
                    jSONObject.put("demandSourceName", str);
                    c2.a(str2, jSONObject);
                }
            } else if (eVar == com.ironsource.C3202o8.e.Banner && (a2 = a(d2)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    a2.onBannerShowSuccess();
                }
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public boolean c(com.ironsource.J9 j9) {
        return j9.l() && !j9.i() && a(j9);
    }

    @Override // com.ironsource.InterfaceC3287t4
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
        com.ironsource.T4 d2 = d(eVar, str);
        com.ironsource.C3238q8 a2 = new com.ironsource.C3238q8().a(com.ironsource.B5.v, str);
        if (d2 != null) {
            com.ironsource.J9 c2 = d2.c();
            this.j.a(jSONObject, com.ironsource.EnumC3194o0.LOAD_SUCCESS, c2.e());
            if (c(c2)) {
                this.i.a(new com.ironsource.C3119jf(this.k.a(c2.e())));
            }
            com.ironsource.C3238q8 a3 = a2.a(com.ironsource.B5.w, com.ironsource.C3345w8.a(d2, eVar)).a(com.ironsource.B5.x, java.lang.Boolean.valueOf(com.ironsource.C3345w8.a(d2)));
            com.ironsource.N n2 = com.ironsource.N.f5845a;
            a3.a(com.ironsource.B5.I, java.lang.Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            com.ironsource.Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadSuccess(d2.c());
            }
        }
        com.ironsource.C3327v8.a(com.ironsource.C3083he.l, a2.a());
    }

    @Override // com.ironsource.InterfaceC3287t4
    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.Interstitial;
        com.ironsource.T4 d2 = d(eVar, str);
        com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
        c3238q8.a(com.ironsource.B5.A, str2).a(com.ironsource.B5.v, str);
        if (d2 != null) {
            com.ironsource.C3238q8 a2 = c3238q8.a(com.ironsource.B5.w, com.ironsource.C3345w8.a(d2, eVar));
            if (d2.e() == 2) {
                obj = com.ironsource.B5.E;
            } else {
                obj = com.ironsource.B5.F;
            }
            com.ironsource.C3238q8 a3 = a2.a(com.ironsource.B5.y, obj).a(com.ironsource.B5.x, java.lang.Boolean.valueOf(com.ironsource.C3345w8.a(d2)));
            com.ironsource.N n2 = com.ironsource.N.f5845a;
            a3.a(com.ironsource.B5.I, java.lang.Long.valueOf(n2.b(d2.h())));
            n2.a(d2.h());
            com.ironsource.Jc b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.C3327v8.a(com.ironsource.C3083he.g, c3238q8.a());
    }

    @Override // com.ironsource.InterfaceC3118je
    public void a(java.lang.String str, java.lang.String str2, int i) {
        com.ironsource.C3202o8.e productType;
        com.ironsource.T4 a2;
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || (productType = com.ironsource.sdk.utils.SDKUtils.getProductType(str)) == null || (a2 = this.d.a(productType, str2)) == null) {
            return;
        }
        a2.c(i);
    }

    @Override // com.ironsource.InterfaceC3269s4
    public void a(java.lang.String str, com.ironsource.C3041f8 c3041f8) {
        com.ironsource.Hc a2;
        com.ironsource.T4 d2 = d(com.ironsource.C3202o8.e.Banner, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onBannerLoadSuccess(d2.c(), c3041f8);
    }

    @Override // com.ironsource.W9
    public void a(com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        map.put(com.ironsource.X3.i.y0, java.lang.String.valueOf(currentTimeMillis));
        com.ironsource.N.f5845a.a(j9.e(), currentTimeMillis);
        com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
        c3238q8.a(com.ironsource.B5.x, java.lang.Boolean.valueOf(j9.j())).a(com.ironsource.B5.G, java.lang.Boolean.valueOf(j9.m())).a(com.ironsource.B5.v, j9.g()).a(com.ironsource.B5.w, com.ironsource.V9.a(j9)).a(com.ironsource.B5.I, java.lang.Long.valueOf(currentTimeMillis));
        com.ironsource.C3327v8.a(com.ironsource.C3083he.f, c3238q8.a());
        com.ironsource.sdk.utils.Logger.d(m, "loadAd " + j9.e());
        com.ironsource.P p = new com.ironsource.P(j9);
        this.j.a(p);
        this.j.a(new org.json.JSONObject(map), com.ironsource.EnumC3194o0.LOAD_REQUEST, p.c());
        if (c(j9)) {
            this.i.a(new com.ironsource.Cif(p));
        }
        if (j9.k()) {
            c(j9, map);
        } else {
            b(j9, map);
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put("adm", com.ironsource.sdk.utils.SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.W9
    public void a(android.app.Activity activity, com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) {
        this.g.a(activity);
        com.ironsource.sdk.utils.Logger.i(m, "showAd " + j9.e());
        com.ironsource.T4 a2 = this.d.a(com.ironsource.C3202o8.e.Interstitial, j9.e());
        if (a2 == null) {
            return;
        }
        this.f5871a.a(new com.ironsource.O9.g(a2, map));
    }

    @Override // com.ironsource.W9
    public boolean a(com.ironsource.J9 j9) {
        com.ironsource.sdk.utils.Logger.d(m, "isAdAvailable " + j9.e());
        com.ironsource.T4 a2 = this.d.a(com.ironsource.C3202o8.e.Interstitial, j9.e());
        if (a2 == null) {
            return false;
        }
        return a2.d();
    }

    public void a(android.content.Context context) {
        this.f = false;
        java.lang.Boolean c2 = this.l.c(com.ironsource.X3.a.g);
        if (c2 == null) {
            c2 = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = c2.booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            try {
                ((android.app.Application) context).registerActivityLifecycleCallbacks(new com.ironsource.C3086i(this));
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
                c3238q8.a(com.ironsource.B5.y, th.getMessage());
                com.ironsource.C3327v8.a(com.ironsource.C3083he.u, c3238q8.a());
            }
        }
    }
}
