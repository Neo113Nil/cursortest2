package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4448he;
import com.ironsource.C4491k4;
import com.ironsource.C4521lg;
import com.ironsource.C4553nc;
import com.ironsource.InterfaceC4533ma;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;

    /* renamed from: a, reason: collision with root package name */
    private C4553nc f8610a = new C4553nc();
    private C4521lg c = new C4521lg();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f8611a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public u(Context context) {
        this.b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f8611a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }

    void a(String str, InterfaceC4533ma interfaceC4533ma) throws Exception {
        a a2 = a(str);
        if (e.equals(a2.f8611a)) {
            a(a2.b, a2, interfaceC4533ma);
        } else if (f.equals(a2.f8611a)) {
            a(a2, interfaceC4533ma);
        } else {
            Logger.i(d, "unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4533ma interfaceC4533ma) {
        C4448he c4448he = new C4448he();
        try {
            this.f8610a.a(jSONObject);
            interfaceC4533ma.a(true, aVar.c, c4448he);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC4533ma.a(false, aVar.d, c4448he);
        }
    }

    private void a(a aVar, InterfaceC4533ma interfaceC4533ma) {
        try {
            JSONObject a2 = this.c.a();
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = a2.get(next);
                if (obj instanceof String) {
                    a2.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC4533ma.a(true, aVar.c, a2);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            interfaceC4533ma.a(false, aVar.d, e2.getMessage());
        }
    }
}
