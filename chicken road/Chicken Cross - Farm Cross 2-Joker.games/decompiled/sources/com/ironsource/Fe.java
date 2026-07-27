package com.ironsource;

import android.content.Context;
import com.ironsource.M3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Fe {

    /* renamed from: a, reason: collision with root package name */
    private final Me f7631a;
    private final C4703w1 b;
    private final F9 c;
    private final C4412fe d;
    private final T9 e;

    public Fe() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(Context context, Qe serverResponse) {
        M3.c.C0313c m;
        JSONObject u;
        String c;
        M3.c.C0313c m2;
        String q;
        Boolean t;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        M3.c g = serverResponse.d().g();
        this.f7631a.a(context, InterfaceC4673u7.f8699a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        M3.c g2 = serverResponse.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        M3.b f = serverResponse.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        M3.c g3 = serverResponse.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(u.toString());
        JSONObject optJSONObject = jSONObject.optJSONObject("events");
        if (optJSONObject != null) {
            Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"events\")");
            jSONObject.remove("events");
            Map<String, String> b = IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        Map<String, String> b2 = IronSourceUtils.b(jSONObject);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public Fe(Me sharedPreferences, C4703w1 appEventsManager, F9 interstitialEventsManager, C4412fe rewardedVideoEventsManager, T9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        Intrinsics.checkNotNullParameter(interstitialEventsManager, "interstitialEventsManager");
        Intrinsics.checkNotNullParameter(rewardedVideoEventsManager, "rewardedVideoEventsManager");
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f7631a = sharedPreferences;
        this.b = appEventsManager;
        this.c = interstitialEventsManager;
        this.d = rewardedVideoEventsManager;
        this.e = globalDataWriter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Fe(Me me, C4703w1 c4703w1, F9 f9, C4412fe c4412fe, T9 t9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(me, r10, r1, c4412fe, (i & 16) != 0 ? new T9() : t9);
        me = (i & 1) != 0 ? new Le() : me;
        C4703w1 q = (i & 2) != 0 ? Ib.v.d().q() : c4703w1;
        if ((i & 4) != 0) {
            f9 = F9.i();
            Intrinsics.checkNotNullExpressionValue(f9, "getInstance()");
        }
        F9 f92 = f9;
        if ((i & 8) != 0) {
            c4412fe = C4412fe.i();
            Intrinsics.checkNotNullExpressionValue(c4412fe, "getInstance()");
        }
    }
}
