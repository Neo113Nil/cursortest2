package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4477j8 implements InterfaceC4327b1 {
    private static final String b = "j8";
    private static C4477j8 c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, E8> f8265a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.j8$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4460i8 f8266a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(C4460i8 c4460i8, Context context, String str) {
            this.f8266a = c4460i8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4477j8.this.f8265a.put(this.c, new C4370d8(this.f8266a, this.b));
        }
    }

    public static synchronized C4477j8 a() {
        C4477j8 c4477j8;
        synchronized (C4477j8.class) {
            if (c == null) {
                c = new C4477j8();
            }
            c4477j8 = c;
        }
        return c4477j8;
    }

    private C4334b8 b(JSONObject jSONObject) {
        C4334b8 c4334b8 = new C4334b8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c4334b8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(U3.i.s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f8265a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        E8 e8 = this.f8265a.get(string);
        if (e8 != null) {
            e8.c(jSONObject, str, str2);
        }
    }

    private C4334b8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(U3.i.O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C4334b8(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C4491k4.d().a(e);
            return new C4334b8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f8265a.containsKey(string)) {
                E8 e8 = this.f8265a.get(string);
                String string2 = jSONObject.getString(U3.i.v0);
                if (e8 != null) {
                    e8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f8265a.containsKey(string)) {
                E8 e8 = this.f8265a.get(string);
                this.f8265a.remove(string);
                if (e8 != null) {
                    e8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC4388e8 interfaceC4388e8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C4334b8 b2 = b(jSONObject);
            if (!this.f8265a.containsKey(string)) {
                C4460i8 c4460i8 = new C4460i8(interfaceC4388e8, context, string, b2);
                c4460i8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c4460i8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    O7.f7826a.d(new a(c4460i8, context, string));
                    return;
                } else {
                    this.f8265a.put(string, c4460i8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC4327b1
    public E8 a(String str) {
        if (str.isEmpty() || !this.f8265a.containsKey(str)) {
            return null;
        }
        return this.f8265a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f8265a.containsKey(string)) {
                E8 e8 = this.f8265a.get(string);
                if (e8 != null) {
                    e8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
