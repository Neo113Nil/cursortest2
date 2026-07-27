package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0627ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f7714c;

    public RunnableC0627ki(C0653li c0653li, String str, String str2) {
        this.f7714c = c0653li;
        this.f7712a = str;
        this.f7713b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7714c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportEvent(this.f7712a, this.f7713b);
    }
}
