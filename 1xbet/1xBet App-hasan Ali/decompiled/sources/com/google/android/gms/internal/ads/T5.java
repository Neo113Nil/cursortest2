package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class T5 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1362o f11624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q5 f11625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f11626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11627d;

    public /* synthetic */ T5(RunnableC1362o runnableC1362o, Q5 q5, WebView webView, boolean z3) {
        this.f11624a = runnableC1362o;
        this.f11625b = q5;
        this.f11626c = webView;
        this.f11627d = z3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        U5 u5 = (U5) this.f11624a.f14740n;
        Q5 q5 = this.f11625b;
        WebView webView = this.f11626c;
        String str = (String) obj;
        boolean z3 = this.f11627d;
        u5.getClass();
        synchronized (q5.f11173g) {
            q5.f11178m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (u5.f11736x || TextUtils.isEmpty(webView.getTitle())) {
                    q5.a(optString, z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    q5.a(webView.getTitle() + "\n" + optString, z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (q5.d()) {
                u5.f11726n.i(q5);
            }
        } catch (JSONException unused) {
            U2.j.d("Json string may be malformed.");
        } catch (Throwable th) {
            U2.j.e("Failed to get webview content.", th);
            P2.o.f4767B.f4774g.i("ContentFetchTask.processWebViewContent", th);
        }
    }
}
