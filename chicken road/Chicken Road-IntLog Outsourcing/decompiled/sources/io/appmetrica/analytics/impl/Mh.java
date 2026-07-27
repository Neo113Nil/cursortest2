package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f7151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f7152c;

    public Mh(C0802li c0802li, String str, Throwable th) {
        this.f7152c = c0802li;
        this.f7150a = str;
        this.f7151b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7152c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportError(this.f7150a, this.f7151b);
    }
}
