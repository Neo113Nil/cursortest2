package com.ironsource;

/* loaded from: classes5.dex */
public class T9 {

    /* renamed from: a, reason: collision with root package name */
    com.ironsource.Q6 f5982a = new com.ironsource.Q6();

    class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ com.ironsource.EnumC3315ue b;

        a(com.ironsource.EnumC3315ue enumC3315ue) {
            this.b = enumC3315ue;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.T9.this.f5982a.a(com.ironsource.M6.g0, new org.json.JSONArray().put(this.b.b()));
        }
    }

    public void a(org.json.JSONObject jSONObject) {
        this.f5982a.a(com.ironsource.M6.u, (java.lang.Object) jSONObject);
    }

    public void b() {
        this.f5982a.a(com.ironsource.M6.T0);
    }

    public void c(java.lang.String str) {
        this.f5982a.a(com.ironsource.M6.L0, str);
    }

    public void d(java.lang.String str) {
        this.f5982a.a(com.ironsource.M6.N0, str);
    }

    public void e(java.lang.String str) {
        this.f5982a.a(com.ironsource.mediationsdk.metadata.a.i, str);
    }

    public void f(java.lang.String str) {
        this.f5982a.a(com.ironsource.M6.c1, str);
    }

    public void g(java.lang.String str) {
        this.f5982a.a(com.ironsource.M6.A, str);
    }

    public void h(java.lang.String str) {
        this.f5982a.a("sid", str);
    }

    public void i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f5982a.a(com.ironsource.M6.e0, str);
    }

    public void a(boolean z) {
        this.f5982a.a(com.ironsource.M6.S0, java.lang.Boolean.valueOf(z));
    }

    public void b(org.json.JSONObject jSONObject) {
        this.f5982a.a(com.ironsource.M6.h1, (java.lang.Object) jSONObject);
    }

    public void c(int i) {
        this.f5982a.a(com.ironsource.M6.f0, java.lang.Integer.valueOf(i));
    }

    public void a(java.util.List<java.lang.String> list) {
        if (list != null) {
            this.f5982a.a(com.ironsource.M6.T0, (java.lang.Object) new org.json.JSONArray((java.util.Collection) list));
        }
    }

    public void b(boolean z) {
        this.f5982a.a("gpi", java.lang.Boolean.valueOf(z));
    }

    public void a() {
        this.f5982a.a(com.ironsource.M6.S0);
    }

    public void b(int i) {
        if (i >= 0) {
            this.f5982a.a(com.ironsource.M6.V0, java.lang.Integer.valueOf(i));
        }
    }

    public void a(android.content.Context context) {
        this.f5982a.a(context);
    }

    public void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f5982a.a(com.ironsource.M6.F1, str);
    }

    public void a(java.lang.Boolean bool) {
        this.f5982a.a(com.ironsource.M6.W0, bool);
    }

    public void a(com.ironsource.EnumC3315ue enumC3315ue) {
        new java.lang.Thread(new com.ironsource.T9.a(enumC3315ue)).start();
    }

    public void b(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        android.app.ActivityManager.MemoryInfo o = a2.o(context);
        this.f5982a.a(com.ironsource.M6.w, a2.c(o));
        this.f5982a.a(com.ironsource.M6.x, a2.b(o));
    }

    public void a(com.ironsource.P7 p7) {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.ironsource.M6.E, p7.a());
            hashMap.put(com.ironsource.M6.D, p7.b());
            hashMap.put(com.ironsource.M6.V, p7.c());
            this.f5982a.a(hashMap);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f5982a.a("abt", str);
    }

    public void a(int i) {
        this.f5982a.a(com.ironsource.M6.j0, java.lang.Integer.valueOf(i));
    }
}
