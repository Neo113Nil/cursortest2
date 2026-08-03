package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class n implements com.ironsource.sdk.controller.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Q7 f6645a;
    private final java.lang.String b;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f6646a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        a(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f6646a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f6646a == null) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", com.ironsource.sdk.controller.n.this.b);
                this.f6646a.a(new com.ironsource.sdk.controller.f.a(this.b.f(), jSONObject));
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3305u4 f6647a;
        final /* synthetic */ com.ironsource.T4 b;

        b(com.ironsource.InterfaceC3305u4 interfaceC3305u4, com.ironsource.T4 t4) {
            this.f6647a = interfaceC3305u4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6647a.a(com.ironsource.C3202o8.e.RewardedVideo, this.b.h(), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3305u4 f6648a;
        final /* synthetic */ org.json.JSONObject b;

        c(com.ironsource.InterfaceC3305u4 interfaceC3305u4, org.json.JSONObject jSONObject) {
            this.f6648a = interfaceC3305u4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6648a.b(this.b.optString("demandSourceName"), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3287t4 f6649a;
        final /* synthetic */ com.ironsource.T4 b;

        d(com.ironsource.InterfaceC3287t4 interfaceC3287t4, com.ironsource.T4 t4) {
            this.f6649a = interfaceC3287t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6649a.a(com.ironsource.C3202o8.e.Interstitial, this.b.h(), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3287t4 f6650a;
        final /* synthetic */ java.lang.String b;

        e(com.ironsource.InterfaceC3287t4 interfaceC3287t4, java.lang.String str) {
            this.f6650a = interfaceC3287t4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6650a.a(this.b, com.ironsource.sdk.controller.n.this.b);
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3287t4 f6651a;
        final /* synthetic */ com.ironsource.T4 b;

        f(com.ironsource.InterfaceC3287t4 interfaceC3287t4, com.ironsource.T4 t4) {
            this.f6651a = interfaceC3287t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6651a.a(this.b.h(), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3287t4 f6652a;
        final /* synthetic */ org.json.JSONObject b;

        g(com.ironsource.InterfaceC3287t4 interfaceC3287t4, org.json.JSONObject jSONObject) {
            this.f6652a = interfaceC3287t4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6652a.d(this.b.optString("demandSourceName"), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3287t4 f6653a;
        final /* synthetic */ com.ironsource.T4 b;

        h(com.ironsource.InterfaceC3287t4 interfaceC3287t4, com.ironsource.T4 t4) {
            this.f6653a = interfaceC3287t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6653a.d(this.b.h(), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3269s4 f6654a;
        final /* synthetic */ java.util.Map b;

        i(com.ironsource.InterfaceC3269s4 interfaceC3269s4, java.util.Map map) {
            this.f6654a = interfaceC3269s4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6654a.c((java.lang.String) this.b.get("demandSourceName"), com.ironsource.sdk.controller.n.this.b);
        }
    }

    class j implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3269s4 f6655a;
        final /* synthetic */ org.json.JSONObject b;

        j(com.ironsource.InterfaceC3269s4 interfaceC3269s4, org.json.JSONObject jSONObject) {
            this.f6655a = interfaceC3269s4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6655a.c(this.b.optString("demandSourceName"), com.ironsource.sdk.controller.n.this.b);
        }
    }

    n(java.lang.String str, com.ironsource.Q7 q7) {
        this.f6645a = q7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.app.Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.content.Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(java.lang.String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(android.content.Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public com.ironsource.C3202o8.c h() {
        return com.ironsource.C3202o8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (interfaceC3287t4 != null) {
            a(new com.ironsource.sdk.controller.n.f(interfaceC3287t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        if (interfaceC3305u4 != null) {
            a(new com.ironsource.sdk.controller.n.b(interfaceC3305u4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        if (interfaceC3305u4 != null) {
            a(new com.ironsource.sdk.controller.n.c(interfaceC3305u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (interfaceC3287t4 != null) {
            a(new com.ironsource.sdk.controller.n.d(interfaceC3287t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (interfaceC3287t4 != null) {
            a(new com.ironsource.sdk.controller.n.e(interfaceC3287t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (interfaceC3287t4 != null) {
            a(new com.ironsource.sdk.controller.n.g(interfaceC3287t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (interfaceC3287t4 != null) {
            a(new com.ironsource.sdk.controller.n.h(interfaceC3287t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        if (interfaceC3269s4 != null) {
            interfaceC3269s4.a(com.ironsource.C3202o8.e.Banner, t4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        if (interfaceC3269s4 != null) {
            a(new com.ironsource.sdk.controller.n.i(interfaceC3269s4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        if (interfaceC3269s4 != null) {
            a(new com.ironsource.sdk.controller.n.j(interfaceC3269s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        a(new com.ironsource.sdk.controller.n.a(aVar, cVar));
    }

    void a(java.lang.Runnable runnable) {
        com.ironsource.Q7 q7 = this.f6645a;
        if (q7 != null) {
            q7.c(runnable);
        }
    }
}
