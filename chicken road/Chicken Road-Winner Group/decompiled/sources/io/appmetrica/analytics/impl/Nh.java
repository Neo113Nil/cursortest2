package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f6329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0653li f6330d;

    public Nh(C0653li c0653li, String str, String str2, Throwable th) {
        this.f6330d = c0653li;
        this.f6327a = str;
        this.f6328b = str2;
        this.f6329c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6330d;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportError(this.f6327a, this.f6328b, this.f6329c);
    }
}
