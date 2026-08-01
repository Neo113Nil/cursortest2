package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C4448he;
import com.ironsource.C4491k4;
import com.ironsource.InterfaceC4533ma;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";

    /* renamed from: a, reason: collision with root package name */
    private Context f8604a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f8605a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public q(Context context) {
        this.f8604a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f8605a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC4533ma interfaceC4533ma) {
        C4448he c4448he = new C4448he();
        try {
            String string = jSONObject.getString(f);
            c4448he.b(f, string);
            if (C1.d(this.f8604a, string)) {
                c4448he.b("status", String.valueOf(C1.c(this.f8604a, string)));
                interfaceC4533ma.a(true, aVar.c, c4448he);
            } else {
                c4448he.b("status", l);
                interfaceC4533ma.a(false, aVar.d, c4448he);
            }
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c4448he.b("errMsg", e2.getMessage());
            interfaceC4533ma.a(false, aVar.d, c4448he);
        }
    }

    void a(String str, InterfaceC4533ma interfaceC4533ma) throws Exception {
        a a2 = a(str);
        if (c.equals(a2.f8605a)) {
            a(a2.b, a2, interfaceC4533ma);
        } else if (d.equals(a2.f8605a)) {
            b(a2.b, a2, interfaceC4533ma);
        } else {
            Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4533ma interfaceC4533ma) {
        C4448he c4448he = new C4448he();
        try {
            c4448he.a("permissions", C1.a(this.f8604a, jSONObject.getJSONArray("permissions")));
            interfaceC4533ma.a(true, aVar.c, c4448he);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c4448he.b("errMsg", e2.getMessage());
            interfaceC4533ma.a(false, aVar.d, c4448he);
        }
    }
}
