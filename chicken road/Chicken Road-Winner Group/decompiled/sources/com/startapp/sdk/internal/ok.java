package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ok implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f4175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f4176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f4177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk f4178e;

    public ok(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong) {
        this.f4178e = pkVar;
        this.f4174a = atomicBoolean;
        this.f4175b = webView;
        this.f4176c = qiVar;
        this.f4177d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4174a.compareAndSet(false, true)) {
            this.f4178e.a(this.f4175b);
            qi qiVar = this.f4176c;
            this.f4177d.get();
            si.b();
            qiVar.a();
        }
    }
}
