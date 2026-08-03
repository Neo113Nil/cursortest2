package com.ironsource;

/* loaded from: classes5.dex */
public class Zg {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6125a;
    private android.content.Context b;
    private com.ironsource.C2947a4 c;
    private com.ironsource.U4 d;
    private int e;
    private com.ironsource.C3020e5 f;
    private int g;
    private int h;
    private final java.lang.String i = "Zg";
    private com.ironsource.Zg.a j;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public Zg(android.content.Context context, com.ironsource.C2947a4 c2947a4, com.ironsource.U4 u4, int i, com.ironsource.C3020e5 c3020e5, java.lang.String str) {
        com.ironsource.Zg.a h = h();
        this.j = h;
        if (h != com.ironsource.Zg.a.NOT_ALLOWED) {
            this.b = context;
            this.c = c2947a4;
            this.d = u4;
            this.e = i;
            this.f = c3020e5;
            this.g = 0;
        }
        this.f6125a = str;
    }

    private com.ironsource.Zg.a h() {
        this.h = com.ironsource.sdk.controller.FeaturesManager.getInstance().getInitRecoverTrials();
        com.ironsource.sdk.utils.Logger.i(this.i, "getInitialState mMaxAllowedTrials: " + this.h);
        if (this.h > 0) {
            return com.ironsource.Zg.a.NOT_RECOVERED;
        }
        com.ironsource.sdk.utils.Logger.i(this.i, "recovery is not allowed by config");
        return com.ironsource.Zg.a.NOT_ALLOWED;
    }

    private void j() {
        if (this.g != this.h) {
            this.j = com.ironsource.Zg.a.NOT_RECOVERED;
            return;
        }
        com.ironsource.sdk.utils.Logger.i(this.i, "handleRecoveringEndedFailed | Reached max trials");
        this.j = com.ironsource.Zg.a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.j = com.ironsource.Zg.a.RECOVERED;
    }

    public boolean a(com.ironsource.C3202o8.c cVar, com.ironsource.C3202o8.b bVar) {
        com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: ");
        com.ironsource.Zg.a aVar = this.j;
        if (aVar == com.ironsource.Zg.a.NOT_ALLOWED) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != com.ironsource.C3202o8.c.Native) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == com.ironsource.C3202o8.b.Loading || bVar == com.ironsource.C3202o8.b.None) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == com.ironsource.Zg.a.RECOVERED) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == com.ironsource.Zg.a.IN_RECOVERING) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.b == null || this.c == null || this.d == null) {
            com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        com.ironsource.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public android.content.Context b() {
        return this.b;
    }

    public java.lang.String c() {
        return this.f6125a;
    }

    public com.ironsource.C2947a4 d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public com.ironsource.U4 f() {
        return this.d;
    }

    public com.ironsource.C3020e5 g() {
        return this.f;
    }

    public org.json.JSONObject i() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.X3.i.A0, m());
            jSONObject.put(com.ironsource.X3.i.B0, this.g);
            jSONObject.put(com.ironsource.X3.i.C0, this.h);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public boolean l() {
        return this.j == com.ironsource.Zg.a.IN_RECOVERING;
    }

    public boolean m() {
        return this.j == com.ironsource.Zg.a.RECOVERED;
    }

    public void n() {
        com.ironsource.Zg.a aVar = this.j;
        com.ironsource.Zg.a aVar2 = com.ironsource.Zg.a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.g++;
            com.ironsource.sdk.utils.Logger.i(this.i, "recoveringStarted - trial number " + this.g);
            this.j = aVar2;
        }
    }

    public void a() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    public void a(boolean z) {
        if (this.j != com.ironsource.Zg.a.IN_RECOVERING) {
            return;
        }
        if (z) {
            k();
        } else {
            j();
        }
    }
}
