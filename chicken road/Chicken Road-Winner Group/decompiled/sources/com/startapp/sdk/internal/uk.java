package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class uk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vk f4499c;

    public uk(vk vkVar, String str, WebView webView) {
        this.f4499c = vkVar;
        this.f4497a = str;
        this.f4498b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4499c.f4544g = this.f4497a;
        this.f4498b.setWebViewClient(new qk());
        vk vkVar = this.f4499c;
        WebView webView = this.f4498b;
        vkVar.getClass();
        try {
            vkVar.f.addLast(webView);
        } catch (Throwable th) {
            if (vkVar.a(4)) {
                d9.a(th);
            }
        }
    }
}
