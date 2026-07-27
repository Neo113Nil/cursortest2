package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class nk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f4119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk f4120d;

    public nk(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar) {
        this.f4120d = pkVar;
        this.f4117a = atomicBoolean;
        this.f4118b = webView;
        this.f4119c = qiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4117a.compareAndSet(false, true)) {
            this.f4120d.a(this.f4118b);
            this.f4119c.a("Unknown error");
        }
    }
}
