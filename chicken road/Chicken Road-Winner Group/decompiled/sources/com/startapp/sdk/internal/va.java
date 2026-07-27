package com.startapp.sdk.internal;

import android.net.Uri;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class va extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f4515a;

    public va(wa waVar) {
        this.f4515a = waVar;
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean a(String str) {
        return !this.f4515a.f4586B && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b(WebView webView, String str) {
        wa waVar = this.f4515a;
        waVar.getClass();
        if (si.c(webView.getContext(), str)) {
            return true;
        }
        if (!waVar.y) {
            d9 d9Var = new d9(e9.f3618e);
            d9Var.f3574d = "fake_click";
            d9Var.f3576g = waVar.a();
            d9Var.f3575e = "jsTag=" + waVar.f4586B;
            d9Var.a();
        }
        if (waVar.f4586B && !waVar.y) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"startappad".equals(parse.getScheme())) {
            return waVar.a(str, false);
        }
        if (parse.getHost() != null) {
            waVar.a(parse.getHost());
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(WebView webView, String str) {
        wa waVar = this.f4515a;
        si.a(waVar.f4595t, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        si.a(waVar.f4595t, true, "gClientInterface.setMode", waVar.f4428g);
        si.a(waVar.f4595t, true, "enableScheme", "externalLinks");
        waVar.q();
    }
}
