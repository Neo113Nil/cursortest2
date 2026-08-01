package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.ironsource.C4761z5;
import com.ironsource.Fb;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ge {
    public static Integer j;
    public static final String k = Build.VERSION.RELEASE;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f4779a;
    public final JSONObject b;
    public final JSONArray c;
    public final JSONObject d;
    public final JSONObject e;
    public final JSONObject f;
    public final cg g;
    public final b0 h;
    public final ae i;

    public ge(cg cgVar, b0 b0Var, ae aeVar) {
        j = cgVar.e();
        this.g = cgVar;
        this.h = b0Var;
        this.i = aeVar;
        this.b = new JSONObject();
        this.c = new JSONArray();
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.f4779a = new JSONObject();
        q();
        n();
        o();
        m();
        p();
        r();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        x2.a(jSONObject, L6.s, obj);
        x2.a(jSONObject, "lon", obj);
        x2.a(jSONObject, "country", this.g.c);
        x2.a(jSONObject, "type", 2);
        return jSONObject;
    }

    public final Integer b() {
        cg cgVar = this.g;
        if (cgVar != null) {
            return cgVar.f().d();
        }
        return null;
    }

    public final int c() {
        cg cgVar = this.g;
        if (cgVar == null || cgVar.f().c() == null) {
            return 0;
        }
        return this.g.f().c().intValue();
    }

    public final Collection d() {
        cg cgVar = this.g;
        return cgVar != null ? cgVar.f().i() : new ArrayList();
    }

    public final int e() {
        cg cgVar = this.g;
        if (cgVar == null || cgVar.f().e() == null) {
            return 0;
        }
        return this.g.f().e().intValue();
    }

    public final String f() {
        cg cgVar = this.g;
        if (cgVar != null) {
            return cgVar.f().a();
        }
        return null;
    }

    public final String g() {
        cg cgVar = this.g;
        if (cgVar != null) {
            return cgVar.f().b();
        }
        return null;
    }

    public JSONObject h() {
        return this.f4779a;
    }

    public final int i() {
        return this.g.g().d().c();
    }

    public final String j() {
        if (this.h.a() == c0.b.g) {
            mb.b("INTERSTITIAL NOT COMPATIBLE WITH OPENRTB", null);
        } else if (this.h.a() == c0.c.g) {
            mb.b("REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB", null);
        }
        return this.h.a().b().toLowerCase(Locale.ROOT);
    }

    public final String k() {
        cg cgVar = this.g;
        if (cgVar != null) {
            return cgVar.f().h();
        }
        return null;
    }

    public final Integer l() {
        return Integer.valueOf(this.h.a().e() ? 1 : 0);
    }

    public final void m() {
        x2.a(this.d, "id", this.g.h);
        JSONObject jSONObject = this.d;
        Object obj = JSONObject.NULL;
        x2.a(jSONObject, "name", obj);
        x2.a(this.d, "bundle", this.g.f);
        x2.a(this.d, "storeurl", obj);
        JSONObject jSONObject2 = new JSONObject();
        x2.a(jSONObject2, "id", obj);
        x2.a(jSONObject2, "name", obj);
        x2.a(this.d, Fb.b, jSONObject2);
        x2.a(this.d, "cat", obj);
        x2.a(this.f4779a, MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.d);
    }

    public final void n() {
        i9 c = this.g.c();
        x2.a(this.b, "devicetype", j);
        x2.a(this.b, "w", Integer.valueOf(this.g.b().c()));
        x2.a(this.b, "h", Integer.valueOf(this.g.b().a()));
        x2.a(this.b, "ifa", c.a());
        x2.a(this.b, "osv", k);
        x2.a(this.b, "lmt", Integer.valueOf(c.f().b()));
        x2.a(this.b, C4761z5.e, Integer.valueOf(i()));
        x2.a(this.b, L6.F, U3.d);
        x2.a(this.b, "geo", a());
        x2.a(this.b, "ip", JSONObject.NULL);
        x2.a(this.b, "language", this.g.d);
        x2.a(this.b, L6.d0, aj.b.a());
        x2.a(this.b, L6.t, this.g.k);
        x2.a(this.b, "model", this.g.f4714a);
        x2.a(this.b, L6.R0, this.g.n);
        x2.a(this.b, "ext", a(c, this.i, this.g.d()));
        x2.a(this.f4779a, "device", this.b);
    }

    public final void o() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        x2.a(jSONObject, "id", obj);
        JSONObject jSONObject2 = new JSONObject();
        x2.a(jSONObject2, "w", this.h.e());
        x2.a(jSONObject2, "h", this.h.b());
        x2.a(jSONObject2, "btype", obj);
        x2.a(jSONObject2, "battr", obj);
        x2.a(jSONObject2, "pos", obj);
        x2.a(jSONObject2, "topframe", obj);
        x2.a(jSONObject2, "api", obj);
        JSONObject jSONObject3 = new JSONObject();
        x2.a(jSONObject3, "placementtype", j());
        x2.a(jSONObject3, "playableonly", obj);
        x2.a(jSONObject3, "allowscustomclosebutton", obj);
        x2.a(jSONObject2, "ext", jSONObject3);
        x2.a(jSONObject, "banner", jSONObject2);
        x2.a(jSONObject, "instl", l());
        x2.a(jSONObject, "tagid", this.h.d());
        x2.a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        x2.a(jSONObject, "displaymanagerver", this.g.g);
        x2.a(jSONObject, "bidfloor", obj);
        x2.a(jSONObject, "bidfloorcur", "USD");
        x2.a(jSONObject, "secure", 1);
        this.c.put(jSONObject);
        x2.a(this.f4779a, "imp", this.c);
    }

    public final void p() {
        Integer b = b();
        if (b != null) {
            x2.a(this.e, COPPA.COPPA_STANDARD, b);
        }
        JSONObject jSONObject = new JSONObject();
        x2.a(jSONObject, "gdpr", Integer.valueOf(e()));
        x2.a(jSONObject, "gpp", g());
        x2.a(jSONObject, "gpp_sid", f());
        for (DataUseConsent dataUseConsent : d()) {
            if (!dataUseConsent.getPrivacyStandardName().equals(COPPA.COPPA_STANDARD)) {
                x2.a(jSONObject, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent());
            }
        }
        x2.a(this.e, "ext", jSONObject);
        x2.a(this.f4779a, "regs", this.e);
    }

    public final void q() {
        JSONObject jSONObject = this.f4779a;
        Object obj = JSONObject.NULL;
        x2.a(jSONObject, "id", obj);
        x2.a(this.f4779a, "test", obj);
        x2.a(this.f4779a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        x2.a(this.f4779a, "at", 2);
    }

    public final void r() {
        x2.a(this.f, "id", JSONObject.NULL);
        x2.a(this.f, "geo", a());
        String k2 = k();
        if (k2 != null) {
            x2.a(this.f, U3.j.b0, k2);
        }
        JSONObject jSONObject = new JSONObject();
        x2.a(jSONObject, U3.j.b0, Integer.valueOf(c()));
        x2.a(jSONObject, "impdepth", Integer.valueOf(this.h.c()));
        x2.a(this.f, "ext", jSONObject);
        x2.a(this.f4779a, "user", this.f);
    }

    public final JSONObject a(i9 i9Var, ae aeVar, dc dcVar) {
        JSONObject jSONObject = new JSONObject();
        if (i9Var.d() != null) {
            x2.a(jSONObject, "appsetid", i9Var.d());
        }
        if (i9Var.e() != null) {
            x2.a(jSONObject, "appsetidscope", i9Var.e());
        }
        Partner c = aeVar.c();
        if (aeVar.g() && c != null) {
            x2.a(jSONObject, "omidpn", c.getName());
            x2.a(jSONObject, "omidpv", c.getVersion());
        }
        if (dcVar != null) {
            x2.a(jSONObject, "medtype", dcVar.d());
            x2.a(jSONObject, "medversion", dcVar.b());
            x2.a(jSONObject, "medadpt", dcVar.a());
        }
        return jSONObject;
    }
}
