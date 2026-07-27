package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4424g8 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4388e8 f8205a;
    private WebView c;
    private String d;
    private String e = "g8";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {C4352c8.h, C4352c8.i, C4352c8.g, "handleGetViewVisibility", C4352c8.j};
    private Cg b = new Cg();

    /* renamed from: com.ironsource.g8$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8206a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ JSONObject d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f8206a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C4424g8.this.b(this.f8206a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f8206a;
                    Log.e(C4424g8.this.e, str);
                    C4424g8.this.a(this.b, str);
                } else if (this.f8206a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C4424g8.this.e(this.c);
                } else if (this.f8206a.equalsIgnoreCase(C4352c8.j) || this.f8206a.equalsIgnoreCase(C4352c8.i)) {
                    C4424g8.this.a(this.d.getString("params"), this.c, this.b);
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f8206a;
                Log.e(C4424g8.this.e, str2);
                C4424g8.this.a(this.b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.g8$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8207a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.f8207a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4424g8.this.c.evaluateJavascript(this.f8207a, null);
            } catch (Throwable th) {
                C4491k4.d().a(th);
                Log.e(C4424g8.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f8205a == null || this.b == null) {
            return;
        }
        a(C4352c8.f8111a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void b() {
        this.f8205a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void e() {
        if (this.f8205a == null || this.b == null) {
            return;
        }
        a(C4352c8.b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    public void a(InterfaceC4388e8 interfaceC4388e8) {
        this.f8205a = interfaceC4388e8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(C4352c8.v, C4352c8.c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C4491k4.d().a(e);
            Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC4388e8 interfaceC4388e8 = this.f8205a;
        if (interfaceC4388e8 != null) {
            interfaceC4388e8.a(str, jSONObject);
        }
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C4352c8.k);
    }

    public void a(String str, String str2) {
        InterfaceC4388e8 interfaceC4388e8 = this.f8205a;
        if (interfaceC4388e8 != null) {
            interfaceC4388e8.a(str, str2, this.d);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f8205a == null) {
            C4656t8.a(C4430ge.t, new C4567o8().a(C4761z5.y, "mDelegate is null").a());
        } else {
            O7.f7826a.d(new a(str, str3, str2, jSONObject));
        }
    }

    private void d(String str) {
        O7.f7826a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C4352c8.s, this.b.a());
            jSONObject.put(C4352c8.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.e, str4);
            this.f8205a.a(str3, str4, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C4352c8.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (Exception e) {
            C4491k4.d().a(e);
            Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject2;
    }
}
