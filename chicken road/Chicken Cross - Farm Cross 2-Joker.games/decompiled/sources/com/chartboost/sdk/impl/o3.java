package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.impl.g3;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4761z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o3 extends g3 {
    public final JSONObject u;
    public final JSONObject v;
    public final JSONObject w;
    public final JSONObject x;
    public final JSONObject y;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4923a;

        static {
            int[] iArr = new int[ni.values().length];
            try {
                iArr[ni.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ni.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4923a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(a3.c method, String host, String path, cg requestBodyFields, ue priority, String str, g3.a aVar, h7 eventTracker, sg session) {
        super(method, host, path, requestBodyFields, priority, str, aVar, eventTracker, session);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.u = new JSONObject();
        this.v = new JSONObject();
        this.w = new JSONObject();
        this.x = new JSONObject();
        this.y = new JSONObject();
    }

    public final void a(we weVar) {
        String h = weVar.h();
        if (h != null) {
            x2.a(this.w, U3.j.b0, h);
        }
        x2.a(this.w, "pidatauseconsent", weVar.f());
        JSONObject g = weVar.g();
        if (g != null) {
            try {
                g.put("gpp", weVar.b());
                g.put("gpp_sid", weVar.a());
            } catch (JSONException e) {
                mb.b("Failed to add GPP and/or GPP SID to request body", e);
            }
            x2.a(this.w, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, g);
        }
    }

    public final void b(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        x2.a(this.x, key, obj);
        a("ad", this.x);
    }

    public final void c(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        x2.a(this.u, key, obj);
        a("sdk", this.u);
    }

    @Override // com.chartboost.sdk.impl.g3
    public void f() {
        m();
        n();
        o();
        q();
        l();
    }

    public final void l() {
        JSONObject jSONObject = this.x;
        cg j = j();
        x2.a(jSONObject, "session", j != null ? Integer.valueOf(j.i()) : null);
        if (this.x.isNull("cache")) {
            x2.a(this.x, "cache", Boolean.FALSE);
        }
        if (this.x.isNull("amount")) {
            x2.a(this.x, "amount", 0);
        }
        if (this.x.isNull("retry_count")) {
            x2.a(this.x, "retry_count", 0);
        }
        if (this.x.isNull(FirebaseAnalytics.Param.LOCATION)) {
            x2.a(this.x, FirebaseAnalytics.Param.LOCATION, "");
        }
        a("ad", this.x);
    }

    public final void m() {
        JSONObject jSONObject = this.v;
        cg j = j();
        x2.a(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, j != null ? j.h : null);
        JSONObject jSONObject2 = this.v;
        cg j2 = j();
        x2.a(jSONObject2, "bundle", j2 != null ? j2.e : null);
        JSONObject jSONObject3 = this.v;
        cg j3 = j();
        x2.a(jSONObject3, "bundle_id", j3 != null ? j3.f : null);
        x2.a(this.v, SDKAnalyticsEvents.PARAMETER_SESSION_ID, "");
        x2.a(this.v, "ui", -1);
        x2.a(this.v, "test_mode", Boolean.FALSE);
        a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.v);
    }

    public final void n() {
        x2.a(this.y, MBridgeConstans.DYNAMIC_VIEW_WX_APP, x2.a(x2.a("ver", e7.f4748a.c())));
        a("bidrequest", this.y);
    }

    public final void o() {
        g6 b;
        g6 b2;
        g6 b3;
        g6 b4;
        g6 b5;
        kf g;
        rd d;
        g6 b6;
        g6 b7;
        kf g2;
        qh j;
        cg j2 = j();
        JSONObject jSONObject = j2 != null ? j2.m : null;
        x2.a(this.w, L6.R0, x2.a(x2.a("carrier_name", jSONObject != null ? jSONObject.optString("carrier-name") : null), x2.a("mobile_country_code", jSONObject != null ? jSONObject.optString("mobile-country-code") : null), x2.a("mobile_network_code", jSONObject != null ? jSONObject.optString("mobile-network-code") : null), x2.a("iso_country_code", jSONObject != null ? jSONObject.optString("iso-country-code") : null), x2.a("phone_type", jSONObject != null ? Integer.valueOf(jSONObject.optInt("phone-type")) : null)));
        JSONObject jSONObject2 = this.w;
        cg j3 = j();
        x2.a(jSONObject2, "model", j3 != null ? j3.f4714a : null);
        JSONObject jSONObject3 = this.w;
        cg j4 = j();
        x2.a(jSONObject3, L6.t, j4 != null ? j4.k : null);
        JSONObject jSONObject4 = this.w;
        cg j5 = j();
        x2.a(jSONObject4, "device_type", j5 != null ? j5.j : null);
        JSONObject jSONObject5 = this.w;
        cg j6 = j();
        x2.a(jSONObject5, "actual_device_type", j6 != null ? j6.l : null);
        JSONObject jSONObject6 = this.w;
        cg j7 = j();
        x2.a(jSONObject6, L6.F, j7 != null ? j7.b : null);
        JSONObject jSONObject7 = this.w;
        cg j8 = j();
        x2.a(jSONObject7, "country", j8 != null ? j8.c : null);
        JSONObject jSONObject8 = this.w;
        cg j9 = j();
        x2.a(jSONObject8, "language", j9 != null ? j9.d : null);
        cg j10 = j();
        x2.a(this.w, "timestamp", (j10 == null || (j = j10.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j.a())));
        JSONObject jSONObject9 = this.w;
        cg j11 = j();
        x2.a(jSONObject9, "reachability", (j11 == null || (g2 = j11.g()) == null) ? null : g2.b());
        JSONObject jSONObject10 = this.w;
        cg j12 = j();
        x2.a(jSONObject10, "is_portrait", (j12 == null || (b7 = j12.b()) == null) ? null : Boolean.valueOf(b7.k()));
        JSONObject jSONObject11 = this.w;
        cg j13 = j();
        x2.a(jSONObject11, "scale", (j13 == null || (b6 = j13.b()) == null) ? null : Float.valueOf(b6.h()));
        JSONObject jSONObject12 = this.w;
        cg j14 = j();
        x2.a(jSONObject12, "timezone", j14 != null ? j14.o : null);
        JSONObject jSONObject13 = this.w;
        cg j15 = j();
        x2.a(jSONObject13, C4761z5.e, (j15 == null || (g = j15.g()) == null || (d = g.d()) == null) ? null : Integer.valueOf(d.c()));
        JSONObject jSONObject14 = this.w;
        cg j16 = j();
        x2.a(jSONObject14, "dw", (j16 == null || (b5 = j16.b()) == null) ? null : Integer.valueOf(b5.c()));
        JSONObject jSONObject15 = this.w;
        cg j17 = j();
        x2.a(jSONObject15, "dh", (j17 == null || (b4 = j17.b()) == null) ? null : Integer.valueOf(b4.a()));
        JSONObject jSONObject16 = this.w;
        cg j18 = j();
        x2.a(jSONObject16, "dpi", (j18 == null || (b3 = j18.b()) == null) ? null : b3.d());
        JSONObject jSONObject17 = this.w;
        cg j19 = j();
        x2.a(jSONObject17, "w", (j19 == null || (b2 = j19.b()) == null) ? null : Integer.valueOf(b2.j()));
        JSONObject jSONObject18 = this.w;
        cg j20 = j();
        x2.a(jSONObject18, "h", (j20 == null || (b = j20.b()) == null) ? null : Integer.valueOf(b.e()));
        x2.a(this.w, "user_agent", aj.b.a());
        x2.a(this.w, "device_family", "");
        x2.a(this.w, "retina", Boolean.FALSE);
        p();
        cg j21 = j();
        we weVar = j21 != null ? j21.r : null;
        if (weVar != null) {
            a(weVar);
        }
        a("device", this.w);
    }

    public final void p() {
        cg j = j();
        i9 c = j != null ? j.c() : null;
        if (c == null) {
            mb.b("Missing identity in the CB SDK. This will affect ads performance.", null);
            return;
        }
        x2.a(this.w, "identity", c.b());
        int i = a.f4923a[c.f().ordinal()];
        if (i == 1) {
            x2.a(this.w, "limit_ad_tracking", Boolean.TRUE);
        } else if (i == 2) {
            x2.a(this.w, "limit_ad_tracking", Boolean.FALSE);
        }
        Integer e = c.e();
        if (e != null) {
            x2.a(this.w, "appsetidscope", Integer.valueOf(e.intValue()));
        }
    }

    public final void q() {
        f5 a2;
        dc d;
        JSONObject jSONObject = this.u;
        cg j = j();
        String str = null;
        x2.a(jSONObject, "sdk", j != null ? j.g : null);
        cg j2 = j();
        if (j2 != null && (d = j2.d()) != null) {
            x2.a(this.u, "mediation", d.c());
            x2.a(this.u, "mediation_version", d.b());
            x2.a(this.u, "adapter_version", d.a());
        }
        x2.a(this.u, "commit_hash", "9f2614187dcec3c79c306d1d893a2402f08eb0be");
        cg j3 = j();
        if (j3 != null && (a2 = j3.a()) != null) {
            str = a2.a();
        }
        if (!l1.b().a(str)) {
            x2.a(this.u, "config_variant", str);
        }
        a("sdk", this.u);
    }
}
