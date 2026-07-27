package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class oi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f4172a;

    public oi(WebView webView) {
        this.f4172a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4172a.destroy();
        } catch (Throwable unused) {
        }
    }
}
