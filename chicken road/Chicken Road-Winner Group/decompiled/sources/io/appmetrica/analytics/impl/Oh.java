package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6359b;

    public Oh(C0653li c0653li, Throwable th) {
        this.f6359b = c0653li;
        this.f6358a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6359b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportUnhandledException(this.f6358a);
    }
}
