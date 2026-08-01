package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4448he;
import com.ironsource.C4477j8;
import com.ironsource.C4491k4;
import com.ironsource.Gg;
import com.ironsource.InterfaceC4388e8;
import com.ironsource.InterfaceC4533ma;
import com.ironsource.dh;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class a implements InterfaceC4388e8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";

    /* renamed from: a, reason: collision with root package name */
    private dh f8543a;
    private C4477j8 b = C4477j8.a();
    private Context c;

    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C1335a {

        /* renamed from: a, reason: collision with root package name */
        String f8544a;
        JSONObject b;
        String c;
        String d;

        private C1335a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    public void a(dh dhVar) {
        this.f8543a = dhVar;
    }

    @Override // com.ironsource.InterfaceC4388e8
    public void a(String str, JSONObject jSONObject) {
        if (this.f8543a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f8543a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4388e8
    public void a(String str, String str2, String str3) {
        a(str, Gg.a(str2, str3));
    }

    void a(String str, InterfaceC4533ma interfaceC4533ma) throws Exception {
        char c;
        C1335a a2 = a(str);
        C4448he c4448he = new C4448he();
        try {
            String str2 = a2.f8544a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(this, a2.b, this.c, a2.c, a2.d);
                return;
            }
            if (c == 1) {
                this.b.d(a2.b, a2.c, a2.d);
                return;
            }
            if (c == 2) {
                this.b.c(a2.b, a2.c, a2.d);
            } else if (c == 3) {
                this.b.a(a2.b, a2.c, a2.d);
            } else {
                if (c != 4) {
                    throw new IllegalArgumentException(String.format(n, a2.f8544a));
                }
                this.b.b(a2.b, a2.c, a2.d);
            }
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            c4448he.b("errMsg", e2.getMessage());
            String c2 = this.b.c(a2.b);
            if (!TextUtils.isEmpty(c2)) {
                c4448he.b("adViewId", c2);
            }
            interfaceC4533ma.a(false, a2.d, c4448he);
        }
    }

    private C1335a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C1335a c1335a = new C1335a();
        c1335a.f8544a = jSONObject.optString("functionName");
        c1335a.b = jSONObject.optJSONObject("functionParams");
        c1335a.c = jSONObject.optString("success");
        c1335a.d = jSONObject.optString("fail");
        return c1335a;
    }
}
