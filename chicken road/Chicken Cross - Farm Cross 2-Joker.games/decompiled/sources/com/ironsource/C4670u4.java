package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4670u4 {
    private static final String c = "u4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";

    /* renamed from: a, reason: collision with root package name */
    private final Context f8695a;
    C4652t4 b;

    /* renamed from: com.ironsource.u4$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f8696a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f8696a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C4670u4(Context context, C4652t4 c4652t4) {
        this.f8695a = context;
        this.b = c4652t4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC4533ma interfaceC4533ma) {
        C4448he c4448he = new C4448he();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC4634s4.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC4533ma.a(true, aVar.c, c4448he);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: Exception -> 0x0050, TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x0006, B:11:0x0031, B:14:0x0037, B:15:0x0049, B:16:0x004a, B:18:0x0018, B:21:0x0022), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, InterfaceC4533ma interfaceC4533ma) throws Exception {
        char c2;
        a a2 = a(str);
        try {
            String str2 = a2.f8696a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.f8695a, a2, interfaceC4533ma);
                        return;
                    } else {
                        if (c2 == 1) {
                            a(this.f8695a, a2, interfaceC4533ma);
                            return;
                        }
                        throw new UnsupportedOperationException("unsupported API: " + str);
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            } else {
                if (str2.equals(e)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            }
        } catch (Exception e2) {
            a(a2, interfaceC4533ma, e2);
        }
    }

    private void a(Context context, a aVar, InterfaceC4533ma interfaceC4533ma) {
        C4448he c4448he = new C4448he();
        JSONObject jSONObject = aVar.b;
        c4448he.b("data", this.b.a(context, EnumC4634s4.a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC4533ma.a(true, aVar.c, c4448he);
    }

    private void a(a aVar, InterfaceC4533ma interfaceC4533ma, Exception exc) {
        C4491k4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.f8696a + " exception " + message);
        C4448he c4448he = new C4448he();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c4448he.b("error", message);
        interfaceC4533ma.a(false, aVar.d, c4448he);
    }
}
