package com.ironsource;

/* loaded from: classes5.dex */
public final class He {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Oe f5743a;
    private final com.ironsource.C3374y1 b;
    private final com.ironsource.F9 c;
    private final com.ironsource.C3065ge d;
    private final com.ironsource.T9 e;

    public He() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(android.content.Context context, com.ironsource.Se serverResponse) {
        com.ironsource.P3.c.C0124c m;
        org.json.JSONObject u;
        java.lang.String c;
        com.ironsource.P3.c.C0124c m2;
        java.lang.String q;
        java.lang.Boolean t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        com.ironsource.P3.c g = serverResponse.d().g();
        this.f5743a.a(context, com.ironsource.InterfaceC3362x7.f6831a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        com.ironsource.P3.c g2 = serverResponse.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        com.ironsource.P3.b f = serverResponse.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        com.ironsource.P3.c g3 = serverResponse.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(u.toString());
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("events");
        if (optJSONObject != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"events\")");
            jSONObject.remove("events");
            java.util.Map<java.lang.String, java.lang.String> b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        java.util.Map<java.lang.String, java.lang.String> b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public He(com.ironsource.Oe sharedPreferences, com.ironsource.C3374y1 appEventsManager, com.ironsource.F9 interstitialEventsManager, com.ironsource.C3065ge rewardedVideoEventsManager, com.ironsource.T9 globalDataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f5743a = sharedPreferences;
        this.b = appEventsManager;
        this.c = interstitialEventsManager;
        this.d = rewardedVideoEventsManager;
        this.e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ He(com.ironsource.Oe oe, com.ironsource.C3374y1 c3374y1, com.ironsource.F9 f9, com.ironsource.C3065ge c3065ge, com.ironsource.T9 t9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(oe, r10, r1, c3065ge, (i & 16) != 0 ? new com.ironsource.T9() : t9);
        oe = (i & 1) != 0 ? new com.ironsource.Ne() : oe;
        com.ironsource.C3374y1 q = (i & 2) != 0 ? com.ironsource.Jb.u.d().q() : c3374y1;
        if ((i & 4) != 0) {
            f9 = com.ironsource.F9.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f9, "getInstance()");
        }
        com.ironsource.F9 f92 = f9;
        if ((i & 8) != 0) {
            c3065ge = com.ironsource.C3065ge.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c3065ge, "getInstance()");
        }
    }
}
