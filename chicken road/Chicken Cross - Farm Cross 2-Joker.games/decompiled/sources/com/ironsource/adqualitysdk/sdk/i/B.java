package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class B extends WebViewClient implements C, InterfaceC0947 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WebViewClient f98;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewClient f99;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f97 = StringFog.decrypt("TtM7w7HpxeF13zz7rMjXwXbEOOG3/g==\n", "GbZZldiMsqI=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f96 = StringFog.decrypt("IlEGKBanwtogUCUaBpDbzzJ3HhYBqMY=\n", "RTRyf2TGsqo=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f95 = StringFog.decrypt("IBVmAV0sY5kRGXcifBdvnikE\n", "R3ASVT97Bvs=\n");

    public B(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f99 = webViewClient;
        this.f98 = webViewClient2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        try {
            this.f98.doUpdateVisitedHistory(webView, str, z);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("rvFcUMJgbPzL7npd/Cl25o7tS02QJGrHm+dPS9UWbOGC90tb+Cl25oTxVw==\n", "64MuP7BABZI=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        try {
            this.f98.onFormResubmission(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("dtbNeOUBApATyet120gYilbK2mW3TgW4XNbSRfJSHpxezcxk/k4F\n", "M6S/F5cha/4=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f99;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        } catch (Error e) {
            AbstractC0480.m5464(f97, StringFog.decrypt("3PwKrQNanyq54RaEHgibFvz9DaAcE4U38OEW\n", "mY54wnF69kQ=\n"), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        try {
            this.f98.onLoadResource(webView, str);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("NA/UgUjB6YlREPKMdojzkxQTw5waju6rHhzCvF+S75IDHsM=\n", "cX2m7jrhgOc=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        try {
            this.f98.onPageCommitVisible(webView, str);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("ufWRhFsZgNPc6reJZVCayZnphpkJVoftneCGuF1Ym8mZ4w==\n", "/Ifj6yk56b0=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            this.f98.onPageFinished(webView, str);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("3VNJiBHUFkG4TG+FL50MW/1PXpVDmxF/+UZeoQqaFlzwRF8=\n", "mCE752P0fy8=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f98.onPageStarted(webView, str, bitmap);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("EnSAaCpZnB53a6ZlFBCGBDJol3V4FpsgNmGXVCwYhwQyYg==\n", "VwbyB1h59XA=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            this.f98.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("XmDtArep76c7f8sPieD1vX58+h/l5uibfnH6BLPs4op3e/oDscrju29A+hyw7PW9\n", "GxKfbcWJhsk=\n"), th, false);
        }
        try {
            WebViewClient webViewClient = this.f99;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Throwable th2) {
            AbstractC0480.m5464(f97, StringFog.decrypt("l1KOa9FOmabyQ51ozweer/JPjm3EB57ovU6uYcALmb63RL9oyguevJFFjnDxC4G9t1OI\n", "0iD8BKNu8Mg=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f98.onReceivedError(webView, i, str, str2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("Ysy/vxHM+j4H05myL4XgJELQqKJDg/0CQt2ouRWJ9xVVzKKi\n", "J77N0GPsk1A=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f98.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("xYbSkD1nf2KgmfSdAy5leOWaxY1vKHhe5ZfFljkickT0gNC+OjN+XuWF1Zo8Mw==\n", "gPSg/09HFgw=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f98.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("Qnbvgs+fzdMnacmP8dbXyWJq+J+d0MrvYmf4hMvawPVzcO2oz83Lzw==\n", "BwSd7b2/pL0=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        try {
            this.f98.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("ZKKUiHu2ulcBvbKFRf+gTUS+g5Up+b1rRLODjn/zt3VOt4+JW/OiTESjkg==\n", "IdDm5wmW0zk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            this.f98.onReceivedSslError(webView, sslErrorHandler, sslError);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("ZyuZ/LYAV6cCNL/xiElNvUc3juHkT1CbRzqO+rJFWppRNa7htk9M\n", "Ilnrk8QgPsk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            this.f98.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("BGSagKTbE39he7yNmpIJZSR4jZ32lBRDJHiMiqSrCH4ic5uckZQUdA==\n", "QRbo79b7ehE=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        try {
            this.f98.onScaleChanged(webView, f, f2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("RvslRnKXA3cj5ANLTN4ZbWbnMlsg2ARKYOg7TEPfC3dk7DM=\n", "A4lXKQC3ahk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        try {
            this.f98.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("/9LFuejqBKGazeO01qMeu9/O0qS6pQOb1c/6t/SzP6reycWz+b4e\n", "uqC31prKbc8=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f98.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("ilWEkZ550QvvSqKcoDDLEapJk4zMNtYwoU+XkIg13QGEQo+7mjzWEQ==\n", "zyf2/uxZuGU=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            this.f98.shouldInterceptRequest(webView, str);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("UqFp0jHRzBc3vk/fD5jWDXK9fs9jgs0WYr9/9C2FwAt0tmvJEZTUDHKgbw==\n", "F9MbvUPxpXk=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f98.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("hMJt2gKLMTXh3UvXPMIrL6TeesdQ2DA0tNx7+gbOKimo1Hr+FdIdLaTeaw==\n", "wbAftXCrWFs=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m5315(webView, str, false);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5315(WebView webView, String str, boolean z) {
        try {
            if (this.f98.shouldOverrideUrlLoading(webView, str) || z) {
                WebViewClient webViewClient = this.f99;
                if (webViewClient instanceof B) {
                    ((B) webViewClient).m5315(webView, str, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("yqrlFzqduIOvtcMaBNSimeq28gpozrmC+rTzNz7Yo5/mvPItOtGdgu68/hYvlaSf4/E=\n", "j9iXeEi90e0=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f99;
        if (webViewClient2 != null && !webViewClient2.getClass().equals(WebViewClient.class)) {
            try {
                return this.f99.shouldOverrideUrlLoading(webView, str);
            } catch (Throwable th2) {
                AbstractC0480.m5464(f97, StringFog.decrypt("YsKJhsYie/MH3bSb3WV782TckozadjLuT9+OhdBNZPhVwpKN0Vdg8Wvfmo3dbHW1UsKXwA==\n", "J7D76bQCEp0=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m5314(webView, webResourceRequest, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f98.onReceivedError(webView, webResourceRequest, webResourceError);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("B5/1txJYOMNigNO6LBEi2SeD4qpAFz//J47isRYdNegwn+iq\n", "Qu2H2GB4Ua0=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            this.f98.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("3BkpGGPWVuO5Bg8VXZ9M+fwFPgUxhVfi7Ac/Pn+CWv/6DisDQ5NO+PwYLw==\n", "mWtbdxH2P40=\n"), th, false);
        }
        WebViewClient webViewClient = this.f99;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5314(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        try {
            if (this.f98.shouldOverrideUrlLoading(webView, webResourceRequest) || z) {
                WebViewClient webViewClient = this.f99;
                if (webViewClient instanceof B) {
                    ((B) webViewClient).m5314(webView, webResourceRequest, true);
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC0480.m5464(f97, StringFog.decrypt("XjVQ1wp/rLA7KnbaNDa2qn4pR8pYLK2xbitG9w46t6xyI0ftCjOJsXojS9Yfd7e7ajJHywx2\n", "G0ciuHhfxd4=\n"), th, false);
        }
        WebViewClient webViewClient2 = this.f99;
        if (webViewClient2 != null) {
            try {
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th2) {
                AbstractC0480.m5464(f97, StringFog.decrypt("3u8KzyjFSSO78DfSM4JJI9jxEcU0kQA+8/INzD6qVijp7xHEP7BSIdfyGcQzi0dl6fgJ1T+WVGQ=\n", "m514oFrlIE0=\n"), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x0001, B:11:0x002a, B:14:0x0039, B:16:0x003c, B:18:0x0011, B:21:0x001b), top: B:2:0x0001 }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0947
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5313(C1226 c1226, String str, ArrayList arrayList, C0807 c0807, C1074 c1074) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.m5929(), AbstractC1257.m5940("/w==\n", "2J08EE7nzoU=\n", AbstractC1196.m5920("gQs2v3LkEY+tFSHwZbwDhLENLb5n5DGCpi8ttXeHCo6hFzCUZacJlaUNK6IgqgeTrQ8h8G2hEo+r\nHWT3\n", "xHlE0ADEZuc=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 368095040) {
            if (hashCode == 381550901 && str.equals(f96)) {
                c = 0;
                if (c != 0) {
                    return this.f99;
                }
                if (c != 1) {
                    new C0440(c1226, c1074, f97, str).m5536(c1226.m5929());
                    return null;
                }
                return this.f98;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f95)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }
}
