package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f6294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f6295c;

    public Mh(C0653li c0653li, String str, Throwable th) {
        this.f6295c = c0653li;
        this.f6293a = str;
        this.f6294b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6295c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportError(this.f6293a, this.f6294b);
    }
}
