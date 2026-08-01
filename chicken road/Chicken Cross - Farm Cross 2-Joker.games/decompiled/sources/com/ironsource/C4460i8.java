package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.E8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4460i8 implements E8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "i8";
    private static final String i = "file://";

    /* renamed from: a, reason: collision with root package name */
    private final String f8244a;
    private String b;
    private WebView c;
    private C4424g8 d;
    private C4334b8 e;
    private Context f;

    /* renamed from: com.ironsource.i8$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8245a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f8245a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4460i8.this.c != null) {
                C4656t8.a(C4430ge.q, new C4567o8().a(C4761z5.A, C4460i8.g).a());
            }
            try {
                C4460i8.this.b(this.f8245a);
                C4460i8.this.c.loadUrl(C4460i8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4460i8.this.f8244a);
                C4460i8.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                C4491k4.d().a(e);
                C4460i8.this.b(this.f8245a, e.getMessage());
                C4656t8.a(C4430ge.q, new C4567o8().a(C4761z5.A, e.getMessage()).a());
            }
        }
    }

    /* renamed from: com.ironsource.i8$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8246a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.f8246a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4460i8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4460i8.this.f8244a);
                C4424g8 c4424g8 = C4460i8.this.d;
                if (c4424g8 != null) {
                    c4424g8.a(this.f8246a, jSONObject);
                    C4460i8.this.d.b();
                }
                C4460i8 c4460i8 = C4460i8.this;
                c4460i8.d = null;
                c4460i8.f = null;
            } catch (Exception e) {
                C4491k4.d().a(e);
                Log.e(C4460i8.h, "performCleanup | could not destroy ISNAdView webView ID: " + C4460i8.this.f8244a);
                C4656t8.a(C4430ge.r, new C4567o8().a(C4761z5.A, e.getMessage()).a());
                C4460i8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.i8$c */
    class c implements E8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8247a;

        c(String str) {
            this.f8247a = str;
        }

        @Override // com.ironsource.E8.a
        public void a(String str) {
            Logger.i(C4460i8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4460i8.this.b(this.f8247a, str);
        }

        @Override // com.ironsource.E8.a
        public void b(String str) {
            Logger.i(C4460i8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4460i8.this.c.getParent()).removeView(C4460i8.this.c);
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4460i8.this.d();
        }
    }

    /* renamed from: com.ironsource.i8$d */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4460i8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* renamed from: com.ironsource.i8$e */
    private class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4460i8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent a2 = new OpenUrlActivity.e(new k.c()).a(str).b(false).a(context);
            a2.addFlags(268435456);
            context.startActivity(a2);
            return true;
        }
    }

    public C4460i8(InterfaceC4388e8 interfaceC4388e8, Context context, String str, C4334b8 c4334b8) {
        this.f = context;
        C4424g8 c4424g8 = new C4424g8();
        this.d = c4424g8;
        c4424g8.g(str);
        this.f8244a = str;
        this.d.a(interfaceC4388e8);
        this.e = c4334b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f8244a;
    }

    public C4424g8 b() {
        return this.d;
    }

    public C4334b8 c() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.ironsource.E8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf("/") + 1);
        return substring.substring(substring.indexOf("/"));
    }

    @Override // com.ironsource.E8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.E8
    public void b(JSONObject jSONObject, String str, String str2) {
        O7.f7826a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.E8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new C4406f8(this), C4352c8.e);
        this.c.setWebViewClient(new C4442h8(new c(str)));
        this.c.setWebChromeClient(new d());
        eh.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.E8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        O7.f7826a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.E8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, U3.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(U3.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(U3.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, U3.c.C);
            }
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            b(str3, U3.c.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return c(str) ? i + this.b + d(str) : str;
    }

    public void b(String str, String str2) {
        C4424g8 c4424g8 = this.d;
        if (c4424g8 != null) {
            c4424g8.a(str, str2);
        }
    }
}
