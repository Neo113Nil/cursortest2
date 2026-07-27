package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f7186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0802li f7187d;

    public Nh(C0802li c0802li, String str, String str2, Throwable th) {
        this.f7187d = c0802li;
        this.f7184a = str;
        this.f7185b = str2;
        this.f7186c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7187d;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportError(this.f7184a, this.f7185b, this.f7186c);
    }
}
