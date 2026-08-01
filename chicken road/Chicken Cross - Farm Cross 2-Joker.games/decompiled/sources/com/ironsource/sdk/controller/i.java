package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4448he;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4533ma;
import com.ironsource.InterfaceC4673u7;
import com.ironsource.U3;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";

    /* renamed from: a, reason: collision with root package name */
    private Context f8578a;
    private final InterfaceC4673u7 b = Ib.a0().a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f8579a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public i(Context context) {
        this.f8578a = context;
    }

    void a(String str, InterfaceC4533ma interfaceC4533ma) throws Exception {
        a a2 = a(str);
        if (d.equals(a2.f8579a)) {
            interfaceC4533ma.a(true, a2.c, a());
        } else {
            Logger.i(c, "unhandled API request " + str);
        }
    }

    private C4448he a() {
        C4448he c4448he = new C4448he();
        c4448he.b(SDKUtils.encodeString(U3.j.i0), SDKUtils.encodeString(String.valueOf(this.b.j())));
        c4448he.b(SDKUtils.encodeString(U3.j.j0), SDKUtils.encodeString(String.valueOf(this.b.r(this.f8578a))));
        c4448he.b(SDKUtils.encodeString(U3.j.k0), SDKUtils.encodeString(String.valueOf(this.b.D(this.f8578a))));
        c4448he.b(SDKUtils.encodeString(U3.j.l0), SDKUtils.encodeString(String.valueOf(this.b.E(this.f8578a))));
        c4448he.b(SDKUtils.encodeString(U3.j.m0), SDKUtils.encodeString(String.valueOf(this.b.f(this.f8578a))));
        c4448he.b(SDKUtils.encodeString(U3.j.n0), SDKUtils.encodeString(String.valueOf(this.b.i(this.f8578a))));
        return c4448he;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f8579a = jSONObject.optString(e);
        aVar.b = jSONObject.optJSONObject(f);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
