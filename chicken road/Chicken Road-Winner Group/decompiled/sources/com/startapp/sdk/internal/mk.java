package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class mk extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f4069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f4071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi f4072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f4073e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk f4074g;

    public mk(pk pkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong, int i3) {
        this.f4074g = pkVar;
        this.f4069a = handler;
        this.f4070b = atomicBoolean;
        this.f4071c = webView;
        this.f4072d = qiVar;
        this.f4073e = atomicLong;
        this.f = i3;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long b3 = si.b();
        this.f4069a.removeCallbacksAndMessages(null);
        this.f4069a.postDelayed(new kk(this, b3), this.f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
        super.onReceivedError(webView, i3, str, str2);
        this.f4069a.removeCallbacksAndMessages(null);
        this.f4069a.post(new lk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
