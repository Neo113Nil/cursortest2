package com.chartboost.sdk.impl;

import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.impl.c3;
import com.chartboost.sdk.impl.x2;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.chartboost.sdk.tracking.g;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class g3 extends a3 {
    public static final b t = new b(null);
    public final String k;
    public final cg l;
    public final String m;
    public final a n;
    public final h7 o;
    public final sg p;
    public JSONObject q;
    public JSONArray r;
    public boolean s;

    public interface a {
        void a(g3 g3Var, CBError cBError);

        void a(g3 g3Var, JSONObject jSONObject);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(a3.c method, String endpoint, String path, cg cgVar, ue priority, String str, a aVar, h7 eventTracker, sg sgVar) {
        super(method, NetworkHelper.f5122a.a(endpoint, path), priority, null);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.k = path;
        this.l = cgVar;
        this.m = str;
        this.n = aVar;
        this.o = eventTracker;
        this.p = sgVar;
        this.q = new JSONObject();
    }

    public final JSONObject b(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e) {
            mb.b("Error creating JSON", e);
            return jSONObject;
        }
    }

    public void f() {
        f5 a2;
        g6 b2;
        g6 b3;
        g6 b4;
        g6 b5;
        g6 b6;
        kf g;
        rd d;
        g6 b7;
        g6 b8;
        kf g2;
        qh j;
        cg cgVar = this.l;
        a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, cgVar != null ? cgVar.h : null);
        cg cgVar2 = this.l;
        a("model", cgVar2 != null ? cgVar2.f4714a : null);
        cg cgVar3 = this.l;
        a(L6.t, cgVar3 != null ? cgVar3.k : null);
        cg cgVar4 = this.l;
        a("device_type", cgVar4 != null ? cgVar4.j : null);
        cg cgVar5 = this.l;
        a("actual_device_type", cgVar5 != null ? cgVar5.l : null);
        cg cgVar6 = this.l;
        a(L6.F, cgVar6 != null ? cgVar6.b : null);
        cg cgVar7 = this.l;
        a("country", cgVar7 != null ? cgVar7.c : null);
        cg cgVar8 = this.l;
        a("language", cgVar8 != null ? cgVar8.d : null);
        cg cgVar9 = this.l;
        a("sdk", cgVar9 != null ? cgVar9.g : null);
        a("user_agent", aj.b.a());
        cg cgVar10 = this.l;
        a("timestamp", (cgVar10 == null || (j = cgVar10.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j.a())));
        cg cgVar11 = this.l;
        a("session", cgVar11 != null ? Integer.valueOf(cgVar11.i()) : null);
        cg cgVar12 = this.l;
        a("reachability", (cgVar12 == null || (g2 = cgVar12.g()) == null) ? null : g2.b());
        cg cgVar13 = this.l;
        a("is_portrait", (cgVar13 == null || (b8 = cgVar13.b()) == null) ? null : Boolean.valueOf(b8.k()));
        cg cgVar14 = this.l;
        a("scale", (cgVar14 == null || (b7 = cgVar14.b()) == null) ? null : Float.valueOf(b7.h()));
        cg cgVar15 = this.l;
        a("bundle", cgVar15 != null ? cgVar15.e : null);
        cg cgVar16 = this.l;
        a("bundle_id", cgVar16 != null ? cgVar16.f : null);
        cg cgVar17 = this.l;
        a(L6.R0, cgVar17 != null ? cgVar17.m : null);
        cg cgVar18 = this.l;
        dc d2 = cgVar18 != null ? cgVar18.d() : null;
        if (d2 != null) {
            a("mediation", d2.c());
            a("mediation_version", d2.b());
            a("adapter_version", d2.a());
            a("sdk.mediation", d2.d());
            a("sdk.mediation_version", d2.b());
            a("sdk.adapter_version", d2.a());
        }
        cg cgVar19 = this.l;
        a("timezone", cgVar19 != null ? cgVar19.o : null);
        cg cgVar20 = this.l;
        a(C4761z5.e, (cgVar20 == null || (g = cgVar20.g()) == null || (d = g.d()) == null) ? null : Integer.valueOf(d.c()));
        cg cgVar21 = this.l;
        a("dw", (cgVar21 == null || (b6 = cgVar21.b()) == null) ? null : Integer.valueOf(b6.c()));
        cg cgVar22 = this.l;
        a("dh", (cgVar22 == null || (b5 = cgVar22.b()) == null) ? null : Integer.valueOf(b5.a()));
        cg cgVar23 = this.l;
        a("dpi", (cgVar23 == null || (b4 = cgVar23.b()) == null) ? null : b4.d());
        cg cgVar24 = this.l;
        a("w", (cgVar24 == null || (b3 = cgVar24.b()) == null) ? null : Integer.valueOf(b3.j()));
        cg cgVar25 = this.l;
        a("h", (cgVar25 == null || (b2 = cgVar25.b()) == null) ? null : Integer.valueOf(b2.e()));
        a("commit_hash", "9f2614187dcec3c79c306d1d893a2402f08eb0be");
        cg cgVar26 = this.l;
        i9 c = cgVar26 != null ? cgVar26.c() : null;
        a("identity", c != null ? c.b() : null);
        a("instance_id", c != null ? c.c() : null);
        ni f = c != null ? c.f() : null;
        if (f != ni.c) {
            a("limit_ad_tracking", Boolean.valueOf(f == ni.e));
        }
        a("appsetidscope", c != null ? c.e() : null);
        cg cgVar27 = this.l;
        we f2 = cgVar27 != null ? cgVar27.f() : null;
        Object h = f2 != null ? f2.h() : null;
        if (h != null) {
            a(U3.j.b0, h);
        }
        a("pidatauseconsent", f2 != null ? f2.f() : null);
        cg cgVar28 = this.l;
        String a3 = (cgVar28 == null || (a2 = cgVar28.a()) == null) ? null : a2.a();
        if (!l1.b().a(a3)) {
            a("config_variant", a3);
        }
        JSONObject g3 = f2 != null ? f2.g() : null;
        String b9 = f2 != null ? f2.b() : null;
        String a4 = f2 != null ? f2.a() : null;
        if (g3 != null) {
            try {
                g3.put("gpp", b9);
                g3.put("gpp_sid", a4);
            } catch (JSONException e) {
                mb.b("Failed to add GPP and/or GPP SID to request body", e);
            }
        }
        a(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, g3);
    }

    public final String g() {
        a4 a4Var = a4.f4672a;
        String a2 = a4Var.a();
        int[] b2 = a4Var.b();
        JSONObject jSONObject = new JSONObject();
        if (a2.length() > 0 && b2 != null && b2.length != 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i : b2) {
                    jSONArray.put(i);
                }
                jSONObject.put("exchangeMode", 2);
                jSONObject.put("bidFloor", 0.01d);
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, a2);
                jSONObject.put("forceCreativeTypes", jSONArray);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject.toString();
    }

    public final JSONArray h() {
        return this.r;
    }

    public final String i() {
        if (StringsKt.startsWith$default(this.k, "/", false, 2, (Object) null)) {
            return this.k;
        }
        return "/" + this.k;
    }

    public final cg j() {
        return this.l;
    }

    public final String k() {
        return i();
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.q = jSONObject;
    }

    public final void a(JSONArray jSONArray) {
        this.r = jSONArray;
    }

    public final void a(String str, Object obj) {
        x2.a(this.q, str, obj);
    }

    public final void a(d3 d3Var, CBError cBError) {
        String str;
        String errorDesc;
        CBError.Type type;
        x2.a a2 = x2.a(C4761z5.r, i());
        String str2 = "None";
        x2.a a3 = x2.a("statuscode", d3Var == null ? "None" : Integer.valueOf(d3Var.b()));
        if (cBError == null || (type = cBError.getType()) == null || (str = type.toString()) == null) {
            str = "None";
        }
        x2.a a4 = x2.a("error", str);
        if (cBError != null && (errorDesc = cBError.getErrorDesc()) != null) {
            str2 = errorDesc;
        }
        JSONObject a5 = x2.a(a2, a3, a4, x2.a("errorDescription", str2), x2.a("retryCount", (Object) 0));
        Intrinsics.checkNotNullExpressionValue(a5, "jsonObject(...)");
        mb.a("sendToSessionLogs: " + a5, null);
    }

    public final void b(String str) {
        this.o.mo4759track(com.chartboost.sdk.tracking.a.m.a(g.h.d, str));
    }

    public /* synthetic */ g3(String str, String str2, cg cgVar, ue ueVar, a aVar, h7 h7Var, sg sgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cgVar, ueVar, aVar, h7Var, (i & 64) != 0 ? null : sgVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g3(String endpoint, String path, cg cgVar, ue priority, a aVar, h7 eventTracker, sg sgVar) {
        this(a3.c.c, endpoint, path, cgVar, priority, (String) null, aVar, eventTracker, sgVar);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    @Override // com.chartboost.sdk.impl.a3
    public b3 a() {
        String str;
        String g;
        i9 c;
        String d;
        String d2;
        f();
        String jSONObject = this.q.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        cg cgVar = this.l;
        if (cgVar == null || (str = cgVar.h) == null) {
            str = "";
        }
        String str2 = cgVar != null ? cgVar.i : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%s %s\n%s\n%s", Arrays.copyOf(new Object[]{c(), k(), str2, jSONObject}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String a2 = q2.a(format);
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT, C4761z5.M);
        hashMap.put("X-Chartboost-Client", l3.b());
        hashMap.put("X-Chartboost-API", "9.13.0");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", a2);
        sg sgVar = this.p;
        if (sgVar != null && (d2 = sgVar.d()) != null) {
            hashMap.put("x-monetization-session-id", d2);
        }
        cg cgVar2 = this.l;
        if (cgVar2 != null && (c = cgVar2.c()) != null && (d = c.d()) != null) {
            hashMap.put("x-monetization-idfv", d);
        }
        hashMap.put("x-monetization-sdk-version", "9.13.0");
        if (jg.f4829a.d()) {
            String b2 = jg.b();
            String str3 = b2.length() > 0 ? b2 : null;
            if (str3 != null) {
                hashMap.put("X-Chartboost-Test", str3);
            }
            String a3 = jg.a();
            if (a3 != null) {
                hashMap.put("X-Chartboost-Test", a3);
            }
        }
        if (ChartboostDSP.INSTANCE.isDSP() && (g = g()) != null && g.length() != 0) {
            hashMap.put("X-Chartboost-DspDemoApp", g);
        }
        byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new b3(hashMap, bytes, C4761z5.M);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g3(String endpoint, String path, cg cgVar, ue priority, String eventType, a aVar, h7 eventTracker, sg sgVar) {
        this(a3.c.c, endpoint, path, cgVar, priority, eventType, aVar, eventTracker, sgVar);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    @Override // com.chartboost.sdk.impl.a3
    public c3 a(d3 d3Var) {
        byte[] bArr;
        try {
            if (d3Var == null || (bArr = d3Var.a()) == null) {
                bArr = new byte[0];
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, Charsets.UTF_8));
            mb.d("Request " + i() + " succeeded. Response code: " + (d3Var != null ? Integer.valueOf(d3Var.b()) : null) + ", body: " + jSONObject.toString(4), null);
            if (this.s) {
                int optInt = jSONObject.optInt("status");
                String optString = jSONObject.optString("message");
                if (optInt == 404) {
                    Intrinsics.checkNotNull(optString);
                    return a(optString);
                }
                if (optInt < 200 || optInt > 299) {
                    mb.b("Request failed due to status code " + optInt + " in message", null);
                    Intrinsics.checkNotNull(optString);
                    return a(optInt, optString);
                }
            }
            return c3.c.a(jSONObject);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            b(message);
            mb.b("parseServerResponse", e);
            return a(e);
        }
    }

    public final c3 a(String str) {
        JSONObject b2 = b(404, str);
        c3.a aVar = c3.c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_FOUND;
        String jSONObject = b2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return aVar.a(new CBError(internal, jSONObject));
    }

    public final c3 a(int i, String str) {
        JSONObject b2 = b(i, str);
        c3.a aVar = c3.c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_OK;
        String jSONObject = b2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return aVar.a(new CBError(internal, jSONObject));
    }

    public final c3 a(Exception exc) {
        c3.a aVar = c3.c;
        CBError.Internal internal = CBError.Internal.MISCELLANEOUS;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return aVar.a(new CBError(internal, localizedMessage));
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(JSONObject jSONObject, d3 d3Var) {
        mb.d("Request success: " + e() + " status: " + (d3Var != null ? d3Var.b() : -1), null);
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(this, jSONObject);
        }
        a(d3Var, (CBError) null);
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(CBError cBError, d3 d3Var) {
        if (cBError == null) {
            return;
        }
        mb.d("Request failure: " + e() + " status: " + cBError.getErrorDesc(), null);
        a aVar = this.n;
        if (aVar != null) {
            aVar.a(this, cBError);
        }
        a(d3Var, cBError);
    }
}
